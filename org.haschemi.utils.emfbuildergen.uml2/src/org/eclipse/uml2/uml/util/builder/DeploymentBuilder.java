package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Deployment</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class DeploymentBuilder {
  // features and builders
  private org.eclipse.uml2.uml.DeploymentTarget m_location;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_owningTemplateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureOwningTemplateParameterBuilder;
  private org.eclipse.uml2.uml.TemplateParameter m_templateParameter;
  private org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder m_featureTemplateParameterBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.NamedElement> m_client = new java.util.LinkedList<org.eclipse.uml2.uml.NamedElement>();
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.DeploymentSpecification> m_configuration = new java.util.LinkedList<org.eclipse.uml2.uml.DeploymentSpecification>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DeploymentSpecificationBuilder> m_featureConfigurationBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DeploymentSpecificationBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.DeployedArtifact> m_deployedArtifact = new java.util.LinkedList<org.eclipse.uml2.uml.DeployedArtifact>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.NamedElement> m_supplier = new java.util.LinkedList<org.eclipse.uml2.uml.NamedElement>();
  // helper attributes
  private boolean m_featureClientSet = false;
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureConfigurationSet = false;
  private boolean m_featureDeployedArtifactSet = false;
  private boolean m_featureLocationSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningTemplateParameterSet = false;
  private boolean m_featureSupplierSet = false;
  private boolean m_featureTemplateParameterSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newDeploymentBuilder()
   */
  private DeploymentBuilder() {
  }

  /**
   * This method creates a new instance of the DeploymentBuilder.
   * @return new instance of the DeploymentBuilder
   */
  public static DeploymentBuilder newDeploymentBuilder() {
    return new DeploymentBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public DeploymentBuilder but() {
    DeploymentBuilder _builder = newDeploymentBuilder();
    _builder.m_featureClientSet = m_featureClientSet;
    _builder.m_client = m_client;
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureConfigurationSet = m_featureConfigurationSet;
    _builder.m_configuration = m_configuration;
    _builder.m_featureConfigurationBuilder = m_featureConfigurationBuilder;
    _builder.m_featureDeployedArtifactSet = m_featureDeployedArtifactSet;
    _builder.m_deployedArtifact = m_deployedArtifact;
    _builder.m_featureLocationSet = m_featureLocationSet;
    _builder.m_location = m_location;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwningTemplateParameterSet = m_featureOwningTemplateParameterSet;
    _builder.m_owningTemplateParameter = m_owningTemplateParameter;
    _builder.m_featureOwningTemplateParameterBuilder = m_featureOwningTemplateParameterBuilder;
    _builder.m_featureSupplierSet = m_featureSupplierSet;
    _builder.m_supplier = m_supplier;
    _builder.m_featureTemplateParameterSet = m_featureTemplateParameterSet;
    _builder.m_templateParameter = m_templateParameter;
    _builder.m_featureTemplateParameterBuilder = m_featureTemplateParameterBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Deployment type.
   * @return new instance of the org.eclipse.uml2.uml.Deployment type
   */
  public org.eclipse.uml2.uml.Deployment build() {
    final org.eclipse.uml2.uml.Deployment _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createDeployment();
    if (m_featureLocationSet) {
      _newInstance.setLocation(m_location);
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
    if (m_featureClientSet) {
      _newInstance.getClients().addAll(m_client);
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
    if (m_featureConfigurationSet) {
      _newInstance.getConfigurations().addAll(m_configuration);
    } else {
      if (!m_featureConfigurationBuilder.isEmpty()) {
        for (DeploymentSpecificationBuilder builder : m_featureConfigurationBuilder) {
          _newInstance.getConfigurations().add(builder.build());
        }
      }
    }
    if (m_featureDeployedArtifactSet) {
      _newInstance.getDeployedArtifacts().addAll(m_deployedArtifact);
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
    if (m_featureSupplierSet) {
      _newInstance.getSuppliers().addAll(m_supplier);
    }
    return _newInstance;
  }

  public DeploymentBuilder withLocation(org.eclipse.uml2.uml.DeploymentTarget p_location) {
    m_location = p_location;
    m_featureLocationSet = true;
    return this;
  }

  public DeploymentBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public DeploymentBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public DeploymentBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public DeploymentBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_owningTemplateParameter) {
    m_owningTemplateParameter = p_owningTemplateParameter;
    m_featureOwningTemplateParameterSet = true;
    return this;
  }

  public DeploymentBuilder withOwningTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureOwningTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public DeploymentBuilder withTemplateParameter(org.eclipse.uml2.uml.TemplateParameter p_templateParameter) {
    m_templateParameter = p_templateParameter;
    m_featureTemplateParameterSet = true;
    return this;
  }

  public DeploymentBuilder withTemplateParameter(org.eclipse.uml2.uml.util.builder.TemplateParameterBuilder p_templateParameterBuilder) {
    m_featureTemplateParameterBuilder = p_templateParameterBuilder;
    return this;
  }

  public DeploymentBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public DeploymentBuilder withClient(org.eclipse.uml2.uml.NamedElement p_client) {
    m_client.add(p_client);
    m_featureClientSet = true;
    return this;
  }

  public DeploymentBuilder withClient(java.util.Collection<? extends org.eclipse.uml2.uml.NamedElement> p_client) {
    m_client.addAll(p_client);
    m_featureClientSet = true;
    return this;
  }

  public DeploymentBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public DeploymentBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public DeploymentBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public DeploymentBuilder withConfiguration(org.eclipse.uml2.uml.DeploymentSpecification p_configuration) {
    m_configuration.add(p_configuration);
    m_featureConfigurationSet = true;
    return this;
  }

  public DeploymentBuilder withConfiguration(java.util.Collection<? extends org.eclipse.uml2.uml.DeploymentSpecification> p_configuration) {
    m_configuration.addAll(p_configuration);
    m_featureConfigurationSet = true;
    return this;
  }

  public DeploymentBuilder withConfiguration(DeploymentSpecificationBuilder p_deploymentSpecificationBuilder) {
    m_featureConfigurationBuilder.add(p_deploymentSpecificationBuilder);
    return this;
  }

  public DeploymentBuilder withDeployedArtifact(org.eclipse.uml2.uml.DeployedArtifact p_deployedArtifact) {
    m_deployedArtifact.add(p_deployedArtifact);
    m_featureDeployedArtifactSet = true;
    return this;
  }

  public DeploymentBuilder withDeployedArtifact(java.util.Collection<? extends org.eclipse.uml2.uml.DeployedArtifact> p_deployedArtifact) {
    m_deployedArtifact.addAll(p_deployedArtifact);
    m_featureDeployedArtifactSet = true;
    return this;
  }

  public DeploymentBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public DeploymentBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public DeploymentBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public DeploymentBuilder withSupplier(org.eclipse.uml2.uml.NamedElement p_supplier) {
    m_supplier.add(p_supplier);
    m_featureSupplierSet = true;
    return this;
  }

  public DeploymentBuilder withSupplier(java.util.Collection<? extends org.eclipse.uml2.uml.NamedElement> p_supplier) {
    m_supplier.addAll(p_supplier);
    m_featureSupplierSet = true;
    return this;
  }
}
