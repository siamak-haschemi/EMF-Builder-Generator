package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.FinalState</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class FinalStateBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Region m_container;
  private org.eclipse.uml2.uml.util.builder.RegionBuilder m_featureContainerBuilder;
  private org.eclipse.uml2.uml.Behavior m_doActivity;
  private org.eclipse.uml2.uml.Behavior m_entry;
  private org.eclipse.uml2.uml.Behavior m_exit;
  private Boolean m_isLeaf;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.State m_redefinedState;
  private org.eclipse.uml2.uml.util.builder.StateBuilder m_featureRedefinedStateBuilder;
  private org.eclipse.uml2.uml.Constraint m_stateInvariant;
  private org.eclipse.uml2.uml.util.builder.ConstraintBuilder m_featureStateInvariantBuilder;
  private org.eclipse.uml2.uml.StateMachine m_submachine;
  private org.eclipse.uml2.uml.util.builder.StateMachineBuilder m_featureSubmachineBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ConnectionPointReference> m_connection = new java.util.LinkedList<org.eclipse.uml2.uml.ConnectionPointReference>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConnectionPointReferenceBuilder> m_featureConnectionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConnectionPointReferenceBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Pseudostate> m_connectionPoint = new java.util.LinkedList<org.eclipse.uml2.uml.Pseudostate>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PseudostateBuilder> m_featureConnectionPointBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PseudostateBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Trigger> m_deferrableTrigger = new java.util.LinkedList<org.eclipse.uml2.uml.Trigger>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.TriggerBuilder> m_featureDeferrableTriggerBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.TriggerBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ElementImportBuilder> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ElementImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PackageImportBuilder> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PackageImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Region> m_region = new java.util.LinkedList<org.eclipse.uml2.uml.Region>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.RegionBuilder> m_featureRegionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.RegionBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConnectionSet = false;
  private boolean m_featureConnectionPointSet = false;
  private boolean m_featureContainerSet = false;
  private boolean m_featureDeferrableTriggerSet = false;
  private boolean m_featureDoActivitySet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureEntrySet = false;
  private boolean m_featureExitSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featureRedefinedStateSet = false;
  private boolean m_featureRegionSet = false;
  private boolean m_featureStateInvariantSet = false;
  private boolean m_featureSubmachineSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newFinalStateBuilder()
   */
  private FinalStateBuilder() {
  }

  /**
   * This method creates a new instance of the FinalStateBuilder.
   * @return new instance of the FinalStateBuilder
   */
  public static FinalStateBuilder newFinalStateBuilder() {
    return new FinalStateBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public FinalStateBuilder but() {
    FinalStateBuilder _builder = newFinalStateBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureConnectionSet = m_featureConnectionSet;
    _builder.m_connection = m_connection;
    _builder.m_featureConnectionBuilder = m_featureConnectionBuilder;
    _builder.m_featureConnectionPointSet = m_featureConnectionPointSet;
    _builder.m_connectionPoint = m_connectionPoint;
    _builder.m_featureConnectionPointBuilder = m_featureConnectionPointBuilder;
    _builder.m_featureContainerSet = m_featureContainerSet;
    _builder.m_container = m_container;
    _builder.m_featureContainerBuilder = m_featureContainerBuilder;
    _builder.m_featureDeferrableTriggerSet = m_featureDeferrableTriggerSet;
    _builder.m_deferrableTrigger = m_deferrableTrigger;
    _builder.m_featureDeferrableTriggerBuilder = m_featureDeferrableTriggerBuilder;
    _builder.m_featureDoActivitySet = m_featureDoActivitySet;
    _builder.m_doActivity = m_doActivity;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureEntrySet = m_featureEntrySet;
    _builder.m_entry = m_entry;
    _builder.m_featureExitSet = m_featureExitSet;
    _builder.m_exit = m_exit;
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
    _builder.m_featureRedefinedStateSet = m_featureRedefinedStateSet;
    _builder.m_redefinedState = m_redefinedState;
    _builder.m_featureRedefinedStateBuilder = m_featureRedefinedStateBuilder;
    _builder.m_featureRegionSet = m_featureRegionSet;
    _builder.m_region = m_region;
    _builder.m_featureRegionBuilder = m_featureRegionBuilder;
    _builder.m_featureStateInvariantSet = m_featureStateInvariantSet;
    _builder.m_stateInvariant = m_stateInvariant;
    _builder.m_featureStateInvariantBuilder = m_featureStateInvariantBuilder;
    _builder.m_featureSubmachineSet = m_featureSubmachineSet;
    _builder.m_submachine = m_submachine;
    _builder.m_featureSubmachineBuilder = m_featureSubmachineBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.FinalState type.
   * @return new instance of the org.eclipse.uml2.uml.FinalState type
   */
  public org.eclipse.uml2.uml.FinalState build() {
    final org.eclipse.uml2.uml.FinalState _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createFinalState();
    if (m_featureContainerSet) {
      _newInstance.setContainer(m_container);
    } else {
      if (m_featureContainerBuilder != null) {
        _newInstance.setContainer(m_featureContainerBuilder.build());
      }
    }
    if (m_featureDoActivitySet) {
      _newInstance.setDoActivity(m_doActivity);
    }
    if (m_featureEntrySet) {
      _newInstance.setEntry(m_entry);
    }
    if (m_featureExitSet) {
      _newInstance.setExit(m_exit);
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
    if (m_featureRedefinedStateSet) {
      _newInstance.setRedefinedState(m_redefinedState);
    } else {
      if (m_featureRedefinedStateBuilder != null) {
        _newInstance.setRedefinedState(m_featureRedefinedStateBuilder.build());
      }
    }
    if (m_featureStateInvariantSet) {
      _newInstance.setStateInvariant(m_stateInvariant);
    } else {
      if (m_featureStateInvariantBuilder != null) {
        _newInstance.setStateInvariant(m_featureStateInvariantBuilder.build());
      }
    }
    if (m_featureSubmachineSet) {
      _newInstance.setSubmachine(m_submachine);
    } else {
      if (m_featureSubmachineBuilder != null) {
        _newInstance.setSubmachine(m_featureSubmachineBuilder.build());
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
    if (m_featureConnectionSet) {
      _newInstance.getConnections().addAll(m_connection);
    } else {
      if (!m_featureConnectionBuilder.isEmpty()) {
        for (ConnectionPointReferenceBuilder builder : m_featureConnectionBuilder) {
          _newInstance.getConnections().add(builder.build());
        }
      }
    }
    if (m_featureConnectionPointSet) {
      _newInstance.getConnectionPoints().addAll(m_connectionPoint);
    } else {
      if (!m_featureConnectionPointBuilder.isEmpty()) {
        for (PseudostateBuilder builder : m_featureConnectionPointBuilder) {
          _newInstance.getConnectionPoints().add(builder.build());
        }
      }
    }
    if (m_featureDeferrableTriggerSet) {
      _newInstance.getDeferrableTriggers().addAll(m_deferrableTrigger);
    } else {
      if (!m_featureDeferrableTriggerBuilder.isEmpty()) {
        for (TriggerBuilder builder : m_featureDeferrableTriggerBuilder) {
          _newInstance.getDeferrableTriggers().add(builder.build());
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
    if (m_featureRegionSet) {
      _newInstance.getRegions().addAll(m_region);
    } else {
      if (!m_featureRegionBuilder.isEmpty()) {
        for (RegionBuilder builder : m_featureRegionBuilder) {
          _newInstance.getRegions().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public FinalStateBuilder withContainer(org.eclipse.uml2.uml.Region p_container) {
    m_container = p_container;
    m_featureContainerSet = true;
    return this;
  }

  public FinalStateBuilder withContainer(org.eclipse.uml2.uml.util.builder.RegionBuilder p_regionBuilder) {
    m_featureContainerBuilder = p_regionBuilder;
    return this;
  }

  public FinalStateBuilder withDoActivity(org.eclipse.uml2.uml.Behavior p_doActivity) {
    m_doActivity = p_doActivity;
    m_featureDoActivitySet = true;
    return this;
  }

  public FinalStateBuilder withEntry(org.eclipse.uml2.uml.Behavior p_entry) {
    m_entry = p_entry;
    m_featureEntrySet = true;
    return this;
  }

  public FinalStateBuilder withExit(org.eclipse.uml2.uml.Behavior p_exit) {
    m_exit = p_exit;
    m_featureExitSet = true;
    return this;
  }

  public FinalStateBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public FinalStateBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public FinalStateBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public FinalStateBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public FinalStateBuilder withRedefinedState(org.eclipse.uml2.uml.State p_redefinedState) {
    m_redefinedState = p_redefinedState;
    m_featureRedefinedStateSet = true;
    return this;
  }

  public FinalStateBuilder withRedefinedState(org.eclipse.uml2.uml.util.builder.StateBuilder p_stateBuilder) {
    m_featureRedefinedStateBuilder = p_stateBuilder;
    return this;
  }

  public FinalStateBuilder withStateInvariant(org.eclipse.uml2.uml.Constraint p_stateInvariant) {
    m_stateInvariant = p_stateInvariant;
    m_featureStateInvariantSet = true;
    return this;
  }

  public FinalStateBuilder withStateInvariant(org.eclipse.uml2.uml.util.builder.ConstraintBuilder p_constraintBuilder) {
    m_featureStateInvariantBuilder = p_constraintBuilder;
    return this;
  }

  public FinalStateBuilder withSubmachine(org.eclipse.uml2.uml.StateMachine p_submachine) {
    m_submachine = p_submachine;
    m_featureSubmachineSet = true;
    return this;
  }

  public FinalStateBuilder withSubmachine(org.eclipse.uml2.uml.util.builder.StateMachineBuilder p_stateMachineBuilder) {
    m_featureSubmachineBuilder = p_stateMachineBuilder;
    return this;
  }

  public FinalStateBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public FinalStateBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public FinalStateBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public FinalStateBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public FinalStateBuilder withConnection(org.eclipse.uml2.uml.ConnectionPointReference p_connection) {
    m_connection.add(p_connection);
    m_featureConnectionSet = true;
    return this;
  }

  public FinalStateBuilder withConnection(java.util.Collection<? extends org.eclipse.uml2.uml.ConnectionPointReference> p_connection) {
    m_connection.addAll(p_connection);
    m_featureConnectionSet = true;
    return this;
  }

  public FinalStateBuilder withConnection(ConnectionPointReferenceBuilder p_connectionPointReferenceBuilder) {
    m_featureConnectionBuilder.add(p_connectionPointReferenceBuilder);
    return this;
  }

  public FinalStateBuilder withConnectionPoint(org.eclipse.uml2.uml.Pseudostate p_connectionPoint) {
    m_connectionPoint.add(p_connectionPoint);
    m_featureConnectionPointSet = true;
    return this;
  }

  public FinalStateBuilder withConnectionPoint(java.util.Collection<? extends org.eclipse.uml2.uml.Pseudostate> p_connectionPoint) {
    m_connectionPoint.addAll(p_connectionPoint);
    m_featureConnectionPointSet = true;
    return this;
  }

  public FinalStateBuilder withConnectionPoint(PseudostateBuilder p_pseudostateBuilder) {
    m_featureConnectionPointBuilder.add(p_pseudostateBuilder);
    return this;
  }

  public FinalStateBuilder withDeferrableTrigger(org.eclipse.uml2.uml.Trigger p_deferrableTrigger) {
    m_deferrableTrigger.add(p_deferrableTrigger);
    m_featureDeferrableTriggerSet = true;
    return this;
  }

  public FinalStateBuilder withDeferrableTrigger(java.util.Collection<? extends org.eclipse.uml2.uml.Trigger> p_deferrableTrigger) {
    m_deferrableTrigger.addAll(p_deferrableTrigger);
    m_featureDeferrableTriggerSet = true;
    return this;
  }

  public FinalStateBuilder withDeferrableTrigger(TriggerBuilder p_triggerBuilder) {
    m_featureDeferrableTriggerBuilder.add(p_triggerBuilder);
    return this;
  }

  public FinalStateBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public FinalStateBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public FinalStateBuilder withElementImport(ElementImportBuilder p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public FinalStateBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public FinalStateBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public FinalStateBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public FinalStateBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public FinalStateBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public FinalStateBuilder withOwnedRule(ConstraintBuilder p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public FinalStateBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public FinalStateBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public FinalStateBuilder withPackageImport(PackageImportBuilder p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public FinalStateBuilder withRegion(org.eclipse.uml2.uml.Region p_region) {
    m_region.add(p_region);
    m_featureRegionSet = true;
    return this;
  }

  public FinalStateBuilder withRegion(java.util.Collection<? extends org.eclipse.uml2.uml.Region> p_region) {
    m_region.addAll(p_region);
    m_featureRegionSet = true;
    return this;
  }

  public FinalStateBuilder withRegion(RegionBuilder p_regionBuilder) {
    m_featureRegionBuilder.add(p_regionBuilder);
    return this;
  }
}
