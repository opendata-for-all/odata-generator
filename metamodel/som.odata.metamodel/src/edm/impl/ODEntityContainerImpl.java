/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODAnnotable;
import edm.ODAnnotation;
import edm.ODEntityContainer;
import edm.ODEntitySet;
import edm.ODSingleton;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OD Entity Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.ODEntityContainerImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link edm.impl.ODEntityContainerImpl#getEntitySets <em>Entity Sets</em>}</li>
 *   <li>{@link edm.impl.ODEntityContainerImpl#getSingletons <em>Singletons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODEntityContainerImpl extends ODNamedElementImpl implements ODEntityContainer {
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
	 * The cached value of the '{@link #getEntitySets() <em>Entity Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySets()
	 * @generated
	 * @ordered
	 */
	protected EList<ODEntitySet> entitySets;

	/**
	 * The cached value of the '{@link #getSingletons() <em>Singletons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingletons()
	 * @generated
	 * @ordered
	 */
	protected EList<ODSingleton> singletons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODEntityContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.OD_ENTITY_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<ODAnnotation>(ODAnnotation.class, this, EdmPackage.OD_ENTITY_CONTAINER__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODEntitySet> getEntitySets() {
		if (entitySets == null) {
			entitySets = new EObjectContainmentEList<ODEntitySet>(ODEntitySet.class, this, EdmPackage.OD_ENTITY_CONTAINER__ENTITY_SETS);
		}
		return entitySets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODSingleton> getSingletons() {
		if (singletons == null) {
			singletons = new EObjectContainmentEList<ODSingleton>(ODSingleton.class, this, EdmPackage.OD_ENTITY_CONTAINER__SINGLETONS);
		}
		return singletons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.OD_ENTITY_CONTAINER__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case EdmPackage.OD_ENTITY_CONTAINER__ENTITY_SETS:
				return ((InternalEList<?>)getEntitySets()).basicRemove(otherEnd, msgs);
			case EdmPackage.OD_ENTITY_CONTAINER__SINGLETONS:
				return ((InternalEList<?>)getSingletons()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.OD_ENTITY_CONTAINER__ANNOTATIONS:
				return getAnnotations();
			case EdmPackage.OD_ENTITY_CONTAINER__ENTITY_SETS:
				return getEntitySets();
			case EdmPackage.OD_ENTITY_CONTAINER__SINGLETONS:
				return getSingletons();
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
			case EdmPackage.OD_ENTITY_CONTAINER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends ODAnnotation>)newValue);
				return;
			case EdmPackage.OD_ENTITY_CONTAINER__ENTITY_SETS:
				getEntitySets().clear();
				getEntitySets().addAll((Collection<? extends ODEntitySet>)newValue);
				return;
			case EdmPackage.OD_ENTITY_CONTAINER__SINGLETONS:
				getSingletons().clear();
				getSingletons().addAll((Collection<? extends ODSingleton>)newValue);
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
			case EdmPackage.OD_ENTITY_CONTAINER__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case EdmPackage.OD_ENTITY_CONTAINER__ENTITY_SETS:
				getEntitySets().clear();
				return;
			case EdmPackage.OD_ENTITY_CONTAINER__SINGLETONS:
				getSingletons().clear();
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
			case EdmPackage.OD_ENTITY_CONTAINER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case EdmPackage.OD_ENTITY_CONTAINER__ENTITY_SETS:
				return entitySets != null && !entitySets.isEmpty();
			case EdmPackage.OD_ENTITY_CONTAINER__SINGLETONS:
				return singletons != null && !singletons.isEmpty();
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
				case EdmPackage.OD_ENTITY_CONTAINER__ANNOTATIONS: return EdmPackage.OD_ANNOTABLE__ANNOTATIONS;
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
				case EdmPackage.OD_ANNOTABLE__ANNOTATIONS: return EdmPackage.OD_ENTITY_CONTAINER__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ODEntityContainerImpl
