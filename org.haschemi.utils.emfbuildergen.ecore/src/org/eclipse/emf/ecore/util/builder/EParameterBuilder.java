package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EParameter</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EParameterBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EParameter> {
  // features and builders
  private org.eclipse.emf.ecore.EGenericType m_eGenericType;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> m_featureEGenericTypeBuilder;
  private org.eclipse.emf.ecore.EClassifier m_eType;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> m_featureETypeBuilder;
  private Integer m_lowerBound;
  private java.lang.String m_name;
  private Boolean m_ordered;
  private Boolean m_unique;
  private Integer m_upperBound;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEGenericTypeSet = false;
  private boolean m_featureETypeSet = false;
  private boolean m_featureLowerBoundSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureOrderedSet = false;
  private boolean m_featureUniqueSet = false;
  private boolean m_featureUpperBoundSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEParameterBuilder()
   */
  private EParameterBuilder() {
  }

  /**
   * This method creates a new instance of the EParameterBuilder.
   * @return new instance of the EParameterBuilder
   */
  public static EParameterBuilder newEParameterBuilder() {
    return new EParameterBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EParameterBuilder but() {
    EParameterBuilder _builder = newEParameterBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEGenericTypeSet = m_featureEGenericTypeSet;
    _builder.m_eGenericType = m_eGenericType;
    _builder.m_featureEGenericTypeBuilder = m_featureEGenericTypeBuilder;
    _builder.m_featureETypeSet = m_featureETypeSet;
    _builder.m_eType = m_eType;
    _builder.m_featureETypeBuilder = m_featureETypeBuilder;
    _builder.m_featureLowerBoundSet = m_featureLowerBoundSet;
    _builder.m_lowerBound = m_lowerBound;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureOrderedSet = m_featureOrderedSet;
    _builder.m_ordered = m_ordered;
    _builder.m_featureUniqueSet = m_featureUniqueSet;
    _builder.m_unique = m_unique;
    _builder.m_featureUpperBoundSet = m_featureUpperBoundSet;
    _builder.m_upperBound = m_upperBound;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EParameter type.
   * @return new instance of the org.eclipse.emf.ecore.EParameter type
   */
  public org.eclipse.emf.ecore.EParameter build() {
    final org.eclipse.emf.ecore.EParameter _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEParameter();
    if (m_featureEGenericTypeSet) {
      _newInstance.setEGenericType(m_eGenericType);
    } else {
      if (m_featureEGenericTypeBuilder != null) {
        _newInstance.setEGenericType(m_featureEGenericTypeBuilder.build());
      }
    }
    if (m_featureETypeSet) {
      _newInstance.setEType(m_eType);
    } else {
      if (m_featureETypeBuilder != null) {
        _newInstance.setEType(m_featureETypeBuilder.build());
      }
    }
    if (m_featureLowerBoundSet) {
      _newInstance.setLowerBound(m_lowerBound);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureOrderedSet) {
      _newInstance.setOrdered(m_ordered);
    }
    if (m_featureUniqueSet) {
      _newInstance.setUnique(m_unique);
    }
    if (m_featureUpperBoundSet) {
      _newInstance.setUpperBound(m_upperBound);
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

  public EParameterBuilder withEGenericType(org.eclipse.emf.ecore.EGenericType p_eGenericType) {
    m_eGenericType = p_eGenericType;
    m_featureEGenericTypeSet = true;
    return this;
  }

  public EParameterBuilder withEGenericType(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericTypeBuilder) {
    m_featureEGenericTypeBuilder = p_eGenericTypeBuilder;
    return this;
  }

  public EParameterBuilder withEType(org.eclipse.emf.ecore.EClassifier p_eType) {
    m_eType = p_eType;
    m_featureETypeSet = true;
    return this;
  }

  public EParameterBuilder withEType(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> p_eClassifierBuilder) {
    m_featureETypeBuilder = p_eClassifierBuilder;
    return this;
  }

  public EParameterBuilder withLowerBound(Integer p_lowerBound) {
    m_lowerBound = p_lowerBound;
    m_featureLowerBoundSet = true;
    return this;
  }

  public EParameterBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EParameterBuilder withOrdered(Boolean p_ordered) {
    m_ordered = p_ordered;
    m_featureOrderedSet = true;
    return this;
  }

  public EParameterBuilder withUnique(Boolean p_unique) {
    m_unique = p_unique;
    m_featureUniqueSet = true;
    return this;
  }

  public EParameterBuilder withUpperBound(Integer p_upperBound) {
    m_upperBound = p_upperBound;
    m_featureUpperBoundSet = true;
    return this;
  }

  public EParameterBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EParameterBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EParameterBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }
}
