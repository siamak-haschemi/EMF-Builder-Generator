package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Profile</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProfileBuilder {
  // features and builders
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateSignature m_ownedTemplateSignature;
  private org.eclipse.uml2.uml.util.builder.TemplateSignatureBuilder m_featureOwnedTemplateSignatureBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ElementImportBuilder> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ElementImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_metaclassReference = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ElementImportBuilder> m_featureMetaclassReferenceBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ElementImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_metamodelReference = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PackageImportBuilder> m_featureMetamodelReferenceBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PackageImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PackageImportBuilder> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PackageImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageMerge> m_packageMerge = new java.util.LinkedList<org.eclipse.uml2.uml.PackageMerge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PackageMergeBuilder> m_featurePackageMergeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PackageMergeBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageableElement> m_packagedElement = new java.util.LinkedList<org.eclipse.uml2.uml.PackageableElement>();
  private java.util.Collection<org.eclipse.uml2.uml.ProfileApplication> m_profileApplication = new java.util.LinkedList<org.eclipse.uml2.uml.ProfileApplication>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ProfileApplicationBuilder> m_featureProfileApplicationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ProfileApplicationBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateBinding> m_templateBinding = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateBinding>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.TemplateBindingBuilder> m_featureTemplateBindingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.TemplateBindingBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureMetaclassReferenceSet = false;
  private boolean m_featureMetamodelReferenceSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featureOwnedTemplateSignatureSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featurePackageMergeSet = false;
  private boolean m_featurePackagedElementSet = false;
  private boolean m_featureProfileApplicationSet = false;
  private boolean m_featureTemplateBindingSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newProfileBuilder()
   */
  private ProfileBuilder() {
  }

  /**
   * This method creates a new instance of the ProfileBuilder.
   * @return new instance of the ProfileBuilder
   */
  public static ProfileBuilder newProfileBuilder() {
    return new ProfileBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ProfileBuilder but() {
    ProfileBuilder _builder = newProfileBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureMetaclassReferenceSet = m_featureMetaclassReferenceSet;
    _builder.m_metaclassReference = m_metaclassReference;
    _builder.m_featureMetaclassReferenceBuilder = m_featureMetaclassReferenceBuilder;
    _builder.m_featureMetamodelReferenceSet = m_featureMetamodelReferenceSet;
    _builder.m_metamodelReference = m_metamodelReference;
    _builder.m_featureMetamodelReferenceBuilder = m_featureMetamodelReferenceBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedRuleSet = m_featureOwnedRuleSet;
    _builder.m_ownedRule = m_ownedRule;
    _builder.m_featureOwnedRuleBuilder = m_featureOwnedRuleBuilder;
    _builder.m_featureOwnedTemplateSignatureSet = m_featureOwnedTemplateSignatureSet;
    _builder.m_ownedTemplateSignature = m_ownedTemplateSignature;
    _builder.m_featureOwnedTemplateSignatureBuilder = m_featureOwnedTemplateSignatureBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featurePackageImportSet = m_featurePackageImportSet;
    _builder.m_packageImport = m_packageImport;
    _builder.m_featurePackageImportBuilder = m_featurePackageImportBuilder;
    _builder.m_featurePackageMergeSet = m_featurePackageMergeSet;
    _builder.m_packageMerge = m_packageMerge;
    _builder.m_featurePackageMergeBuilder = m_featurePackageMergeBuilder;
    _builder.m_featurePackagedElementSet = m_featurePackagedElementSet;
    _builder.m_packagedElement = m_packagedElement;
    _builder.m_featureProfileApplicationSet = m_featureProfileApplicationSet;
    _builder.m_profileApplication = m_profileApplication;
    _builder.m_featureProfileApplicationBuilder = m_featureProfileApplicationBuilder;
    _builder.m_featureTemplateBindingSet = m_featureTemplateBindingSet;
    _builder.m_templateBinding = m_templateBinding;
    _builder.m_featureTemplateBindingBuilder = m_featureTemplateBindingBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Profile type.
   * @return new instance of the org.eclipse.uml2.uml.Profile type
   */
  public org.eclipse.uml2.uml.Profile build() {
    final org.eclipse.uml2.uml.Profile _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createProfile();
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
    if (m_featureElementImportSet) {
      _newInstance.getElementImports().addAll(m_elementImport);
    } else {
      if (!m_featureElementImportBuilder.isEmpty()) {
        for (ElementImportBuilder builder : m_featureElementImportBuilder) {
          _newInstance.getElementImports().add(builder.build());
        }
      }
    }
    if (m_featureMetaclassReferenceSet) {
      _newInstance.getMetaclassReferences().addAll(m_metaclassReference);
    } else {
      if (!m_featureMetaclassReferenceBuilder.isEmpty()) {
        for (ElementImportBuilder builder : m_featureMetaclassReferenceBuilder) {
          _newInstance.getMetaclassReferences().add(builder.build());
        }
      }
    }
    if (m_featureMetamodelReferenceSet) {
      _newInstance.getMetamodelReferences().addAll(m_metamodelReference);
    } else {
      if (!m_featureMetamodelReferenceBuilder.isEmpty()) {
        for (PackageImportBuilder builder : m_featureMetamodelReferenceBuilder) {
          _newInstance.getMetamodelReferences().add(builder.build());
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
    if (m_featurePackageImportSet) {
      _newInstance.getPackageImports().addAll(m_packageImport);
    } else {
      if (!m_featurePackageImportBuilder.isEmpty()) {
        for (PackageImportBuilder builder : m_featurePackageImportBuilder) {
          _newInstance.getPackageImports().add(builder.build());
        }
      }
    }
    if (m_featurePackageMergeSet) {
      _newInstance.getPackageMerges().addAll(m_packageMerge);
    } else {
      if (!m_featurePackageMergeBuilder.isEmpty()) {
        for (PackageMergeBuilder builder : m_featurePackageMergeBuilder) {
          _newInstance.getPackageMerges().add(builder.build());
        }
      }
    }
    if (m_featurePackagedElementSet) {
      _newInstance.getPackagedElements().addAll(m_packagedElement);
    }
    if (m_featureProfileApplicationSet) {
      _newInstance.getProfileApplications().addAll(m_profileApplication);
    } else {
      if (!m_featureProfileApplicationBuilder.isEmpty()) {
        for (ProfileApplicationBuilder builder : m_featureProfileApplicationBuilder) {
          _newInstance.getProfileApplications().add(builder.build());
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

  public ProfileBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ProfileBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ProfileBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ProfileBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.TemplateSignature p_ownedTemplateSignature) {
    m_ownedTemplateSignature = p_ownedTemplateSignature;
    m_featureOwnedTemplateSignatureSet = true;
    return this;
  }

  public ProfileBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.util.builder.TemplateSignatureBuilder p_templateSignatureBuilder) {
    m_featureOwnedTemplateSignatureBuilder = p_templateSignatureBuilder;
    return this;
  }

  public ProfileBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public ProfileBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public ProfileBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public ProfileBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public ProfileBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ProfileBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ProfileBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ProfileBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ProfileBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public ProfileBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public ProfileBuilder withElementImport(ElementImportBuilder p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public ProfileBuilder withMetaclassReference(org.eclipse.uml2.uml.ElementImport p_metaclassReference) {
    m_metaclassReference.add(p_metaclassReference);
    m_featureMetaclassReferenceSet = true;
    return this;
  }

  public ProfileBuilder withMetaclassReference(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_metaclassReference) {
    m_metaclassReference.addAll(p_metaclassReference);
    m_featureMetaclassReferenceSet = true;
    return this;
  }

  public ProfileBuilder withMetaclassReference(ElementImportBuilder p_elementImportBuilder) {
    m_featureMetaclassReferenceBuilder.add(p_elementImportBuilder);
    return this;
  }

  public ProfileBuilder withMetamodelReference(org.eclipse.uml2.uml.PackageImport p_metamodelReference) {
    m_metamodelReference.add(p_metamodelReference);
    m_featureMetamodelReferenceSet = true;
    return this;
  }

  public ProfileBuilder withMetamodelReference(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_metamodelReference) {
    m_metamodelReference.addAll(p_metamodelReference);
    m_featureMetamodelReferenceSet = true;
    return this;
  }

  public ProfileBuilder withMetamodelReference(PackageImportBuilder p_packageImportBuilder) {
    m_featureMetamodelReferenceBuilder.add(p_packageImportBuilder);
    return this;
  }

  public ProfileBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ProfileBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ProfileBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ProfileBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public ProfileBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public ProfileBuilder withOwnedRule(ConstraintBuilder p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public ProfileBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public ProfileBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public ProfileBuilder withPackageImport(PackageImportBuilder p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public ProfileBuilder withPackageMerge(org.eclipse.uml2.uml.PackageMerge p_packageMerge) {
    m_packageMerge.add(p_packageMerge);
    m_featurePackageMergeSet = true;
    return this;
  }

  public ProfileBuilder withPackageMerge(java.util.Collection<? extends org.eclipse.uml2.uml.PackageMerge> p_packageMerge) {
    m_packageMerge.addAll(p_packageMerge);
    m_featurePackageMergeSet = true;
    return this;
  }

  public ProfileBuilder withPackageMerge(PackageMergeBuilder p_packageMergeBuilder) {
    m_featurePackageMergeBuilder.add(p_packageMergeBuilder);
    return this;
  }

  public ProfileBuilder withPackagedElement(org.eclipse.uml2.uml.PackageableElement p_packagedElement) {
    m_packagedElement.add(p_packagedElement);
    m_featurePackagedElementSet = true;
    return this;
  }

  public ProfileBuilder withPackagedElement(java.util.Collection<? extends org.eclipse.uml2.uml.PackageableElement> p_packagedElement) {
    m_packagedElement.addAll(p_packagedElement);
    m_featurePackagedElementSet = true;
    return this;
  }

  public ProfileBuilder withProfileApplication(org.eclipse.uml2.uml.ProfileApplication p_profileApplication) {
    m_profileApplication.add(p_profileApplication);
    m_featureProfileApplicationSet = true;
    return this;
  }

  public ProfileBuilder withProfileApplication(java.util.Collection<? extends org.eclipse.uml2.uml.ProfileApplication> p_profileApplication) {
    m_profileApplication.addAll(p_profileApplication);
    m_featureProfileApplicationSet = true;
    return this;
  }

  public ProfileBuilder withProfileApplication(ProfileApplicationBuilder p_profileApplicationBuilder) {
    m_featureProfileApplicationBuilder.add(p_profileApplicationBuilder);
    return this;
  }

  public ProfileBuilder withTemplateBinding(org.eclipse.uml2.uml.TemplateBinding p_templateBinding) {
    m_templateBinding.add(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public ProfileBuilder withTemplateBinding(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBinding) {
    m_templateBinding.addAll(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public ProfileBuilder withTemplateBinding(TemplateBindingBuilder p_templateBindingBuilder) {
    m_featureTemplateBindingBuilder.add(p_templateBindingBuilder);
    return this;
  }
}
