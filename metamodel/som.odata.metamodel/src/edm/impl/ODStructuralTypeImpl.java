/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODAnnotable;
import edm.ODAnnotation;
import edm.ODElement;
import edm.ODStructuralType;

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
 * An implementation of the model object '<em><b>OD Structural Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.ODStructuralTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link edm.impl.ODStructuralTypeImpl#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link edm.impl.ODStructuralTypeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link edm.impl.ODStructuralTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link edm.impl.ODStructuralTypeImpl#getOpenType <em>Open Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODStructuralTypeImpl extends ODTypeImpl implements ODStructuralType {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<ODAnnotation> annotations;

	/**
	 * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseType()
	 * @generated
	 * @ordered
	 */
	protected ODStructuralType baseType;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ODElement> elements;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpenType() <em>Open Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenType()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean OPEN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenType() <em>Open Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenType()
	 * @generated
	 * @ordered
	 */
	protected Boolean openType = OPEN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODStructuralTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.OD_STRUCTURAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<ODAnnotation>(ODAnnotation.class, this, EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODStructuralType getBaseType() {
		if (baseType != null && baseType.eIsProxy()) {
			InternalEObject oldBaseType = (InternalEObject)baseType;
			baseType = (ODStructuralType)eResolveProxy(oldBaseType);
			if (baseType != oldBaseType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdmPackage.OD_STRUCTURAL_TYPE__BASE_TYPE, oldBaseType, baseType));
			}
		}
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODStructuralType basicGetBaseType() {
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseType(ODStructuralType newBaseType) {
		ODStructuralType oldBaseType = baseType;
		baseType = newBaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_STRUCTURAL_TYPE__BASE_TYPE, oldBaseType, baseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ODElement>(ODElement.class, this, EdmPackage.OD_STRUCTURAL_TYPE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_STRUCTURAL_TYPE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOpenType() {
		return openType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenType(Boolean newOpenType) {
		Boolean oldOpenType = openType;
		openType = newOpenType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_STRUCTURAL_TYPE__OPEN_TYPE, oldOpenType, openType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case EdmPackage.OD_STRUCTURAL_TYPE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS:
				return getAnnotations();
			case EdmPackage.OD_STRUCTURAL_TYPE__BASE_TYPE:
				if (resolve) return getBaseType();
				return basicGetBaseType();
			case EdmPackage.OD_STRUCTURAL_TYPE__ELEMENTS:
				return getElements();
			case EdmPackage.OD_STRUCTURAL_TYPE__ABSTRACT:
				return getAbstract();
			case EdmPackage.OD_STRUCTURAL_TYPE__OPEN_TYPE:
				return getOpenType();
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
			case EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends ODAnnotation>)newValue);
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__BASE_TYPE:
				setBaseType((ODStructuralType)newValue);
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ODElement>)newValue);
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__OPEN_TYPE:
				setOpenType((Boolean)newValue);
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
			case EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__BASE_TYPE:
				setBaseType((ODStructuralType)null);
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__ELEMENTS:
				getElements().clear();
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__OPEN_TYPE:
				setOpenType(OPEN_TYPE_EDEFAULT);
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
			case EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case EdmPackage.OD_STRUCTURAL_TYPE__BASE_TYPE:
				return baseType != null;
			case EdmPackage.OD_STRUCTURAL_TYPE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case EdmPackage.OD_STRUCTURAL_TYPE__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case EdmPackage.OD_STRUCTURAL_TYPE__OPEN_TYPE:
				return OPEN_TYPE_EDEFAULT == null ? openType != null : !OPEN_TYPE_EDEFAULT.equals(openType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ODAnnotable.class) {
			switch (derivedFeatureID) {
				case EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS: return EdmPackage.OD_ANNOTABLE__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ODAnnotable.class) {
			switch (baseFeatureID) {
				case EdmPackage.OD_ANNOTABLE__ANNOTATIONS: return EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", openType: ");
		result.append(openType);
		result.append(')');
		return result.toString();
	}

} //ODStructuralTypeImpl
