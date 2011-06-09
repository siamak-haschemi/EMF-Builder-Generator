package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.CollaborationUse</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CollaborationUseBuilder {
  // features and builders
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.Collaboration m_type;
  private org.eclipse.uml2.uml.util.builder.CollaborationBuilder m_featureTypeBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_roleBinding = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureRoleBindingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRoleBindingSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newCollaborationUseBuilder()
   */
  private CollaborationUseBuilder() {
  }

  /**
   * This method creates a new instance of the CollaborationUseBuilder.
   * @return new instance of the CollaborationUseBuilder
   */
  public static CollaborationUseBuilder newCollaborationUseBuilder() {
    return new CollaborationUseBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public CollaborationUseBuilder but() {
    CollaborationUseBuilder _builder = newCollaborationUseBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureRoleBindingSet = m_featureRoleBindingSet;
    _builder.m_roleBinding = m_roleBinding;
    _builder.m_featureRoleBindingBuilder = m_featureRoleBindingBuilder;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureTypeBuilder = m_featureTypeBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.CollaborationUse type.
   * @return new instance of the org.eclipse.uml2.uml.CollaborationUse type
   */
  public org.eclipse.uml2.uml.CollaborationUse build() {
    final org.eclipse.uml2.uml.CollaborationUse _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createCollaborationUse();
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
    if (m_featureTypeSet) {
      _newInstance.setType(m_type);
    } else {
      if (m_featureTypeBuilder != null) {
        _newInstance.setType(m_featureTypeBuilder.build());
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
    if (m_featureRoleBindingSet) {
      _newInstance.getRoleBindings().addAll(m_roleBinding);
    } else {
      if (!m_featureRoleBindingBuilder.isEmpty()) {
        for (DependencyBuilder builder : m_featureRoleBindingBuilder) {
          _newInstance.getRoleBindings().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public CollaborationUseBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public CollaborationUseBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public CollaborationUseBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public CollaborationUseBuilder withType(org.eclipse.uml2.uml.Collaboration p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public CollaborationUseBuilder withType(org.eclipse.uml2.uml.util.builder.CollaborationBuilder p_collaborationBuilder) {
    m_featureTypeBuilder = p_collaborationBuilder;
    return this;
  }

  public CollaborationUseBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public CollaborationUseBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public CollaborationUseBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public CollaborationUseBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public CollaborationUseBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public CollaborationUseBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public CollaborationUseBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public CollaborationUseBuilder withRoleBinding(org.eclipse.uml2.uml.Dependency p_roleBinding) {
    m_roleBinding.add(p_roleBinding);
    m_featureRoleBindingSet = true;
    return this;
  }

  public CollaborationUseBuilder withRoleBinding(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_roleBinding) {
    m_roleBinding.addAll(p_roleBinding);
    m_featureRoleBindingSet = true;
    return this;
  }

  public CollaborationUseBuilder withRoleBinding(DependencyBuilder p_dependencyBuilder) {
    m_featureRoleBindingBuilder.add(p_dependencyBuilder);
    return this;
  }
}
