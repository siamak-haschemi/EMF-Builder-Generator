package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EGenericType</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EGenericTypeBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EGenericType> {
  // features and builders
  private org.eclipse.emf.ecore.EClassifier m_eClassifier;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> m_featureEClassifierBuilder;
  private org.eclipse.emf.ecore.EGenericType m_eLowerBound;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> m_featureELowerBoundBuilder;
  private org.eclipse.emf.ecore.ETypeParameter m_eTypeParameter;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter> m_featureETypeParameterBuilder;
  private org.eclipse.emf.ecore.EGenericType m_eUpperBound;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> m_featureEUpperBoundBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EGenericType> m_eTypeArguments = new java.util.LinkedList<org.eclipse.emf.ecore.EGenericType>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType>> m_featureETypeArgumentsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType>>();
  // helper attributes
  private boolean m_featureEClassifierSet = false;
  private boolean m_featureELowerBoundSet = false;
  private boolean m_featureETypeArgumentsSet = false;
  private boolean m_featureETypeParameterSet = false;
  private boolean m_featureEUpperBoundSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEGenericTypeBuilder()
   */
  private EGenericTypeBuilder() {
  }

  /**
   * This method creates a new instance of the EGenericTypeBuilder.
   * @return new instance of the EGenericTypeBuilder
   */
  public static EGenericTypeBuilder newEGenericTypeBuilder() {
    return new EGenericTypeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EGenericTypeBuilder but() {
    EGenericTypeBuilder _builder = newEGenericTypeBuilder();
    _builder.m_featureEClassifierSet = m_featureEClassifierSet;
    _builder.m_eClassifier = m_eClassifier;
    _builder.m_featureEClassifierBuilder = m_featureEClassifierBuilder;
    _builder.m_featureELowerBoundSet = m_featureELowerBoundSet;
    _builder.m_eLowerBound = m_eLowerBound;
    _builder.m_featureELowerBoundBuilder = m_featureELowerBoundBuilder;
    _builder.m_featureETypeArgumentsSet = m_featureETypeArgumentsSet;
    _builder.m_eTypeArguments = m_eTypeArguments;
    _builder.m_featureETypeArgumentsBuilder = m_featureETypeArgumentsBuilder;
    _builder.m_featureETypeParameterSet = m_featureETypeParameterSet;
    _builder.m_eTypeParameter = m_eTypeParameter;
    _builder.m_featureETypeParameterBuilder = m_featureETypeParameterBuilder;
    _builder.m_featureEUpperBoundSet = m_featureEUpperBoundSet;
    _builder.m_eUpperBound = m_eUpperBound;
    _builder.m_featureEUpperBoundBuilder = m_featureEUpperBoundBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EGenericType type.
   * @return new instance of the org.eclipse.emf.ecore.EGenericType type
   */
  public org.eclipse.emf.ecore.EGenericType build() {
    final org.eclipse.emf.ecore.EGenericType _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEGenericType();
    if (m_featureEClassifierSet) {
      _newInstance.setEClassifier(m_eClassifier);
    } else {
      if (m_featureEClassifierBuilder != null) {
        _newInstance.setEClassifier(m_featureEClassifierBuilder.build());
      }
    }
    if (m_featureELowerBoundSet) {
      _newInstance.setELowerBound(m_eLowerBound);
    } else {
      if (m_featureELowerBoundBuilder != null) {
        _newInstance.setELowerBound(m_featureELowerBoundBuilder.build());
      }
    }
    if (m_featureETypeParameterSet) {
      _newInstance.setETypeParameter(m_eTypeParameter);
    } else {
      if (m_featureETypeParameterBuilder != null) {
        _newInstance.setETypeParameter(m_featureETypeParameterBuilder.build());
      }
    }
    if (m_featureEUpperBoundSet) {
      _newInstance.setEUpperBound(m_eUpperBound);
    } else {
      if (m_featureEUpperBoundBuilder != null) {
        _newInstance.setEUpperBound(m_featureEUpperBoundBuilder.build());
      }
    }
    if (m_featureETypeArgumentsSet) {
      _newInstance.getETypeArguments().addAll(m_eTypeArguments);
    } else {
      if (!m_featureETypeArgumentsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> builder : m_featureETypeArgumentsBuilder) {
          _newInstance.getETypeArguments().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public EGenericTypeBuilder withEClassifier(org.eclipse.emf.ecore.EClassifier p_eClassifier) {
    m_eClassifier = p_eClassifier;
    m_featureEClassifierSet = true;
    return this;
  }

  public EGenericTypeBuilder withEClassifier(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> p_eClassifierBuilder) {
    m_featureEClassifierBuilder = p_eClassifierBuilder;
    return this;
  }

  public EGenericTypeBuilder withELowerBound(org.eclipse.emf.ecore.EGenericType p_eLowerBound) {
    m_eLowerBound = p_eLowerBound;
    m_featureELowerBoundSet = true;
    return this;
  }

  public EGenericTypeBuilder withELowerBound(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericTypeBuilder) {
    m_featureELowerBoundBuilder = p_eGenericTypeBuilder;
    return this;
  }

  public EGenericTypeBuilder withETypeParameter(org.eclipse.emf.ecore.ETypeParameter p_eTypeParameter) {
    m_eTypeParameter = p_eTypeParameter;
    m_featureETypeParameterSet = true;
    return this;
  }

  public EGenericTypeBuilder withETypeParameter(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.ETypeParameter> p_eTypeParameterBuilder) {
    m_featureETypeParameterBuilder = p_eTypeParameterBuilder;
    return this;
  }

  public EGenericTypeBuilder withEUpperBound(org.eclipse.emf.ecore.EGenericType p_eUpperBound) {
    m_eUpperBound = p_eUpperBound;
    m_featureEUpperBoundSet = true;
    return this;
  }

  public EGenericTypeBuilder withEUpperBound(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericTypeBuilder) {
    m_featureEUpperBoundBuilder = p_eGenericTypeBuilder;
    return this;
  }

  public EGenericTypeBuilder withETypeArguments(org.eclipse.emf.ecore.EGenericType p_eTypeArguments) {
    m_eTypeArguments.add(p_eTypeArguments);
    m_featureETypeArgumentsSet = true;
    return this;
  }

  public EGenericTypeBuilder withETypeArguments(java.util.Collection<? extends org.eclipse.emf.ecore.EGenericType> p_eTypeArguments) {
    m_eTypeArguments.addAll(p_eTypeArguments);
    m_featureETypeArgumentsSet = true;
    return this;
  }

  public EGenericTypeBuilder withETypeArguments(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EGenericType> p_eGenericTypeBuilder) {
    m_featureETypeArgumentsBuilder.add(p_eGenericTypeBuilder);
    return this;
  }
}
