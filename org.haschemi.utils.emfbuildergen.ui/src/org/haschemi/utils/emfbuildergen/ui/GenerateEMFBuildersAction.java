/*******************************************************************************
 * Copyright (c) 2010 - 2010 Azmun project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Azmun project committers - initial API and implementation
 * Web: http://www.azmun.de
 * Contact : siamak AT haschemi.org
 *******************************************************************************/
package org.haschemi.utils.emfbuildergen.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitorAdapter;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.FileEditorInput;
import org.haschemi.utils.emfbuildergen.EMFBuilderGenerator;

public class GenerateEMFBuildersAction implements IObjectActionDelegate {
  private IWorkbenchPart m_activePart;
  private ISelection m_selection;

  @Override
  public void run(IAction p_action) {
    if (!(m_selection instanceof IStructuredSelection)) {
      return;
    }
    IStructuredSelection selection = (IStructuredSelection) m_selection;
    if (selection.getFirstElement() == null) {
      return;
    }
    Object firstElement = selection.getFirstElement();
    if (!(firstElement instanceof GenModel)) {
      return;
    }
    final GenModel genModel = (GenModel) firstElement;

    if (!(m_activePart instanceof IEditorPart)) {
      return;
    }
    IEditorPart editorPart = (IEditorPart) m_activePart;

    IEditorInput editorInput = editorPart.getEditorInput();
    if (!(editorInput instanceof FileEditorInput)) {
      return;
    }
    final FileEditorInput fileEditorInput = (FileEditorInput) editorInput;
    final String ecoreFile = genModel.getForeignModel().get(0);
    final IFile file = fileEditorInput.getFile();
    final IResource ecoreFileResource = file.getParent().findMember(ecoreFile);
    final String platformRoot = file.getProject().getLocation().toString() + "/..";

    Job job = new Job("Generate Builder Code") {

      @Override
      protected IStatus run(IProgressMonitor p_monitor) {
        WorkflowRunner runner = new WorkflowRunner();
        WorkflowContext context = runner.getContext();
        Issues issues = new IssuesImpl();
        ProgressMonitor progressMonitor = new ProgressMonitorAdapter(p_monitor);

        EMFBuilderGenerator emfBuilderGenerator = new EMFBuilderGenerator();
        emfBuilderGenerator.setEcoreURI(URI.createPlatformResourceURI(ecoreFileResource.getFullPath().toString(), true).toString());
        emfBuilderGenerator.addGenModel(genModel);
        for (GenPackage genPackage : genModel.getUsedGenPackages()) {
          final GenModel usedGenModel = genPackage.getGenModel();
          if (!emfBuilderGenerator.getGenModels().contains(usedGenModel)) {
            emfBuilderGenerator.addGenModel(usedGenModel);
          }
        }

        emfBuilderGenerator.setPlatformUri(platformRoot);
        emfBuilderGenerator.checkConfiguration(issues);
        emfBuilderGenerator.invoke(context, progressMonitor, issues);
        if (issues.getErrors().length > 0) {
          StringBuilder sb = new StringBuilder();
          for (Diagnostic diagnostic : issues.getErrors()) {
            sb.append(diagnostic.getMessage()).append("\n");
          }
          return new Status(IStatus.ERROR, null, sb.toString());
        }
        return Status.OK_STATUS;
      }
    };
    job.setUser(true);
    job.schedule();
    job.addJobChangeListener(new JobChangeAdapter() {
      @Override
      public void done(IJobChangeEvent p_event) {
        if (p_event.getResult().getSeverity() == IStatus.OK) {
          try {
            file.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
          } catch (CoreException e) {
            throw new RuntimeException(e);
          }
        }
      }
    });
  }

  @Override
  public void selectionChanged(IAction p_action, ISelection p_selection) {
    m_selection = p_selection;
  }

  @Override
  public void setActivePart(IAction p_action, IWorkbenchPart p_targetPart) {
    m_activePart = p_targetPart;
  }
}
