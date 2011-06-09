package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Include</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class IncludeBuilder {
  // features and builders
  private org.eclipse.uml2.uml.UseCase m_addition;
  private org.eclipse.uml2.uml.util.builder.UseCaseBuilder m_featureAdditionBuilder;
  private org.eclipse.uml2.uml.UseCase m_includingCase;
  private org.eclipse.uml2.uml.util.builder.UseCaseBuilder m_featureIncludingCaseBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureAdditionSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureIncludingCaseSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newIncludeBuilder()
   */
  private IncludeBuilder() {
  }

  /**
   * This method creates a new instance of the IncludeBuilder.
   * @return new instance of the IncludeBuilder
   */
  public static IncludeBuilder newIncludeBuilder() {
    return new IncludeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public IncludeBuilder but() {
    IncludeBuilder _builder = newIncludeBuilder();
    _builder.m_featureAdditionSet = m_featureAdditionSet;
    _builder.m_addition = m_addition;
    _builder.m_featureAdditionBuilder = m_featureAdditionBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureIncludingCaseSet = m_featureIncludingCaseSet;
    _builder.m_includingCase = m_includingCase;
    _builder.m_featureIncludingCaseBuilder = m_featureIncludingCaseBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Include type.
   * @return new instance of the org.eclipse.uml2.uml.Include type
   */
  public org.eclipse.uml2.uml.Include build() {
    final org.eclipse.uml2.uml.Include _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInclude();
    if (m_featureAdditionSet) {
      _newInstance.setAddition(m_addition);
    } else {
      if (m_featureAdditionBuilder != null) {
        _newInstance.setAddition(m_featureAdditionBuilder.build());
      }
    }
    if (m_featureIncludingCaseSet) {
      _newInstance.setIncludingCase(m_includingCase);
    } else {
      if (m_featureIncludingCaseBuilder != null) {
        _newInstance.setIncludingCase(m_featureIncludingCaseBuilder.build());
      }
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
    return _newInstance;
  }

  public IncludeBuilder withAddition(org.eclipse.uml2.uml.UseCase p_addition) {
    m_addition = p_addition;
    m_featureAdditionSet = true;
    return this;
  }

  public IncludeBuilder withAddition(org.eclipse.uml2.uml.util.builder.UseCaseBuilder p_useCaseBuilder) {
    m_featureAdditionBuilder = p_useCaseBuilder;
    return this;
  }

  public IncludeBuilder withIncludingCase(org.eclipse.uml2.uml.UseCase p_includingCase) {
    m_includingCase = p_includingCase;
    m_featureIncludingCaseSet = true;
    return this;
  }

  public IncludeBuilder withIncludingCase(org.eclipse.uml2.uml.util.builder.UseCaseBuilder p_useCaseBuilder) {
    m_featureIncludingCaseBuilder = p_useCaseBuilder;
    return this;
  }

  public IncludeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public IncludeBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public IncludeBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public IncludeBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public IncludeBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public IncludeBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public IncludeBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public IncludeBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public IncludeBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public IncludeBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
