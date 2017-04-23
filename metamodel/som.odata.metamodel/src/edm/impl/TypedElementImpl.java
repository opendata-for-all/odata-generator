/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODType;
import edm.TypedElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.TypedElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link edm.impl.TypedElementImpl#getMultivalued <em>Multivalued</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedElementImpl extends MinimalEObjectImpl.Container implements TypedElement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ODType type;

	/**
	 * The default value of the '{@link #getMultivalued() <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultivalued()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTIVALUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultivalued() <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultivalued()
	 * @generated
	 * @ordered
	 */
	protected Boolean multivalued = MULTIVALUED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.TYPED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (ODType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdmPackage.TYPED_ELEMENT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ODType newType) {
		ODType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TYPED_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMultivalued() {
		return multivalued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultivalued(Boolean newMultivalued) {
		Boolean oldMultivalued = multivalued;
		multivalued = newMultivalued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TYPED_ELEMENT__MULTIVALUED, oldMultivalued, multivalued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdmPackage.TYPED_ELEMENT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case EdmPackage.TYPED_ELEMENT__MULTIVALUED:
				return getMultivalued();
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
			case EdmPackage.TYPED_ELEMENT__TYPE:
				setType((ODType)newValue);
				return;
			case EdmPackage.TYPED_ELEMENT__MULTIVALUED:
				setMultivalued((Boolean)newValue);
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
			case EdmPackage.TYPED_ELEMENT__TYPE:
				setType((ODType)null);
				return;
			case EdmPackage.TYPED_ELEMENT__MULTIVALUED:
				setMultivalued(MULTIVALUED_EDEFAULT);
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
			case EdmPackage.TYPED_ELEMENT__TYPE:
				return type != null;
			case EdmPackage.TYPED_ELEMENT__MULTIVALUED:
				return MULTIVALUED_EDEFAULT == null ? multivalued != null : !MULTIVALUED_EDEFAULT.equals(multivalued);
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
		result.append(" (multivalued: ");
		result.append(multivalued);
		result.append(')');
		return result.toString();
	}

} //TypedElementImpl
