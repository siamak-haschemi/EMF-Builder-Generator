package org.haschemi.utils.emfbuildergen.tests.lazyBuilder.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ABuilder {
  private org.haschemi.utils.emfbuildergen.tests.lazyBuilder.B m_b;
  private BBuilder m_featureBBuilder;
  private boolean m_featureBSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newABuilder()
   */
  private ABuilder() {
  }

  /**
   * This method creates a new instance of the ABuilder.
   * @return new instance of the ABuilder
   */
  public static ABuilder newABuilder() {
    return new ABuilder();
  }

  /**
   * This method can be used to override attributes of the builder.
   */
  public ABuilder but() {
    ABuilder _builder = newABuilder();
    _builder.m_featureBSet = m_featureBSet;
    _builder.m_b = m_b;
    _builder.m_featureBBuilder = m_featureBBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A type.
   * @return new instance of the org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A type
   */
  public org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A build() {
    final org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A _newInstance = org.haschemi.utils.emfbuildergen.tests.lazyBuilder.LazyBuilderFactory.eINSTANCE.createA();
    if (m_featureBSet) {
      _newInstance.setB(m_b);
    } else {
      if (m_featureBBuilder != null) {
        _newInstance.setB(m_featureBBuilder.build());
      }
    }
    return _newInstance;
  }

  public ABuilder withB(org.haschemi.utils.emfbuildergen.tests.lazyBuilder.B p_b) {
    m_b = p_b;
    m_featureBSet = true;
    return this;
  }

  public ABuilder withB(BBuilder p_bBuilder) {
    m_featureBBuilder = p_bBuilder;
    return this;
  }
}
