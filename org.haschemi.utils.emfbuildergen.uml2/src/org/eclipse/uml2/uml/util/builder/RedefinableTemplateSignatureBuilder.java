package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.RedefinableTemplateSignature</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class RedefinableTemplateSignatureBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.RedefinableTemplateSignature> {
  // features and builders
  private Boolean m_isLeaf;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateableElement m_template;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateableElement> m_featureTemplateBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.RedefinableTemplateSignature> m_extendedSignature = new java.util.LinkedList<org.eclipse.uml2.uml.RedefinableTemplateSignature>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.RedefinableTemplateSignature>> m_featureExtendedSignatureBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.RedefinableTemplateSignature>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateParameter> m_ownedParameter = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateParameter>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter>> m_featureOwnedParameterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter>>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateParameter> m_parameter = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateParameter>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter>> m_featureParameterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureExtendedSignatureSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedParameterSet = false;
  private boolean m_featureParameterSet = false;
  private boolean m_featureTemplateSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newRedefinableTemplateSignatureBuilder()
   */
  private RedefinableTemplateSignatureBuilder() {
  }

  /**
   * This method creates a new instance of the RedefinableTemplateSignatureBuilder.
   * @return new instance of the RedefinableTemplateSignatureBuilder
   */
  public static RedefinableTemplateSignatureBuilder newRedefinableTemplateSignatureBuilder() {
    return new RedefinableTemplateSignatureBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public RedefinableTemplateSignatureBuilder but() {
    RedefinableTemplateSignatureBuilder _builder = newRedefinableTemplateSignatureBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureExtendedSignatureSet = m_featureExtendedSignatureSet;
    _builder.m_extendedSignature = m_extendedSignature;
    _builder.m_featureExtendedSignatureBuilder = m_featureExtendedSignatureBuilder;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
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
    _builder.m_featureTemplateBuilder = m_featureTemplateBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.RedefinableTemplateSignature type.
   * @return new instance of the org.eclipse.uml2.uml.RedefinableTemplateSignature type
   */
  public org.eclipse.uml2.uml.RedefinableTemplateSignature build() {
    final org.eclipse.uml2.uml.RedefinableTemplateSignature _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createRedefinableTemplateSignature();
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
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
    if (m_featureTemplateSet) {
      _newInstance.setTemplate(m_template);
    } else {
      if (m_featureTemplateBuilder != null) {
        _newInstance.setTemplate(m_featureTemplateBuilder.build());
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
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    if (m_featureExtendedSignatureSet) {
      _newInstance.getExtendedSignatures().addAll(m_extendedSignature);
    } else {
      if (!m_featureExtendedSignatureBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.RedefinableTemplateSignature> builder : m_featureExtendedSignatureBuilder) {
          _newInstance.getExtendedSignatures().add(builder.build());
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
    if (m_featureOwnedParameterSet) {
      _newInstance.getOwnedParameters().addAll(m_ownedParameter);
    } else {
      if (!m_featureOwnedParameterBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> builder : m_featureOwnedParameterBuilder) {
          _newInstance.getOwnedParameters().add(builder.build());
        }
      }
    }
    if (m_featureParameterSet) {
      _newInstance.getParameters().addAll(m_parameter);
    } else {
      if (!m_featureParameterBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> builder : m_featureParameterBuilder) {
          _newInstance.getParameters().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public RedefinableTemplateSignatureBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withTemplate(org.eclipse.uml2.uml.TemplateableElement p_template) {
    m_template = p_template;
    m_featureTemplateSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withTemplate(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateableElement> p_templateableElementBuilder) {
    m_featureTemplateBuilder = p_templateableElementBuilder;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public RedefinableTemplateSignatureBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public RedefinableTemplateSignatureBuilder withExtendedSignature(org.eclipse.uml2.uml.RedefinableTemplateSignature p_extendedSignature) {
    m_extendedSignature.add(p_extendedSignature);
    m_featureExtendedSignatureSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withExtendedSignature(java.util.Collection<? extends org.eclipse.uml2.uml.RedefinableTemplateSignature> p_extendedSignature) {
    m_extendedSignature.addAll(p_extendedSignature);
    m_featureExtendedSignatureSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withExtendedSignature(
      org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.RedefinableTemplateSignature> p_redefinableTemplateSignatureBuilder) {
    m_featureExtendedSignatureBuilder.add(p_redefinableTemplateSignatureBuilder);
    return this;
  }

  public RedefinableTemplateSignatureBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public RedefinableTemplateSignatureBuilder withOwnedParameter(org.eclipse.uml2.uml.TemplateParameter p_ownedParameter) {
    m_ownedParameter.add(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withOwnedParameter(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateParameter> p_ownedParameter) {
    m_ownedParameter.addAll(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withOwnedParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureOwnedParameterBuilder.add(p_templateParameterBuilder);
    return this;
  }

  public RedefinableTemplateSignatureBuilder withParameter(org.eclipse.uml2.uml.TemplateParameter p_parameter) {
    m_parameter.add(p_parameter);
    m_featureParameterSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withParameter(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateParameter> p_parameter) {
    m_parameter.addAll(p_parameter);
    m_featureParameterSet = true;
    return this;
  }

  public RedefinableTemplateSignatureBuilder withParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureParameterBuilder.add(p_templateParameterBuilder);
    return this;
  }
}
