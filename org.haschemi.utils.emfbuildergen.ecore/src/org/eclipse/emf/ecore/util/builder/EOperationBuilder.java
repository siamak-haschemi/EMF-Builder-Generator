package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EOperation</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EOperationBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EOperation> {
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
  private java.util.Collection<org.eclipse.emf.ecore.EClassifier> m_eExceptions = new java.util.LinkedList<org.eclipse.emf.ecore.EClassifier>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier>> m_featureEExceptionsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier>>();
  private java.util.Collection<org.eclipse.emf.ecore.EGenericType> m_eGenericExceptions = new java.util.LinkedList<org.eclipse.emf.ecore.EGenericType>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType>> m_featureEGenericExceptionsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType>>();
  private java.util.Collection<org.eclipse.emf.ecore.EParameter> m_eParameters = new java.util.LinkedList<org.eclipse.emf.ecore.EParameter>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EParameter>> m_featureEParametersBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EParameter>>();
  private java.util.Collection<org.eclipse.emf.ecore.ETypeParameter> m_eTypeParameters = new java.util.LinkedList<org.eclipse.emf.ecore.ETypeParameter>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter>> m_featureETypeParametersBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEExceptionsSet = false;
  private boolean m_featureEGenericExceptionsSet = false;
  private boolean m_featureEGenericTypeSet = false;
  private boolean m_featureEParametersSet = false;
  private boolean m_featureETypeSet = false;
  private boolean m_featureETypeParametersSet = false;
  private boolean m_featureLowerBoundSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureOrderedSet = false;
  private boolean m_featureUniqueSet = false;
  private boolean m_featureUpperBoundSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEOperationBuilder()
   */
  private EOperationBuilder() {
  }

  /**
   * This method creates a new instance of the EOperationBuilder.
   * @return new instance of the EOperationBuilder
   */
  public static EOperationBuilder newEOperationBuilder() {
    return new EOperationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EOperationBuilder but() {
    EOperationBuilder _builder = newEOperationBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEExceptionsSet = m_featureEExceptionsSet;
    _builder.m_eExceptions = m_eExceptions;
    _builder.m_featureEExceptionsBuilder = m_featureEExceptionsBuilder;
    _builder.m_featureEGenericExceptionsSet = m_featureEGenericExceptionsSet;
    _builder.m_eGenericExceptions = m_eGenericExceptions;
    _builder.m_featureEGenericExceptionsBuilder = m_featureEGenericExceptionsBuilder;
    _builder.m_featureEGenericTypeSet = m_featureEGenericTypeSet;
    _builder.m_eGenericType = m_eGenericType;
    _builder.m_featureEGenericTypeBuilder = m_featureEGenericTypeBuilder;
    _builder.m_featureEParametersSet = m_featureEParametersSet;
    _builder.m_eParameters = m_eParameters;
    _builder.m_featureEParametersBuilder = m_featureEParametersBuilder;
    _builder.m_featureETypeSet = m_featureETypeSet;
    _builder.m_eType = m_eType;
    _builder.m_featureETypeBuilder = m_featureETypeBuilder;
    _builder.m_featureETypeParametersSet = m_featureETypeParametersSet;
    _builder.m_eTypeParameters = m_eTypeParameters;
    _builder.m_featureETypeParametersBuilder = m_featureETypeParametersBuilder;
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
   * This method constructs the final org.eclipse.emf.ecore.EOperation type.
   * @return new instance of the org.eclipse.emf.ecore.EOperation type
   */
  public org.eclipse.emf.ecore.EOperation build() {
    final org.eclipse.emf.ecore.EOperation _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEOperation();
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
    if (m_featureEExceptionsSet) {
      _newInstance.getEExceptions().addAll(m_eExceptions);
    } else {
      if (!m_featureEExceptionsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> builder : m_featureEExceptionsBuilder) {
          _newInstance.getEExceptions().add(builder.build());
        }
      }
    }
    if (m_featureEGenericExceptionsSet) {
      _newInstance.getEGenericExceptions().addAll(m_eGenericExceptions);
    } else {
      if (!m_featureEGenericExceptionsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> builder : m_featureEGenericExceptionsBuilder) {
          _newInstance.getEGenericExceptions().add(builder.build());
        }
      }
    }
    if (m_featureEParametersSet) {
      _newInstance.getEParameters().addAll(m_eParameters);
    } else {
      if (!m_featureEParametersBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EParameter> builder : m_featureEParametersBuilder) {
          _newInstance.getEParameters().add(builder.build());
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

  public EOperationBuilder withEGenericType(org.eclipse.emf.ecore.EGenericType p_eGenericType) {
    m_eGenericType = p_eGenericType;
    m_featureEGenericTypeSet = true;
    return this;
  }

  public EOperationBuilder withEGenericType(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericTypeBuilder) {
    m_featureEGenericTypeBuilder = p_eGenericTypeBuilder;
    return this;
  }

  public EOperationBuilder withEType(org.eclipse.emf.ecore.EClassifier p_eType) {
    m_eType = p_eType;
    m_featureETypeSet = true;
    return this;
  }

  public EOperationBuilder withEType(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> p_eClassifierBuilder) {
    m_featureETypeBuilder = p_eClassifierBuilder;
    return this;
  }

  public EOperationBuilder withLowerBound(Integer p_lowerBound) {
    m_lowerBound = p_lowerBound;
    m_featureLowerBoundSet = true;
    return this;
  }

  public EOperationBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EOperationBuilder withOrdered(Boolean p_ordered) {
    m_ordered = p_ordered;
    m_featureOrderedSet = true;
    return this;
  }

  public EOperationBuilder withUnique(Boolean p_unique) {
    m_unique = p_unique;
    m_featureUniqueSet = true;
    return this;
  }

  public EOperationBuilder withUpperBound(Integer p_upperBound) {
    m_upperBound = p_upperBound;
    m_featureUpperBoundSet = true;
    return this;
  }

  public EOperationBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EOperationBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EOperationBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public EOperationBuilder withEExceptions(org.eclipse.emf.ecore.EClassifier p_eExceptions) {
    m_eExceptions.add(p_eExceptions);
    m_featureEExceptionsSet = true;
    return this;
  }

  public EOperationBuilder withEExceptions(java.util.Collection<? extends org.eclipse.emf.ecore.EClassifier> p_eExceptions) {
    m_eExceptions.addAll(p_eExceptions);
    m_featureEExceptionsSet = true;
    return this;
  }

  public EOperationBuilder withEExceptions(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> p_eClassifierBuilder) {
    m_featureEExceptionsBuilder.add(p_eClassifierBuilder);
    return this;
  }

  public EOperationBuilder withEGenericExceptions(org.eclipse.emf.ecore.EGenericType p_eGenericExceptions) {
    m_eGenericExceptions.add(p_eGenericExceptions);
    m_featureEGenericExceptionsSet = true;
    return this;
  }

  public EOperationBuilder withEGenericExceptions(java.util.Collection<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericExceptions) {
    m_eGenericExceptions.addAll(p_eGenericExceptions);
    m_featureEGenericExceptionsSet = true;
    return this;
  }

  public EOperationBuilder withEGenericExceptions(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericTypeBuilder) {
    m_featureEGenericExceptionsBuilder.add(p_eGenericTypeBuilder);
    return this;
  }

  public EOperationBuilder withEParameters(org.eclipse.emf.ecore.EParameter p_eParameters) {
    m_eParameters.add(p_eParameters);
    m_featureEParametersSet = true;
    return this;
  }

  public EOperationBuilder withEParameters(java.util.Collection<? extends org.eclipse.emf.ecore.EParameter> p_eParameters) {
    m_eParameters.addAll(p_eParameters);
    m_featureEParametersSet = true;
    return this;
  }

  public EOperationBuilder withEParameters(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EParameter> p_eParameterBuilder) {
    m_featureEParametersBuilder.add(p_eParameterBuilder);
    return this;
  }

  public EOperationBuilder withETypeParameters(org.eclipse.emf.ecore.ETypeParameter p_eTypeParameters) {
    m_eTypeParameters.add(p_eTypeParameters);
    m_featureETypeParametersSet = true;
    return this;
  }

  public EOperationBuilder withETypeParameters(java.util.Collection<? extends org.eclipse.emf.ecore.ETypeParameter> p_eTypeParameters) {
    m_eTypeParameters.addAll(p_eTypeParameters);
    m_featureETypeParametersSet = true;
    return this;
  }

  public EOperationBuilder withETypeParameters(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter> p_eTypeParameterBuilder) {
    m_featureETypeParametersBuilder.add(p_eTypeParameterBuilder);
    return this;
  }
}
