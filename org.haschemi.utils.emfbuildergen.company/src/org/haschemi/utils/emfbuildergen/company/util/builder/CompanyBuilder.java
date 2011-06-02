package org.haschemi.utils.emfbuildergen.company.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.haschemi.utils.emfbuildergen.company.Company</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CompanyBuilder {
  private java.lang.String m_name;
  private java.util.Collection<org.haschemi.utils.emfbuildergen.company.Department> m_department = new java.util.LinkedList<org.haschemi.utils.emfbuildergen.company.Department>();
  private boolean m_featureNameSet = false;
  private boolean m_featureDepartmentSet = false;

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
   * This method can be used to override attributes of the builder.
   */
  public CompanyBuilder but() {
    CompanyBuilder _builder = newCompanyBuilder();
    if (m_featureNameSet) {
      _builder.withName(m_name);
    }
    if (m_featureDepartmentSet) {
      _builder.withDepartment(m_department);
    }
    return _builder;
  }

  /**
   * This method constructs the final org.haschemi.utils.emfbuildergen.company.Company type.
   * @return new instance of the org.haschemi.utils.emfbuildergen.company.Company type
   */
  public org.haschemi.utils.emfbuildergen.company.Company build() {
    final org.haschemi.utils.emfbuildergen.company.Company _newInstance = org.haschemi.utils.emfbuildergen.company.CompanyFactory.eINSTANCE.createCompany();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureDepartmentSet) {
      _newInstance.getDepartment().addAll(m_department);
    }
    return _newInstance;
  }

  public CompanyBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(org.haschemi.utils.emfbuildergen.company.Department p_department) {
    m_department.add(p_department);
    m_featureDepartmentSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(java.util.Collection<? extends org.haschemi.utils.emfbuildergen.company.Department> p_department) {
    m_department.addAll(p_department);
    m_featureDepartmentSet = true;
    return this;
  }

  public CompanyBuilder withDepartment(DepartmentBuilder p_departmentBuilder) {
    m_department.add(p_departmentBuilder.build());
    m_featureDepartmentSet = true;
    return this;
  }
}
