package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EEnumLiteral</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EEnumLiteralBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EEnumLiteral> {
  // features and builders
  private org.eclipse.emf.common.util.Enumerator m_instance;
  private java.lang.String m_literal;
  private java.lang.String m_name;
  private Integer m_value;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureInstanceSet = false;
  private boolean m_featureLiteralSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureValueSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEEnumLiteralBuilder()
   */
  private EEnumLiteralBuilder() {
  }

  /**
   * This method creates a new instance of the EEnumLiteralBuilder.
   * @return new instance of the EEnumLiteralBuilder
   */
  public static EEnumLiteralBuilder newEEnumLiteralBuilder() {
    return new EEnumLiteralBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EEnumLiteralBuilder but() {
    EEnumLiteralBuilder _builder = newEEnumLiteralBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureInstanceSet = m_featureInstanceSet;
    _builder.m_instance = m_instance;
    _builder.m_featureLiteralSet = m_featureLiteralSet;
    _builder.m_literal = m_literal;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureValueSet = m_featureValueSet;
    _builder.m_value = m_value;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EEnumLiteral type.
   * @return new instance of the org.eclipse.emf.ecore.EEnumLiteral type
   */
  public org.eclipse.emf.ecore.EEnumLiteral build() {
    final org.eclipse.emf.ecore.EEnumLiteral _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEEnumLiteral();
    if (m_featureInstanceSet) {
      _newInstance.setInstance(m_instance);
    }
    if (m_featureLiteralSet) {
      _newInstance.setLiteral(m_literal);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureValueSet) {
      _newInstance.setValue(m_value);
    }
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public EEnumLiteralBuilder withInstance(org.eclipse.emf.common.util.Enumerator p_instance) {
    m_instance = p_instance;
    m_featureInstanceSet = true;
    return this;
  }

  public EEnumLiteralBuilder withLiteral(java.lang.String p_literal) {
    m_literal = p_literal;
    m_featureLiteralSet = true;
    return this;
  }

  public EEnumLiteralBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EEnumLiteralBuilder withValue(Integer p_value) {
    m_value = p_value;
    m_featureValueSet = true;
    return this;
  }

  public EEnumLiteralBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EEnumLiteralBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EEnumLiteralBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }
}
