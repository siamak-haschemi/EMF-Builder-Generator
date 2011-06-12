package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Interaction</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class InteractionBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.Interaction> {
  // features and builders
  private org.eclipse.uml2.uml.Behavior m_classifierBehavior;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> m_featureClassifierBehaviorBuilder;
  private org.eclipse.uml2.uml.Interaction m_enclosingInteraction;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Interaction> m_featureEnclosingInteractionBuilder;
  private org.eclipse.uml2.uml.InteractionOperand m_enclosingOperand;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InteractionOperand> m_featureEnclosingOperandBuilder;
  private Boolean m_isAbstract;
  private Boolean m_isActive;
  private Boolean m_isLeaf;
  private Boolean m_isReentrant;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateSignature m_ownedTemplateSignature;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateSignature> m_featureOwnedTemplateSignatureBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.CollaborationUse m_representation;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse> m_featureRepresentationBuilder;
  private org.eclipse.uml2.uml.BehavioralFeature m_specification;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.BehavioralFeature> m_featureSpecificationBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Action> m_action = new java.util.LinkedList<org.eclipse.uml2.uml.Action>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Action>> m_featureActionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Action>>();
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.uml2.uml.CollaborationUse> m_collaborationUse = new java.util.LinkedList<org.eclipse.uml2.uml.CollaborationUse>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse>> m_featureCollaborationUseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse>>();
  private java.util.Collection<org.eclipse.uml2.uml.Lifeline> m_covered = new java.util.LinkedList<org.eclipse.uml2.uml.Lifeline>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline>> m_featureCoveredBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.ElementImport> m_elementImport = new java.util.LinkedList<org.eclipse.uml2.uml.ElementImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport>> m_featureElementImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport>>();
  private java.util.Collection<org.eclipse.uml2.uml.Gate> m_formalGate = new java.util.LinkedList<org.eclipse.uml2.uml.Gate>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Gate>> m_featureFormalGateBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Gate>>();
  private java.util.Collection<org.eclipse.uml2.uml.InteractionFragment> m_fragment = new java.util.LinkedList<org.eclipse.uml2.uml.InteractionFragment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InteractionFragment>> m_featureFragmentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InteractionFragment>>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralOrdering> m_generalOrdering = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralOrdering>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralOrdering>> m_featureGeneralOrderingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralOrdering>>();
  private java.util.Collection<org.eclipse.uml2.uml.Generalization> m_generalization = new java.util.LinkedList<org.eclipse.uml2.uml.Generalization>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Generalization>> m_featureGeneralizationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Generalization>>();
  private java.util.Collection<org.eclipse.uml2.uml.InterfaceRealization> m_interfaceRealization = new java.util.LinkedList<org.eclipse.uml2.uml.InterfaceRealization>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterfaceRealization>> m_featureInterfaceRealizationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterfaceRealization>>();
  private java.util.Collection<org.eclipse.uml2.uml.Lifeline> m_lifeline = new java.util.LinkedList<org.eclipse.uml2.uml.Lifeline>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline>> m_featureLifelineBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline>>();
  private java.util.Collection<org.eclipse.uml2.uml.Message> m_message = new java.util.LinkedList<org.eclipse.uml2.uml.Message>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Message>> m_featureMessageBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Message>>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_nestedClassifier = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>> m_featureNestedClassifierBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>>();
  private java.util.Collection<org.eclipse.uml2.uml.Property> m_ownedAttribute = new java.util.LinkedList<org.eclipse.uml2.uml.Property>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property>> m_featureOwnedAttributeBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property>>();
  private java.util.Collection<org.eclipse.uml2.uml.Behavior> m_ownedBehavior = new java.util.LinkedList<org.eclipse.uml2.uml.Behavior>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior>> m_featureOwnedBehaviorBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.Connector> m_ownedConnector = new java.util.LinkedList<org.eclipse.uml2.uml.Connector>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector>> m_featureOwnedConnectorBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector>>();
  private java.util.Collection<org.eclipse.uml2.uml.Operation> m_ownedOperation = new java.util.LinkedList<org.eclipse.uml2.uml.Operation>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Operation>> m_featureOwnedOperationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Operation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Parameter> m_ownedParameter = new java.util.LinkedList<org.eclipse.uml2.uml.Parameter>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Parameter>> m_featureOwnedParameterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Parameter>>();
  private java.util.Collection<org.eclipse.uml2.uml.ParameterSet> m_ownedParameterSet = new java.util.LinkedList<org.eclipse.uml2.uml.ParameterSet>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterSet>> m_featureOwnedParameterSetBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterSet>>();
  private java.util.Collection<org.eclipse.uml2.uml.Reception> m_ownedReception = new java.util.LinkedList<org.eclipse.uml2.uml.Reception>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Reception>> m_featureOwnedReceptionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Reception>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.Trigger> m_ownedTrigger = new java.util.LinkedList<org.eclipse.uml2.uml.Trigger>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger>> m_featureOwnedTriggerBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger>>();
  private java.util.Collection<org.eclipse.uml2.uml.UseCase> m_ownedUseCase = new java.util.LinkedList<org.eclipse.uml2.uml.UseCase>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase>> m_featureOwnedUseCaseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase>>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport>> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_postcondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featurePostconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.GeneralizationSet> m_powertypeExtent = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralizationSet>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralizationSet>> m_featurePowertypeExtentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralizationSet>>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_precondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>> m_featurePreconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint>>();
  private java.util.Collection<org.eclipse.uml2.uml.Behavior> m_redefinedBehavior = new java.util.LinkedList<org.eclipse.uml2.uml.Behavior>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior>> m_featureRedefinedBehaviorBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior>>();
  private java.util.Collection<org.eclipse.uml2.uml.Classifier> m_redefinedClassifier = new java.util.LinkedList<org.eclipse.uml2.uml.Classifier>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>> m_featureRedefinedClassifierBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier>>();
  private java.util.Collection<org.eclipse.uml2.uml.Substitution> m_substitution = new java.util.LinkedList<org.eclipse.uml2.uml.Substitution>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Substitution>> m_featureSubstitutionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Substitution>>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateBinding> m_templateBinding = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateBinding>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding>> m_featureTemplateBindingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding>>();
  private java.util.Collection<org.eclipse.uml2.uml.UseCase> m_useCase = new java.util.LinkedList<org.eclipse.uml2.uml.UseCase>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase>> m_featureUseCaseBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase>>();
  // helper attributes
  private boolean m_featureActionSet = false;
  private boolean m_featureClassifierBehaviorSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureCollaborationUseSet = false;
  private boolean m_featureCoveredSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureEnclosingInteractionSet = false;
  private boolean m_featureEnclosingOperandSet = false;
  private boolean m_featureFormalGateSet = false;
  private boolean m_featureFragmentSet = false;
  private boolean m_featureGeneralOrderingSet = false;
  private boolean m_featureGeneralizationSet = false;
  private boolean m_featureInterfaceRealizationSet = false;
  private boolean m_featureIsAbstractSet = false;
  private boolean m_featureIsActiveSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureIsReentrantSet = false;
  private boolean m_featureLifelineSet = false;
  private boolean m_featureMessageSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureNestedClassifierSet = false;
  private boolean m_featureOwnedAttributeSet = false;
  private boolean m_featureOwnedBehaviorSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedConnectorSet = false;
  private boolean m_featureOwnedOperationSet = false;
  private boolean m_featureOwnedParameterSet = false;
  private boolean m_featureOwnedParameterSetSet = false;
  private boolean m_featureOwnedReceptionSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featureOwnedTemplateSignatureSet = false;
  private boolean m_featureOwnedTriggerSet = false;
  private boolean m_featureOwnedUseCaseSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featurePostconditionSet = false;
  private boolean m_featurePowertypeExtentSet = false;
  private boolean m_featurePreconditionSet = false;
  private boolean m_featureRedefinedBehaviorSet = false;
  private boolean m_featureRedefinedClassifierSet = false;
  private boolean m_featureRepresentationSet = false;
  private boolean m_featureSpecificationSet = false;
  private boolean m_featureSubstitutionSet = false;
  private boolean m_featureTemplateBindingSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureUseCaseSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newInteractionBuilder()
   */
  private InteractionBuilder() {
  }

  /**
   * This method creates a new instance of the InteractionBuilder.
   * @return new instance of the InteractionBuilder
   */
  public static InteractionBuilder newInteractionBuilder() {
    return new InteractionBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public InteractionBuilder but() {
    InteractionBuilder _builder = newInteractionBuilder();
    _builder.m_featureActionSet = m_featureActionSet;
    _builder.m_action = m_action;
    _builder.m_featureActionBuilder = m_featureActionBuilder;
    _builder.m_featureClassifierBehaviorSet = m_featureClassifierBehaviorSet;
    _builder.m_classifierBehavior = m_classifierBehavior;
    _builder.m_featureClassifierBehaviorBuilder = m_featureClassifierBehaviorBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureCollaborationUseSet = m_featureCollaborationUseSet;
    _builder.m_collaborationUse = m_collaborationUse;
    _builder.m_featureCollaborationUseBuilder = m_featureCollaborationUseBuilder;
    _builder.m_featureCoveredSet = m_featureCoveredSet;
    _builder.m_covered = m_covered;
    _builder.m_featureCoveredBuilder = m_featureCoveredBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureEnclosingInteractionSet = m_featureEnclosingInteractionSet;
    _builder.m_enclosingInteraction = m_enclosingInteraction;
    _builder.m_featureEnclosingInteractionBuilder = m_featureEnclosingInteractionBuilder;
    _builder.m_featureEnclosingOperandSet = m_featureEnclosingOperandSet;
    _builder.m_enclosingOperand = m_enclosingOperand;
    _builder.m_featureEnclosingOperandBuilder = m_featureEnclosingOperandBuilder;
    _builder.m_featureFormalGateSet = m_featureFormalGateSet;
    _builder.m_formalGate = m_formalGate;
    _builder.m_featureFormalGateBuilder = m_featureFormalGateBuilder;
    _builder.m_featureFragmentSet = m_featureFragmentSet;
    _builder.m_fragment = m_fragment;
    _builder.m_featureFragmentBuilder = m_featureFragmentBuilder;
    _builder.m_featureGeneralOrderingSet = m_featureGeneralOrderingSet;
    _builder.m_generalOrdering = m_generalOrdering;
    _builder.m_featureGeneralOrderingBuilder = m_featureGeneralOrderingBuilder;
    _builder.m_featureGeneralizationSet = m_featureGeneralizationSet;
    _builder.m_generalization = m_generalization;
    _builder.m_featureGeneralizationBuilder = m_featureGeneralizationBuilder;
    _builder.m_featureInterfaceRealizationSet = m_featureInterfaceRealizationSet;
    _builder.m_interfaceRealization = m_interfaceRealization;
    _builder.m_featureInterfaceRealizationBuilder = m_featureInterfaceRealizationBuilder;
    _builder.m_featureIsAbstractSet = m_featureIsAbstractSet;
    _builder.m_isAbstract = m_isAbstract;
    _builder.m_featureIsActiveSet = m_featureIsActiveSet;
    _builder.m_isActive = m_isActive;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureIsReentrantSet = m_featureIsReentrantSet;
    _builder.m_isReentrant = m_isReentrant;
    _builder.m_featureLifelineSet = m_featureLifelineSet;
    _builder.m_lifeline = m_lifeline;
    _builder.m_featureLifelineBuilder = m_featureLifelineBuilder;
    _builder.m_featureMessageSet = m_featureMessageSet;
    _builder.m_message = m_message;
    _builder.m_featureMessageBuilder = m_featureMessageBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureNestedClassifierSet = m_featureNestedClassifierSet;
    _builder.m_nestedClassifier = m_nestedClassifier;
    _builder.m_featureNestedClassifierBuilder = m_featureNestedClassifierBuilder;
    _builder.m_featureOwnedAttributeSet = m_featureOwnedAttributeSet;
    _builder.m_ownedAttribute = m_ownedAttribute;
    _builder.m_featureOwnedAttributeBuilder = m_featureOwnedAttributeBuilder;
    _builder.m_featureOwnedBehaviorSet = m_featureOwnedBehaviorSet;
    _builder.m_ownedBehavior = m_ownedBehavior;
    _builder.m_featureOwnedBehaviorBuilder = m_featureOwnedBehaviorBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedConnectorSet = m_featureOwnedConnectorSet;
    _builder.m_ownedConnector = m_ownedConnector;
    _builder.m_featureOwnedConnectorBuilder = m_featureOwnedConnectorBuilder;
    _builder.m_featureOwnedOperationSet = m_featureOwnedOperationSet;
    _builder.m_ownedOperation = m_ownedOperation;
    _builder.m_featureOwnedOperationBuilder = m_featureOwnedOperationBuilder;
    _builder.m_featureOwnedParameterSet = m_featureOwnedParameterSet;
    _builder.m_ownedParameter = m_ownedParameter;
    _builder.m_featureOwnedParameterBuilder = m_featureOwnedParameterBuilder;
    _builder.m_featureOwnedParameterSetSet = m_featureOwnedParameterSetSet;
    _builder.m_ownedParameterSet = m_ownedParameterSet;
    _builder.m_featureOwnedParameterSetBuilder = m_featureOwnedParameterSetBuilder;
    _builder.m_featureOwnedReceptionSet = m_featureOwnedReceptionSet;
    _builder.m_ownedReception = m_ownedReception;
    _builder.m_featureOwnedReceptionBuilder = m_featureOwnedReceptionBuilder;
    _builder.m_featureOwnedRuleSet = m_featureOwnedRuleSet;
    _builder.m_ownedRule = m_ownedRule;
    _builder.m_featureOwnedRuleBuilder = m_featureOwnedRuleBuilder;
    _builder.m_featureOwnedTemplateSignatureSet = m_featureOwnedTemplateSignatureSet;
    _builder.m_ownedTemplateSignature = m_ownedTemplateSignature;
    _builder.m_featureOwnedTemplateSignatureBuilder = m_featureOwnedTemplateSignatureBuilder;
    _builder.m_featureOwnedTriggerSet = m_featureOwnedTriggerSet;
    _builder.m_ownedTrigger = m_ownedTrigger;
    _builder.m_featureOwnedTriggerBuilder = m_featureOwnedTriggerBuilder;
    _builder.m_featureOwnedUseCaseSet = m_featureOwnedUseCaseSet;
    _builder.m_ownedUseCase = m_ownedUseCase;
    _builder.m_featureOwnedUseCaseBuilder = m_featureOwnedUseCaseBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featurePackageImportSet = m_featurePackageImportSet;
    _builder.m_packageImport = m_packageImport;
    _builder.m_featurePackageImportBuilder = m_featurePackageImportBuilder;
    _builder.m_featurePostconditionSet = m_featurePostconditionSet;
    _builder.m_postcondition = m_postcondition;
    _builder.m_featurePostconditionBuilder = m_featurePostconditionBuilder;
    _builder.m_featurePowertypeExtentSet = m_featurePowertypeExtentSet;
    _builder.m_powertypeExtent = m_powertypeExtent;
    _builder.m_featurePowertypeExtentBuilder = m_featurePowertypeExtentBuilder;
    _builder.m_featurePreconditionSet = m_featurePreconditionSet;
    _builder.m_precondition = m_precondition;
    _builder.m_featurePreconditionBuilder = m_featurePreconditionBuilder;
    _builder.m_featureRedefinedBehaviorSet = m_featureRedefinedBehaviorSet;
    _builder.m_redefinedBehavior = m_redefinedBehavior;
    _builder.m_featureRedefinedBehaviorBuilder = m_featureRedefinedBehaviorBuilder;
    _builder.m_featureRedefinedClassifierSet = m_featureRedefinedClassifierSet;
    _builder.m_redefinedClassifier = m_redefinedClassifier;
    _builder.m_featureRedefinedClassifierBuilder = m_featureRedefinedClassifierBuilder;
    _builder.m_featureRepresentationSet = m_featureRepresentationSet;
    _builder.m_representation = m_representation;
    _builder.m_featureRepresentationBuilder = m_featureRepresentationBuilder;
    _builder.m_featureSpecificationSet = m_featureSpecificationSet;
    _builder.m_specification = m_specification;
    _builder.m_featureSpecificationBuilder = m_featureSpecificationBuilder;
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
   * This method constructs the final org.eclipse.uml2.uml.Interaction type.
   * @return new instance of the org.eclipse.uml2.uml.Interaction type
   */
  public org.eclipse.uml2.uml.Interaction build() {
    final org.eclipse.uml2.uml.Interaction _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createInteraction();
    if (m_featureClassifierBehaviorSet) {
      _newInstance.setClassifierBehavior(m_classifierBehavior);
    } else {
      if (m_featureClassifierBehaviorBuilder != null) {
        _newInstance.setClassifierBehavior(m_featureClassifierBehaviorBuilder.build());
      }
    }
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
    if (m_featureIsAbstractSet) {
      _newInstance.setIsAbstract(m_isAbstract);
    }
    if (m_featureIsActiveSet) {
      _newInstance.setIsActive(m_isActive);
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureIsReentrantSet) {
      _newInstance.setIsReentrant(m_isReentrant);
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
    if (m_featureActionSet) {
      _newInstance.getActions().addAll(m_action);
    } else {
      if (!m_featureActionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Action> builder : m_featureActionBuilder) {
          _newInstance.getActions().add(builder.build());
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
    if (m_featureCollaborationUseSet) {
      _newInstance.getCollaborationUses().addAll(m_collaborationUse);
    } else {
      if (!m_featureCollaborationUseBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse> builder : m_featureCollaborationUseBuilder) {
          _newInstance.getCollaborationUses().add(builder.build());
        }
      }
    }
    if (m_featureCoveredSet) {
      _newInstance.getCovereds().addAll(m_covered);
    } else {
      if (!m_featureCoveredBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline> builder : m_featureCoveredBuilder) {
          _newInstance.getCovereds().add(builder.build());
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
    if (m_featureFormalGateSet) {
      _newInstance.getFormalGates().addAll(m_formalGate);
    } else {
      if (!m_featureFormalGateBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Gate> builder : m_featureFormalGateBuilder) {
          _newInstance.getFormalGates().add(builder.build());
        }
      }
    }
    if (m_featureFragmentSet) {
      _newInstance.getFragments().addAll(m_fragment);
    } else {
      if (!m_featureFragmentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InteractionFragment> builder : m_featureFragmentBuilder) {
          _newInstance.getFragments().add(builder.build());
        }
      }
    }
    if (m_featureGeneralOrderingSet) {
      _newInstance.getGeneralOrderings().addAll(m_generalOrdering);
    } else {
      if (!m_featureGeneralOrderingBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralOrdering> builder : m_featureGeneralOrderingBuilder) {
          _newInstance.getGeneralOrderings().add(builder.build());
        }
      }
    }
    if (m_featureGeneralizationSet) {
      _newInstance.getGeneralizations().addAll(m_generalization);
    } else {
      if (!m_featureGeneralizationBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Generalization> builder : m_featureGeneralizationBuilder) {
          _newInstance.getGeneralizations().add(builder.build());
        }
      }
    }
    if (m_featureInterfaceRealizationSet) {
      _newInstance.getInterfaceRealizations().addAll(m_interfaceRealization);
    } else {
      if (!m_featureInterfaceRealizationBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterfaceRealization> builder : m_featureInterfaceRealizationBuilder) {
          _newInstance.getInterfaceRealizations().add(builder.build());
        }
      }
    }
    if (m_featureLifelineSet) {
      _newInstance.getLifelines().addAll(m_lifeline);
    } else {
      if (!m_featureLifelineBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline> builder : m_featureLifelineBuilder) {
          _newInstance.getLifelines().add(builder.build());
        }
      }
    }
    if (m_featureMessageSet) {
      _newInstance.getMessages().addAll(m_message);
    } else {
      if (!m_featureMessageBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Message> builder : m_featureMessageBuilder) {
          _newInstance.getMessages().add(builder.build());
        }
      }
    }
    if (m_featureNestedClassifierSet) {
      _newInstance.getNestedClassifiers().addAll(m_nestedClassifier);
    } else {
      if (!m_featureNestedClassifierBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> builder : m_featureNestedClassifierBuilder) {
          _newInstance.getNestedClassifiers().add(builder.build());
        }
      }
    }
    if (m_featureOwnedAttributeSet) {
      _newInstance.getOwnedAttributes().addAll(m_ownedAttribute);
    } else {
      if (!m_featureOwnedAttributeBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property> builder : m_featureOwnedAttributeBuilder) {
          _newInstance.getOwnedAttributes().add(builder.build());
        }
      }
    }
    if (m_featureOwnedBehaviorSet) {
      _newInstance.getOwnedBehaviors().addAll(m_ownedBehavior);
    } else {
      if (!m_featureOwnedBehaviorBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> builder : m_featureOwnedBehaviorBuilder) {
          _newInstance.getOwnedBehaviors().add(builder.build());
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
    if (m_featureOwnedConnectorSet) {
      _newInstance.getOwnedConnectors().addAll(m_ownedConnector);
    } else {
      if (!m_featureOwnedConnectorBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector> builder : m_featureOwnedConnectorBuilder) {
          _newInstance.getOwnedConnectors().add(builder.build());
        }
      }
    }
    if (m_featureOwnedOperationSet) {
      _newInstance.getOwnedOperations().addAll(m_ownedOperation);
    } else {
      if (!m_featureOwnedOperationBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Operation> builder : m_featureOwnedOperationBuilder) {
          _newInstance.getOwnedOperations().add(builder.build());
        }
      }
    }
    if (m_featureOwnedParameterSet) {
      _newInstance.getOwnedParameters().addAll(m_ownedParameter);
    } else {
      if (!m_featureOwnedParameterBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Parameter> builder : m_featureOwnedParameterBuilder) {
          _newInstance.getOwnedParameters().add(builder.build());
        }
      }
    }
    if (m_featureOwnedParameterSetSet) {
      _newInstance.getOwnedParameterSets().addAll(m_ownedParameterSet);
    } else {
      if (!m_featureOwnedParameterSetBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterSet> builder : m_featureOwnedParameterSetBuilder) {
          _newInstance.getOwnedParameterSets().add(builder.build());
        }
      }
    }
    if (m_featureOwnedReceptionSet) {
      _newInstance.getOwnedReceptions().addAll(m_ownedReception);
    } else {
      if (!m_featureOwnedReceptionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Reception> builder : m_featureOwnedReceptionBuilder) {
          _newInstance.getOwnedReceptions().add(builder.build());
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
    if (m_featureOwnedTriggerSet) {
      _newInstance.getOwnedTriggers().addAll(m_ownedTrigger);
    } else {
      if (!m_featureOwnedTriggerBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> builder : m_featureOwnedTriggerBuilder) {
          _newInstance.getOwnedTriggers().add(builder.build());
        }
      }
    }
    if (m_featureOwnedUseCaseSet) {
      _newInstance.getOwnedUseCases().addAll(m_ownedUseCase);
    } else {
      if (!m_featureOwnedUseCaseBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase> builder : m_featureOwnedUseCaseBuilder) {
          _newInstance.getOwnedUseCases().add(builder.build());
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
    if (m_featurePostconditionSet) {
      _newInstance.getPostconditions().addAll(m_postcondition);
    } else {
      if (!m_featurePostconditionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featurePostconditionBuilder) {
          _newInstance.getPostconditions().add(builder.build());
        }
      }
    }
    if (m_featurePowertypeExtentSet) {
      _newInstance.getPowertypeExtents().addAll(m_powertypeExtent);
    } else {
      if (!m_featurePowertypeExtentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralizationSet> builder : m_featurePowertypeExtentBuilder) {
          _newInstance.getPowertypeExtents().add(builder.build());
        }
      }
    }
    if (m_featurePreconditionSet) {
      _newInstance.getPreconditions().addAll(m_precondition);
    } else {
      if (!m_featurePreconditionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> builder : m_featurePreconditionBuilder) {
          _newInstance.getPreconditions().add(builder.build());
        }
      }
    }
    if (m_featureRedefinedBehaviorSet) {
      _newInstance.getRedefinedBehaviors().addAll(m_redefinedBehavior);
    } else {
      if (!m_featureRedefinedBehaviorBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> builder : m_featureRedefinedBehaviorBuilder) {
          _newInstance.getRedefinedBehaviors().add(builder.build());
        }
      }
    }
    if (m_featureRedefinedClassifierSet) {
      _newInstance.getRedefinedClassifiers().addAll(m_redefinedClassifier);
    } else {
      if (!m_featureRedefinedClassifierBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> builder : m_featureRedefinedClassifierBuilder) {
          _newInstance.getRedefinedClassifiers().add(builder.build());
        }
      }
    }
    if (m_featureSubstitutionSet) {
      _newInstance.getSubstitutions().addAll(m_substitution);
    } else {
      if (!m_featureSubstitutionBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Substitution> builder : m_featureSubstitutionBuilder) {
          _newInstance.getSubstitutions().add(builder.build());
        }
      }
    }
    if (m_featureTemplateBindingSet) {
      _newInstance.getTemplateBindings().addAll(m_templateBinding);
    } else {
      if (!m_featureTemplateBindingBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding> builder : m_featureTemplateBindingBuilder) {
          _newInstance.getTemplateBindings().add(builder.build());
        }
      }
    }
    if (m_featureUseCaseSet) {
      _newInstance.getUseCases().addAll(m_useCase);
    } else {
      if (!m_featureUseCaseBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase> builder : m_featureUseCaseBuilder) {
          _newInstance.getUseCases().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public InteractionBuilder withClassifierBehavior(org.eclipse.uml2.uml.Behavior p_classifierBehavior) {
    m_classifierBehavior = p_classifierBehavior;
    m_featureClassifierBehaviorSet = true;
    return this;
  }

  public InteractionBuilder withClassifierBehavior(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureClassifierBehaviorBuilder = p_behaviorBuilder;
    return this;
  }

  public InteractionBuilder withEnclosingInteraction(org.eclipse.uml2.uml.Interaction p_enclosingInteraction) {
    m_enclosingInteraction = p_enclosingInteraction;
    m_featureEnclosingInteractionSet = true;
    return this;
  }

  public InteractionBuilder withEnclosingInteraction(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Interaction> p_interactionBuilder) {
    m_featureEnclosingInteractionBuilder = p_interactionBuilder;
    return this;
  }

  public InteractionBuilder withEnclosingOperand(org.eclipse.uml2.uml.InteractionOperand p_enclosingOperand) {
    m_enclosingOperand = p_enclosingOperand;
    m_featureEnclosingOperandSet = true;
    return this;
  }

  public InteractionBuilder withEnclosingOperand(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InteractionOperand> p_interactionOperandBuilder) {
    m_featureEnclosingOperandBuilder = p_interactionOperandBuilder;
    return this;
  }

  public InteractionBuilder withIsAbstract(Boolean p_isAbstract) {
    m_isAbstract = p_isAbstract;
    m_featureIsAbstractSet = true;
    return this;
  }

  public InteractionBuilder withIsActive(Boolean p_isActive) {
    m_isActive = p_isActive;
    m_featureIsActiveSet = true;
    return this;
  }

  public InteractionBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public InteractionBuilder withIsReentrant(Boolean p_isReentrant) {
    m_isReentrant = p_isReentrant;
    m_featureIsReentrantSet = true;
    return this;
  }

  public InteractionBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public InteractionBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public InteractionBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public InteractionBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.TemplateSignature p_ownedTemplateSignature) {
    m_ownedTemplateSignature = p_ownedTemplateSignature;
    m_featureOwnedTemplateSignatureSet = true;
    return this;
  }

  public InteractionBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateSignature> p_templateSignatureBuilder) {
    m_featureOwnedTemplateSignatureBuilder = p_templateSignatureBuilder;
    return this;
  }

  public InteractionBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public InteractionBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InteractionBuilder withRepresentation(org.eclipse.uml2.uml.CollaborationUse p_representation) {
    m_representation = p_representation;
    m_featureRepresentationSet = true;
    return this;
  }

  public InteractionBuilder withRepresentation(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse> p_collaborationUseBuilder) {
    m_featureRepresentationBuilder = p_collaborationUseBuilder;
    return this;
  }

  public InteractionBuilder withSpecification(org.eclipse.uml2.uml.BehavioralFeature p_specification) {
    m_specification = p_specification;
    m_featureSpecificationSet = true;
    return this;
  }

  public InteractionBuilder withSpecification(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.BehavioralFeature> p_behavioralFeatureBuilder) {
    m_featureSpecificationBuilder = p_behavioralFeatureBuilder;
    return this;
  }

  public InteractionBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public InteractionBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateParameter> p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public InteractionBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public InteractionBuilder withAction(org.eclipse.uml2.uml.Action p_action) {
    m_action.add(p_action);
    m_featureActionSet = true;
    return this;
  }

  public InteractionBuilder withAction(java.util.Collection<? extends org.eclipse.uml2.uml.Action> p_action) {
    m_action.addAll(p_action);
    m_featureActionSet = true;
    return this;
  }

  public InteractionBuilder withAction(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Action> p_actionBuilder) {
    m_featureActionBuilder.add(p_actionBuilder);
    return this;
  }

  public InteractionBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InteractionBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public InteractionBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public InteractionBuilder withCollaborationUse(org.eclipse.uml2.uml.CollaborationUse p_collaborationUse) {
    m_collaborationUse.add(p_collaborationUse);
    m_featureCollaborationUseSet = true;
    return this;
  }

  public InteractionBuilder withCollaborationUse(java.util.Collection<? extends org.eclipse.uml2.uml.CollaborationUse> p_collaborationUse) {
    m_collaborationUse.addAll(p_collaborationUse);
    m_featureCollaborationUseSet = true;
    return this;
  }

  public InteractionBuilder withCollaborationUse(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.CollaborationUse> p_collaborationUseBuilder) {
    m_featureCollaborationUseBuilder.add(p_collaborationUseBuilder);
    return this;
  }

  public InteractionBuilder withCovered(org.eclipse.uml2.uml.Lifeline p_covered) {
    m_covered.add(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public InteractionBuilder withCovered(java.util.Collection<? extends org.eclipse.uml2.uml.Lifeline> p_covered) {
    m_covered.addAll(p_covered);
    m_featureCoveredSet = true;
    return this;
  }

  public InteractionBuilder withCovered(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline> p_lifelineBuilder) {
    m_featureCoveredBuilder.add(p_lifelineBuilder);
    return this;
  }

  public InteractionBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public InteractionBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public InteractionBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public InteractionBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public InteractionBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public InteractionBuilder withElementImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ElementImport> p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public InteractionBuilder withFormalGate(org.eclipse.uml2.uml.Gate p_formalGate) {
    m_formalGate.add(p_formalGate);
    m_featureFormalGateSet = true;
    return this;
  }

  public InteractionBuilder withFormalGate(java.util.Collection<? extends org.eclipse.uml2.uml.Gate> p_formalGate) {
    m_formalGate.addAll(p_formalGate);
    m_featureFormalGateSet = true;
    return this;
  }

  public InteractionBuilder withFormalGate(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Gate> p_gateBuilder) {
    m_featureFormalGateBuilder.add(p_gateBuilder);
    return this;
  }

  public InteractionBuilder withFragment(org.eclipse.uml2.uml.InteractionFragment p_fragment) {
    m_fragment.add(p_fragment);
    m_featureFragmentSet = true;
    return this;
  }

  public InteractionBuilder withFragment(java.util.Collection<? extends org.eclipse.uml2.uml.InteractionFragment> p_fragment) {
    m_fragment.addAll(p_fragment);
    m_featureFragmentSet = true;
    return this;
  }

  public InteractionBuilder withFragment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InteractionFragment> p_interactionFragmentBuilder) {
    m_featureFragmentBuilder.add(p_interactionFragmentBuilder);
    return this;
  }

  public InteractionBuilder withGeneralOrdering(org.eclipse.uml2.uml.GeneralOrdering p_generalOrdering) {
    m_generalOrdering.add(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public InteractionBuilder withGeneralOrdering(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralOrdering> p_generalOrdering) {
    m_generalOrdering.addAll(p_generalOrdering);
    m_featureGeneralOrderingSet = true;
    return this;
  }

  public InteractionBuilder withGeneralOrdering(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralOrdering> p_generalOrderingBuilder) {
    m_featureGeneralOrderingBuilder.add(p_generalOrderingBuilder);
    return this;
  }

  public InteractionBuilder withGeneralization(org.eclipse.uml2.uml.Generalization p_generalization) {
    m_generalization.add(p_generalization);
    m_featureGeneralizationSet = true;
    return this;
  }

  public InteractionBuilder withGeneralization(java.util.Collection<? extends org.eclipse.uml2.uml.Generalization> p_generalization) {
    m_generalization.addAll(p_generalization);
    m_featureGeneralizationSet = true;
    return this;
  }

  public InteractionBuilder withGeneralization(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Generalization> p_generalizationBuilder) {
    m_featureGeneralizationBuilder.add(p_generalizationBuilder);
    return this;
  }

  public InteractionBuilder withInterfaceRealization(org.eclipse.uml2.uml.InterfaceRealization p_interfaceRealization) {
    m_interfaceRealization.add(p_interfaceRealization);
    m_featureInterfaceRealizationSet = true;
    return this;
  }

  public InteractionBuilder withInterfaceRealization(java.util.Collection<? extends org.eclipse.uml2.uml.InterfaceRealization> p_interfaceRealization) {
    m_interfaceRealization.addAll(p_interfaceRealization);
    m_featureInterfaceRealizationSet = true;
    return this;
  }

  public InteractionBuilder withInterfaceRealization(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InterfaceRealization> p_interfaceRealizationBuilder) {
    m_featureInterfaceRealizationBuilder.add(p_interfaceRealizationBuilder);
    return this;
  }

  public InteractionBuilder withLifeline(org.eclipse.uml2.uml.Lifeline p_lifeline) {
    m_lifeline.add(p_lifeline);
    m_featureLifelineSet = true;
    return this;
  }

  public InteractionBuilder withLifeline(java.util.Collection<? extends org.eclipse.uml2.uml.Lifeline> p_lifeline) {
    m_lifeline.addAll(p_lifeline);
    m_featureLifelineSet = true;
    return this;
  }

  public InteractionBuilder withLifeline(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Lifeline> p_lifelineBuilder) {
    m_featureLifelineBuilder.add(p_lifelineBuilder);
    return this;
  }

  public InteractionBuilder withMessage(org.eclipse.uml2.uml.Message p_message) {
    m_message.add(p_message);
    m_featureMessageSet = true;
    return this;
  }

  public InteractionBuilder withMessage(java.util.Collection<? extends org.eclipse.uml2.uml.Message> p_message) {
    m_message.addAll(p_message);
    m_featureMessageSet = true;
    return this;
  }

  public InteractionBuilder withMessage(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Message> p_messageBuilder) {
    m_featureMessageBuilder.add(p_messageBuilder);
    return this;
  }

  public InteractionBuilder withNestedClassifier(org.eclipse.uml2.uml.Classifier p_nestedClassifier) {
    m_nestedClassifier.add(p_nestedClassifier);
    m_featureNestedClassifierSet = true;
    return this;
  }

  public InteractionBuilder withNestedClassifier(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_nestedClassifier) {
    m_nestedClassifier.addAll(p_nestedClassifier);
    m_featureNestedClassifierSet = true;
    return this;
  }

  public InteractionBuilder withNestedClassifier(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> p_classifierBuilder) {
    m_featureNestedClassifierBuilder.add(p_classifierBuilder);
    return this;
  }

  public InteractionBuilder withOwnedAttribute(org.eclipse.uml2.uml.Property p_ownedAttribute) {
    m_ownedAttribute.add(p_ownedAttribute);
    m_featureOwnedAttributeSet = true;
    return this;
  }

  public InteractionBuilder withOwnedAttribute(java.util.Collection<? extends org.eclipse.uml2.uml.Property> p_ownedAttribute) {
    m_ownedAttribute.addAll(p_ownedAttribute);
    m_featureOwnedAttributeSet = true;
    return this;
  }

  public InteractionBuilder withOwnedAttribute(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Property> p_propertyBuilder) {
    m_featureOwnedAttributeBuilder.add(p_propertyBuilder);
    return this;
  }

  public InteractionBuilder withOwnedBehavior(org.eclipse.uml2.uml.Behavior p_ownedBehavior) {
    m_ownedBehavior.add(p_ownedBehavior);
    m_featureOwnedBehaviorSet = true;
    return this;
  }

  public InteractionBuilder withOwnedBehavior(java.util.Collection<? extends org.eclipse.uml2.uml.Behavior> p_ownedBehavior) {
    m_ownedBehavior.addAll(p_ownedBehavior);
    m_featureOwnedBehaviorSet = true;
    return this;
  }

  public InteractionBuilder withOwnedBehavior(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureOwnedBehaviorBuilder.add(p_behaviorBuilder);
    return this;
  }

  public InteractionBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InteractionBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public InteractionBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public InteractionBuilder withOwnedConnector(org.eclipse.uml2.uml.Connector p_ownedConnector) {
    m_ownedConnector.add(p_ownedConnector);
    m_featureOwnedConnectorSet = true;
    return this;
  }

  public InteractionBuilder withOwnedConnector(java.util.Collection<? extends org.eclipse.uml2.uml.Connector> p_ownedConnector) {
    m_ownedConnector.addAll(p_ownedConnector);
    m_featureOwnedConnectorSet = true;
    return this;
  }

  public InteractionBuilder withOwnedConnector(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Connector> p_connectorBuilder) {
    m_featureOwnedConnectorBuilder.add(p_connectorBuilder);
    return this;
  }

  public InteractionBuilder withOwnedOperation(org.eclipse.uml2.uml.Operation p_ownedOperation) {
    m_ownedOperation.add(p_ownedOperation);
    m_featureOwnedOperationSet = true;
    return this;
  }

  public InteractionBuilder withOwnedOperation(java.util.Collection<? extends org.eclipse.uml2.uml.Operation> p_ownedOperation) {
    m_ownedOperation.addAll(p_ownedOperation);
    m_featureOwnedOperationSet = true;
    return this;
  }

  public InteractionBuilder withOwnedOperation(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Operation> p_operationBuilder) {
    m_featureOwnedOperationBuilder.add(p_operationBuilder);
    return this;
  }

  public InteractionBuilder withOwnedParameter(org.eclipse.uml2.uml.Parameter p_ownedParameter) {
    m_ownedParameter.add(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public InteractionBuilder withOwnedParameter(java.util.Collection<? extends org.eclipse.uml2.uml.Parameter> p_ownedParameter) {
    m_ownedParameter.addAll(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public InteractionBuilder withOwnedParameter(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Parameter> p_parameterBuilder) {
    m_featureOwnedParameterBuilder.add(p_parameterBuilder);
    return this;
  }

  public InteractionBuilder withOwnedParameterSet(org.eclipse.uml2.uml.ParameterSet p_ownedParameterSet) {
    m_ownedParameterSet.add(p_ownedParameterSet);
    m_featureOwnedParameterSetSet = true;
    return this;
  }

  public InteractionBuilder withOwnedParameterSet(java.util.Collection<? extends org.eclipse.uml2.uml.ParameterSet> p_ownedParameterSet) {
    m_ownedParameterSet.addAll(p_ownedParameterSet);
    m_featureOwnedParameterSetSet = true;
    return this;
  }

  public InteractionBuilder withOwnedParameterSet(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterSet> p_parameterSetBuilder) {
    m_featureOwnedParameterSetBuilder.add(p_parameterSetBuilder);
    return this;
  }

  public InteractionBuilder withOwnedReception(org.eclipse.uml2.uml.Reception p_ownedReception) {
    m_ownedReception.add(p_ownedReception);
    m_featureOwnedReceptionSet = true;
    return this;
  }

  public InteractionBuilder withOwnedReception(java.util.Collection<? extends org.eclipse.uml2.uml.Reception> p_ownedReception) {
    m_ownedReception.addAll(p_ownedReception);
    m_featureOwnedReceptionSet = true;
    return this;
  }

  public InteractionBuilder withOwnedReception(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Reception> p_receptionBuilder) {
    m_featureOwnedReceptionBuilder.add(p_receptionBuilder);
    return this;
  }

  public InteractionBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public InteractionBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public InteractionBuilder withOwnedRule(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public InteractionBuilder withOwnedTrigger(org.eclipse.uml2.uml.Trigger p_ownedTrigger) {
    m_ownedTrigger.add(p_ownedTrigger);
    m_featureOwnedTriggerSet = true;
    return this;
  }

  public InteractionBuilder withOwnedTrigger(java.util.Collection<? extends org.eclipse.uml2.uml.Trigger> p_ownedTrigger) {
    m_ownedTrigger.addAll(p_ownedTrigger);
    m_featureOwnedTriggerSet = true;
    return this;
  }

  public InteractionBuilder withOwnedTrigger(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Trigger> p_triggerBuilder) {
    m_featureOwnedTriggerBuilder.add(p_triggerBuilder);
    return this;
  }

  public InteractionBuilder withOwnedUseCase(org.eclipse.uml2.uml.UseCase p_ownedUseCase) {
    m_ownedUseCase.add(p_ownedUseCase);
    m_featureOwnedUseCaseSet = true;
    return this;
  }

  public InteractionBuilder withOwnedUseCase(java.util.Collection<? extends org.eclipse.uml2.uml.UseCase> p_ownedUseCase) {
    m_ownedUseCase.addAll(p_ownedUseCase);
    m_featureOwnedUseCaseSet = true;
    return this;
  }

  public InteractionBuilder withOwnedUseCase(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase> p_useCaseBuilder) {
    m_featureOwnedUseCaseBuilder.add(p_useCaseBuilder);
    return this;
  }

  public InteractionBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public InteractionBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public InteractionBuilder withPackageImport(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageImport> p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public InteractionBuilder withPostcondition(org.eclipse.uml2.uml.Constraint p_postcondition) {
    m_postcondition.add(p_postcondition);
    m_featurePostconditionSet = true;
    return this;
  }

  public InteractionBuilder withPostcondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_postcondition) {
    m_postcondition.addAll(p_postcondition);
    m_featurePostconditionSet = true;
    return this;
  }

  public InteractionBuilder withPostcondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featurePostconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public InteractionBuilder withPowertypeExtent(org.eclipse.uml2.uml.GeneralizationSet p_powertypeExtent) {
    m_powertypeExtent.add(p_powertypeExtent);
    m_featurePowertypeExtentSet = true;
    return this;
  }

  public InteractionBuilder withPowertypeExtent(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralizationSet> p_powertypeExtent) {
    m_powertypeExtent.addAll(p_powertypeExtent);
    m_featurePowertypeExtentSet = true;
    return this;
  }

  public InteractionBuilder withPowertypeExtent(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.GeneralizationSet> p_generalizationSetBuilder) {
    m_featurePowertypeExtentBuilder.add(p_generalizationSetBuilder);
    return this;
  }

  public InteractionBuilder withPrecondition(org.eclipse.uml2.uml.Constraint p_precondition) {
    m_precondition.add(p_precondition);
    m_featurePreconditionSet = true;
    return this;
  }

  public InteractionBuilder withPrecondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_precondition) {
    m_precondition.addAll(p_precondition);
    m_featurePreconditionSet = true;
    return this;
  }

  public InteractionBuilder withPrecondition(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Constraint> p_constraintBuilder) {
    m_featurePreconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public InteractionBuilder withRedefinedBehavior(org.eclipse.uml2.uml.Behavior p_redefinedBehavior) {
    m_redefinedBehavior.add(p_redefinedBehavior);
    m_featureRedefinedBehaviorSet = true;
    return this;
  }

  public InteractionBuilder withRedefinedBehavior(java.util.Collection<? extends org.eclipse.uml2.uml.Behavior> p_redefinedBehavior) {
    m_redefinedBehavior.addAll(p_redefinedBehavior);
    m_featureRedefinedBehaviorSet = true;
    return this;
  }

  public InteractionBuilder withRedefinedBehavior(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Behavior> p_behaviorBuilder) {
    m_featureRedefinedBehaviorBuilder.add(p_behaviorBuilder);
    return this;
  }

  public InteractionBuilder withRedefinedClassifier(org.eclipse.uml2.uml.Classifier p_redefinedClassifier) {
    m_redefinedClassifier.add(p_redefinedClassifier);
    m_featureRedefinedClassifierSet = true;
    return this;
  }

  public InteractionBuilder withRedefinedClassifier(java.util.Collection<? extends org.eclipse.uml2.uml.Classifier> p_redefinedClassifier) {
    m_redefinedClassifier.addAll(p_redefinedClassifier);
    m_featureRedefinedClassifierSet = true;
    return this;
  }

  public InteractionBuilder withRedefinedClassifier(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Classifier> p_classifierBuilder) {
    m_featureRedefinedClassifierBuilder.add(p_classifierBuilder);
    return this;
  }

  public InteractionBuilder withSubstitution(org.eclipse.uml2.uml.Substitution p_substitution) {
    m_substitution.add(p_substitution);
    m_featureSubstitutionSet = true;
    return this;
  }

  public InteractionBuilder withSubstitution(java.util.Collection<? extends org.eclipse.uml2.uml.Substitution> p_substitution) {
    m_substitution.addAll(p_substitution);
    m_featureSubstitutionSet = true;
    return this;
  }

  public InteractionBuilder withSubstitution(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Substitution> p_substitutionBuilder) {
    m_featureSubstitutionBuilder.add(p_substitutionBuilder);
    return this;
  }

  public InteractionBuilder withTemplateBinding(org.eclipse.uml2.uml.TemplateBinding p_templateBinding) {
    m_templateBinding.add(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public InteractionBuilder withTemplateBinding(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBinding) {
    m_templateBinding.addAll(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public InteractionBuilder withTemplateBinding(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBindingBuilder) {
    m_featureTemplateBindingBuilder.add(p_templateBindingBuilder);
    return this;
  }

  public InteractionBuilder withUseCase(org.eclipse.uml2.uml.UseCase p_useCase) {
    m_useCase.add(p_useCase);
    m_featureUseCaseSet = true;
    return this;
  }

  public InteractionBuilder withUseCase(java.util.Collection<? extends org.eclipse.uml2.uml.UseCase> p_useCase) {
    m_useCase.addAll(p_useCase);
    m_featureUseCaseSet = true;
    return this;
  }

  public InteractionBuilder withUseCase(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.UseCase> p_useCaseBuilder) {
    m_featureUseCaseBuilder.add(p_useCaseBuilder);
    return this;
  }
}
