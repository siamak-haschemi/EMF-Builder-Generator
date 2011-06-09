package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.LinkEndDestructionData</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class LinkEndDestructionDataBuilder {
  // features and builders
  private org.eclipse.uml2.uml.InputPin m_destroyAt;
  private org.eclipse.uml2.uml.util.builder.InputPinBuilder m_featureDestroyAtBuilder;
  private org.eclipse.uml2.uml.Property m_end;
  private org.eclipse.uml2.uml.util.builder.PropertyBuilder m_featureEndBuilder;
  private Boolean m_isDestroyDuplicates;
  private org.eclipse.uml2.uml.InputPin m_value;
  private org.eclipse.uml2.uml.util.builder.InputPinBuilder m_featureValueBuilder;
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.CommentBuilder> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.CommentBuilder>();
  private java.util.Collection<org.eclipse.uml2.uml.QualifierValue> m_qualifier = new java.util.LinkedList<org.eclipse.uml2.uml.QualifierValue>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.QualifierValueBuilder> m_featureQualifierBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.QualifierValueBuilder>();
  // helper attributes
  private boolean m_featureDestroyAtSet = false;
  private boolean m_featureEndSet = false;
  private boolean m_featureIsDestroyDuplicatesSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureQualifierSet = false;
  private boolean m_featureValueSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newLinkEndDestructionDataBuilder()
   */
  private LinkEndDestructionDataBuilder() {
  }

  /**
   * This method creates a new instance of the LinkEndDestructionDataBuilder.
   * @return new instance of the LinkEndDestructionDataBuilder
   */
  public static LinkEndDestructionDataBuilder newLinkEndDestructionDataBuilder() {
    return new LinkEndDestructionDataBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public LinkEndDestructionDataBuilder but() {
    LinkEndDestructionDataBuilder _builder = newLinkEndDestructionDataBuilder();
    _builder.m_featureDestroyAtSet = m_featureDestroyAtSet;
    _builder.m_destroyAt = m_destroyAt;
    _builder.m_featureDestroyAtBuilder = m_featureDestroyAtBuilder;
    _builder.m_featureEndSet = m_featureEndSet;
    _builder.m_end = m_end;
    _builder.m_featureEndBuilder = m_featureEndBuilder;
    _builder.m_featureIsDestroyDuplicatesSet = m_featureIsDestroyDuplicatesSet;
    _builder.m_isDestroyDuplicates = m_isDestroyDuplicates;
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
   * This method constructs the final org.eclipse.uml2.uml.LinkEndDestructionData type.
   * @return new instance of the org.eclipse.uml2.uml.LinkEndDestructionData type
   */
  public org.eclipse.uml2.uml.LinkEndDestructionData build() {
    final org.eclipse.uml2.uml.LinkEndDestructionData _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createLinkEndDestructionData();
    if (m_featureDestroyAtSet) {
      _newInstance.setDestroyAt(m_destroyAt);
    } else {
      if (m_featureDestroyAtBuilder != null) {
        _newInstance.setDestroyAt(m_featureDestroyAtBuilder.build());
      }
    }
    if (m_featureEndSet) {
      _newInstance.setEnd(m_end);
    } else {
      if (m_featureEndBuilder != null) {
        _newInstance.setEnd(m_featureEndBuilder.build());
      }
    }
    if (m_featureIsDestroyDuplicatesSet) {
      _newInstance.setIsDestroyDuplicates(m_isDestroyDuplicates);
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
    if (m_featureQualifierSet) {
      _newInstance.getQualifiers().addAll(m_qualifier);
    } else {
      if (!m_featureQualifierBuilder.isEmpty()) {
        for (QualifierValueBuilder builder : m_featureQualifierBuilder) {
          _newInstance.getQualifiers().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public LinkEndDestructionDataBuilder withDestroyAt(org.eclipse.uml2.uml.InputPin p_destroyAt) {
    m_destroyAt = p_destroyAt;
    m_featureDestroyAtSet = true;
    return this;
  }

  public LinkEndDestructionDataBuilder withDestroyAt(org.eclipse.uml2.uml.util.builder.InputPinBuilder p_inputPinBuilder) {
    m_featureDestroyAtBuilder = p_inputPinBuilder;
    return this;
  }

  public LinkEndDestructionDataBuilder withEnd(org.eclipse.uml2.uml.Property p_end) {
    m_end = p_end;
    m_featureEndSet = true;
    return this;
  }

  public LinkEndDestructionDataBuilder withEnd(org.eclipse.uml2.uml.util.builder.PropertyBuilder p_propertyBuilder) {
    m_featureEndBuilder = p_propertyBuilder;
    return this;
  }

  public LinkEndDestructionDataBuilder withIsDestroyDuplicates(Boolean p_isDestroyDuplicates) {
    m_isDestroyDuplicates = p_isDestroyDuplicates;
    m_featureIsDestroyDuplicatesSet = true;
    return this;
  }

  public LinkEndDestructionDataBuilder withValue(org.eclipse.uml2.uml.InputPin p_value) {
    m_value = p_value;
    m_featureValueSet = true;
    return this;
  }

  public LinkEndDestructionDataBuilder withValue(org.eclipse.uml2.uml.util.builder.InputPinBuilder p_inputPinBuilder) {
    m_featureValueBuilder = p_inputPinBuilder;
    return this;
  }

  public LinkEndDestructionDataBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public LinkEndDestructionDataBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public LinkEndDestructionDataBuilder withOwnedComment(CommentBuilder p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }

  public LinkEndDestructionDataBuilder withQualifier(org.eclipse.uml2.uml.QualifierValue p_qualifier) {
    m_qualifier.add(p_qualifier);
    m_featureQualifierSet = true;
    return this;
  }

  public LinkEndDestructionDataBuilder withQualifier(java.util.Collection<? extends org.eclipse.uml2.uml.QualifierValue> p_qualifier) {
    m_qualifier.addAll(p_qualifier);
    m_featureQualifierSet = true;
    return this;
  }

  public LinkEndDestructionDataBuilder withQualifier(QualifierValueBuilder p_qualifierValueBuilder) {
    m_featureQualifierBuilder.add(p_qualifierValueBuilder);
    return this;
  }
}
