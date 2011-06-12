package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Slot</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class SlotBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.Slot> {
  // features and builders
  private org.eclipse.uml2.uml.StructuralFeature m_definingFeature;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StructuralFeature> m_featureDefiningFeatureBuilder;
  private org.eclipse.uml2.uml.InstanceSpecification m_owningInstance;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InstanceSpecification> m_featureOwningInstanceBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  private java.util.Collection<org.eclipse.uml2.uml.ValueSpecification> m_value = new java.util.LinkedList<org.eclipse.uml2.uml.ValueSpecification>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification>> m_featureValueBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification>>();
  // helper attributes
  private boolean m_featureDefiningFeatureSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwningInstanceSet = false;
  private boolean m_featureValueSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newSlotBuilder()
   */
  private SlotBuilder() {
  }

  /**
   * This method creates a new instance of the SlotBuilder.
   * @return new instance of the SlotBuilder
   */
  public static SlotBuilder newSlotBuilder() {
    return new SlotBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public SlotBuilder but() {
    SlotBuilder _builder = newSlotBuilder();
    _builder.m_featureDefiningFeatureSet = m_featureDefiningFeatureSet;
    _builder.m_definingFeature = m_definingFeature;
    _builder.m_featureDefiningFeatureBuilder = m_featureDefiningFeatureBuilder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwningInstanceSet = m_featureOwningInstanceSet;
    _builder.m_owningInstance = m_owningInstance;
    _builder.m_featureOwningInstanceBuilder = m_featureOwningInstanceBuilder;
    _builder.m_featureValueSet = m_featureValueSet;
    _builder.m_value = m_value;
    _builder.m_featureValueBuilder = m_featureValueBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Slot type.
   * @return new instance of the org.eclipse.uml2.uml.Slot type
   */
  public org.eclipse.uml2.uml.Slot build() {
    final org.eclipse.uml2.uml.Slot _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createSlot();
    if (m_featureDefiningFeatureSet) {
      _newInstance.setDefiningFeature(m_definingFeature);
    } else {
      if (m_featureDefiningFeatureBuilder != null) {
        _newInstance.setDefiningFeature(m_featureDefiningFeatureBuilder.build());
      }
    }
    if (m_featureOwningInstanceSet) {
      _newInstance.setOwningInstance(m_owningInstance);
    } else {
      if (m_featureOwningInstanceBuilder != null) {
        _newInstance.setOwningInstance(m_featureOwningInstanceBuilder.build());
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
    if (m_featureValueSet) {
      _newInstance.getValues().addAll(m_value);
    } else {
      if (!m_featureValueBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> builder : m_featureValueBuilder) {
          _newInstance.getValues().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public SlotBuilder withDefiningFeature(org.eclipse.uml2.uml.StructuralFeature p_definingFeature) {
    m_definingFeature = p_definingFeature;
    m_featureDefiningFeatureSet = true;
    return this;
  }

  public SlotBuilder withDefiningFeature(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.StructuralFeature> p_structuralFeatureBuilder) {
    m_featureDefiningFeatureBuilder = p_structuralFeatureBuilder;
    return this;
  }

  public SlotBuilder withOwningInstance(org.eclipse.uml2.uml.InstanceSpecification p_owningInstance) {
    m_owningInstance = p_owningInstance;
    m_featureOwningInstanceSet = true;
    return this;
  }

  public SlotBuilder withOwningInstance(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.InstanceSpecification> p_instanceSpecificationBuilder) {
    m_featureOwningInstanceBuilder = p_instanceSpecificationBuilder;
    return this;
  }

  public SlotBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public SlotBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public SlotBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public SlotBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public SlotBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public SlotBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public SlotBuilder withValue(org.eclipse.uml2.uml.ValueSpecification p_value) {
    m_value.add(p_value);
    m_featureValueSet = true;
    return this;
  }

  public SlotBuilder withValue(java.util.Collection<? extends org.eclipse.uml2.uml.ValueSpecification> p_value) {
    m_value.addAll(p_value);
    m_featureValueSet = true;
    return this;
  }

  public SlotBuilder withValue(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ValueSpecification> p_valueSpecificationBuilder) {
    m_featureValueBuilder.add(p_valueSpecificationBuilder);
    return this;
  }
}
