/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODEnumType;

import edm.ODMember;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Enum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.ODEnumTypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link edm.impl.ODEnumTypeImpl#getIsFlags <em>Is Flags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODEnumTypeImpl extends ODPrimitiveTypeImpl implements ODEnumType {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<ODMember> members;

	/**
	 * The default value of the '{@link #getIsFlags() <em>Is Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FLAGS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getIsFlags() <em>Is Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFlags()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFlags = IS_FLAGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODEnumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.OD_ENUM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODMember> getMembers() {
		if (members == null) {
			members = new EObjectContainmentEList<ODMember>(ODMember.class, this, EdmPackage.OD_ENUM_TYPE__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFlags() {
		return isFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFlags(Boolean newIsFlags) {
		Boolean oldIsFlags = isFlags;
		isFlags = newIsFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_ENUM_TYPE__IS_FLAGS, oldIsFlags, isFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.OD_ENUM_TYPE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.OD_ENUM_TYPE__MEMBERS:
				return getMembers();
			case EdmPackage.OD_ENUM_TYPE__IS_FLAGS:
				return getIsFlags();
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
			case EdmPackage.OD_ENUM_TYPE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends ODMember>)newValue);
				return;
			case EdmPackage.OD_ENUM_TYPE__IS_FLAGS:
				setIsFlags((Boolean)newValue);
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
			case EdmPackage.OD_ENUM_TYPE__MEMBERS:
				getMembers().clear();
				return;
			case EdmPackage.OD_ENUM_TYPE__IS_FLAGS:
				setIsFlags(IS_FLAGS_EDEFAULT);
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
			case EdmPackage.OD_ENUM_TYPE__MEMBERS:
				return members != null && !members.isEmpty();
			case EdmPackage.OD_ENUM_TYPE__IS_FLAGS:
				return IS_FLAGS_EDEFAULT == null ? isFlags != null : !IS_FLAGS_EDEFAULT.equals(isFlags);
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
		result.append(" (isFlags: ");
		result.append(isFlags);
		result.append(')');
		return result.toString();
	}

} //ODEnumTypeImpl
