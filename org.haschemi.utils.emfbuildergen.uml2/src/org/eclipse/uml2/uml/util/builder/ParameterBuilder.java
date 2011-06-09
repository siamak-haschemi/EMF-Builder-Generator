package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Parameter</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ParameterBuilder {
  // features and builders
  private org.eclipse.uml2.uml.ValueSpecification m_defaultValue;
  private org.eclipse.uml2.uml.ParameterDirectionKind m_direction;
  private org.eclipse.uml2.uml.ParameterEffectKind m_effect;
  private Boolean m_isException;
  private Boolean m_isOrdered;
  private Boolean m_isStream;
  private Boolean m_isUnique;
  private org.eclipse.uml2.uml.ValueSpecification m_lowerValue;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.Type m_type;
  private org.eclipse.uml2.uml.ValueSpecification m_upperValue;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ParameterSet> m_parameterSet = new java.util.LinkedList<org.eclipse.uml2.uml.ParameterSet>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ParameterSetBuilder> m_featureParameterSetBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ParameterSetBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureDefaultValueSet = false;
  private boolean m_featureDirectionSet = false;
  private boolean m_featureEffectSet = false;
  private boolean m_featureIsExceptionSet = false;
  private boolean m_featureIsOrderedSet = false;
  private boolean m_featureIsStreamSet = false;
  private boolean m_featureIsUniqueSet = false;
  private boolean m_featureLowerValueSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureParameterSetSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureUpperValueSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newParameterBuilder()
   */
  private ParameterBuilder() {
  }

  /**
   * This method creates a new instance of the ParameterBuilder.
   * @return new instance of the ParameterBuilder
   */
  public static ParameterBuilder newParameterBuilder() {
    return new ParameterBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ParameterBuilder but() {
    ParameterBuilder _builder = newParameterBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureDefaultValueSet = m_featureDefaultValueSet;
    _builder.m_defaultValue = m_defaultValue;
    _builder.m_featureDirectionSet = m_featureDirectionSet;
    _builder.m_direction = m_direction;
    _builder.m_featureEffectSet = m_featureEffectSet;
    _builder.m_effect = m_effect;
    _builder.m_featureIsExceptionSet = m_featureIsExceptionSet;
    _builder.m_isException = m_isException;
    _builder.m_featureIsOrderedSet = m_featureIsOrderedSet;
    _builder.m_isOrdered = m_isOrdered;
    _builder.m_featureIsStreamSet = m_featureIsStreamSet;
    _builder.m_isStream = m_isStream;
    _builder.m_featureIsUniqueSet = m_featureIsUniqueSet;
    _builder.m_isUnique = m_isUnique;
    _builder.m_featureLowerValueSet = m_featureLowerValueSet;
    _builder.m_lowerValue = m_lowerValue;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featureParameterSetSet = m_featureParameterSetSet;
    _builder.m_parameterSet = m_parameterSet;
    _builder.m_featureParameterSetBuilder = m_featureParameterSetBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureUpperValueSet = m_featureUpperValueSet;
    _builder.m_upperValue = m_upperValue;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Parameter type.
   * @return new instance of the org.eclipse.uml2.uml.Parameter type
   */
  public org.eclipse.uml2.uml.Parameter build() {
    final org.eclipse.uml2.uml.Parameter _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createParameter();
    if (m_featureDefaultValueSet) {
      _newInstance.setDefaultValue(m_defaultValue);
    }
    if (m_featureDirectionSet) {
      _newInstance.setDirection(m_direction);
    }
    if (m_featureEffectSet) {
      _newInstance.setEffect(m_effect);
    }
    if (m_featureIsExceptionSet) {
      _newInstance.setIsException(m_isException);
    }
    if (m_featureIsOrderedSet) {
      _newInstance.setIsOrdered(m_isOrdered);
    }
    if (m_featureIsStreamSet) {
      _newInstance.setIsStream(m_isStream);
    }
    if (m_featureIsUniqueSet) {
      _newInstance.setIsUnique(m_isUnique);
    }
    if (m_featureLowerValueSet) {
      _newInstance.setLowerValue(m_lowerValue);
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureNameExpressionSet) {
      _newInstance.setNameExpression(m_nameExpression);
    } else {
      if (m_featureNameExpressionBuilder != null) {
        _newInstance.setNameExpression(m_featureNameExpressionBuilder.build());
      }
    }
    if (m_featureOwningTemplateParameterSet) {
      _newInstance.setOwningTemplateParameter(m_owningTemplateParameter);
    } else {
      if (m_featureOwningTemplateParameterBuilder != null) {
        _newInstance.setOwningTemplateParameter(m_featureOwningTemplateParameterBuilder.build());
      }
    }
    if (m_featureTemplateParameterSet) {
      _newInstance.setTemplateParameter(m_templateParameter);
    } else {
      if (m_featureTemplateParameterBuilder != null) {
        _newInstance.setTemplateParameter(m_featureTemplateParameterBuilder.build());
      }
    }
    if (m_featureTypeSet) {
      _newInstance.setType(m_type);
    }
    if (m_featureUpperValueSet) {
      _newInstance.setUpperValue(m_upperValue);
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureClientDependencySet) {
      _newInstance.getClientDependencies().addAll(m_clientDependency);
    } else {
      if (!m_featureClientDependencyBuilder.isEmpty()) {
        for (DependencyBuilder builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (CommentBuilder builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    if (m_featureParameterSetSet) {
      _newInstance.getParameterSets().addAll(m_parameterSet);
    } else {
      if (!m_featureParameterSetBuilder.isEmpty()) {
        for (ParameterSetBuilder builder : m_featureParameterSetBuilder) {
          _newInstance.getParameterSets().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ParameterBuilder withDefaultValue(org.eclipse.uml2.uml.ValueSpecification p_defaultValue) {
    m_defaultValue = p_defaultValue;
    m_featureDefaultValueSet = true;
    return this;
  }

  public ParameterBuilder withDirection(org.eclipse.uml2.uml.ParameterDirectionKind p_direction) {
    m_direction = p_direction;
    m_featureDirectionSet = true;
    return this;
  }

  public ParameterBuilder withEffect(org.eclipse.uml2.uml.ParameterEffectKind p_effect) {
    m_effect = p_effect;
    m_featureEffectSet = true;
    return this;
  }

  public ParameterBuilder withIsException(Boolean p_isException) {
    m_isException = p_isException;
    m_featureIsExceptionSet = true;
    return this;
  }

  public ParameterBuilder withIsOrdered(Boolean p_isOrdered) {
    m_isOrdered = p_isOrdered;
    m_featureIsOrderedSet = true;
    return this;
  }

  public ParameterBuilder withIsStream(Boolean p_isStream) {
    m_isStream = p_isStream;
    m_featureIsStreamSet = true;
    return this;
  }

  public ParameterBuilder withIsUnique(Boolean p_isUnique) {
    m_isUnique = p_isUnique;
    m_featureIsUniqueSet = true;
    return this;
  }

  public ParameterBuilder withLowerValue(org.eclipse.uml2.uml.ValueSpecification p_lowerValue) {
    m_lowerValue = p_lowerValue;
    m_featureLowerValueSet = true;
    return this;
  }

  public ParameterBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ParameterBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ParameterBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ParameterBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public ParameterBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public ParameterBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public ParameterBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public ParameterBuilder withType(org.eclipse.uml2.uml.Type p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public ParameterBuilder withUpperValue(org.eclipse.uml2.uml.ValueSpecification p_upperValue) {
    m_upperValue = p_upperValue;
    m_featureUpperValueSet = true;
    return this;
  }

  public ParameterBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ParameterBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ParameterBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ParameterBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ParameterBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ParameterBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ParameterBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ParameterBuilder withParameterSet(org.eclipse.uml2.uml.ParameterSet p_parameterSet) {
    m_parameterSet.add(p_parameterSet);
    m_featureParameterSetSet = true;
    return this;
  }

  public ParameterBuilder withParameterSet(java.util.Collection<? extends org.eclipse.uml2.uml.ParameterSet> p_parameterSet) {
    m_parameterSet.addAll(p_parameterSet);
    m_featureParameterSetSet = true;
    return this;
  }

  public ParameterBuilder withParameterSet(ParameterSetBuilder p_parameterSetBuilder) {
    m_featureParameterSetBuilder.add(p_parameterSetBuilder);
    return this;
  }
}
