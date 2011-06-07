/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.haschemi.utils.emfbuildergen.tests.lazyBuilder;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.LazyBuilderPackage#getA()
 * @model
 * @generated
 */
public interface A extends EObject {
  /**
   * Returns the value of the '<em><b>B</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>B</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>B</em>' containment reference.
   * @see #setB(B)
   * @see org.haschemi.utils.emfbuildergen.tests.lazyBuilder.LazyBuilderPackage#getA_B()
   * @model containment="true"
   * @generated
   */
  B getB();

  /**
   * Sets the value of the '{@link org.haschemi.utils.emfbuildergen.tests.lazyBuilder.A#getB <em>B</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>B</em>' containment reference.
   * @see #getB()
   * @generated
   */
  void setB(B value);

} // A
