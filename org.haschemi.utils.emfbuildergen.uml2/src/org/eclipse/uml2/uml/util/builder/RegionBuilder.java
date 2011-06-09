package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Region</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class RegionBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Region m_extendedRegion;
  private org.eclipse.uml2.uml.util.builder.RegionBuilder m_featureExtendedRegionBuilder;
  private Boolean m_isLeaf;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.State m_state;
  private org.eclipse.uml2.uml.util.builder.StateBuilder m_featureStateBuilder;
  private org.eclipse.uml2.uml.StateMachine m_stateMachine;
  private org.eclipse.uml2.uml.util.builder.StateMachineBuilder m_featureStateMachineBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ElementImportBuilder> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ElementImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PackageImportBuilder> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PackageImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Vertex> m_subvertex = new java.util.LinkedList<org.eclipse.uml2.uml.Vertex>();
  private java.util.Collection<org.eclipse.uml2.uml.Transition> m_transition = new java.util.LinkedList<org.eclipse.uml2.uml.Transition>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.TransitionBuilder> m_featureTransitionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.TransitionBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureExtendedRegionSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featureStateSet = false;
  private boolean m_featureStateMachineSet = false;
  private boolean m_featureSubvertexSet = false;
  private boolean m_featureTransitionSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newRegionBuilder()
   */
  private RegionBuilder() {
  }

  /**
   * This method creates a new instance of the RegionBuilder.
   * @return new instance of the RegionBuilder
   */
  public static RegionBuilder newRegionBuilder() {
    return new RegionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public RegionBuilder but() {
    RegionBuilder _builder = newRegionBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureExtendedRegionSet = m_featureExtendedRegionSet;
    _builder.m_extendedRegion = m_extendedRegion;
    _builder.m_featureExtendedRegionBuilder = m_featureExtendedRegionBuilder;
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
    _builder.m_featureOwnedRuleSet = m_featureOwnedRuleSet;
    _builder.m_ownedRule = m_ownedRule;
    _builder.m_featureOwnedRuleBuilder = m_featureOwnedRuleBuilder;
    _builder.m_featurePackageImportSet = m_featurePackageImportSet;
    _builder.m_packageImport = m_packageImport;
    _builder.m_featurePackageImportBuilder = m_featurePackageImportBuilder;
    _builder.m_featureStateSet = m_featureStateSet;
    _builder.m_state = m_state;
    _builder.m_featureStateBuilder = m_featureStateBuilder;
    _builder.m_featureStateMachineSet = m_featureStateMachineSet;
    _builder.m_stateMachine = m_stateMachine;
    _builder.m_featureStateMachineBuilder = m_featureStateMachineBuilder;
    _builder.m_featureSubvertexSet = m_featureSubvertexSet;
    _builder.m_subvertex = m_subvertex;
    _builder.m_featureTransitionSet = m_featureTransitionSet;
    _builder.m_transition = m_transition;
    _builder.m_featureTransitionBuilder = m_featureTransitionBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Region type.
   * @return new instance of the org.eclipse.uml2.uml.Region type
   */
  public org.eclipse.uml2.uml.Region build() {
    final org.eclipse.uml2.uml.Region _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createRegion();
    if (m_featureExtendedRegionSet) {
      _newInstance.setExtendedRegion(m_extendedRegion);
    } else {
      if (m_featureExtendedRegionBuilder != null) {
        _newInstance.setExtendedRegion(m_featureExtendedRegionBuilder.build());
      }
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
    if (m_featureStateSet) {
      _newInstance.setState(m_state);
    } else {
      if (m_featureStateBuilder != null) {
        _newInstance.setState(m_featureStateBuilder.build());
      }
    }
    if (m_featureStateMachineSet) {
      _newInstance.setStateMachine(m_stateMachine);
    } else {
      if (m_featureStateMachineBuilder != null) {
        _newInstance.setStateMachine(m_featureStateMachineBuilder.build());
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
    if (m_featureSubvertexSet) {
      _newInstance.getSubvertices().addAll(m_subvertex);
    }
    if (m_featureTransitionSet) {
      _newInstance.getTransitions().addAll(m_transition);
    } else {
      if (!m_featureTransitionBuilder.isEmpty()) {
        for (TransitionBuilder builder : m_featureTransitionBuilder) {
          _newInstance.getTransitions().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public RegionBuilder withExtendedRegion(org.eclipse.uml2.uml.Region p_extendedRegion) {
    m_extendedRegion = p_extendedRegion;
    m_featureExtendedRegionSet = true;
    return this;
  }

  public RegionBuilder withExtendedRegion(org.eclipse.uml2.uml.util.builder.RegionBuilder p_regionBuilder) {
    m_featureExtendedRegionBuilder = p_regionBuilder;
    return this;
  }

  public RegionBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public RegionBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public RegionBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public RegionBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public RegionBuilder withState(org.eclipse.uml2.uml.State p_state) {
    m_state = p_state;
    m_featureStateSet = true;
    return this;
  }

  public RegionBuilder withState(org.eclipse.uml2.uml.util.builder.StateBuilder p_stateBuilder) {
    m_featureStateBuilder = p_stateBuilder;
    return this;
  }

  public RegionBuilder withStateMachine(org.eclipse.uml2.uml.StateMachine p_stateMachine) {
    m_stateMachine = p_stateMachine;
    m_featureStateMachineSet = true;
    return this;
  }

  public RegionBuilder withStateMachine(org.eclipse.uml2.uml.util.builder.StateMachineBuilder p_stateMachineBuilder) {
    m_featureStateMachineBuilder = p_stateMachineBuilder;
    return this;
  }

  public RegionBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public RegionBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public RegionBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public RegionBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public RegionBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public RegionBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public RegionBuilder withElementImport(ElementImportBuilder p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public RegionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public RegionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public RegionBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public RegionBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public RegionBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public RegionBuilder withOwnedRule(ConstraintBuilder p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public RegionBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public RegionBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public RegionBuilder withPackageImport(PackageImportBuilder p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public RegionBuilder withSubvertex(org.eclipse.uml2.uml.Vertex p_subvertex) {
    m_subvertex.add(p_subvertex);
    m_featureSubvertexSet = true;
    return this;
  }

  public RegionBuilder withSubvertex(java.util.Collection<? extends org.eclipse.uml2.uml.Vertex> p_subvertex) {
    m_subvertex.addAll(p_subvertex);
    m_featureSubvertexSet = true;
    return this;
  }

  public RegionBuilder withTransition(org.eclipse.uml2.uml.Transition p_transition) {
    m_transition.add(p_transition);
    m_featureTransitionSet = true;
    return this;
  }

  public RegionBuilder withTransition(java.util.Collection<? extends org.eclipse.uml2.uml.Transition> p_transition) {
    m_transition.addAll(p_transition);
    m_featureTransitionSet = true;
    return this;
  }

  public RegionBuilder withTransition(TransitionBuilder p_transitionBuilder) {
    m_featureTransitionBuilder.add(p_transitionBuilder);
    return this;
  }
}
