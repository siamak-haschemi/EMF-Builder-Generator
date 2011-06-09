package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.InteractionOperand</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class InteractionOperandBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Interaction m_enclosingInteraction;
  private org.eclipse.uml2.uml.util.builder.InteractionBuilder m_featureEnclosingInteractionBuilder;
  private org.eclipse.uml2.uml.InteractionOperand m_enclosingOperand;
  private org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder m_featureEnclosingOperandBuilder;
  private org.eclipse.uml2.uml.InteractionConstraint m_guard;
  private org.eclipse.uml2.uml.util.builder.InteractionConstraintBuilder m_featureGuardBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Lifeline> m_covered = new java.util.LinkedList<org.eclipse.uml2.uml.Lifeline>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.LifelineBuilder> m_featureCoveredBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.LifelineBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ElementImportBuilder> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ElementImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.InteractionFragment> m_fragment = new java.util.LinkedList<org.eclipse.uml2.uml.InteractionFragment>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralOrdering> m_generalOrdering = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralOrdering>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder> m_featureGeneralOrderingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralOrderingBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PackageImportBuilder> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PackageImportBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCoveredSet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureEnclosingInteractionSet = false;
  private boolean m_featureEnclosingOperandSet = false;
  private boolean m_featureFragmentSet = false;
  private boolean m_featureGeneralOrderingSet = false;
  private boolean m_featureGuardSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newInteractionOperandBuilder()
   */
  private InteractionOperandBuilder() {
  }

  /**
   * This method creates a new instance of the InteractionOperandBuilder.
   * @return new instance of the InteractionOperandBuilder
   */
  public static InteractionOperandBuilder newInteractionOperandBuilder() {
    return new InteractionOperandBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public InteractionOperandBuilder but() {
    InteractionOperandBuilder _builder = newInteractionOperandBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureCoveredSet = m_featureCoveredSet;
    _builder.m_covered = m_covered;
    _builder.m_featureCoveredBuilder = m_featureCoveredBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureEnclosingInteractionSet = m_featureEnclosingInteractionSet;
    _builder.m_enclosingInteraction = m_enclosingInteraction;
    _builder.m_featureEnclosingInteractionBuilder = m_featureEnclosingInteractionBuilder;
    _builder.m_featureEnclosingOperandSet = m_featureEnclosingOperandSet;
    _builder.m_enclosingOperand = m_enclosingOperand;
    _builder.m_featureEnclosingOperandBuilder = m_featureEnclosingOperandBuilder;
    _builder.m_featureFragmentSet = m_featureFragmentSet;
    _builder.m_fragment = m_fragment;
    _builder.m_featureGeneralOrderingSet = m_featureGeneralOrderingSet;
    _builder.m_generalOrdering = m_generalOrdering;
    _builder.m_featureGeneralOrderingBuilder = m_featureGeneralOrderingBuilder;
    _builder.m_featureGuardSet = m_featureGuardSet;
    _builder.m_guard = m_guard;
    _builder.m_featureGuardBuilder = m_featureGuardBuilder;
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
    _builder.m_featurePackageImportSet = m_featurePackageImportSet;
    _builder.m_packageImport = m_packageImport;
    _builder.m_featurePackageImportBuilder = m_featurePackageImportBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.InteractionOperand type.
   * @return new instance of the org.eclipse.uml2.uml.InteractionOperand type
   */
  public org.eclipse.uml2.uml.InteractionOperand build() {
    final org.eclipse.uml2.uml.InteractionOperand _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInteractionOperand();
    if (m_featureEnclosingInteractionSet) {
      _newInstance.setEnclosingInteraction(m_enclosingInteraction);
    } else {
      if (m_featureEnclosingInteractionBuilder != null) {
        _newInstance.setEnclosingInteraction(m_featureEnclosingInteractionBuilder.build());
      }
    }
    if (m_featureEnclosingOperandSet) {
      _newInstance.setEnclosingOperand(m_enclosingOperand);
    } else {
      if (m_featureEnclosingOperandBuilder != null) {
        _newInstance.setEnclosingOperand(m_featureEnclosingOperandBuilder.build());
      }
    }
    if (m_featureGuardSet) {
      _newInstance.setGuard(m_guard);
    } else {
      if (m_featureGuardBuilder != null) {
        _newInstance.setGuard(m_featureGuardBuilder.build());
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
    if (m_featureCoveredSet) {
      _newInstance.getCovereds().addAll(m_covered);
    } else {
      if (!m_featureCoveredBuilder.isEmpty()) {
        for (LifelineBuilder builder : m_featureCoveredBuilder) {
          _newInstance.getCovereds().add(builder.build());
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
    if (m_featureFragmentSet) {
      _newInstance.getFragments().addAll(m_fragment);
    }
    if (m_featureGeneralOrderingSet) {
      _newInstance.getGeneralOrderings().addAll(m_generalOrdering);
    } else {
      if (!m_featureGeneralOrderingBuilder.isEmpty()) {
        for (GeneralOrderingBuilder builder : m_featureGeneralOrderingBuilder) {
          _newInstance.getGeneralOrderings().add(builder.build());
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
    return _newInstance;
  }

  public InteractionOperandBuilder withEnclosingInteraction(org.eclipse.uml2.uml.Interaction p_enclosingInteraction) {
    m_enclosingInteraction = p_enclosingInteraction;
    m_featureEnclosingInteractionSet = true;
    return this;
  }

  public InteractionOperandBuilder withEnclosingInteraction(org.eclipse.uml2.uml.util.builder.InteractionBuilder p_interactionBuilder) {
    m_featureEnclosingInteractionBuilder = p_interactionBuilder;
    return this;
  }

  public InteractionOperandBuilder withEnclosingOperand(org.eclipse.uml2.uml.InteractionOperand p_enclosingOperand) {
    m_enclosingOperand = p_enclosingOperand;
    m_featureEnclosingOperandSet = true;
    return this;
  }

  public InteractionOperandBuilder withEnclosingOperand(org.eclipse.uml2.uml.util.builder.InteractionOperandBuilder p_interactionOperandBuilder) {
    m_featureEnclosingOperandBuilder = p_interactionOperandBuilder;
    return this;
  }

  public InteractionOperandBuilder withGuard(org.eclipse.uml2.uml.InteractionConstraint p_guard) {
    m_guard = p_guard;
    m_featureGuardSet = true;
    return this;
  }

  public InteractionOperandBuilder withGuard(org.eclipse.uml2.uml.util.builder.InteractionConstraintBuilder p_interactionConstraintBuilder) {
    m_featureGuardBuilder = p_interactionConstraintBuilder;
    return this;
  }

  public InteractionOperandBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public InteractionOperandBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public InteractionOperandBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public InteractionOperandBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public InteractionOperandBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InteractionOperandBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InteractionOperandBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public InteractionOperandBuilder withCovered(org.eclipse.uml2.uml.Lifeline p_covered) {
    m_covered.add(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public InteractionOperandBuilder withCovered(java.util.Collection<? extends org.eclipse.uml2.uml.Lifeline> p_covered) {
    m_covered.addAll(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public InteractionOperandBuilder withCovered(LifelineBuilder p_lifelineBuilder) {
    m_featureCoveredBuilder.add(p_lifelineBuilder);
    return this;
  }

  public InteractionOperandBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public InteractionOperandBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public InteractionOperandBuilder withElementImport(ElementImportBuilder p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public InteractionOperandBuilder withFragment(org.eclipse.uml2.uml.InteractionFragment p_fragment) {
    m_fragment.add(p_fragment);
    m_featureFragmentSet = true;
    return this;
  }

  public InteractionOperandBuilder withFragment(java.util.Collection<? extends org.eclipse.uml2.uml.InteractionFragment> p_fragment) {
    m_fragment.addAll(p_fragment);
    m_featureFragmentSet = true;
    return this;
  }

  public InteractionOperandBuilder withGeneralOrdering(org.eclipse.uml2.uml.GeneralOrdering p_generalOrdering) {
    m_generalOrdering.add(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public InteractionOperandBuilder withGeneralOrdering(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralOrdering> p_generalOrdering) {
    m_generalOrdering.addAll(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public InteractionOperandBuilder withGeneralOrdering(GeneralOrderingBuilder p_generalOrderingBuilder) {
    m_featureGeneralOrderingBuilder.add(p_generalOrderingBuilder);
    return this;
  }

  public InteractionOperandBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InteractionOperandBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InteractionOperandBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public InteractionOperandBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public InteractionOperandBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public InteractionOperandBuilder withOwnedRule(ConstraintBuilder p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public InteractionOperandBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public InteractionOperandBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public InteractionOperandBuilder withPackageImport(PackageImportBuilder p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }
}
