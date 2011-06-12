package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.TemplateParameterSubstitution</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class TemplateParameterSubstitutionBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.TemplateParameterSubstitution> {
  // features and builders
  private org.eclipse.uml2.uml.ParameterableElement m_actual;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> m_featureActualBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_formal;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureFormalBuilder;
  private org.eclipse.uml2.uml.ParameterableElement m_ownedActual;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> m_featureOwnedActualBuilder;
  private org.eclipse.uml2.uml.TemplateBinding m_templateBinding;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding> m_featureTemplateBindingBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureActualSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureFormalSet = false;
  private boolean m_featureOwnedActualSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureTemplateBindingSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newTemplateParameterSubstitutionBuilder()
   */
  private TemplateParameterSubstitutionBuilder() {
  }

  /**
   * This method creates a new instance of the TemplateParameterSubstitutionBuilder.
   * @return new instance of the TemplateParameterSubstitutionBuilder
   */
  public static TemplateParameterSubstitutionBuilder newTemplateParameterSubstitutionBuilder() {
    return new TemplateParameterSubstitutionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public TemplateParameterSubstitutionBuilder but() {
    TemplateParameterSubstitutionBuilder _builder = newTemplateParameterSubstitutionBuilder();
    _builder.m_featureActualSet = m_featureActualSet;
    _builder.m_actual = m_actual;
    _builder.m_featureActualBuilder = m_featureActualBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureFormalSet = m_featureFormalSet;
    _builder.m_formal = m_formal;
    _builder.m_featureFormalBuilder = m_featureFormalBuilder;
    _builder.m_featureOwnedActualSet = m_featureOwnedActualSet;
    _builder.m_ownedActual = m_ownedActual;
    _builder.m_featureOwnedActualBuilder = m_featureOwnedActualBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureTemplateBindingSet = m_featureTemplateBindingSet;
    _builder.m_templateBinding = m_templateBinding;
    _builder.m_featureTemplateBindingBuilder = m_featureTemplateBindingBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.TemplateParameterSubstitution type.
   * @return new instance of the org.eclipse.uml2.uml.TemplateParameterSubstitution type
   */
  public org.eclipse.uml2.uml.TemplateParameterSubstitution build() {
    final org.eclipse.uml2.uml.TemplateParameterSubstitution _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createTemplateParameterSubstitution();
    if (m_featureActualSet) {
      _newInstance.setActual(m_actual);
    } else {
      if (m_featureActualBuilder != null) {
        _newInstance.setActual(m_featureActualBuilder.build());
      }
    }
    if (m_featureFormalSet) {
      _newInstance.setFormal(m_formal);
    } else {
      if (m_featureFormalBuilder != null) {
        _newInstance.setFormal(m_featureFormalBuilder.build());
      }
    }
    if (m_featureOwnedActualSet) {
      _newInstance.setOwnedActual(m_ownedActual);
    } else {
      if (m_featureOwnedActualBuilder != null) {
        _newInstance.setOwnedActual(m_featureOwnedActualBuilder.build());
      }
    }
    if (m_featureTemplateBindingSet) {
      _newInstance.setTemplateBinding(m_templateBinding);
    } else {
      if (m_featureTemplateBindingBuilder != null) {
        _newInstance.setTemplateBinding(m_featureTemplateBindingBuilder.build());
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

  public TemplateParameterSubstitutionBuilder withActual(org.eclipse.uml2.uml.ParameterableElement p_actual) {
    m_actual = p_actual;
    m_featureActualSet = true;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withActual(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> p_parameterableElementBuilder) {
    m_featureActualBuilder = p_parameterableElementBuilder;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withFormal(org.eclipse.uml2.uml.TemplateParameter p_formal) {
    m_formal = p_formal;
    m_featureFormalSet = true;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withFormal(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureFormalBuilder = p_templateParameterBuilder;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withOwnedActual(org.eclipse.uml2.uml.ParameterableElement p_ownedActual) {
    m_ownedActual = p_ownedActual;
    m_featureOwnedActualSet = true;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withOwnedActual(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> p_parameterableElementBuilder) {
    m_featureOwnedActualBuilder = p_parameterableElementBuilder;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withTemplateBinding(org.eclipse.uml2.uml.TemplateBinding p_templateBinding) {
    m_templateBinding = p_templateBinding;
    m_featureTemplateBindingSet = true;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withTemplateBinding(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBindingBuilder) {
    m_featureTemplateBindingBuilder = p_templateBindingBuilder;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public TemplateParameterSubstitutionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public TemplateParameterSubstitutionBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
