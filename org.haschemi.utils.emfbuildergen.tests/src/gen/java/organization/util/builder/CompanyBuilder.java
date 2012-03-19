package organization.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>organization.Company</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CompanyBuilder implements organization.util.builder.IOrganizationBuilder<organization.Company> {
  // features and builders
  private java.lang.String m_id;
  private java.lang.String m_name;
  private java.util.Collection<organization.Department> m_department = new java.util.LinkedList<organization.Department>();
  private java.util.Collection<organization.util.builder.IOrganizationBuilder<? extends organization.Department>> m_featureDepartmentBuilder = new java.util.LinkedList<organization.util.builder.IOrganizationBuilder<? extends organization.Department>>();
  // helper attributes
  private boolean m_featureDepartmentSet = false;
  private boolean m_featureIdSet = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newCompanyBuilder()
   */
  private CompanyBuilder() {
  }

  /**
   * This method creates a new instance of the CompanyBuilder.
   * @return new instance of the CompanyBuilder
   */
  public static CompanyBuilder newCompanyBuilder() {
    return new CompanyBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public CompanyBuilder but() {
    CompanyBuilder _builder = newCompanyBuilder();
    _builder.m_featureDepartmentSet = m_featureDepartmentSet;
    _builder.m_department = m_department;
    _builder.m_featureDepartmentBuilder = m_featureDepartmentBuilder;
    _builder.m_featureIdSet = m_featureIdSet;
    _builder.m_id = m_id;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final organization.Company type.
   * @return new instance of the organization.Company type
   */
  public organization.Company build() {
    final organization.Company _newInstance = organization.OrganizationFactory.eINSTANCE.createCompany();
    if (m_featureIdSet) {
      _newInstance.setId(m_id);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureDepartmentSet) {
      _newInstance.getDepartment().addAll(m_department);
    } else {
      if (!m_featureDepartmentBuilder.isEmpty()) {
        for (organization.util.builder.IOrganizationBuilder<? extends organization.Department> builder : m_featureDepartmentBuilder) {
          _newInstance.getDepartment().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public CompanyBuilder withId(java.lang.String p_id) {
    m_id = p_id;
    m_featureIdSet = true;
    return this;
  }

  public CompanyBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(organization.Department p_department) {
    m_department.add(p_department);
    m_featureDepartmentSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(java.util.Collection<? extends organization.Department> p_department) {
    m_department.addAll(p_department);
    m_featureDepartmentSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(organization.util.builder.IOrganizationBuilder<? extends organization.Department> p_departmentBuilder) {
    m_featureDepartmentBuilder.add(p_departmentBuilder);
    return this;
  }
}
