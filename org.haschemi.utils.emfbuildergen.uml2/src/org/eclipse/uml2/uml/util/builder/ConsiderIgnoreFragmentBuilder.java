package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ConsiderIgnoreFragment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConsiderIgnoreFragmentBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Interaction m_enclosingInteraction;
  private org.eclipse.uml2.uml.util.builder.InteractionBuilder m_featureEnclosingInteractionBuilder;
  private org.eclipse.uml2.uml.InteractionOperand m_enclosingOperand;
  private org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder m_featureEnclosingOperandBuilder;
  private org.eclipse.uml2.uml.InteractionOperatorKind m_interactionOperator;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Gate> m_cfragmentGate = new java.util.LinkedList<org.eclipse.uml2.uml.Gate>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GateBuilder> m_featureCfragmentGateBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GateBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Lifeline> m_covered = new java.util.LinkedList<org.eclipse.uml2.uml.Lifeline>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.LifelineBuilder> m_featureCoveredBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.LifelineBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralOrdering> m_generalOrdering = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralOrdering>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder> m_featureGeneralOrderingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.NamedElement> m_message = new java.util.LinkedList<org.eclipse.uml2.uml.NamedElement>();
  private java.util.Collection<org.eclipse.uml2.uml.InteractionOperand> m_operand = new java.util.LinkedList<org.eclipse.uml2.uml.InteractionOperand>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder> m_featureOperandBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureCfragmentGateSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCoveredSet = false;
  private boolean m_featureEnclosingInteractionSet = false;
  private boolean m_featureEnclosingOperandSet = false;
  private boolean m_featureGeneralOrderingSet = false;
  private boolean m_featureInteractionOperatorSet = false;
  private boolean m_featureMessageSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOperandSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newConsiderIgnoreFragmentBuilder()
   */
  private ConsiderIgnoreFragmentBuilder() {
  }

  /**
   * This method creates a new instance of the ConsiderIgnoreFragmentBuilder.
   * @return new instance of the ConsiderIgnoreFragmentBuilder
   */
  public static ConsiderIgnoreFragmentBuilder newConsiderIgnoreFragmentBuilder() {
    return new ConsiderIgnoreFragmentBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ConsiderIgnoreFragmentBuilder but() {
    ConsiderIgnoreFragmentBuilder _builder = newConsiderIgnoreFragmentBuilder();
    _builder.m_featureCfragmentGateSet = m_featureCfragmentGateSet;
    _builder.m_cfragmentGate = m_cfragmentGate;
    _builder.m_featureCfragmentGateBuilder = m_featureCfragmentGateBuilder;
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
    _builder.m_featureGeneralOrderingSet = m_featureGeneralOrderingSet;
    _builder.m_generalOrdering = m_generalOrdering;
    _builder.m_featureGeneralOrderingBuilder = m_featureGeneralOrderingBuilder;
    _builder.m_featureInteractionOperatorSet = m_featureInteractionOperatorSet;
    _builder.m_interactionOperator = m_interactionOperator;
    _builder.m_featureMessageSet = m_featureMessageSet;
    _builder.m_message = m_message;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOperandSet = m_featureOperandSet;
    _builder.m_operand = m_operand;
    _builder.m_featureOperandBuilder = m_featureOperandBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ConsiderIgnoreFragment type.
   * @return new instance of the org.eclipse.uml2.uml.ConsiderIgnoreFragment type
   */
  public org.eclipse.uml2.uml.ConsiderIgnoreFragment build() {
    final org.eclipse.uml2.uml.ConsiderIgnoreFragment _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createConsiderIgnoreFragment();
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
    if (m_featureInteractionOperatorSet) {
      _newInstance.setInteractionOperator(m_interactionOperator);
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
    if (m_featureCfragmentGateSet) {
      _newInstance.getCfragmentGates().addAll(m_cfragmentGate);
    } else {
      if (!m_featureCfragmentGateBuilder.isEmpty()) {
        for (GateBuilder builder : m_featureCfragmentGateBuilder) {
          _newInstance.getCfragmentGates().add(builder.build());
        }
      }
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
    if (m_featureMessageSet) {
      _newInstance.getMessages().addAll(m_message);
    }
    if (m_featureOperandSet) {
      _newInstance.getOperands().addAll(m_operand);
    } else {
      if (!m_featureOperandBuilder.isEmpty()) {
        for (InteractionOperandBuilder builder : m_featureOperandBuilder) {
          _newInstance.getOperands().add(builder.build());
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

  public ConsiderIgnoreFragmentBuilder withEnclosingInteraction(org.eclipse.uml2.uml.Interaction p_enclosingInteraction) {
    m_enclosingInteraction = p_enclosingInteraction;
    m_featureEnclosingInteractionSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withEnclosingInteraction(org.eclipse.uml2.uml.util.builder.InteractionBuilder p_interactionBuilder) {
    m_featureEnclosingInteractionBuilder = p_interactionBuilder;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withEnclosingOperand(org.eclipse.uml2.uml.InteractionOperand p_enclosingOperand) {
    m_enclosingOperand = p_enclosingOperand;
    m_featureEnclosingOperandSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withEnclosingOperand(org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder p_interactionOperandBuilder) {
    m_featureEnclosingOperandBuilder = p_interactionOperandBuilder;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withInteractionOperator(org.eclipse.uml2.uml.InteractionOperatorKind p_interactionOperator) {
    m_interactionOperator = p_interactionOperator;
    m_featureInteractionOperatorSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withCfragmentGate(org.eclipse.uml2.uml.Gate p_cfragmentGate) {
    m_cfragmentGate.add(p_cfragmentGate);
    m_featureCfragmentGateSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withCfragmentGate(java.util.Collection<? extends org.eclipse.uml2.uml.Gate> p_cfragmentGate) {
    m_cfragmentGate.addAll(p_cfragmentGate);
    m_featureCfragmentGateSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withCfragmentGate(GateBuilder p_gateBuilder) {
    m_featureCfragmentGateBuilder.add(p_gateBuilder);
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withCovered(org.eclipse.uml2.uml.Lifeline p_covered) {
    m_covered.add(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withCovered(java.util.Collection<? extends org.eclipse.uml2.uml.Lifeline> p_covered) {
    m_covered.addAll(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withCovered(LifelineBuilder p_lifelineBuilder) {
    m_featureCoveredBuilder.add(p_lifelineBuilder);
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withGeneralOrdering(org.eclipse.uml2.uml.GeneralOrdering p_generalOrdering) {
    m_generalOrdering.add(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withGeneralOrdering(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralOrdering> p_generalOrdering) {
    m_generalOrdering.addAll(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withGeneralOrdering(GeneralOrderingBuilder p_generalOrderingBuilder) {
    m_featureGeneralOrderingBuilder.add(p_generalOrderingBuilder);
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withMessage(org.eclipse.uml2.uml.NamedElement p_message) {
    m_message.add(p_message);
    m_featureMessageSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withMessage(java.util.Collection<? extends org.eclipse.uml2.uml.NamedElement> p_message) {
    m_message.addAll(p_message);
    m_featureMessageSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withOperand(org.eclipse.uml2.uml.InteractionOperand p_operand) {
    m_operand.add(p_operand);
    m_featureOperandSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withOperand(java.util.Collection<? extends org.eclipse.uml2.uml.InteractionOperand> p_operand) {
    m_operand.addAll(p_operand);
    m_featureOperandSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withOperand(InteractionOperandBuilder p_interactionOperandBuilder) {
    m_featureOperandBuilder.add(p_interactionOperandBuilder);
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConsiderIgnoreFragmentBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
