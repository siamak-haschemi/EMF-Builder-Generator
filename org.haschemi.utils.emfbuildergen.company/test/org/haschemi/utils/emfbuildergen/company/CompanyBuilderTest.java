package org.haschemi.utils.emfbuildergen.company;

import static junit.framework.Assert.fail;
import static org.haschemi.utils.emfbuildergen.company.util.builder.CompanyBuilder.newCompanyBuilder;
import static org.haschemi.utils.emfbuildergen.company.util.builder.DepartmentBuilder.newDepartmentBuilder;
import static org.haschemi.utils.emfbuildergen.company.util.builder.EmployeeBuilder.newEmployeeBuilder;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.haschemi.utils.emfbuildergen.company.util.CompanyResourceFactoryImpl;
import org.junit.Test;

public class CompanyBuilderTest {
  @Test
  public void buildsCompanyModel() throws IOException {
    // @formatter:off
    final Company apple = newCompanyBuilder()
      .withName("Apple")
      .withDepartment(
        newDepartmentBuilder()
          .withNumber(1)
          .withEmployees(
            newEmployeeBuilder().withName("Alice")
          )
          .withEmployees(
            newEmployeeBuilder().withName("Bob"))
          )
      .build();
    // @formatter:on
    
    {
      Company company = CompanyFactory.eINSTANCE.createCompany();
      company.setName("MyCoorp");
      Department department = CompanyFactory.eINSTANCE.createDepartment();
      department.setNumber(1);
      Employee alice = CompanyFactory.eINSTANCE.createEmployee();
      alice.setName("Alice");
      Employee bob = CompanyFactory.eINSTANCE.createEmployee();
      bob.setName("Bob");
      department.getEmployees().add(alice);
      department.getEmployees().add(bob);
      company.getDepartment().add(department);      
    }

    final ResourceSet resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
        .put("*", new CompanyResourceFactoryImpl());
    File companyModel = new File("Company.xml");

    try {
      final Resource resource = resourceSet.createResource(URI
          .createURI(companyModel.getAbsolutePath()));
      resource.getContents().add(apple);
      resource.save(null);

      if (!resource.getErrors().isEmpty()) {
        final StringBuilder sb = new StringBuilder();
        for (final Diagnostic diagnostic : resource.getErrors()) {
          sb.append(diagnostic.getMessage()).append("\n");
        }
        fail(sb.toString());
      }
    } finally {
      companyModel.delete();
    }
  }
}
