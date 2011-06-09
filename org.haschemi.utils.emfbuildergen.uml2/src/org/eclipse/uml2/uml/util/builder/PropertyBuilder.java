package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Property</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PropertyBuilder {
  // features and builders
  private org.eclipse.uml2.uml.AggregationKind m_aggregation;
  private org.eclipse.uml2.uml.Association m_association;
  private org.eclipse.uml2.uml.util.builder.AssociationBuilder m_featureAssociationBuilder;
  private org.eclipse.uml2.uml.Property m_associationEnd;
  private org.eclipse.uml2.uml.util.builder.PropertyBuilder m_featureAssociationEndBuilder;
  private org.eclipse.uml2.uml.DataType m_datatype;
  private org.eclipse.uml2.uml.util.builder.DataTypeBuilder m_featureDatatypeBuilder;
  private org.eclipse.uml2.uml.ValueSpecification m_defaultValue;
  private Boolean m_isDerived;
  private Boolean m_isDerivedUnion;
  private Boolean m_isLeaf;
  private Boolean m_isOrdered;
  private Boolean m_isReadOnly;
  private Boolean m_isStatic;
  private Boolean m_isUnique;
  private org.eclipse.uml2.uml.ValueSpecification m_lowerValue;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.Association m_owningAssociation;
  private org.eclipse.uml2.uml.util.builder.AssociationBuilder m_featureOwningAssociationBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.Type m_type;
  private org.eclipse.uml2.uml.ValueSpecification m_upperValue;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Deployment> m_deployment = new java.util.LinkedList<org.eclipse.uml2.uml.Deployment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DeploymentBuilder> m_featureDeploymentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DeploymentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Property> m_qualifier = new java.util.LinkedList<org.eclipse.uml2.uml.Property>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PropertyBuilder> m_featureQualifierBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PropertyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Property> m_redefinedProperty = new java.util.LinkedList<org.eclipse.uml2.uml.Property>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PropertyBuilder> m_featureRedefinedPropertyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PropertyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Property> m_subsettedProperty = new java.util.LinkedList<org.eclipse.uml2.uml.Property>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.PropertyBuilder> m_featureSubsettedPropertyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.PropertyBuilder>();
  // helper attributes
  private boolean m_featureAggregationSet = false;
  private boolean m_featureAssociationSet = false;
  private boolean m_featureAssociationEndSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureDatatypeSet = false;
  private boolean m_featureDefaultValueSet = false;
  private boolean m_featureDeploymentSet = false;
  private boolean m_featureIsDerivedSet = false;
  private boolean m_featureIsDerivedUnionSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureIsOrderedSet = false;
  private boolean m_featureIsReadOnlySet = false;
  private boolean m_featureIsStaticSet = false;
  private boolean m_featureIsUniqueSet = false;
  private boolean m_featureLowerValueSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningAssociationSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureQualifierSet = false;
  private boolean m_featureRedefinedPropertySet = false;
  private boolean m_featureSubsettedPropertySet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureUpperValueSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newPropertyBuilder()
   */
  private PropertyBuilder() {
  }

  /**
   * This method creates a new instance of the PropertyBuilder.
   * @return new instance of the PropertyBuilder
   */
  public static PropertyBuilder newPropertyBuilder() {
    return new PropertyBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public PropertyBuilder but() {
    PropertyBuilder _builder = newPropertyBuilder();
    _builder.m_featureAggregationSet = m_featureAggregationSet;
    _builder.m_aggregation = m_aggregation;
    _builder.m_featureAssociationSet = m_featureAssociationSet;
    _builder.m_association = m_association;
    _builder.m_featureAssociationBuilder = m_featureAssociationBuilder;
    _builder.m_featureAssociationEndSet = m_featureAssociationEndSet;
    _builder.m_associationEnd = m_associationEnd;
    _builder.m_featureAssociationEndBuilder = m_featureAssociationEndBuilder;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureDatatypeSet = m_featureDatatypeSet;
    _builder.m_datatype = m_datatype;
    _builder.m_featureDatatypeBuilder = m_featureDatatypeBuilder;
    _builder.m_featureDefaultValueSet = m_featureDefaultValueSet;
    _builder.m_defaultValue = m_defaultValue;
    _builder.m_featureDeploymentSet = m_featureDeploymentSet;
    _builder.m_deployment = m_deployment;
    _builder.m_featureDeploymentBuilder = m_featureDeploymentBuilder;
    _builder.m_featureIsDerivedSet = m_featureIsDerivedSet;
    _builder.m_isDerived = m_isDerived;
    _builder.m_featureIsDerivedUnionSet = m_featureIsDerivedUnionSet;
    _builder.m_isDerivedUnion = m_isDerivedUnion;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureIsOrderedSet = m_featureIsOrderedSet;
    _builder.m_isOrdered = m_isOrdered;
    _builder.m_featureIsReadOnlySet = m_featureIsReadOnlySet;
    _builder.m_isReadOnly = m_isReadOnly;
    _builder.m_featureIsStaticSet = m_featureIsStaticSet;
    _builder.m_isStatic = m_isStatic;
    _builder.m_featureIsUniqueSet = m_featureIsUniqueSet;
    _builder.m_isUnique = m_isUnique;
    _builder.m_featureLowerValueSet = m_featureLowerValueSet;
    _builder.m_lowerValue = m_lowerValue;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwningAssociationSet = m_featureOwningAssociationSet;
    _builder.m_owningAssociation = m_owningAssociation;
    _builder.m_featureOwningAssociationBuilder = m_featureOwningAssociationBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featureQualifierSet = m_featureQualifierSet;
    _builder.m_qualifier = m_qualifier;
    _builder.m_featureQualifierBuilder = m_featureQualifierBuilder;
    _builder.m_featureRedefinedPropertySet = m_featureRedefinedPropertySet;
    _builder.m_redefinedProperty = m_redefinedProperty;
    _builder.m_featureRedefinedPropertyBuilder = m_featureRedefinedPropertyBuilder;
    _builder.m_featureSubsettedPropertySet = m_featureSubsettedPropertySet;
    _builder.m_subsettedProperty = m_subsettedProperty;
    _builder.m_featureSubsettedPropertyBuilder = m_featureSubsettedPropertyBuilder;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureUpperValueSet = m_featureUpperValueSet;
    _builder.m_upperValue = m_upperValue;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Property type.
   * @return new instance of the org.eclipse.uml2.uml.Property type
   */
  public org.eclipse.uml2.uml.Property build() {
    final org.eclipse.uml2.uml.Property _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createProperty();
    if (m_featureAggregationSet) {
      _newInstance.setAggregation(m_aggregation);
    }
    if (m_featureAssociationSet) {
      _newInstance.setAssociation(m_association);
    } else {
      if (m_featureAssociationBuilder != null) {
        _newInstance.setAssociation(m_featureAssociationBuilder.build());
      }
    }
    if (m_featureAssociationEndSet) {
      _newInstance.setAssociationEnd(m_associationEnd);
    } else {
      if (m_featureAssociationEndBuilder != null) {
        _newInstance.setAssociationEnd(m_featureAssociationEndBuilder.build());
      }
    }
    if (m_featureDatatypeSet) {
      _newInstance.setDatatype(m_datatype);
    } else {
      if (m_featureDatatypeBuilder != null) {
        _newInstance.setDatatype(m_featureDatatypeBuilder.build());
      }
    }
    if (m_featureDefaultValueSet) {
      _newInstance.setDefaultValue(m_defaultValue);
    }
    if (m_featureIsDerivedSet) {
      _newInstance.setIsDerived(m_isDerived);
    }
    if (m_featureIsDerivedUnionSet) {
      _newInstance.setIsDerivedUnion(m_isDerivedUnion);
    }
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureIsOrderedSet) {
      _newInstance.setIsOrdered(m_isOrdered);
    }
    if (m_featureIsReadOnlySet) {
      _newInstance.setIsReadOnly(m_isReadOnly);
    }
    if (m_featureIsStaticSet) {
      _newInstance.setIsStatic(m_isStatic);
    }
    if (m_featureIsUniqueSet) {
      _newInstance.setIsUnique(m_isUnique);
    }
    if (m_featureLowerValueSet) {
      _newInstance.setLowerValue(m_lowerValue);
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
    if (m_featureOwningAssociationSet) {
      _newInstance.setOwningAssociation(m_owningAssociation);
    } else {
      if (m_featureOwningAssociationBuilder != null) {
        _newInstance.setOwningAssociation(m_featureOwningAssociationBuilder.build());
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
    if (m_featureTypeSet) {
      _newInstance.setType(m_type);
    }
    if (m_featureUpperValueSet) {
      _newInstance.setUpperValue(m_upperValue);
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
    if (m_featureDeploymentSet) {
      _newInstance.getDeployments().addAll(m_deployment);
    } else {
      if (!m_featureDeploymentBuilder.isEmpty()) {
        for (DeploymentBuilder builder : m_featureDeploymentBuilder) {
          _newInstance.getDeployments().add(builder.build());
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
    if (m_featureQualifierSet) {
      _newInstance.getQualifiers().addAll(m_qualifier);
    } else {
      if (!m_featureQualifierBuilder.isEmpty()) {
        for (PropertyBuilder builder : m_featureQualifierBuilder) {
          _newInstance.getQualifiers().add(builder.build());
        }
      }
    }
    if (m_featureRedefinedPropertySet) {
      _newInstance.getRedefinedProperties().addAll(m_redefinedProperty);
    } else {
      if (!m_featureRedefinedPropertyBuilder.isEmpty()) {
        for (PropertyBuilder builder : m_featureRedefinedPropertyBuilder) {
          _newInstance.getRedefinedProperties().add(builder.build());
        }
      }
    }
    if (m_featureSubsettedPropertySet) {
      _newInstance.getSubsettedProperties().addAll(m_subsettedProperty);
    } else {
      if (!m_featureSubsettedPropertyBuilder.isEmpty()) {
        for (PropertyBuilder builder : m_featureSubsettedPropertyBuilder) {
          _newInstance.getSubsettedProperties().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public PropertyBuilder withAggregation(org.eclipse.uml2.uml.AggregationKind p_aggregation) {
    m_aggregation = p_aggregation;
    m_featureAggregationSet = true;
    return this;
  }

  public PropertyBuilder withAssociation(org.eclipse.uml2.uml.Association p_association) {
    m_association = p_association;
    m_featureAssociationSet = true;
    return this;
  }

  public PropertyBuilder withAssociation(org.eclipse.uml2.uml.util.builder.AssociationBuilder p_associationBuilder) {
    m_featureAssociationBuilder = p_associationBuilder;
    return this;
  }

  public PropertyBuilder withAssociationEnd(org.eclipse.uml2.uml.Property p_associationEnd) {
    m_associationEnd = p_associationEnd;
    m_featureAssociationEndSet = true;
    return this;
  }

  public PropertyBuilder withAssociationEnd(org.eclipse.uml2.uml.util.builder.PropertyBuilder p_propertyBuilder) {
    m_featureAssociationEndBuilder = p_propertyBuilder;
    return this;
  }

  public PropertyBuilder withDatatype(org.eclipse.uml2.uml.DataType p_datatype) {
    m_datatype = p_datatype;
    m_featureDatatypeSet = true;
    return this;
  }

  public PropertyBuilder withDatatype(org.eclipse.uml2.uml.util.builder.DataTypeBuilder p_dataTypeBuilder) {
    m_featureDatatypeBuilder = p_dataTypeBuilder;
    return this;
  }

  public PropertyBuilder withDefaultValue(org.eclipse.uml2.uml.ValueSpecification p_defaultValue) {
    m_defaultValue = p_defaultValue;
    m_featureDefaultValueSet = true;
    return this;
  }

  public PropertyBuilder withIsDerived(Boolean p_isDerived) {
    m_isDerived = p_isDerived;
    m_featureIsDerivedSet = true;
    return this;
  }

  public PropertyBuilder withIsDerivedUnion(Boolean p_isDerivedUnion) {
    m_isDerivedUnion = p_isDerivedUnion;
    m_featureIsDerivedUnionSet = true;
    return this;
  }

  public PropertyBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public PropertyBuilder withIsOrdered(Boolean p_isOrdered) {
    m_isOrdered = p_isOrdered;
    m_featureIsOrderedSet = true;
    return this;
  }

  public PropertyBuilder withIsReadOnly(Boolean p_isReadOnly) {
    m_isReadOnly = p_isReadOnly;
    m_featureIsReadOnlySet = true;
    return this;
  }

  public PropertyBuilder withIsStatic(Boolean p_isStatic) {
    m_isStatic = p_isStatic;
    m_featureIsStaticSet = true;
    return this;
  }

  public PropertyBuilder withIsUnique(Boolean p_isUnique) {
    m_isUnique = p_isUnique;
    m_featureIsUniqueSet = true;
    return this;
  }

  public PropertyBuilder withLowerValue(org.eclipse.uml2.uml.ValueSpecification p_lowerValue) {
    m_lowerValue = p_lowerValue;
    m_featureLowerValueSet = true;
    return this;
  }

  public PropertyBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public PropertyBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public PropertyBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public PropertyBuilder withOwningAssociation(org.eclipse.uml2.uml.Association p_owningAssociation) {
    m_owningAssociation = p_owningAssociation;
    m_featureOwningAssociationSet = true;
    return this;
  }

  public PropertyBuilder withOwningAssociation(org.eclipse.uml2.uml.util.builder.AssociationBuilder p_associationBuilder) {
    m_featureOwningAssociationBuilder = p_associationBuilder;
    return this;
  }

  public PropertyBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public PropertyBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public PropertyBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public PropertyBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public PropertyBuilder withType(org.eclipse.uml2.uml.Type p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public PropertyBuilder withUpperValue(org.eclipse.uml2.uml.ValueSpecification p_upperValue) {
    m_upperValue = p_upperValue;
    m_featureUpperValueSet = true;
    return this;
  }

  public PropertyBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public PropertyBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public PropertyBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public PropertyBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public PropertyBuilder withDeployment(org.eclipse.uml2.uml.Deployment p_deployment) {
    m_deployment.add(p_deployment);
    m_featureDeploymentSet = true;
    return this;
  }

  public PropertyBuilder withDeployment(java.util.Collection<? extends org.eclipse.uml2.uml.Deployment> p_deployment) {
    m_deployment.addAll(p_deployment);
    m_featureDeploymentSet = true;
    return this;
  }

  public PropertyBuilder withDeployment(DeploymentBuilder p_deploymentBuilder) {
    m_featureDeploymentBuilder.add(p_deploymentBuilder);
    return this;
  }

  public PropertyBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public PropertyBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public PropertyBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public PropertyBuilder withQualifier(org.eclipse.uml2.uml.Property p_qualifier) {
    m_qualifier.add(p_qualifier);
    m_featureQualifierSet = true;
    return this;
  }

  public PropertyBuilder withQualifier(java.util.Collection<? extends org.eclipse.uml2.uml.Property> p_qualifier) {
    m_qualifier.addAll(p_qualifier);
    m_featureQualifierSet = true;
    return this;
  }

  public PropertyBuilder withQualifier(PropertyBuilder p_propertyBuilder) {
    m_featureQualifierBuilder.add(p_propertyBuilder);
    return this;
  }

  public PropertyBuilder withRedefinedProperty(org.eclipse.uml2.uml.Property p_redefinedProperty) {
    m_redefinedProperty.add(p_redefinedProperty);
    m_featureRedefinedPropertySet = true;
    return this;
  }

  public PropertyBuilder withRedefinedProperty(java.util.Collection<? extends org.eclipse.uml2.uml.Property> p_redefinedProperty) {
    m_redefinedProperty.addAll(p_redefinedProperty);
    m_featureRedefinedPropertySet = true;
    return this;
  }

  public PropertyBuilder withRedefinedProperty(PropertyBuilder p_propertyBuilder) {
    m_featureRedefinedPropertyBuilder.add(p_propertyBuilder);
    return this;
  }

  public PropertyBuilder withSubsettedProperty(org.eclipse.uml2.uml.Property p_subsettedProperty) {
    m_subsettedProperty.add(p_subsettedProperty);
    m_featureSubsettedPropertySet = true;
    return this;
  }

  public PropertyBuilder withSubsettedProperty(java.util.Collection<? extends org.eclipse.uml2.uml.Property> p_subsettedProperty) {
    m_subsettedProperty.addAll(p_subsettedProperty);
    m_featureSubsettedPropertySet = true;
    return this;
  }

  public PropertyBuilder withSubsettedProperty(PropertyBuilder p_propertyBuilder) {
    m_featureSubsettedPropertyBuilder.add(p_propertyBuilder);
    return this;
  }
}
