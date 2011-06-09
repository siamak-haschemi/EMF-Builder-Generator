package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.PackageImport</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class PackageImportBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Package m_importedPackage;
  private org.eclipse.uml2.uml.util.builder.PackageBuilder m_featureImportedPackageBuilder;
  private org.eclipse.uml2.uml.Namespace m_importingNamespace;
  private org.eclipse.uml2.uml.VisibilityKind m_visibility;
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureImportedPackageSet = false;
  private boolean m_featureImportingNamespaceSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureVisibilitySet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newPackageImportBuilder()
   */
  private PackageImportBuilder() {
  }

  /**
   * This method creates a new instance of the PackageImportBuilder.
   * @return new instance of the PackageImportBuilder
   */
  public static PackageImportBuilder newPackageImportBuilder() {
    return new PackageImportBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public PackageImportBuilder but() {
    PackageImportBuilder _builder = newPackageImportBuilder();
    _builder.m_featureImportedPackageSet = m_featureImportedPackageSet;
    _builder.m_importedPackage = m_importedPackage;
    _builder.m_featureImportedPackageBuilder = m_featureImportedPackageBuilder;
    _builder.m_featureImportingNamespaceSet = m_featureImportingNamespaceSet;
    _builder.m_importingNamespace = m_importingNamespace;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureVisibilitySet = m_featureVisibilitySet;
    _builder.m_visibility = m_visibility;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.PackageImport type.
   * @return new instance of the org.eclipse.uml2.uml.PackageImport type
   */
  public org.eclipse.uml2.uml.PackageImport build() {
    final org.eclipse.uml2.uml.PackageImport _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createPackageImport();
    if (m_featureImportedPackageSet) {
      _newInstance.setImportedPackage(m_importedPackage);
    } else {
      if (m_featureImportedPackageBuilder != null) {
        _newInstance.setImportedPackage(m_featureImportedPackageBuilder.build());
      }
    }
    if (m_featureImportingNamespaceSet) {
      _newInstance.setImportingNamespace(m_importingNamespace);
    }
    if (m_featureVisibilitySet) {
      _newInstance.setVisibility(m_visibility);
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

  public PackageImportBuilder withImportedPackage(org.eclipse.uml2.uml.Package p_importedPackage) {
    m_importedPackage = p_importedPackage;
    m_featureImportedPackageSet = true;
    return this;
  }

  public PackageImportBuilder withImportedPackage(org.eclipse.uml2.uml.util.builder.PackageBuilder p_packageBuilder) {
    m_featureImportedPackageBuilder = p_packageBuilder;
    return this;
  }

  public PackageImportBuilder withImportingNamespace(org.eclipse.uml2.uml.Namespace p_importingNamespace) {
    m_importingNamespace = p_importingNamespace;
    m_featureImportingNamespaceSet = true;
    return this;
  }

  public PackageImportBuilder withVisibility(org.eclipse.uml2.uml.VisibilityKind p_visibility) {
    m_visibility = p_visibility;
    m_featureVisibilitySet = true;
    return this;
  }

  public PackageImportBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public PackageImportBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public PackageImportBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
