package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EFactory</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EFactoryBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EFactory> {
  // features and builders
  private org.eclipse.emf.ecore.EPackage m_ePackage;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EPackage> m_featureEPackageBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEPackageSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEFactoryBuilder()
   */
  private EFactoryBuilder() {
  }

  /**
   * This method creates a new instance of the EFactoryBuilder.
   * @return new instance of the EFactoryBuilder
   */
  public static EFactoryBuilder newEFactoryBuilder() {
    return new EFactoryBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EFactoryBuilder but() {
    EFactoryBuilder _builder = newEFactoryBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEPackageSet = m_featureEPackageSet;
    _builder.m_ePackage = m_ePackage;
    _builder.m_featureEPackageBuilder = m_featureEPackageBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EFactory type.
   * @return new instance of the org.eclipse.emf.ecore.EFactory type
   */
  public org.eclipse.emf.ecore.EFactory build() {
    final org.eclipse.emf.ecore.EFactory _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEFactory();
    if (m_featureEPackageSet) {
      _newInstance.setEPackage(m_ePackage);
    } else {
      if (m_featureEPackageBuilder != null) {
        _newInstance.setEPackage(m_featureEPackageBuilder.build());
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
    return _newInstance;
  }

  public EFactoryBuilder withEPackage(org.eclipse.emf.ecore.EPackage p_ePackage) {
    m_ePackage = p_ePackage;
    m_featureEPackageSet = true;
    return this;
  }

  public EFactoryBuilder withEPackage(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EPackage> p_ePackageBuilder) {
    m_featureEPackageBuilder = p_ePackageBuilder;
    return this;
  }

  public EFactoryBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EFactoryBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EFactoryBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }
}
