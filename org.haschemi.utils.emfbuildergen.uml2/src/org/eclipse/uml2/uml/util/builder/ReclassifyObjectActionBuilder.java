package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ReclassifyObjectAction</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ReclassifyObjectActionBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_activity;
  private org.eclipse.uml2.uml.util.builder.ActivityBuilder m_featureActivityBuilder;
  private org.eclipse.uml2.uml.StructuredActivityNode m_inStructuredNode;
  private org.eclipse.uml2.uml.util.builder.StructuredActivityNodeBuilder m_featureInStructuredNodeBuilder;
  private Boolean m_isLeaf;
  private Boolean m_isReplaceAll;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.InputPin m_object;
  private org.eclipse.uml2.uml.util.builder.InputPinBuilder m_featureObjectBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ExceptionHandler> m_handler = new java.util.LinkedList<org.eclipse.uml2.uml.ExceptionHandler>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ExceptionHandlerBuilder> m_featureHandlerBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ExceptionHandlerBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.InterruptibleActivityRegion> m_inInterruptibleRegion = new java.util.LinkedList<org.eclipse.uml2.uml.InterruptibleActivityRegion>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.InterruptibleActivityRegionBuilder> m_featureInInterruptibleRegionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.InterruptibleActivityRegionBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityPartition> m_inPartition = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityPartition>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ActivityPartitionBuilder> m_featureInPartitionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ActivityPartitionBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_incoming = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_localPostcondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureLocalPostconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_localPrecondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureLocalPreconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_newClassifier = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_oldClassifier = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_outgoing = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityNode> m_redefinedNode = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityNode>();
  // helper attributes
  private boolean m_featureActivitySet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureHandlerSet = false;
  private boolean m_featureInInterruptibleRegionSet = false;
  private boolean m_featureInPartitionSet = false;
  private boolean m_featureInStructuredNodeSet = false;
  private boolean m_featureIncomingSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureIsReplaceAllSet = false;
  private boolean m_featureLocalPostconditionSet = false;
  private boolean m_featureLocalPreconditionSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureNewClassifierSet = false;
  private boolean m_featureObjectSet = false;
  private boolean m_featureOldClassifierSet = false;
  private boolean m_featureOutgoingSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRedefinedNodeSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newReclassifyObjectActionBuilder()
   */
  private ReclassifyObjectActionBuilder() {
  }

  /**
   * This method creates a new instance of the ReclassifyObjectActionBuilder.
   * @return new instance of the ReclassifyObjectActionBuilder
   */
  public static ReclassifyObjectActionBuilder newReclassifyObjectActionBuilder() {
    return new ReclassifyObjectActionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ReclassifyObjectActionBuilder but() {
    ReclassifyObjectActionBuilder _builder = newReclassifyObjectActionBuilder();
    _builder.m_featureActivitySet = m_featureActivitySet;
    _builder.m_activity = m_activity;
    _builder.m_featureActivityBuilder = m_featureActivityBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureHandlerSet = m_featureHandlerSet;
    _builder.m_handler = m_handler;
    _builder.m_featureHandlerBuilder = m_featureHandlerBuilder;
    _builder.m_featureInInterruptibleRegionSet = m_featureInInterruptibleRegionSet;
    _builder.m_inInterruptibleRegion = m_inInterruptibleRegion;
    _builder.m_featureInInterruptibleRegionBuilder = m_featureInInterruptibleRegionBuilder;
    _builder.m_featureInPartitionSet = m_featureInPartitionSet;
    _builder.m_inPartition = m_inPartition;
    _builder.m_featureInPartitionBuilder = m_featureInPartitionBuilder;
    _builder.m_featureInStructuredNodeSet = m_featureInStructuredNodeSet;
    _builder.m_inStructuredNode = m_inStructuredNode;
    _builder.m_featureInStructuredNodeBuilder = m_featureInStructuredNodeBuilder;
    _builder.m_featureIncomingSet = m_featureIncomingSet;
    _builder.m_incoming = m_incoming;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureIsReplaceAllSet = m_featureIsReplaceAllSet;
    _builder.m_isReplaceAll = m_isReplaceAll;
    _builder.m_featureLocalPostconditionSet = m_featureLocalPostconditionSet;
    _builder.m_localPostcondition = m_localPostcondition;
    _builder.m_featureLocalPostconditionBuilder = m_featureLocalPostconditionBuilder;
    _builder.m_featureLocalPreconditionSet = m_featureLocalPreconditionSet;
    _builder.m_localPrecondition = m_localPrecondition;
    _builder.m_featureLocalPreconditionBuilder = m_featureLocalPreconditionBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureNewClassifierSet = m_featureNewClassifierSet;
    _builder.m_newClassifier = m_newClassifier;
    _builder.m_featureObjectSet = m_featureObjectSet;
    _builder.m_object = m_object;
    _builder.m_featureObjectBuilder = m_featureObjectBuilder;
    _builder.m_featureOldClassifierSet = m_featureOldClassifierSet;
    _builder.m_oldClassifier = m_oldClassifier;
    _builder.m_featureOutgoingSet = m_featureOutgoingSet;
    _builder.m_outgoing = m_outgoing;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureRedefinedNodeSet = m_featureRedefinedNodeSet;
    _builder.m_redefinedNode = m_redefinedNode;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ReclassifyObjectAction type.
   * @return new instance of the org.eclipse.uml2.uml.ReclassifyObjectAction type
   */
  public org.eclipse.uml2.uml.ReclassifyObjectAction build() {
    final org.eclipse.uml2.uml.ReclassifyObjectAction _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createReclassifyObjectAction();
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
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureIsReplaceAllSet) {
      _newInstance.setIsReplaceAll(m_isReplaceAll);
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
    if (m_featureObjectSet) {
      _newInstance.setObject(m_object);
    } else {
      if (m_featureObjectBuilder != null) {
        _newInstance.setObject(m_featureObjectBuilder.build());
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
    if (m_featureHandlerSet) {
      _newInstance.getHandlers().addAll(m_handler);
    } else {
      if (!m_featureHandlerBuilder.isEmpty()) {
        for (ExceptionHandlerBuilder builder : m_featureHandlerBuilder) {
          _newInstance.getHandlers().add(builder.build());
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
    if (m_featureIncomingSet) {
      _newInstance.getIncomings().addAll(m_incoming);
    }
    if (m_featureLocalPostconditionSet) {
      _newInstance.getLocalPostconditions().addAll(m_localPostcondition);
    } else {
      if (!m_featureLocalPostconditionBuilder.isEmpty()) {
        for (ConstraintBuilder builder : m_featureLocalPostconditionBuilder) {
          _newInstance.getLocalPostconditions().add(builder.build());
        }
      }
    }
    if (m_featureLocalPreconditionSet) {
      _newInstance.getLocalPreconditions().addAll(m_localPrecondition);
    } else {
      if (!m_featureLocalPreconditionBuilder.isEmpty()) {
        for (ConstraintBuilder builder : m_featureLocalPreconditionBuilder) {
          _newInstance.getLocalPreconditions().add(builder.build());
        }
      }
    }
    if (m_featureNewClassifierSet) {
      _newInstance.getNewClassifiers().addAll(m_newClassifier);
    }
    if (m_featureOldClassifierSet) {
      _newInstance.getOldClassifiers().addAll(m_oldClassifier);
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

  public ReclassifyObjectActionBuilder withActivity(org.eclipse.uml2.uml.Activity p_activity) {
    m_activity = p_activity;
    m_featureActivitySet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withActivity(org.eclipse.uml2.uml.util.builder.ActivityBuilder p_activityBuilder) {
    m_featureActivityBuilder = p_activityBuilder;
    return this;
  }

  public ReclassifyObjectActionBuilder withInStructuredNode(org.eclipse.uml2.uml.StructuredActivityNode p_inStructuredNode) {
    m_inStructuredNode = p_inStructuredNode;
    m_featureInStructuredNodeSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withInStructuredNode(org.eclipse.uml2.uml.util.builder.StructuredActivityNodeBuilder p_structuredActivityNodeBuilder) {
    m_featureInStructuredNodeBuilder = p_structuredActivityNodeBuilder;
    return this;
  }

  public ReclassifyObjectActionBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withIsReplaceAll(Boolean p_isReplaceAll) {
    m_isReplaceAll = p_isReplaceAll;
    m_featureIsReplaceAllSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ReclassifyObjectActionBuilder withObject(org.eclipse.uml2.uml.InputPin p_object) {
    m_object = p_object;
    m_featureObjectSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withObject(org.eclipse.uml2.uml.util.builder.InputPinBuilder p_inputPinBuilder) {
    m_featureObjectBuilder = p_inputPinBuilder;
    return this;
  }

  public ReclassifyObjectActionBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ReclassifyObjectActionBuilder withHandler(org.eclipse.uml2.uml.ExceptionHandler p_handler) {
    m_handler.add(p_handler);
    m_featureHandlerSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withHandler(java.util.Collection<? extends org.eclipse.uml2.uml.ExceptionHandler> p_handler) {
    m_handler.addAll(p_handler);
    m_featureHandlerSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withHandler(ExceptionHandlerBuilder p_exceptionHandlerBuilder) {
    m_featureHandlerBuilder.add(p_exceptionHandlerBuilder);
    return this;
  }

  public ReclassifyObjectActionBuilder withInInterruptibleRegion(org.eclipse.uml2.uml.InterruptibleActivityRegion p_inInterruptibleRegion) {
    m_inInterruptibleRegion.add(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withInInterruptibleRegion(java.util.Collection<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> p_inInterruptibleRegion) {
    m_inInterruptibleRegion.addAll(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withInInterruptibleRegion(InterruptibleActivityRegionBuilder p_interruptibleActivityRegionBuilder) {
    m_featureInInterruptibleRegionBuilder.add(p_interruptibleActivityRegionBuilder);
    return this;
  }

  public ReclassifyObjectActionBuilder withInPartition(org.eclipse.uml2.uml.ActivityPartition p_inPartition) {
    m_inPartition.add(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withInPartition(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityPartition> p_inPartition) {
    m_inPartition.addAll(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withInPartition(ActivityPartitionBuilder p_activityPartitionBuilder) {
    m_featureInPartitionBuilder.add(p_activityPartitionBuilder);
    return this;
  }

  public ReclassifyObjectActionBuilder withIncoming(org.eclipse.uml2.uml.ActivityEdge p_incoming) {
    m_incoming.add(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withIncoming(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_incoming) {
    m_incoming.addAll(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withLocalPostcondition(org.eclipse.uml2.uml.Constraint p_localPostcondition) {
    m_localPostcondition.add(p_localPostcondition);
    m_featureLocalPostconditionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withLocalPostcondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_localPostcondition) {
    m_localPostcondition.addAll(p_localPostcondition);
    m_featureLocalPostconditionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withLocalPostcondition(ConstraintBuilder p_constraintBuilder) {
    m_featureLocalPostconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public ReclassifyObjectActionBuilder withLocalPrecondition(org.eclipse.uml2.uml.Constraint p_localPrecondition) {
    m_localPrecondition.add(p_localPrecondition);
    m_featureLocalPreconditionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withLocalPrecondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_localPrecondition) {
    m_localPrecondition.addAll(p_localPrecondition);
    m_featureLocalPreconditionSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withLocalPrecondition(ConstraintBuilder p_constraintBuilder) {
    m_featureLocalPreconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public ReclassifyObjectActionBuilder withNewClassifier(org.eclipse.uml2.uml.Classifier p_newClassifier) {
    m_newClassifier.add(p_newClassifier);
    m_featureNewClassifierSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withNewClassifier(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_newClassifier) {
    m_newClassifier.addAll(p_newClassifier);
    m_featureNewClassifierSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withOldClassifier(org.eclipse.uml2.uml.Classifier p_oldClassifier) {
    m_oldClassifier.add(p_oldClassifier);
    m_featureOldClassifierSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withOldClassifier(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_oldClassifier) {
    m_oldClassifier.addAll(p_oldClassifier);
    m_featureOldClassifierSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withOutgoing(org.eclipse.uml2.uml.ActivityEdge p_outgoing) {
    m_outgoing.add(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withOutgoing(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_outgoing) {
    m_outgoing.addAll(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ReclassifyObjectActionBuilder withRedefinedNode(org.eclipse.uml2.uml.ActivityNode p_redefinedNode) {
    m_redefinedNode.add(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }

  public ReclassifyObjectActionBuilder withRedefinedNode(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityNode> p_redefinedNode) {
    m_redefinedNode.addAll(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }
}
