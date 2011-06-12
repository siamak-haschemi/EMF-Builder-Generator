package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ConditionalNode</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConditionalNodeBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ConditionalNode> {
  // features and builders
  private org.eclipse.uml2.uml.Activity m_activity;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> m_featureActivityBuilder;
  private org.eclipse.uml2.uml.Activity m_inActivity;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> m_featureInActivityBuilder;
  private org.eclipse.uml2.uml.StructuredActivityNode m_inStructuredNode;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StructuredActivityNode> m_featureInStructuredNodeBuilder;
  private Boolean m_isAssured;
  private Boolean m_isDeterminate;
  private Boolean m_isLeaf;
  private Boolean m_mustIsolate;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Clause> m_clause = new java.util.LinkedList<org.eclipse.uml2.uml.Clause>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Clause>> m_featureClauseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Clause>>();
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_edge = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureEdgeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport>> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport>>();
  private java.util.Collection<org.eclipse.uml2.uml.ExceptionHandler> m_handler = new java.util.LinkedList<org.eclipse.uml2.uml.ExceptionHandler>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExceptionHandler>> m_featureHandlerBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExceptionHandler>>();
  private java.util.Collection<org.eclipse.uml2.uml.InterruptibleActivityRegion> m_inInterruptibleRegion = new java.util.LinkedList<org.eclipse.uml2.uml.InterruptibleActivityRegion>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion>> m_featureInInterruptibleRegionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityPartition> m_inPartition = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityPartition>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition>> m_featureInPartitionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_incoming = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureIncomingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_localPostcondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featureLocalPostconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_localPrecondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featureLocalPreconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityNode> m_node = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityNode>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>> m_featureNodeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityEdge> m_outgoing = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityEdge>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>> m_featureOutgoingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport>> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport>>();
  private java.util.Collection<org.eclipse.uml2.uml.ActivityNode> m_redefinedNode = new java.util.LinkedList<org.eclipse.uml2.uml.ActivityNode>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>> m_featureRedefinedNodeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode>>();
  private java.util.Collection<org.eclipse.uml2.uml.OutputPin> m_result = new java.util.LinkedList<org.eclipse.uml2.uml.OutputPin>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.OutputPin>> m_featureResultBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.OutputPin>>();
  private java.util.Collection<org.eclipse.uml2.uml.Variable> m_variable = new java.util.LinkedList<org.eclipse.uml2.uml.Variable>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Variable>> m_featureVariableBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Variable>>();
  // helper attributes
  private boolean m_featureActivitySet = false;
  private boolean m_featureClauseSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEdgeSet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureHandlerSet = false;
  private boolean m_featureInActivitySet = false;
  private boolean m_featureInInterruptibleRegionSet = false;
  private boolean m_featureInPartitionSet = false;
  private boolean m_featureInStructuredNodeSet = false;
  private boolean m_featureIncomingSet = false;
  private boolean m_featureIsAssuredSet = false;
  private boolean m_featureIsDeterminateSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureLocalPostconditionSet = false;
  private boolean m_featureLocalPreconditionSet = false;
  private boolean m_featureMustIsolateSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureNodeSet = false;
  private boolean m_featureOutgoingSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featureRedefinedNodeSet = false;
  private boolean m_featureResultSet = false;
  private boolean m_featureVariableSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newConditionalNodeBuilder()
   */
  private ConditionalNodeBuilder() {
  }

  /**
   * This method creates a new instance of the ConditionalNodeBuilder.
   * @return new instance of the ConditionalNodeBuilder
   */
  public static ConditionalNodeBuilder newConditionalNodeBuilder() {
    return new ConditionalNodeBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ConditionalNodeBuilder but() {
    ConditionalNodeBuilder _builder = newConditionalNodeBuilder();
    _builder.m_featureActivitySet = m_featureActivitySet;
    _builder.m_activity = m_activity;
    _builder.m_featureActivityBuilder = m_featureActivityBuilder;
    _builder.m_featureClauseSet = m_featureClauseSet;
    _builder.m_clause = m_clause;
    _builder.m_featureClauseBuilder = m_featureClauseBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEdgeSet = m_featureEdgeSet;
    _builder.m_edge = m_edge;
    _builder.m_featureEdgeBuilder = m_featureEdgeBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureHandlerSet = m_featureHandlerSet;
    _builder.m_handler = m_handler;
    _builder.m_featureHandlerBuilder = m_featureHandlerBuilder;
    _builder.m_featureInActivitySet = m_featureInActivitySet;
    _builder.m_inActivity = m_inActivity;
    _builder.m_featureInActivityBuilder = m_featureInActivityBuilder;
    _builder.m_featureInInterruptibleRegionSet = m_featureInInterruptibleRegionSet;
    _builder.m_inInterruptibleRegion = m_inInterruptibleRegion;
    _builder.m_featureInInterruptibleRegionBuilder = m_featureInInterruptibleRegionBuilder;
    _builder.m_featureInPartitionSet = m_featureInPartitionSet;
    _builder.m_inPartition = m_inPartition;
    _builder.m_featureInPartitionBuilder = m_featureInPartitionBuilder;
    _builder.m_featureInStructuredNodeSet = m_featureInStructuredNodeSet;
    _builder.m_inStructuredNode = m_inStructuredNode;
    _builder.m_featureInStructuredNodeBuilder = m_featureInStructuredNodeBuilder;
    _builder.m_featureIncomingSet = m_featureIncomingSet;
    _builder.m_incoming = m_incoming;
    _builder.m_featureIncomingBuilder = m_featureIncomingBuilder;
    _builder.m_featureIsAssuredSet = m_featureIsAssuredSet;
    _builder.m_isAssured = m_isAssured;
    _builder.m_featureIsDeterminateSet = m_featureIsDeterminateSet;
    _builder.m_isDeterminate = m_isDeterminate;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureLocalPostconditionSet = m_featureLocalPostconditionSet;
    _builder.m_localPostcondition = m_localPostcondition;
    _builder.m_featureLocalPostconditionBuilder = m_featureLocalPostconditionBuilder;
    _builder.m_featureLocalPreconditionSet = m_featureLocalPreconditionSet;
    _builder.m_localPrecondition = m_localPrecondition;
    _builder.m_featureLocalPreconditionBuilder = m_featureLocalPreconditionBuilder;
    _builder.m_featureMustIsolateSet = m_featureMustIsolateSet;
    _builder.m_mustIsolate = m_mustIsolate;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureNodeSet = m_featureNodeSet;
    _builder.m_node = m_node;
    _builder.m_featureNodeBuilder = m_featureNodeBuilder;
    _builder.m_featureOutgoingSet = m_featureOutgoingSet;
    _builder.m_outgoing = m_outgoing;
    _builder.m_featureOutgoingBuilder = m_featureOutgoingBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedRuleSet = m_featureOwnedRuleSet;
    _builder.m_ownedRule = m_ownedRule;
    _builder.m_featureOwnedRuleBuilder = m_featureOwnedRuleBuilder;
    _builder.m_featurePackageImportSet = m_featurePackageImportSet;
    _builder.m_packageImport = m_packageImport;
    _builder.m_featurePackageImportBuilder = m_featurePackageImportBuilder;
    _builder.m_featureRedefinedNodeSet = m_featureRedefinedNodeSet;
    _builder.m_redefinedNode = m_redefinedNode;
    _builder.m_featureRedefinedNodeBuilder = m_featureRedefinedNodeBuilder;
    _builder.m_featureResultSet = m_featureResultSet;
    _builder.m_result = m_result;
    _builder.m_featureResultBuilder = m_featureResultBuilder;
    _builder.m_featureVariableSet = m_featureVariableSet;
    _builder.m_variable = m_variable;
    _builder.m_featureVariableBuilder = m_featureVariableBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ConditionalNode type.
   * @return new instance of the org.eclipse.uml2.uml.ConditionalNode type
   */
  public org.eclipse.uml2.uml.ConditionalNode build() {
    final org.eclipse.uml2.uml.ConditionalNode _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createConditionalNode();
    if (m_featureActivitySet) {
      _newInstance.setActivity(m_activity);
    } else {
      if (m_featureActivityBuilder != null) {
        _newInstance.setActivity(m_featureActivityBuilder.build());
      }
    }
    if (m_featureInActivitySet) {
      _newInstance.setInActivity(m_inActivity);
    } else {
      if (m_featureInActivityBuilder != null) {
        _newInstance.setInActivity(m_featureInActivityBuilder.build());
      }
    }
    if (m_featureInStructuredNodeSet) {
      _newInstance.setInStructuredNode(m_inStructuredNode);
    } else {
      if (m_featureInStructuredNodeBuilder != null) {
        _newInstance.setInStructuredNode(m_featureInStructuredNodeBuilder.build());
      }
    }
    if (m_featureIsAssuredSet) {
      _newInstance.setIsAssured(m_isAssured);
    }
    if (m_featureIsDeterminateSet) {
      _newInstance.setIsDeterminate(m_isDeterminate);
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureMustIsolateSet) {
      _newInstance.setMustIsolate(m_mustIsolate);
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
    if (m_featureClauseSet) {
      _newInstance.getClauses().addAll(m_clause);
    } else {
      if (!m_featureClauseBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Clause> builder : m_featureClauseBuilder) {
          _newInstance.getClauses().add(builder.build());
        }
      }
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
    if (m_featureEdgeSet) {
      _newInstance.getEdges().addAll(m_edge);
    } else {
      if (!m_featureEdgeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureEdgeBuilder) {
          _newInstance.getEdges().add(builder.build());
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
    if (m_featureHandlerSet) {
      _newInstance.getHandlers().addAll(m_handler);
    } else {
      if (!m_featureHandlerBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExceptionHandler> builder : m_featureHandlerBuilder) {
          _newInstance.getHandlers().add(builder.build());
        }
      }
    }
    if (m_featureInInterruptibleRegionSet) {
      _newInstance.getInInterruptibleRegions().addAll(m_inInterruptibleRegion);
    } else {
      if (!m_featureInInterruptibleRegionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> builder : m_featureInInterruptibleRegionBuilder) {
          _newInstance.getInInterruptibleRegions().add(builder.build());
        }
      }
    }
    if (m_featureInPartitionSet) {
      _newInstance.getInPartitions().addAll(m_inPartition);
    } else {
      if (!m_featureInPartitionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> builder : m_featureInPartitionBuilder) {
          _newInstance.getInPartitions().add(builder.build());
        }
      }
    }
    if (m_featureIncomingSet) {
      _newInstance.getIncomings().addAll(m_incoming);
    } else {
      if (!m_featureIncomingBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureIncomingBuilder) {
          _newInstance.getIncomings().add(builder.build());
        }
      }
    }
    if (m_featureLocalPostconditionSet) {
      _newInstance.getLocalPostconditions().addAll(m_localPostcondition);
    } else {
      if (!m_featureLocalPostconditionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featureLocalPostconditionBuilder) {
          _newInstance.getLocalPostconditions().add(builder.build());
        }
      }
    }
    if (m_featureLocalPreconditionSet) {
      _newInstance.getLocalPreconditions().addAll(m_localPrecondition);
    } else {
      if (!m_featureLocalPreconditionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featureLocalPreconditionBuilder) {
          _newInstance.getLocalPreconditions().add(builder.build());
        }
      }
    }
    if (m_featureNodeSet) {
      _newInstance.getNodes().addAll(m_node);
    } else {
      if (!m_featureNodeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> builder : m_featureNodeBuilder) {
          _newInstance.getNodes().add(builder.build());
        }
      }
    }
    if (m_featureOutgoingSet) {
      _newInstance.getOutgoings().addAll(m_outgoing);
    } else {
      if (!m_featureOutgoingBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> builder : m_featureOutgoingBuilder) {
          _newInstance.getOutgoings().add(builder.build());
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
    if (m_featureRedefinedNodeSet) {
      _newInstance.getRedefinedNodes().addAll(m_redefinedNode);
    } else {
      if (!m_featureRedefinedNodeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> builder : m_featureRedefinedNodeBuilder) {
          _newInstance.getRedefinedNodes().add(builder.build());
        }
      }
    }
    if (m_featureResultSet) {
      _newInstance.getResults().addAll(m_result);
    } else {
      if (!m_featureResultBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.OutputPin> builder : m_featureResultBuilder) {
          _newInstance.getResults().add(builder.build());
        }
      }
    }
    if (m_featureVariableSet) {
      _newInstance.getVariables().addAll(m_variable);
    } else {
      if (!m_featureVariableBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Variable> builder : m_featureVariableBuilder) {
          _newInstance.getVariables().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ConditionalNodeBuilder withActivity(org.eclipse.uml2.uml.Activity p_activity) {
    m_activity = p_activity;
    m_featureActivitySet = true;
    return this;
  }

  public ConditionalNodeBuilder withActivity(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> p_activityBuilder) {
    m_featureActivityBuilder = p_activityBuilder;
    return this;
  }

  public ConditionalNodeBuilder withInActivity(org.eclipse.uml2.uml.Activity p_inActivity) {
    m_inActivity = p_inActivity;
    m_featureInActivitySet = true;
    return this;
  }

  public ConditionalNodeBuilder withInActivity(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Activity> p_activityBuilder) {
    m_featureInActivityBuilder = p_activityBuilder;
    return this;
  }

  public ConditionalNodeBuilder withInStructuredNode(org.eclipse.uml2.uml.StructuredActivityNode p_inStructuredNode) {
    m_inStructuredNode = p_inStructuredNode;
    m_featureInStructuredNodeSet = true;
    return this;
  }

  public ConditionalNodeBuilder withInStructuredNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StructuredActivityNode> p_structuredActivityNodeBuilder) {
    m_featureInStructuredNodeBuilder = p_structuredActivityNodeBuilder;
    return this;
  }

  public ConditionalNodeBuilder withIsAssured(Boolean p_isAssured) {
    m_isAssured = p_isAssured;
    m_featureIsAssuredSet = true;
    return this;
  }

  public ConditionalNodeBuilder withIsDeterminate(Boolean p_isDeterminate) {
    m_isDeterminate = p_isDeterminate;
    m_featureIsDeterminateSet = true;
    return this;
  }

  public ConditionalNodeBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ConditionalNodeBuilder withMustIsolate(Boolean p_mustIsolate) {
    m_mustIsolate = p_mustIsolate;
    m_featureMustIsolateSet = true;
    return this;
  }

  public ConditionalNodeBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ConditionalNodeBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ConditionalNodeBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ConditionalNodeBuilder withClause(org.eclipse.uml2.uml.Clause p_clause) {
    m_clause.add(p_clause);
    m_featureClauseSet = true;
    return this;
  }

  public ConditionalNodeBuilder withClause(java.util.Collection<? extends org.eclipse.uml2.uml.Clause> p_clause) {
    m_clause.addAll(p_clause);
    m_featureClauseSet = true;
    return this;
  }

  public ConditionalNodeBuilder withClause(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Clause> p_clauseBuilder) {
    m_featureClauseBuilder.add(p_clauseBuilder);
    return this;
  }

  public ConditionalNodeBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ConditionalNodeBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ConditionalNodeBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ConditionalNodeBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ConditionalNodeBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ConditionalNodeBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ConditionalNodeBuilder withEdge(org.eclipse.uml2.uml.ActivityEdge p_edge) {
    m_edge.add(p_edge);
    m_featureEdgeSet = true;
    return this;
  }

  public ConditionalNodeBuilder withEdge(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_edge) {
    m_edge.addAll(p_edge);
    m_featureEdgeSet = true;
    return this;
  }

  public ConditionalNodeBuilder withEdge(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureEdgeBuilder.add(p_activityEdgeBuilder);
    return this;
  }

  public ConditionalNodeBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public ConditionalNodeBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public ConditionalNodeBuilder withElementImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport> p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public ConditionalNodeBuilder withHandler(org.eclipse.uml2.uml.ExceptionHandler p_handler) {
    m_handler.add(p_handler);
    m_featureHandlerSet = true;
    return this;
  }

  public ConditionalNodeBuilder withHandler(java.util.Collection<? extends org.eclipse.uml2.uml.ExceptionHandler> p_handler) {
    m_handler.addAll(p_handler);
    m_featureHandlerSet = true;
    return this;
  }

  public ConditionalNodeBuilder withHandler(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ExceptionHandler> p_exceptionHandlerBuilder) {
    m_featureHandlerBuilder.add(p_exceptionHandlerBuilder);
    return this;
  }

  public ConditionalNodeBuilder withInInterruptibleRegion(org.eclipse.uml2.uml.InterruptibleActivityRegion p_inInterruptibleRegion) {
    m_inInterruptibleRegion.add(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withInInterruptibleRegion(java.util.Collection<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> p_inInterruptibleRegion) {
    m_inInterruptibleRegion.addAll(p_inInterruptibleRegion);
    m_featureInInterruptibleRegionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withInInterruptibleRegion(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterruptibleActivityRegion> p_interruptibleActivityRegionBuilder) {
    m_featureInInterruptibleRegionBuilder.add(p_interruptibleActivityRegionBuilder);
    return this;
  }

  public ConditionalNodeBuilder withInPartition(org.eclipse.uml2.uml.ActivityPartition p_inPartition) {
    m_inPartition.add(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withInPartition(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityPartition> p_inPartition) {
    m_inPartition.addAll(p_inPartition);
    m_featureInPartitionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withInPartition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityPartition> p_activityPartitionBuilder) {
    m_featureInPartitionBuilder.add(p_activityPartitionBuilder);
    return this;
  }

  public ConditionalNodeBuilder withIncoming(org.eclipse.uml2.uml.ActivityEdge p_incoming) {
    m_incoming.add(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ConditionalNodeBuilder withIncoming(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_incoming) {
    m_incoming.addAll(p_incoming);
    m_featureIncomingSet = true;
    return this;
  }

  public ConditionalNodeBuilder withIncoming(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureIncomingBuilder.add(p_activityEdgeBuilder);
    return this;
  }

  public ConditionalNodeBuilder withLocalPostcondition(org.eclipse.uml2.uml.Constraint p_localPostcondition) {
    m_localPostcondition.add(p_localPostcondition);
    m_featureLocalPostconditionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withLocalPostcondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_localPostcondition) {
    m_localPostcondition.addAll(p_localPostcondition);
    m_featureLocalPostconditionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withLocalPostcondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureLocalPostconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public ConditionalNodeBuilder withLocalPrecondition(org.eclipse.uml2.uml.Constraint p_localPrecondition) {
    m_localPrecondition.add(p_localPrecondition);
    m_featureLocalPreconditionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withLocalPrecondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_localPrecondition) {
    m_localPrecondition.addAll(p_localPrecondition);
    m_featureLocalPreconditionSet = true;
    return this;
  }

  public ConditionalNodeBuilder withLocalPrecondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureLocalPreconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public ConditionalNodeBuilder withNode(org.eclipse.uml2.uml.ActivityNode p_node) {
    m_node.add(p_node);
    m_featureNodeSet = true;
    return this;
  }

  public ConditionalNodeBuilder withNode(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityNode> p_node) {
    m_node.addAll(p_node);
    m_featureNodeSet = true;
    return this;
  }

  public ConditionalNodeBuilder withNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> p_activityNodeBuilder) {
    m_featureNodeBuilder.add(p_activityNodeBuilder);
    return this;
  }

  public ConditionalNodeBuilder withOutgoing(org.eclipse.uml2.uml.ActivityEdge p_outgoing) {
    m_outgoing.add(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ConditionalNodeBuilder withOutgoing(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityEdge> p_outgoing) {
    m_outgoing.addAll(p_outgoing);
    m_featureOutgoingSet = true;
    return this;
  }

  public ConditionalNodeBuilder withOutgoing(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityEdge> p_activityEdgeBuilder) {
    m_featureOutgoingBuilder.add(p_activityEdgeBuilder);
    return this;
  }

  public ConditionalNodeBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConditionalNodeBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConditionalNodeBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ConditionalNodeBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public ConditionalNodeBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public ConditionalNodeBuilder withOwnedRule(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public ConditionalNodeBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public ConditionalNodeBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public ConditionalNodeBuilder withPackageImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport> p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public ConditionalNodeBuilder withRedefinedNode(org.eclipse.uml2.uml.ActivityNode p_redefinedNode) {
    m_redefinedNode.add(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }

  public ConditionalNodeBuilder withRedefinedNode(java.util.Collection<? extends org.eclipse.uml2.uml.ActivityNode> p_redefinedNode) {
    m_redefinedNode.addAll(p_redefinedNode);
    m_featureRedefinedNodeSet = true;
    return this;
  }

  public ConditionalNodeBuilder withRedefinedNode(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ActivityNode> p_activityNodeBuilder) {
    m_featureRedefinedNodeBuilder.add(p_activityNodeBuilder);
    return this;
  }

  public ConditionalNodeBuilder withResult(org.eclipse.uml2.uml.OutputPin p_result) {
    m_result.add(p_result);
    m_featureResultSet = true;
    return this;
  }

  public ConditionalNodeBuilder withResult(java.util.Collection<? extends org.eclipse.uml2.uml.OutputPin> p_result) {
    m_result.addAll(p_result);
    m_featureResultSet = true;
    return this;
  }

  public ConditionalNodeBuilder withResult(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.OutputPin> p_outputPinBuilder) {
    m_featureResultBuilder.add(p_outputPinBuilder);
    return this;
  }

  public ConditionalNodeBuilder withVariable(org.eclipse.uml2.uml.Variable p_variable) {
    m_variable.add(p_variable);
    m_featureVariableSet = true;
    return this;
  }

  public ConditionalNodeBuilder withVariable(java.util.Collection<? extends org.eclipse.uml2.uml.Variable> p_variable) {
    m_variable.addAll(p_variable);
    m_featureVariableSet = true;
    return this;
  }

  public ConditionalNodeBuilder withVariable(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Variable> p_variableBuilder) {
    m_featureVariableBuilder.add(p_variableBuilder);
    return this;
  }
}
