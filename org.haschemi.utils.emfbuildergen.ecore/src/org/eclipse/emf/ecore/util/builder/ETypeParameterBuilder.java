package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.ETypeParameter</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ETypeParameterBuilder {
  // features and builders
  private java.lang.String m_name;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.EAnnotationBuilder> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.EAnnotationBuilder>();
  private java.util.Collection<org.eclipse.emf.ecore.EGenericType> m_eBounds = new java.util.LinkedList<org.eclipse.emf.ecore.EGenericType>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.EGenericTypeBuilder> m_featureEBoundsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.EGenericTypeBuilder>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEBoundsSet = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newETypeParameterBuilder()
   */
  private ETypeParameterBuilder() {
  }

  /**
   * This method creates a new instance of the ETypeParameterBuilder.
   * @return new instance of the ETypeParameterBuilder
   */
  public static ETypeParameterBuilder newETypeParameterBuilder() {
    return new ETypeParameterBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ETypeParameterBuilder but() {
    ETypeParameterBuilder _builder = newETypeParameterBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEBoundsSet = m_featureEBoundsSet;
    _builder.m_eBounds = m_eBounds;
    _builder.m_featureEBoundsBuilder = m_featureEBoundsBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.ETypeParameter type.
   * @return new instance of the org.eclipse.emf.ecore.ETypeParameter type
   */
  public org.eclipse.emf.ecore.ETypeParameter build() {
    final org.eclipse.emf.ecore.ETypeParameter _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createETypeParameter();
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (EAnnotationBuilder builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    if (m_featureEBoundsSet) {
      _newInstance.getEBounds().addAll(m_eBounds);
    } else {
      if (!m_featureEBoundsBuilder.isEmpty()) {
        for (EGenericTypeBuilder builder : m_featureEBoundsBuilder) {
          _newInstance.getEBounds().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ETypeParameterBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ETypeParameterBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ETypeParameterBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ETypeParameterBuilder withEAnnotations(EAnnotationBuilder p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ETypeParameterBuilder withEBounds(org.eclipse.emf.ecore.EGenericType p_eBounds) {
    m_eBounds.add(p_eBounds);
    m_featureEBoundsSet = true;
    return this;
  }

  public ETypeParameterBuilder withEBounds(java.util.Collection<? extends org.eclipse.emf.ecore.EGenericType> p_eBounds) {
    m_eBounds.addAll(p_eBounds);
    m_featureEBoundsSet = true;
    return this;
  }

  public ETypeParameterBuilder withEBounds(EGenericTypeBuilder p_eGenericTypeBuilder) {
    m_featureEBoundsBuilder.add(p_eGenericTypeBuilder);
    return this;
  }
}
