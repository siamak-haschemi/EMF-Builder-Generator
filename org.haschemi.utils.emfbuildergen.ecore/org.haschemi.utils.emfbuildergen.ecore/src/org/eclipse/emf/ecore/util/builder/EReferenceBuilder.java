package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EReference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EReferenceBuilder {
  // features and builders
  private Boolean m_changeable;
  private Boolean m_containment;
  private java.lang.String m_defaultValueLiteral;
  private Boolean m_derived;
  private org.eclipse.emf.ecore.EGenericType m_eGenericType;
  private org.eclipse.emf.ecore.util.builder.EGenericTypeBuilder m_featureEGenericTypeBuilder;
  private org.eclipse.emf.ecore.EReference m_eOpposite;
  private org.eclipse.emf.ecore.util.builder.EReferenceBuilder m_featureEOppositeBuilder;
  private org.eclipse.emf.ecore.EClassifier m_eType;
  private Integer m_lowerBound;
  private java.lang.String m_name;
  private Boolean m_ordered;
  private Boolean m_resolveProxies;
  private Boolean m_transient_;
  private Boolean m_unique;
  private Boolean m_unsettable;
  private Integer m_upperBound;
  private Boolean m_volatile_;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.EAnnotationBuilder> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.EAnnotationBuilder>();
  private java.util.Collection<org.eclipse.emf.ecore.EAttribute> m_eKeys = new java.util.LinkedList<org.eclipse.emf.ecore.EAttribute>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.EAttributeBuilder> m_featureEKeysBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.EAttributeBuilder>();
  // helper attributes
  private boolean m_featureChangeableSet = false;
  private boolean m_featureContainmentSet = false;
  private boolean m_featureDefaultValueLiteralSet = false;
  private boolean m_featureDerivedSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEGenericTypeSet = false;
  private boolean m_featureEKeysSet = false;
  private boolean m_featureEOppositeSet = false;
  private boolean m_featureETypeSet = false;
  private boolean m_featureLowerBoundSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureOrderedSet = false;
  private boolean m_featureResolveProxiesSet = false;
  private boolean m_featureTransient_Set = false;
  private boolean m_featureUniqueSet = false;
  private boolean m_featureUnsettableSet = false;
  private boolean m_featureUpperBoundSet = false;
  private boolean m_featureVolatile_Set = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEReferenceBuilder()
   */
  private EReferenceBuilder() {
  }

  /**
   * This method creates a new instance of the EReferenceBuilder.
   * @return new instance of the EReferenceBuilder
   */
  public static EReferenceBuilder newEReferenceBuilder() {
    return new EReferenceBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EReferenceBuilder but() {
    EReferenceBuilder _builder = newEReferenceBuilder();
    _builder.m_featureChangeableSet = m_featureChangeableSet;
    _builder.m_changeable = m_changeable;
    _builder.m_featureContainmentSet = m_featureContainmentSet;
    _builder.m_containment = m_containment;
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
    _builder.m_featureEKeysSet = m_featureEKeysSet;
    _builder.m_eKeys = m_eKeys;
    _builder.m_featureEKeysBuilder = m_featureEKeysBuilder;
    _builder.m_featureEOppositeSet = m_featureEOppositeSet;
    _builder.m_eOpposite = m_eOpposite;
    _builder.m_featureEOppositeBuilder = m_featureEOppositeBuilder;
    _builder.m_featureETypeSet = m_featureETypeSet;
    _builder.m_eType = m_eType;
    _builder.m_featureLowerBoundSet = m_featureLowerBoundSet;
    _builder.m_lowerBound = m_lowerBound;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureOrderedSet = m_featureOrderedSet;
    _builder.m_ordered = m_ordered;
    _builder.m_featureResolveProxiesSet = m_featureResolveProxiesSet;
    _builder.m_resolveProxies = m_resolveProxies;
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
   * This method constructs the final org.eclipse.emf.ecore.EReference type.
   * @return new instance of the org.eclipse.emf.ecore.EReference type
   */
  public org.eclipse.emf.ecore.EReference build() {
    final org.eclipse.emf.ecore.EReference _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEReference();
    if (m_featureChangeableSet) {
      _newInstance.setChangeable(m_changeable);
    }
    if (m_featureContainmentSet) {
      _newInstance.setContainment(m_containment);
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
    if (m_featureEOppositeSet) {
      _newInstance.setEOpposite(m_eOpposite);
    } else {
      if (m_featureEOppositeBuilder != null) {
        _newInstance.setEOpposite(m_featureEOppositeBuilder.build());
      }
    }
    if (m_featureETypeSet) {
      _newInstance.setEType(m_eType);
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
    if (m_featureResolveProxiesSet) {
      _newInstance.setResolveProxies(m_resolveProxies);
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
    if (m_featureEKeysSet) {
      _newInstance.getEKeys().addAll(m_eKeys);
    } else {
      if (!m_featureEKeysBuilder.isEmpty()) {
        for (EAttributeBuilder builder : m_featureEKeysBuilder) {
          _newInstance.getEKeys().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public EReferenceBuilder withChangeable(Boolean p_changeable) {
    m_changeable = p_changeable;
    m_featureChangeableSet = true;
    return this;
  }

  public EReferenceBuilder withContainment(Boolean p_containment) {
    m_containment = p_containment;
    m_featureContainmentSet = true;
    return this;
  }

  public EReferenceBuilder withDefaultValueLiteral(java.lang.String p_defaultValueLiteral) {
    m_defaultValueLiteral = p_defaultValueLiteral;
    m_featureDefaultValueLiteralSet = true;
    return this;
  }

  public EReferenceBuilder withDerived(Boolean p_derived) {
    m_derived = p_derived;
    m_featureDerivedSet = true;
    return this;
  }

  public EReferenceBuilder withEGenericType(org.eclipse.emf.ecore.EGenericType p_eGenericType) {
    m_eGenericType = p_eGenericType;
    m_featureEGenericTypeSet = true;
    return this;
  }

  public EReferenceBuilder withEGenericType(org.eclipse.emf.ecore.util.builder.EGenericTypeBuilder p_eGenericTypeBuilder) {
    m_featureEGenericTypeBuilder = p_eGenericTypeBuilder;
    return this;
  }

  public EReferenceBuilder withEOpposite(org.eclipse.emf.ecore.EReference p_eOpposite) {
    m_eOpposite = p_eOpposite;
    m_featureEOppositeSet = true;
    return this;
  }

  public EReferenceBuilder withEOpposite(org.eclipse.emf.ecore.util.builder.EReferenceBuilder p_eReferenceBuilder) {
    m_featureEOppositeBuilder = p_eReferenceBuilder;
    return this;
  }

  public EReferenceBuilder withEType(org.eclipse.emf.ecore.EClassifier p_eType) {
    m_eType = p_eType;
    m_featureETypeSet = true;
    return this;
  }

  public EReferenceBuilder withLowerBound(Integer p_lowerBound) {
    m_lowerBound = p_lowerBound;
    m_featureLowerBoundSet = true;
    return this;
  }

  public EReferenceBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EReferenceBuilder withOrdered(Boolean p_ordered) {
    m_ordered = p_ordered;
    m_featureOrderedSet = true;
    return this;
  }

  public EReferenceBuilder withResolveProxies(Boolean p_resolveProxies) {
    m_resolveProxies = p_resolveProxies;
    m_featureResolveProxiesSet = true;
    return this;
  }

  public EReferenceBuilder withTransient_(Boolean p_transient_) {
    m_transient_ = p_transient_;
    m_featureTransient_Set = true;
    return this;
  }

  public EReferenceBuilder withUnique(Boolean p_unique) {
    m_unique = p_unique;
    m_featureUniqueSet = true;
    return this;
  }

  public EReferenceBuilder withUnsettable(Boolean p_unsettable) {
    m_unsettable = p_unsettable;
    m_featureUnsettableSet = true;
    return this;
  }

  public EReferenceBuilder withUpperBound(Integer p_upperBound) {
    m_upperBound = p_upperBound;
    m_featureUpperBoundSet = true;
    return this;
  }

  public EReferenceBuilder withVolatile_(Boolean p_volatile_) {
    m_volatile_ = p_volatile_;
    m_featureVolatile_Set = true;
    return this;
  }

  public EReferenceBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EReferenceBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EReferenceBuilder withEAnnotations(EAnnotationBuilder p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public EReferenceBuilder withEKeys(org.eclipse.emf.ecore.EAttribute p_eKeys) {
    m_eKeys.add(p_eKeys);
    m_featureEKeysSet = true;
    return this;
  }

  public EReferenceBuilder withEKeys(java.util.Collection<? extends org.eclipse.emf.ecore.EAttribute> p_eKeys) {
    m_eKeys.addAll(p_eKeys);
    m_featureEKeysSet = true;
    return this;
  }

  public EReferenceBuilder withEKeys(EAttributeBuilder p_eAttributeBuilder) {
    m_featureEKeysBuilder.add(p_eAttributeBuilder);
    return this;
  }
}
