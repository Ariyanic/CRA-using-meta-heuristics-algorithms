/**
 */
package Chromosome;

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
 * @see Chromosome.ChromosomeFactory
 * @model kind="package"
 * @generated
 */
public interface ChromosomePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Chromosome";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.chromosomeCRA.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Chromosome";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChromosomePackage eINSTANCE = Chromosome.impl.ChromosomePackageImpl.init();

	/**
	 * The meta object id for the '{@link Chromosome.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Chromosome.impl.FeatureImpl
	 * @see Chromosome.impl.ChromosomePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

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
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Chromosome.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Chromosome.impl.MethodImpl
	 * @see Chromosome.impl.ChromosomePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 0;

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
	 * The meta object id for the '{@link Chromosome.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Chromosome.impl.AttributeImpl
	 * @see Chromosome.impl.ChromosomePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

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
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Chromosome.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see Chromosome.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the reference list '{@link Chromosome.Method#getFunctionalDependency <em>Functional Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functional Dependency</em>'.
	 * @see Chromosome.Method#getFunctionalDependency()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_FunctionalDependency();

	/**
	 * Returns the meta object for the reference list '{@link Chromosome.Method#getDataDependency <em>Data Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data Dependency</em>'.
	 * @see Chromosome.Method#getDataDependency()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_DataDependency();

	/**
	 * Returns the meta object for class '{@link Chromosome.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see Chromosome.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link Chromosome.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see Chromosome.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link Chromosome.Feature#getClassname <em>Classname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classname</em>'.
	 * @see Chromosome.Feature#getClassname()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Classname();

	/**
	 * Returns the meta object for the attribute '{@link Chromosome.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Chromosome.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link Chromosome.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Chromosome.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChromosomeFactory getChromosomeFactory();

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
		 * The meta object literal for the '{@link Chromosome.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Chromosome.impl.MethodImpl
		 * @see Chromosome.impl.ChromosomePackageImpl#getMethod()
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

		/**
		 * The meta object literal for the '{@link Chromosome.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Chromosome.impl.AttributeImpl
		 * @see Chromosome.impl.ChromosomePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link Chromosome.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Chromosome.impl.FeatureImpl
		 * @see Chromosome.impl.ChromosomePackageImpl#getFeature()
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

	}

} //ChromosomePackage
