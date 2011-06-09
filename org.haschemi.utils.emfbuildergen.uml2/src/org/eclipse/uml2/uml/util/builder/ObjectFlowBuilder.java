package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ObjectFlow</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ObjectFlowBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_activity;
  private org.eclipse.uml2.uml.util.builder.ActivityBuilder m_featureActivityBuilder;
  private org.eclipse.uml2.uml.ValueSpecification m_guard;
  private org.eclipse.uml2.uml.StructuredActivityNode m_inStructuredNode;
  private org.eclipse.uml2.uml.util.builder.StructuredActivityNodeBuilder m_featureInStructuredNodeBuilder;
  private org.eclipse.uml2.uml.InterruptibleActivityRegion m_interrupts;
  private org.eclipse.uml2.uml.util.builder.InterruptibleActivityRegionBuilder m_featureInterruptsBuilder;
  private Boolean m_isLeaf;
  private Boolean m_isMulticast;
  private Boolean m_isMultireceive;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.Behavior m_selection;
  private org.eclipse.uml2.uml.ActivityNode m_source;
  private org.eclipse.uml2.uml.ActivityNode m_target;
  private org.eclipse.uml2.uml.Behavior m_transformation;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private org.eclipse.uml2.uml.ValueSpecification m_weight;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityPartition> m_inPartition = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityPartition>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ActivityPartitionBuilder> m_featureInPartitionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ActivityPartitionBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_redefinedEdge = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  // helper attributes
  private boolean m_featureActivitySet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureGuardSet = false;
  private boolean m_featureInPartitionSet = false;
  private boolean m_featureInStructuredNodeSet = false;
  private boolean m_featureInterruptsSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureIsMulticastSet = false;
  private boolean m_featureIsMultireceiveSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRedefinedEdgeSet = false;
  private boolean m_featureSelectionSet = false;
  private boolean m_featureSourceSet = false;
  private boolean m_featureTargetSet = false;
  private boolean m_featureTransformationSet = false;
  private boolean m_featureVisibilitySet = false;
  private boolean m_featureWeightSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newObjectFlowBuilder()
   */
  private ObjectFlowBuilder() {
  }

  /**
   * This method creates a new instance of the ObjectFlowBuilder.
   * @return new instance of the ObjectFlowBuilder
   */
  public static ObjectFlowBuilder newObjectFlowBuilder() {
    return new ObjectFlowBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ObjectFlowBuilder but() {
    ObjectFlowBuilder _builder = newObjectFlowBuilder();
    _builder.m_featureActivitySet = m_featureActivitySet;
    _builder.m_activity = m_activity;
    _builder.m_featureActivityBuilder = m_featureActivityBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureGuardSet = m_featureGuardSet;
    _builder.m_guard = m_guard;
    _builder.m_featureInPartitionSet = m_featureInPartitionSet;
    _builder.m_inPartition = m_inPartition;
    _builder.m_featureInPartitionBuilder = m_featureInPartitionBuilder;
    _builder.m_featureInStructuredNodeSet = m_featureInStructuredNodeSet;
    _builder.m_inStructuredNode = m_inStructuredNode;
    _builder.m_featureInStructuredNodeBuilder = m_featureInStructuredNodeBuilder;
    _builder.m_featureInterruptsSet = m_featureInterruptsSet;
    _builder.m_interrupts = m_interrupts;
    _builder.m_featureInterruptsBuilder = m_featureInterruptsBuilder;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureIsMulticastSet = m_featureIsMulticastSet;
    _builder.m_isMulticast = m_isMulticast;
    _builder.m_featureIsMultireceiveSet = m_featureIsMultireceiveSet;
    _builder.m_isMultireceive = m_isMultireceive;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureRedefinedEdgeSet = m_featureRedefinedEdgeSet;
    _builder.m_redefinedEdge = m_redefinedEdge;
    _builder.m_featureSelectionSet = m_featureSelectionSet;
    _builder.m_selection = m_selection;
    _builder.m_featureSourceSet = m_featureSourceSet;
    _builder.m_source = m_source;
    _builder.m_featureTargetSet = m_featureTargetSet;
    _builder.m_target = m_target;
    _builder.m_featureTransformationSet = m_featureTransformationSet;
    _builder.m_transformation = m_transformation;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    _builder.m_featureWeightSet = m_featureWeightSet;
    _builder.m_weight = m_weight;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ObjectFlow type.
   * @return new instance of the org.eclipse.uml2.uml.ObjectFlow type
   */
  public org.eclipse.uml2.uml.ObjectFlow build() {
    final org.eclipse.uml2.uml.ObjectFlow _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createObjectFlow();
    if (m_featureActivitySet) {
      _newInstance.setActivity(m_activity);
    } else {
      if (m_featureActivityBuilder != null) {
        _newInstance.setActivity(m_featureActivityBuilder.build());
      }
    }
    if (m_featureGuardSet) {
      _newInstance.setGuard(m_guard);
    }
    if (m_featureInStructuredNodeSet) {
      _newInstance.setInStructuredNode(m_inStructuredNode);
    } else {
      if (m_featureInStructuredNodeBuilder != null) {
        _newInstance.setInStructuredNode(m_featureInStructuredNodeBuilder.build());
      }
    }
    if (m_featureInterruptsSet) {
      _newInstance.setInterrupts(m_interrupts);
    } else {
      if (m_featureInterruptsBuilder != null) {
        _newInstance.setInterrupts(m_featureInterruptsBuilder.build());
      }
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureIsMulticastSet) {
      _newInstance.setIsMulticast(m_isMulticast);
    }
    if (m_featureIsMultireceiveSet) {
      _newInstance.setIsMultireceive(m_isMultireceive);
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
    if (m_featureSelectionSet) {
      _newInstance.setSelection(m_selection);
    }
    if (m_featureSourceSet) {
      _newInstance.setSource(m_source);
    }
    if (m_featureTargetSet) {
      _newInstance.setTarget(m_target);
    }
    if (m_featureTransformationSet) {
      _newInstance.setTransformation(m_transformation);
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureWeightSet) {
      _newInstance.setWeight(m_weight);
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
    if (m_featureInPartitionSet) {
      _newInstance.getInPartitions().addAll(m_inPartition);
    } else {
      if (!m_featureInPartitionBuilder.isEmpty()) {
        for (ActivityPartitionBuilder builder : m_featureInPartitionBuilder) {
          _newInstance.getInPartitions().add(builder.build());
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
    if (m_featureRedefinedEdgeSet) {
      _newInstance.getRedefinedEdges().addAll(m_redefinedEdge);
    }
    return _newInstance;
  }

  public ObjectFlowBuilder withActivity(org.eclipse.uml2.uml.Activity p_activity) {
    m_activity = p_activity;
    m_featureActivitySet = true;
    return this;
  }

  public ObjectFlowBuilder withActivity(org.eclipse.uml2.uml.util.builder.ActivityBuilder p_activityBuilder) {
    m_featureActivityBuilder = p_activityBuilder;
    return this;
  }

  public ObjectFlowBuilder withGuard(org.eclipse.uml2.uml.ValueSpecification p_guard) {
    m_guard = p_guard;
    m_featureGuardSet = true;
    return this;
  }

  public ObjectFlowBuilder withInStructuredNode(org.eclipse.uml2.uml.StructuredActivityNode p_inStructuredNode) {
    m_inStructuredNode = p_inStructuredNode;
    m_featureInStructuredNodeSet = true;
    return this;
  }

  public ObjectFlowBuilder withInStructuredNode(org.eclipse.uml2.uml.util.builder.StructuredActivityNodeBuilder p_structuredActivityNodeBuilder) {
    m_featureInStructuredNodeBuilder = p_structuredActivityNodeBuilder;
    return this;
  }

  public ObjectFlowBuilder withInterrupts(org.eclipse.uml2.uml.InterruptibleActivityRegion p_interrupts) {
    m_interrupts = p_interrupts;
    m_featureInterruptsSet = true;
    return this;
  }

  public ObjectFlowBuilder withInterrupts(org.eclipse.uml2.uml.util.builder.InterruptibleActivityRegionBuilder p_interruptibleActivityRegionBuilder) {
    m_featureInterruptsBuilder = p_interruptibleActivityRegionBuilder;
    return this;
  }

  public ObjectFlowBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ObjectFlowBuilder withIsMulticast(Boolean p_isMulticast) {
    m_isMulticast = p_isMulticast;
    m_featureIsMulticastSet = true;
    return this;
  }

  public ObjectFlowBuilder withIsMultireceive(Boolean p_isMultireceive) {
    m_isMultireceive = p_isMultireceive;
    m_featureIsMultireceiveSet = true;
    return this;
  }

  public ObjectFlowBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ObjectFlowBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ObjectFlowBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ObjectFlowBuilder withSelection(org.eclipse.uml2.uml.Behavior p_selection) {
    m_selection = p_selection;
    m_featureSelectionSet = true;
    return this;
  }

  public ObjectFlowBuilder withSource(org.eclipse.uml2.uml.ActivityNode p_source) {
    m_source = p_source;
    m_featureSourceSet = true;
    return this;
  }

  public ObjectFlowBuilder withTarget(org.eclipse.uml2.uml.ActivityNode p_target) {
    m_target = p_target;
    m_featureTargetSet = true;
    return this;
  }

  public ObjectFlowBuilder withTransformation(org.eclipse.uml2.uml.Behavior p_transformation) {
    m_transformation = p_transformation;
    m_featureTransformationSet = true;
    return this;
  }

  public ObjectFlowBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ObjectFlowBuilder withWeight(org.eclipse.uml2.uml.ValueSpecification p_weight) {
    m_weight = p_weight;
    m_featureWeightSet = true;
    return this;
  }

  public ObjectFlowBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ObjectFlowBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ObjectFlowBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ObjectFlowBuilder withInPartition(org.eclipse.uml2.uml.ActivityPartition p_inPartition) {
    m_inPartition.add(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ObjectFlowBuilder withInPartition(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityPartition> p_inPartition) {
    m_inPartition.addAll(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ObjectFlowBuilder withInPartition(ActivityPartitionBuilder p_activityPartitionBuilder) {
    m_featureInPartitionBuilder.add(p_activityPartitionBuilder);
    return this;
  }

  public ObjectFlowBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ObjectFlowBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ObjectFlowBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ObjectFlowBuilder withRedefinedEdge(org.eclipse.uml2.uml.ActivityEdge p_redefinedEdge) {
    m_redefinedEdge.add(p_redefinedEdge);
    m_featureRedefinedEdgeSet = true;
    return this;
  }

  public ObjectFlowBuilder withRedefinedEdge(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_redefinedEdge) {
    m_redefinedEdge.addAll(p_redefinedEdge);
    m_featureRedefinedEdgeSet = true;
    return this;
  }
}
