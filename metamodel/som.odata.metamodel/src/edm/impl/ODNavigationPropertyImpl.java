/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODNavigationProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Navigation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.ODNavigationPropertyImpl#getContainsTarget <em>Contains Target</em>}</li>
 *   <li>{@link edm.impl.ODNavigationPropertyImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link edm.impl.ODNavigationPropertyImpl#getNullable <em>Nullable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODNavigationPropertyImpl extends ODElementImpl implements ODNavigationProperty {
	/**
	 * The default value of the '{@link #getContainsTarget() <em>Contains Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsTarget()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTAINS_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainsTarget() <em>Contains Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsTarget()
	 * @generated
	 * @ordered
	 */
	protected Boolean containsTarget = CONTAINS_TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartner() <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected ODNavigationProperty partner;

	/**
	 * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NULLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected Boolean nullable = NULLABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODNavigationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.OD_NAVIGATION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getContainsTarget() {
		return containsTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainsTarget(Boolean newContainsTarget) {
		Boolean oldContainsTarget = containsTarget;
		containsTarget = newContainsTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_NAVIGATION_PROPERTY__CONTAINS_TARGET, oldContainsTarget, containsTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODNavigationProperty getPartner() {
		if (partner != null && partner.eIsProxy()) {
			InternalEObject oldPartner = (InternalEObject)partner;
			partner = (ODNavigationProperty)eResolveProxy(oldPartner);
			if (partner != oldPartner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdmPackage.OD_NAVIGATION_PROPERTY__PARTNER, oldPartner, partner));
			}
		}
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODNavigationProperty basicGetPartner() {
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartner(ODNavigationProperty newPartner) {
		ODNavigationProperty oldPartner = partner;
		partner = newPartner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_NAVIGATION_PROPERTY__PARTNER, oldPartner, partner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(Boolean newNullable) {
		Boolean oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_NAVIGATION_PROPERTY__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdmPackage.OD_NAVIGATION_PROPERTY__CONTAINS_TARGET:
				return getContainsTarget();
			case EdmPackage.OD_NAVIGATION_PROPERTY__PARTNER:
				if (resolve) return getPartner();
				return basicGetPartner();
			case EdmPackage.OD_NAVIGATION_PROPERTY__NULLABLE:
				return getNullable();
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
			case EdmPackage.OD_NAVIGATION_PROPERTY__CONTAINS_TARGET:
				setContainsTarget((Boolean)newValue);
				return;
			case EdmPackage.OD_NAVIGATION_PROPERTY__PARTNER:
				setPartner((ODNavigationProperty)newValue);
				return;
			case EdmPackage.OD_NAVIGATION_PROPERTY__NULLABLE:
				setNullable((Boolean)newValue);
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
			case EdmPackage.OD_NAVIGATION_PROPERTY__CONTAINS_TARGET:
				setContainsTarget(CONTAINS_TARGET_EDEFAULT);
				return;
			case EdmPackage.OD_NAVIGATION_PROPERTY__PARTNER:
				setPartner((ODNavigationProperty)null);
				return;
			case EdmPackage.OD_NAVIGATION_PROPERTY__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
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
			case EdmPackage.OD_NAVIGATION_PROPERTY__CONTAINS_TARGET:
				return CONTAINS_TARGET_EDEFAULT == null ? containsTarget != null : !CONTAINS_TARGET_EDEFAULT.equals(containsTarget);
			case EdmPackage.OD_NAVIGATION_PROPERTY__PARTNER:
				return partner != null;
			case EdmPackage.OD_NAVIGATION_PROPERTY__NULLABLE:
				return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
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
		result.append(" (containsTarget: ");
		result.append(containsTarget);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(')');
		return result.toString();
	}

} //ODNavigationPropertyImpl
