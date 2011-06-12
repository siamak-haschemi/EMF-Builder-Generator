package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ControlFlow</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ControlFlowBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ControlFlow> {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_activity;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> m_featureActivityBuilder;
  private org.eclipse.uml2.uml.ValueSpecification m_guard;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> m_featureGuardBuilder;
  private org.eclipse.uml2.uml.StructuredActivityNode m_inStructuredNode;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StructuredActivityNode> m_featureInStructuredNodeBuilder;
  private org.eclipse.uml2.uml.InterruptibleActivityRegion m_interrupts;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> m_featureInterruptsBuilder;
  private Boolean m_isLeaf;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.ActivityNode m_source;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> m_featureSourceBuilder;
  private org.eclipse.uml2.uml.ActivityNode m_target;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> m_featureTargetBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private org.eclipse.uml2.uml.ValueSpecification m_weight;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> m_featureWeightBuilder;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityPartition> m_inPartition = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityPartition>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition>> m_featureInPartitionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_redefinedEdge = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureRedefinedEdgeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  // helper attributes
  private boolean m_featureActivitySet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureGuardSet = false;
  private boolean m_featureInPartitionSet = false;
  private boolean m_featureInStructuredNodeSet = false;
  private boolean m_featureInterruptsSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRedefinedEdgeSet = false;
  private boolean m_featureSourceSet = false;
  private boolean m_featureTargetSet = false;
  private boolean m_featureVisibilitySet = false;
  private boolean m_featureWeightSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newControlFlowBuilder()
   */
  private ControlFlowBuilder() {
  }

  /**
   * This method creates a new instance of the ControlFlowBuilder.
   * @return new instance of the ControlFlowBuilder
   */
  public static ControlFlowBuilder newControlFlowBuilder() {
    return new ControlFlowBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ControlFlowBuilder but() {
    ControlFlowBuilder _builder = newControlFlowBuilder();
    _builder.m_featureActivitySet = m_featureActivitySet;
    _builder.m_activity = m_activity;
    _builder.m_featureActivityBuilder = m_featureActivityBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureGuardSet = m_featureGuardSet;
    _builder.m_guard = m_guard;
    _builder.m_featureGuardBuilder = m_featureGuardBuilder;
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
    _builder.m_featureRedefinedEdgeBuilder = m_featureRedefinedEdgeBuilder;
    _builder.m_featureSourceSet = m_featureSourceSet;
    _builder.m_source = m_source;
    _builder.m_featureSourceBuilder = m_featureSourceBuilder;
    _builder.m_featureTargetSet = m_featureTargetSet;
    _builder.m_target = m_target;
    _builder.m_featureTargetBuilder = m_featureTargetBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    _builder.m_featureWeightSet = m_featureWeightSet;
    _builder.m_weight = m_weight;
    _builder.m_featureWeightBuilder = m_featureWeightBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ControlFlow type.
   * @return new instance of the org.eclipse.uml2.uml.ControlFlow type
   */
  public org.eclipse.uml2.uml.ControlFlow build() {
    final org.eclipse.uml2.uml.ControlFlow _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createControlFlow();
    if (m_featureActivitySet) {
      _newInstance.setActivity(m_activity);
    } else {
      if (m_featureActivityBuilder != null) {
        _newInstance.setActivity(m_featureActivityBuilder.build());
      }
    }
    if (m_featureGuardSet) {
      _newInstance.setGuard(m_guard);
    } else {
      if (m_featureGuardBuilder != null) {
        _newInstance.setGuard(m_featureGuardBuilder.build());
      }
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
    if (m_featureSourceSet) {
      _newInstance.setSource(m_source);
    } else {
      if (m_featureSourceBuilder != null) {
        _newInstance.setSource(m_featureSourceBuilder.build());
      }
    }
    if (m_featureTargetSet) {
      _newInstance.setTarget(m_target);
    } else {
      if (m_featureTargetBuilder != null) {
        _newInstance.setTarget(m_featureTargetBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureWeightSet) {
      _newInstance.setWeight(m_weight);
    } else {
      if (m_featureWeightBuilder != null) {
        _newInstance.setWeight(m_featureWeightBuilder.build());
      }
    }
    if (m_featureClientDependencySet) {
      _newInstance.getClientDependencies().addAll(m_clientDependency);
    } else {
      if (!m_featureClientDependencyBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    if (m_featureInPartitionSet) {
      _newInstance.getInPartitions().addAll(m_inPartition);
    } else {
      if (!m_featureInPartitionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> builder : m_featureInPartitionBuilder) {
          _newInstance.getInPartitions().add(builder.build());
        }
      }
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    if (m_featureRedefinedEdgeSet) {
      _newInstance.getRedefinedEdges().addAll(m_redefinedEdge);
    } else {
      if (!m_featureRedefinedEdgeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureRedefinedEdgeBuilder) {
          _newInstance.getRedefinedEdges().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ControlFlowBuilder withActivity(org.eclipse.uml2.uml.Activity p_activity) {
    m_activity = p_activity;
    m_featureActivitySet = true;
    return this;
  }

  public ControlFlowBuilder withActivity(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> p_activityBuilder) {
    m_featureActivityBuilder = p_activityBuilder;
    return this;
  }

  public ControlFlowBuilder withGuard(org.eclipse.uml2.uml.ValueSpecification p_guard) {
    m_guard = p_guard;
    m_featureGuardSet = true;
    return this;
  }

  public ControlFlowBuilder withGuard(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> p_valueSpecificationBuilder) {
    m_featureGuardBuilder = p_valueSpecificationBuilder;
    return this;
  }

  public ControlFlowBuilder withInStructuredNode(org.eclipse.uml2.uml.StructuredActivityNode p_inStructuredNode) {
    m_inStructuredNode = p_inStructuredNode;
    m_featureInStructuredNodeSet = true;
    return this;
  }

  public ControlFlowBuilder withInStructuredNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StructuredActivityNode> p_structuredActivityNodeBuilder) {
    m_featureInStructuredNodeBuilder = p_structuredActivityNodeBuilder;
    return this;
  }

  public ControlFlowBuilder withInterrupts(org.eclipse.uml2.uml.InterruptibleActivityRegion p_interrupts) {
    m_interrupts = p_interrupts;
    m_featureInterruptsSet = true;
    return this;
  }

  public ControlFlowBuilder withInterrupts(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> p_interruptibleActivityRegionBuilder) {
    m_featureInterruptsBuilder = p_interruptibleActivityRegionBuilder;
    return this;
  }

  public ControlFlowBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ControlFlowBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ControlFlowBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ControlFlowBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ControlFlowBuilder withSource(org.eclipse.uml2.uml.ActivityNode p_source) {
    m_source = p_source;
    m_featureSourceSet = true;
    return this;
  }

  public ControlFlowBuilder withSource(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> p_activityNodeBuilder) {
    m_featureSourceBuilder = p_activityNodeBuilder;
    return this;
  }

  public ControlFlowBuilder withTarget(org.eclipse.uml2.uml.ActivityNode p_target) {
    m_target = p_target;
    m_featureTargetSet = true;
    return this;
  }

  public ControlFlowBuilder withTarget(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> p_activityNodeBuilder) {
    m_featureTargetBuilder = p_activityNodeBuilder;
    return this;
  }

  public ControlFlowBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ControlFlowBuilder withWeight(org.eclipse.uml2.uml.ValueSpecification p_weight) {
    m_weight = p_weight;
    m_featureWeightSet = true;
    return this;
  }

  public ControlFlowBuilder withWeight(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> p_valueSpecificationBuilder) {
    m_featureWeightBuilder = p_valueSpecificationBuilder;
    return this;
  }

  public ControlFlowBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ControlFlowBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ControlFlowBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ControlFlowBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ControlFlowBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ControlFlowBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ControlFlowBuilder withInPartition(org.eclipse.uml2.uml.ActivityPartition p_inPartition) {
    m_inPartition.add(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ControlFlowBuilder withInPartition(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityPartition> p_inPartition) {
    m_inPartition.addAll(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ControlFlowBuilder withInPartition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> p_activityPartitionBuilder) {
    m_featureInPartitionBuilder.add(p_activityPartitionBuilder);
    return this;
  }

  public ControlFlowBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ControlFlowBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ControlFlowBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ControlFlowBuilder withRedefinedEdge(org.eclipse.uml2.uml.ActivityEdge p_redefinedEdge) {
    m_redefinedEdge.add(p_redefinedEdge);
    m_featureRedefinedEdgeSet = true;
    return this;
  }

  public ControlFlowBuilder withRedefinedEdge(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_redefinedEdge) {
    m_redefinedEdge.addAll(p_redefinedEdge);
    m_featureRedefinedEdgeSet = true;
    return this;
  }

  public ControlFlowBuilder withRedefinedEdge(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureRedefinedEdgeBuilder.add(p_activityEdgeBuilder);
    return this;
  }
}
