package org.haschemi.utils.emfbuildergen.company.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.haschemi.utils.emfbuildergen.company.Employee</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EmployeeBuilder {
  private java.lang.String m_name;
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
   * This method can be used to override attributes of the builder.
   */
  public EmployeeBuilder but() {
    EmployeeBuilder _builder = newEmployeeBuilder();
    if (m_featureNameSet) {
      _builder.withName(m_name);
    }
    return _builder;
  }

  /**
   * This method constructs the final org.haschemi.utils.emfbuildergen.company.Employee type.
   * @return new instance of the org.haschemi.utils.emfbuildergen.company.Employee type
   */
  public org.haschemi.utils.emfbuildergen.company.Employee build() {
    final org.haschemi.utils.emfbuildergen.company.Employee _newInstance = org.haschemi.utils.emfbuildergen.company.CompanyFactory.eINSTANCE.createEmployee();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    return _newInstance;
  }

  public EmployeeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }
}
