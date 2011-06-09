package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EAttributeBuilder {
  // features and builders
  private Boolean m_changeable;
  private java.lang.String m_defaultValueLiteral;
  private Boolean m_derived;
  private org.eclipse.emf.ecore.EGenericType m_eGenericType;
  private org.eclipse.emf.ecore.util.builder.EGenericTypeBuilder m_featureEGenericTypeBuilder;
  private org.eclipse.emf.ecore.EClassifier m_eType;
  private Boolean m_iD;
  private Integer m_lowerBound;
  private java.lang.String m_name;
  private Boolean m_ordered;
  private Boolean m_transient_;
  private Boolean m_unique;
  private Boolean m_unsettable;
  private Integer m_upperBound;
  private Boolean m_volatile_;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.EAnnotationBuilder> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.EAnnotationBuilder>();
  // helper attributes
  private boolean m_featureChangeableSet = false;
  private boolean m_featureDefaultValueLiteralSet = false;
  private boolean m_featureDerivedSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEGenericTypeSet = false;
  private boolean m_featureETypeSet = false;
  private boolean m_featureIDSet = false;
  private boolean m_featureLowerBoundSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureOrderedSet = false;
  private boolean m_featureTransient_Set = false;
  private boolean m_featureUniqueSet = false;
  private boolean m_featureUnsettableSet = false;
  private boolean m_featureUpperBoundSet = false;
  private boolean m_featureVolatile_Set = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEAttributeBuilder()
   */
  private EAttributeBuilder() {
  }

  /**
   * This method creates a new instance of the EAttributeBuilder.
   * @return new instance of the EAttributeBuilder
   */
  public static EAttributeBuilder newEAttributeBuilder() {
    return new EAttributeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EAttributeBuilder but() {
    EAttributeBuilder _builder = newEAttributeBuilder();
    _builder.m_featureChangeableSet = m_featureChangeableSet;
    _builder.m_changeable = m_changeable;
    _builder.m_featureDefaultValueLiteralSet = m_featureDefaultValueLiteralSet;
    _builder.m_defaultValueLiteral = m_defaultValueLiteral;
    _builder.m_featureDerivedSet = m_featureDerivedSet;
    _builder.m_derived = m_derived;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEGenericTypeSet = m_featureEGenericTypeSet;
    _builder.m_eGenericType = m_eGenericType;
    _builder.m_featureEGenericTypeBuilder = m_featureEGenericTypeBuilder;
    _builder.m_featureETypeSet = m_featureETypeSet;
    _builder.m_eType = m_eType;
    _builder.m_featureIDSet = m_featureIDSet;
    _builder.m_iD = m_iD;
    _builder.m_featureLowerBoundSet = m_featureLowerBoundSet;
    _builder.m_lowerBound = m_lowerBound;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureOrderedSet = m_featureOrderedSet;
    _builder.m_ordered = m_ordered;
    _builder.m_featureTransient_Set = m_featureTransient_Set;
    _builder.m_transient_ = m_transient_;
    _builder.m_featureUniqueSet = m_featureUniqueSet;
    _builder.m_unique = m_unique;
    _builder.m_featureUnsettableSet = m_featureUnsettableSet;
    _builder.m_unsettable = m_unsettable;
    _builder.m_featureUpperBoundSet = m_featureUpperBoundSet;
    _builder.m_upperBound = m_upperBound;
    _builder.m_featureVolatile_Set = m_featureVolatile_Set;
    _builder.m_volatile_ = m_volatile_;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EAttribute type.
   * @return new instance of the org.eclipse.emf.ecore.EAttribute type
   */
  public org.eclipse.emf.ecore.EAttribute build() {
    final org.eclipse.emf.ecore.EAttribute _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
    if (m_featureChangeableSet) {
      _newInstance.setChangeable(m_changeable);
    }
    if (m_featureDefaultValueLiteralSet) {
      _newInstance.setDefaultValueLiteral(m_defaultValueLiteral);
    }
    if (m_featureDerivedSet) {
      _newInstance.setDerived(m_derived);
    }
    if (m_featureEGenericTypeSet) {
      _newInstance.setEGenericType(m_eGenericType);
    } else {
      if (m_featureEGenericTypeBuilder != null) {
        _newInstance.setEGenericType(m_featureEGenericTypeBuilder.build());
      }
    }
    if (m_featureETypeSet) {
      _newInstance.setEType(m_eType);
    }
    if (m_featureIDSet) {
      _newInstance.setID(m_iD);
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
    if (m_featureTransient_Set) {
      _newInstance.setTransient(m_transient_);
    }
    if (m_featureUniqueSet) {
      _newInstance.setUnique(m_unique);
    }
    if (m_featureUnsettableSet) {
      _newInstance.setUnsettable(m_unsettable);
    }
    if (m_featureUpperBoundSet) {
      _newInstance.setUpperBound(m_upperBound);
    }
    if (m_featureVolatile_Set) {
      _newInstance.setVolatile(m_volatile_);
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
    return _newInstance;
  }

  public EAttributeBuilder withChangeable(Boolean p_changeable) {
    m_changeable = p_changeable;
    m_featureChangeableSet = true;
    return this;
  }

  public EAttributeBuilder withDefaultValueLiteral(java.lang.String p_defaultValueLiteral) {
    m_defaultValueLiteral = p_defaultValueLiteral;
    m_featureDefaultValueLiteralSet = true;
    return this;
  }

  public EAttributeBuilder withDerived(Boolean p_derived) {
    m_derived = p_derived;
    m_featureDerivedSet = true;
    return this;
  }

  public EAttributeBuilder withEGenericType(org.eclipse.emf.ecore.EGenericType p_eGenericType) {
    m_eGenericType = p_eGenericType;
    m_featureEGenericTypeSet = true;
    return this;
  }

  public EAttributeBuilder withEGenericType(org.eclipse.emf.ecore.util.builder.EGenericTypeBuilder p_eGenericTypeBuilder) {
    m_featureEGenericTypeBuilder = p_eGenericTypeBuilder;
    return this;
  }

  public EAttributeBuilder withEType(org.eclipse.emf.ecore.EClassifier p_eType) {
    m_eType = p_eType;
    m_featureETypeSet = true;
    return this;
  }

  public EAttributeBuilder withID(Boolean p_iD) {
    m_iD = p_iD;
    m_featureIDSet = true;
    return this;
  }

  public EAttributeBuilder withLowerBound(Integer p_lowerBound) {
    m_lowerBound = p_lowerBound;
    m_featureLowerBoundSet = true;
    return this;
  }

  public EAttributeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EAttributeBuilder withOrdered(Boolean p_ordered) {
    m_ordered = p_ordered;
    m_featureOrderedSet = true;
    return this;
  }

  public EAttributeBuilder withTransient_(Boolean p_transient_) {
    m_transient_ = p_transient_;
    m_featureTransient_Set = true;
    return this;
  }

  public EAttributeBuilder withUnique(Boolean p_unique) {
    m_unique = p_unique;
    m_featureUniqueSet = true;
    return this;
  }

  public EAttributeBuilder withUnsettable(Boolean p_unsettable) {
    m_unsettable = p_unsettable;
    m_featureUnsettableSet = true;
    return this;
  }

  public EAttributeBuilder withUpperBound(Integer p_upperBound) {
    m_upperBound = p_upperBound;
    m_featureUpperBoundSet = true;
    return this;
  }

  public EAttributeBuilder withVolatile_(Boolean p_volatile_) {
    m_volatile_ = p_volatile_;
    m_featureVolatile_Set = true;
    return this;
  }

  public EAttributeBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EAttributeBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EAttributeBuilder withEAnnotations(EAnnotationBuilder p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }
}
