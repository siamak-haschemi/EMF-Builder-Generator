package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ExceptionHandler</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ExceptionHandlerBuilder {
  // features and builders
  private org.eclipse.uml2.uml.ObjectNode m_exceptionInput;
  private org.eclipse.uml2.uml.ExecutableNode m_handlerBody;
  private org.eclipse.uml2.uml.ExecutableNode m_protectedNode;
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_exceptionType = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
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
    _builder.m_featureExceptionInputSet = m_featureExceptionInputSet;
    _builder.m_exceptionInput = m_exceptionInput;
    _builder.m_featureExceptionTypeSet = m_featureExceptionTypeSet;
    _builder.m_exceptionType = m_exceptionType;
    _builder.m_featureHandlerBodySet = m_featureHandlerBodySet;
    _builder.m_handlerBody = m_handlerBody;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureProtectedNodeSet = m_featureProtectedNodeSet;
    _builder.m_protectedNode = m_protectedNode;
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
    }
    if (m_featureHandlerBodySet) {
      _newInstance.setHandlerBody(m_handlerBody);
    }
    if (m_featureProtectedNodeSet) {
      _newInstance.setProtectedNode(m_protectedNode);
    }
    if (m_featureExceptionTypeSet) {
      _newInstance.getExceptionTypes().addAll(m_exceptionType);
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

  public ExceptionHandlerBuilder withExceptionInput(org.eclipse.uml2.uml.ObjectNode p_exceptionInput) {
    m_exceptionInput = p_exceptionInput;
    m_featureExceptionInputSet = true;
    return this;
  }

  public ExceptionHandlerBuilder withHandlerBody(org.eclipse.uml2.uml.ExecutableNode p_handlerBody) {
    m_handlerBody = p_handlerBody;
    m_featureHandlerBodySet = true;
    return this;
  }

  public ExceptionHandlerBuilder withProtectedNode(org.eclipse.uml2.uml.ExecutableNode p_protectedNode) {
    m_protectedNode = p_protectedNode;
    m_featureProtectedNodeSet = true;
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

  public ExceptionHandlerBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
