/**
 */
package eer.impl;

import eer.AssociativeEntity;
import eer.EerPackage;
import eer.Relationship;
import eer.RelationshipLink;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eer.impl.RelationshipImpl#isIsIdentifier <em>Is Identifier</em>}</li>
 *   <li>{@link eer.impl.RelationshipImpl#isCreateSurrogateKey <em>Create Surrogate Key</em>}</li>
 *   <li>{@link eer.impl.RelationshipImpl#getRelationshipLink <em>Relationship Link</em>}</li>
 *   <li>{@link eer.impl.RelationshipImpl#getAssociativeEntity <em>Associative Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends ElementImpl implements Relationship {
	/**
	 * The default value of the '{@link #isIsIdentifier() <em>Is Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IDENTIFIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIdentifier() <em>Is Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIdentifier()
	 * @generated
	 * @ordered
	 */
	protected boolean isIdentifier = IS_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isCreateSurrogateKey() <em>Create Surrogate Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateSurrogateKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_SURROGATE_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateSurrogateKey() <em>Create Surrogate Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateSurrogateKey()
	 * @generated
	 * @ordered
	 */
	protected boolean createSurrogateKey = CREATE_SURROGATE_KEY_EDEFAULT;

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
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EerPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIdentifier() {
		return isIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIdentifier(boolean newIsIdentifier) {
		boolean oldIsIdentifier = isIdentifier;
		isIdentifier = newIsIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP__IS_IDENTIFIER, oldIsIdentifier, isIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateSurrogateKey() {
		return createSurrogateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateSurrogateKey(boolean newCreateSurrogateKey) {
		boolean oldCreateSurrogateKey = createSurrogateKey;
		createSurrogateKey = newCreateSurrogateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP__CREATE_SURROGATE_KEY, oldCreateSurrogateKey, createSurrogateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipLink> getRelationshipLink() {
		if (relationshipLink == null) {
			relationshipLink = new EObjectWithInverseResolvingEList<RelationshipLink>(RelationshipLink.class, this, EerPackage.RELATIONSHIP__RELATIONSHIP_LINK, EerPackage.RELATIONSHIP_LINK__TARGET);
		}
		return relationshipLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociativeEntity getAssociativeEntity() {
		if (eContainerFeatureID() != EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY) return null;
		return (AssociativeEntity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociativeEntity(AssociativeEntity newAssociativeEntity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssociativeEntity, EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociativeEntity(AssociativeEntity newAssociativeEntity) {
		if (newAssociativeEntity != eInternalContainer() || (eContainerFeatureID() != EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY && newAssociativeEntity != null)) {
			if (EcoreUtil.isAncestor(this, newAssociativeEntity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociativeEntity != null)
				msgs = ((InternalEObject)newAssociativeEntity).eInverseAdd(this, EerPackage.ASSOCIATIVE_ENTITY__CONTAINS, AssociativeEntity.class, msgs);
			msgs = basicSetAssociativeEntity(newAssociativeEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY, newAssociativeEntity, newAssociativeEntity));
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
			case EerPackage.RELATIONSHIP__RELATIONSHIP_LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationshipLink()).basicAdd(otherEnd, msgs);
			case EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssociativeEntity((AssociativeEntity)otherEnd, msgs);
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
			case EerPackage.RELATIONSHIP__RELATIONSHIP_LINK:
				return ((InternalEList<?>)getRelationshipLink()).basicRemove(otherEnd, msgs);
			case EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY:
				return basicSetAssociativeEntity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY:
				return eInternalContainer().eInverseRemove(this, EerPackage.ASSOCIATIVE_ENTITY__CONTAINS, AssociativeEntity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EerPackage.RELATIONSHIP__IS_IDENTIFIER:
				return isIsIdentifier();
			case EerPackage.RELATIONSHIP__CREATE_SURROGATE_KEY:
				return isCreateSurrogateKey();
			case EerPackage.RELATIONSHIP__RELATIONSHIP_LINK:
				return getRelationshipLink();
			case EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY:
				return getAssociativeEntity();
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
			case EerPackage.RELATIONSHIP__IS_IDENTIFIER:
				setIsIdentifier((Boolean)newValue);
				return;
			case EerPackage.RELATIONSHIP__CREATE_SURROGATE_KEY:
				setCreateSurrogateKey((Boolean)newValue);
				return;
			case EerPackage.RELATIONSHIP__RELATIONSHIP_LINK:
				getRelationshipLink().clear();
				getRelationshipLink().addAll((Collection<? extends RelationshipLink>)newValue);
				return;
			case EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY:
				setAssociativeEntity((AssociativeEntity)newValue);
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
			case EerPackage.RELATIONSHIP__IS_IDENTIFIER:
				setIsIdentifier(IS_IDENTIFIER_EDEFAULT);
				return;
			case EerPackage.RELATIONSHIP__CREATE_SURROGATE_KEY:
				setCreateSurrogateKey(CREATE_SURROGATE_KEY_EDEFAULT);
				return;
			case EerPackage.RELATIONSHIP__RELATIONSHIP_LINK:
				getRelationshipLink().clear();
				return;
			case EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY:
				setAssociativeEntity((AssociativeEntity)null);
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
			case EerPackage.RELATIONSHIP__IS_IDENTIFIER:
				return isIdentifier != IS_IDENTIFIER_EDEFAULT;
			case EerPackage.RELATIONSHIP__CREATE_SURROGATE_KEY:
				return createSurrogateKey != CREATE_SURROGATE_KEY_EDEFAULT;
			case EerPackage.RELATIONSHIP__RELATIONSHIP_LINK:
				return relationshipLink != null && !relationshipLink.isEmpty();
			case EerPackage.RELATIONSHIP__ASSOCIATIVE_ENTITY:
				return getAssociativeEntity() != null;
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
		result.append(" (isIdentifier: ");
		result.append(isIdentifier);
		result.append(", createSurrogateKey: ");
		result.append(createSurrogateKey);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
