/**
 */
package RoleteWheel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RoleteWheel.Root#getWheel <em>Wheel</em>}</li>
 *   <li>{@link RoleteWheel.Root#getFeatures <em>Features</em>}</li>
 *   <li>{@link RoleteWheel.Root#getDenominatorP <em>Denominator P</em>}</li>
 *   <li>{@link RoleteWheel.Root#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see RoleteWheel.RoleteWheelPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Wheel</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wheel</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheel</em>' attribute list.
	 * @see RoleteWheel.RoleteWheelPackage#getRoot_Wheel()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getWheel();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link RoleteWheel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see RoleteWheel.RoleteWheelPackage#getRoot_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Denominator P</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator P</em>' attribute.
	 * @see #setDenominatorP(double)
	 * @see RoleteWheel.RoleteWheelPackage#getRoot_DenominatorP()
	 * @model default="2.0" required="true"
	 * @generated
	 */
	double getDenominatorP();

	/**
	 * Sets the value of the '{@link RoleteWheel.Root#getDenominatorP <em>Denominator P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator P</em>' attribute.
	 * @see #getDenominatorP()
	 * @generated
	 */
	void setDenominatorP(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RoleteWheel.RoleteWheelPackage#getRoot_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RoleteWheel.Root#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Root
