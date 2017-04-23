/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODEntitySet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Entity Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.ODEntitySetImpl#getIncludeInServiceDocument <em>Include In Service Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODEntitySetImpl extends ODExposedEntityTypeImpl implements ODEntitySet {
	/**
	 * The default value of the '{@link #getIncludeInServiceDocument() <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeInServiceDocument()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeInServiceDocument() <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeInServiceDocument()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeInServiceDocument = INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODEntitySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.OD_ENTITY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncludeInServiceDocument() {
		return includeInServiceDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeInServiceDocument(Boolean newIncludeInServiceDocument) {
		Boolean oldIncludeInServiceDocument = includeInServiceDocument;
		includeInServiceDocument = newIncludeInServiceDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_ENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT, oldIncludeInServiceDocument, includeInServiceDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdmPackage.OD_ENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT:
				return getIncludeInServiceDocument();
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
			case EdmPackage.OD_ENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT:
				setIncludeInServiceDocument((Boolean)newValue);
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
			case EdmPackage.OD_ENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT:
				setIncludeInServiceDocument(INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT);
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
			case EdmPackage.OD_ENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT:
				return INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT == null ? includeInServiceDocument != null : !INCLUDE_IN_SERVICE_DOCUMENT_EDEFAULT.equals(includeInServiceDocument);
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
		result.append(" (includeInServiceDocument: ");
		result.append(includeInServiceDocument);
		result.append(')');
		return result.toString();
	}

} //ODEntitySetImpl
