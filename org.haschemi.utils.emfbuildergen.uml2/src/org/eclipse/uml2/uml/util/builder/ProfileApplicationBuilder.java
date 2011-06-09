package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.ProfileApplication</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ProfileApplicationBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Profile m_appliedProfile;
  private org.eclipse.uml2.uml.util.builder.ProfileBuilder m_featureAppliedProfileBuilder;
  private org.eclipse.uml2.uml.Package m_applyingPackage;
  private org.eclipse.uml2.uml.util.builder.PackageBuilder m_featureApplyingPackageBuilder;
  private Boolean m_isStrict;
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureAppliedProfileSet = false;
  private boolean m_featureApplyingPackageSet = false;
  private boolean m_featureIsStrictSet = false;
  private boolean m_featureOwnedCommentSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newProfileApplicationBuilder()
   */
  private ProfileApplicationBuilder() {
  }

  /**
   * This method creates a new instance of the ProfileApplicationBuilder.
   * @return new instance of the ProfileApplicationBuilder
   */
  public static ProfileApplicationBuilder newProfileApplicationBuilder() {
    return new ProfileApplicationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public ProfileApplicationBuilder but() {
    ProfileApplicationBuilder _builder = newProfileApplicationBuilder();
    _builder.m_featureAppliedProfileSet = m_featureAppliedProfileSet;
    _builder.m_appliedProfile = m_appliedProfile;
    _builder.m_featureAppliedProfileBuilder = m_featureAppliedProfileBuilder;
    _builder.m_featureApplyingPackageSet = m_featureApplyingPackageSet;
    _builder.m_applyingPackage = m_applyingPackage;
    _builder.m_featureApplyingPackageBuilder = m_featureApplyingPackageBuilder;
    _builder.m_featureIsStrictSet = m_featureIsStrictSet;
    _builder.m_isStrict = m_isStrict;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.ProfileApplication type.
   * @return new instance of the org.eclipse.uml2.uml.ProfileApplication type
   */
  public org.eclipse.uml2.uml.ProfileApplication build() {
    final org.eclipse.uml2.uml.ProfileApplication _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createProfileApplication();
    if (m_featureAppliedProfileSet) {
      _newInstance.setAppliedProfile(m_appliedProfile);
    } else {
      if (m_featureAppliedProfileBuilder != null) {
        _newInstance.setAppliedProfile(m_featureAppliedProfileBuilder.build());
      }
    }
    if (m_featureApplyingPackageSet) {
      _newInstance.setApplyingPackage(m_applyingPackage);
    } else {
      if (m_featureApplyingPackageBuilder != null) {
        _newInstance.setApplyingPackage(m_featureApplyingPackageBuilder.build());
      }
    }
    if (m_featureIsStrictSet) {
      _newInstance.setIsStrict(m_isStrict);
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

  public ProfileApplicationBuilder withAppliedProfile(org.eclipse.uml2.uml.Profile p_appliedProfile) {
    m_appliedProfile = p_appliedProfile;
    m_featureAppliedProfileSet = true;
    return this;
  }

  public ProfileApplicationBuilder withAppliedProfile(org.eclipse.uml2.uml.util.builder.ProfileBuilder p_profileBuilder) {
    m_featureAppliedProfileBuilder = p_profileBuilder;
    return this;
  }

  public ProfileApplicationBuilder withApplyingPackage(org.eclipse.uml2.uml.Package p_applyingPackage) {
    m_applyingPackage = p_applyingPackage;
    m_featureApplyingPackageSet = true;
    return this;
  }

  public ProfileApplicationBuilder withApplyingPackage(org.eclipse.uml2.uml.util.builder.PackageBuilder p_packageBuilder) {
    m_featureApplyingPackageBuilder = p_packageBuilder;
    return this;
  }

  public ProfileApplicationBuilder withIsStrict(Boolean p_isStrict) {
    m_isStrict = p_isStrict;
    m_featureIsStrictSet = true;
    return this;
  }

  public ProfileApplicationBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ProfileApplicationBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public ProfileApplicationBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
