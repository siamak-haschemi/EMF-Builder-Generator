package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class LifelineBuilder {
  // features and builders
  private org.eclipse.uml2.uml.PartDecomposition m_decomposedAs;
  private org.eclipse.uml2.uml.util.builder.PartDecompositionBuilder m_featureDecomposedAsBuilder;
  private org.eclipse.uml2.uml.Interaction m_interaction;
  private org.eclipse.uml2.uml.util.builder.InteractionBuilder m_featureInteractionBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.ConnectableElement m_represents;
  private org.eclipse.uml2.uml.ValueSpecification m_selector;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.InteractionFragment> m_coveredBy = new java.util.LinkedList<org.eclipse.uml2.uml.InteractionFragment>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCoveredBySet = false;
  private boolean m_featureDecomposedAsSet = false;
  private boolean m_featureInteractionSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRepresentsSet = false;
  private boolean m_featureSelectorSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newLifelineBuilder()
   */
  private LifelineBuilder() {
  }

  /**
   * This method creates a new instance of the LifelineBuilder.
   * @return new instance of the LifelineBuilder
   */
  public static LifelineBuilder newLifelineBuilder() {
    return new LifelineBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public LifelineBuilder but() {
    LifelineBuilder _builder = newLifelineBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureCoveredBySet = m_featureCoveredBySet;
    _builder.m_coveredBy = m_coveredBy;
    _builder.m_featureDecomposedAsSet = m_featureDecomposedAsSet;
    _builder.m_decomposedAs = m_decomposedAs;
    _builder.m_featureDecomposedAsBuilder = m_featureDecomposedAsBuilder;
    _builder.m_featureInteractionSet = m_featureInteractionSet;
    _builder.m_interaction = m_interaction;
    _builder.m_featureInteractionBuilder = m_featureInteractionBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureRepresentsSet = m_featureRepresentsSet;
    _builder.m_represents = m_represents;
    _builder.m_featureSelectorSet = m_featureSelectorSet;
    _builder.m_selector = m_selector;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Lifeline type.
   * @return new instance of the org.eclipse.uml2.uml.Lifeline type
   */
  public org.eclipse.uml2.uml.Lifeline build() {
    final org.eclipse.uml2.uml.Lifeline _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createLifeline();
    if (m_featureDecomposedAsSet) {
      _newInstance.setDecomposedAs(m_decomposedAs);
    } else {
      if (m_featureDecomposedAsBuilder != null) {
        _newInstance.setDecomposedAs(m_featureDecomposedAsBuilder.build());
      }
    }
    if (m_featureInteractionSet) {
      _newInstance.setInteraction(m_interaction);
    } else {
      if (m_featureInteractionBuilder != null) {
        _newInstance.setInteraction(m_featureInteractionBuilder.build());
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
    if (m_featureRepresentsSet) {
      _newInstance.setRepresents(m_represents);
    }
    if (m_featureSelectorSet) {
      _newInstance.setSelector(m_selector);
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
    if (m_featureCoveredBySet) {
      _newInstance.getCoveredBys().addAll(m_coveredBy);
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

  public LifelineBuilder withDecomposedAs(org.eclipse.uml2.uml.PartDecomposition p_decomposedAs) {
    m_decomposedAs = p_decomposedAs;
    m_featureDecomposedAsSet = true;
    return this;
  }

  public LifelineBuilder withDecomposedAs(org.eclipse.uml2.uml.util.builder.PartDecompositionBuilder p_partDecompositionBuilder) {
    m_featureDecomposedAsBuilder = p_partDecompositionBuilder;
    return this;
  }

  public LifelineBuilder withInteraction(org.eclipse.uml2.uml.Interaction p_interaction) {
    m_interaction = p_interaction;
    m_featureInteractionSet = true;
    return this;
  }

  public LifelineBuilder withInteraction(org.eclipse.uml2.uml.util.builder.InteractionBuilder p_interactionBuilder) {
    m_featureInteractionBuilder = p_interactionBuilder;
    return this;
  }

  public LifelineBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public LifelineBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public LifelineBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public LifelineBuilder withRepresents(org.eclipse.uml2.uml.ConnectableElement p_represents) {
    m_represents = p_represents;
    m_featureRepresentsSet = true;
    return this;
  }

  public LifelineBuilder withSelector(org.eclipse.uml2.uml.ValueSpecification p_selector) {
    m_selector = p_selector;
    m_featureSelectorSet = true;
    return this;
  }

  public LifelineBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public LifelineBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public LifelineBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public LifelineBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public LifelineBuilder withCoveredBy(org.eclipse.uml2.uml.InteractionFragment p_coveredBy) {
    m_coveredBy.add(p_coveredBy);
    m_featureCoveredBySet = true;
    return this;
  }

  public LifelineBuilder withCoveredBy(java.util.Collection<? extends org.eclipse.uml2.uml.InteractionFragment> p_coveredBy) {
    m_coveredBy.addAll(p_coveredBy);
    m_featureCoveredBySet = true;
    return this;
  }

  public LifelineBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public LifelineBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public LifelineBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
