package org.haschemi.utils.emfbuildergen.company.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.haschemi.utils.emfbuildergen.company.Department</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DepartmentBuilder {
  private Integer m_number;
  private java.util.Collection<org.haschemi.utils.emfbuildergen.company.Employee> m_employees = new java.util.LinkedList<org.haschemi.utils.emfbuildergen.company.Employee>();
  private boolean m_featureNumberSet = false;
  private boolean m_featureEmployeesSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newDepartmentBuilder()
   */
  private DepartmentBuilder() {
  }

  /**
   * This method creates a new instance of the DepartmentBuilder.
   * @return new instance of the DepartmentBuilder
   */
  public static DepartmentBuilder newDepartmentBuilder() {
    return new DepartmentBuilder();
  }

  /**
   * This method can be used to override attributes of the builder.
   */
  public DepartmentBuilder but() {
    DepartmentBuilder _builder = newDepartmentBuilder();
    if (m_featureNumberSet) {
      _builder.withNumber(m_number);
    }
    if (m_featureEmployeesSet) {
      _builder.withEmployees(m_employees);
    }
    return _builder;
  }

  /**
   * This method constructs the final org.haschemi.utils.emfbuildergen.company.Department type.
   * @return new instance of the org.haschemi.utils.emfbuildergen.company.Department type
   */
  public org.haschemi.utils.emfbuildergen.company.Department build() {
    final org.haschemi.utils.emfbuildergen.company.Department _newInstance = org.haschemi.utils.emfbuildergen.company.CompanyFactory.eINSTANCE.createDepartment();
    if (m_featureNumberSet) {
      _newInstance.setNumber(m_number);
    }
    if (m_featureEmployeesSet) {
      _newInstance.getEmployees().addAll(m_employees);
    }
    return _newInstance;
  }

  public DepartmentBuilder withNumber(Integer p_number) {
    m_number = p_number;
    m_featureNumberSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(org.haschemi.utils.emfbuildergen.company.Employee p_employees) {
    m_employees.add(p_employees);
    m_featureEmployeesSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(java.util.Collection<? extends org.haschemi.utils.emfbuildergen.company.Employee> p_employees) {
    m_employees.addAll(p_employees);
    m_featureEmployeesSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(EmployeeBuilder p_employeeBuilder) {
    m_employees.add(p_employeeBuilder.build());
    m_featureEmployeesSet = true;
    return this;
  }
}
