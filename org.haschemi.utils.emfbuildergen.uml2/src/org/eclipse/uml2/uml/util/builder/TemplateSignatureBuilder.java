package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.TemplateSignature</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TemplateSignatureBuilder {
  // features and builders
  private org.eclipse.uml2.uml.TemplateableElement m_template;
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateParameter> m_ownedParameter = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateParameter>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder> m_featureOwnedParameterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateParameter> m_parameter = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateParameter>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder> m_featureParameterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder>();
  // helper attributes
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedParameterSet = false;
  private boolean m_featureParameterSet = false;
  private boolean m_featureTemplateSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newTemplateSignatureBuilder()
   */
  private TemplateSignatureBuilder() {
  }

  /**
   * This method creates a new instance of the TemplateSignatureBuilder.
   * @return new instance of the TemplateSignatureBuilder
   */
  public static TemplateSignatureBuilder newTemplateSignatureBuilder() {
    return new TemplateSignatureBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public TemplateSignatureBuilder but() {
    TemplateSignatureBuilder _builder = newTemplateSignatureBuilder();
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedParameterSet = m_featureOwnedParameterSet;
    _builder.m_ownedParameter = m_ownedParameter;
    _builder.m_featureOwnedParameterBuilder = m_featureOwnedParameterBuilder;
    _builder.m_featureParameterSet = m_featureParameterSet;
    _builder.m_parameter = m_parameter;
    _builder.m_featureParameterBuilder = m_featureParameterBuilder;
    _builder.m_featureTemplateSet = m_featureTemplateSet;
    _builder.m_template = m_template;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.TemplateSignature type.
   * @return new instance of the org.eclipse.uml2.uml.TemplateSignature type
   */
  public org.eclipse.uml2.uml.TemplateSignature build() {
    final org.eclipse.uml2.uml.TemplateSignature _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createTemplateSignature();
    if (m_featureTemplateSet) {
      _newInstance.setTemplate(m_template);
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
    if (m_featureOwnedParameterSet) {
      _newInstance.getOwnedParameters().addAll(m_ownedParameter);
    } else {
      if (!m_featureOwnedParameterBuilder.isEmpty()) {
        for (TemplateParameterBuilder builder : m_featureOwnedParameterBuilder) {
          _newInstance.getOwnedParameters().add(builder.build());
        }
      }
    }
    if (m_featureParameterSet) {
      _newInstance.getParameters().addAll(m_parameter);
    } else {
      if (!m_featureParameterBuilder.isEmpty()) {
        for (TemplateParameterBuilder builder : m_featureParameterBuilder) {
          _newInstance.getParameters().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public TemplateSignatureBuilder withTemplate(org.eclipse.uml2.uml.TemplateableElement p_template) {
    m_template = p_template;
    m_featureTemplateSet = true;
    return this;
  }

  public TemplateSignatureBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public TemplateSignatureBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public TemplateSignatureBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public TemplateSignatureBuilder withOwnedParameter(org.eclipse.uml2.uml.TemplateParameter p_ownedParameter) {
    m_ownedParameter.add(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public TemplateSignatureBuilder withOwnedParameter(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateParameter> p_ownedParameter) {
    m_ownedParameter.addAll(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public TemplateSignatureBuilder withOwnedParameter(TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwnedParameterBuilder.add(p_templateParameterBuilder);
    return this;
  }

  public TemplateSignatureBuilder withParameter(org.eclipse.uml2.uml.TemplateParameter p_parameter) {
    m_parameter.add(p_parameter);
    m_featureParameterSet = true;
    return this;
  }

  public TemplateSignatureBuilder withParameter(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateParameter> p_parameter) {
    m_parameter.addAll(p_parameter);
    m_featureParameterSet = true;
    return this;
  }

  public TemplateSignatureBuilder withParameter(TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureParameterBuilder.add(p_templateParameterBuilder);
    return this;
  }
}
