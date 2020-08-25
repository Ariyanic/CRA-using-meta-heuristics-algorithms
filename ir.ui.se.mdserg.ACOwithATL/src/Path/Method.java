/**
 */
package Path;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Path.Method#getFunctionalDependency <em>Functional Dependency</em>}</li>
 *   <li>{@link Path.Method#getDataDependency <em>Data Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see Path.PathPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Feature {
	/**
	 * Returns the value of the '<em><b>Functional Dependency</b></em>' reference list.
	 * The list contents are of type {@link Path.Method}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Dependency</em>' reference list.
	 * @see Path.PathPackage#getMethod_FunctionalDependency()
	 * @model
	 * @generated
	 */
	EList<Method> getFunctionalDependency();

	/**
	 * Returns the value of the '<em><b>Data Dependency</b></em>' reference list.
	 * The list contents are of type {@link Path.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Dependency</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Dependency</em>' reference list.
	 * @see Path.PathPackage#getMethod_DataDependency()
	 * @model
	 * @generated
	 */
	EList<Attribute> getDataDependency();

} // Method
