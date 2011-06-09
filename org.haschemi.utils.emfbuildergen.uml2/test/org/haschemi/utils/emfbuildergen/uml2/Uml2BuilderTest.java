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
package org.haschemi.utils.emfbuildergen.uml2;

import static junit.framework.Assert.fail;
import static org.eclipse.uml2.uml.util.builder.UmlBuilders.*;

import java.io.File;
import java.net.URL;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.junit.Test;

public class Uml2BuilderTest {

  @Test
  public void buildsCompanyMetamodelAsUML2Model() throws Exception {
    ResourceSet resourceSet = new ResourceSetImpl();
    Model umlLibrary = getUMLLibrary(resourceSet);

    // @formatter:off
    Class employeeClass = newClassBuilder()
      .withName("Employee")             
      .withOwnedAttribute(
        newPropertyBuilder()
          .withName("name")                                 
          .withType(umlLibrary.getOwnedType("String"))                  
        )       
    .build();
    
		Class departmentClass = newClassBuilder()
      .withName("Department")             
      .withOwnedAttribute(
        newPropertyBuilder()
          .withName("number")                                 
          .withType(umlLibrary.getOwnedType("Integer"))                  
      )
      .withOwnedAttribute(
        newPropertyBuilder()
          .withName("employees")
          .withType(employeeClass)
          .withUpperValue(
            newLiteralUnlimitedNaturalBuilder()
              .withValue(LiteralUnlimitedNatural.UNLIMITED)
            .build()
          )
          .withLowerValue(
              newLiteralUnlimitedNaturalBuilder()
              .withValue(0)
            .build()
          )
          .withAggregation(AggregationKind.COMPOSITE_LITERAL)
      )              
    .build(); 
		
		Class companyClass = newClassBuilder()
      .withName("Company")             
      .withOwnedAttribute(
        newPropertyBuilder()
          .withName("name")                                 
          .withType(umlLibrary.getOwnedType("Strimg"))                  
      )
      .withOwnedAttribute(
        newPropertyBuilder()
          .withName("department")
          .withType(departmentClass)
          .withUpperValue(
            newLiteralUnlimitedNaturalBuilder()
              .withValue(LiteralUnlimitedNatural.UNLIMITED)
            .build()
          )
          .withLowerValue(
              newLiteralUnlimitedNaturalBuilder()
              .withValue(0)
            .build()
          )
          .withAggregation(AggregationKind.COMPOSITE_LITERAL)
      )              
    .build(); 
		
    Model model = newModelBuilder()
	  	.withPackagedElement(
        newPackageBuilder()
				  .withName("company")
					.withPackagedElement(employeeClass)
					.withPackagedElement(companyClass)
          .withPackagedElement(departmentClass)
				.build()
			  )
		.build();
		// @formatter:on

    File companyFile = new File("company.uml");
    try {
      Resource umlRes = resourceSet.createResource(URI.createURI(companyFile.getAbsolutePath()));
      umlRes.getContents().add(model);
      umlRes.save(null);
      
      if (!umlRes.getErrors().isEmpty()) {
        final StringBuilder sb = new StringBuilder();
        for (final Diagnostic diagnostic : umlRes.getErrors()) {
          sb.append(diagnostic.getMessage()).append("\n");
        }
        fail(sb.toString());
      }
    } finally {
      companyFile.delete();
    }
  }

  private Model getUMLLibrary(ResourceSet resourceSet) {
    resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

    final String profile = "profiles/UML2.profile.uml";
    URL url = getClass().getClassLoader().getResource(profile);
    if (url == null) {
      throw new RuntimeException("Error getting UML2.profile.uml");
    }
    String urlString = url.toString();
    if (!urlString.endsWith(profile)) {
      throw new RuntimeException("Error getting UML2.profile.uml. Got: " + urlString);
    }
    urlString = urlString.substring(0, urlString.length() - profile.length());
    URI uri = URI.createURI(urlString);
    Map uriMap = resourceSet.getURIConverter().getURIMap();
    uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
    uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
    uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));

    Model umlLibrary = (Model) resourceSet.getResource(URI.createURI(UMLResource.UML_PRIMITIVE_TYPES_LIBRARY_URI), true).getContents().get(0);
    return umlLibrary;
  }
}
