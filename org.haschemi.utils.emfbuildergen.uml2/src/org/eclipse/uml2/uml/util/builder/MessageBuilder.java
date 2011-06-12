package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Message</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class MessageBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.Message> {
  // features and builders
  private org.eclipse.uml2.uml.Connector m_connector;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector> m_featureConnectorBuilder;
  private org.eclipse.uml2.uml.Interaction m_interaction;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Interaction> m_featureInteractionBuilder;
  private org.eclipse.uml2.uml.MessageSort m_messageSort;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.MessageEnd m_receiveEvent;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.MessageEnd> m_featureReceiveEventBuilder;
  private org.eclipse.uml2.uml.MessageEnd m_sendEvent;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.MessageEnd> m_featureSendEventBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.ValueSpecification> m_argument = new java.util.LinkedList<org.eclipse.uml2.uml.ValueSpecification>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification>> m_featureArgumentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification>>();
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureArgumentSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConnectorSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureInteractionSet = false;
  private boolean m_featureMessageSortSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureReceiveEventSet = false;
  private boolean m_featureSendEventSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newMessageBuilder()
   */
  private MessageBuilder() {
  }

  /**
   * This method creates a new instance of the MessageBuilder.
   * @return new instance of the MessageBuilder
   */
  public static MessageBuilder newMessageBuilder() {
    return new MessageBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public MessageBuilder but() {
    MessageBuilder _builder = newMessageBuilder();
    _builder.m_featureArgumentSet = m_featureArgumentSet;
    _builder.m_argument = m_argument;
    _builder.m_featureArgumentBuilder = m_featureArgumentBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureConnectorSet = m_featureConnectorSet;
    _builder.m_connector = m_connector;
    _builder.m_featureConnectorBuilder = m_featureConnectorBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureInteractionSet = m_featureInteractionSet;
    _builder.m_interaction = m_interaction;
    _builder.m_featureInteractionBuilder = m_featureInteractionBuilder;
    _builder.m_featureMessageSortSet = m_featureMessageSortSet;
    _builder.m_messageSort = m_messageSort;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureReceiveEventSet = m_featureReceiveEventSet;
    _builder.m_receiveEvent = m_receiveEvent;
    _builder.m_featureReceiveEventBuilder = m_featureReceiveEventBuilder;
    _builder.m_featureSendEventSet = m_featureSendEventSet;
    _builder.m_sendEvent = m_sendEvent;
    _builder.m_featureSendEventBuilder = m_featureSendEventBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Message type.
   * @return new instance of the org.eclipse.uml2.uml.Message type
   */
  public org.eclipse.uml2.uml.Message build() {
    final org.eclipse.uml2.uml.Message _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createMessage();
    if (m_featureConnectorSet) {
      _newInstance.setConnector(m_connector);
    } else {
      if (m_featureConnectorBuilder != null) {
        _newInstance.setConnector(m_featureConnectorBuilder.build());
      }
    }
    if (m_featureInteractionSet) {
      _newInstance.setInteraction(m_interaction);
    } else {
      if (m_featureInteractionBuilder != null) {
        _newInstance.setInteraction(m_featureInteractionBuilder.build());
      }
    }
    if (m_featureMessageSortSet) {
      _newInstance.setMessageSort(m_messageSort);
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
    if (m_featureReceiveEventSet) {
      _newInstance.setReceiveEvent(m_receiveEvent);
    } else {
      if (m_featureReceiveEventBuilder != null) {
        _newInstance.setReceiveEvent(m_featureReceiveEventBuilder.build());
      }
    }
    if (m_featureSendEventSet) {
      _newInstance.setSendEvent(m_sendEvent);
    } else {
      if (m_featureSendEventBuilder != null) {
        _newInstance.setSendEvent(m_featureSendEventBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureArgumentSet) {
      _newInstance.getArguments().addAll(m_argument);
    } else {
      if (!m_featureArgumentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> builder : m_featureArgumentBuilder) {
          _newInstance.getArguments().add(builder.build());
        }
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

  public MessageBuilder withConnector(org.eclipse.uml2.uml.Connector p_connector) {
    m_connector = p_connector;
    m_featureConnectorSet = true;
    return this;
  }

  public MessageBuilder withConnector(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector> p_connectorBuilder) {
    m_featureConnectorBuilder = p_connectorBuilder;
    return this;
  }

  public MessageBuilder withInteraction(org.eclipse.uml2.uml.Interaction p_interaction) {
    m_interaction = p_interaction;
    m_featureInteractionSet = true;
    return this;
  }

  public MessageBuilder withInteraction(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Interaction> p_interactionBuilder) {
    m_featureInteractionBuilder = p_interactionBuilder;
    return this;
  }

  public MessageBuilder withMessageSort(org.eclipse.uml2.uml.MessageSort p_messageSort) {
    m_messageSort = p_messageSort;
    m_featureMessageSortSet = true;
    return this;
  }

  public MessageBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public MessageBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public MessageBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public MessageBuilder withReceiveEvent(org.eclipse.uml2.uml.MessageEnd p_receiveEvent) {
    m_receiveEvent = p_receiveEvent;
    m_featureReceiveEventSet = true;
    return this;
  }

  public MessageBuilder withReceiveEvent(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.MessageEnd> p_messageEndBuilder) {
    m_featureReceiveEventBuilder = p_messageEndBuilder;
    return this;
  }

  public MessageBuilder withSendEvent(org.eclipse.uml2.uml.MessageEnd p_sendEvent) {
    m_sendEvent = p_sendEvent;
    m_featureSendEventSet = true;
    return this;
  }

  public MessageBuilder withSendEvent(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.MessageEnd> p_messageEndBuilder) {
    m_featureSendEventBuilder = p_messageEndBuilder;
    return this;
  }

  public MessageBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public MessageBuilder withArgument(org.eclipse.uml2.uml.ValueSpecification p_argument) {
    m_argument.add(p_argument);
    m_featureArgumentSet = true;
    return this;
  }

  public MessageBuilder withArgument(java.util.Collection<? extends org.eclipse.uml2.uml.ValueSpecification> p_argument) {
    m_argument.addAll(p_argument);
    m_featureArgumentSet = true;
    return this;
  }

  public MessageBuilder withArgument(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> p_valueSpecificationBuilder) {
    m_featureArgumentBuilder.add(p_valueSpecificationBuilder);
    return this;
  }

  public MessageBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public MessageBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public MessageBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public MessageBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public MessageBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public MessageBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public MessageBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public MessageBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public MessageBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
