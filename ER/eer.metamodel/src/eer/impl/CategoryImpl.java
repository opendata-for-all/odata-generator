/**
 */
package eer.impl;

import eer.Category;
import eer.CategoryGL;
import eer.CategorySL;
import eer.EerPackage;

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
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eer.impl.CategoryImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link eer.impl.CategoryImpl#getCategorySL <em>Category SL</em>}</li>
 *   <li>{@link eer.impl.CategoryImpl#getCategoryGL <em>Category GL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends NodeImpl implements Category {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "u";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategorySL() <em>Category SL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorySL()
	 * @generated
	 * @ordered
	 */
	protected CategorySL categorySL;

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
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EerPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.CATEGORY__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorySL getCategorySL() {
		if (categorySL != null && categorySL.eIsProxy()) {
			InternalEObject oldCategorySL = (InternalEObject)categorySL;
			categorySL = (CategorySL)eResolveProxy(oldCategorySL);
			if (categorySL != oldCategorySL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EerPackage.CATEGORY__CATEGORY_SL, oldCategorySL, categorySL));
			}
		}
		return categorySL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategorySL basicGetCategorySL() {
		return categorySL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategorySL(CategorySL newCategorySL, NotificationChain msgs) {
		CategorySL oldCategorySL = categorySL;
		categorySL = newCategorySL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EerPackage.CATEGORY__CATEGORY_SL, oldCategorySL, newCategorySL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorySL(CategorySL newCategorySL) {
		if (newCategorySL != categorySL) {
			NotificationChain msgs = null;
			if (categorySL != null)
				msgs = ((InternalEObject)categorySL).eInverseRemove(this, EerPackage.CATEGORY_SL__TARGET, CategorySL.class, msgs);
			if (newCategorySL != null)
				msgs = ((InternalEObject)newCategorySL).eInverseAdd(this, EerPackage.CATEGORY_SL__TARGET, CategorySL.class, msgs);
			msgs = basicSetCategorySL(newCategorySL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.CATEGORY__CATEGORY_SL, newCategorySL, newCategorySL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryGL> getCategoryGL() {
		if (categoryGL == null) {
			categoryGL = new EObjectWithInverseResolvingEList<CategoryGL>(CategoryGL.class, this, EerPackage.CATEGORY__CATEGORY_GL, EerPackage.CATEGORY_GL__TARGET);
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
			case EerPackage.CATEGORY__CATEGORY_SL:
				if (categorySL != null)
					msgs = ((InternalEObject)categorySL).eInverseRemove(this, EerPackage.CATEGORY_SL__TARGET, CategorySL.class, msgs);
				return basicSetCategorySL((CategorySL)otherEnd, msgs);
			case EerPackage.CATEGORY__CATEGORY_GL:
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
			case EerPackage.CATEGORY__CATEGORY_SL:
				return basicSetCategorySL(null, msgs);
			case EerPackage.CATEGORY__CATEGORY_GL:
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
			case EerPackage.CATEGORY__LABEL:
				return getLabel();
			case EerPackage.CATEGORY__CATEGORY_SL:
				if (resolve) return getCategorySL();
				return basicGetCategorySL();
			case EerPackage.CATEGORY__CATEGORY_GL:
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
			case EerPackage.CATEGORY__LABEL:
				setLabel((String)newValue);
				return;
			case EerPackage.CATEGORY__CATEGORY_SL:
				setCategorySL((CategorySL)newValue);
				return;
			case EerPackage.CATEGORY__CATEGORY_GL:
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
			case EerPackage.CATEGORY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case EerPackage.CATEGORY__CATEGORY_SL:
				setCategorySL((CategorySL)null);
				return;
			case EerPackage.CATEGORY__CATEGORY_GL:
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
			case EerPackage.CATEGORY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case EerPackage.CATEGORY__CATEGORY_SL:
				return categorySL != null;
			case EerPackage.CATEGORY__CATEGORY_GL:
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
