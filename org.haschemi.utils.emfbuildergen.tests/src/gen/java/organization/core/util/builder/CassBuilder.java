package organization.core.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>organization.core.Cass</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CassBuilder implements organization.core.util.builder.ICoreBuilder<organization.core.Cass> {
  // features and builders
  // helper attributes
  /**
   * Builder is not instantiated with a constructor.
   * @see #newCassBuilder()
   */
  private CassBuilder() {
  }

  /**
   * This method creates a new instance of the CassBuilder.
   * @return new instance of the CassBuilder
   */
  public static CassBuilder newCassBuilder() {
    return new CassBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public CassBuilder but() {
    CassBuilder _builder = newCassBuilder();
    return _builder;
  }

  /**
   * This method constructs the final organization.core.Cass type.
   * @return new instance of the organization.core.Cass type
   */
  public organization.core.Cass build() {
    final organization.core.Cass _newInstance = organization.core.CoreFactory.eINSTANCE.createCass();
    return _newInstance;
  }
}
