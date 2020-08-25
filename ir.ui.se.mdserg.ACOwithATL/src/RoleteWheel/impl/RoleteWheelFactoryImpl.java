/**
 */
package RoleteWheel.impl;

import RoleteWheel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoleteWheelFactoryImpl extends EFactoryImpl implements RoleteWheelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoleteWheelFactory init() {
		try {
			RoleteWheelFactory theRoleteWheelFactory = (RoleteWheelFactory)EPackage.Registry.INSTANCE.getEFactory(RoleteWheelPackage.eNS_URI);
			if (theRoleteWheelFactory != null) {
				return theRoleteWheelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoleteWheelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleteWheelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RoleteWheelPackage.ROOT: return createRoot();
			case RoleteWheelPackage.FEATURE: return createFeature();
			case RoleteWheelPackage.ATTRIBUTE: return createAttribute();
			case RoleteWheelPackage.METHOD: return createMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleteWheelPackage getRoleteWheelPackage() {
		return (RoleteWheelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoleteWheelPackage getPackage() {
		return RoleteWheelPackage.eINSTANCE;
	}

} //RoleteWheelFactoryImpl
