/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODAnnotable;
import edm.ODAnnotation;
import edm.ODEntityType;
import edm.ODExposedEntityType;
import edm.ODNavigationPropertyBinding;

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
 * An implementation of the model object '<em><b>OD Exposed Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.ODExposedEntityTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link edm.impl.ODExposedEntityTypeImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link edm.impl.ODExposedEntityTypeImpl#getNavigationPropertyBindings <em>Navigation Property Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODExposedEntityTypeImpl extends ODNamedElementImpl implements ODExposedEntityType {
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
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected ODEntityType entityType;

	/**
	 * The cached value of the '{@link #getNavigationPropertyBindings() <em>Navigation Property Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationPropertyBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ODNavigationPropertyBinding> navigationPropertyBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODExposedEntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.OD_EXPOSED_ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<ODAnnotation>(ODAnnotation.class, this, EdmPackage.OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODEntityType getEntityType() {
		if (entityType != null && entityType.eIsProxy()) {
			InternalEObject oldEntityType = (InternalEObject)entityType;
			entityType = (ODEntityType)eResolveProxy(oldEntityType);
			if (entityType != oldEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EdmPackage.OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE, oldEntityType, entityType));
			}
		}
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODEntityType basicGetEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(ODEntityType newEntityType) {
		ODEntityType oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODNavigationPropertyBinding> getNavigationPropertyBindings() {
		if (navigationPropertyBindings == null) {
			navigationPropertyBindings = new EObjectContainmentEList<ODNavigationPropertyBinding>(ODNavigationPropertyBinding.class, this, EdmPackage.OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS);
		}
		return navigationPropertyBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS:
				return ((InternalEList<?>)getNavigationPropertyBindings()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS:
				return getAnnotations();
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS:
				return getNavigationPropertyBindings();
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
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends ODAnnotation>)newValue);
				return;
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE:
				setEntityType((ODEntityType)newValue);
				return;
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS:
				getNavigationPropertyBindings().clear();
				getNavigationPropertyBindings().addAll((Collection<? extends ODNavigationPropertyBinding>)newValue);
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
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE:
				setEntityType((ODEntityType)null);
				return;
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS:
				getNavigationPropertyBindings().clear();
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
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE:
				return entityType != null;
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS:
				return navigationPropertyBindings != null && !navigationPropertyBindings.isEmpty();
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
				case EdmPackage.OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS: return EdmPackage.OD_ANNOTABLE__ANNOTATIONS;
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
				case EdmPackage.OD_ANNOTABLE__ANNOTATIONS: return EdmPackage.OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ODExposedEntityTypeImpl
