package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.MessageOccurrenceSpecification</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MessageOccurrenceSpecificationBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Interaction m_enclosingInteraction;
  private org.eclipse.uml2.uml.util.builder.InteractionBuilder m_featureEnclosingInteractionBuilder;
  private org.eclipse.uml2.uml.InteractionOperand m_enclosingOperand;
  private org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder m_featureEnclosingOperandBuilder;
  private org.eclipse.uml2.uml.Event m_event;
  private org.eclipse.uml2.uml.Message m_message;
  private org.eclipse.uml2.uml.util.builder.MessageBuilder m_featureMessageBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Lifeline> m_covered = new java.util.LinkedList<org.eclipse.uml2.uml.Lifeline>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.LifelineBuilder> m_featureCoveredBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.LifelineBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralOrdering> m_generalOrdering = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralOrdering>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder> m_featureGeneralOrderingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralOrdering> m_toAfter = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralOrdering>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder> m_featureToAfterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralOrdering> m_toBefore = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralOrdering>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder> m_featureToBeforeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCoveredSet = false;
  private boolean m_featureEnclosingInteractionSet = false;
  private boolean m_featureEnclosingOperandSet = false;
  private boolean m_featureEventSet = false;
  private boolean m_featureGeneralOrderingSet = false;
  private boolean m_featureMessageSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureToAfterSet = false;
  private boolean m_featureToBeforeSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newMessageOccurrenceSpecificationBuilder()
   */
  private MessageOccurrenceSpecificationBuilder() {
  }

  /**
   * This method creates a new instance of the MessageOccurrenceSpecificationBuilder.
   * @return new instance of the MessageOccurrenceSpecificationBuilder
   */
  public static MessageOccurrenceSpecificationBuilder newMessageOccurrenceSpecificationBuilder() {
    return new MessageOccurrenceSpecificationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public MessageOccurrenceSpecificationBuilder but() {
    MessageOccurrenceSpecificationBuilder _builder = newMessageOccurrenceSpecificationBuilder();
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
    _builder.m_featureEventSet = m_featureEventSet;
    _builder.m_event = m_event;
    _builder.m_featureGeneralOrderingSet = m_featureGeneralOrderingSet;
    _builder.m_generalOrdering = m_generalOrdering;
    _builder.m_featureGeneralOrderingBuilder = m_featureGeneralOrderingBuilder;
    _builder.m_featureMessageSet = m_featureMessageSet;
    _builder.m_message = m_message;
    _builder.m_featureMessageBuilder = m_featureMessageBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureToAfterSet = m_featureToAfterSet;
    _builder.m_toAfter = m_toAfter;
    _builder.m_featureToAfterBuilder = m_featureToAfterBuilder;
    _builder.m_featureToBeforeSet = m_featureToBeforeSet;
    _builder.m_toBefore = m_toBefore;
    _builder.m_featureToBeforeBuilder = m_featureToBeforeBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.MessageOccurrenceSpecification type.
   * @return new instance of the org.eclipse.uml2.uml.MessageOccurrenceSpecification type
   */
  public org.eclipse.uml2.uml.MessageOccurrenceSpecification build() {
    final org.eclipse.uml2.uml.MessageOccurrenceSpecification _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
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
    if (m_featureEventSet) {
      _newInstance.setEvent(m_event);
    }
    if (m_featureMessageSet) {
      _newInstance.setMessage(m_message);
    } else {
      if (m_featureMessageBuilder != null) {
        _newInstance.setMessage(m_featureMessageBuilder.build());
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
    if (m_featureToAfterSet) {
      _newInstance.getToAfters().addAll(m_toAfter);
    } else {
      if (!m_featureToAfterBuilder.isEmpty()) {
        for (GeneralOrderingBuilder builder : m_featureToAfterBuilder) {
          _newInstance.getToAfters().add(builder.build());
        }
      }
    }
    if (m_featureToBeforeSet) {
      _newInstance.getToBefores().addAll(m_toBefore);
    } else {
      if (!m_featureToBeforeBuilder.isEmpty()) {
        for (GeneralOrderingBuilder builder : m_featureToBeforeBuilder) {
          _newInstance.getToBefores().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public MessageOccurrenceSpecificationBuilder withEnclosingInteraction(org.eclipse.uml2.uml.Interaction p_enclosingInteraction) {
    m_enclosingInteraction = p_enclosingInteraction;
    m_featureEnclosingInteractionSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withEnclosingInteraction(org.eclipse.uml2.uml.util.builder.InteractionBuilder p_interactionBuilder) {
    m_featureEnclosingInteractionBuilder = p_interactionBuilder;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withEnclosingOperand(org.eclipse.uml2.uml.InteractionOperand p_enclosingOperand) {
    m_enclosingOperand = p_enclosingOperand;
    m_featureEnclosingOperandSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withEnclosingOperand(org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder p_interactionOperandBuilder) {
    m_featureEnclosingOperandBuilder = p_interactionOperandBuilder;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withEvent(org.eclipse.uml2.uml.Event p_event) {
    m_event = p_event;
    m_featureEventSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withMessage(org.eclipse.uml2.uml.Message p_message) {
    m_message = p_message;
    m_featureMessageSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withMessage(org.eclipse.uml2.uml.util.builder.MessageBuilder p_messageBuilder) {
    m_featureMessageBuilder = p_messageBuilder;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withCovered(org.eclipse.uml2.uml.Lifeline p_covered) {
    m_covered.add(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withCovered(java.util.Collection<? extends org.eclipse.uml2.uml.Lifeline> p_covered) {
    m_covered.addAll(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withCovered(LifelineBuilder p_lifelineBuilder) {
    m_featureCoveredBuilder.add(p_lifelineBuilder);
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withGeneralOrdering(org.eclipse.uml2.uml.GeneralOrdering p_generalOrdering) {
    m_generalOrdering.add(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withGeneralOrdering(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralOrdering> p_generalOrdering) {
    m_generalOrdering.addAll(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withGeneralOrdering(GeneralOrderingBuilder p_generalOrderingBuilder) {
    m_featureGeneralOrderingBuilder.add(p_generalOrderingBuilder);
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withToAfter(org.eclipse.uml2.uml.GeneralOrdering p_toAfter) {
    m_toAfter.add(p_toAfter);
    m_featureToAfterSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withToAfter(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralOrdering> p_toAfter) {
    m_toAfter.addAll(p_toAfter);
    m_featureToAfterSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withToAfter(GeneralOrderingBuilder p_generalOrderingBuilder) {
    m_featureToAfterBuilder.add(p_generalOrderingBuilder);
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withToBefore(org.eclipse.uml2.uml.GeneralOrdering p_toBefore) {
    m_toBefore.add(p_toBefore);
    m_featureToBeforeSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withToBefore(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralOrdering> p_toBefore) {
    m_toBefore.addAll(p_toBefore);
    m_featureToBeforeSet = true;
    return this;
  }

  public MessageOccurrenceSpecificationBuilder withToBefore(GeneralOrderingBuilder p_generalOrderingBuilder) {
    m_featureToBeforeBuilder.add(p_generalOrderingBuilder);
    return this;
  }
}
