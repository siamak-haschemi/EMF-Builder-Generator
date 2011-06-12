package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ProtocolConformance</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProtocolConformanceBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ProtocolConformance> {
  // features and builders
  private org.eclipse.uml2.uml.ProtocolStateMachine m_generalMachine;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ProtocolStateMachine> m_featureGeneralMachineBuilder;
  private org.eclipse.uml2.uml.ProtocolStateMachine m_specificMachine;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ProtocolStateMachine> m_featureSpecificMachineBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureGeneralMachineSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureSpecificMachineSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newProtocolConformanceBuilder()
   */
  private ProtocolConformanceBuilder() {
  }

  /**
   * This method creates a new instance of the ProtocolConformanceBuilder.
   * @return new instance of the ProtocolConformanceBuilder
   */
  public static ProtocolConformanceBuilder newProtocolConformanceBuilder() {
    return new ProtocolConformanceBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ProtocolConformanceBuilder but() {
    ProtocolConformanceBuilder _builder = newProtocolConformanceBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureGeneralMachineSet = m_featureGeneralMachineSet;
    _builder.m_generalMachine = m_generalMachine;
    _builder.m_featureGeneralMachineBuilder = m_featureGeneralMachineBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureSpecificMachineSet = m_featureSpecificMachineSet;
    _builder.m_specificMachine = m_specificMachine;
    _builder.m_featureSpecificMachineBuilder = m_featureSpecificMachineBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ProtocolConformance type.
   * @return new instance of the org.eclipse.uml2.uml.ProtocolConformance type
   */
  public org.eclipse.uml2.uml.ProtocolConformance build() {
    final org.eclipse.uml2.uml.ProtocolConformance _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createProtocolConformance();
    if (m_featureGeneralMachineSet) {
      _newInstance.setGeneralMachine(m_generalMachine);
    } else {
      if (m_featureGeneralMachineBuilder != null) {
        _newInstance.setGeneralMachine(m_featureGeneralMachineBuilder.build());
      }
    }
    if (m_featureSpecificMachineSet) {
      _newInstance.setSpecificMachine(m_specificMachine);
    } else {
      if (m_featureSpecificMachineBuilder != null) {
        _newInstance.setSpecificMachine(m_featureSpecificMachineBuilder.build());
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

  public ProtocolConformanceBuilder withGeneralMachine(org.eclipse.uml2.uml.ProtocolStateMachine p_generalMachine) {
    m_generalMachine = p_generalMachine;
    m_featureGeneralMachineSet = true;
    return this;
  }

  public ProtocolConformanceBuilder withGeneralMachine(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ProtocolStateMachine> p_protocolStateMachineBuilder) {
    m_featureGeneralMachineBuilder = p_protocolStateMachineBuilder;
    return this;
  }

  public ProtocolConformanceBuilder withSpecificMachine(org.eclipse.uml2.uml.ProtocolStateMachine p_specificMachine) {
    m_specificMachine = p_specificMachine;
    m_featureSpecificMachineSet = true;
    return this;
  }

  public ProtocolConformanceBuilder withSpecificMachine(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ProtocolStateMachine> p_protocolStateMachineBuilder) {
    m_featureSpecificMachineBuilder = p_protocolStateMachineBuilder;
    return this;
  }

  public ProtocolConformanceBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ProtocolConformanceBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ProtocolConformanceBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ProtocolConformanceBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ProtocolConformanceBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ProtocolConformanceBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
