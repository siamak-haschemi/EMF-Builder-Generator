package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.InstanceSpecification</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class InstanceSpecificationBuilder {
  // features and builders
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.ValueSpecification m_specification;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_classifier = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Deployment> m_deployment = new java.util.LinkedList<org.eclipse.uml2.uml.Deployment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DeploymentBuilder> m_featureDeploymentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DeploymentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Slot> m_slot = new java.util.LinkedList<org.eclipse.uml2.uml.Slot>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.SlotBuilder> m_featureSlotBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.SlotBuilder>();
  // helper attributes
  private boolean m_featureClassifierSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureDeploymentSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureSlotSet = false;
  private boolean m_featureSpecificationSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newInstanceSpecificationBuilder()
   */
  private InstanceSpecificationBuilder() {
  }

  /**
   * This method creates a new instance of the InstanceSpecificationBuilder.
   * @return new instance of the InstanceSpecificationBuilder
   */
  public static InstanceSpecificationBuilder newInstanceSpecificationBuilder() {
    return new InstanceSpecificationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public InstanceSpecificationBuilder but() {
    InstanceSpecificationBuilder _builder = newInstanceSpecificationBuilder();
    _builder.m_featureClassifierSet = m_featureClassifierSet;
    _builder.m_classifier = m_classifier;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureDeploymentSet = m_featureDeploymentSet;
    _builder.m_deployment = m_deployment;
    _builder.m_featureDeploymentBuilder = m_featureDeploymentBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featureSlotSet = m_featureSlotSet;
    _builder.m_slot = m_slot;
    _builder.m_featureSlotBuilder = m_featureSlotBuilder;
    _builder.m_featureSpecificationSet = m_featureSpecificationSet;
    _builder.m_specification = m_specification;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.InstanceSpecification type.
   * @return new instance of the org.eclipse.uml2.uml.InstanceSpecification type
   */
  public org.eclipse.uml2.uml.InstanceSpecification build() {
    final org.eclipse.uml2.uml.InstanceSpecification _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInstanceSpecification();
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
    if (m_featureOwningTemplateParameterSet) {
      _newInstance.setOwningTemplateParameter(m_owningTemplateParameter);
    } else {
      if (m_featureOwningTemplateParameterBuilder != null) {
        _newInstance.setOwningTemplateParameter(m_featureOwningTemplateParameterBuilder.build());
      }
    }
    if (m_featureSpecificationSet) {
      _newInstance.setSpecification(m_specification);
    }
    if (m_featureTemplateParameterSet) {
      _newInstance.setTemplateParameter(m_templateParameter);
    } else {
      if (m_featureTemplateParameterBuilder != null) {
        _newInstance.setTemplateParameter(m_featureTemplateParameterBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureClassifierSet) {
      _newInstance.getClassifiers().addAll(m_classifier);
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
    if (m_featureDeploymentSet) {
      _newInstance.getDeployments().addAll(m_deployment);
    } else {
      if (!m_featureDeploymentBuilder.isEmpty()) {
        for (DeploymentBuilder builder : m_featureDeploymentBuilder) {
          _newInstance.getDeployments().add(builder.build());
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
    if (m_featureSlotSet) {
      _newInstance.getSlots().addAll(m_slot);
    } else {
      if (!m_featureSlotBuilder.isEmpty()) {
        for (SlotBuilder builder : m_featureSlotBuilder) {
          _newInstance.getSlots().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public InstanceSpecificationBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public InstanceSpecificationBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InstanceSpecificationBuilder withSpecification(org.eclipse.uml2.uml.ValueSpecification p_specification) {
    m_specification = p_specification;
    m_featureSpecificationSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InstanceSpecificationBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public InstanceSpecificationBuilder withClassifier(org.eclipse.uml2.uml.Classifier p_classifier) {
    m_classifier.add(p_classifier);
    m_featureClassifierSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withClassifier(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_classifier) {
    m_classifier.addAll(p_classifier);
    m_featureClassifierSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InstanceSpecificationBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InstanceSpecificationBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public InstanceSpecificationBuilder withDeployment(org.eclipse.uml2.uml.Deployment p_deployment) {
    m_deployment.add(p_deployment);
    m_featureDeploymentSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withDeployment(java.util.Collection<? extends org.eclipse.uml2.uml.Deployment> p_deployment) {
    m_deployment.addAll(p_deployment);
    m_featureDeploymentSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withDeployment(DeploymentBuilder p_deploymentBuilder) {
    m_featureDeploymentBuilder.add(p_deploymentBuilder);
    return this;
  }

  public InstanceSpecificationBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public InstanceSpecificationBuilder withSlot(org.eclipse.uml2.uml.Slot p_slot) {
    m_slot.add(p_slot);
    m_featureSlotSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withSlot(java.util.Collection<? extends org.eclipse.uml2.uml.Slot> p_slot) {
    m_slot.addAll(p_slot);
    m_featureSlotSet = true;
    return this;
  }

  public InstanceSpecificationBuilder withSlot(SlotBuilder p_slotBuilder) {
    m_featureSlotBuilder.add(p_slotBuilder);
    return this;
  }
}
