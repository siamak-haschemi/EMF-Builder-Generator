/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.LazyBuilderFactory;
import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.LazyBuilderPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LazyBuilderPackageImpl extends EPackageImpl implements LazyBuilderPackage {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.LazyBuilderPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LazyBuilderPackageImpl() {
    super(eNS_URI, LazyBuilderFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LazyBuilderPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LazyBuilderPackage init() {
    if (isInited) return (LazyBuilderPackage)EPackage.Registry.INSTANCE.getEPackage(LazyBuilderPackage.eNS_URI);

    // Obtain or create and register package
    LazyBuilderPackageImpl theLazyBuilderPackage = (LazyBuilderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LazyBuilderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LazyBuilderPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLazyBuilderPackage.createPackageContents();

    // Initialize created meta-data
    theLazyBuilderPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLazyBuilderPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LazyBuilderPackage.eNS_URI, theLazyBuilderPackage);
    return theLazyBuilderPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getA() {
    return aEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getA_B() {
    return (EReference)aEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getB() {
    return bEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LazyBuilderFactory getLazyBuilderFactory() {
    return (LazyBuilderFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    aEClass = createEClass(A);
    createEReference(aEClass, A__B);

    bEClass = createEClass(B);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(aEClass, org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A.class, "A", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getA_B(), this.getB(), null, "b", null, 0, 1, org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bEClass, org.haschemi.utils.emfbuildergen.tests.lazyBuilder.B.class, "B", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //LazyBuilderPackageImpl
