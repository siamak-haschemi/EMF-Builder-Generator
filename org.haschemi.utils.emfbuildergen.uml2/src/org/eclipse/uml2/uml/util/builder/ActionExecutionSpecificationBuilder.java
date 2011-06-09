package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ActionExecutionSpecification</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActionExecutionSpecificationBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Action m_action;
  private org.eclipse.uml2.uml.Interaction m_enclosingInteraction;
  private org.eclipse.uml2.uml.util.builder.InteractionBuilder m_featureEnclosingInteractionBuilder;
  private org.eclipse.uml2.uml.InteractionOperand m_enclosingOperand;
  private org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder m_featureEnclosingOperandBuilder;
  private org.eclipse.uml2.uml.OccurrenceSpecification m_finish;
  private org.eclipse.uml2.uml.util.builder.OccurrenceSpecificationBuilder m_featureFinishBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.OccurrenceSpecification m_start;
  private org.eclipse.uml2.uml.util.builder.OccurrenceSpecificationBuilder m_featureStartBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Lifeline> m_covered = new java.util.LinkedList<org.eclipse.uml2.uml.Lifeline>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.LifelineBuilder> m_featureCoveredBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.LifelineBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralOrdering> m_generalOrdering = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralOrdering>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder> m_featureGeneralOrderingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureActionSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCoveredSet = false;
  private boolean m_featureEnclosingInteractionSet = false;
  private boolean m_featureEnclosingOperandSet = false;
  private boolean m_featureFinishSet = false;
  private boolean m_featureGeneralOrderingSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureStartSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newActionExecutionSpecificationBuilder()
   */
  private ActionExecutionSpecificationBuilder() {
  }

  /**
   * This method creates a new instance of the ActionExecutionSpecificationBuilder.
   * @return new instance of the ActionExecutionSpecificationBuilder
   */
  public static ActionExecutionSpecificationBuilder newActionExecutionSpecificationBuilder() {
    return new ActionExecutionSpecificationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ActionExecutionSpecificationBuilder but() {
    ActionExecutionSpecificationBuilder _builder = newActionExecutionSpecificationBuilder();
    _builder.m_featureActionSet = m_featureActionSet;
    _builder.m_action = m_action;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureCoveredSet = m_featureCoveredSet;
    _builder.m_covered = m_covered;
    _builder.m_featureCoveredBuilder = m_featureCoveredBuilder;
    _builder.m_featureEnclosingInteractionSet = m_featureEnclosingInteractionSet;
    _builder.m_enclosingInteraction = m_enclosingInteraction;
    _builder.m_featureEnclosingInteractionBuilder = m_featureEnclosingInteractionBuilder;
    _builder.m_featureEnclosingOperandSet = m_featureEnclosingOperandSet;
    _builder.m_enclosingOperand = m_enclosingOperand;
    _builder.m_featureEnclosingOperandBuilder = m_featureEnclosingOperandBuilder;
    _builder.m_featureFinishSet = m_featureFinishSet;
    _builder.m_finish = m_finish;
    _builder.m_featureFinishBuilder = m_featureFinishBuilder;
    _builder.m_featureGeneralOrderingSet = m_featureGeneralOrderingSet;
    _builder.m_generalOrdering = m_generalOrdering;
    _builder.m_featureGeneralOrderingBuilder = m_featureGeneralOrderingBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureStartSet = m_featureStartSet;
    _builder.m_start = m_start;
    _builder.m_featureStartBuilder = m_featureStartBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ActionExecutionSpecification type.
   * @return new instance of the org.eclipse.uml2.uml.ActionExecutionSpecification type
   */
  public org.eclipse.uml2.uml.ActionExecutionSpecification build() {
    final org.eclipse.uml2.uml.ActionExecutionSpecification _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createActionExecutionSpecification();
    if (m_featureActionSet) {
      _newInstance.setAction(m_action);
    }
    if (m_featureEnclosingInteractionSet) {
      _newInstance.setEnclosingInteraction(m_enclosingInteraction);
    } else {
      if (m_featureEnclosingInteractionBuilder != null) {
        _newInstance.setEnclosingInteraction(m_featureEnclosingInteractionBuilder.build());
      }
    }
    if (m_featureEnclosingOperandSet) {
      _newInstance.setEnclosingOperand(m_enclosingOperand);
    } else {
      if (m_featureEnclosingOperandBuilder != null) {
        _newInstance.setEnclosingOperand(m_featureEnclosingOperandBuilder.build());
      }
    }
    if (m_featureFinishSet) {
      _newInstance.setFinish(m_finish);
    } else {
      if (m_featureFinishBuilder != null) {
        _newInstance.setFinish(m_featureFinishBuilder.build());
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
    if (m_featureStartSet) {
      _newInstance.setStart(m_start);
    } else {
      if (m_featureStartBuilder != null) {
        _newInstance.setStart(m_featureStartBuilder.build());
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
    if (m_featureCoveredSet) {
      _newInstance.getCovereds().addAll(m_covered);
    } else {
      if (!m_featureCoveredBuilder.isEmpty()) {
        for (LifelineBuilder builder : m_featureCoveredBuilder) {
          _newInstance.getCovereds().add(builder.build());
        }
      }
    }
    if (m_featureGeneralOrderingSet) {
      _newInstance.getGeneralOrderings().addAll(m_generalOrdering);
    } else {
      if (!m_featureGeneralOrderingBuilder.isEmpty()) {
        for (GeneralOrderingBuilder builder : m_featureGeneralOrderingBuilder) {
          _newInstance.getGeneralOrderings().add(builder.build());
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

  public ActionExecutionSpecificationBuilder withAction(org.eclipse.uml2.uml.Action p_action) {
    m_action = p_action;
    m_featureActionSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withEnclosingInteraction(org.eclipse.uml2.uml.Interaction p_enclosingInteraction) {
    m_enclosingInteraction = p_enclosingInteraction;
    m_featureEnclosingInteractionSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withEnclosingInteraction(org.eclipse.uml2.uml.util.builder.InteractionBuilder p_interactionBuilder) {
    m_featureEnclosingInteractionBuilder = p_interactionBuilder;
    return this;
  }

  public ActionExecutionSpecificationBuilder withEnclosingOperand(org.eclipse.uml2.uml.InteractionOperand p_enclosingOperand) {
    m_enclosingOperand = p_enclosingOperand;
    m_featureEnclosingOperandSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withEnclosingOperand(org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder p_interactionOperandBuilder) {
    m_featureEnclosingOperandBuilder = p_interactionOperandBuilder;
    return this;
  }

  public ActionExecutionSpecificationBuilder withFinish(org.eclipse.uml2.uml.OccurrenceSpecification p_finish) {
    m_finish = p_finish;
    m_featureFinishSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withFinish(org.eclipse.uml2.uml.util.builder.OccurrenceSpecificationBuilder p_occurrenceSpecificationBuilder) {
    m_featureFinishBuilder = p_occurrenceSpecificationBuilder;
    return this;
  }

  public ActionExecutionSpecificationBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ActionExecutionSpecificationBuilder withStart(org.eclipse.uml2.uml.OccurrenceSpecification p_start) {
    m_start = p_start;
    m_featureStartSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withStart(org.eclipse.uml2.uml.util.builder.OccurrenceSpecificationBuilder p_occurrenceSpecificationBuilder) {
    m_featureStartBuilder = p_occurrenceSpecificationBuilder;
    return this;
  }

  public ActionExecutionSpecificationBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ActionExecutionSpecificationBuilder withCovered(org.eclipse.uml2.uml.Lifeline p_covered) {
    m_covered.add(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withCovered(java.util.Collection<? extends org.eclipse.uml2.uml.Lifeline> p_covered) {
    m_covered.addAll(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withCovered(LifelineBuilder p_lifelineBuilder) {
    m_featureCoveredBuilder.add(p_lifelineBuilder);
    return this;
  }

  public ActionExecutionSpecificationBuilder withGeneralOrdering(org.eclipse.uml2.uml.GeneralOrdering p_generalOrdering) {
    m_generalOrdering.add(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withGeneralOrdering(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralOrdering> p_generalOrdering) {
    m_generalOrdering.addAll(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withGeneralOrdering(GeneralOrderingBuilder p_generalOrderingBuilder) {
    m_featureGeneralOrderingBuilder.add(p_generalOrderingBuilder);
    return this;
  }

  public ActionExecutionSpecificationBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ActionExecutionSpecificationBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
