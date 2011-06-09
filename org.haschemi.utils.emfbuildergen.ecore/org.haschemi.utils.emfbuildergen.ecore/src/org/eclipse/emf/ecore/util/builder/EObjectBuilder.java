package org.eclipse.emf.ecore.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.emf.ecore.EObject</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class EObjectBuilder {
  // features and builders
  // helper attributes
  /**
   * Builder is not instantiated with a constructor.
   * @see #newEObjectBuilder()
   */
  private EObjectBuilder() {
  }

  /**
   * This method creates a new instance of the EObjectBuilder.
   * @return new instance of the EObjectBuilder
   */
  public static EObjectBuilder newEObjectBuilder() {
    return new EObjectBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public EObjectBuilder but() {
    EObjectBuilder _builder = newEObjectBuilder();
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.emf.ecore.EObject type.
   * @return new instance of the org.eclipse.emf.ecore.EObject type
   */
  public org.eclipse.emf.ecore.EObject build() {
    final org.eclipse.emf.ecore.EObject _newInstance = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEObject();
    return _newInstance;
  }
}
