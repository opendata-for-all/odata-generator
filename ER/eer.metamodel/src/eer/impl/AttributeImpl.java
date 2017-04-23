/**
 */
package eer.impl;

import eer.Attribute;
import eer.AttributeLink;
import eer.AttributeType;
import eer.DataType;
import eer.EerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eer.impl.AttributeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#isIsNull <em>Is Null</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#isIsSequence <em>Is Sequence</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link eer.impl.AttributeImpl#getAttributeLinkTarget <em>Attribute Link Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends ElementImpl implements Attribute {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Float SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Float size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NULL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsNull() <em>Is Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNull()
	 * @generated
	 * @ordered
	 */
	protected boolean isNull = IS_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSequence() <em>Is Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSequence()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEQUENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSequence() <em>Is Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSequence()
	 * @generated
	 * @ordered
	 */
	protected boolean isSequence = IS_SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheck() <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheck() <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheck()
	 * @generated
	 * @ordered
	 */
	protected String check = CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeType TYPE_EDEFAULT = AttributeType.COMMON;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AttributeType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATA_TYPE_EDEFAULT = DataType.STRING;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Integer cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeLinkTarget() <em>Attribute Link Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeLinkTarget()
	 * @generated
	 * @ordered
	 */
	protected AttributeLink attributeLinkTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EerPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Float newSize) {
		Float oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNull() {
		return isNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNull(boolean newIsNull) {
		boolean oldIsNull = isNull;
		isNull = newIsNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__IS_NULL, oldIsNull, isNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSequence() {
		return isSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSequence(boolean newIsSequence) {
		boolean oldIsSequence = isSequence;
		isSequence = newIsSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__IS_SEQUENCE, oldIsSequence, isSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheck() {
		return check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheck(String newCheck) {
		String oldCheck = check;
		check = newCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__CHECK, oldCheck, check));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AttributeType newType) {
		AttributeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Integer newCardinality) {
		Integer oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLink getAttributeLinkTarget() {
		if (attributeLinkTarget != null && attributeLinkTarget.eIsProxy()) {
			InternalEObject oldAttributeLinkTarget = (InternalEObject)attributeLinkTarget;
			attributeLinkTarget = (AttributeLink)eResolveProxy(oldAttributeLinkTarget);
			if (attributeLinkTarget != oldAttributeLinkTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET, oldAttributeLinkTarget, attributeLinkTarget));
			}
		}
		return attributeLinkTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLink basicGetAttributeLinkTarget() {
		return attributeLinkTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeLinkTarget(AttributeLink newAttributeLinkTarget, NotificationChain msgs) {
		AttributeLink oldAttributeLinkTarget = attributeLinkTarget;
		attributeLinkTarget = newAttributeLinkTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET, oldAttributeLinkTarget, newAttributeLinkTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeLinkTarget(AttributeLink newAttributeLinkTarget) {
		if (newAttributeLinkTarget != attributeLinkTarget) {
			NotificationChain msgs = null;
			if (attributeLinkTarget != null)
				msgs = ((InternalEObject)attributeLinkTarget).eInverseRemove(this, EerPackage.ATTRIBUTE_LINK__TARGET, AttributeLink.class, msgs);
			if (newAttributeLinkTarget != null)
				msgs = ((InternalEObject)newAttributeLinkTarget).eInverseAdd(this, EerPackage.ATTRIBUTE_LINK__TARGET, AttributeLink.class, msgs);
			msgs = basicSetAttributeLinkTarget(newAttributeLinkTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET, newAttributeLinkTarget, newAttributeLinkTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET:
				if (attributeLinkTarget != null)
					msgs = ((InternalEObject)attributeLinkTarget).eInverseRemove(this, EerPackage.ATTRIBUTE_LINK__TARGET, AttributeLink.class, msgs);
				return basicSetAttributeLinkTarget((AttributeLink)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET:
				return basicSetAttributeLinkTarget(null, msgs);
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
			case EerPackage.ATTRIBUTE__COMMENT:
				return getComment();
			case EerPackage.ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case EerPackage.ATTRIBUTE__SIZE:
				return getSize();
			case EerPackage.ATTRIBUTE__IS_NULL:
				return isIsNull();
			case EerPackage.ATTRIBUTE__IS_UNIQUE:
				return isIsUnique();
			case EerPackage.ATTRIBUTE__IS_SEQUENCE:
				return isIsSequence();
			case EerPackage.ATTRIBUTE__IS_ORDERED:
				return isIsOrdered();
			case EerPackage.ATTRIBUTE__CHECK:
				return getCheck();
			case EerPackage.ATTRIBUTE__TYPE:
				return getType();
			case EerPackage.ATTRIBUTE__DATA_TYPE:
				return getDataType();
			case EerPackage.ATTRIBUTE__CARDINALITY:
				return getCardinality();
			case EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET:
				if (resolve) return getAttributeLinkTarget();
				return basicGetAttributeLinkTarget();
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
			case EerPackage.ATTRIBUTE__COMMENT:
				setComment((String)newValue);
				return;
			case EerPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case EerPackage.ATTRIBUTE__SIZE:
				setSize((Float)newValue);
				return;
			case EerPackage.ATTRIBUTE__IS_NULL:
				setIsNull((Boolean)newValue);
				return;
			case EerPackage.ATTRIBUTE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case EerPackage.ATTRIBUTE__IS_SEQUENCE:
				setIsSequence((Boolean)newValue);
				return;
			case EerPackage.ATTRIBUTE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case EerPackage.ATTRIBUTE__CHECK:
				setCheck((String)newValue);
				return;
			case EerPackage.ATTRIBUTE__TYPE:
				setType((AttributeType)newValue);
				return;
			case EerPackage.ATTRIBUTE__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case EerPackage.ATTRIBUTE__CARDINALITY:
				setCardinality((Integer)newValue);
				return;
			case EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET:
				setAttributeLinkTarget((AttributeLink)newValue);
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
			case EerPackage.ATTRIBUTE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__IS_NULL:
				setIsNull(IS_NULL_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__IS_SEQUENCE:
				setIsSequence(IS_SEQUENCE_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__CHECK:
				setCheck(CHECK_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET:
				setAttributeLinkTarget((AttributeLink)null);
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
			case EerPackage.ATTRIBUTE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case EerPackage.ATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case EerPackage.ATTRIBUTE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case EerPackage.ATTRIBUTE__IS_NULL:
				return isNull != IS_NULL_EDEFAULT;
			case EerPackage.ATTRIBUTE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case EerPackage.ATTRIBUTE__IS_SEQUENCE:
				return isSequence != IS_SEQUENCE_EDEFAULT;
			case EerPackage.ATTRIBUTE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case EerPackage.ATTRIBUTE__CHECK:
				return CHECK_EDEFAULT == null ? check != null : !CHECK_EDEFAULT.equals(check);
			case EerPackage.ATTRIBUTE__TYPE:
				return type != TYPE_EDEFAULT;
			case EerPackage.ATTRIBUTE__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case EerPackage.ATTRIBUTE__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
			case EerPackage.ATTRIBUTE__ATTRIBUTE_LINK_TARGET:
				return attributeLinkTarget != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", size: ");
		result.append(size);
		result.append(", isNull: ");
		result.append(isNull);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", isSequence: ");
		result.append(isSequence);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", check: ");
		result.append(check);
		result.append(", type: ");
		result.append(type);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
