package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.InterruptibleActivityRegion</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class InterruptibleActivityRegionBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.InterruptibleActivityRegion> {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_inActivity;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> m_featureInActivityBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_interruptingEdge = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureInterruptingEdgeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityNode> m_node = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityNode>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>> m_featureNodeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureInActivitySet = false;
  private boolean m_featureInterruptingEdgeSet = false;
  private boolean m_featureNodeSet = false;
  private boolean m_featureOwnedCommentSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newInterruptibleActivityRegionBuilder()
   */
  private InterruptibleActivityRegionBuilder() {
  }

  /**
   * This method creates a new instance of the InterruptibleActivityRegionBuilder.
   * @return new instance of the InterruptibleActivityRegionBuilder
   */
  public static InterruptibleActivityRegionBuilder newInterruptibleActivityRegionBuilder() {
    return new InterruptibleActivityRegionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public InterruptibleActivityRegionBuilder but() {
    InterruptibleActivityRegionBuilder _builder = newInterruptibleActivityRegionBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureInActivitySet = m_featureInActivitySet;
    _builder.m_inActivity = m_inActivity;
    _builder.m_featureInActivityBuilder = m_featureInActivityBuilder;
    _builder.m_featureInterruptingEdgeSet = m_featureInterruptingEdgeSet;
    _builder.m_interruptingEdge = m_interruptingEdge;
    _builder.m_featureInterruptingEdgeBuilder = m_featureInterruptingEdgeBuilder;
    _builder.m_featureNodeSet = m_featureNodeSet;
    _builder.m_node = m_node;
    _builder.m_featureNodeBuilder = m_featureNodeBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.InterruptibleActivityRegion type.
   * @return new instance of the org.eclipse.uml2.uml.InterruptibleActivityRegion type
   */
  public org.eclipse.uml2.uml.InterruptibleActivityRegion build() {
    final org.eclipse.uml2.uml.InterruptibleActivityRegion _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInterruptibleActivityRegion();
    if (m_featureInActivitySet) {
      _newInstance.setInActivity(m_inActivity);
    } else {
      if (m_featureInActivityBuilder != null) {
        _newInstance.setInActivity(m_featureInActivityBuilder.build());
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
    if (m_featureInterruptingEdgeSet) {
      _newInstance.getInterruptingEdges().addAll(m_interruptingEdge);
    } else {
      if (!m_featureInterruptingEdgeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureInterruptingEdgeBuilder) {
          _newInstance.getInterruptingEdges().add(builder.build());
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
    return _newInstance;
  }

  public InterruptibleActivityRegionBuilder withInActivity(org.eclipse.uml2.uml.Activity p_inActivity) {
    m_inActivity = p_inActivity;
    m_featureInActivitySet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withInActivity(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> p_activityBuilder) {
    m_featureInActivityBuilder = p_activityBuilder;
    return this;
  }

  public InterruptibleActivityRegionBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public InterruptibleActivityRegionBuilder withInterruptingEdge(org.eclipse.uml2.uml.ActivityEdge p_interruptingEdge) {
    m_interruptingEdge.add(p_interruptingEdge);
    m_featureInterruptingEdgeSet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withInterruptingEdge(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_interruptingEdge) {
    m_interruptingEdge.addAll(p_interruptingEdge);
    m_featureInterruptingEdgeSet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withInterruptingEdge(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureInterruptingEdgeBuilder.add(p_activityEdgeBuilder);
    return this;
  }

  public InterruptibleActivityRegionBuilder withNode(org.eclipse.uml2.uml.ActivityNode p_node) {
    m_node.add(p_node);
    m_featureNodeSet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withNode(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityNode> p_node) {
    m_node.addAll(p_node);
    m_featureNodeSet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> p_activityNodeBuilder) {
    m_featureNodeBuilder.add(p_activityNodeBuilder);
    return this;
  }

  public InterruptibleActivityRegionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
