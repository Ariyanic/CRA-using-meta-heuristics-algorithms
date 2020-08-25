/**
 */
package RoleteWheel.impl;

import RoleteWheel.Feature;
import RoleteWheel.RoleteWheelPackage;
import RoleteWheel.Root;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link RoleteWheel.impl.RootImpl#getWheel <em>Wheel</em>}</li>
 *   <li>{@link RoleteWheel.impl.RootImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link RoleteWheel.impl.RootImpl#getDenominatorP <em>Denominator P</em>}</li>
 *   <li>{@link RoleteWheel.impl.RootImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getWheel() <em>Wheel</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheel()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> wheel;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The default value of the '{@link #getDenominatorP() <em>Denominator P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominatorP()
	 * @generated
	 * @ordered
	 */
	protected static final double DENOMINATOR_P_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getDenominatorP() <em>Denominator P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenominatorP()
	 * @generated
	 * @ordered
	 */
	protected double denominatorP = DENOMINATOR_P_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoleteWheelPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getWheel() {
		if (wheel == null) {
			wheel = new EDataTypeEList<Double>(Double.class, this, RoleteWheelPackage.ROOT__WHEEL);
		}
		return wheel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, RoleteWheelPackage.ROOT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDenominatorP() {
		return denominatorP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenominatorP(double newDenominatorP) {
		double oldDenominatorP = denominatorP;
		denominatorP = newDenominatorP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoleteWheelPackage.ROOT__DENOMINATOR_P, oldDenominatorP, denominatorP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RoleteWheelPackage.ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoleteWheelPackage.ROOT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoleteWheelPackage.ROOT__WHEEL:
				return getWheel();
			case RoleteWheelPackage.ROOT__FEATURES:
				return getFeatures();
			case RoleteWheelPackage.ROOT__DENOMINATOR_P:
				return getDenominatorP();
			case RoleteWheelPackage.ROOT__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RoleteWheelPackage.ROOT__WHEEL:
				getWheel().clear();
				getWheel().addAll((Collection<? extends Double>)newValue);
				return;
			case RoleteWheelPackage.ROOT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case RoleteWheelPackage.ROOT__DENOMINATOR_P:
				setDenominatorP((Double)newValue);
				return;
			case RoleteWheelPackage.ROOT__NAME:
				setName((String)newValue);
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
			case RoleteWheelPackage.ROOT__WHEEL:
				getWheel().clear();
				return;
			case RoleteWheelPackage.ROOT__FEATURES:
				getFeatures().clear();
				return;
			case RoleteWheelPackage.ROOT__DENOMINATOR_P:
				setDenominatorP(DENOMINATOR_P_EDEFAULT);
				return;
			case RoleteWheelPackage.ROOT__NAME:
				setName(NAME_EDEFAULT);
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
			case RoleteWheelPackage.ROOT__WHEEL:
				return wheel != null && !wheel.isEmpty();
			case RoleteWheelPackage.ROOT__FEATURES:
				return features != null && !features.isEmpty();
			case RoleteWheelPackage.ROOT__DENOMINATOR_P:
				return denominatorP != DENOMINATOR_P_EDEFAULT;
			case RoleteWheelPackage.ROOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (wheel: ");
		result.append(wheel);
		result.append(", DenominatorP: ");
		result.append(denominatorP);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RootImpl
