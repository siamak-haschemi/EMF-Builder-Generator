package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Operation</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class OperationBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Constraint m_bodyCondition;
  private org.eclipse.uml2.uml.util.builder.ConstraintBuilder m_featureBodyConditionBuilder;
  private org.eclipse.uml2.uml.Class m_class_;
  private org.eclipse.uml2.uml.util.builder.ClassBuilder m_featureClass_Builder;
  private org.eclipse.uml2.uml.CallConcurrencyKind m_concurrency;
  private org.eclipse.uml2.uml.DataType m_datatype;
  private org.eclipse.uml2.uml.util.builder.DataTypeBuilder m_featureDatatypeBuilder;
  private org.eclipse.uml2.uml.Interface m_interface_;
  private org.eclipse.uml2.uml.util.builder.InterfaceBuilder m_featureInterface_Builder;
  private Boolean m_isAbstract;
  private Boolean m_isLeaf;
  private Boolean m_isQuery;
  private Boolean m_isStatic;
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
  private java.util.Collection<org.eclipse.uml2.uml.Behavior> m_method = new java.util.LinkedList<org.eclipse.uml2.uml.Behavior>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Parameter> m_ownedParameter = new java.util.LinkedList<org.eclipse.uml2.uml.Parameter>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ParameterBuilder> m_featureOwnedParameterBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ParameterBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.ParameterSet> m_ownedParameterSet = new java.util.LinkedList<org.eclipse.uml2.uml.ParameterSet>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ParameterSetBuilder> m_featureOwnedParameterSetBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ParameterSetBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_ownedRule = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featureOwnedRuleBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.PackageImport> m_packageImport = new java.util.LinkedList<org.eclipse.uml2.uml.PackageImport>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PackageImportBuilder> m_featurePackageImportBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PackageImportBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_postcondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featurePostconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Constraint> m_precondition = new java.util.LinkedList<org.eclipse.uml2.uml.Constraint>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConstraintBuilder> m_featurePreconditionBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConstraintBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Type> m_raisedException = new java.util.LinkedList<org.eclipse.uml2.uml.Type>();
  private java.util.Collection<org.eclipse.uml2.uml.Operation> m_redefinedOperation = new java.util.LinkedList<org.eclipse.uml2.uml.Operation>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.OperationBuilder> m_featureRedefinedOperationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.OperationBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.TemplateBinding> m_templateBinding = new java.util.LinkedList<org.eclipse.uml2.uml.TemplateBinding>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.TemplateBindingBuilder> m_featureTemplateBindingBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.TemplateBindingBuilder>();
  // helper attributes
  private boolean m_featureBodyConditionSet = false;
  private boolean m_featureClass_Set = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConcurrencySet = false;
  private boolean m_featureDatatypeSet = false;
  private boolean m_featureElementImportSet = false;
  private boolean m_featureInterface_Set = false;
  private boolean m_featureIsAbstractSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureIsQuerySet = false;
  private boolean m_featureIsStaticSet = false;
  private boolean m_featureMethodSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedParameterSet = false;
  private boolean m_featureOwnedParameterSetSet = false;
  private boolean m_featureOwnedRuleSet = false;
  private boolean m_featureOwnedTemplateSignatureSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featurePackageImportSet = false;
  private boolean m_featurePostconditionSet = false;
  private boolean m_featurePreconditionSet = false;
  private boolean m_featureRaisedExceptionSet = false;
  private boolean m_featureRedefinedOperationSet = false;
  private boolean m_featureTemplateBindingSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newOperationBuilder()
   */
  private OperationBuilder() {
  }

  /**
   * This method creates a new instance of the OperationBuilder.
   * @return new instance of the OperationBuilder
   */
  public static OperationBuilder newOperationBuilder() {
    return new OperationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public OperationBuilder but() {
    OperationBuilder _builder = newOperationBuilder();
    _builder.m_featureBodyConditionSet = m_featureBodyConditionSet;
    _builder.m_bodyCondition = m_bodyCondition;
    _builder.m_featureBodyConditionBuilder = m_featureBodyConditionBuilder;
    _builder.m_featureClass_Set = m_featureClass_Set;
    _builder.m_class_ = m_class_;
    _builder.m_featureClass_Builder = m_featureClass_Builder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureConcurrencySet = m_featureConcurrencySet;
    _builder.m_concurrency = m_concurrency;
    _builder.m_featureDatatypeSet = m_featureDatatypeSet;
    _builder.m_datatype = m_datatype;
    _builder.m_featureDatatypeBuilder = m_featureDatatypeBuilder;
    _builder.m_featureElementImportSet = m_featureElementImportSet;
    _builder.m_elementImport = m_elementImport;
    _builder.m_featureElementImportBuilder = m_featureElementImportBuilder;
    _builder.m_featureInterface_Set = m_featureInterface_Set;
    _builder.m_interface_ = m_interface_;
    _builder.m_featureInterface_Builder = m_featureInterface_Builder;
    _builder.m_featureIsAbstractSet = m_featureIsAbstractSet;
    _builder.m_isAbstract = m_isAbstract;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureIsQuerySet = m_featureIsQuerySet;
    _builder.m_isQuery = m_isQuery;
    _builder.m_featureIsStaticSet = m_featureIsStaticSet;
    _builder.m_isStatic = m_isStatic;
    _builder.m_featureMethodSet = m_featureMethodSet;
    _builder.m_method = m_method;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedParameterSet = m_featureOwnedParameterSet;
    _builder.m_ownedParameter = m_ownedParameter;
    _builder.m_featureOwnedParameterBuilder = m_featureOwnedParameterBuilder;
    _builder.m_featureOwnedParameterSetSet = m_featureOwnedParameterSetSet;
    _builder.m_ownedParameterSet = m_ownedParameterSet;
    _builder.m_featureOwnedParameterSetBuilder = m_featureOwnedParameterSetBuilder;
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
    _builder.m_featurePostconditionSet = m_featurePostconditionSet;
    _builder.m_postcondition = m_postcondition;
    _builder.m_featurePostconditionBuilder = m_featurePostconditionBuilder;
    _builder.m_featurePreconditionSet = m_featurePreconditionSet;
    _builder.m_precondition = m_precondition;
    _builder.m_featurePreconditionBuilder = m_featurePreconditionBuilder;
    _builder.m_featureRaisedExceptionSet = m_featureRaisedExceptionSet;
    _builder.m_raisedException = m_raisedException;
    _builder.m_featureRedefinedOperationSet = m_featureRedefinedOperationSet;
    _builder.m_redefinedOperation = m_redefinedOperation;
    _builder.m_featureRedefinedOperationBuilder = m_featureRedefinedOperationBuilder;
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
   * This method constructs the final org.eclipse.uml2.uml.Operation type.
   * @return new instance of the org.eclipse.uml2.uml.Operation type
   */
  public org.eclipse.uml2.uml.Operation build() {
    final org.eclipse.uml2.uml.Operation _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createOperation();
    if (m_featureBodyConditionSet) {
      _newInstance.setBodyCondition(m_bodyCondition);
    } else {
      if (m_featureBodyConditionBuilder != null) {
        _newInstance.setBodyCondition(m_featureBodyConditionBuilder.build());
      }
    }
    if (m_featureClass_Set) {
      _newInstance.setClass_(m_class_);
    } else {
      if (m_featureClass_Builder != null) {
        _newInstance.setClass_(m_featureClass_Builder.build());
      }
    }
    if (m_featureConcurrencySet) {
      _newInstance.setConcurrency(m_concurrency);
    }
    if (m_featureDatatypeSet) {
      _newInstance.setDatatype(m_datatype);
    } else {
      if (m_featureDatatypeBuilder != null) {
        _newInstance.setDatatype(m_featureDatatypeBuilder.build());
      }
    }
    if (m_featureInterface_Set) {
      _newInstance.setInterface(m_interface_);
    } else {
      if (m_featureInterface_Builder != null) {
        _newInstance.setInterface(m_featureInterface_Builder.build());
      }
    }
    if (m_featureIsAbstractSet) {
      _newInstance.setIsAbstract(m_isAbstract);
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureIsQuerySet) {
      _newInstance.setIsQuery(m_isQuery);
    }
    if (m_featureIsStaticSet) {
      _newInstance.setIsStatic(m_isStatic);
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
    if (m_featureMethodSet) {
      _newInstance.getMethods().addAll(m_method);
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
    if (m_featureOwnedParameterSet) {
      _newInstance.getOwnedParameters().addAll(m_ownedParameter);
    } else {
      if (!m_featureOwnedParameterBuilder.isEmpty()) {
        for (ParameterBuilder builder : m_featureOwnedParameterBuilder) {
          _newInstance.getOwnedParameters().add(builder.build());
        }
      }
    }
    if (m_featureOwnedParameterSetSet) {
      _newInstance.getOwnedParameterSets().addAll(m_ownedParameterSet);
    } else {
      if (!m_featureOwnedParameterSetBuilder.isEmpty()) {
        for (ParameterSetBuilder builder : m_featureOwnedParameterSetBuilder) {
          _newInstance.getOwnedParameterSets().add(builder.build());
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
    if (m_featurePostconditionSet) {
      _newInstance.getPostconditions().addAll(m_postcondition);
    } else {
      if (!m_featurePostconditionBuilder.isEmpty()) {
        for (ConstraintBuilder builder : m_featurePostconditionBuilder) {
          _newInstance.getPostconditions().add(builder.build());
        }
      }
    }
    if (m_featurePreconditionSet) {
      _newInstance.getPreconditions().addAll(m_precondition);
    } else {
      if (!m_featurePreconditionBuilder.isEmpty()) {
        for (ConstraintBuilder builder : m_featurePreconditionBuilder) {
          _newInstance.getPreconditions().add(builder.build());
        }
      }
    }
    if (m_featureRaisedExceptionSet) {
      _newInstance.getRaisedExceptions().addAll(m_raisedException);
    }
    if (m_featureRedefinedOperationSet) {
      _newInstance.getRedefinedOperations().addAll(m_redefinedOperation);
    } else {
      if (!m_featureRedefinedOperationBuilder.isEmpty()) {
        for (OperationBuilder builder : m_featureRedefinedOperationBuilder) {
          _newInstance.getRedefinedOperations().add(builder.build());
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

  public OperationBuilder withBodyCondition(org.eclipse.uml2.uml.Constraint p_bodyCondition) {
    m_bodyCondition = p_bodyCondition;
    m_featureBodyConditionSet = true;
    return this;
  }

  public OperationBuilder withBodyCondition(org.eclipse.uml2.uml.util.builder.ConstraintBuilder p_constraintBuilder) {
    m_featureBodyConditionBuilder = p_constraintBuilder;
    return this;
  }

  public OperationBuilder withClass_(org.eclipse.uml2.uml.Class p_class_) {
    m_class_ = p_class_;
    m_featureClass_Set = true;
    return this;
  }

  public OperationBuilder withClass_(org.eclipse.uml2.uml.util.builder.ClassBuilder p_classBuilder) {
    m_featureClass_Builder = p_classBuilder;
    return this;
  }

  public OperationBuilder withConcurrency(org.eclipse.uml2.uml.CallConcurrencyKind p_concurrency) {
    m_concurrency = p_concurrency;
    m_featureConcurrencySet = true;
    return this;
  }

  public OperationBuilder withDatatype(org.eclipse.uml2.uml.DataType p_datatype) {
    m_datatype = p_datatype;
    m_featureDatatypeSet = true;
    return this;
  }

  public OperationBuilder withDatatype(org.eclipse.uml2.uml.util.builder.DataTypeBuilder p_dataTypeBuilder) {
    m_featureDatatypeBuilder = p_dataTypeBuilder;
    return this;
  }

  public OperationBuilder withInterface_(org.eclipse.uml2.uml.Interface p_interface_) {
    m_interface_ = p_interface_;
    m_featureInterface_Set = true;
    return this;
  }

  public OperationBuilder withInterface_(org.eclipse.uml2.uml.util.builder.InterfaceBuilder p_interfaceBuilder) {
    m_featureInterface_Builder = p_interfaceBuilder;
    return this;
  }

  public OperationBuilder withIsAbstract(Boolean p_isAbstract) {
    m_isAbstract = p_isAbstract;
    m_featureIsAbstractSet = true;
    return this;
  }

  public OperationBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public OperationBuilder withIsQuery(Boolean p_isQuery) {
    m_isQuery = p_isQuery;
    m_featureIsQuerySet = true;
    return this;
  }

  public OperationBuilder withIsStatic(Boolean p_isStatic) {
    m_isStatic = p_isStatic;
    m_featureIsStaticSet = true;
    return this;
  }

  public OperationBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public OperationBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public OperationBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public OperationBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.TemplateSignature p_ownedTemplateSignature) {
    m_ownedTemplateSignature = p_ownedTemplateSignature;
    m_featureOwnedTemplateSignatureSet = true;
    return this;
  }

  public OperationBuilder withOwnedTemplateSignature(org.eclipse.uml2.uml.util.builder.TemplateSignatureBuilder p_templateSignatureBuilder) {
    m_featureOwnedTemplateSignatureBuilder = p_templateSignatureBuilder;
    return this;
  }

  public OperationBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public OperationBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public OperationBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public OperationBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public OperationBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public OperationBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public OperationBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public OperationBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public OperationBuilder withElementImport(org.eclipse.uml2.uml.ElementImport p_elementImport) {
    m_elementImport.add(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public OperationBuilder withElementImport(java.util.Collection<? extends org.eclipse.uml2.uml.ElementImport> p_elementImport) {
    m_elementImport.addAll(p_elementImport);
    m_featureElementImportSet = true;
    return this;
  }

  public OperationBuilder withElementImport(ElementImportBuilder p_elementImportBuilder) {
    m_featureElementImportBuilder.add(p_elementImportBuilder);
    return this;
  }

  public OperationBuilder withMethod(org.eclipse.uml2.uml.Behavior p_method) {
    m_method.add(p_method);
    m_featureMethodSet = true;
    return this;
  }

  public OperationBuilder withMethod(java.util.Collection<? extends org.eclipse.uml2.uml.Behavior> p_method) {
    m_method.addAll(p_method);
    m_featureMethodSet = true;
    return this;
  }

  public OperationBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public OperationBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public OperationBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public OperationBuilder withOwnedParameter(org.eclipse.uml2.uml.Parameter p_ownedParameter) {
    m_ownedParameter.add(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public OperationBuilder withOwnedParameter(java.util.Collection<? extends org.eclipse.uml2.uml.Parameter> p_ownedParameter) {
    m_ownedParameter.addAll(p_ownedParameter);
    m_featureOwnedParameterSet = true;
    return this;
  }

  public OperationBuilder withOwnedParameter(ParameterBuilder p_parameterBuilder) {
    m_featureOwnedParameterBuilder.add(p_parameterBuilder);
    return this;
  }

  public OperationBuilder withOwnedParameterSet(org.eclipse.uml2.uml.ParameterSet p_ownedParameterSet) {
    m_ownedParameterSet.add(p_ownedParameterSet);
    m_featureOwnedParameterSetSet = true;
    return this;
  }

  public OperationBuilder withOwnedParameterSet(java.util.Collection<? extends org.eclipse.uml2.uml.ParameterSet> p_ownedParameterSet) {
    m_ownedParameterSet.addAll(p_ownedParameterSet);
    m_featureOwnedParameterSetSet = true;
    return this;
  }

  public OperationBuilder withOwnedParameterSet(ParameterSetBuilder p_parameterSetBuilder) {
    m_featureOwnedParameterSetBuilder.add(p_parameterSetBuilder);
    return this;
  }

  public OperationBuilder withOwnedRule(org.eclipse.uml2.uml.Constraint p_ownedRule) {
    m_ownedRule.add(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public OperationBuilder withOwnedRule(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_ownedRule) {
    m_ownedRule.addAll(p_ownedRule);
    m_featureOwnedRuleSet = true;
    return this;
  }

  public OperationBuilder withOwnedRule(ConstraintBuilder p_constraintBuilder) {
    m_featureOwnedRuleBuilder.add(p_constraintBuilder);
    return this;
  }

  public OperationBuilder withPackageImport(org.eclipse.uml2.uml.PackageImport p_packageImport) {
    m_packageImport.add(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public OperationBuilder withPackageImport(java.util.Collection<? extends org.eclipse.uml2.uml.PackageImport> p_packageImport) {
    m_packageImport.addAll(p_packageImport);
    m_featurePackageImportSet = true;
    return this;
  }

  public OperationBuilder withPackageImport(PackageImportBuilder p_packageImportBuilder) {
    m_featurePackageImportBuilder.add(p_packageImportBuilder);
    return this;
  }

  public OperationBuilder withPostcondition(org.eclipse.uml2.uml.Constraint p_postcondition) {
    m_postcondition.add(p_postcondition);
    m_featurePostconditionSet = true;
    return this;
  }

  public OperationBuilder withPostcondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_postcondition) {
    m_postcondition.addAll(p_postcondition);
    m_featurePostconditionSet = true;
    return this;
  }

  public OperationBuilder withPostcondition(ConstraintBuilder p_constraintBuilder) {
    m_featurePostconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public OperationBuilder withPrecondition(org.eclipse.uml2.uml.Constraint p_precondition) {
    m_precondition.add(p_precondition);
    m_featurePreconditionSet = true;
    return this;
  }

  public OperationBuilder withPrecondition(java.util.Collection<? extends org.eclipse.uml2.uml.Constraint> p_precondition) {
    m_precondition.addAll(p_precondition);
    m_featurePreconditionSet = true;
    return this;
  }

  public OperationBuilder withPrecondition(ConstraintBuilder p_constraintBuilder) {
    m_featurePreconditionBuilder.add(p_constraintBuilder);
    return this;
  }

  public OperationBuilder withRaisedException(org.eclipse.uml2.uml.Type p_raisedException) {
    m_raisedException.add(p_raisedException);
    m_featureRaisedExceptionSet = true;
    return this;
  }

  public OperationBuilder withRaisedException(java.util.Collection<? extends org.eclipse.uml2.uml.Type> p_raisedException) {
    m_raisedException.addAll(p_raisedException);
    m_featureRaisedExceptionSet = true;
    return this;
  }

  public OperationBuilder withRedefinedOperation(org.eclipse.uml2.uml.Operation p_redefinedOperation) {
    m_redefinedOperation.add(p_redefinedOperation);
    m_featureRedefinedOperationSet = true;
    return this;
  }

  public OperationBuilder withRedefinedOperation(java.util.Collection<? extends org.eclipse.uml2.uml.Operation> p_redefinedOperation) {
    m_redefinedOperation.addAll(p_redefinedOperation);
    m_featureRedefinedOperationSet = true;
    return this;
  }

  public OperationBuilder withRedefinedOperation(OperationBuilder p_operationBuilder) {
    m_featureRedefinedOperationBuilder.add(p_operationBuilder);
    return this;
  }

  public OperationBuilder withTemplateBinding(org.eclipse.uml2.uml.TemplateBinding p_templateBinding) {
    m_templateBinding.add(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public OperationBuilder withTemplateBinding(java.util.Collection<? extends org.eclipse.uml2.uml.TemplateBinding> p_templateBinding) {
    m_templateBinding.addAll(p_templateBinding);
    m_featureTemplateBindingSet = true;
    return this;
  }

  public OperationBuilder withTemplateBinding(TemplateBindingBuilder p_templateBindingBuilder) {
    m_featureTemplateBindingBuilder.add(p_templateBindingBuilder);
    return this;
  }
}
