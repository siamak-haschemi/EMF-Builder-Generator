package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ConnectionPointReference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConnectionPointReferenceBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ConnectionPointReference> {
  // features and builders
  private org.eclipse.uml2.uml.Region m_container;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> m_featureContainerBuilder;
  private java.lang.String m_name;
  private org.eclipse.uml2.uml.StringExpression m_nameExpression;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> m_featureNameExpressionBuilder;
  private org.eclipse.uml2.uml.State m_state;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.State> m_featureStateBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Dependency> m_clientDependency = new java.util.LinkedList<org.eclipse.uml2.uml.Dependency>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>> m_featureClientDependencyBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Pseudostate> m_entry = new java.util.LinkedList<org.eclipse.uml2.uml.Pseudostate>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate>> m_featureEntryBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate>>();
  private java.util.Collection<org.eclipse.uml2.uml.Pseudostate> m_exit = new java.util.LinkedList<org.eclipse.uml2.uml.Pseudostate>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate>> m_featureExitBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureClientDependencySet = false;
  private boolean m_featureContainerSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEntrySet = false;
  private boolean m_featureExitSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNameExpressionSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureStateSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newConnectionPointReferenceBuilder()
   */
  private ConnectionPointReferenceBuilder() {
  }

  /**
   * This method creates a new instance of the ConnectionPointReferenceBuilder.
   * @return new instance of the ConnectionPointReferenceBuilder
   */
  public static ConnectionPointReferenceBuilder newConnectionPointReferenceBuilder() {
    return new ConnectionPointReferenceBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ConnectionPointReferenceBuilder but() {
    ConnectionPointReferenceBuilder _builder = newConnectionPointReferenceBuilder();
    _builder.m_featureClientDependencySet = m_featureClientDependencySet;
    _builder.m_clientDependency = m_clientDependency;
    _builder.m_featureClientDependencyBuilder = m_featureClientDependencyBuilder;
    _builder.m_featureContainerSet = m_featureContainerSet;
    _builder.m_container = m_container;
    _builder.m_featureContainerBuilder = m_featureContainerBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEntrySet = m_featureEntrySet;
    _builder.m_entry = m_entry;
    _builder.m_featureEntryBuilder = m_featureEntryBuilder;
    _builder.m_featureExitSet = m_featureExitSet;
    _builder.m_exit = m_exit;
    _builder.m_featureExitBuilder = m_featureExitBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNameExpressionSet = m_featureNameExpressionSet;
    _builder.m_nameExpression = m_nameExpression;
    _builder.m_featureNameExpressionBuilder = m_featureNameExpressionBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureStateSet = m_featureStateSet;
    _builder.m_state = m_state;
    _builder.m_featureStateBuilder = m_featureStateBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ConnectionPointReference type.
   * @return new instance of the org.eclipse.uml2.uml.ConnectionPointReference type
   */
  public org.eclipse.uml2.uml.ConnectionPointReference build() {
    final org.eclipse.uml2.uml.ConnectionPointReference _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createConnectionPointReference();
    if (m_featureContainerSet) {
      _newInstance.setContainer(m_container);
    } else {
      if (m_featureContainerBuilder != null) {
        _newInstance.setContainer(m_featureContainerBuilder.build());
      }
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
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    if (m_featureEntrySet) {
      _newInstance.getEntries().addAll(m_entry);
    } else {
      if (!m_featureEntryBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate> builder : m_featureEntryBuilder) {
          _newInstance.getEntries().add(builder.build());
        }
      }
    }
    if (m_featureExitSet) {
      _newInstance.getExits().addAll(m_exit);
    } else {
      if (!m_featureExitBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate> builder : m_featureExitBuilder) {
          _newInstance.getExits().add(builder.build());
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
    return _newInstance;
  }

  public ConnectionPointReferenceBuilder withContainer(org.eclipse.uml2.uml.Region p_container) {
    m_container = p_container;
    m_featureContainerSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withContainer(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Region> p_regionBuilder) {
    m_featureContainerBuilder = p_regionBuilder;
    return this;
  }

  public ConnectionPointReferenceBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withNameExpression(org.eclipse.uml2.uml.StringExpression p_nameExpression) {
    m_nameExpression = p_nameExpression;
    m_featureNameExpressionSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withNameExpression(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StringExpression> p_stringExpressionBuilder) {
    m_featureNameExpressionBuilder = p_stringExpressionBuilder;
    return this;
  }

  public ConnectionPointReferenceBuilder withState(org.eclipse.uml2.uml.State p_state) {
    m_state = p_state;
    m_featureStateSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withState(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.State> p_stateBuilder) {
    m_featureStateBuilder = p_stateBuilder;
    return this;
  }

  public ConnectionPointReferenceBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withClientDependency(org.eclipse.uml2.uml.Dependency p_clientDependency) {
    m_clientDependency.add(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withClientDependency(java.util.Collection<? extends org.eclipse.uml2.uml.Dependency> p_clientDependency) {
    m_clientDependency.addAll(p_clientDependency);
    m_featureClientDependencySet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withClientDependency(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Dependency> p_dependencyBuilder) {
    m_featureClientDependencyBuilder.add(p_dependencyBuilder);
    return this;
  }

  public ConnectionPointReferenceBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ConnectionPointReferenceBuilder withEntry(org.eclipse.uml2.uml.Pseudostate p_entry) {
    m_entry.add(p_entry);
    m_featureEntrySet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withEntry(java.util.Collection<? extends org.eclipse.uml2.uml.Pseudostate> p_entry) {
    m_entry.addAll(p_entry);
    m_featureEntrySet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withEntry(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate> p_pseudostateBuilder) {
    m_featureEntryBuilder.add(p_pseudostateBuilder);
    return this;
  }

  public ConnectionPointReferenceBuilder withExit(org.eclipse.uml2.uml.Pseudostate p_exit) {
    m_exit.add(p_exit);
    m_featureExitSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withExit(java.util.Collection<? extends org.eclipse.uml2.uml.Pseudostate> p_exit) {
    m_exit.addAll(p_exit);
    m_featureExitSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withExit(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Pseudostate> p_pseudostateBuilder) {
    m_featureExitBuilder.add(p_pseudostateBuilder);
    return this;
  }

  public ConnectionPointReferenceBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ConnectionPointReferenceBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
