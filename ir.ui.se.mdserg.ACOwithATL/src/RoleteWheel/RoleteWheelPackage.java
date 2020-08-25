/**
 */
package RoleteWheel;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RoleteWheel.RoleteWheelFactory
 * @model kind="package"
 * @generated
 */
public interface RoleteWheelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RoleteWheel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.RoleteWheel.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RoleteWheel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoleteWheelPackage eINSTANCE = RoleteWheel.impl.RoleteWheelPackageImpl.init();

	/**
	 * The meta object id for the '{@link RoleteWheel.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RoleteWheel.impl.RootImpl
	 * @see RoleteWheel.impl.RoleteWheelPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Wheel</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__WHEEL = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Denominator P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DENOMINATOR_P = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RoleteWheel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RoleteWheel.impl.FeatureImpl
	 * @see RoleteWheel.impl.RoleteWheelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CLASSNAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Tau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TAU = 3;

	/**
	 * The feature id for the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ETA = 4;

	/**
	 * The feature id for the '<em><b>Numerator P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NUMERATOR_P = 5;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RoleteWheel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RoleteWheel.impl.AttributeImpl
	 * @see RoleteWheel.impl.RoleteWheelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CLASSNAME = FEATURE__CLASSNAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Tau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAU = FEATURE__TAU;

	/**
	 * The feature id for the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ETA = FEATURE__ETA;

	/**
	 * The feature id for the '<em><b>Numerator P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NUMERATOR_P = FEATURE__NUMERATOR_P;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RoleteWheel.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RoleteWheel.impl.MethodImpl
	 * @see RoleteWheel.impl.RoleteWheelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 3;

	/**
	 * The feature id for the '<em><b>Classname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CLASSNAME = FEATURE__CLASSNAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ID = FEATURE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Tau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TAU = FEATURE__TAU;

	/**
	 * The feature id for the '<em><b>Eta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ETA = FEATURE__ETA;

	/**
	 * The feature id for the '<em><b>Numerator P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NUMERATOR_P = FEATURE__NUMERATOR_P;

	/**
	 * The feature id for the '<em><b>Functional Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__FUNCTIONAL_DEPENDENCY = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DATA_DEPENDENCY = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link RoleteWheel.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see RoleteWheel.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the attribute list '{@link RoleteWheel.Root#getWheel <em>Wheel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Wheel</em>'.
	 * @see RoleteWheel.Root#getWheel()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_Wheel();

	/**
	 * Returns the meta object for the containment reference list '{@link RoleteWheel.Root#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see RoleteWheel.Root#getFeatures()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Features();

	/**
	 * Returns the meta object for the attribute '{@link RoleteWheel.Root#getDenominatorP <em>Denominator P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Denominator P</em>'.
	 * @see RoleteWheel.Root#getDenominatorP()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_DenominatorP();

	/**
	 * Returns the meta object for the attribute '{@link RoleteWheel.Root#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RoleteWheel.Root#getName()
	 * @see #getRoot()
	 * @generated
	 */
	EAttribute getRoot_Name();

	/**
	 * Returns the meta object for class '{@link RoleteWheel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see RoleteWheel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link RoleteWheel.Feature#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see RoleteWheel.Feature#getClassname()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Classname();

	/**
	 * Returns the meta object for the attribute '{@link RoleteWheel.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see RoleteWheel.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link RoleteWheel.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RoleteWheel.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the attribute '{@link RoleteWheel.Feature#getTau <em>Tau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tau</em>'.
	 * @see RoleteWheel.Feature#getTau()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Tau();

	/**
	 * Returns the meta object for the attribute '{@link RoleteWheel.Feature#getEta <em>Eta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eta</em>'.
	 * @see RoleteWheel.Feature#getEta()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Eta();

	/**
	 * Returns the meta object for the attribute '{@link RoleteWheel.Feature#getNumeratorP <em>Numerator P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numerator P</em>'.
	 * @see RoleteWheel.Feature#getNumeratorP()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_NumeratorP();

	/**
	 * Returns the meta object for class '{@link RoleteWheel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see RoleteWheel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link RoleteWheel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see RoleteWheel.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference list '{@link RoleteWheel.Method#getFunctionalDependency <em>Functional Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functional Dependency</em>'.
	 * @see RoleteWheel.Method#getFunctionalDependency()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_FunctionalDependency();

	/**
	 * Returns the meta object for the reference list '{@link RoleteWheel.Method#getDataDependency <em>Data Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Dependency</em>'.
	 * @see RoleteWheel.Method#getDataDependency()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_DataDependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoleteWheelFactory getRoleteWheelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RoleteWheel.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RoleteWheel.impl.RootImpl
		 * @see RoleteWheel.impl.RoleteWheelPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Wheel</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__WHEEL = eINSTANCE.getRoot_Wheel();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__FEATURES = eINSTANCE.getRoot_Features();

		/**
		 * The meta object literal for the '<em><b>Denominator P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__DENOMINATOR_P = eINSTANCE.getRoot_DenominatorP();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT__NAME = eINSTANCE.getRoot_Name();

		/**
		 * The meta object literal for the '{@link RoleteWheel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RoleteWheel.impl.FeatureImpl
		 * @see RoleteWheel.impl.RoleteWheelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Classname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__CLASSNAME = eINSTANCE.getFeature_Classname();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Tau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__TAU = eINSTANCE.getFeature_Tau();

		/**
		 * The meta object literal for the '<em><b>Eta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ETA = eINSTANCE.getFeature_Eta();

		/**
		 * The meta object literal for the '<em><b>Numerator P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NUMERATOR_P = eINSTANCE.getFeature_NumeratorP();

		/**
		 * The meta object literal for the '{@link RoleteWheel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RoleteWheel.impl.AttributeImpl
		 * @see RoleteWheel.impl.RoleteWheelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link RoleteWheel.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RoleteWheel.impl.MethodImpl
		 * @see RoleteWheel.impl.RoleteWheelPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Functional Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__FUNCTIONAL_DEPENDENCY = eINSTANCE.getMethod_FunctionalDependency();

		/**
		 * The meta object literal for the '<em><b>Data Dependency</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__DATA_DEPENDENCY = eINSTANCE.getMethod_DataDependency();

	}

} //RoleteWheelPackage
