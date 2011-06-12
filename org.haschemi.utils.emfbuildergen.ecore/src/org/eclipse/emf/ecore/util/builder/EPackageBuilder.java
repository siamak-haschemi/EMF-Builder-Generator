package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EPackage</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EPackageBuilder implements org.eclipse.emf.ecore.util.builder.IEcoreBuilder<org.eclipse.emf.ecore.EPackage> {
  // features and builders
  private org.eclipse.emf.ecore.EFactory m_eFactoryInstance;
  private org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EFactory> m_featureEFactoryInstanceBuilder;
  private java.lang.String m_name;
  private java.lang.String m_nsPrefix;
  private java.lang.String m_nsURI;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.emf.ecore.EClassifier> m_eClassifiers = new java.util.LinkedList<org.eclipse.emf.ecore.EClassifier>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier>> m_featureEClassifiersBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier>>();
  private java.util.Collection<org.eclipse.emf.ecore.EPackage> m_eSubpackages = new java.util.LinkedList<org.eclipse.emf.ecore.EPackage>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EPackage>> m_featureESubpackagesBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EPackage>>();
  // helper attributes
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureEClassifiersSet = false;
  private boolean m_featureEFactoryInstanceSet = false;
  private boolean m_featureESubpackagesSet = false;
  private boolean m_featureNameSet = false;
  private boolean m_featureNsPrefixSet = false;
  private boolean m_featureNsURISet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newEPackageBuilder()
   */
  private EPackageBuilder() {
  }

  /**
   * This method creates a new instance of the EPackageBuilder.
   * @return new instance of the EPackageBuilder
   */
  public static EPackageBuilder newEPackageBuilder() {
    return new EPackageBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EPackageBuilder but() {
    EPackageBuilder _builder = newEPackageBuilder();
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureEClassifiersSet = m_featureEClassifiersSet;
    _builder.m_eClassifiers = m_eClassifiers;
    _builder.m_featureEClassifiersBuilder = m_featureEClassifiersBuilder;
    _builder.m_featureEFactoryInstanceSet = m_featureEFactoryInstanceSet;
    _builder.m_eFactoryInstance = m_eFactoryInstance;
    _builder.m_featureEFactoryInstanceBuilder = m_featureEFactoryInstanceBuilder;
    _builder.m_featureESubpackagesSet = m_featureESubpackagesSet;
    _builder.m_eSubpackages = m_eSubpackages;
    _builder.m_featureESubpackagesBuilder = m_featureESubpackagesBuilder;
    _builder.m_featureNameSet = m_featureNameSet;
    _builder.m_name = m_name;
    _builder.m_featureNsPrefixSet = m_featureNsPrefixSet;
    _builder.m_nsPrefix = m_nsPrefix;
    _builder.m_featureNsURISet = m_featureNsURISet;
    _builder.m_nsURI = m_nsURI;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EPackage type.
   * @return new instance of the org.eclipse.emf.ecore.EPackage type
   */
  public org.eclipse.emf.ecore.EPackage build() {
    final org.eclipse.emf.ecore.EPackage _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEPackage();
    if (m_featureEFactoryInstanceSet) {
      _newInstance.setEFactoryInstance(m_eFactoryInstance);
    } else {
      if (m_featureEFactoryInstanceBuilder != null) {
        _newInstance.setEFactoryInstance(m_featureEFactoryInstanceBuilder.build());
      }
    }
    if (m_featureNameSet) {
      _newInstance.setName(m_name);
    }
    if (m_featureNsPrefixSet) {
      _newInstance.setNsPrefix(m_nsPrefix);
    }
    if (m_featureNsURISet) {
      _newInstance.setNsURI(m_nsURI);
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
    if (m_featureEClassifiersSet) {
      _newInstance.getEClassifiers().addAll(m_eClassifiers);
    } else {
      if (!m_featureEClassifiersBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> builder : m_featureEClassifiersBuilder) {
          _newInstance.getEClassifiers().add(builder.build());
        }
      }
    }
    if (m_featureESubpackagesSet) {
      _newInstance.getESubpackages().addAll(m_eSubpackages);
    } else {
      if (!m_featureESubpackagesBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EPackage> builder : m_featureESubpackagesBuilder) {
          _newInstance.getESubpackages().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public EPackageBuilder withEFactoryInstance(org.eclipse.emf.ecore.EFactory p_eFactoryInstance) {
    m_eFactoryInstance = p_eFactoryInstance;
    m_featureEFactoryInstanceSet = true;
    return this;
  }

  public EPackageBuilder withEFactoryInstance(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EFactory> p_eFactoryBuilder) {
    m_featureEFactoryInstanceBuilder = p_eFactoryBuilder;
    return this;
  }

  public EPackageBuilder withName(java.lang.String p_name) {
    m_name = p_name;
    m_featureNameSet = true;
    return this;
  }

  public EPackageBuilder withNsPrefix(java.lang.String p_nsPrefix) {
    m_nsPrefix = p_nsPrefix;
    m_featureNsPrefixSet = true;
    return this;
  }

  public EPackageBuilder withNsURI(java.lang.String p_nsURI) {
    m_nsURI = p_nsURI;
    m_featureNsURISet = true;
    return this;
  }

  public EPackageBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EPackageBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public EPackageBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public EPackageBuilder withEClassifiers(org.eclipse.emf.ecore.EClassifier p_eClassifiers) {
    m_eClassifiers.add(p_eClassifiers);
    m_featureEClassifiersSet = true;
    return this;
  }

  public EPackageBuilder withEClassifiers(java.util.Collection<? extends org.eclipse.emf.ecore.EClassifier> p_eClassifiers) {
    m_eClassifiers.addAll(p_eClassifiers);
    m_featureEClassifiersSet = true;
    return this;
  }

  public EPackageBuilder withEClassifiers(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EClassifier> p_eClassifierBuilder) {
    m_featureEClassifiersBuilder.add(p_eClassifierBuilder);
    return this;
  }

  public EPackageBuilder withESubpackages(org.eclipse.emf.ecore.EPackage p_eSubpackages) {
    m_eSubpackages.add(p_eSubpackages);
    m_featureESubpackagesSet = true;
    return this;
  }

  public EPackageBuilder withESubpackages(java.util.Collection<? extends org.eclipse.emf.ecore.EPackage> p_eSubpackages) {
    m_eSubpackages.addAll(p_eSubpackages);
    m_featureESubpackagesSet = true;
    return this;
  }

  public EPackageBuilder withESubpackages(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EPackage> p_ePackageBuilder) {
    m_featureESubpackagesBuilder.add(p_ePackageBuilder);
    return this;
  }
}
