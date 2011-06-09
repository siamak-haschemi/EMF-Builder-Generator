package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.Generalization</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class GeneralizationBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Classifier m_general;
  private Boolean m_isSubstitutable;
  private org.eclipse.uml2.uml.Classifier m_specific;
  private java.util.Collection<org.eclipse.uml2.uml.GeneralizationSet> m_generalizationSet = new java.util.LinkedList<org.eclipse.uml2.uml.GeneralizationSet>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.GeneralizationSetBuilder> m_featureGeneralizationSetBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.GeneralizationSetBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureGeneralSet = false;
  private boolean m_featureGeneralizationSetSet = false;
  private boolean m_featureIsSubstitutableSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureSpecificSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newGeneralizationBuilder()
   */
  private GeneralizationBuilder() {
  }

  /**
   * This method creates a new instance of the GeneralizationBuilder.
   * @return new instance of the GeneralizationBuilder
   */
  public static GeneralizationBuilder newGeneralizationBuilder() {
    return new GeneralizationBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public GeneralizationBuilder but() {
    GeneralizationBuilder _builder = newGeneralizationBuilder();
    _builder.m_featureGeneralSet = m_featureGeneralSet;
    _builder.m_general = m_general;
    _builder.m_featureGeneralizationSetSet = m_featureGeneralizationSetSet;
    _builder.m_generalizationSet = m_generalizationSet;
    _builder.m_featureGeneralizationSetBuilder = m_featureGeneralizationSetBuilder;
    _builder.m_featureIsSubstitutableSet = m_featureIsSubstitutableSet;
    _builder.m_isSubstitutable = m_isSubstitutable;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureSpecificSet = m_featureSpecificSet;
    _builder.m_specific = m_specific;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.Generalization type.
   * @return new instance of the org.eclipse.uml2.uml.Generalization type
   */
  public org.eclipse.uml2.uml.Generalization build() {
    final org.eclipse.uml2.uml.Generalization _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createGeneralization();
    if (m_featureGeneralSet) {
      _newInstance.setGeneral(m_general);
    }
    if (m_featureIsSubstitutableSet) {
      _newInstance.setIsSubstitutable(m_isSubstitutable);
    }
    if (m_featureSpecificSet) {
      _newInstance.setSpecific(m_specific);
    }
    if (m_featureGeneralizationSetSet) {
      _newInstance.getGeneralizationSets().addAll(m_generalizationSet);
    } else {
      if (!m_featureGeneralizationSetBuilder.isEmpty()) {
        for (GeneralizationSetBuilder builder : m_featureGeneralizationSetBuilder) {
          _newInstance.getGeneralizationSets().add(builder.build());
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
    return _newInstance;
  }

  public GeneralizationBuilder withGeneral(org.eclipse.uml2.uml.Classifier p_general) {
    m_general = p_general;
    m_featureGeneralSet = true;
    return this;
  }

  public GeneralizationBuilder withIsSubstitutable(Boolean p_isSubstitutable) {
    m_isSubstitutable = p_isSubstitutable;
    m_featureIsSubstitutableSet = true;
    return this;
  }

  public GeneralizationBuilder withSpecific(org.eclipse.uml2.uml.Classifier p_specific) {
    m_specific = p_specific;
    m_featureSpecificSet = true;
    return this;
  }

  public GeneralizationBuilder withGeneralizationSet(org.eclipse.uml2.uml.GeneralizationSet p_generalizationSet) {
    m_generalizationSet.add(p_generalizationSet);
    m_featureGeneralizationSetSet = true;
    return this;
  }

  public GeneralizationBuilder withGeneralizationSet(java.util.Collection<? extends org.eclipse.uml2.uml.GeneralizationSet> p_generalizationSet) {
    m_generalizationSet.addAll(p_generalizationSet);
    m_featureGeneralizationSetSet = true;
    return this;
  }

  public GeneralizationBuilder withGeneralizationSet(GeneralizationSetBuilder p_generalizationSetBuilder) {
    m_featureGeneralizationSetBuilder.add(p_generalizationSetBuilder);
    return this;
  }

  public GeneralizationBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public GeneralizationBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public GeneralizationBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
