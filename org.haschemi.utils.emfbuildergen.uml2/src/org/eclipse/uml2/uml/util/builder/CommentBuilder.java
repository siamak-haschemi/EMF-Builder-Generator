package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Comment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class CommentBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.Comment> {
  // features and builders
  private java.lang.String m_body;
  private java.util.Collection<org.eclipse.uml2.uml.Element> m_annotatedElement = new java.util.LinkedList<org.eclipse.uml2.uml.Element>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element>> m_featureAnnotatedElementBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureAnnotatedElementSet = false;
  private boolean m_featureBodySet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureOwnedCommentSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newCommentBuilder()
   */
  private CommentBuilder() {
  }

  /**
   * This method creates a new instance of the CommentBuilder.
   * @return new instance of the CommentBuilder
   */
  public static CommentBuilder newCommentBuilder() {
    return new CommentBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public CommentBuilder but() {
    CommentBuilder _builder = newCommentBuilder();
    _builder.m_featureAnnotatedElementSet = m_featureAnnotatedElementSet;
    _builder.m_annotatedElement = m_annotatedElement;
    _builder.m_featureAnnotatedElementBuilder = m_featureAnnotatedElementBuilder;
    _builder.m_featureBodySet = m_featureBodySet;
    _builder.m_body = m_body;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Comment type.
   * @return new instance of the org.eclipse.uml2.uml.Comment type
   */
  public org.eclipse.uml2.uml.Comment build() {
    final org.eclipse.uml2.uml.Comment _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createComment();
    if (m_featureBodySet) {
      _newInstance.setBody(m_body);
    }
    if (m_featureAnnotatedElementSet) {
      _newInstance.getAnnotatedElements().addAll(m_annotatedElement);
    } else {
      if (!m_featureAnnotatedElementBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element> builder : m_featureAnnotatedElementBuilder) {
          _newInstance.getAnnotatedElements().add(builder.build());
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

  public CommentBuilder withBody(java.lang.String p_body) {
    m_body = p_body;
    m_featureBodySet = true;
    return this;
  }

  public CommentBuilder withAnnotatedElement(org.eclipse.uml2.uml.Element p_annotatedElement) {
    m_annotatedElement.add(p_annotatedElement);
    m_featureAnnotatedElementSet = true;
    return this;
  }

  public CommentBuilder withAnnotatedElement(java.util.Collection<? extends org.eclipse.uml2.uml.Element> p_annotatedElement) {
    m_annotatedElement.addAll(p_annotatedElement);
    m_featureAnnotatedElementSet = true;
    return this;
  }

  public CommentBuilder withAnnotatedElement(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element> p_elementBuilder) {
    m_featureAnnotatedElementBuilder.add(p_elementBuilder);
    return this;
  }

  public CommentBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public CommentBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public CommentBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public CommentBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public CommentBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public CommentBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
