package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.InformationFlow</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class InformationFlowBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.InformationFlow> {
  // features and builders
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_conveyed = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>> m_featureConveyedBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.NamedElement> m_informationSource = new java.util.LinkedList<org.eclipse.uml2.uml.NamedElement>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement>> m_featureInformationSourceBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement>>();
  private java.util.Collection<org.eclipse.uml2.uml.NamedElement> m_informationTarget = new java.util.LinkedList<org.eclipse.uml2.uml.NamedElement>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement>> m_featureInformationTargetBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.Relationship> m_realization = new java.util.LinkedList<org.eclipse.uml2.uml.Relationship>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Relationship>> m_featureRealizationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Relationship>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_realizingActivityEdge = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureRealizingActivityEdgeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  private java.util.Collection<org.eclipse.uml2.uml.Connector> m_realizingConnector = new java.util.LinkedList<org.eclipse.uml2.uml.Connector>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector>> m_featureRealizingConnectorBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector>>();
  private java.util.Collection<org.eclipse.uml2.uml.Message> m_realizingMessage = new java.util.LinkedList<org.eclipse.uml2.uml.Message>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Message>> m_featureRealizingMessageBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Message>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConveyedSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureInformationSourceSet = false;
  private boolean m_featureInformationTargetSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureRealizationSet = false;
  private boolean m_featureRealizingActivityEdgeSet = false;
  private boolean m_featureRealizingConnectorSet = false;
  private boolean m_featureRealizingMessageSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newInformationFlowBuilder()
   */
  private InformationFlowBuilder() {
  }

  /**
   * This method creates a new instance of the InformationFlowBuilder.
   * @return new instance of the InformationFlowBuilder
   */
  public static InformationFlowBuilder newInformationFlowBuilder() {
    return new InformationFlowBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public InformationFlowBuilder but() {
    InformationFlowBuilder _builder = newInformationFlowBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureConveyedSet = m_featureConveyedSet;
    _builder.m_conveyed = m_conveyed;
    _builder.m_featureConveyedBuilder = m_featureConveyedBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureInformationSourceSet = m_featureInformationSourceSet;
    _builder.m_informationSource = m_informationSource;
    _builder.m_featureInformationSourceBuilder = m_featureInformationSourceBuilder;
    _builder.m_featureInformationTargetSet = m_featureInformationTargetSet;
    _builder.m_informationTarget = m_informationTarget;
    _builder.m_featureInformationTargetBuilder = m_featureInformationTargetBuilder;
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
    _builder.m_featureRealizationSet = m_featureRealizationSet;
    _builder.m_realization = m_realization;
    _builder.m_featureRealizationBuilder = m_featureRealizationBuilder;
    _builder.m_featureRealizingActivityEdgeSet = m_featureRealizingActivityEdgeSet;
    _builder.m_realizingActivityEdge = m_realizingActivityEdge;
    _builder.m_featureRealizingActivityEdgeBuilder = m_featureRealizingActivityEdgeBuilder;
    _builder.m_featureRealizingConnectorSet = m_featureRealizingConnectorSet;
    _builder.m_realizingConnector = m_realizingConnector;
    _builder.m_featureRealizingConnectorBuilder = m_featureRealizingConnectorBuilder;
    _builder.m_featureRealizingMessageSet = m_featureRealizingMessageSet;
    _builder.m_realizingMessage = m_realizingMessage;
    _builder.m_featureRealizingMessageBuilder = m_featureRealizingMessageBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.InformationFlow type.
   * @return new instance of the org.eclipse.uml2.uml.InformationFlow type
   */
  public org.eclipse.uml2.uml.InformationFlow build() {
    final org.eclipse.uml2.uml.InformationFlow _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInformationFlow();
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
    if (m_featureClientDependencySet) {
      _newInstance.getClientDependencies().addAll(m_clientDependency);
    } else {
      if (!m_featureClientDependencyBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureConveyedSet) {
      _newInstance.getConveyeds().addAll(m_conveyed);
    } else {
      if (!m_featureConveyedBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> builder : m_featureConveyedBuilder) {
          _newInstance.getConveyeds().add(builder.build());
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
    if (m_featureInformationSourceSet) {
      _newInstance.getInformationSources().addAll(m_informationSource);
    } else {
      if (!m_featureInformationSourceBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement> builder : m_featureInformationSourceBuilder) {
          _newInstance.getInformationSources().add(builder.build());
        }
      }
    }
    if (m_featureInformationTargetSet) {
      _newInstance.getInformationTargets().addAll(m_informationTarget);
    } else {
      if (!m_featureInformationTargetBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement> builder : m_featureInformationTargetBuilder) {
          _newInstance.getInformationTargets().add(builder.build());
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
    if (m_featureRealizationSet) {
      _newInstance.getRealizations().addAll(m_realization);
    } else {
      if (!m_featureRealizationBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Relationship> builder : m_featureRealizationBuilder) {
          _newInstance.getRealizations().add(builder.build());
        }
      }
    }
    if (m_featureRealizingActivityEdgeSet) {
      _newInstance.getRealizingActivityEdges().addAll(m_realizingActivityEdge);
    } else {
      if (!m_featureRealizingActivityEdgeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureRealizingActivityEdgeBuilder) {
          _newInstance.getRealizingActivityEdges().add(builder.build());
        }
      }
    }
    if (m_featureRealizingConnectorSet) {
      _newInstance.getRealizingConnectors().addAll(m_realizingConnector);
    } else {
      if (!m_featureRealizingConnectorBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector> builder : m_featureRealizingConnectorBuilder) {
          _newInstance.getRealizingConnectors().add(builder.build());
        }
      }
    }
    if (m_featureRealizingMessageSet) {
      _newInstance.getRealizingMessages().addAll(m_realizingMessage);
    } else {
      if (!m_featureRealizingMessageBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Message> builder : m_featureRealizingMessageBuilder) {
          _newInstance.getRealizingMessages().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public InformationFlowBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public InformationFlowBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public InformationFlowBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public InformationFlowBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public InformationFlowBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InformationFlowBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public InformationFlowBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InformationFlowBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public InformationFlowBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InformationFlowBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InformationFlowBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public InformationFlowBuilder withConveyed(org.eclipse.uml2.uml.Classifier p_conveyed) {
    m_conveyed.add(p_conveyed);
    m_featureConveyedSet = true;
    return this;
  }

  public InformationFlowBuilder withConveyed(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_conveyed) {
    m_conveyed.addAll(p_conveyed);
    m_featureConveyedSet = true;
    return this;
  }

  public InformationFlowBuilder withConveyed(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> p_classifierBuilder) {
    m_featureConveyedBuilder.add(p_classifierBuilder);
    return this;
  }

  public InformationFlowBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public InformationFlowBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public InformationFlowBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public InformationFlowBuilder withInformationSource(org.eclipse.uml2.uml.NamedElement p_informationSource) {
    m_informationSource.add(p_informationSource);
    m_featureInformationSourceSet = true;
    return this;
  }

  public InformationFlowBuilder withInformationSource(java.util.Collection<? extends org.eclipse.uml2.uml.NamedElement> p_informationSource) {
    m_informationSource.addAll(p_informationSource);
    m_featureInformationSourceSet = true;
    return this;
  }

  public InformationFlowBuilder withInformationSource(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement> p_namedElementBuilder) {
    m_featureInformationSourceBuilder.add(p_namedElementBuilder);
    return this;
  }

  public InformationFlowBuilder withInformationTarget(org.eclipse.uml2.uml.NamedElement p_informationTarget) {
    m_informationTarget.add(p_informationTarget);
    m_featureInformationTargetSet = true;
    return this;
  }

  public InformationFlowBuilder withInformationTarget(java.util.Collection<? extends org.eclipse.uml2.uml.NamedElement> p_informationTarget) {
    m_informationTarget.addAll(p_informationTarget);
    m_featureInformationTargetSet = true;
    return this;
  }

  public InformationFlowBuilder withInformationTarget(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.NamedElement> p_namedElementBuilder) {
    m_featureInformationTargetBuilder.add(p_namedElementBuilder);
    return this;
  }

  public InformationFlowBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InformationFlowBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InformationFlowBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public InformationFlowBuilder withRealization(org.eclipse.uml2.uml.Relationship p_realization) {
    m_realization.add(p_realization);
    m_featureRealizationSet = true;
    return this;
  }

  public InformationFlowBuilder withRealization(java.util.Collection<? extends org.eclipse.uml2.uml.Relationship> p_realization) {
    m_realization.addAll(p_realization);
    m_featureRealizationSet = true;
    return this;
  }

  public InformationFlowBuilder withRealization(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Relationship> p_relationshipBuilder) {
    m_featureRealizationBuilder.add(p_relationshipBuilder);
    return this;
  }

  public InformationFlowBuilder withRealizingActivityEdge(org.eclipse.uml2.uml.ActivityEdge p_realizingActivityEdge) {
    m_realizingActivityEdge.add(p_realizingActivityEdge);
    m_featureRealizingActivityEdgeSet = true;
    return this;
  }

  public InformationFlowBuilder withRealizingActivityEdge(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_realizingActivityEdge) {
    m_realizingActivityEdge.addAll(p_realizingActivityEdge);
    m_featureRealizingActivityEdgeSet = true;
    return this;
  }

  public InformationFlowBuilder withRealizingActivityEdge(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureRealizingActivityEdgeBuilder.add(p_activityEdgeBuilder);
    return this;
  }

  public InformationFlowBuilder withRealizingConnector(org.eclipse.uml2.uml.Connector p_realizingConnector) {
    m_realizingConnector.add(p_realizingConnector);
    m_featureRealizingConnectorSet = true;
    return this;
  }

  public InformationFlowBuilder withRealizingConnector(java.util.Collection<? extends org.eclipse.uml2.uml.Connector> p_realizingConnector) {
    m_realizingConnector.addAll(p_realizingConnector);
    m_featureRealizingConnectorSet = true;
    return this;
  }

  public InformationFlowBuilder withRealizingConnector(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector> p_connectorBuilder) {
    m_featureRealizingConnectorBuilder.add(p_connectorBuilder);
    return this;
  }

  public InformationFlowBuilder withRealizingMessage(org.eclipse.uml2.uml.Message p_realizingMessage) {
    m_realizingMessage.add(p_realizingMessage);
    m_featureRealizingMessageSet = true;
    return this;
  }

  public InformationFlowBuilder withRealizingMessage(java.util.Collection<? extends org.eclipse.uml2.uml.Message> p_realizingMessage) {
    m_realizingMessage.addAll(p_realizingMessage);
    m_featureRealizingMessageSet = true;
    return this;
  }

  public InformationFlowBuilder withRealizingMessage(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Message> p_messageBuilder) {
    m_featureRealizingMessageBuilder.add(p_messageBuilder);
    return this;
  }
}
