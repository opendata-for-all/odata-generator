/**
 */
package eer.impl;

import eer.CardinalityType;
import eer.CompletenessType;
import eer.EerPackage;
import eer.EntityType;
import eer.Relationship;
import eer.RelationshipLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eer.impl.RelationshipLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eer.impl.RelationshipLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link eer.impl.RelationshipLinkImpl#getParticipation <em>Participation</em>}</li>
 *   <li>{@link eer.impl.RelationshipLinkImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link eer.impl.RelationshipLinkImpl#getRole <em>Role</em>}</li>
 *   <li>{@link eer.impl.RelationshipLinkImpl#isIsIdentifier <em>Is Identifier</em>}</li>
 *   <li>{@link eer.impl.RelationshipLinkImpl#isChosenLink <em>Chosen Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipLinkImpl extends LinkImpl implements RelationshipLink {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EntityType source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Relationship target;

	/**
	 * The default value of the '{@link #getParticipation() <em>Participation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipation()
	 * @generated
	 * @ordered
	 */
	protected static final CompletenessType PARTICIPATION_EDEFAULT = CompletenessType.PARTIAL;

	/**
	 * The cached value of the '{@link #getParticipation() <em>Participation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipation()
	 * @generated
	 * @ordered
	 */
	protected CompletenessType participation = PARTICIPATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final CardinalityType CARDINALITY_EDEFAULT = CardinalityType.ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected CardinalityType cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * The default value of the '{@link #isChosenLink() <em>Chosen Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChosenLink()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHOSEN_LINK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChosenLink() <em>Chosen Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChosenLink()
	 * @generated
	 * @ordered
	 */
	protected boolean chosenLink = CHOSEN_LINK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EerPackage.Literals.RELATIONSHIP_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (EntityType)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EerPackage.RELATIONSHIP_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(EntityType newSource, NotificationChain msgs) {
		EntityType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(EntityType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK, EntityType.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK, EntityType.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Relationship)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EerPackage.RELATIONSHIP_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Relationship newTarget, NotificationChain msgs) {
		Relationship oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Relationship newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EerPackage.RELATIONSHIP__RELATIONSHIP_LINK, Relationship.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EerPackage.RELATIONSHIP__RELATIONSHIP_LINK, Relationship.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletenessType getParticipation() {
		return participation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipation(CompletenessType newParticipation) {
		CompletenessType oldParticipation = participation;
		participation = newParticipation == null ? PARTICIPATION_EDEFAULT : newParticipation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__PARTICIPATION, oldParticipation, participation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(CardinalityType newCardinality) {
		CardinalityType oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__ROLE, oldRole, role));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__IS_IDENTIFIER, oldIsIdentifier, isIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChosenLink() {
		return chosenLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChosenLink(boolean newChosenLink) {
		boolean oldChosenLink = chosenLink;
		chosenLink = newChosenLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.RELATIONSHIP_LINK__CHOSEN_LINK, oldChosenLink, chosenLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EerPackage.RELATIONSHIP_LINK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, EerPackage.ENTITY_TYPE__RELATIONSHIP_LINK, EntityType.class, msgs);
				return basicSetSource((EntityType)otherEnd, msgs);
			case EerPackage.RELATIONSHIP_LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, EerPackage.RELATIONSHIP__RELATIONSHIP_LINK, Relationship.class, msgs);
				return basicSetTarget((Relationship)otherEnd, msgs);
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
			case EerPackage.RELATIONSHIP_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case EerPackage.RELATIONSHIP_LINK__TARGET:
				return basicSetTarget(null, msgs);
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
			case EerPackage.RELATIONSHIP_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case EerPackage.RELATIONSHIP_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case EerPackage.RELATIONSHIP_LINK__PARTICIPATION:
				return getParticipation();
			case EerPackage.RELATIONSHIP_LINK__CARDINALITY:
				return getCardinality();
			case EerPackage.RELATIONSHIP_LINK__ROLE:
				return getRole();
			case EerPackage.RELATIONSHIP_LINK__IS_IDENTIFIER:
				return isIsIdentifier();
			case EerPackage.RELATIONSHIP_LINK__CHOSEN_LINK:
				return isChosenLink();
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
			case EerPackage.RELATIONSHIP_LINK__SOURCE:
				setSource((EntityType)newValue);
				return;
			case EerPackage.RELATIONSHIP_LINK__TARGET:
				setTarget((Relationship)newValue);
				return;
			case EerPackage.RELATIONSHIP_LINK__PARTICIPATION:
				setParticipation((CompletenessType)newValue);
				return;
			case EerPackage.RELATIONSHIP_LINK__CARDINALITY:
				setCardinality((CardinalityType)newValue);
				return;
			case EerPackage.RELATIONSHIP_LINK__ROLE:
				setRole((String)newValue);
				return;
			case EerPackage.RELATIONSHIP_LINK__IS_IDENTIFIER:
				setIsIdentifier((Boolean)newValue);
				return;
			case EerPackage.RELATIONSHIP_LINK__CHOSEN_LINK:
				setChosenLink((Boolean)newValue);
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
			case EerPackage.RELATIONSHIP_LINK__SOURCE:
				setSource((EntityType)null);
				return;
			case EerPackage.RELATIONSHIP_LINK__TARGET:
				setTarget((Relationship)null);
				return;
			case EerPackage.RELATIONSHIP_LINK__PARTICIPATION:
				setParticipation(PARTICIPATION_EDEFAULT);
				return;
			case EerPackage.RELATIONSHIP_LINK__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case EerPackage.RELATIONSHIP_LINK__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case EerPackage.RELATIONSHIP_LINK__IS_IDENTIFIER:
				setIsIdentifier(IS_IDENTIFIER_EDEFAULT);
				return;
			case EerPackage.RELATIONSHIP_LINK__CHOSEN_LINK:
				setChosenLink(CHOSEN_LINK_EDEFAULT);
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
			case EerPackage.RELATIONSHIP_LINK__SOURCE:
				return source != null;
			case EerPackage.RELATIONSHIP_LINK__TARGET:
				return target != null;
			case EerPackage.RELATIONSHIP_LINK__PARTICIPATION:
				return participation != PARTICIPATION_EDEFAULT;
			case EerPackage.RELATIONSHIP_LINK__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case EerPackage.RELATIONSHIP_LINK__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case EerPackage.RELATIONSHIP_LINK__IS_IDENTIFIER:
				return isIdentifier != IS_IDENTIFIER_EDEFAULT;
			case EerPackage.RELATIONSHIP_LINK__CHOSEN_LINK:
				return chosenLink != CHOSEN_LINK_EDEFAULT;
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
		result.append(" (participation: ");
		result.append(participation);
		result.append(", cardinality: ");
		result.append(cardinality);
		result.append(", role: ");
		result.append(role);
		result.append(", isIdentifier: ");
		result.append(isIdentifier);
		result.append(", chosenLink: ");
		result.append(chosenLink);
		result.append(')');
		return result.toString();
	}

} //RelationshipLinkImpl
