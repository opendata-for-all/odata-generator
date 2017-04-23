/**
 */
package eer.impl;

import eer.DisjointnessType;
import eer.EerPackage;
import eer.Inheritance;
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
 * An implementation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eer.impl.InheritanceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link eer.impl.InheritanceImpl#getDisjointness <em>Disjointness</em>}</li>
 *   <li>{@link eer.impl.InheritanceImpl#getInheritanceGL <em>Inheritance GL</em>}</li>
 *   <li>{@link eer.impl.InheritanceImpl#getInheritanceSL <em>Inheritance SL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InheritanceImpl extends NodeImpl implements Inheritance {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

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
	 * The default value of the '{@link #getDisjointness() <em>Disjointness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointness()
	 * @generated
	 * @ordered
	 */
	protected static final DisjointnessType DISJOINTNESS_EDEFAULT = DisjointnessType.OVERLAP;

	/**
	 * The cached value of the '{@link #getDisjointness() <em>Disjointness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointness()
	 * @generated
	 * @ordered
	 */
	protected DisjointnessType disjointness = DISJOINTNESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInheritanceGL() <em>Inheritance GL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritanceGL()
	 * @generated
	 * @ordered
	 */
	protected InheritanceGL inheritanceGL;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EerPackage.Literals.INHERITANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.INHERITANCE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisjointnessType getDisjointness() {
		return disjointness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisjointness(DisjointnessType newDisjointness) {
		DisjointnessType oldDisjointness = disjointness;
		disjointness = newDisjointness == null ? DISJOINTNESS_EDEFAULT : newDisjointness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.INHERITANCE__DISJOINTNESS, oldDisjointness, disjointness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceGL getInheritanceGL() {
		if (inheritanceGL != null && inheritanceGL.eIsProxy()) {
			InternalEObject oldInheritanceGL = (InternalEObject)inheritanceGL;
			inheritanceGL = (InheritanceGL)eResolveProxy(oldInheritanceGL);
			if (inheritanceGL != oldInheritanceGL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EerPackage.INHERITANCE__INHERITANCE_GL, oldInheritanceGL, inheritanceGL));
			}
		}
		return inheritanceGL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceGL basicGetInheritanceGL() {
		return inheritanceGL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInheritanceGL(InheritanceGL newInheritanceGL, NotificationChain msgs) {
		InheritanceGL oldInheritanceGL = inheritanceGL;
		inheritanceGL = newInheritanceGL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EerPackage.INHERITANCE__INHERITANCE_GL, oldInheritanceGL, newInheritanceGL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInheritanceGL(InheritanceGL newInheritanceGL) {
		if (newInheritanceGL != inheritanceGL) {
			NotificationChain msgs = null;
			if (inheritanceGL != null)
				msgs = ((InternalEObject)inheritanceGL).eInverseRemove(this, EerPackage.INHERITANCE_GL__TARGET, InheritanceGL.class, msgs);
			if (newInheritanceGL != null)
				msgs = ((InternalEObject)newInheritanceGL).eInverseAdd(this, EerPackage.INHERITANCE_GL__TARGET, InheritanceGL.class, msgs);
			msgs = basicSetInheritanceGL(newInheritanceGL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EerPackage.INHERITANCE__INHERITANCE_GL, newInheritanceGL, newInheritanceGL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InheritanceSL> getInheritanceSL() {
		if (inheritanceSL == null) {
			inheritanceSL = new EObjectWithInverseResolvingEList<InheritanceSL>(InheritanceSL.class, this, EerPackage.INHERITANCE__INHERITANCE_SL, EerPackage.INHERITANCE_SL__TARGET);
		}
		return inheritanceSL;
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
			case EerPackage.INHERITANCE__INHERITANCE_GL:
				if (inheritanceGL != null)
					msgs = ((InternalEObject)inheritanceGL).eInverseRemove(this, EerPackage.INHERITANCE_GL__TARGET, InheritanceGL.class, msgs);
				return basicSetInheritanceGL((InheritanceGL)otherEnd, msgs);
			case EerPackage.INHERITANCE__INHERITANCE_SL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInheritanceSL()).basicAdd(otherEnd, msgs);
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
			case EerPackage.INHERITANCE__INHERITANCE_GL:
				return basicSetInheritanceGL(null, msgs);
			case EerPackage.INHERITANCE__INHERITANCE_SL:
				return ((InternalEList<?>)getInheritanceSL()).basicRemove(otherEnd, msgs);
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
			case EerPackage.INHERITANCE__LABEL:
				return getLabel();
			case EerPackage.INHERITANCE__DISJOINTNESS:
				return getDisjointness();
			case EerPackage.INHERITANCE__INHERITANCE_GL:
				if (resolve) return getInheritanceGL();
				return basicGetInheritanceGL();
			case EerPackage.INHERITANCE__INHERITANCE_SL:
				return getInheritanceSL();
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
			case EerPackage.INHERITANCE__LABEL:
				setLabel((String)newValue);
				return;
			case EerPackage.INHERITANCE__DISJOINTNESS:
				setDisjointness((DisjointnessType)newValue);
				return;
			case EerPackage.INHERITANCE__INHERITANCE_GL:
				setInheritanceGL((InheritanceGL)newValue);
				return;
			case EerPackage.INHERITANCE__INHERITANCE_SL:
				getInheritanceSL().clear();
				getInheritanceSL().addAll((Collection<? extends InheritanceSL>)newValue);
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
			case EerPackage.INHERITANCE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case EerPackage.INHERITANCE__DISJOINTNESS:
				setDisjointness(DISJOINTNESS_EDEFAULT);
				return;
			case EerPackage.INHERITANCE__INHERITANCE_GL:
				setInheritanceGL((InheritanceGL)null);
				return;
			case EerPackage.INHERITANCE__INHERITANCE_SL:
				getInheritanceSL().clear();
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
			case EerPackage.INHERITANCE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case EerPackage.INHERITANCE__DISJOINTNESS:
				return disjointness != DISJOINTNESS_EDEFAULT;
			case EerPackage.INHERITANCE__INHERITANCE_GL:
				return inheritanceGL != null;
			case EerPackage.INHERITANCE__INHERITANCE_SL:
				return inheritanceSL != null && !inheritanceSL.isEmpty();
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
		result.append(", disjointness: ");
		result.append(disjointness);
		result.append(')');
		return result.toString();
	}

} //InheritanceImpl
