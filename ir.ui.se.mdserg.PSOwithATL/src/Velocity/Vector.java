/**
 */
package Velocity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Velocity.Vector#getHas <em>Has</em>}</li>
 * </ul>
 * </p>
 *
 * @see Velocity.VelocityPackage#getVector()
 * @model
 * @generated
 */
public interface Vector extends EObject {
	/**
	 * Returns the value of the '<em><b>Has</b></em>' containment reference list.
	 * The list contents are of type {@link Velocity.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' containment reference list.
	 * @see Velocity.VelocityPackage#getVector_Has()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getHas();

} // Vector
