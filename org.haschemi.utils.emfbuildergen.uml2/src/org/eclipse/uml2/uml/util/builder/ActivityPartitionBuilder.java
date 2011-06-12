package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ActivityPartition</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActivityPartitionBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ActivityPartition> {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_inActivity;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> m_featureInActivityBuilder;
  private Boolean m_isDimension;
  private Boolean m_isExternal;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.Element m_represents;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element> m_featureRepresentsBuilder;
  private org.eclipse.uml2.uml.ActivityPartition m_superPartition;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> m_featureSuperPartitionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_edge = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureEdgeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityNode> m_node = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityNode>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>> m_featureNodeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityPartition> m_subpartition = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityPartition>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition>> m_featureSubpartitionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEdgeSet = false;
  private boolean m_featureInActivitySet = false;
  private boolean m_featureIsDimensionSet = false;
  private boolean m_featureIsExternalSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureNodeSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRepresentsSet = false;
  private boolean m_featureSubpartitionSet = false;
  private boolean m_featureSuperPartitionSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newActivityPartitionBuilder()
   */
  private ActivityPartitionBuilder() {
  }

  /**
   * This method creates a new instance of the ActivityPartitionBuilder.
   * @return new instance of the ActivityPartitionBuilder
   */
  public static ActivityPartitionBuilder newActivityPartitionBuilder() {
    return new ActivityPartitionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ActivityPartitionBuilder but() {
    ActivityPartitionBuilder _builder = newActivityPartitionBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEdgeSet = m_featureEdgeSet;
    _builder.m_edge = m_edge;
    _builder.m_featureEdgeBuilder = m_featureEdgeBuilder;
    _builder.m_featureInActivitySet = m_featureInActivitySet;
    _builder.m_inActivity = m_inActivity;
    _builder.m_featureInActivityBuilder = m_featureInActivityBuilder;
    _builder.m_featureIsDimensionSet = m_featureIsDimensionSet;
    _builder.m_isDimension = m_isDimension;
    _builder.m_featureIsExternalSet = m_featureIsExternalSet;
    _builder.m_isExternal = m_isExternal;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureNodeSet = m_featureNodeSet;
    _builder.m_node = m_node;
    _builder.m_featureNodeBuilder = m_featureNodeBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureRepresentsSet = m_featureRepresentsSet;
    _builder.m_represents = m_represents;
    _builder.m_featureRepresentsBuilder = m_featureRepresentsBuilder;
    _builder.m_featureSubpartitionSet = m_featureSubpartitionSet;
    _builder.m_subpartition = m_subpartition;
    _builder.m_featureSubpartitionBuilder = m_featureSubpartitionBuilder;
    _builder.m_featureSuperPartitionSet = m_featureSuperPartitionSet;
    _builder.m_superPartition = m_superPartition;
    _builder.m_featureSuperPartitionBuilder = m_featureSuperPartitionBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ActivityPartition type.
   * @return new instance of the org.eclipse.uml2.uml.ActivityPartition type
   */
  public org.eclipse.uml2.uml.ActivityPartition build() {
    final org.eclipse.uml2.uml.ActivityPartition _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createActivityPartition();
    if (m_featureInActivitySet) {
      _newInstance.setInActivity(m_inActivity);
    } else {
      if (m_featureInActivityBuilder != null) {
        _newInstance.setInActivity(m_featureInActivityBuilder.build());
      }
    }
    if (m_featureIsDimensionSet) {
      _newInstance.setIsDimension(m_isDimension);
    }
    if (m_featureIsExternalSet) {
      _newInstance.setIsExternal(m_isExternal);
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
    } else {
      if (m_featureRepresentsBuilder != null) {
        _newInstance.setRepresents(m_featureRepresentsBuilder.build());
      }
    }
    if (m_featureSuperPartitionSet) {
      _newInstance.setSuperPartition(m_superPartition);
    } else {
      if (m_featureSuperPartitionBuilder != null) {
        _newInstance.setSuperPartition(m_featureSuperPartitionBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
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
    if (m_featureEdgeSet) {
      _newInstance.getEdges().addAll(m_edge);
    } else {
      if (!m_featureEdgeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureEdgeBuilder) {
          _newInstance.getEdges().add(builder.build());
        }
      }
    }
    if (m_featureNodeSet) {
      _newInstance.getNodes().addAll(m_node);
    } else {
      if (!m_featureNodeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> builder : m_featureNodeBuilder) {
          _newInstance.getNodes().add(builder.build());
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
    if (m_featureSubpartitionSet) {
      _newInstance.getSubpartitions().addAll(m_subpartition);
    } else {
      if (!m_featureSubpartitionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> builder : m_featureSubpartitionBuilder) {
          _newInstance.getSubpartitions().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ActivityPartitionBuilder withInActivity(org.eclipse.uml2.uml.Activity p_inActivity) {
    m_inActivity = p_inActivity;
    m_featureInActivitySet = true;
    return this;
  }

  public ActivityPartitionBuilder withInActivity(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> p_activityBuilder) {
    m_featureInActivityBuilder = p_activityBuilder;
    return this;
  }

  public ActivityPartitionBuilder withIsDimension(Boolean p_isDimension) {
    m_isDimension = p_isDimension;
    m_featureIsDimensionSet = true;
    return this;
  }

  public ActivityPartitionBuilder withIsExternal(Boolean p_isExternal) {
    m_isExternal = p_isExternal;
    m_featureIsExternalSet = true;
    return this;
  }

  public ActivityPartitionBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ActivityPartitionBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ActivityPartitionBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ActivityPartitionBuilder withRepresents(org.eclipse.uml2.uml.Element p_represents) {
    m_represents = p_represents;
    m_featureRepresentsSet = true;
    return this;
  }

  public ActivityPartitionBuilder withRepresents(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element> p_elementBuilder) {
    m_featureRepresentsBuilder = p_elementBuilder;
    return this;
  }

  public ActivityPartitionBuilder withSuperPartition(org.eclipse.uml2.uml.ActivityPartition p_superPartition) {
    m_superPartition = p_superPartition;
    m_featureSuperPartitionSet = true;
    return this;
  }

  public ActivityPartitionBuilder withSuperPartition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> p_activityPartitionBuilder) {
    m_featureSuperPartitionBuilder = p_activityPartitionBuilder;
    return this;
  }

  public ActivityPartitionBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ActivityPartitionBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ActivityPartitionBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ActivityPartitionBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ActivityPartitionBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ActivityPartitionBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ActivityPartitionBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ActivityPartitionBuilder withEdge(org.eclipse.uml2.uml.ActivityEdge p_edge) {
    m_edge.add(p_edge);
    m_featureEdgeSet = true;
    return this;
  }

  public ActivityPartitionBuilder withEdge(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_edge) {
    m_edge.addAll(p_edge);
    m_featureEdgeSet = true;
    return this;
  }

  public ActivityPartitionBuilder withEdge(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureEdgeBuilder.add(p_activityEdgeBuilder);
    return this;
  }

  public ActivityPartitionBuilder withNode(org.eclipse.uml2.uml.ActivityNode p_node) {
    m_node.add(p_node);
    m_featureNodeSet = true;
    return this;
  }

  public ActivityPartitionBuilder withNode(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityNode> p_node) {
    m_node.addAll(p_node);
    m_featureNodeSet = true;
    return this;
  }

  public ActivityPartitionBuilder withNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> p_activityNodeBuilder) {
    m_featureNodeBuilder.add(p_activityNodeBuilder);
    return this;
  }

  public ActivityPartitionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ActivityPartitionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ActivityPartitionBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ActivityPartitionBuilder withSubpartition(org.eclipse.uml2.uml.ActivityPartition p_subpartition) {
    m_subpartition.add(p_subpartition);
    m_featureSubpartitionSet = true;
    return this;
  }

  public ActivityPartitionBuilder withSubpartition(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityPartition> p_subpartition) {
    m_subpartition.addAll(p_subpartition);
    m_featureSubpartitionSet = true;
    return this;
  }

  public ActivityPartitionBuilder withSubpartition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> p_activityPartitionBuilder) {
    m_featureSubpartitionBuilder.add(p_activityPartitionBuilder);
    return this;
  }
}
