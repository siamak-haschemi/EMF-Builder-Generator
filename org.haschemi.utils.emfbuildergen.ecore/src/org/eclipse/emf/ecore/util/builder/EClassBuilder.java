package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EClass</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EClassBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EClass> {
  // features and builders
  private Boolean m_abstract_;
  private java.lang.String m_instanceClassName;
  private java.lang.String m_instanceTypeName;
  private Boolean m_interface_;
  private java.lang.String m_name;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.emf.ecore.EGenericType> m_eGenericSuperTypes = new java.util.LinkedList<org.eclipse.emf.ecore.EGenericType>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType>> m_featureEGenericSuperTypesBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType>>();
  private java.util.Collection<org.eclipse.emf.ecore.EOperation> m_eOperations = new java.util.LinkedList<org.eclipse.emf.ecore.EOperation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EOperation>> m_featureEOperationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EOperation>>();
  private java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature> m_eStructuralFeatures = new java.util.LinkedList<org.eclipse.emf.ecore.EStructuralFeature>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EStructuralFeature>> m_featureEStructuralFeaturesBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EStructuralFeature>>();
  private java.util.Collection<org.eclipse.emf.ecore.EClass> m_eSuperTypes = new java.util.LinkedList<org.eclipse.emf.ecore.EClass>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClass>> m_featureESuperTypesBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClass>>();
  private java.util.Collection<org.eclipse.emf.ecore.ETypeParameter> m_eTypeParameters = new java.util.LinkedList<org.eclipse.emf.ecore.ETypeParameter>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter>> m_featureETypeParametersBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter>>();
  // helper attributes
  private boolean m_featureAbstract_Set = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEGenericSuperTypesSet = false;
  private boolean m_featureEOperationsSet = false;
  private boolean m_featureEStructuralFeaturesSet = false;
  private boolean m_featureESuperTypesSet = false;
  private boolean m_featureETypeParametersSet = false;
  private boolean m_featureInstanceClassNameSet = false;
  private boolean m_featureInstanceTypeNameSet = false;
  private boolean m_featureInterface_Set = false;
  private boolean m_featureNameSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEClassBuilder()
   */
  private EClassBuilder() {
  }

  /**
   * This method creates a new instance of the EClassBuilder.
   * @return new instance of the EClassBuilder
   */
  public static EClassBuilder newEClassBuilder() {
    return new EClassBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EClassBuilder but() {
    EClassBuilder _builder = newEClassBuilder();
    _builder.m_featureAbstract_Set = m_featureAbstract_Set;
    _builder.m_abstract_ = m_abstract_;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEGenericSuperTypesSet = m_featureEGenericSuperTypesSet;
    _builder.m_eGenericSuperTypes = m_eGenericSuperTypes;
    _builder.m_featureEGenericSuperTypesBuilder = m_featureEGenericSuperTypesBuilder;
    _builder.m_featureEOperationsSet = m_featureEOperationsSet;
    _builder.m_eOperations = m_eOperations;
    _builder.m_featureEOperationsBuilder = m_featureEOperationsBuilder;
    _builder.m_featureEStructuralFeaturesSet = m_featureEStructuralFeaturesSet;
    _builder.m_eStructuralFeatures = m_eStructuralFeatures;
    _builder.m_featureEStructuralFeaturesBuilder = m_featureEStructuralFeaturesBuilder;
    _builder.m_featureESuperTypesSet = m_featureESuperTypesSet;
    _builder.m_eSuperTypes = m_eSuperTypes;
    _builder.m_featureESuperTypesBuilder = m_featureESuperTypesBuilder;
    _builder.m_featureETypeParametersSet = m_featureETypeParametersSet;
    _builder.m_eTypeParameters = m_eTypeParameters;
    _builder.m_featureETypeParametersBuilder = m_featureETypeParametersBuilder;
    _builder.m_featureInstanceClassNameSet = m_featureInstanceClassNameSet;
    _builder.m_instanceClassName = m_instanceClassName;
    _builder.m_featureInstanceTypeNameSet = m_featureInstanceTypeNameSet;
    _builder.m_instanceTypeName = m_instanceTypeName;
    _builder.m_featureInterface_Set = m_featureInterface_Set;
    _builder.m_interface_ = m_interface_;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EClass type.
   * @return new instance of the org.eclipse.emf.ecore.EClass type
   */
  public org.eclipse.emf.ecore.EClass build() {
    final org.eclipse.emf.ecore.EClass _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEClass();
    if (m_featureAbstract_Set) {
      _newInstance.setAbstract(m_abstract_);
    }
    if (m_featureInstanceClassNameSet) {
      _newInstance.setInstanceClassName(m_instanceClassName);
    }
    if (m_featureInstanceTypeNameSet) {
      _newInstance.setInstanceTypeName(m_instanceTypeName);
    }
    if (m_featureInterface_Set) {
      _newInstance.setInterface(m_interface_);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
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
    if (m_featureEGenericSuperTypesSet) {
      _newInstance.getEGenericSuperTypes().addAll(m_eGenericSuperTypes);
    } else {
      if (!m_featureEGenericSuperTypesBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> builder : m_featureEGenericSuperTypesBuilder) {
          _newInstance.getEGenericSuperTypes().add(builder.build());
        }
      }
    }
    if (m_featureEOperationsSet) {
      _newInstance.getEOperations().addAll(m_eOperations);
    } else {
      if (!m_featureEOperationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EOperation> builder : m_featureEOperationsBuilder) {
          _newInstance.getEOperations().add(builder.build());
        }
      }
    }
    if (m_featureEStructuralFeaturesSet) {
      _newInstance.getEStructuralFeatures().addAll(m_eStructuralFeatures);
    } else {
      if (!m_featureEStructuralFeaturesBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EStructuralFeature> builder : m_featureEStructuralFeaturesBuilder) {
          _newInstance.getEStructuralFeatures().add(builder.build());
        }
      }
    }
    if (m_featureESuperTypesSet) {
      _newInstance.getESuperTypes().addAll(m_eSuperTypes);
    } else {
      if (!m_featureESuperTypesBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClass> builder : m_featureESuperTypesBuilder) {
          _newInstance.getESuperTypes().add(builder.build());
        }
      }
    }
    if (m_featureETypeParametersSet) {
      _newInstance.getETypeParameters().addAll(m_eTypeParameters);
    } else {
      if (!m_featureETypeParametersBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter> builder : m_featureETypeParametersBuilder) {
          _newInstance.getETypeParameters().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public EClassBuilder withAbstract_(Boolean p_abstract_) {
    m_abstract_ = p_abstract_;
    m_featureAbstract_Set = true;
    return this;
  }

  public EClassBuilder withInstanceClassName(java.lang.String p_instanceClassName) {
    m_instanceClassName = p_instanceClassName;
    m_featureInstanceClassNameSet = true;
    return this;
  }

  public EClassBuilder withInstanceTypeName(java.lang.String p_instanceTypeName) {
    m_instanceTypeName = p_instanceTypeName;
    m_featureInstanceTypeNameSet = true;
    return this;
  }

  public EClassBuilder withInterface_(Boolean p_interface_) {
    m_interface_ = p_interface_;
    m_featureInterface_Set = true;
    return this;
  }

  public EClassBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EClassBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EClassBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EClassBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public EClassBuilder withEGenericSuperTypes(org.eclipse.emf.ecore.EGenericType p_eGenericSuperTypes) {
    m_eGenericSuperTypes.add(p_eGenericSuperTypes);
    m_featureEGenericSuperTypesSet = true;
    return this;
  }

  public EClassBuilder withEGenericSuperTypes(java.util.Collection<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericSuperTypes) {
    m_eGenericSuperTypes.addAll(p_eGenericSuperTypes);
    m_featureEGenericSuperTypesSet = true;
    return this;
  }

  public EClassBuilder withEGenericSuperTypes(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericTypeBuilder) {
    m_featureEGenericSuperTypesBuilder.add(p_eGenericTypeBuilder);
    return this;
  }

  public EClassBuilder withEOperations(org.eclipse.emf.ecore.EOperation p_eOperations) {
    m_eOperations.add(p_eOperations);
    m_featureEOperationsSet = true;
    return this;
  }

  public EClassBuilder withEOperations(java.util.Collection<? extends org.eclipse.emf.ecore.EOperation> p_eOperations) {
    m_eOperations.addAll(p_eOperations);
    m_featureEOperationsSet = true;
    return this;
  }

  public EClassBuilder withEOperations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EOperation> p_eOperationBuilder) {
    m_featureEOperationsBuilder.add(p_eOperationBuilder);
    return this;
  }

  public EClassBuilder withEStructuralFeatures(org.eclipse.emf.ecore.EStructuralFeature p_eStructuralFeatures) {
    m_eStructuralFeatures.add(p_eStructuralFeatures);
    m_featureEStructuralFeaturesSet = true;
    return this;
  }

  public EClassBuilder withEStructuralFeatures(java.util.Collection<? extends org.eclipse.emf.ecore.EStructuralFeature> p_eStructuralFeatures) {
    m_eStructuralFeatures.addAll(p_eStructuralFeatures);
    m_featureEStructuralFeaturesSet = true;
    return this;
  }

  public EClassBuilder withEStructuralFeatures(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EStructuralFeature> p_eStructuralFeatureBuilder) {
    m_featureEStructuralFeaturesBuilder.add(p_eStructuralFeatureBuilder);
    return this;
  }

  public EClassBuilder withESuperTypes(org.eclipse.emf.ecore.EClass p_eSuperTypes) {
    m_eSuperTypes.add(p_eSuperTypes);
    m_featureESuperTypesSet = true;
    return this;
  }

  public EClassBuilder withESuperTypes(java.util.Collection<? extends org.eclipse.emf.ecore.EClass> p_eSuperTypes) {
    m_eSuperTypes.addAll(p_eSuperTypes);
    m_featureESuperTypesSet = true;
    return this;
  }

  public EClassBuilder withESuperTypes(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClass> p_eClassBuilder) {
    m_featureESuperTypesBuilder.add(p_eClassBuilder);
    return this;
  }

  public EClassBuilder withETypeParameters(org.eclipse.emf.ecore.ETypeParameter p_eTypeParameters) {
    m_eTypeParameters.add(p_eTypeParameters);
    m_featureETypeParametersSet = true;
    return this;
  }

  public EClassBuilder withETypeParameters(java.util.Collection<? extends org.eclipse.emf.ecore.ETypeParameter> p_eTypeParameters) {
    m_eTypeParameters.addAll(p_eTypeParameters);
    m_featureETypeParametersSet = true;
    return this;
  }

  public EClassBuilder withETypeParameters(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter> p_eTypeParameterBuilder) {
    m_featureETypeParametersBuilder.add(p_eTypeParameterBuilder);
    return this;
  }
}
