package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.InterruptibleActivityRegion</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class InterruptibleActivityRegionBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_inActivity;
  private org.eclipse.uml2.uml.util.builder.ActivityBuilder m_featureInActivityBuilder;
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_interruptingEdge = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityNode> m_node = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityNode>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
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
    _builder.m_featureInActivitySet = m_featureInActivitySet;
    _builder.m_inActivity = m_inActivity;
    _builder.m_featureInActivityBuilder = m_featureInActivityBuilder;
    _builder.m_featureInterruptingEdgeSet = m_featureInterruptingEdgeSet;
    _builder.m_interruptingEdge = m_interruptingEdge;
    _builder.m_featureNodeSet = m_featureNodeSet;
    _builder.m_node = m_node;
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
    if (m_featureInterruptingEdgeSet) {
      _newInstance.getInterruptingEdges().addAll(m_interruptingEdge);
    }
    if (m_featureNodeSet) {
      _newInstance.getNodes().addAll(m_node);
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

  public InterruptibleActivityRegionBuilder withInActivity(org.eclipse.uml2.uml.Activity p_inActivity) {
    m_inActivity = p_inActivity;
    m_featureInActivitySet = true;
    return this;
  }

  public InterruptibleActivityRegionBuilder withInActivity(org.eclipse.uml2.uml.util.builder.ActivityBuilder p_activityBuilder) {
    m_featureInActivityBuilder = p_activityBuilder;
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

  public InterruptibleActivityRegionBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
