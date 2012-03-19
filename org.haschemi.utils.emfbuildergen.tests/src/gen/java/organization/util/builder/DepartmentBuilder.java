package organization.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>organization.Department</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DepartmentBuilder implements organization.util.builder.IOrganizationBuilder<organization.Department> {
  // features and builders
  private java.lang.String m_id;
  private Integer m_number;
  private java.util.Collection<organization.Employee> m_employees = new java.util.LinkedList<organization.Employee>();
  private java.util.Collection<organization.util.builder.IOrganizationBuilder<? extends organization.Employee>> m_featureEmployeesBuilder = new java.util.LinkedList<organization.util.builder.IOrganizationBuilder<? extends organization.Employee>>();
  // helper attributes
  private boolean m_featureEmployeesSet = false;
  private boolean m_featureIdSet = false;
  private boolean m_featureNumberSet = false;

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
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public DepartmentBuilder but() {
    DepartmentBuilder _builder = newDepartmentBuilder();
    _builder.m_featureEmployeesSet = m_featureEmployeesSet;
    _builder.m_employees = m_employees;
    _builder.m_featureEmployeesBuilder = m_featureEmployeesBuilder;
    _builder.m_featureIdSet = m_featureIdSet;
    _builder.m_id = m_id;
    _builder.m_featureNumberSet = m_featureNumberSet;
    _builder.m_number = m_number;
    return _builder;
  }

  /**
   * This method constructs the final organization.Department type.
   * @return new instance of the organization.Department type
   */
  public organization.Department build() {
    final organization.Department _newInstance = organization.OrganizationFactory.eINSTANCE.createDepartment();
    if (m_featureIdSet) {
      _newInstance.setId(m_id);
    }
    if (m_featureNumberSet) {
      _newInstance.setNumber(m_number);
    }
    if (m_featureEmployeesSet) {
      _newInstance.getEmployees().addAll(m_employees);
    } else {
      if (!m_featureEmployeesBuilder.isEmpty()) {
        for (organization.util.builder.IOrganizationBuilder<? extends organization.Employee> builder : m_featureEmployeesBuilder) {
          _newInstance.getEmployees().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public DepartmentBuilder withId(java.lang.String p_id) {
    m_id = p_id;
    m_featureIdSet = true;
    return this;
  }

  public DepartmentBuilder withNumber(Integer p_number) {
    m_number = p_number;
    m_featureNumberSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(organization.Employee p_employees) {
    m_employees.add(p_employees);
    m_featureEmployeesSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(java.util.Collection<? extends organization.Employee> p_employees) {
    m_employees.addAll(p_employees);
    m_featureEmployeesSet = true;
    return this;
  }

  public DepartmentBuilder withEmployees(organization.util.builder.IOrganizationBuilder<? extends organization.Employee> p_employeeBuilder) {
    m_featureEmployeesBuilder.add(p_employeeBuilder);
    return this;
  }
}
