/**
 */
package Velocity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Velocity.VelocityPackage
 * @generated
 */
public interface VelocityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VelocityFactory eINSTANCE = Velocity.impl.VelocityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector</em>'.
	 * @generated
	 */
	Vector createVector();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VelocityPackage getVelocityPackage();

} //VelocityFactory
