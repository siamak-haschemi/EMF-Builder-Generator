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
package org.haschemi.utils.emfbuildergen;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

public class EMFBuilderGenerator extends WorkflowComponentWithModelSlot {
  private String ecoreURI = null;
  private String metaModelPackage = null;
  private String metaModelFactory = null;
  private EPackage metaModelPackageInstance = null;
  private String targetPackage = null;

  private String projectPath = ".";
  private String targetDir = "src-gen";
  private String fileEncoding = "UTF-8";
  private boolean pluralizedGetters = false;
  private String formatterConfigFile = "formatter.xml";
  private String platformUri = "..";

  private Reader reader;
  private Generator generator;

  @Override
  public void checkConfiguration(Issues p_issues) {
    if (isEmpty(getModelSlot())) {
      setModelSlot("model");
    }

    super.checkConfiguration(p_issues);
    if (isEmpty(ecoreURI)) {
      p_issues.addError("Mandatory property 'ecoreURI' not set");
    }
    if (isEmpty(metaModelPackage) && metaModelPackageInstance == null) {
      p_issues.addError("Mandatory property 'metaModelPackage' not set");
    }
    if (isEmpty(metaModelFactory)) {
      p_issues.addError("Mandatory property 'metaModelFactory' not set");
    }
    if (isEmpty(targetPackage)) {
      p_issues.addError("Mandatory property 'targetPackage' not set");
    }

    if (p_issues.getErrors().length > 0) {
      return;
    }

    reader = new Reader();
    reader.setUri(ecoreURI);
    reader.setModelSlot(getModelSlot());

    generator = new Generator();
    generator.addMetaModel(new EmfRegistryMetaModel());

    if (metaModelPackageInstance != null) {
      generator.addMetaModel(new EmfMetaModel(metaModelPackageInstance));
    } else {
      EmfMetaModel emfMetaModel = new EmfMetaModel();
      emfMetaModel.setMetaModelPackage(metaModelPackage);
      generator.addMetaModel(emfMetaModel);
    }

    generator.setExpand("templates::Main::main(\"" + metaModelFactory + "\", \"" + targetPackage + "\", " + pluralizedGetters + ") FOR " + getModelSlot());
    Outlet outlet = new Outlet();
    JavaBeautifier javaBeautifier = new JavaBeautifier();
    javaBeautifier.setConfigFile(formatterConfigFile);
    outlet.addPostprocessor(javaBeautifier);
    outlet.setPath(projectPath + "/" + targetDir);
    generator.addOutlet(outlet);
    generator.setFileEncoding(fileEncoding);

    reader.checkConfiguration(p_issues);
    generator.checkConfiguration(p_issues);
  }

  private boolean isEmpty(String p_str) {
    return p_str == null || p_str.trim().length() == 0;
  }

  @Override
  protected void invokeInternal(WorkflowContext p_ctx, ProgressMonitor p_monitor, Issues p_issues) {
    StandaloneSetup standaloneSetup = new StandaloneSetup();
    standaloneSetup.setPlatformUri(platformUri);

    reader.invoke(p_ctx, p_monitor, p_issues);
    generator.invoke(p_ctx, p_monitor, p_issues);
  }

  public void setEcoreURI(String p_ecoreURI) {
    ecoreURI = p_ecoreURI;
  }

  public void setMetaModelPackage(String p_metaModelPackage) {
    metaModelPackage = p_metaModelPackage;
  }

  public void setMetaModelFactory(String p_metaModelFactory) {
    metaModelFactory = p_metaModelFactory;
  }

  public void setTargetPackage(String p_targetPackage) {
    targetPackage = p_targetPackage;
  }

  public void setProjectPath(String p_projectPath) {
    if (!isEmpty(p_projectPath)) {
      projectPath = p_projectPath;
    }
  }

  public void setTargetDir(String p_targetDir) {
    if (!isEmpty(p_targetDir)) {
      targetDir = p_targetDir;
    }
  }

  public void setFileEncoding(String p_fileEncoding) {
    if (!isEmpty(p_fileEncoding)) {
      fileEncoding = p_fileEncoding;
    }
  }

  public void setPluralizedGetters(boolean p_pluralizedGetters) {
    pluralizedGetters = p_pluralizedGetters;
  }

  public void setFormatterConfigFile(String p_formatterConfigFile) {
    if (!isEmpty(p_formatterConfigFile)) {
      formatterConfigFile = p_formatterConfigFile;
    }
  }

  public void setPlatformUri(String p_platformUri) {
    if (!isEmpty(p_platformUri)) {
      platformUri = p_platformUri;
    }
  }

  public void setMetaModelPackageInstance(EPackage p_package) {
    metaModelPackageInstance = p_package;
  }
}
