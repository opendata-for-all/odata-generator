/**
 */
package eer.impl;

import eer.CategoryGL;
import eer.CategorySL;
import eer.DirectInheritanceLink;
import eer.EerPackage;
import eer.Entity;
import eer.InheritanceGL;
import eer.InheritanceSL;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eer.impl.EntityImpl#isIsWeak <em>Is Weak</em>}</li>
 *   <li>{@link eer.impl.EntityImpl#getDirectInheritanceLinkTarget <em>Direct Inheritance Link Target</em>}</li>
 *   <li>{@link eer.impl.EntityImpl#getDirectInheritanceLinkSource <em>Direct Inheritance Link Source</em>}</li>
 *   <li>{@link eer.impl.EntityImpl#getInheritanceSL <em>Inheritance SL</em>}</li>
 *   <li>{@link eer.impl.EntityImpl#getInheritanceGL <em>Inheritance GL</em>}</li>
 *   <li>{@link eer.impl.EntityImpl#getCategorySL <em>Category SL</em>}</li>
 *   <li>{@link eer.impl.EntityImpl#getCategoryGL <em>Category GL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends EntityTypeImpl implements Entity {
	/**
	 * The default value of the '{@link #isIsWeak() <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWeak()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WEAK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWeak() <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWeak()
	 * @generated
	 * @ordered
	 */
	protected boolean isWeak = IS_WEAK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirectInheritanceLinkTarget() <em>Direct Inheritance Link Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectInheritanceLinkTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectInheritanceLink> directInheritanceLinkTarget;

	/**
	 * The cached value of the '{@link #getDirectInheritanceLinkSource() <em>Direct Inheritance Link Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectInheritanceLinkSource()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectInheritanceLink> directInheritanceLinkSource;

	/**
	 * The cached value of the '{@link #getInheritanceSL() <em>Inheritance SL</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceSL()
	 * @generated
	 * @ordered
	 */
	protected EList<InheritanceSL> inheritanceSL;

	/**
	 * The cached value of the '{@link #getInheritanceGL() <em>Inheritance GL</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceGL()
	 * @generated
	 * @ordered
	 */
	protected EList<InheritanceGL> inheritanceGL;

	/**
	 * The cached value of the '{@link #getCategorySL() <em>Category SL</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorySL()
	 * @generated
	 * @ordered
	 */
	protected EList<CategorySL> categorySL;

	/**
	 * The cached value of the '{@link #getCategoryGL() <em>Category GL</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryGL()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryGL> categoryGL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EerPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWeak() {
		return isWeak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWeak(boolean newIsWeak) {
		boolean oldIsWeak = isWeak;
		isWeak = newIsWeak;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.ENTITY__IS_WEAK, oldIsWeak, isWeak));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectInheritanceLink> getDirectInheritanceLinkTarget() {
		if (directInheritanceLinkTarget == null) {
			directInheritanceLinkTarget = new EObjectWithInverseResolvingEList<DirectInheritanceLink>(DirectInheritanceLink.class, this, EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_TARGET, EerPackage.DIRECT_INHERITANCE_LINK__TARGET);
		}
		return directInheritanceLinkTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirectInheritanceLink> getDirectInheritanceLinkSource() {
		if (directInheritanceLinkSource == null) {
			directInheritanceLinkSource = new EObjectWithInverseResolvingEList<DirectInheritanceLink>(DirectInheritanceLink.class, this, EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_SOURCE, EerPackage.DIRECT_INHERITANCE_LINK__SOURCE);
		}
		return directInheritanceLinkSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InheritanceSL> getInheritanceSL() {
		if (inheritanceSL == null) {
			inheritanceSL = new EObjectWithInverseResolvingEList<InheritanceSL>(InheritanceSL.class, this, EerPackage.ENTITY__INHERITANCE_SL, EerPackage.INHERITANCE_SL__SOURCE);
		}
		return inheritanceSL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InheritanceGL> getInheritanceGL() {
		if (inheritanceGL == null) {
			inheritanceGL = new EObjectWithInverseResolvingEList<InheritanceGL>(InheritanceGL.class, this, EerPackage.ENTITY__INHERITANCE_GL, EerPackage.INHERITANCE_GL__SOURCE);
		}
		return inheritanceGL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategorySL> getCategorySL() {
		if (categorySL == null) {
			categorySL = new EObjectWithInverseResolvingEList<CategorySL>(CategorySL.class, this, EerPackage.ENTITY__CATEGORY_SL, EerPackage.CATEGORY_SL__SOURCE);
		}
		return categorySL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryGL> getCategoryGL() {
		if (categoryGL == null) {
			categoryGL = new EObjectWithInverseResolvingEList<CategoryGL>(CategoryGL.class, this, EerPackage.ENTITY__CATEGORY_GL, EerPackage.CATEGORY_GL__SOURCE);
		}
		return categoryGL;
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
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_TARGET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDirectInheritanceLinkTarget()).basicAdd(otherEnd, msgs);
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDirectInheritanceLinkSource()).basicAdd(otherEnd, msgs);
			case EerPackage.ENTITY__INHERITANCE_SL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInheritanceSL()).basicAdd(otherEnd, msgs);
			case EerPackage.ENTITY__INHERITANCE_GL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInheritanceGL()).basicAdd(otherEnd, msgs);
			case EerPackage.ENTITY__CATEGORY_SL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategorySL()).basicAdd(otherEnd, msgs);
			case EerPackage.ENTITY__CATEGORY_GL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryGL()).basicAdd(otherEnd, msgs);
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
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_TARGET:
				return ((InternalEList<?>)getDirectInheritanceLinkTarget()).basicRemove(otherEnd, msgs);
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_SOURCE:
				return ((InternalEList<?>)getDirectInheritanceLinkSource()).basicRemove(otherEnd, msgs);
			case EerPackage.ENTITY__INHERITANCE_SL:
				return ((InternalEList<?>)getInheritanceSL()).basicRemove(otherEnd, msgs);
			case EerPackage.ENTITY__INHERITANCE_GL:
				return ((InternalEList<?>)getInheritanceGL()).basicRemove(otherEnd, msgs);
			case EerPackage.ENTITY__CATEGORY_SL:
				return ((InternalEList<?>)getCategorySL()).basicRemove(otherEnd, msgs);
			case EerPackage.ENTITY__CATEGORY_GL:
				return ((InternalEList<?>)getCategoryGL()).basicRemove(otherEnd, msgs);
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
			case EerPackage.ENTITY__IS_WEAK:
				return isIsWeak();
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_TARGET:
				return getDirectInheritanceLinkTarget();
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_SOURCE:
				return getDirectInheritanceLinkSource();
			case EerPackage.ENTITY__INHERITANCE_SL:
				return getInheritanceSL();
			case EerPackage.ENTITY__INHERITANCE_GL:
				return getInheritanceGL();
			case EerPackage.ENTITY__CATEGORY_SL:
				return getCategorySL();
			case EerPackage.ENTITY__CATEGORY_GL:
				return getCategoryGL();
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
			case EerPackage.ENTITY__IS_WEAK:
				setIsWeak((Boolean)newValue);
				return;
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_TARGET:
				getDirectInheritanceLinkTarget().clear();
				getDirectInheritanceLinkTarget().addAll((Collection<? extends DirectInheritanceLink>)newValue);
				return;
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_SOURCE:
				getDirectInheritanceLinkSource().clear();
				getDirectInheritanceLinkSource().addAll((Collection<? extends DirectInheritanceLink>)newValue);
				return;
			case EerPackage.ENTITY__INHERITANCE_SL:
				getInheritanceSL().clear();
				getInheritanceSL().addAll((Collection<? extends InheritanceSL>)newValue);
				return;
			case EerPackage.ENTITY__INHERITANCE_GL:
				getInheritanceGL().clear();
				getInheritanceGL().addAll((Collection<? extends InheritanceGL>)newValue);
				return;
			case EerPackage.ENTITY__CATEGORY_SL:
				getCategorySL().clear();
				getCategorySL().addAll((Collection<? extends CategorySL>)newValue);
				return;
			case EerPackage.ENTITY__CATEGORY_GL:
				getCategoryGL().clear();
				getCategoryGL().addAll((Collection<? extends CategoryGL>)newValue);
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
			case EerPackage.ENTITY__IS_WEAK:
				setIsWeak(IS_WEAK_EDEFAULT);
				return;
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_TARGET:
				getDirectInheritanceLinkTarget().clear();
				return;
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_SOURCE:
				getDirectInheritanceLinkSource().clear();
				return;
			case EerPackage.ENTITY__INHERITANCE_SL:
				getInheritanceSL().clear();
				return;
			case EerPackage.ENTITY__INHERITANCE_GL:
				getInheritanceGL().clear();
				return;
			case EerPackage.ENTITY__CATEGORY_SL:
				getCategorySL().clear();
				return;
			case EerPackage.ENTITY__CATEGORY_GL:
				getCategoryGL().clear();
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
			case EerPackage.ENTITY__IS_WEAK:
				return isWeak != IS_WEAK_EDEFAULT;
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_TARGET:
				return directInheritanceLinkTarget != null && !directInheritanceLinkTarget.isEmpty();
			case EerPackage.ENTITY__DIRECT_INHERITANCE_LINK_SOURCE:
				return directInheritanceLinkSource != null && !directInheritanceLinkSource.isEmpty();
			case EerPackage.ENTITY__INHERITANCE_SL:
				return inheritanceSL != null && !inheritanceSL.isEmpty();
			case EerPackage.ENTITY__INHERITANCE_GL:
				return inheritanceGL != null && !inheritanceGL.isEmpty();
			case EerPackage.ENTITY__CATEGORY_SL:
				return categorySL != null && !categorySL.isEmpty();
			case EerPackage.ENTITY__CATEGORY_GL:
				return categoryGL != null && !categoryGL.isEmpty();
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
		result.append(" (isWeak: ");
		result.append(isWeak);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
