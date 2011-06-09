package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Extend</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExtendBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Constraint m_condition;
  private org.eclipse.uml2.uml.util.builder.ConstraintBuilder m_featureConditionBuilder;
  private org.eclipse.uml2.uml.UseCase m_extendedCase;
  private org.eclipse.uml2.uml.util.builder.UseCaseBuilder m_featureExtendedCaseBuilder;
  private org.eclipse.uml2.uml.UseCase m_extension;
  private org.eclipse.uml2.uml.util.builder.UseCaseBuilder m_featureExtensionBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ExtensionPoint> m_extensionLocation = new java.util.LinkedList<org.eclipse.uml2.uml.ExtensionPoint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ExtensionPointBuilder> m_featureExtensionLocationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ExtensionPointBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConditionSet = false;
  private boolean m_featureExtendedCaseSet = false;
  private boolean m_featureExtensionSet = false;
  private boolean m_featureExtensionLocationSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newExtendBuilder()
   */
  private ExtendBuilder() {
  }

  /**
   * This method creates a new instance of the ExtendBuilder.
   * @return new instance of the ExtendBuilder
   */
  public static ExtendBuilder newExtendBuilder() {
    return new ExtendBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ExtendBuilder but() {
    ExtendBuilder _builder = newExtendBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureConditionSet = m_featureConditionSet;
    _builder.m_condition = m_condition;
    _builder.m_featureConditionBuilder = m_featureConditionBuilder;
    _builder.m_featureExtendedCaseSet = m_featureExtendedCaseSet;
    _builder.m_extendedCase = m_extendedCase;
    _builder.m_featureExtendedCaseBuilder = m_featureExtendedCaseBuilder;
    _builder.m_featureExtensionSet = m_featureExtensionSet;
    _builder.m_extension = m_extension;
    _builder.m_featureExtensionBuilder = m_featureExtensionBuilder;
    _builder.m_featureExtensionLocationSet = m_featureExtensionLocationSet;
    _builder.m_extensionLocation = m_extensionLocation;
    _builder.m_featureExtensionLocationBuilder = m_featureExtensionLocationBuilder;
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
   * This method constructs the final org.eclipse.uml2.uml.Extend type.
   * @return new instance of the org.eclipse.uml2.uml.Extend type
   */
  public org.eclipse.uml2.uml.Extend build() {
    final org.eclipse.uml2.uml.Extend _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createExtend();
    if (m_featureConditionSet) {
      _newInstance.setCondition(m_condition);
    } else {
      if (m_featureConditionBuilder != null) {
        _newInstance.setCondition(m_featureConditionBuilder.build());
      }
    }
    if (m_featureExtendedCaseSet) {
      _newInstance.setExtendedCase(m_extendedCase);
    } else {
      if (m_featureExtendedCaseBuilder != null) {
        _newInstance.setExtendedCase(m_featureExtendedCaseBuilder.build());
      }
    }
    if (m_featureExtensionSet) {
      _newInstance.setExtension(m_extension);
    } else {
      if (m_featureExtensionBuilder != null) {
        _newInstance.setExtension(m_featureExtensionBuilder.build());
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
    if (m_featureExtensionLocationSet) {
      _newInstance.getExtensionLocations().addAll(m_extensionLocation);
    } else {
      if (!m_featureExtensionLocationBuilder.isEmpty()) {
        for (ExtensionPointBuilder builder : m_featureExtensionLocationBuilder) {
          _newInstance.getExtensionLocations().add(builder.build());
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

  public ExtendBuilder withCondition(org.eclipse.uml2.uml.Constraint p_condition) {
    m_condition = p_condition;
    m_featureConditionSet = true;
    return this;
  }

  public ExtendBuilder withCondition(org.eclipse.uml2.uml.util.builder.ConstraintBuilder p_constraintBuilder) {
    m_featureConditionBuilder = p_constraintBuilder;
    return this;
  }

  public ExtendBuilder withExtendedCase(org.eclipse.uml2.uml.UseCase p_extendedCase) {
    m_extendedCase = p_extendedCase;
    m_featureExtendedCaseSet = true;
    return this;
  }

  public ExtendBuilder withExtendedCase(org.eclipse.uml2.uml.util.builder.UseCaseBuilder p_useCaseBuilder) {
    m_featureExtendedCaseBuilder = p_useCaseBuilder;
    return this;
  }

  public ExtendBuilder withExtension(org.eclipse.uml2.uml.UseCase p_extension) {
    m_extension = p_extension;
    m_featureExtensionSet = true;
    return this;
  }

  public ExtendBuilder withExtension(org.eclipse.uml2.uml.util.builder.UseCaseBuilder p_useCaseBuilder) {
    m_featureExtensionBuilder = p_useCaseBuilder;
    return this;
  }

  public ExtendBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ExtendBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ExtendBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ExtendBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ExtendBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ExtendBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ExtendBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ExtendBuilder withExtensionLocation(org.eclipse.uml2.uml.ExtensionPoint p_extensionLocation) {
    m_extensionLocation.add(p_extensionLocation);
    m_featureExtensionLocationSet = true;
    return this;
  }

  public ExtendBuilder withExtensionLocation(java.util.Collection<? extends org.eclipse.uml2.uml.ExtensionPoint> p_extensionLocation) {
    m_extensionLocation.addAll(p_extensionLocation);
    m_featureExtensionLocationSet = true;
    return this;
  }

  public ExtendBuilder withExtensionLocation(ExtensionPointBuilder p_extensionPointBuilder) {
    m_featureExtensionLocationBuilder.add(p_extensionPointBuilder);
    return this;
  }

  public ExtendBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ExtendBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ExtendBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
