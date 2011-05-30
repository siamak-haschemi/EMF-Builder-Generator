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
package org.haschemi.utils.emfbuildergen.ecore;

import static junit.framework.Assert.fail;
import static org.haschemi.utils.emfbuildergen.ecore.EAttributeBuilder.newEAttributeBuilder;
import static org.haschemi.utils.emfbuildergen.ecore.EClassBuilder.newEClassBuilder;
import static org.haschemi.utils.emfbuildergen.ecore.EPackageBuilder.newEPackageBuilder;
import static org.haschemi.utils.emfbuildergen.ecore.EReferenceBuilder.newEReferenceBuilder;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.junit.Test;

public class EcoreBuilderTest {
  @Test
  public void buildsCompanyMetamodel() throws IOException {
    final EcorePackage ecore = EcorePackage.eINSTANCE;
    // @formatter:off        
    final EClass employeeClass = newEClassBuilder()
      .withName("Employee")
      .withEStructuralFeatures(
        newEAttributeBuilder()
          .withName("name")
          .withEType(ecore.getEString())
        .build()
      )
    .build();    
        
    final EClass departmentClass = newEClassBuilder()
      .withName("Department")
      .withEStructuralFeatures(
        newEAttributeBuilder()
          .withName("number")
          .withEType(ecore.getEInt())
        .build()
      )
      .withEStructuralFeatures(
        newEReferenceBuilder()
          .withName("employees")
          .withEType(employeeClass)
          .withUpperBound(ETypedElement.UNBOUNDED_MULTIPLICITY)
          .withContainment(true)
        .build()
      )
    .build();
    
    final EClass companyClass = newEClassBuilder()
      .withName("Company")
      .withEStructuralFeatures(
        newEAttributeBuilder()
          .withName("name")
          .withEType(ecore.getEString())
        .build()
      )
      .withEStructuralFeatures(
        newEReferenceBuilder()
          .withName("department")
          .withEType(departmentClass)
          .withUpperBound(ETypedElement.UNBOUNDED_MULTIPLICITY)
          .withContainment(true)
        .build()
      )
    .build();
    
    final EPackage ePackage = newEPackageBuilder()
      .withName("company")
      .withNsPrefix("company")
      .withNsURI("http:///com.example.company.ecore")
      .withEClassifiers(employeeClass)
      .withEClassifiers(companyClass)
      .withEClassifiers(departmentClass)
    .build();
    // @formatter:on

    final ResourceSet resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());
    final File companyEcoreFile = new File("Company.ecore");
    try {
      final Resource resource = resourceSet.createResource(URI.createURI(companyEcoreFile.getAbsolutePath()));
      resource.getContents().add(ePackage);
      resource.save(null);

      if (!resource.getErrors().isEmpty()) {
        final StringBuilder sb = new StringBuilder();
        for (final Diagnostic diagnostic : resource.getErrors()) {
          sb.append(diagnostic.getMessage()).append("\n");
        }
        fail(sb.toString());
      }
    } finally {
      companyEcoreFile.delete();
    }
  }
}
