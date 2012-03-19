package organization.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>organization.Employee</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmployeeBuilder implements organization.util.builder.IOrganizationBuilder<organization.Employee> {
  // features and builders
  private java.lang.String m_id;
  private java.lang.String m_name;
  // helper attributes
  private boolean m_featureIdSet = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEmployeeBuilder()
   */
  private EmployeeBuilder() {
  }

  /**
   * This method creates a new instance of the EmployeeBuilder.
   * @return new instance of the EmployeeBuilder
   */
  public static EmployeeBuilder newEmployeeBuilder() {
    return new EmployeeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EmployeeBuilder but() {
    EmployeeBuilder _builder = newEmployeeBuilder();
    _builder.m_featureIdSet = m_featureIdSet;
    _builder.m_id = m_id;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final organization.Employee type.
   * @return new instance of the organization.Employee type
   */
  public organization.Employee build() {
    final organization.Employee _newInstance = organization.OrganizationFactory.eINSTANCE.createEmployee();
    if (m_featureIdSet) {
      _newInstance.setId(m_id);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public EmployeeBuilder withId(java.lang.String p_id) {
    m_id = p_id;
    m_featureIdSet = true;
    return this;
  }

  public EmployeeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
