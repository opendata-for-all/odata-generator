/**
 */
package eer.impl;

import eer.EerPackage;
import eer.EntityType;
import eer.RelationshipLink;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eer.impl.EntityTypeImpl#getRelationshipLink <em>Relationship Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityTypeImpl extends ElementImpl implements EntityType {
	/**
	 * The cached value of the '{@link #getRelationshipLink() <em>Relationship Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipLink()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipLink> relationshipLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EerPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipLink> getRelationshipLink() {
		if (relationshipLink == null) {
			relationshipLink = new EObjectWithInverseResolvingEList<RelationshipLink>(RelationshipLink.class, this, EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK, EerPackage.RELATIONSHIP_LINK__SOURCE);
		}
		return relationshipLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationshipLink()).basicAdd(otherEnd, msgs);
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
			case EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK:
				return ((InternalEList<?>)getRelationshipLink()).basicRemove(otherEnd, msgs);
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
			case EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK:
				return getRelationshipLink();
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
			case EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK:
				getRelationshipLink().clear();
				getRelationshipLink().addAll((Collection<? extends RelationshipLink>)newValue);
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
			case EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK:
				getRelationshipLink().clear();
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
			case EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK:
				return relationshipLink != null && !relationshipLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityTypeImpl
