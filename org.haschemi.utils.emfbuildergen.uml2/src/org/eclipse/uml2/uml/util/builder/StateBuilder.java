package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.State</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class StateBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.State> {
  // features and builders
  private org.eclipse.uml2.uml.Region m_container;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> m_featureContainerBuilder;
  private org.eclipse.uml2.uml.Behavior m_doActivity;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> m_featureDoActivityBuilder;
  private org.eclipse.uml2.uml.Behavior m_entry;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> m_featureEntryBuilder;
  private org.eclipse.uml2.uml.Behavior m_exit;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> m_featureExitBuilder;
  private Boolean m_isLeaf;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.State m_redefinedState;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.State> m_featureRedefinedStateBuilder;
  private org.eclipse.uml2.uml.Constraint m_stateInvariant;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> m_featureStateInvariantBuilder;
  private org.eclipse.uml2.uml.StateMachine m_submachine;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StateMachine> m_featureSubmachineBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.uml2.uml.ConnectionPointReference> m_connection = new java.util.LinkedList<org.eclipse.uml2.uml.ConnectionPointReference>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ConnectionPointReference>> m_featureConnectionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ConnectionPointReference>>();
  private java.util.Collection<org.eclipse.uml2.uml.Pseudostate> m_connectionPoint = new java.util.LinkedList<org.eclipse.uml2.uml.Pseudostate>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate>> m_featureConnectionPointBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate>>();
  private java.util.Collection<org.eclipse.uml2.uml.Trigger> m_deferrableTrigger = new java.util.LinkedList<org.eclipse.uml2.uml.Trigger>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger>> m_featureDeferrableTriggerBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger>>();
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
  private java.util.Collection<org.eclipse.uml2.uml.Region> m_region = new java.util.LinkedList<org.eclipse.uml2.uml.Region>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region>> m_featureRegionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConnectionSet = false;
  private boolean m_featureConnectionPointSet = false;
  private boolean m_featureContainerSet = false;
  private boolean m_featureDeferrableTriggerSet = false;
  private boolean m_featureDoActivitySet = false;
  private boolean m_featureEAnnotationsSet = false;
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
   * @see #newStateBuilder()
   */
  private StateBuilder() {
  }

  /**
   * This method creates a new instance of the StateBuilder.
   * @return new instance of the StateBuilder
   */
  public static StateBuilder newStateBuilder() {
    return new StateBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public StateBuilder but() {
    StateBuilder _builder = newStateBuilder();
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
    _builder.m_featureDoActivityBuilder = m_featureDoActivityBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureEntrySet = m_featureEntrySet;
    _builder.m_entry = m_entry;
    _builder.m_featureEntryBuilder = m_featureEntryBuilder;
    _builder.m_featureExitSet = m_featureExitSet;
    _builder.m_exit = m_exit;
    _builder.m_featureExitBuilder = m_featureExitBuilder;
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
   * This method constructs the final org.eclipse.uml2.uml.State type.
   * @return new instance of the org.eclipse.uml2.uml.State type
   */
  public org.eclipse.uml2.uml.State build() {
    final org.eclipse.uml2.uml.State _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createState();
    if (m_featureContainerSet) {
      _newInstance.setContainer(m_container);
    } else {
      if (m_featureContainerBuilder != null) {
        _newInstance.setContainer(m_featureContainerBuilder.build());
      }
    }
    if (m_featureDoActivitySet) {
      _newInstance.setDoActivity(m_doActivity);
    } else {
      if (m_featureDoActivityBuilder != null) {
        _newInstance.setDoActivity(m_featureDoActivityBuilder.build());
      }
    }
    if (m_featureEntrySet) {
      _newInstance.setEntry(m_entry);
    } else {
      if (m_featureEntryBuilder != null) {
        _newInstance.setEntry(m_featureEntryBuilder.build());
      }
    }
    if (m_featureExitSet) {
      _newInstance.setExit(m_exit);
    } else {
      if (m_featureExitBuilder != null) {
        _newInstance.setExit(m_featureExitBuilder.build());
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
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> builder : m_featureClientDependencyBuilder) {
          _newInstance.getClientDependencies().add(builder.build());
        }
      }
    }
    if (m_featureConnectionSet) {
      _newInstance.getConnections().addAll(m_connection);
    } else {
      if (!m_featureConnectionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ConnectionPointReference> builder : m_featureConnectionBuilder) {
          _newInstance.getConnections().add(builder.build());
        }
      }
    }
    if (m_featureConnectionPointSet) {
      _newInstance.getConnectionPoints().addAll(m_connectionPoint);
    } else {
      if (!m_featureConnectionPointBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate> builder : m_featureConnectionPointBuilder) {
          _newInstance.getConnectionPoints().add(builder.build());
        }
      }
    }
    if (m_featureDeferrableTriggerSet) {
      _newInstance.getDeferrableTriggers().addAll(m_deferrableTrigger);
    } else {
      if (!m_featureDeferrableTriggerBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> builder : m_featureDeferrableTriggerBuilder) {
          _newInstance.getDeferrableTriggers().add(builder.build());
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
    if (m_featureRegionSet) {
      _newInstance.getRegions().addAll(m_region);
    } else {
      if (!m_featureRegionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> builder : m_featureRegionBuilder) {
          _newInstance.getRegions().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public StateBuilder withContainer(org.eclipse.uml2.uml.Region p_container) {
    m_container = p_container;
    m_featureContainerSet = true;
    return this;
  }

  public StateBuilder withContainer(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> p_regionBuilder) {
    m_featureContainerBuilder = p_regionBuilder;
    return this;
  }

  public StateBuilder withDoActivity(org.eclipse.uml2.uml.Behavior p_doActivity) {
    m_doActivity = p_doActivity;
    m_featureDoActivitySet = true;
    return this;
  }

  public StateBuilder withDoActivity(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureDoActivityBuilder = p_behaviorBuilder;
    return this;
  }

  public StateBuilder withEntry(org.eclipse.uml2.uml.Behavior p_entry) {
    m_entry = p_entry;
    m_featureEntrySet = true;
    return this;
  }

  public StateBuilder withEntry(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureEntryBuilder = p_behaviorBuilder;
    return this;
  }

  public StateBuilder withExit(org.eclipse.uml2.uml.Behavior p_exit) {
    m_exit = p_exit;
    m_featureExitSet = true;
    return this;
  }

  public StateBuilder withExit(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureExitBuilder = p_behaviorBuilder;
    return this;
  }

  public StateBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public StateBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public StateBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public StateBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public StateBuilder withRedefinedState(org.eclipse.uml2.uml.State p_redefinedState) {
    m_redefinedState = p_redefinedState;
    m_featureRedefinedStateSet = true;
    return this;
  }

  public StateBuilder withRedefinedState(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.State> p_stateBuilder) {
    m_featureRedefinedStateBuilder = p_stateBuilder;
    return this;
  }

  public StateBuilder withStateInvariant(org.eclipse.uml2.uml.Constraint p_stateInvariant) {
    m_stateInvariant = p_stateInvariant;
    m_featureStateInvariantSet = true;
    return this;
  }

  public StateBuilder withStateInvariant(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureStateInvariantBuilder = p_constraintBuilder;
    return this;
  }

  public StateBuilder withSubmachine(org.eclipse.uml2.uml.StateMachine p_submachine) {
    m_submachine = p_submachine;
    m_featureSubmachineSet = true;
    return this;
  }

  public StateBuilder withSubmachine(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StateMachine> p_stateMachineBuilder) {
    m_featureSubmachineBuilder = p_stateMachineBuilder;
    return this;
  }

  public StateBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public StateBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public StateBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public StateBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public StateBuilder withConnection(org.eclipse.uml2.uml.ConnectionPointReference p_connection) {
    m_connection.add(p_connection);
    m_featureConnectionSet = true;
    return this;
  }

  public StateBuilder withConnection(java.util.Collection<? extends org.eclipse.uml2.uml.ConnectionPointReference> p_connection) {
    m_connection.addAll(p_connection);
    m_featureConnectionSet = true;
    return this;
  }

  public StateBuilder withConnection(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ConnectionPointReference> p_connectionPointReferenceBuilder) {
    m_featureConnectionBuilder.add(p_connectionPointReferenceBuilder);
    return this;
  }

  public StateBuilder withConnectionPoint(org.eclipse.uml2.uml.Pseudostate p_connectionPoint) {
    m_connectionPoint.add(p_connectionPoint);
    m_featureConnectionPointSet = true;
    return this;
  }

  public StateBuilder withConnectionPoint(java.util.Collection<? extends org.eclipse.uml2.uml.Pseudostate> p_connectionPoint) {
    m_connectionPoint.addAll(p_connectionPoint);
    m_featureConnectionPointSet = true;
    return this;
  }

  public StateBuilder withConnectionPoint(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate> p_pseudostateBuilder) {
    m_featureConnectionPointBuilder.add(p_pseudostateBuilder);
    return this;
  }

  public StateBuilder withDeferrableTrigger(org.eclipse.uml2.uml.Trigger p_deferrableTrigger) {
    m_deferrableTrigger.add(p_deferrableTrigger);
    m_featureDeferrableTriggerSet = true;
    return this;
  }

  public StateBuilder withDeferrableTrigger(java.util.Collection<? extends org.eclipse.uml2.uml.Trigger> p_deferrableTrigger) {
    m_deferrableTrigger.addAll(p_deferrableTrigger);
    m_featureDeferrableTriggerSet = true;
    return this;
  }

  public StateBuilder withDeferrableTrigger(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> p_triggerBuilder) {
    m_featureDeferrableTriggerBuilder.add(p_triggerBuilder);
    return this;
  }

  public StateBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public StateBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public StateBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public StateBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public StateBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public StateBuilder withElementImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport> p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public StateBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public StateBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public StateBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public StateBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public StateBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public StateBuilder withOwnedRule(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public StateBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public StateBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public StateBuilder withPackageImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport> p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public StateBuilder withRegion(org.eclipse.uml2.uml.Region p_region) {
    m_region.add(p_region);
    m_featureRegionSet = true;
    return this;
  }

  public StateBuilder withRegion(java.util.Collection<? extends org.eclipse.uml2.uml.Region> p_region) {
    m_region.addAll(p_region);
    m_featureRegionSet = true;
    return this;
  }

  public StateBuilder withRegion(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> p_regionBuilder) {
    m_featureRegionBuilder.add(p_regionBuilder);
    return this;
  }
}
