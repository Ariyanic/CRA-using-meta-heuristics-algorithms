/**
 */
package RoleteWheel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link RoleteWheel.Feature#getClassname <em>Classname</em>}</li>
 *   <li>{@link RoleteWheel.Feature#getId <em>Id</em>}</li>
 *   <li>{@link RoleteWheel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link RoleteWheel.Feature#getTau <em>Tau</em>}</li>
 *   <li>{@link RoleteWheel.Feature#getEta <em>Eta</em>}</li>
 *   <li>{@link RoleteWheel.Feature#getNumeratorP <em>Numerator P</em>}</li>
 * </ul>
 * </p>
 *
 * @see RoleteWheel.RoleteWheelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classname</em>' attribute.
	 * @see #setClassname(String)
	 * @see RoleteWheel.RoleteWheelPackage#getFeature_Classname()
	 * @model
	 * @generated
	 */
	String getClassname();

	/**
	 * Sets the value of the '{@link RoleteWheel.Feature#getClassname <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classname</em>' attribute.
	 * @see #getClassname()
	 * @generated
	 */
	void setClassname(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see RoleteWheel.RoleteWheelPackage#getFeature_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link RoleteWheel.Feature#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see RoleteWheel.RoleteWheelPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RoleteWheel.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tau</em>' attribute.
	 * @see #setTau(double)
	 * @see RoleteWheel.RoleteWheelPackage#getFeature_Tau()
	 * @model required="true"
	 * @generated
	 */
	double getTau();

	/**
	 * Sets the value of the '{@link RoleteWheel.Feature#getTau <em>Tau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau</em>' attribute.
	 * @see #getTau()
	 * @generated
	 */
	void setTau(double value);

	/**
	 * Returns the value of the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eta</em>' attribute.
	 * @see #setEta(double)
	 * @see RoleteWheel.RoleteWheelPackage#getFeature_Eta()
	 * @model required="true"
	 * @generated
	 */
	double getEta();

	/**
	 * Sets the value of the '{@link RoleteWheel.Feature#getEta <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' attribute.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(double value);

	/**
	 * Returns the value of the '<em><b>Numerator P</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator P</em>' attribute.
	 * @see #setNumeratorP(double)
	 * @see RoleteWheel.RoleteWheelPackage#getFeature_NumeratorP()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getNumeratorP();

	/**
	 * Sets the value of the '{@link RoleteWheel.Feature#getNumeratorP <em>Numerator P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator P</em>' attribute.
	 * @see #getNumeratorP()
	 * @generated
	 */
	void setNumeratorP(double value);

} // Feature
