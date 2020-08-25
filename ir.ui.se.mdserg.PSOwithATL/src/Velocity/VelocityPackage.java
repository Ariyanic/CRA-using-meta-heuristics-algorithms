/**
 */
package Velocity;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see Velocity.VelocityFactory
 * @model kind="package"
 * @generated
 */
public interface VelocityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Velocity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.velocity.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Velocity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VelocityPackage eINSTANCE = Velocity.impl.VelocityPackageImpl.init();

	/**
	 * The meta object id for the '{@link Velocity.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Velocity.impl.PointImpl
	 * @see Velocity.impl.VelocityPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Velocity.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Velocity.impl.VectorImpl
	 * @see Velocity.impl.VelocityPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 1;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__HAS = 0;

	/**
	 * The number of structural features of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link Velocity.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see Velocity.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link Velocity.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see Velocity.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link Velocity.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see Velocity.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link Velocity.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see Velocity.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for the containment reference list '{@link Velocity.Vector#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see Velocity.Vector#getHas()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_Has();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VelocityFactory getVelocityFactory();

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
		 * The meta object literal for the '{@link Velocity.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Velocity.impl.PointImpl
		 * @see Velocity.impl.VelocityPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link Velocity.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Velocity.impl.VectorImpl
		 * @see Velocity.impl.VelocityPackageImpl#getVector()
		 * @generated
		 */
		EClass VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__HAS = eINSTANCE.getVector_Has();

	}

} //VelocityPackage
