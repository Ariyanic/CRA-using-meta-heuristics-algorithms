/**
 */
package RoleteWheel.impl;

import RoleteWheel.Feature;
import RoleteWheel.RoleteWheelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RoleteWheel.impl.FeatureImpl#getClassname <em>Classname</em>}</li>
 *   <li>{@link RoleteWheel.impl.FeatureImpl#getId <em>Id</em>}</li>
 *   <li>{@link RoleteWheel.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link RoleteWheel.impl.FeatureImpl#getTau <em>Tau</em>}</li>
 *   <li>{@link RoleteWheel.impl.FeatureImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link RoleteWheel.impl.FeatureImpl#getNumeratorP <em>Numerator P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
	/**
	 * The default value of the '{@link #getClassname() <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassname()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassname() <em>Classname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassname()
	 * @generated
	 * @ordered
	 */
	protected String classname = CLASSNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTau() <em>Tau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTau()
	 * @generated
	 * @ordered
	 */
	protected static final double TAU_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTau() <em>Tau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTau()
	 * @generated
	 * @ordered
	 */
	protected double tau = TAU_EDEFAULT;

	/**
	 * The default value of the '{@link #getEta() <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected static final double ETA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEta() <em>Eta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected double eta = ETA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeratorP() <em>Numerator P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeratorP()
	 * @generated
	 * @ordered
	 */
	protected static final double NUMERATOR_P_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getNumeratorP() <em>Numerator P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeratorP()
	 * @generated
	 * @ordered
	 */
	protected double numeratorP = NUMERATOR_P_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoleteWheelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassname() {
		return classname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassname(String newClassname) {
		String oldClassname = classname;
		classname = newClassname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleteWheelPackage.FEATURE__CLASSNAME, oldClassname, classname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleteWheelPackage.FEATURE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleteWheelPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTau() {
		return tau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTau(double newTau) {
		double oldTau = tau;
		tau = newTau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleteWheelPackage.FEATURE__TAU, oldTau, tau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEta() {
		return eta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEta(double newEta) {
		double oldEta = eta;
		eta = newEta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleteWheelPackage.FEATURE__ETA, oldEta, eta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNumeratorP() {
		return numeratorP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeratorP(double newNumeratorP) {
		double oldNumeratorP = numeratorP;
		numeratorP = newNumeratorP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleteWheelPackage.FEATURE__NUMERATOR_P, oldNumeratorP, numeratorP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoleteWheelPackage.FEATURE__CLASSNAME:
				return getClassname();
			case RoleteWheelPackage.FEATURE__ID:
				return getId();
			case RoleteWheelPackage.FEATURE__NAME:
				return getName();
			case RoleteWheelPackage.FEATURE__TAU:
				return getTau();
			case RoleteWheelPackage.FEATURE__ETA:
				return getEta();
			case RoleteWheelPackage.FEATURE__NUMERATOR_P:
				return getNumeratorP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoleteWheelPackage.FEATURE__CLASSNAME:
				setClassname((String)newValue);
				return;
			case RoleteWheelPackage.FEATURE__ID:
				setId((Integer)newValue);
				return;
			case RoleteWheelPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case RoleteWheelPackage.FEATURE__TAU:
				setTau((Double)newValue);
				return;
			case RoleteWheelPackage.FEATURE__ETA:
				setEta((Double)newValue);
				return;
			case RoleteWheelPackage.FEATURE__NUMERATOR_P:
				setNumeratorP((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RoleteWheelPackage.FEATURE__CLASSNAME:
				setClassname(CLASSNAME_EDEFAULT);
				return;
			case RoleteWheelPackage.FEATURE__ID:
				setId(ID_EDEFAULT);
				return;
			case RoleteWheelPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RoleteWheelPackage.FEATURE__TAU:
				setTau(TAU_EDEFAULT);
				return;
			case RoleteWheelPackage.FEATURE__ETA:
				setEta(ETA_EDEFAULT);
				return;
			case RoleteWheelPackage.FEATURE__NUMERATOR_P:
				setNumeratorP(NUMERATOR_P_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RoleteWheelPackage.FEATURE__CLASSNAME:
				return CLASSNAME_EDEFAULT == null ? classname != null : !CLASSNAME_EDEFAULT.equals(classname);
			case RoleteWheelPackage.FEATURE__ID:
				return id != ID_EDEFAULT;
			case RoleteWheelPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RoleteWheelPackage.FEATURE__TAU:
				return tau != TAU_EDEFAULT;
			case RoleteWheelPackage.FEATURE__ETA:
				return eta != ETA_EDEFAULT;
			case RoleteWheelPackage.FEATURE__NUMERATOR_P:
				return numeratorP != NUMERATOR_P_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (classname: ");
		result.append(classname);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", tau: ");
		result.append(tau);
		result.append(", eta: ");
		result.append(eta);
		result.append(", NumeratorP: ");
		result.append(numeratorP);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
