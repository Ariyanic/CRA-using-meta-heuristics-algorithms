/**
 */
package Path;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Path.Feature#getClassname <em>Classname</em>}</li>
 *   <li>{@link Path.Feature#getId <em>Id</em>}</li>
 *   <li>{@link Path.Feature#getName <em>Name</em>}</li>
 *   <li>{@link Path.Feature#getTau <em>Tau</em>}</li>
 *   <li>{@link Path.Feature#getEta <em>Eta</em>}</li>
 *   <li>{@link Path.Feature#getNumeratorP <em>Numerator P</em>}</li>
 * </ul>
 * </p>
 *
 * @see Path.PathPackage#getFeature()
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
	 * @see Path.PathPackage#getFeature_Classname()
	 * @model
	 * @generated
	 */
	String getClassname();

	/**
	 * Sets the value of the '{@link Path.Feature#getClassname <em>Classname</em>}' attribute.
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
	 * @see Path.PathPackage#getFeature_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link Path.Feature#getId <em>Id</em>}' attribute.
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
	 * @see Path.PathPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Path.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tau</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tau</em>' attribute.
	 * @see #setTau(double)
	 * @see Path.PathPackage#getFeature_Tau()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getTau();

	/**
	 * Sets the value of the '{@link Path.Feature#getTau <em>Tau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tau</em>' attribute.
	 * @see #getTau()
	 * @generated
	 */
	void setTau(double value);

	/**
	 * Returns the value of the '<em><b>Eta</b></em>' attribute.
	 * The default value is <code>"-1000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eta</em>' attribute.
	 * @see #setEta(double)
	 * @see Path.PathPackage#getFeature_Eta()
	 * @model default="-1000000" required="true"
	 * @generated
	 */
	double getEta();

	/**
	 * Sets the value of the '{@link Path.Feature#getEta <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' attribute.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(double value);

	/**
	 * Returns the value of the '<em><b>Numerator P</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator P</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator P</em>' attribute.
	 * @see #setNumeratorP(double)
	 * @see Path.PathPackage#getFeature_NumeratorP()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getNumeratorP();

	/**
	 * Sets the value of the '{@link Path.Feature#getNumeratorP <em>Numerator P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator P</em>' attribute.
	 * @see #getNumeratorP()
	 * @generated
	 */
	void setNumeratorP(double value);

} // Feature
