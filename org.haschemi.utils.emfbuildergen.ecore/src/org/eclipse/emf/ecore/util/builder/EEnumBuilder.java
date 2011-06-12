package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EEnum</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EEnumBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EEnum> {
  // features and builders
  private java.lang.String m_instanceClassName;
  private java.lang.String m_instanceTypeName;
  private java.lang.String m_name;
  private Boolean m_serializable;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.emf.ecore.EEnumLiteral> m_eLiterals = new java.util.LinkedList<org.eclipse.emf.ecore.EEnumLiteral>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EEnumLiteral>> m_featureELiteralsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EEnumLiteral>>();
  private java.util.Collection<org.eclipse.emf.ecore.ETypeParameter> m_eTypeParameters = new java.util.LinkedList<org.eclipse.emf.ecore.ETypeParameter>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter>> m_featureETypeParametersBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureELiteralsSet = false;
  private boolean m_featureETypeParametersSet = false;
  private boolean m_featureInstanceClassNameSet = false;
  private boolean m_featureInstanceTypeNameSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureSerializableSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEEnumBuilder()
   */
  private EEnumBuilder() {
  }

  /**
   * This method creates a new instance of the EEnumBuilder.
   * @return new instance of the EEnumBuilder
   */
  public static EEnumBuilder newEEnumBuilder() {
    return new EEnumBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EEnumBuilder but() {
    EEnumBuilder _builder = newEEnumBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureELiteralsSet = m_featureELiteralsSet;
    _builder.m_eLiterals = m_eLiterals;
    _builder.m_featureELiteralsBuilder = m_featureELiteralsBuilder;
    _builder.m_featureETypeParametersSet = m_featureETypeParametersSet;
    _builder.m_eTypeParameters = m_eTypeParameters;
    _builder.m_featureETypeParametersBuilder = m_featureETypeParametersBuilder;
    _builder.m_featureInstanceClassNameSet = m_featureInstanceClassNameSet;
    _builder.m_instanceClassName = m_instanceClassName;
    _builder.m_featureInstanceTypeNameSet = m_featureInstanceTypeNameSet;
    _builder.m_instanceTypeName = m_instanceTypeName;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureSerializableSet = m_featureSerializableSet;
    _builder.m_serializable = m_serializable;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EEnum type.
   * @return new instance of the org.eclipse.emf.ecore.EEnum type
   */
  public org.eclipse.emf.ecore.EEnum build() {
    final org.eclipse.emf.ecore.EEnum _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEEnum();
    if (m_featureInstanceClassNameSet) {
      _newInstance.setInstanceClassName(m_instanceClassName);
    }
    if (m_featureInstanceTypeNameSet) {
      _newInstance.setInstanceTypeName(m_instanceTypeName);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureSerializableSet) {
      _newInstance.setSerializable(m_serializable);
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
    if (m_featureELiteralsSet) {
      _newInstance.getELiterals().addAll(m_eLiterals);
    } else {
      if (!m_featureELiteralsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EEnumLiteral> builder : m_featureELiteralsBuilder) {
          _newInstance.getELiterals().add(builder.build());
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

  public EEnumBuilder withInstanceClassName(java.lang.String p_instanceClassName) {
    m_instanceClassName = p_instanceClassName;
    m_featureInstanceClassNameSet = true;
    return this;
  }

  public EEnumBuilder withInstanceTypeName(java.lang.String p_instanceTypeName) {
    m_instanceTypeName = p_instanceTypeName;
    m_featureInstanceTypeNameSet = true;
    return this;
  }

  public EEnumBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EEnumBuilder withSerializable(Boolean p_serializable) {
    m_serializable = p_serializable;
    m_featureSerializableSet = true;
    return this;
  }

  public EEnumBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EEnumBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EEnumBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public EEnumBuilder withELiterals(org.eclipse.emf.ecore.EEnumLiteral p_eLiterals) {
    m_eLiterals.add(p_eLiterals);
    m_featureELiteralsSet = true;
    return this;
  }

  public EEnumBuilder withELiterals(java.util.Collection<? extends org.eclipse.emf.ecore.EEnumLiteral> p_eLiterals) {
    m_eLiterals.addAll(p_eLiterals);
    m_featureELiteralsSet = true;
    return this;
  }

  public EEnumBuilder withELiterals(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EEnumLiteral> p_eEnumLiteralBuilder) {
    m_featureELiteralsBuilder.add(p_eEnumLiteralBuilder);
    return this;
  }

  public EEnumBuilder withETypeParameters(org.eclipse.emf.ecore.ETypeParameter p_eTypeParameters) {
    m_eTypeParameters.add(p_eTypeParameters);
    m_featureETypeParametersSet = true;
    return this;
  }

  public EEnumBuilder withETypeParameters(java.util.Collection<? extends org.eclipse.emf.ecore.ETypeParameter> p_eTypeParameters) {
    m_eTypeParameters.addAll(p_eTypeParameters);
    m_featureETypeParametersSet = true;
    return this;
  }

  public EEnumBuilder withETypeParameters(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter> p_eTypeParameterBuilder) {
    m_featureETypeParametersBuilder.add(p_eTypeParameterBuilder);
    return this;
  }
}
