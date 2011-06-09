package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ActivityParameterNode</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActivityParameterNodeBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_activity;
  private org.eclipse.uml2.uml.util.builder.ActivityBuilder m_featureActivityBuilder;
  private org.eclipse.uml2.uml.StructuredActivityNode m_inStructuredNode;
  private org.eclipse.uml2.uml.util.builder.StructuredActivityNodeBuilder m_featureInStructuredNodeBuilder;
  private Boolean m_isControlType;
  private Boolean m_isLeaf;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.ObjectNodeOrderingKind m_ordering;
  private org.eclipse.uml2.uml.Parameter m_parameter;
  private org.eclipse.uml2.uml.util.builder.ParameterBuilder m_featureParameterBuilder;
  private org.eclipse.uml2.uml.Behavior m_selection;
  private org.eclipse.uml2.uml.Type m_type;
  private org.eclipse.uml2.uml.ValueSpecification m_upperBound;
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
  private boolean m_featureInInterruptibleRegionSet = false;
  private boolean m_featureInPartitionSet = false;
  private boolean m_featureInStateSet = false;
  private boolean m_featureInStructuredNodeSet = false;
  private boolean m_featureIncomingSet = false;
  private boolean m_featureIsControlTypeSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOrderingSet = false;
  private boolean m_featureOutgoingSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureParameterSet = false;
  private boolean m_featureRedefinedNodeSet = false;
  private boolean m_featureSelectionSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureUpperBoundSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newActivityParameterNodeBuilder()
   */
  private ActivityParameterNodeBuilder() {
  }

  /**
   * This method creates a new instance of the ActivityParameterNodeBuilder.
   * @return new instance of the ActivityParameterNodeBuilder
   */
  public static ActivityParameterNodeBuilder newActivityParameterNodeBuilder() {
    return new ActivityParameterNodeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ActivityParameterNodeBuilder but() {
    ActivityParameterNodeBuilder _builder = newActivityParameterNodeBuilder();
    _builder.m_featureActivitySet = m_featureActivitySet;
    _builder.m_activity = m_activity;
    _builder.m_featureActivityBuilder = m_featureActivityBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
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
    _builder.m_featureIsControlTypeSet = m_featureIsControlTypeSet;
    _builder.m_isControlType = m_isControlType;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
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
    _builder.m_featureParameterSet = m_featureParameterSet;
    _builder.m_parameter = m_parameter;
    _builder.m_featureParameterBuilder = m_featureParameterBuilder;
    _builder.m_featureRedefinedNodeSet = m_featureRedefinedNodeSet;
    _builder.m_redefinedNode = m_redefinedNode;
    _builder.m_featureSelectionSet = m_featureSelectionSet;
    _builder.m_selection = m_selection;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureUpperBoundSet = m_featureUpperBoundSet;
    _builder.m_upperBound = m_upperBound;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ActivityParameterNode type.
   * @return new instance of the org.eclipse.uml2.uml.ActivityParameterNode type
   */
  public org.eclipse.uml2.uml.ActivityParameterNode build() {
    final org.eclipse.uml2.uml.ActivityParameterNode _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createActivityParameterNode();
    if (m_featureActivitySet) {
      _newInstance.setActivity(m_activity);
    } else {
      if (m_featureActivityBuilder != null) {
        _newInstance.setActivity(m_featureActivityBuilder.build());
      }
    }
    if (m_featureInStructuredNodeSet) {
      _newInstance.setInStructuredNode(m_inStructuredNode);
    } else {
      if (m_featureInStructuredNodeBuilder != null) {
        _newInstance.setInStructuredNode(m_featureInStructuredNodeBuilder.build());
      }
    }
    if (m_featureIsControlTypeSet) {
      _newInstance.setIsControlType(m_isControlType);
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
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
    if (m_featureParameterSet) {
      _newInstance.setParameter(m_parameter);
    } else {
      if (m_featureParameterBuilder != null) {
        _newInstance.setParameter(m_featureParameterBuilder.build());
      }
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

  public ActivityParameterNodeBuilder withActivity(org.eclipse.uml2.uml.Activity p_activity) {
    m_activity = p_activity;
    m_featureActivitySet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withActivity(org.eclipse.uml2.uml.util.builder.ActivityBuilder p_activityBuilder) {
    m_featureActivityBuilder = p_activityBuilder;
    return this;
  }

  public ActivityParameterNodeBuilder withInStructuredNode(org.eclipse.uml2.uml.StructuredActivityNode p_inStructuredNode) {
    m_inStructuredNode = p_inStructuredNode;
    m_featureInStructuredNodeSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withInStructuredNode(org.eclipse.uml2.uml.util.builder.StructuredActivityNodeBuilder p_structuredActivityNodeBuilder) {
    m_featureInStructuredNodeBuilder = p_structuredActivityNodeBuilder;
    return this;
  }

  public ActivityParameterNodeBuilder withIsControlType(Boolean p_isControlType) {
    m_isControlType = p_isControlType;
    m_featureIsControlTypeSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ActivityParameterNodeBuilder withOrdering(org.eclipse.uml2.uml.ObjectNodeOrderingKind p_ordering) {
    m_ordering = p_ordering;
    m_featureOrderingSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withParameter(org.eclipse.uml2.uml.Parameter p_parameter) {
    m_parameter = p_parameter;
    m_featureParameterSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withParameter(org.eclipse.uml2.uml.util.builder.ParameterBuilder p_parameterBuilder) {
    m_featureParameterBuilder = p_parameterBuilder;
    return this;
  }

  public ActivityParameterNodeBuilder withSelection(org.eclipse.uml2.uml.Behavior p_selection) {
    m_selection = p_selection;
    m_featureSelectionSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withType(org.eclipse.uml2.uml.Type p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withUpperBound(org.eclipse.uml2.uml.ValueSpecification p_upperBound) {
    m_upperBound = p_upperBound;
    m_featureUpperBoundSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ActivityParameterNodeBuilder withInInterruptibleRegion(org.eclipse.uml2.uml.InterruptibleActivityRegion p_inInterruptibleRegion) {
    m_inInterruptibleRegion.add(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withInInterruptibleRegion(java.util.Collection<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> p_inInterruptibleRegion) {
    m_inInterruptibleRegion.addAll(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withInInterruptibleRegion(InterruptibleActivityRegionBuilder p_interruptibleActivityRegionBuilder) {
    m_featureInInterruptibleRegionBuilder.add(p_interruptibleActivityRegionBuilder);
    return this;
  }

  public ActivityParameterNodeBuilder withInPartition(org.eclipse.uml2.uml.ActivityPartition p_inPartition) {
    m_inPartition.add(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withInPartition(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityPartition> p_inPartition) {
    m_inPartition.addAll(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withInPartition(ActivityPartitionBuilder p_activityPartitionBuilder) {
    m_featureInPartitionBuilder.add(p_activityPartitionBuilder);
    return this;
  }

  public ActivityParameterNodeBuilder withInState(org.eclipse.uml2.uml.State p_inState) {
    m_inState.add(p_inState);
    m_featureInStateSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withInState(java.util.Collection<? extends org.eclipse.uml2.uml.State> p_inState) {
    m_inState.addAll(p_inState);
    m_featureInStateSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withInState(StateBuilder p_stateBuilder) {
    m_featureInStateBuilder.add(p_stateBuilder);
    return this;
  }

  public ActivityParameterNodeBuilder withIncoming(org.eclipse.uml2.uml.ActivityEdge p_incoming) {
    m_incoming.add(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withIncoming(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_incoming) {
    m_incoming.addAll(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withOutgoing(org.eclipse.uml2.uml.ActivityEdge p_outgoing) {
    m_outgoing.add(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withOutgoing(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_outgoing) {
    m_outgoing.addAll(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ActivityParameterNodeBuilder withRedefinedNode(org.eclipse.uml2.uml.ActivityNode p_redefinedNode) {
    m_redefinedNode.add(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }

  public ActivityParameterNodeBuilder withRedefinedNode(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityNode> p_redefinedNode) {
    m_redefinedNode.addAll(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }
}
