/*******************************************************************************
 * Copyright (c) 2010 - 2010 EMF Builder Generator project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * EMF Builder Generator project committers - initial API and implementation
 * Contact : siamak AT haschemi.org
 *******************************************************************************/
package org.haschemi.utils.emfbuildergen;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.WorkflowComponentWithModelSlot;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Mapping;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent.GlobalVar;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent.GlobalVarDef;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import templates.JavaExtensions;

public class EMFBuilderGenerator extends WorkflowComponentWithModelSlot {
  private String m_ecoreURI = null;
  private final List<Mapping> m_uriMaps = new LinkedList<Mapping>();
  private final List<String> m_genModelUris = new LinkedList<String>();
  private final List<GenModel> m_genModels = new LinkedList<GenModel>();
  private String m_fileEncoding = "UTF-8";
  private String m_formatterConfigFile = "formatter.xml";
  private String m_platformUri = "..";
  private String m_featureModifierMethodPrefix = "with";

  private Reader reader;
  private Generator generator;

  @Override
  public void checkConfiguration(final Issues p_issues) {
    if (isEmpty(getModelSlot())) {
      setModelSlot("model");
    }

    super.checkConfiguration(p_issues);
    if (isEmpty(m_ecoreURI)) {
      p_issues.addError("Mandatory property 'ecoreURI' not set");
    }

    if (p_issues.getErrors().length > 0) {
      return;
    }
  }

  private boolean isEmpty(final String p_str) {
    return p_str == null || p_str.trim().length() == 0;
  }

  @Override
  protected void invokeInternal(final WorkflowContext p_ctx, final ProgressMonitor p_monitor, final Issues p_issues) {
    final StandaloneSetup standaloneSetup = new StandaloneSetup();
    standaloneSetup.setPlatformUri(m_platformUri);
    for (final Mapping uriMap : m_uriMaps) {
      standaloneSetup.addUriMap(uriMap);
    }
    standaloneSetup.addRegisterGeneratedEPackage(GenModelPackage.class.getName());
    standaloneSetup.addRegisterGeneratedEPackage(org.eclipse.uml2.codegen.ecore.genmodel.GenModelPackage.class.getName());

    reader = new Reader();
    reader.setUri(m_ecoreURI);
    reader.setModelSlot(getModelSlot());

    generator = new Generator();
    generator.addMetaModel(new EmfRegistryMetaModel());
    generator.setFileEncoding(m_fileEncoding);

    reader.checkConfiguration(p_issues);
    reader.invoke(p_ctx, p_monitor, p_issues);
    final EPackage ePackage = (EPackage) p_ctx.get(getModelSlot());

    final List<GenModel> genModels = new LinkedList<GenModel>();
    final Reader readerTest = new Reader();
    readerTest.setModelSlot("genmodel");
    for (final String genModelUri : m_genModelUris) {
      readerTest.setUri(genModelUri);
      readerTest.invoke(p_ctx, p_monitor, p_issues);
      final GenModel genModel = (GenModel) p_ctx.get("genmodel");
      genModels.add(genModel);
    }
    genModels.addAll(m_genModels);

    GenModel targetGenModel = null;
    for (final GenModel genModel : genModels) {
      for (final GenPackage genPackage : genModel.getGenPackages()) {
        final EPackage p = genPackage.getEcorePackage();
        generator.addMetaModel(new EmfMetaModel(p));
        if (p.getName().equals(ePackage.getName()) && p.getNsURI().equals(ePackage.getNsURI()) && p.getNsPrefix().equals(ePackage.getNsPrefix())) {
          targetGenModel = genModel;
        }
      }
    }

    generator.setExpand("templates::Main::main FOR " + getModelSlot());
    final Outlet outlet = new Outlet();
    final JavaBeautifier javaBeautifier = new JavaBeautifier();
    javaBeautifier.setConfigFile(m_formatterConfigFile);
    outlet.addPostprocessor(javaBeautifier);
    outlet.setPath(m_platformUri + targetGenModel.getModelDirectory());
    generator.addOutlet(outlet);

    GlobalVarDef optionFeatureAccesMethodPrefix = new GlobalVarDef();
    optionFeatureAccesMethodPrefix.setName("featureModifierMethodPrefix");
    optionFeatureAccesMethodPrefix.setValue("'" + m_featureModifierMethodPrefix + "'");
    generator.addGlobalVarDef(optionFeatureAccesMethodPrefix);
    
    JavaExtensions.setGenmodels(genModels);
    generator.checkConfiguration(p_issues);
    generator.invoke(p_ctx, p_monitor, p_issues);
  }

  public void setEcoreURI(final String p_ecoreURI) {
    m_ecoreURI = p_ecoreURI;
  }

  public void setFileEncoding(final String p_fileEncoding) {
    if (!isEmpty(p_fileEncoding)) {
      m_fileEncoding = p_fileEncoding;
    }
  }

  public void setFormatterConfigFile(final String p_formatterConfigFile) {
    if (!isEmpty(p_formatterConfigFile)) {
      m_formatterConfigFile = p_formatterConfigFile;
    }
  }

  public void setPlatformUri(final String p_platformUri) {
    if (!isEmpty(p_platformUri)) {
      m_platformUri = p_platformUri;
    }
  }

  public void addUriMap(final Mapping p_mapping) {
    m_uriMaps.add(p_mapping);
  }

  public void addGenModelUri(final String p_genModelUri) {
    m_genModelUris.add(p_genModelUri);
  }

  public void addGenModel(final GenModel p_genModel) {
    m_genModels.add(p_genModel);
  }

  public List<GenModel> getGenModels() {
    return m_genModels;
  }

  public void setFeatureModifierMethodPrefix(String p_featureModifierMethodPrefix) {
    m_featureModifierMethodPrefix = p_featureModifierMethodPrefix;
  }
}
