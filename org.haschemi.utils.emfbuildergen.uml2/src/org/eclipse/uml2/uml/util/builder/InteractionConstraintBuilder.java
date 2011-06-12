package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.InteractionConstraint</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class InteractionConstraintBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.InteractionConstraint> {
  // features and builders
  private org.eclipse.uml2.uml.Namespace m_context;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Namespace> m_featureContextBuilder;
  private org.eclipse.uml2.uml.ValueSpecification m_maxint;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> m_featureMaxintBuilder;
  private org.eclipse.uml2.uml.ValueSpecification m_minint;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> m_featureMinintBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.ValueSpecification m_specification;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> m_featureSpecificationBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.uml2.uml.Element> m_constrainedElement = new java.util.LinkedList<org.eclipse.uml2.uml.Element>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element>> m_featureConstrainedElementBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConstrainedElementSet = false;
  private boolean m_featureContextSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureMaxintSet = false;
  private boolean m_featureMinintSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureSpecificationSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newInteractionConstraintBuilder()
   */
  private InteractionConstraintBuilder() {
  }

  /**
   * This method creates a new instance of the InteractionConstraintBuilder.
   * @return new instance of the InteractionConstraintBuilder
   */
  public static InteractionConstraintBuilder newInteractionConstraintBuilder() {
    return new InteractionConstraintBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public InteractionConstraintBuilder but() {
    InteractionConstraintBuilder _builder = newInteractionConstraintBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureConstrainedElementSet = m_featureConstrainedElementSet;
    _builder.m_constrainedElement = m_constrainedElement;
    _builder.m_featureConstrainedElementBuilder = m_featureConstrainedElementBuilder;
    _builder.m_featureContextSet = m_featureContextSet;
    _builder.m_context = m_context;
    _builder.m_featureContextBuilder = m_featureContextBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureMaxintSet = m_featureMaxintSet;
    _builder.m_maxint = m_maxint;
    _builder.m_featureMaxintBuilder = m_featureMaxintBuilder;
    _builder.m_featureMinintSet = m_featureMinintSet;
    _builder.m_minint = m_minint;
    _builder.m_featureMinintBuilder = m_featureMinintBuilder;
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
    _builder.m_featureSpecificationSet = m_featureSpecificationSet;
    _builder.m_specification = m_specification;
    _builder.m_featureSpecificationBuilder = m_featureSpecificationBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.InteractionConstraint type.
   * @return new instance of the org.eclipse.uml2.uml.InteractionConstraint type
   */
  public org.eclipse.uml2.uml.InteractionConstraint build() {
    final org.eclipse.uml2.uml.InteractionConstraint _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInteractionConstraint();
    if (m_featureContextSet) {
      _newInstance.setContext(m_context);
    } else {
      if (m_featureContextBuilder != null) {
        _newInstance.setContext(m_featureContextBuilder.build());
      }
    }
    if (m_featureMaxintSet) {
      _newInstance.setMaxint(m_maxint);
    } else {
      if (m_featureMaxintBuilder != null) {
        _newInstance.setMaxint(m_featureMaxintBuilder.build());
      }
    }
    if (m_featureMinintSet) {
      _newInstance.setMinint(m_minint);
    } else {
      if (m_featureMinintBuilder != null) {
        _newInstance.setMinint(m_featureMinintBuilder.build());
      }
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
    if (m_featureOwningTemplateParameterSet) {
      _newInstance.setOwningTemplateParameter(m_owningTemplateParameter);
    } else {
      if (m_featureOwningTemplateParameterBuilder != null) {
        _newInstance.setOwningTemplateParameter(m_featureOwningTemplateParameterBuilder.build());
      }
    }
    if (m_featureSpecificationSet) {
      _newInstance.setSpecification(m_specification);
    } else {
      if (m_featureSpecificationBuilder != null) {
        _newInstance.setSpecification(m_featureSpecificationBuilder.build());
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
    if (m_featureConstrainedElementSet) {
      _newInstance.getConstrainedElements().addAll(m_constrainedElement);
    } else {
      if (!m_featureConstrainedElementBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element> builder : m_featureConstrainedElementBuilder) {
          _newInstance.getConstrainedElements().add(builder.build());
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

  public InteractionConstraintBuilder withContext(org.eclipse.uml2.uml.Namespace p_context) {
    m_context = p_context;
    m_featureContextSet = true;
    return this;
  }

  public InteractionConstraintBuilder withContext(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Namespace> p_namespaceBuilder) {
    m_featureContextBuilder = p_namespaceBuilder;
    return this;
  }

  public InteractionConstraintBuilder withMaxint(org.eclipse.uml2.uml.ValueSpecification p_maxint) {
    m_maxint = p_maxint;
    m_featureMaxintSet = true;
    return this;
  }

  public InteractionConstraintBuilder withMaxint(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> p_valueSpecificationBuilder) {
    m_featureMaxintBuilder = p_valueSpecificationBuilder;
    return this;
  }

  public InteractionConstraintBuilder withMinint(org.eclipse.uml2.uml.ValueSpecification p_minint) {
    m_minint = p_minint;
    m_featureMinintSet = true;
    return this;
  }

  public InteractionConstraintBuilder withMinint(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> p_valueSpecificationBuilder) {
    m_featureMinintBuilder = p_valueSpecificationBuilder;
    return this;
  }

  public InteractionConstraintBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public InteractionConstraintBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public InteractionConstraintBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public InteractionConstraintBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public InteractionConstraintBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InteractionConstraintBuilder withSpecification(org.eclipse.uml2.uml.ValueSpecification p_specification) {
    m_specification = p_specification;
    m_featureSpecificationSet = true;
    return this;
  }

  public InteractionConstraintBuilder withSpecification(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> p_valueSpecificationBuilder) {
    m_featureSpecificationBuilder = p_valueSpecificationBuilder;
    return this;
  }

  public InteractionConstraintBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public InteractionConstraintBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InteractionConstraintBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public InteractionConstraintBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InteractionConstraintBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InteractionConstraintBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public InteractionConstraintBuilder withConstrainedElement(org.eclipse.uml2.uml.Element p_constrainedElement) {
    m_constrainedElement.add(p_constrainedElement);
    m_featureConstrainedElementSet = true;
    return this;
  }

  public InteractionConstraintBuilder withConstrainedElement(java.util.Collection<? extends org.eclipse.uml2.uml.Element> p_constrainedElement) {
    m_constrainedElement.addAll(p_constrainedElement);
    m_featureConstrainedElementSet = true;
    return this;
  }

  public InteractionConstraintBuilder withConstrainedElement(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Element> p_elementBuilder) {
    m_featureConstrainedElementBuilder.add(p_elementBuilder);
    return this;
  }

  public InteractionConstraintBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public InteractionConstraintBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public InteractionConstraintBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public InteractionConstraintBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InteractionConstraintBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InteractionConstraintBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
