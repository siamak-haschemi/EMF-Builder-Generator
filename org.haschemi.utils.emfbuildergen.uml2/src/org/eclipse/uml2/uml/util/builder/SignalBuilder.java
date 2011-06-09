package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Signal</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class SignalBuilder {
  // features and builders
  private Boolean m_isAbstract;
  private Boolean m_isLeaf;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateSignature m_ownedTemplateSignature;
  private org.eclipse.uml2.uml.util.builder.TemplateSignatureBuilder m_featureOwnedTemplateSignatureBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.CollaborationUse m_representation;
  private org.eclipse.uml2.uml.util.builder.CollaborationUseBuilder m_featureRepresentationBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.CollaborationUse> m_collaborationUse = new java.util.LinkedList<org.eclipse.uml2.uml.CollaborationUse>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CollaborationUseBuilder> m_featureCollaborationUseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CollaborationUseBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ElementImportBuilder> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ElementImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Generalization> m_generalization = new java.util.LinkedList<org.eclipse.uml2.uml.Generalization>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralizationBuilder> m_featureGeneralizationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralizationBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Property> m_ownedAttribute = new java.util.LinkedList<org.eclipse.uml2.uml.Property>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PropertyBuilder> m_featureOwnedAttributeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PropertyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.UseCase> m_ownedUseCase = new java.util.LinkedList<org.eclipse.uml2.uml.UseCase>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.UseCaseBuilder> m_featureOwnedUseCaseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.UseCaseBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PackageImportBuilder> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PackageImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralizationSet> m_powertypeExtent = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralizationSet>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralizationSetBuilder> m_featurePowertypeExtentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralizationSetBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_redefinedClassifier = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.Substitution> m_substitution = new java.util.LinkedList<org.eclipse.uml2.uml.Substitution>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.SubstitutionBuilder> m_featureSubstitutionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.SubstitutionBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateBinding> m_templateBinding = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateBinding>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.TemplateBindingBuilder> m_featureTemplateBindingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.TemplateBindingBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.UseCase> m_useCase = new java.util.LinkedList<org.eclipse.uml2.uml.UseCase>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.UseCaseBuilder> m_featureUseCaseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.UseCaseBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCollaborationUseSet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureGeneralizationSet = false;
  private boolean m_featureIsAbstractSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedAttributeSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featureOwnedTemplateSignatureSet = false;
  private boolean m_featureOwnedUseCaseSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featurePowertypeExtentSet = false;
  private boolean m_featureRedefinedClassifierSet = false;
  private boolean m_featureRepresentationSet = false;
  private boolean m_featureSubstitutionSet = false;
  private boolean m_featureTemplateBindingSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureUseCaseSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newSignalBuilder()
   */
  private SignalBuilder() {
  }

  /**
   * This method creates a new instance of the SignalBuilder.
   * @return new instance of the SignalBuilder
   */
  public static SignalBuilder newSignalBuilder() {
    return new SignalBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public SignalBuilder but() {
    SignalBuilder _builder = newSignalBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureCollaborationUseSet = m_featureCollaborationUseSet;
    _builder.m_collaborationUse = m_collaborationUse;
    _builder.m_featureCollaborationUseBuilder = m_featureCollaborationUseBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureGeneralizationSet = m_featureGeneralizationSet;
    _builder.m_generalization = m_generalization;
    _builder.m_featureGeneralizationBuilder = m_featureGeneralizationBuilder;
    _builder.m_featureIsAbstractSet = m_featureIsAbstractSet;
    _builder.m_isAbstract = m_isAbstract;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedAttributeSet = m_featureOwnedAttributeSet;
    _builder.m_ownedAttribute = m_ownedAttribute;
    _builder.m_featureOwnedAttributeBuilder = m_featureOwnedAttributeBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedRuleSet = m_featureOwnedRuleSet;
    _builder.m_ownedRule = m_ownedRule;
    _builder.m_featureOwnedRuleBuilder = m_featureOwnedRuleBuilder;
    _builder.m_featureOwnedTemplateSignatureSet = m_featureOwnedTemplateSignatureSet;
    _builder.m_ownedTemplateSignature = m_ownedTemplateSignature;
    _builder.m_featureOwnedTemplateSignatureBuilder = m_featureOwnedTemplateSignatureBuilder;
    _builder.m_featureOwnedUseCaseSet = m_featureOwnedUseCaseSet;
    _builder.m_ownedUseCase = m_ownedUseCase;
    _builder.m_featureOwnedUseCaseBuilder = m_featureOwnedUseCaseBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featurePackageImportSet = m_featurePackageImportSet;
    _builder.m_packageImport = m_packageImport;
    _builder.m_featurePackageImportBuilder = m_featurePackageImportBuilder;
    _builder.m_featurePowertypeExtentSet = m_featurePowertypeExtentSet;
    _builder.m_powertypeExtent = m_powertypeExtent;
    _builder.m_featurePowertypeExtentBuilder = m_featurePowertypeExtentBuilder;
    _builder.m_featureRedefinedClassifierSet = m_featureRedefinedClassifierSet;
    _builder.m_redefinedClassifier = m_redefinedClassifier;
    _builder.m_featureRepresentationSet = m_featureRepresentationSet;
    _builder.m_representation = m_representation;
    _builder.m_featureRepresentationBuilder = m_featureRepresentationBuilder;
    _builder.m_featureSubstitutionSet = m_featureSubstitutionSet;
    _builder.m_substitution = m_substitution;
    _builder.m_featureSubstitutionBuilder = m_featureSubstitutionBuilder;
    _builder.m_featureTemplateBindingSet = m_featureTemplateBindingSet;
    _builder.m_templateBinding = m_templateBinding;
    _builder.m_featureTemplateBindingBuilder = m_featureTemplateBindingBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureUseCaseSet = m_featureUseCaseSet;
    _builder.m_useCase = m_useCase;
    _builder.m_featureUseCaseBuilder = m_featureUseCaseBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Signal type.
   * @return new instance of the org.eclipse.uml2.uml.Signal type
   */
  public org.eclipse.uml2.uml.Signal build() {
    final org.eclipse.uml2.uml.Signal _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createSignal();
    if (m_featureIsAbstractSet) {
      _newInstance.setIsAbstract(m_isAbstract);
    }
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
    if (m_featureOwnedTemplateSignatureSet) {
      _newInstance.setOwnedTemplateSignature(m_ownedTemplateSignature);
    } else {
      if (m_featureOwnedTemplateSignatureBuilder != null) {
        _newInstance.setOwnedTemplateSignature(m_featureOwnedTemplateSignatureBuilder.build());
      }
    }
    if (m_featureOwningTemplateParameterSet) {
      _newInstance.setOwningTemplateParameter(m_owningTemplateParameter);
    } else {
      if (m_featureOwningTemplateParameterBuilder != null) {
        _newInstance.setOwningTemplateParameter(m_featureOwningTemplateParameterBuilder.build());
      }
    }
    if (m_featureRepresentationSet) {
      _newInstance.setRepresentation(m_representation);
    } else {
      if (m_featureRepresentationBuilder != null) {
        _newInstance.setRepresentation(m_featureRepresentationBuilder.build());
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
        for (DependencyBuilder builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureCollaborationUseSet) {
      _newInstance.getCollaborationUses().addAll(m_collaborationUse);
    } else {
      if (!m_featureCollaborationUseBuilder.isEmpty()) {
        for (CollaborationUseBuilder builder : m_featureCollaborationUseBuilder) {
          _newInstance.getCollaborationUses().add(builder.build());
        }
      }
    }
    if (m_featureElementImportSet) {
      _newInstance.getElementImports().addAll(m_elementImport);
    } else {
      if (!m_featureElementImportBuilder.isEmpty()) {
        for (ElementImportBuilder builder : m_featureElementImportBuilder) {
          _newInstance.getElementImports().add(builder.build());
        }
      }
    }
    if (m_featureGeneralizationSet) {
      _newInstance.getGeneralizations().addAll(m_generalization);
    } else {
      if (!m_featureGeneralizationBuilder.isEmpty()) {
        for (GeneralizationBuilder builder : m_featureGeneralizationBuilder) {
          _newInstance.getGeneralizations().add(builder.build());
        }
      }
    }
    if (m_featureOwnedAttributeSet) {
      _newInstance.getOwnedAttributes().addAll(m_ownedAttribute);
    } else {
      if (!m_featureOwnedAttributeBuilder.isEmpty()) {
        for (PropertyBuilder builder : m_featureOwnedAttributeBuilder) {
          _newInstance.getOwnedAttributes().add(builder.build());
        }
      }
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
    if (m_featureOwnedRuleSet) {
      _newInstance.getOwnedRules().addAll(m_ownedRule);
    } else {
      if (!m_featureOwnedRuleBuilder.isEmpty()) {
        for (ConstraintBuilder builder : m_featureOwnedRuleBuilder) {
          _newInstance.getOwnedRules().add(builder.build());
        }
      }
    }
    if (m_featureOwnedUseCaseSet) {
      _newInstance.getOwnedUseCases().addAll(m_ownedUseCase);
    } else {
      if (!m_featureOwnedUseCaseBuilder.isEmpty()) {
        for (UseCaseBuilder builder : m_featureOwnedUseCaseBuilder) {
          _newInstance.getOwnedUseCases().add(builder.build());
        }
      }
    }
    if (m_featurePackageImportSet) {
      _newInstance.getPackageImports().addAll(m_packageImport);
    } else {
      if (!m_featurePackageImportBuilder.isEmpty()) {
        for (PackageImportBuilder builder : m_featurePackageImportBuilder) {
          _newInstance.getPackageImports().add(builder.build());
        }
      }
    }
    if (m_featurePowertypeExtentSet) {
      _newInstance.getPowertypeExtents().addAll(m_powertypeExtent);
    } else {
      if (!m_featurePowertypeExtentBuilder.isEmpty()) {
        for (GeneralizationSetBuilder builder : m_featurePowertypeExtentBuilder) {
          _newInstance.getPowertypeExtents().add(builder.build());
        }
      }
    }
    if (m_featureRedefinedClassifierSet) {
      _newInstance.getRedefinedClassifiers().addAll(m_redefinedClassifier);
    }
    if (m_featureSubstitutionSet) {
      _newInstance.getSubstitutions().addAll(m_substitution);
    } else {
      if (!m_featureSubstitutionBuilder.isEmpty()) {
        for (SubstitutionBuilder builder : m_featureSubstitutionBuilder) {
          _newInstance.getSubstitutions().add(builder.build());
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
    if (m_featureUseCaseSet) {
      _newInstance.getUseCases().addAll(m_useCase);
    } else {
      if (!m_featureUseCaseBuilder.isEmpty()) {
        for (UseCaseBuilder builder : m_featureUseCaseBuilder) {
          _newInstance.getUseCases().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public SignalBuilder withIsAbstract(Boolean p_isAbstract) {
    m_isAbstract = p_isAbstract;
    m_featureIsAbstractSet = true;
    return this;
  }

  public SignalBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public SignalBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public SignalBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public SignalBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public SignalBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.TemplateSignature p_ownedTemplateSignature) {
    m_ownedTemplateSignature = p_ownedTemplateSignature;
    m_featureOwnedTemplateSignatureSet = true;
    return this;
  }

  public SignalBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.util.builder.TemplateSignatureBuilder p_templateSignatureBuilder) {
    m_featureOwnedTemplateSignatureBuilder = p_templateSignatureBuilder;
    return this;
  }

  public SignalBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public SignalBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public SignalBuilder withRepresentation(org.eclipse.uml2.uml.CollaborationUse p_representation) {
    m_representation = p_representation;
    m_featureRepresentationSet = true;
    return this;
  }

  public SignalBuilder withRepresentation(org.eclipse.uml2.uml.util.builder.CollaborationUseBuilder p_collaborationUseBuilder) {
    m_featureRepresentationBuilder = p_collaborationUseBuilder;
    return this;
  }

  public SignalBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public SignalBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public SignalBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public SignalBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public SignalBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public SignalBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public SignalBuilder withCollaborationUse(org.eclipse.uml2.uml.CollaborationUse p_collaborationUse) {
    m_collaborationUse.add(p_collaborationUse);
    m_featureCollaborationUseSet = true;
    return this;
  }

  public SignalBuilder withCollaborationUse(java.util.Collection<? extends org.eclipse.uml2.uml.CollaborationUse> p_collaborationUse) {
    m_collaborationUse.addAll(p_collaborationUse);
    m_featureCollaborationUseSet = true;
    return this;
  }

  public SignalBuilder withCollaborationUse(CollaborationUseBuilder p_collaborationUseBuilder) {
    m_featureCollaborationUseBuilder.add(p_collaborationUseBuilder);
    return this;
  }

  public SignalBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public SignalBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public SignalBuilder withElementImport(ElementImportBuilder p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public SignalBuilder withGeneralization(org.eclipse.uml2.uml.Generalization p_generalization) {
    m_generalization.add(p_generalization);
    m_featureGeneralizationSet = true;
    return this;
  }

  public SignalBuilder withGeneralization(java.util.Collection<? extends org.eclipse.uml2.uml.Generalization> p_generalization) {
    m_generalization.addAll(p_generalization);
    m_featureGeneralizationSet = true;
    return this;
  }

  public SignalBuilder withGeneralization(GeneralizationBuilder p_generalizationBuilder) {
    m_featureGeneralizationBuilder.add(p_generalizationBuilder);
    return this;
  }

  public SignalBuilder withOwnedAttribute(org.eclipse.uml2.uml.Property p_ownedAttribute) {
    m_ownedAttribute.add(p_ownedAttribute);
    m_featureOwnedAttributeSet = true;
    return this;
  }

  public SignalBuilder withOwnedAttribute(java.util.Collection<? extends org.eclipse.uml2.uml.Property> p_ownedAttribute) {
    m_ownedAttribute.addAll(p_ownedAttribute);
    m_featureOwnedAttributeSet = true;
    return this;
  }

  public SignalBuilder withOwnedAttribute(PropertyBuilder p_propertyBuilder) {
    m_featureOwnedAttributeBuilder.add(p_propertyBuilder);
    return this;
  }

  public SignalBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public SignalBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public SignalBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public SignalBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public SignalBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public SignalBuilder withOwnedRule(ConstraintBuilder p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public SignalBuilder withOwnedUseCase(org.eclipse.uml2.uml.UseCase p_ownedUseCase) {
    m_ownedUseCase.add(p_ownedUseCase);
    m_featureOwnedUseCaseSet = true;
    return this;
  }

  public SignalBuilder withOwnedUseCase(java.util.Collection<? extends org.eclipse.uml2.uml.UseCase> p_ownedUseCase) {
    m_ownedUseCase.addAll(p_ownedUseCase);
    m_featureOwnedUseCaseSet = true;
    return this;
  }

  public SignalBuilder withOwnedUseCase(UseCaseBuilder p_useCaseBuilder) {
    m_featureOwnedUseCaseBuilder.add(p_useCaseBuilder);
    return this;
  }

  public SignalBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public SignalBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public SignalBuilder withPackageImport(PackageImportBuilder p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public SignalBuilder withPowertypeExtent(org.eclipse.uml2.uml.GeneralizationSet p_powertypeExtent) {
    m_powertypeExtent.add(p_powertypeExtent);
    m_featurePowertypeExtentSet = true;
    return this;
  }

  public SignalBuilder withPowertypeExtent(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralizationSet> p_powertypeExtent) {
    m_powertypeExtent.addAll(p_powertypeExtent);
    m_featurePowertypeExtentSet = true;
    return this;
  }

  public SignalBuilder withPowertypeExtent(GeneralizationSetBuilder p_generalizationSetBuilder) {
    m_featurePowertypeExtentBuilder.add(p_generalizationSetBuilder);
    return this;
  }

  public SignalBuilder withRedefinedClassifier(org.eclipse.uml2.uml.Classifier p_redefinedClassifier) {
    m_redefinedClassifier.add(p_redefinedClassifier);
    m_featureRedefinedClassifierSet = true;
    return this;
  }

  public SignalBuilder withRedefinedClassifier(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_redefinedClassifier) {
    m_redefinedClassifier.addAll(p_redefinedClassifier);
    m_featureRedefinedClassifierSet = true;
    return this;
  }

  public SignalBuilder withSubstitution(org.eclipse.uml2.uml.Substitution p_substitution) {
    m_substitution.add(p_substitution);
    m_featureSubstitutionSet = true;
    return this;
  }

  public SignalBuilder withSubstitution(java.util.Collection<? extends org.eclipse.uml2.uml.Substitution> p_substitution) {
    m_substitution.addAll(p_substitution);
    m_featureSubstitutionSet = true;
    return this;
  }

  public SignalBuilder withSubstitution(SubstitutionBuilder p_substitutionBuilder) {
    m_featureSubstitutionBuilder.add(p_substitutionBuilder);
    return this;
  }

  public SignalBuilder withTemplateBinding(org.eclipse.uml2.uml.TemplateBinding p_templateBinding) {
    m_templateBinding.add(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public SignalBuilder withTemplateBinding(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBinding) {
    m_templateBinding.addAll(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public SignalBuilder withTemplateBinding(TemplateBindingBuilder p_templateBindingBuilder) {
    m_featureTemplateBindingBuilder.add(p_templateBindingBuilder);
    return this;
  }

  public SignalBuilder withUseCase(org.eclipse.uml2.uml.UseCase p_useCase) {
    m_useCase.add(p_useCase);
    m_featureUseCaseSet = true;
    return this;
  }

  public SignalBuilder withUseCase(java.util.Collection<? extends org.eclipse.uml2.uml.UseCase> p_useCase) {
    m_useCase.addAll(p_useCase);
    m_featureUseCaseSet = true;
    return this;
  }

  public SignalBuilder withUseCase(UseCaseBuilder p_useCaseBuilder) {
    m_featureUseCaseBuilder.add(p_useCaseBuilder);
    return this;
  }
}
