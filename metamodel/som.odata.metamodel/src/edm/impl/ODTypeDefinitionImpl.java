/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODPrimitiveType;
import edm.ODTypeDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.ODTypeDefinitionImpl#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link edm.impl.ODTypeDefinitionImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link edm.impl.ODTypeDefinitionImpl#getUnicode <em>Unicode</em>}</li>
 *   <li>{@link edm.impl.ODTypeDefinitionImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link edm.impl.ODTypeDefinitionImpl#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODTypeDefinitionImpl extends MinimalEObjectImpl.Container implements ODTypeDefinition {
	/**
	 * The cached value of the '{@link #getUnderlyingType() <em>Underlying Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnderlyingType()
	 * @generated
	 * @ordered
	 */
	protected ODPrimitiveType underlyingType;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Integer scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnicode() <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnicode()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNICODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnicode() <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnicode()
	 * @generated
	 * @ordered
	 */
	protected Boolean unicode = UNICODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Integer precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODTypeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.OD_TYPE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODPrimitiveType getUnderlyingType() {
		if (underlyingType != null && underlyingType.eIsProxy()) {
			InternalEObject oldUnderlyingType = (InternalEObject)underlyingType;
			underlyingType = (ODPrimitiveType)eResolveProxy(oldUnderlyingType);
			if (underlyingType != oldUnderlyingType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdmPackage.OD_TYPE_DEFINITION__UNDERLYING_TYPE, oldUnderlyingType, underlyingType));
			}
		}
		return underlyingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODPrimitiveType basicGetUnderlyingType() {
		return underlyingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnderlyingType(ODPrimitiveType newUnderlyingType) {
		ODPrimitiveType oldUnderlyingType = underlyingType;
		underlyingType = newUnderlyingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_TYPE_DEFINITION__UNDERLYING_TYPE, oldUnderlyingType, underlyingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Integer newScale) {
		Integer oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_TYPE_DEFINITION__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUnicode() {
		return unicode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnicode(Boolean newUnicode) {
		Boolean oldUnicode = unicode;
		unicode = newUnicode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_TYPE_DEFINITION__UNICODE, oldUnicode, unicode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Integer newPrecision) {
		Integer oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_TYPE_DEFINITION__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_TYPE_DEFINITION__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdmPackage.OD_TYPE_DEFINITION__UNDERLYING_TYPE:
				if (resolve) return getUnderlyingType();
				return basicGetUnderlyingType();
			case EdmPackage.OD_TYPE_DEFINITION__SCALE:
				return getScale();
			case EdmPackage.OD_TYPE_DEFINITION__UNICODE:
				return getUnicode();
			case EdmPackage.OD_TYPE_DEFINITION__PRECISION:
				return getPrecision();
			case EdmPackage.OD_TYPE_DEFINITION__MAX_LENGTH:
				return getMaxLength();
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
			case EdmPackage.OD_TYPE_DEFINITION__UNDERLYING_TYPE:
				setUnderlyingType((ODPrimitiveType)newValue);
				return;
			case EdmPackage.OD_TYPE_DEFINITION__SCALE:
				setScale((Integer)newValue);
				return;
			case EdmPackage.OD_TYPE_DEFINITION__UNICODE:
				setUnicode((Boolean)newValue);
				return;
			case EdmPackage.OD_TYPE_DEFINITION__PRECISION:
				setPrecision((Integer)newValue);
				return;
			case EdmPackage.OD_TYPE_DEFINITION__MAX_LENGTH:
				setMaxLength((Integer)newValue);
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
			case EdmPackage.OD_TYPE_DEFINITION__UNDERLYING_TYPE:
				setUnderlyingType((ODPrimitiveType)null);
				return;
			case EdmPackage.OD_TYPE_DEFINITION__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case EdmPackage.OD_TYPE_DEFINITION__UNICODE:
				setUnicode(UNICODE_EDEFAULT);
				return;
			case EdmPackage.OD_TYPE_DEFINITION__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case EdmPackage.OD_TYPE_DEFINITION__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
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
			case EdmPackage.OD_TYPE_DEFINITION__UNDERLYING_TYPE:
				return underlyingType != null;
			case EdmPackage.OD_TYPE_DEFINITION__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case EdmPackage.OD_TYPE_DEFINITION__UNICODE:
				return UNICODE_EDEFAULT == null ? unicode != null : !UNICODE_EDEFAULT.equals(unicode);
			case EdmPackage.OD_TYPE_DEFINITION__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case EdmPackage.OD_TYPE_DEFINITION__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
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
		result.append(" (scale: ");
		result.append(scale);
		result.append(", unicode: ");
		result.append(unicode);
		result.append(", precision: ");
		result.append(precision);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(')');
		return result.toString();
	}

} //ODTypeDefinitionImpl
