package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.StringExpression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StringExpressionBuilder {
  // features and builders
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateSignature m_ownedTemplateSignature;
  private org.eclipse.uml2.uml.util.builder.TemplateSignatureBuilder m_featureOwnedTemplateSignatureBuilder;
  private org.eclipse.uml2.uml.StringExpression m_owningExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureOwningExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureOwningTemplateParameterBuilder;
  private java.lang.String m_symbol;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.Type m_type;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ValueSpecification> m_operand = new java.util.LinkedList<org.eclipse.uml2.uml.ValueSpecification>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.StringExpression> m_subExpression = new java.util.LinkedList<org.eclipse.uml2.uml.StringExpression>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.StringExpressionBuilder> m_featureSubExpressionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.StringExpressionBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateBinding> m_templateBinding = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateBinding>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.TemplateBindingBuilder> m_featureTemplateBindingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.TemplateBindingBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOperandSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedTemplateSignatureSet = false;
  private boolean m_featureOwningExpressionSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureSubExpressionSet = false;
  private boolean m_featureSymbolSet = false;
  private boolean m_featureTemplateBindingSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newStringExpressionBuilder()
   */
  private StringExpressionBuilder() {
  }

  /**
   * This method creates a new instance of the StringExpressionBuilder.
   * @return new instance of the StringExpressionBuilder
   */
  public static StringExpressionBuilder newStringExpressionBuilder() {
    return new StringExpressionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public StringExpressionBuilder but() {
    StringExpressionBuilder _builder = newStringExpressionBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOperandSet = m_featureOperandSet;
    _builder.m_operand = m_operand;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedTemplateSignatureSet = m_featureOwnedTemplateSignatureSet;
    _builder.m_ownedTemplateSignature = m_ownedTemplateSignature;
    _builder.m_featureOwnedTemplateSignatureBuilder = m_featureOwnedTemplateSignatureBuilder;
    _builder.m_featureOwningExpressionSet = m_featureOwningExpressionSet;
    _builder.m_owningExpression = m_owningExpression;
    _builder.m_featureOwningExpressionBuilder = m_featureOwningExpressionBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featureSubExpressionSet = m_featureSubExpressionSet;
    _builder.m_subExpression = m_subExpression;
    _builder.m_featureSubExpressionBuilder = m_featureSubExpressionBuilder;
    _builder.m_featureSymbolSet = m_featureSymbolSet;
    _builder.m_symbol = m_symbol;
    _builder.m_featureTemplateBindingSet = m_featureTemplateBindingSet;
    _builder.m_templateBinding = m_templateBinding;
    _builder.m_featureTemplateBindingBuilder = m_featureTemplateBindingBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.StringExpression type.
   * @return new instance of the org.eclipse.uml2.uml.StringExpression type
   */
  public org.eclipse.uml2.uml.StringExpression build() {
    final org.eclipse.uml2.uml.StringExpression _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createStringExpression();
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
    if (m_featureOwnedTemplateSignatureSet) {
      _newInstance.setOwnedTemplateSignature(m_ownedTemplateSignature);
    } else {
      if (m_featureOwnedTemplateSignatureBuilder != null) {
        _newInstance.setOwnedTemplateSignature(m_featureOwnedTemplateSignatureBuilder.build());
      }
    }
    if (m_featureOwningExpressionSet) {
      _newInstance.setOwningExpression(m_owningExpression);
    } else {
      if (m_featureOwningExpressionBuilder != null) {
        _newInstance.setOwningExpression(m_featureOwningExpressionBuilder.build());
      }
    }
    if (m_featureOwningTemplateParameterSet) {
      _newInstance.setOwningTemplateParameter(m_owningTemplateParameter);
    } else {
      if (m_featureOwningTemplateParameterBuilder != null) {
        _newInstance.setOwningTemplateParameter(m_featureOwningTemplateParameterBuilder.build());
      }
    }
    if (m_featureSymbolSet) {
      _newInstance.setSymbol(m_symbol);
    }
    if (m_featureTemplateParameterSet) {
      _newInstance.setTemplateParameter(m_templateParameter);
    } else {
      if (m_featureTemplateParameterBuilder != null) {
        _newInstance.setTemplateParameter(m_featureTemplateParameterBuilder.build());
      }
    }
    if (m_featureTypeSet) {
      _newInstance.setType(m_type);
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
    }
    if (m_featureClientDependencySet) {
      _newInstance.getClientDependencies().addAll(m_clientDependency);
    } else {
      if (!m_featureClientDependencyBuilder.isEmpty()) {
        for (DependencyBuilder builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureOperandSet) {
      _newInstance.getOperands().addAll(m_operand);
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
    if (m_featureSubExpressionSet) {
      _newInstance.getSubExpressions().addAll(m_subExpression);
    } else {
      if (!m_featureSubExpressionBuilder.isEmpty()) {
        for (StringExpressionBuilder builder : m_featureSubExpressionBuilder) {
          _newInstance.getSubExpressions().add(builder.build());
        }
      }
    }
    if (m_featureTemplateBindingSet) {
      _newInstance.getTemplateBindings().addAll(m_templateBinding);
    } else {
      if (!m_featureTemplateBindingBuilder.isEmpty()) {
        for (TemplateBindingBuilder builder : m_featureTemplateBindingBuilder) {
          _newInstance.getTemplateBindings().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public StringExpressionBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public StringExpressionBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public StringExpressionBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public StringExpressionBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.TemplateSignature p_ownedTemplateSignature) {
    m_ownedTemplateSignature = p_ownedTemplateSignature;
    m_featureOwnedTemplateSignatureSet = true;
    return this;
  }

  public StringExpressionBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.util.builder.TemplateSignatureBuilder p_templateSignatureBuilder) {
    m_featureOwnedTemplateSignatureBuilder = p_templateSignatureBuilder;
    return this;
  }

  public StringExpressionBuilder withOwningExpression(org.eclipse.uml2.uml.StringExpression p_owningExpression) {
    m_owningExpression = p_owningExpression;
    m_featureOwningExpressionSet = true;
    return this;
  }

  public StringExpressionBuilder withOwningExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureOwningExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public StringExpressionBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public StringExpressionBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public StringExpressionBuilder withSymbol(java.lang.String p_symbol) {
    m_symbol = p_symbol;
    m_featureSymbolSet = true;
    return this;
  }

  public StringExpressionBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public StringExpressionBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public StringExpressionBuilder withType(org.eclipse.uml2.uml.Type p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public StringExpressionBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public StringExpressionBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public StringExpressionBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public StringExpressionBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public StringExpressionBuilder withOperand(org.eclipse.uml2.uml.ValueSpecification p_operand) {
    m_operand.add(p_operand);
    m_featureOperandSet = true;
    return this;
  }

  public StringExpressionBuilder withOperand(java.util.Collection<? extends org.eclipse.uml2.uml.ValueSpecification> p_operand) {
    m_operand.addAll(p_operand);
    m_featureOperandSet = true;
    return this;
  }

  public StringExpressionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public StringExpressionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public StringExpressionBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public StringExpressionBuilder withSubExpression(org.eclipse.uml2.uml.StringExpression p_subExpression) {
    m_subExpression.add(p_subExpression);
    m_featureSubExpressionSet = true;
    return this;
  }

  public StringExpressionBuilder withSubExpression(java.util.Collection<? extends org.eclipse.uml2.uml.StringExpression> p_subExpression) {
    m_subExpression.addAll(p_subExpression);
    m_featureSubExpressionSet = true;
    return this;
  }

  public StringExpressionBuilder withSubExpression(StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureSubExpressionBuilder.add(p_stringExpressionBuilder);
    return this;
  }

  public StringExpressionBuilder withTemplateBinding(org.eclipse.uml2.uml.TemplateBinding p_templateBinding) {
    m_templateBinding.add(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public StringExpressionBuilder withTemplateBinding(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBinding) {
    m_templateBinding.addAll(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public StringExpressionBuilder withTemplateBinding(TemplateBindingBuilder p_templateBindingBuilder) {
    m_featureTemplateBindingBuilder.add(p_templateBindingBuilder);
    return this;
  }
}
