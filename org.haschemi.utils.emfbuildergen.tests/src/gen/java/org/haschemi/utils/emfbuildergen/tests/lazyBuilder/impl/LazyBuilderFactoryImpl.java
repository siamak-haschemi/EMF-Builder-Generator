/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.haschemi.utils.emfbuildergen.tests.lazyBuilder.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.haschemi.utils.emfbuildergen.tests.lazyBuilder.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LazyBuilderFactoryImpl extends EFactoryImpl implements LazyBuilderFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LazyBuilderFactory init() {
    try {
      LazyBuilderFactory theLazyBuilderFactory = (LazyBuilderFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eaxmple.com/lazyBuilder"); 
      if (theLazyBuilderFactory != null) {
        return theLazyBuilderFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LazyBuilderFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LazyBuilderFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case LazyBuilderPackage.A: return createA();
      case LazyBuilderPackage.B: return createB();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public A createA() {
    AImpl a = new AImpl();
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public B createB() {
    BImpl b = new BImpl();
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LazyBuilderPackage getLazyBuilderPackage() {
    return (LazyBuilderPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LazyBuilderPackage getPackage() {
    return LazyBuilderPackage.eINSTANCE;
  }

} //LazyBuilderFactoryImpl
