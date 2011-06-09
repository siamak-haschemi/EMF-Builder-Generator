package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Connector</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConnectorBuilder {
  // features and builders
  private Boolean m_isLeaf;
  private Boolean m_isStatic;
  private org.eclipse.uml2.uml.ConnectorKind m_kind;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.StringExpressionBuilder m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.Association m_type;
  private org.eclipse.uml2.uml.util.builder.AssociationBuilder m_featureTypeBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.DependencyBuilder> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.DependencyBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Behavior> m_contract = new java.util.LinkedList<org.eclipse.uml2.uml.Behavior>();
  private java.util.Collection<org.eclipse.uml2.uml.ConnectorEnd> m_end = new java.util.LinkedList<org.eclipse.uml2.uml.ConnectorEnd>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConnectorEndBuilder> m_featureEndBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConnectorEndBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Connector> m_redefinedConnector = new java.util.LinkedList<org.eclipse.uml2.uml.Connector>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.ConnectorBuilder> m_featureRedefinedConnectorBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.ConnectorBuilder>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureContractSet = false;
  private boolean m_featureEndSet = false;
  private boolean m_featureIsLeafSet = false;
  private boolean m_featureIsStaticSet = false;
  private boolean m_featureKindSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureRedefinedConnectorSet = false;
  private boolean m_featureTypeSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newConnectorBuilder()
   */
  private ConnectorBuilder() {
  }

  /**
   * This method creates a new instance of the ConnectorBuilder.
   * @return new instance of the ConnectorBuilder
   */
  public static ConnectorBuilder newConnectorBuilder() {
    return new ConnectorBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ConnectorBuilder but() {
    ConnectorBuilder _builder = newConnectorBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureContractSet = m_featureContractSet;
    _builder.m_contract = m_contract;
    _builder.m_featureEndSet = m_featureEndSet;
    _builder.m_end = m_end;
    _builder.m_featureEndBuilder = m_featureEndBuilder;
    _builder.m_featureIsLeafSet = m_featureIsLeafSet;
    _builder.m_isLeaf = m_isLeaf;
    _builder.m_featureIsStaticSet = m_featureIsStaticSet;
    _builder.m_isStatic = m_isStatic;
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
    _builder.m_featureRedefinedConnectorSet = m_featureRedefinedConnectorSet;
    _builder.m_redefinedConnector = m_redefinedConnector;
    _builder.m_featureRedefinedConnectorBuilder = m_featureRedefinedConnectorBuilder;
    _builder.m_featureTypeSet = m_featureTypeSet;
    _builder.m_type = m_type;
    _builder.m_featureTypeBuilder = m_featureTypeBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Connector type.
   * @return new instance of the org.eclipse.uml2.uml.Connector type
   */
  public org.eclipse.uml2.uml.Connector build() {
    final org.eclipse.uml2.uml.Connector _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createConnector();
    if (m_featureIsLeafSet) {
      _newInstance.setIsLeaf(m_isLeaf);
    }
    if (m_featureIsStaticSet) {
      _newInstance.setIsStatic(m_isStatic);
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
    if (m_featureTypeSet) {
      _newInstance.setType(m_type);
    } else {
      if (m_featureTypeBuilder != null) {
        _newInstance.setType(m_featureTypeBuilder.build());
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
    if (m_featureContractSet) {
      _newInstance.getContracts().addAll(m_contract);
    }
    if (m_featureEndSet) {
      _newInstance.getEnds().addAll(m_end);
    } else {
      if (!m_featureEndBuilder.isEmpty()) {
        for (ConnectorEndBuilder builder : m_featureEndBuilder) {
          _newInstance.getEnds().add(builder.build());
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
    if (m_featureRedefinedConnectorSet) {
      _newInstance.getRedefinedConnectors().addAll(m_redefinedConnector);
    } else {
      if (!m_featureRedefinedConnectorBuilder.isEmpty()) {
        for (ConnectorBuilder builder : m_featureRedefinedConnectorBuilder) {
          _newInstance.getRedefinedConnectors().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public ConnectorBuilder withIsLeaf(Boolean p_isLeaf) {
    m_isLeaf = p_isLeaf;
    m_featureIsLeafSet = true;
    return this;
  }

  public ConnectorBuilder withIsStatic(Boolean p_isStatic) {
    m_isStatic = p_isStatic;
    m_featureIsStaticSet = true;
    return this;
  }

  public ConnectorBuilder withKind(org.eclipse.uml2.uml.ConnectorKind p_kind) {
    m_kind = p_kind;
    m_featureKindSet = true;
    return this;
  }

  public ConnectorBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ConnectorBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ConnectorBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.StringExpressionBuilder p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ConnectorBuilder withType(org.eclipse.uml2.uml.Association p_type) {
    m_type = p_type;
    m_featureTypeSet = true;
    return this;
  }

  public ConnectorBuilder withType(org.eclipse.uml2.uml.util.builder.AssociationBuilder p_associationBuilder) {
    m_featureTypeBuilder = p_associationBuilder;
    return this;
  }

  public ConnectorBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ConnectorBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ConnectorBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ConnectorBuilder withClientDependency(DependencyBuilder p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ConnectorBuilder withContract(org.eclipse.uml2.uml.Behavior p_contract) {
    m_contract.add(p_contract);
    m_featureContractSet = true;
    return this;
  }

  public ConnectorBuilder withContract(java.util.Collection<? extends org.eclipse.uml2.uml.Behavior> p_contract) {
    m_contract.addAll(p_contract);
    m_featureContractSet = true;
    return this;
  }

  public ConnectorBuilder withEnd(org.eclipse.uml2.uml.ConnectorEnd p_end) {
    m_end.add(p_end);
    m_featureEndSet = true;
    return this;
  }

  public ConnectorBuilder withEnd(java.util.Collection<? extends org.eclipse.uml2.uml.ConnectorEnd> p_end) {
    m_end.addAll(p_end);
    m_featureEndSet = true;
    return this;
  }

  public ConnectorBuilder withEnd(ConnectorEndBuilder p_connectorEndBuilder) {
    m_featureEndBuilder.add(p_connectorEndBuilder);
    return this;
  }

  public ConnectorBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConnectorBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConnectorBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public ConnectorBuilder withRedefinedConnector(org.eclipse.uml2.uml.Connector p_redefinedConnector) {
    m_redefinedConnector.add(p_redefinedConnector);
    m_featureRedefinedConnectorSet = true;
    return this;
  }

  public ConnectorBuilder withRedefinedConnector(java.util.Collection<? extends org.eclipse.uml2.uml.Connector> p_redefinedConnector) {
    m_redefinedConnector.addAll(p_redefinedConnector);
    m_featureRedefinedConnectorSet = true;
    return this;
  }

  public ConnectorBuilder withRedefinedConnector(ConnectorBuilder p_connectorBuilder) {
    m_featureRedefinedConnectorBuilder.add(p_connectorBuilder);
    return this;
  }
}
