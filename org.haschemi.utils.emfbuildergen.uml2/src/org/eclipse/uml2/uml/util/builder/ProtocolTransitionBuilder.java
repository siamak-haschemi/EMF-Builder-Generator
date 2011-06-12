package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ProtocolTransition</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProtocolTransitionBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ProtocolTransition> {
  // features and builders
  private org.eclipse.uml2.uml.Region m_container;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> m_featureContainerBuilder;
  private org.eclipse.uml2.uml.Behavior m_effect;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> m_featureEffectBuilder;
  private org.eclipse.uml2.uml.Constraint m_guard;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> m_featureGuardBuilder;
  private Boolean m_isLeaf;
  private org.eclipse.uml2.uml.TransitionKind m_kind;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.Constraint m_postCondition;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> m_featurePostConditionBuilder;
  private org.eclipse.uml2.uml.Constraint m_preCondition;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> m_featurePreConditionBuilder;
  private org.eclipse.uml2.uml.Transition m_redefinedTransition;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Transition> m_featureRedefinedTransitionBuilder;
  private org.eclipse.uml2.uml.Vertex m_source;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Vertex> m_featureSourceBuilder;
  private org.eclipse.uml2.uml.Vertex m_target;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Vertex> m_featureTargetBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport>> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport>> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport>>();
  private java.util.Collection<org.eclipse.uml2.uml.Trigger> m_trigger = new java.util.LinkedList<org.eclipse.uml2.uml.Trigger>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger>> m_featureTriggerBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureContainerSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEffectSet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureGuardSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureKindSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featurePostConditionSet = false;
  private boolean m_featurePreConditionSet = false;
  private boolean m_featureRedefinedTransitionSet = false;
  private boolean m_featureSourceSet = false;
  private boolean m_featureTargetSet = false;
  private boolean m_featureTriggerSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newProtocolTransitionBuilder()
   */
  private ProtocolTransitionBuilder() {
  }

  /**
   * This method creates a new instance of the ProtocolTransitionBuilder.
   * @return new instance of the ProtocolTransitionBuilder
   */
  public static ProtocolTransitionBuilder newProtocolTransitionBuilder() {
    return new ProtocolTransitionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ProtocolTransitionBuilder but() {
    ProtocolTransitionBuilder _builder = newProtocolTransitionBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureContainerSet = m_featureContainerSet;
    _builder.m_container = m_container;
    _builder.m_featureContainerBuilder = m_featureContainerBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEffectSet = m_featureEffectSet;
    _builder.m_effect = m_effect;
    _builder.m_featureEffectBuilder = m_featureEffectBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureGuardSet = m_featureGuardSet;
    _builder.m_guard = m_guard;
    _builder.m_featureGuardBuilder = m_featureGuardBuilder;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureKindSet = m_featureKindSet;
    _builder.m_kind = m_kind;
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
    _builder.m_featurePostConditionSet = m_featurePostConditionSet;
    _builder.m_postCondition = m_postCondition;
    _builder.m_featurePostConditionBuilder = m_featurePostConditionBuilder;
    _builder.m_featurePreConditionSet = m_featurePreConditionSet;
    _builder.m_preCondition = m_preCondition;
    _builder.m_featurePreConditionBuilder = m_featurePreConditionBuilder;
    _builder.m_featureRedefinedTransitionSet = m_featureRedefinedTransitionSet;
    _builder.m_redefinedTransition = m_redefinedTransition;
    _builder.m_featureRedefinedTransitionBuilder = m_featureRedefinedTransitionBuilder;
    _builder.m_featureSourceSet = m_featureSourceSet;
    _builder.m_source = m_source;
    _builder.m_featureSourceBuilder = m_featureSourceBuilder;
    _builder.m_featureTargetSet = m_featureTargetSet;
    _builder.m_target = m_target;
    _builder.m_featureTargetBuilder = m_featureTargetBuilder;
    _builder.m_featureTriggerSet = m_featureTriggerSet;
    _builder.m_trigger = m_trigger;
    _builder.m_featureTriggerBuilder = m_featureTriggerBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ProtocolTransition type.
   * @return new instance of the org.eclipse.uml2.uml.ProtocolTransition type
   */
  public org.eclipse.uml2.uml.ProtocolTransition build() {
    final org.eclipse.uml2.uml.ProtocolTransition _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createProtocolTransition();
    if (m_featureContainerSet) {
      _newInstance.setContainer(m_container);
    } else {
      if (m_featureContainerBuilder != null) {
        _newInstance.setContainer(m_featureContainerBuilder.build());
      }
    }
    if (m_featureEffectSet) {
      _newInstance.setEffect(m_effect);
    } else {
      if (m_featureEffectBuilder != null) {
        _newInstance.setEffect(m_featureEffectBuilder.build());
      }
    }
    if (m_featureGuardSet) {
      _newInstance.setGuard(m_guard);
    } else {
      if (m_featureGuardBuilder != null) {
        _newInstance.setGuard(m_featureGuardBuilder.build());
      }
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureKindSet) {
      _newInstance.setKind(m_kind);
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
    if (m_featurePostConditionSet) {
      _newInstance.setPostCondition(m_postCondition);
    } else {
      if (m_featurePostConditionBuilder != null) {
        _newInstance.setPostCondition(m_featurePostConditionBuilder.build());
      }
    }
    if (m_featurePreConditionSet) {
      _newInstance.setPreCondition(m_preCondition);
    } else {
      if (m_featurePreConditionBuilder != null) {
        _newInstance.setPreCondition(m_featurePreConditionBuilder.build());
      }
    }
    if (m_featureRedefinedTransitionSet) {
      _newInstance.setRedefinedTransition(m_redefinedTransition);
    } else {
      if (m_featureRedefinedTransitionBuilder != null) {
        _newInstance.setRedefinedTransition(m_featureRedefinedTransitionBuilder.build());
      }
    }
    if (m_featureSourceSet) {
      _newInstance.setSource(m_source);
    } else {
      if (m_featureSourceBuilder != null) {
        _newInstance.setSource(m_featureSourceBuilder.build());
      }
    }
    if (m_featureTargetSet) {
      _newInstance.setTarget(m_target);
    } else {
      if (m_featureTargetBuilder != null) {
        _newInstance.setTarget(m_featureTargetBuilder.build());
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
    if (m_featureElementImportSet) {
      _newInstance.getElementImports().addAll(m_elementImport);
    } else {
      if (!m_featureElementImportBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport> builder : m_featureElementImportBuilder) {
          _newInstance.getElementImports().add(builder.build());
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
    if (m_featureOwnedRuleSet) {
      _newInstance.getOwnedRules().addAll(m_ownedRule);
    } else {
      if (!m_featureOwnedRuleBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featureOwnedRuleBuilder) {
          _newInstance.getOwnedRules().add(builder.build());
        }
      }
    }
    if (m_featurePackageImportSet) {
      _newInstance.getPackageImports().addAll(m_packageImport);
    } else {
      if (!m_featurePackageImportBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport> builder : m_featurePackageImportBuilder) {
          _newInstance.getPackageImports().add(builder.build());
        }
      }
    }
    if (m_featureTriggerSet) {
      _newInstance.getTriggers().addAll(m_trigger);
    } else {
      if (!m_featureTriggerBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> builder : m_featureTriggerBuilder) {
          _newInstance.getTriggers().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ProtocolTransitionBuilder withContainer(org.eclipse.uml2.uml.Region p_container) {
    m_container = p_container;
    m_featureContainerSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withContainer(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> p_regionBuilder) {
    m_featureContainerBuilder = p_regionBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withEffect(org.eclipse.uml2.uml.Behavior p_effect) {
    m_effect = p_effect;
    m_featureEffectSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withEffect(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureEffectBuilder = p_behaviorBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withGuard(org.eclipse.uml2.uml.Constraint p_guard) {
    m_guard = p_guard;
    m_featureGuardSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withGuard(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureGuardBuilder = p_constraintBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withKind(org.eclipse.uml2.uml.TransitionKind p_kind) {
    m_kind = p_kind;
    m_featureKindSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withPostCondition(org.eclipse.uml2.uml.Constraint p_postCondition) {
    m_postCondition = p_postCondition;
    m_featurePostConditionSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withPostCondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featurePostConditionBuilder = p_constraintBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withPreCondition(org.eclipse.uml2.uml.Constraint p_preCondition) {
    m_preCondition = p_preCondition;
    m_featurePreConditionSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withPreCondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featurePreConditionBuilder = p_constraintBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withRedefinedTransition(org.eclipse.uml2.uml.Transition p_redefinedTransition) {
    m_redefinedTransition = p_redefinedTransition;
    m_featureRedefinedTransitionSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withRedefinedTransition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Transition> p_transitionBuilder) {
    m_featureRedefinedTransitionBuilder = p_transitionBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withSource(org.eclipse.uml2.uml.Vertex p_source) {
    m_source = p_source;
    m_featureSourceSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withSource(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Vertex> p_vertexBuilder) {
    m_featureSourceBuilder = p_vertexBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withTarget(org.eclipse.uml2.uml.Vertex p_target) {
    m_target = p_target;
    m_featureTargetSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withTarget(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Vertex> p_vertexBuilder) {
    m_featureTargetBuilder = p_vertexBuilder;
    return this;
  }

  public ProtocolTransitionBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ProtocolTransitionBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ProtocolTransitionBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ProtocolTransitionBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ProtocolTransitionBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ProtocolTransitionBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withElementImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport> p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public ProtocolTransitionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ProtocolTransitionBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withOwnedRule(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public ProtocolTransitionBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withPackageImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport> p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public ProtocolTransitionBuilder withTrigger(org.eclipse.uml2.uml.Trigger p_trigger) {
    m_trigger.add(p_trigger);
    m_featureTriggerSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withTrigger(java.util.Collection<? extends org.eclipse.uml2.uml.Trigger> p_trigger) {
    m_trigger.addAll(p_trigger);
    m_featureTriggerSet = true;
    return this;
  }

  public ProtocolTransitionBuilder withTrigger(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> p_triggerBuilder) {
    m_featureTriggerBuilder.add(p_triggerBuilder);
    return this;
  }
}
