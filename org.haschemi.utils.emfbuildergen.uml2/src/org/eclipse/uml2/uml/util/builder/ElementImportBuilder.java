package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ElementImport</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ElementImportBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.ElementImport> {
  // features and builders
  private java.lang.String m_alias;
  private org.eclipse.uml2.uml.PackageableElement m_importedElement;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageableElement> m_featureImportedElementBuilder;
  private org.eclipse.uml2.uml.Namespace m_importingNamespace;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Namespace> m_featureImportingNamespaceBuilder;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureAliasSet = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureImportedElementSet = false;
  private boolean m_featureImportingNamespaceSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newElementImportBuilder()
   */
  private ElementImportBuilder() {
  }

  /**
   * This method creates a new instance of the ElementImportBuilder.
   * @return new instance of the ElementImportBuilder
   */
  public static ElementImportBuilder newElementImportBuilder() {
    return new ElementImportBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ElementImportBuilder but() {
    ElementImportBuilder _builder = newElementImportBuilder();
    _builder.m_featureAliasSet = m_featureAliasSet;
    _builder.m_alias = m_alias;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureImportedElementSet = m_featureImportedElementSet;
    _builder.m_importedElement = m_importedElement;
    _builder.m_featureImportedElementBuilder = m_featureImportedElementBuilder;
    _builder.m_featureImportingNamespaceSet = m_featureImportingNamespaceSet;
    _builder.m_importingNamespace = m_importingNamespace;
    _builder.m_featureImportingNamespaceBuilder = m_featureImportingNamespaceBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ElementImport type.
   * @return new instance of the org.eclipse.uml2.uml.ElementImport type
   */
  public org.eclipse.uml2.uml.ElementImport build() {
    final org.eclipse.uml2.uml.ElementImport _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createElementImport();
    if (m_featureAliasSet) {
      _newInstance.setAlias(m_alias);
    }
    if (m_featureImportedElementSet) {
      _newInstance.setImportedElement(m_importedElement);
    } else {
      if (m_featureImportedElementBuilder != null) {
        _newInstance.setImportedElement(m_featureImportedElementBuilder.build());
      }
    }
    if (m_featureImportingNamespaceSet) {
      _newInstance.setImportingNamespace(m_importingNamespace);
    } else {
      if (m_featureImportingNamespaceBuilder != null) {
        _newInstance.setImportingNamespace(m_featureImportingNamespaceBuilder.build());
      }
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
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

  public ElementImportBuilder withAlias(java.lang.String p_alias) {
    m_alias = p_alias;
    m_featureAliasSet = true;
    return this;
  }

  public ElementImportBuilder withImportedElement(org.eclipse.uml2.uml.PackageableElement p_importedElement) {
    m_importedElement = p_importedElement;
    m_featureImportedElementSet = true;
    return this;
  }

  public ElementImportBuilder withImportedElement(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.PackageableElement> p_packageableElementBuilder) {
    m_featureImportedElementBuilder = p_packageableElementBuilder;
    return this;
  }

  public ElementImportBuilder withImportingNamespace(org.eclipse.uml2.uml.Namespace p_importingNamespace) {
    m_importingNamespace = p_importingNamespace;
    m_featureImportingNamespaceSet = true;
    return this;
  }

  public ElementImportBuilder withImportingNamespace(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Namespace> p_namespaceBuilder) {
    m_featureImportingNamespaceBuilder = p_namespaceBuilder;
    return this;
  }

  public ElementImportBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public ElementImportBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ElementImportBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public ElementImportBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public ElementImportBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ElementImportBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ElementImportBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
