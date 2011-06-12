package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.TemplateBinding</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TemplateBindingBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.TemplateBinding> {
  // features and builders
  private org.eclipse.uml2.uml.TemplateableElement m_boundElement;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateableElement> m_featureBoundElementBuilder;
  private org.eclipse.uml2.uml.TemplateSignature m_signature;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateSignature> m_featureSignatureBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateParameterSubstitution> m_parameterSubstitution = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateParameterSubstitution>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameterSubstitution>> m_featureParameterSubstitutionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameterSubstitution>>();
  // helper attributes
  private boolean m_featureBoundElementSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureParameterSubstitutionSet = false;
  private boolean m_featureSignatureSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newTemplateBindingBuilder()
   */
  private TemplateBindingBuilder() {
  }

  /**
   * This method creates a new instance of the TemplateBindingBuilder.
   * @return new instance of the TemplateBindingBuilder
   */
  public static TemplateBindingBuilder newTemplateBindingBuilder() {
    return new TemplateBindingBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public TemplateBindingBuilder but() {
    TemplateBindingBuilder _builder = newTemplateBindingBuilder();
    _builder.m_featureBoundElementSet = m_featureBoundElementSet;
    _builder.m_boundElement = m_boundElement;
    _builder.m_featureBoundElementBuilder = m_featureBoundElementBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureParameterSubstitutionSet = m_featureParameterSubstitutionSet;
    _builder.m_parameterSubstitution = m_parameterSubstitution;
    _builder.m_featureParameterSubstitutionBuilder = m_featureParameterSubstitutionBuilder;
    _builder.m_featureSignatureSet = m_featureSignatureSet;
    _builder.m_signature = m_signature;
    _builder.m_featureSignatureBuilder = m_featureSignatureBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.TemplateBinding type.
   * @return new instance of the org.eclipse.uml2.uml.TemplateBinding type
   */
  public org.eclipse.uml2.uml.TemplateBinding build() {
    final org.eclipse.uml2.uml.TemplateBinding _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createTemplateBinding();
    if (m_featureBoundElementSet) {
      _newInstance.setBoundElement(m_boundElement);
    } else {
      if (m_featureBoundElementBuilder != null) {
        _newInstance.setBoundElement(m_featureBoundElementBuilder.build());
      }
    }
    if (m_featureSignatureSet) {
      _newInstance.setSignature(m_signature);
    } else {
      if (m_featureSignatureBuilder != null) {
        _newInstance.setSignature(m_featureSignatureBuilder.build());
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
    if (m_featureParameterSubstitutionSet) {
      _newInstance.getParameterSubstitutions().addAll(m_parameterSubstitution);
    } else {
      if (!m_featureParameterSubstitutionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameterSubstitution> builder : m_featureParameterSubstitutionBuilder) {
          _newInstance.getParameterSubstitutions().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public TemplateBindingBuilder withBoundElement(org.eclipse.uml2.uml.TemplateableElement p_boundElement) {
    m_boundElement = p_boundElement;
    m_featureBoundElementSet = true;
    return this;
  }

  public TemplateBindingBuilder withBoundElement(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateableElement> p_templateableElementBuilder) {
    m_featureBoundElementBuilder = p_templateableElementBuilder;
    return this;
  }

  public TemplateBindingBuilder withSignature(org.eclipse.uml2.uml.TemplateSignature p_signature) {
    m_signature = p_signature;
    m_featureSignatureSet = true;
    return this;
  }

  public TemplateBindingBuilder withSignature(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateSignature> p_templateSignatureBuilder) {
    m_featureSignatureBuilder = p_templateSignatureBuilder;
    return this;
  }

  public TemplateBindingBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public TemplateBindingBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public TemplateBindingBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public TemplateBindingBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public TemplateBindingBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public TemplateBindingBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public TemplateBindingBuilder withParameterSubstitution(org.eclipse.uml2.uml.TemplateParameterSubstitution p_parameterSubstitution) {
    m_parameterSubstitution.add(p_parameterSubstitution);
    m_featureParameterSubstitutionSet = true;
    return this;
  }

  public TemplateBindingBuilder withParameterSubstitution(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateParameterSubstitution> p_parameterSubstitution) {
    m_parameterSubstitution.addAll(p_parameterSubstitution);
    m_featureParameterSubstitutionSet = true;
    return this;
  }

  public TemplateBindingBuilder withParameterSubstitution(
      org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameterSubstitution> p_templateParameterSubstitutionBuilder) {
    m_featureParameterSubstitutionBuilder.add(p_templateParameterSubstitutionBuilder);
    return this;
  }
}
