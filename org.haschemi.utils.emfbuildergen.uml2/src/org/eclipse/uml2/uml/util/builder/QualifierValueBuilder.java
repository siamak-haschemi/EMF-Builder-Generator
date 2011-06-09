package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.QualifierValue</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class QualifierValueBuilder {
  // features and builders
  private org.eclipse.uml2.uml.Property m_qualifier;
  private org.eclipse.uml2.uml.util.builder.PropertyBuilder m_featureQualifierBuilder;
  private org.eclipse.uml2.uml.InputPin m_value;
  private org.eclipse.uml2.uml.util.builder.InputPinBuilder m_featureValueBuilder;
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  // helper attributes
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureQualifierSet = false;
  private boolean m_featureValueSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newQualifierValueBuilder()
   */
  private QualifierValueBuilder() {
  }

  /**
   * This method creates a new instance of the QualifierValueBuilder.
   * @return new instance of the QualifierValueBuilder
   */
  public static QualifierValueBuilder newQualifierValueBuilder() {
    return new QualifierValueBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public QualifierValueBuilder but() {
    QualifierValueBuilder _builder = newQualifierValueBuilder();
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureQualifierSet = m_featureQualifierSet;
    _builder.m_qualifier = m_qualifier;
    _builder.m_featureQualifierBuilder = m_featureQualifierBuilder;
    _builder.m_featureValueSet = m_featureValueSet;
    _builder.m_value = m_value;
    _builder.m_featureValueBuilder = m_featureValueBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.QualifierValue type.
   * @return new instance of the org.eclipse.uml2.uml.QualifierValue type
   */
  public org.eclipse.uml2.uml.QualifierValue build() {
    final org.eclipse.uml2.uml.QualifierValue _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createQualifierValue();
    if (m_featureQualifierSet) {
      _newInstance.setQualifier(m_qualifier);
    } else {
      if (m_featureQualifierBuilder != null) {
        _newInstance.setQualifier(m_featureQualifierBuilder.build());
      }
    }
    if (m_featureValueSet) {
      _newInstance.setValue(m_value);
    } else {
      if (m_featureValueBuilder != null) {
        _newInstance.setValue(m_featureValueBuilder.build());
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

  public QualifierValueBuilder withQualifier(org.eclipse.uml2.uml.Property p_qualifier) {
    m_qualifier = p_qualifier;
    m_featureQualifierSet = true;
    return this;
  }

  public QualifierValueBuilder withQualifier(org.eclipse.uml2.uml.util.builder.PropertyBuilder p_propertyBuilder) {
    m_featureQualifierBuilder = p_propertyBuilder;
    return this;
  }

  public QualifierValueBuilder withValue(org.eclipse.uml2.uml.InputPin p_value) {
    m_value = p_value;
    m_featureValueSet = true;
    return this;
  }

  public QualifierValueBuilder withValue(org.eclipse.uml2.uml.util.builder.InputPinBuilder p_inputPinBuilder) {
    m_featureValueBuilder = p_inputPinBuilder;
    return this;
  }

  public QualifierValueBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public QualifierValueBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public QualifierValueBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
