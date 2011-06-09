package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ActionInputPin</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActionInputPinBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_activity;
  private org.eclipse.uml2.uml.util.builder.ActivityBuilder m_featureActivityBuilder;
  private org.eclipse.uml2.uml.Action m_fromAction;
  private org.eclipse.uml2.uml.StructuredActivityNode m_inStructuredNode;
  private org.eclipse.uml2.uml.util.builder.StructuredActivityNodeBuilder m_featureInStructuredNodeBuilder;
  private Boolean m_isControl;
  private Boolean m_isControlType;
  private Boolean m_isLeaf;
  private Boolean m_isOrdered;
  private Boolean m_isUnique;
  private org.eclipse.uml2.uml.ValueSpecification m_lowerValue;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.ObjectNodeOrderingKind m_ordering;
  private org.eclipse.uml2.uml.Behavior m_selection;
  private org.eclipse.uml2.uml.Type m_type;
  private org.eclipse.uml2.uml.ValueSpecification m_upperBound;
  private org.eclipse.uml2.uml.ValueSpecification m_upperValue;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.InterruptibleActivityRegion> m_inInterruptibleRegion = new java.util.LinkedList<org.eclipse.uml2.uml.InterruptibleActivityRegion>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.InterruptibleActivityRegionBuilder> m_featureInInterruptibleRegionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.InterruptibleActivityRegionBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityPartition> m_inPartition = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityPartition>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ActivityPartitionBuilder> m_featureInPartitionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ActivityPartitionBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.State> m_inState = new java.util.LinkedList<org.eclipse.uml2.uml.State>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.StateBuilder> m_featureInStateBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.StateBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_incoming = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_outgoing = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityNode> m_redefinedNode = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityNode>();
  // helper attributes
  private boolean m_featureActivitySet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureFromActionSet = false;
  private boolean m_featureInInterruptibleRegionSet = false;
  private boolean m_featureInPartitionSet = false;
  private boolean m_featureInStateSet = false;
  private boolean m_featureInStructuredNodeSet = false;
  private boolean m_featureIncomingSet = false;
  private boolean m_featureIsControlSet = false;
  private boolean m_featureIsControlTypeSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureIsOrderedSet = false;
  private boolean m_featureIsUniqueSet = false;
  private boolean m_featureLowerValueSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOrderingSet = false;
  private boolean m_featureOutgoingSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRedefinedNodeSet = false;
  private boolean m_featureSelectionSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureUpperBoundSet = false;
  private boolean m_featureUpperValueSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newActionInputPinBuilder()
   */
  private ActionInputPinBuilder() {
  }

  /**
   * This method creates a new instance of the ActionInputPinBuilder.
   * @return new instance of the ActionInputPinBuilder
   */
  public static ActionInputPinBuilder newActionInputPinBuilder() {
    return new ActionInputPinBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ActionInputPinBuilder but() {
    ActionInputPinBuilder _builder = newActionInputPinBuilder();
    _builder.m_featureActivitySet = m_featureActivitySet;
    _builder.m_activity = m_activity;
    _builder.m_featureActivityBuilder = m_featureActivityBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureFromActionSet = m_featureFromActionSet;
    _builder.m_fromAction = m_fromAction;
    _builder.m_featureInInterruptibleRegionSet = m_featureInInterruptibleRegionSet;
    _builder.m_inInterruptibleRegion = m_inInterruptibleRegion;
    _builder.m_featureInInterruptibleRegionBuilder = m_featureInInterruptibleRegionBuilder;
    _builder.m_featureInPartitionSet = m_featureInPartitionSet;
    _builder.m_inPartition = m_inPartition;
    _builder.m_featureInPartitionBuilder = m_featureInPartitionBuilder;
    _builder.m_featureInStateSet = m_featureInStateSet;
    _builder.m_inState = m_inState;
    _builder.m_featureInStateBuilder = m_featureInStateBuilder;
    _builder.m_featureInStructuredNodeSet = m_featureInStructuredNodeSet;
    _builder.m_inStructuredNode = m_inStructuredNode;
    _builder.m_featureInStructuredNodeBuilder = m_featureInStructuredNodeBuilder;
    _builder.m_featureIncomingSet = m_featureIncomingSet;
    _builder.m_incoming = m_incoming;
    _builder.m_featureIsControlSet = m_featureIsControlSet;
    _builder.m_isControl = m_isControl;
    _builder.m_featureIsControlTypeSet = m_featureIsControlTypeSet;
    _builder.m_isControlType = m_isControlType;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureIsOrderedSet = m_featureIsOrderedSet;
    _builder.m_isOrdered = m_isOrdered;
    _builder.m_featureIsUniqueSet = m_featureIsUniqueSet;
    _builder.m_isUnique = m_isUnique;
    _builder.m_featureLowerValueSet = m_featureLowerValueSet;
    _builder.m_lowerValue = m_lowerValue;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOrderingSet = m_featureOrderingSet;
    _builder.m_ordering = m_ordering;
    _builder.m_featureOutgoingSet = m_featureOutgoingSet;
    _builder.m_outgoing = m_outgoing;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureRedefinedNodeSet = m_featureRedefinedNodeSet;
    _builder.m_redefinedNode = m_redefinedNode;
    _builder.m_featureSelectionSet = m_featureSelectionSet;
    _builder.m_selection = m_selection;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureUpperBoundSet = m_featureUpperBoundSet;
    _builder.m_upperBound = m_upperBound;
    _builder.m_featureUpperValueSet = m_featureUpperValueSet;
    _builder.m_upperValue = m_upperValue;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ActionInputPin type.
   * @return new instance of the org.eclipse.uml2.uml.ActionInputPin type
   */
  public org.eclipse.uml2.uml.ActionInputPin build() {
    final org.eclipse.uml2.uml.ActionInputPin _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createActionInputPin();
    if (m_featureActivitySet) {
      _newInstance.setActivity(m_activity);
    } else {
      if (m_featureActivityBuilder != null) {
        _newInstance.setActivity(m_featureActivityBuilder.build());
      }
    }
    if (m_featureFromActionSet) {
      _newInstance.setFromAction(m_fromAction);
    }
    if (m_featureInStructuredNodeSet) {
      _newInstance.setInStructuredNode(m_inStructuredNode);
    } else {
      if (m_featureInStructuredNodeBuilder != null) {
        _newInstance.setInStructuredNode(m_featureInStructuredNodeBuilder.build());
      }
    }
    if (m_featureIsControlSet) {
      _newInstance.setIsControl(m_isControl);
    }
    if (m_featureIsControlTypeSet) {
      _newInstance.setIsControlType(m_isControlType);
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureIsOrderedSet) {
      _newInstance.setIsOrdered(m_isOrdered);
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
    if (m_featureOrderingSet) {
      _newInstance.setOrdering(m_ordering);
    }
    if (m_featureSelectionSet) {
      _newInstance.setSelection(m_selection);
    }
    if (m_featureTypeSet) {
      _newInstance.setType(m_type);
    }
    if (m_featureUpperBoundSet) {
      _newInstance.setUpperBound(m_upperBound);
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
    if (m_featureInInterruptibleRegionSet) {
      _newInstance.getInInterruptibleRegions().addAll(m_inInterruptibleRegion);
    } else {
      if (!m_featureInInterruptibleRegionBuilder.isEmpty()) {
        for (InterruptibleActivityRegionBuilder builder : m_featureInInterruptibleRegionBuilder) {
          _newInstance.getInInterruptibleRegions().add(builder.build());
        }
      }
    }
    if (m_featureInPartitionSet) {
      _newInstance.getInPartitions().addAll(m_inPartition);
    } else {
      if (!m_featureInPartitionBuilder.isEmpty()) {
        for (ActivityPartitionBuilder builder : m_featureInPartitionBuilder) {
          _newInstance.getInPartitions().add(builder.build());
        }
      }
    }
    if (m_featureInStateSet) {
      _newInstance.getInStates().addAll(m_inState);
    } else {
      if (!m_featureInStateBuilder.isEmpty()) {
        for (StateBuilder builder : m_featureInStateBuilder) {
          _newInstance.getInStates().add(builder.build());
        }
      }
    }
    if (m_featureIncomingSet) {
      _newInstance.getIncomings().addAll(m_incoming);
    }
    if (m_featureOutgoingSet) {
      _newInstance.getOutgoings().addAll(m_outgoing);
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
    if (m_featureRedefinedNodeSet) {
      _newInstance.getRedefinedNodes().addAll(m_redefinedNode);
    }
    return _newInstance;
  }

  public ActionInputPinBuilder withActivity(org.eclipse.uml2.uml.Activity p_activity) {
    m_activity = p_activity;
    m_featureActivitySet = true;
    return this;
  }

  public ActionInputPinBuilder withActivity(org.eclipse.uml2.uml.util.builder.ActivityBuilder p_activityBuilder) {
    m_featureActivityBuilder = p_activityBuilder;
    return this;
  }

  public ActionInputPinBuilder withFromAction(org.eclipse.uml2.uml.Action p_fromAction) {
    m_fromAction = p_fromAction;
    m_featureFromActionSet = true;
    return this;
  }

  public ActionInputPinBuilder withInStructuredNode(org.eclipse.uml2.uml.StructuredActivityNode p_inStructuredNode) {
    m_inStructuredNode = p_inStructuredNode;
    m_featureInStructuredNodeSet = true;
    return this;
  }

  public ActionInputPinBuilder withInStructuredNode(org.eclipse.uml2.uml.util.builder.StructuredActivityNodeBuilder p_structuredActivityNodeBuilder) {
    m_featureInStructuredNodeBuilder = p_structuredActivityNodeBuilder;
    return this;
  }

  public ActionInputPinBuilder withIsControl(Boolean p_isControl) {
    m_isControl = p_isControl;
    m_featureIsControlSet = true;
    return this;
  }

  public ActionInputPinBuilder withIsControlType(Boolean p_isControlType) {
    m_isControlType = p_isControlType;
    m_featureIsControlTypeSet = true;
    return this;
  }

  public ActionInputPinBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ActionInputPinBuilder withIsOrdered(Boolean p_isOrdered) {
    m_isOrdered = p_isOrdered;
    m_featureIsOrderedSet = true;
    return this;
  }

  public ActionInputPinBuilder withIsUnique(Boolean p_isUnique) {
    m_isUnique = p_isUnique;
    m_featureIsUniqueSet = true;
    return this;
  }

  public ActionInputPinBuilder withLowerValue(org.eclipse.uml2.uml.ValueSpecification p_lowerValue) {
    m_lowerValue = p_lowerValue;
    m_featureLowerValueSet = true;
    return this;
  }

  public ActionInputPinBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ActionInputPinBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ActionInputPinBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ActionInputPinBuilder withOrdering(org.eclipse.uml2.uml.ObjectNodeOrderingKind p_ordering) {
    m_ordering = p_ordering;
    m_featureOrderingSet = true;
    return this;
  }

  public ActionInputPinBuilder withSelection(org.eclipse.uml2.uml.Behavior p_selection) {
    m_selection = p_selection;
    m_featureSelectionSet = true;
    return this;
  }

  public ActionInputPinBuilder withType(org.eclipse.uml2.uml.Type p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public ActionInputPinBuilder withUpperBound(org.eclipse.uml2.uml.ValueSpecification p_upperBound) {
    m_upperBound = p_upperBound;
    m_featureUpperBoundSet = true;
    return this;
  }

  public ActionInputPinBuilder withUpperValue(org.eclipse.uml2.uml.ValueSpecification p_upperValue) {
    m_upperValue = p_upperValue;
    m_featureUpperValueSet = true;
    return this;
  }

  public ActionInputPinBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ActionInputPinBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ActionInputPinBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ActionInputPinBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ActionInputPinBuilder withInInterruptibleRegion(org.eclipse.uml2.uml.InterruptibleActivityRegion p_inInterruptibleRegion) {
    m_inInterruptibleRegion.add(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ActionInputPinBuilder withInInterruptibleRegion(java.util.Collection<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> p_inInterruptibleRegion) {
    m_inInterruptibleRegion.addAll(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ActionInputPinBuilder withInInterruptibleRegion(InterruptibleActivityRegionBuilder p_interruptibleActivityRegionBuilder) {
    m_featureInInterruptibleRegionBuilder.add(p_interruptibleActivityRegionBuilder);
    return this;
  }

  public ActionInputPinBuilder withInPartition(org.eclipse.uml2.uml.ActivityPartition p_inPartition) {
    m_inPartition.add(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ActionInputPinBuilder withInPartition(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityPartition> p_inPartition) {
    m_inPartition.addAll(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ActionInputPinBuilder withInPartition(ActivityPartitionBuilder p_activityPartitionBuilder) {
    m_featureInPartitionBuilder.add(p_activityPartitionBuilder);
    return this;
  }

  public ActionInputPinBuilder withInState(org.eclipse.uml2.uml.State p_inState) {
    m_inState.add(p_inState);
    m_featureInStateSet = true;
    return this;
  }

  public ActionInputPinBuilder withInState(java.util.Collection<? extends org.eclipse.uml2.uml.State> p_inState) {
    m_inState.addAll(p_inState);
    m_featureInStateSet = true;
    return this;
  }

  public ActionInputPinBuilder withInState(StateBuilder p_stateBuilder) {
    m_featureInStateBuilder.add(p_stateBuilder);
    return this;
  }

  public ActionInputPinBuilder withIncoming(org.eclipse.uml2.uml.ActivityEdge p_incoming) {
    m_incoming.add(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ActionInputPinBuilder withIncoming(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_incoming) {
    m_incoming.addAll(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ActionInputPinBuilder withOutgoing(org.eclipse.uml2.uml.ActivityEdge p_outgoing) {
    m_outgoing.add(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ActionInputPinBuilder withOutgoing(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_outgoing) {
    m_outgoing.addAll(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ActionInputPinBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ActionInputPinBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ActionInputPinBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ActionInputPinBuilder withRedefinedNode(org.eclipse.uml2.uml.ActivityNode p_redefinedNode) {
    m_redefinedNode.add(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }

  public ActionInputPinBuilder withRedefinedNode(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityNode> p_redefinedNode) {
    m_redefinedNode.addAll(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }
}
