package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ParameterSet</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ParameterSetBuilder {
  // features and builders
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_condition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureConditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Parameter> m_parameter = new java.util.LinkedList<org.eclipse.uml2.uml.Parameter>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ParameterBuilder> m_featureParameterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ParameterBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConditionSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newParameterSetBuilder()
   */
  private ParameterSetBuilder() {
  }

  /**
   * This method creates a new instance of the ParameterSetBuilder.
   * @return new instance of the ParameterSetBuilder
   */
  public static ParameterSetBuilder newParameterSetBuilder() {
    return new ParameterSetBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ParameterSetBuilder but() {
    ParameterSetBuilder _builder = newParameterSetBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureConditionSet = m_featureConditionSet;
    _builder.m_condition = m_condition;
    _builder.m_featureConditionBuilder = m_featureConditionBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureParameterSet = m_featureParameterSet;
    _builder.m_parameter = m_parameter;
    _builder.m_featureParameterBuilder = m_featureParameterBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ParameterSet type.
   * @return new instance of the org.eclipse.uml2.uml.ParameterSet type
   */
  public org.eclipse.uml2.uml.ParameterSet build() {
    final org.eclipse.uml2.uml.ParameterSet _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createParameterSet();
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
    if (m_featureConditionSet) {
      _newInstance.getConditions().addAll(m_condition);
    } else {
      if (!m_featureConditionBuilder.isEmpty()) {
        for (ConstraintBuilder builder : m_featureConditionBuilder) {
          _newInstance.getConditions().add(builder.build());
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
    if (m_featureParameterSet) {
      _newInstance.getParameters().addAll(m_parameter);
    } else {
      if (!m_featureParameterBuilder.isEmpty()) {
        for (ParameterBuilder builder : m_featureParameterBuilder) {
          _newInstance.getParameters().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ParameterSetBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ParameterSetBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ParameterSetBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ParameterSetBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ParameterSetBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ParameterSetBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ParameterSetBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ParameterSetBuilder withCondition(org.eclipse.uml2.uml.Constraint p_condition) {
    m_condition.add(p_condition);
    m_featureConditionSet = true;
    return this;
  }

  public ParameterSetBuilder withCondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_condition) {
    m_condition.addAll(p_condition);
    m_featureConditionSet = true;
    return this;
  }

  public ParameterSetBuilder withCondition(ConstraintBuilder p_constraintBuilder) {
    m_featureConditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public ParameterSetBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ParameterSetBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ParameterSetBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ParameterSetBuilder withParameter(org.eclipse.uml2.uml.Parameter p_parameter) {
    m_parameter.add(p_parameter);
    m_featureParameterSet = true;
    return this;
  }

  public ParameterSetBuilder withParameter(java.util.Collection<? extends org.eclipse.uml2.uml.Parameter> p_parameter) {
    m_parameter.addAll(p_parameter);
    m_featureParameterSet = true;
    return this;
  }

  public ParameterSetBuilder withParameter(ParameterBuilder p_parameterBuilder) {
    m_featureParameterBuilder.add(p_parameterBuilder);
    return this;
  }
}
