/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.haschemi.utils.emfbuildergen.tests.lazyBuilder;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.LazyBuilderFactory
 * @model kind="package"
 * @generated
 */
public interface LazyBuilderPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lazyBuilder";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eaxmple.com/lazyBuilder";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lazyBuilder";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LazyBuilderPackage eINSTANCE = org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.LazyBuilderPackageImpl.init();

  /**
   * The meta object id for the '{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.AImpl <em>A</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.AImpl
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.LazyBuilderPackageImpl#getA()
   * @generated
   */
  int A = 0;

  /**
   * The feature id for the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A__B = 0;

  /**
   * The number of structural features of the '<em>A</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int A_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.BImpl <em>B</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.BImpl
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.LazyBuilderPackageImpl#getB()
   * @generated
   */
  int B = 1;

  /**
   * The number of structural features of the '<em>B</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int B_FEATURE_COUNT = 0;


  /**
   * Returns the meta object for class '{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A <em>A</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>A</em>'.
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A
   * @generated
   */
  EClass getA();

  /**
   * Returns the meta object for the containment reference '{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A#getB <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>B</em>'.
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A#getB()
   * @see #getA()
   * @generated
   */
  EReference getA_B();

  /**
   * Returns the meta object for class '{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.B <em>B</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>B</em>'.
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.B
   * @generated
   */
  EClass getB();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LazyBuilderFactory getLazyBuilderFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals {
    /**
     * The meta object literal for the '{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.AImpl <em>A</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.AImpl
     * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.LazyBuilderPackageImpl#getA()
     * @generated
     */
    EClass A = eINSTANCE.getA();

    /**
     * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference A__B = eINSTANCE.getA_B();

    /**
     * The meta object literal for the '{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.BImpl <em>B</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.BImpl
     * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl.LazyBuilderPackageImpl#getB()
     * @generated
     */
    EClass B = eINSTANCE.getB();

  }

} //LazyBuilderPackage
