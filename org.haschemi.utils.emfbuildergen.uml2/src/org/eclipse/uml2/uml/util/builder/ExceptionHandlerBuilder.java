package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ExceptionHandler</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExceptionHandlerBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ExceptionHandler> {
  // features and builders
  private org.eclipse.uml2.uml.ObjectNode m_exceptionInput;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ObjectNode> m_featureExceptionInputBuilder;
  private org.eclipse.uml2.uml.ExecutableNode m_handlerBody;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExecutableNode> m_featureHandlerBodyBuilder;
  private org.eclipse.uml2.uml.ExecutableNode m_protectedNode;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExecutableNode> m_featureProtectedNodeBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_exceptionType = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>> m_featureExceptionTypeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureExceptionInputSet = false;
  private boolean m_featureExceptionTypeSet = false;
  private boolean m_featureHandlerBodySet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureProtectedNodeSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newExceptionHandlerBuilder()
   */
  private ExceptionHandlerBuilder() {
  }

  /**
   * This method creates a new instance of the ExceptionHandlerBuilder.
   * @return new instance of the ExceptionHandlerBuilder
   */
  public static ExceptionHandlerBuilder newExceptionHandlerBuilder() {
    return new ExceptionHandlerBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ExceptionHandlerBuilder but() {
    ExceptionHandlerBuilder _builder = newExceptionHandlerBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureExceptionInputSet = m_featureExceptionInputSet;
    _builder.m_exceptionInput = m_exceptionInput;
    _builder.m_featureExceptionInputBuilder = m_featureExceptionInputBuilder;
    _builder.m_featureExceptionTypeSet = m_featureExceptionTypeSet;
    _builder.m_exceptionType = m_exceptionType;
    _builder.m_featureExceptionTypeBuilder = m_featureExceptionTypeBuilder;
    _builder.m_featureHandlerBodySet = m_featureHandlerBodySet;
    _builder.m_handlerBody = m_handlerBody;
    _builder.m_featureHandlerBodyBuilder = m_featureHandlerBodyBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureProtectedNodeSet = m_featureProtectedNodeSet;
    _builder.m_protectedNode = m_protectedNode;
    _builder.m_featureProtectedNodeBuilder = m_featureProtectedNodeBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ExceptionHandler type.
   * @return new instance of the org.eclipse.uml2.uml.ExceptionHandler type
   */
  public org.eclipse.uml2.uml.ExceptionHandler build() {
    final org.eclipse.uml2.uml.ExceptionHandler _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createExceptionHandler();
    if (m_featureExceptionInputSet) {
      _newInstance.setExceptionInput(m_exceptionInput);
    } else {
      if (m_featureExceptionInputBuilder != null) {
        _newInstance.setExceptionInput(m_featureExceptionInputBuilder.build());
      }
    }
    if (m_featureHandlerBodySet) {
      _newInstance.setHandlerBody(m_handlerBody);
    } else {
      if (m_featureHandlerBodyBuilder != null) {
        _newInstance.setHandlerBody(m_featureHandlerBodyBuilder.build());
      }
    }
    if (m_featureProtectedNodeSet) {
      _newInstance.setProtectedNode(m_protectedNode);
    } else {
      if (m_featureProtectedNodeBuilder != null) {
        _newInstance.setProtectedNode(m_featureProtectedNodeBuilder.build());
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
    if (m_featureExceptionTypeSet) {
      _newInstance.getExceptionTypes().addAll(m_exceptionType);
    } else {
      if (!m_featureExceptionTypeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> builder : m_featureExceptionTypeBuilder) {
          _newInstance.getExceptionTypes().add(builder.build());
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

  public ExceptionHandlerBuilder withExceptionInput(org.eclipse.uml2.uml.ObjectNode p_exceptionInput) {
    m_exceptionInput = p_exceptionInput;
    m_featureExceptionInputSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withExceptionInput(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ObjectNode> p_objectNodeBuilder) {
    m_featureExceptionInputBuilder = p_objectNodeBuilder;
    return this;
  }

  public ExceptionHandlerBuilder withHandlerBody(org.eclipse.uml2.uml.ExecutableNode p_handlerBody) {
    m_handlerBody = p_handlerBody;
    m_featureHandlerBodySet = true;
    return this;
  }

  public ExceptionHandlerBuilder withHandlerBody(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExecutableNode> p_executableNodeBuilder) {
    m_featureHandlerBodyBuilder = p_executableNodeBuilder;
    return this;
  }

  public ExceptionHandlerBuilder withProtectedNode(org.eclipse.uml2.uml.ExecutableNode p_protectedNode) {
    m_protectedNode = p_protectedNode;
    m_featureProtectedNodeSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withProtectedNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExecutableNode> p_executableNodeBuilder) {
    m_featureProtectedNodeBuilder = p_executableNodeBuilder;
    return this;
  }

  public ExceptionHandlerBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ExceptionHandlerBuilder withExceptionType(org.eclipse.uml2.uml.Classifier p_exceptionType) {
    m_exceptionType.add(p_exceptionType);
    m_featureExceptionTypeSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withExceptionType(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_exceptionType) {
    m_exceptionType.addAll(p_exceptionType);
    m_featureExceptionTypeSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withExceptionType(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> p_classifierBuilder) {
    m_featureExceptionTypeBuilder.add(p_classifierBuilder);
    return this;
  }

  public ExceptionHandlerBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
