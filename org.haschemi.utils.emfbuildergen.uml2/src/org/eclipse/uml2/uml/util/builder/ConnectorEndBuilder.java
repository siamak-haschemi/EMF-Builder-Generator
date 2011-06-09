package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ConnectorEnd</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConnectorEndBuilder {
  // features and builders
  private Boolean m_isOrdered;
  private Boolean m_isUnique;
  private org.eclipse.uml2.uml.ValueSpecification m_lowerValue;
  private org.eclipse.uml2.uml.Property m_partWithPort;
  private org.eclipse.uml2.uml.util.builder.PropertyBuilder m_featurePartWithPortBuilder;
  private org.eclipse.uml2.uml.ConnectableElement m_role;
  private org.eclipse.uml2.uml.ValueSpecification m_upperValue;
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureIsOrderedSet = false;
  private boolean m_featureIsUniqueSet = false;
  private boolean m_featureLowerValueSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featurePartWithPortSet = false;
  private boolean m_featureRoleSet = false;
  private boolean m_featureUpperValueSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newConnectorEndBuilder()
   */
  private ConnectorEndBuilder() {
  }

  /**
   * This method creates a new instance of the ConnectorEndBuilder.
   * @return new instance of the ConnectorEndBuilder
   */
  public static ConnectorEndBuilder newConnectorEndBuilder() {
    return new ConnectorEndBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ConnectorEndBuilder but() {
    ConnectorEndBuilder _builder = newConnectorEndBuilder();
    _builder.m_featureIsOrderedSet = m_featureIsOrderedSet;
    _builder.m_isOrdered = m_isOrdered;
    _builder.m_featureIsUniqueSet = m_featureIsUniqueSet;
    _builder.m_isUnique = m_isUnique;
    _builder.m_featureLowerValueSet = m_featureLowerValueSet;
    _builder.m_lowerValue = m_lowerValue;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featurePartWithPortSet = m_featurePartWithPortSet;
    _builder.m_partWithPort = m_partWithPort;
    _builder.m_featurePartWithPortBuilder = m_featurePartWithPortBuilder;
    _builder.m_featureRoleSet = m_featureRoleSet;
    _builder.m_role = m_role;
    _builder.m_featureUpperValueSet = m_featureUpperValueSet;
    _builder.m_upperValue = m_upperValue;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ConnectorEnd type.
   * @return new instance of the org.eclipse.uml2.uml.ConnectorEnd type
   */
  public org.eclipse.uml2.uml.ConnectorEnd build() {
    final org.eclipse.uml2.uml.ConnectorEnd _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createConnectorEnd();
    if (m_featureIsOrderedSet) {
      _newInstance.setIsOrdered(m_isOrdered);
    }
    if (m_featureIsUniqueSet) {
      _newInstance.setIsUnique(m_isUnique);
    }
    if (m_featureLowerValueSet) {
      _newInstance.setLowerValue(m_lowerValue);
    }
    if (m_featurePartWithPortSet) {
      _newInstance.setPartWithPort(m_partWithPort);
    } else {
      if (m_featurePartWithPortBuilder != null) {
        _newInstance.setPartWithPort(m_featurePartWithPortBuilder.build());
      }
    }
    if (m_featureRoleSet) {
      _newInstance.setRole(m_role);
    }
    if (m_featureUpperValueSet) {
      _newInstance.setUpperValue(m_upperValue);
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
    return _newInstance;
  }

  public ConnectorEndBuilder withIsOrdered(Boolean p_isOrdered) {
    m_isOrdered = p_isOrdered;
    m_featureIsOrderedSet = true;
    return this;
  }

  public ConnectorEndBuilder withIsUnique(Boolean p_isUnique) {
    m_isUnique = p_isUnique;
    m_featureIsUniqueSet = true;
    return this;
  }

  public ConnectorEndBuilder withLowerValue(org.eclipse.uml2.uml.ValueSpecification p_lowerValue) {
    m_lowerValue = p_lowerValue;
    m_featureLowerValueSet = true;
    return this;
  }

  public ConnectorEndBuilder withPartWithPort(org.eclipse.uml2.uml.Property p_partWithPort) {
    m_partWithPort = p_partWithPort;
    m_featurePartWithPortSet = true;
    return this;
  }

  public ConnectorEndBuilder withPartWithPort(org.eclipse.uml2.uml.util.builder.PropertyBuilder p_propertyBuilder) {
    m_featurePartWithPortBuilder = p_propertyBuilder;
    return this;
  }

  public ConnectorEndBuilder withRole(org.eclipse.uml2.uml.ConnectableElement p_role) {
    m_role = p_role;
    m_featureRoleSet = true;
    return this;
  }

  public ConnectorEndBuilder withUpperValue(org.eclipse.uml2.uml.ValueSpecification p_upperValue) {
    m_upperValue = p_upperValue;
    m_featureUpperValueSet = true;
    return this;
  }

  public ConnectorEndBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConnectorEndBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConnectorEndBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
