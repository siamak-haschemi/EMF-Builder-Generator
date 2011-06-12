package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EAnnotation</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EAnnotationBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EAnnotation> {
  // features and builders
  private org.eclipse.emf.ecore.EModelElement m_eModelElement;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EModelElement> m_featureEModelElementBuilder;
  private java.lang.String m_source;
  private java.util.Collection<org.eclipse.emf.ecore.EObject> m_contents = new java.util.LinkedList<org.eclipse.emf.ecore.EObject>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EObject>> m_featureContentsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EObject>>();
  private java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>> m_details = new java.util.LinkedList<java.util.Map.Entry<java.lang.String, java.lang.String>>();
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.emf.ecore.EObject> m_references = new java.util.LinkedList<org.eclipse.emf.ecore.EObject>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EObject>> m_featureReferencesBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EObject>>();
  // helper attributes
  private boolean m_featureContentsSet = false;
  private boolean m_featureDetailsSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEModelElementSet = false;
  private boolean m_featureReferencesSet = false;
  private boolean m_featureSourceSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEAnnotationBuilder()
   */
  private EAnnotationBuilder() {
  }

  /**
   * This method creates a new instance of the EAnnotationBuilder.
   * @return new instance of the EAnnotationBuilder
   */
  public static EAnnotationBuilder newEAnnotationBuilder() {
    return new EAnnotationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EAnnotationBuilder but() {
    EAnnotationBuilder _builder = newEAnnotationBuilder();
    _builder.m_featureContentsSet = m_featureContentsSet;
    _builder.m_contents = m_contents;
    _builder.m_featureContentsBuilder = m_featureContentsBuilder;
    _builder.m_featureDetailsSet = m_featureDetailsSet;
    _builder.m_details = m_details;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEModelElementSet = m_featureEModelElementSet;
    _builder.m_eModelElement = m_eModelElement;
    _builder.m_featureEModelElementBuilder = m_featureEModelElementBuilder;
    _builder.m_featureReferencesSet = m_featureReferencesSet;
    _builder.m_references = m_references;
    _builder.m_featureReferencesBuilder = m_featureReferencesBuilder;
    _builder.m_featureSourceSet = m_featureSourceSet;
    _builder.m_source = m_source;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EAnnotation type.
   * @return new instance of the org.eclipse.emf.ecore.EAnnotation type
   */
  public org.eclipse.emf.ecore.EAnnotation build() {
    final org.eclipse.emf.ecore.EAnnotation _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAnnotation();
    if (m_featureEModelElementSet) {
      _newInstance.setEModelElement(m_eModelElement);
    } else {
      if (m_featureEModelElementBuilder != null) {
        _newInstance.setEModelElement(m_featureEModelElementBuilder.build());
      }
    }
    if (m_featureSourceSet) {
      _newInstance.setSource(m_source);
    }
    if (m_featureContentsSet) {
      _newInstance.getContents().addAll(m_contents);
    } else {
      if (!m_featureContentsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EObject> builder : m_featureContentsBuilder) {
          _newInstance.getContents().add(builder.build());
        }
      }
    }
    if (m_featureDetailsSet) {
      _newInstance.getDetails().addAll(m_details);
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
    if (m_featureReferencesSet) {
      _newInstance.getReferences().addAll(m_references);
    } else {
      if (!m_featureReferencesBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EObject> builder : m_featureReferencesBuilder) {
          _newInstance.getReferences().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public EAnnotationBuilder withEModelElement(org.eclipse.emf.ecore.EModelElement p_eModelElement) {
    m_eModelElement = p_eModelElement;
    m_featureEModelElementSet = true;
    return this;
  }

  public EAnnotationBuilder withEModelElement(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EModelElement> p_eModelElementBuilder) {
    m_featureEModelElementBuilder = p_eModelElementBuilder;
    return this;
  }

  public EAnnotationBuilder withSource(java.lang.String p_source) {
    m_source = p_source;
    m_featureSourceSet = true;
    return this;
  }

  public EAnnotationBuilder withContents(org.eclipse.emf.ecore.EObject p_contents) {
    m_contents.add(p_contents);
    m_featureContentsSet = true;
    return this;
  }

  public EAnnotationBuilder withContents(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> p_contents) {
    m_contents.addAll(p_contents);
    m_featureContentsSet = true;
    return this;
  }

  public EAnnotationBuilder withContents(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EObject> p_eObjectBuilder) {
    m_featureContentsBuilder.add(p_eObjectBuilder);
    return this;
  }

  public EAnnotationBuilder withDetails(java.util.Map.Entry<java.lang.String, java.lang.String> p_details) {
    m_details.add(p_details);
    m_featureDetailsSet = true;
    return this;
  }

  public EAnnotationBuilder withDetails(java.util.Collection<? extends java.util.Map.Entry<java.lang.String, java.lang.String>> p_details) {
    m_details.addAll(p_details);
    m_featureDetailsSet = true;
    return this;
  }

  public EAnnotationBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EAnnotationBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EAnnotationBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public EAnnotationBuilder withReferences(org.eclipse.emf.ecore.EObject p_references) {
    m_references.add(p_references);
    m_featureReferencesSet = true;
    return this;
  }

  public EAnnotationBuilder withReferences(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> p_references) {
    m_references.addAll(p_references);
    m_featureReferencesSet = true;
    return this;
  }

  public EAnnotationBuilder withReferences(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EObject> p_eObjectBuilder) {
    m_featureReferencesBuilder.add(p_eObjectBuilder);
    return this;
  }
}
