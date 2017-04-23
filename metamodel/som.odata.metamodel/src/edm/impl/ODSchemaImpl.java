/**
 */
package edm.impl;

import edm.EdmPackage;
import edm.ODComplexType;
import edm.ODEntityContainer;
import edm.ODEntityType;
import edm.ODEnumType;
import edm.ODSchema;
import edm.ODTerm;
import edm.ODTypeDefinition;

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
 * An implementation of the model object '<em><b>OD Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edm.impl.ODSchemaImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link edm.impl.ODSchemaImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link edm.impl.ODSchemaImpl#getEntityContainer <em>Entity Container</em>}</li>
 *   <li>{@link edm.impl.ODSchemaImpl#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link edm.impl.ODSchemaImpl#getComplexTypes <em>Complex Types</em>}</li>
 *   <li>{@link edm.impl.ODSchemaImpl#getEnumTypes <em>Enum Types</em>}</li>
 *   <li>{@link edm.impl.ODSchemaImpl#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link edm.impl.ODSchemaImpl#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODSchemaImpl extends ODAnnotableImpl implements ODSchema {
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntityContainer() <em>Entity Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityContainer()
	 * @generated
	 * @ordered
	 */
	protected ODEntityContainer entityContainer;

	/**
	 * The cached value of the '{@link #getEntityTypes() <em>Entity Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODEntityType> entityTypes;

	/**
	 * The cached value of the '{@link #getComplexTypes() <em>Complex Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODComplexType> complexTypes;

	/**
	 * The cached value of the '{@link #getEnumTypes() <em>Enum Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ODEnumType> enumTypes;

	/**
	 * The cached value of the '{@link #getTypeDefinitions() <em>Type Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<ODTypeDefinition> typeDefinitions;

	/**
	 * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<ODTerm> terms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ODSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.Literals.OD_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_SCHEMA__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_SCHEMA__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODEntityContainer getEntityContainer() {
		return entityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityContainer(ODEntityContainer newEntityContainer, NotificationChain msgs) {
		ODEntityContainer oldEntityContainer = entityContainer;
		entityContainer = newEntityContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.OD_SCHEMA__ENTITY_CONTAINER, oldEntityContainer, newEntityContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityContainer(ODEntityContainer newEntityContainer) {
		if (newEntityContainer != entityContainer) {
			NotificationChain msgs = null;
			if (entityContainer != null)
				msgs = ((InternalEObject)entityContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.OD_SCHEMA__ENTITY_CONTAINER, null, msgs);
			if (newEntityContainer != null)
				msgs = ((InternalEObject)newEntityContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.OD_SCHEMA__ENTITY_CONTAINER, null, msgs);
			msgs = basicSetEntityContainer(newEntityContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.OD_SCHEMA__ENTITY_CONTAINER, newEntityContainer, newEntityContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODEntityType> getEntityTypes() {
		if (entityTypes == null) {
			entityTypes = new EObjectContainmentEList<ODEntityType>(ODEntityType.class, this, EdmPackage.OD_SCHEMA__ENTITY_TYPES);
		}
		return entityTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODComplexType> getComplexTypes() {
		if (complexTypes == null) {
			complexTypes = new EObjectContainmentEList<ODComplexType>(ODComplexType.class, this, EdmPackage.OD_SCHEMA__COMPLEX_TYPES);
		}
		return complexTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODEnumType> getEnumTypes() {
		if (enumTypes == null) {
			enumTypes = new EObjectContainmentEList<ODEnumType>(ODEnumType.class, this, EdmPackage.OD_SCHEMA__ENUM_TYPES);
		}
		return enumTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODTypeDefinition> getTypeDefinitions() {
		if (typeDefinitions == null) {
			typeDefinitions = new EObjectContainmentEList<ODTypeDefinition>(ODTypeDefinition.class, this, EdmPackage.OD_SCHEMA__TYPE_DEFINITIONS);
		}
		return typeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODTerm> getTerms() {
		if (terms == null) {
			terms = new EObjectContainmentEList<ODTerm>(ODTerm.class, this, EdmPackage.OD_SCHEMA__TERMS);
		}
		return terms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.OD_SCHEMA__ENTITY_CONTAINER:
				return basicSetEntityContainer(null, msgs);
			case EdmPackage.OD_SCHEMA__ENTITY_TYPES:
				return ((InternalEList<?>)getEntityTypes()).basicRemove(otherEnd, msgs);
			case EdmPackage.OD_SCHEMA__COMPLEX_TYPES:
				return ((InternalEList<?>)getComplexTypes()).basicRemove(otherEnd, msgs);
			case EdmPackage.OD_SCHEMA__ENUM_TYPES:
				return ((InternalEList<?>)getEnumTypes()).basicRemove(otherEnd, msgs);
			case EdmPackage.OD_SCHEMA__TYPE_DEFINITIONS:
				return ((InternalEList<?>)getTypeDefinitions()).basicRemove(otherEnd, msgs);
			case EdmPackage.OD_SCHEMA__TERMS:
				return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.OD_SCHEMA__NAMESPACE:
				return getNamespace();
			case EdmPackage.OD_SCHEMA__ALIAS:
				return getAlias();
			case EdmPackage.OD_SCHEMA__ENTITY_CONTAINER:
				return getEntityContainer();
			case EdmPackage.OD_SCHEMA__ENTITY_TYPES:
				return getEntityTypes();
			case EdmPackage.OD_SCHEMA__COMPLEX_TYPES:
				return getComplexTypes();
			case EdmPackage.OD_SCHEMA__ENUM_TYPES:
				return getEnumTypes();
			case EdmPackage.OD_SCHEMA__TYPE_DEFINITIONS:
				return getTypeDefinitions();
			case EdmPackage.OD_SCHEMA__TERMS:
				return getTerms();
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
			case EdmPackage.OD_SCHEMA__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case EdmPackage.OD_SCHEMA__ALIAS:
				setAlias((String)newValue);
				return;
			case EdmPackage.OD_SCHEMA__ENTITY_CONTAINER:
				setEntityContainer((ODEntityContainer)newValue);
				return;
			case EdmPackage.OD_SCHEMA__ENTITY_TYPES:
				getEntityTypes().clear();
				getEntityTypes().addAll((Collection<? extends ODEntityType>)newValue);
				return;
			case EdmPackage.OD_SCHEMA__COMPLEX_TYPES:
				getComplexTypes().clear();
				getComplexTypes().addAll((Collection<? extends ODComplexType>)newValue);
				return;
			case EdmPackage.OD_SCHEMA__ENUM_TYPES:
				getEnumTypes().clear();
				getEnumTypes().addAll((Collection<? extends ODEnumType>)newValue);
				return;
			case EdmPackage.OD_SCHEMA__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				getTypeDefinitions().addAll((Collection<? extends ODTypeDefinition>)newValue);
				return;
			case EdmPackage.OD_SCHEMA__TERMS:
				getTerms().clear();
				getTerms().addAll((Collection<? extends ODTerm>)newValue);
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
			case EdmPackage.OD_SCHEMA__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case EdmPackage.OD_SCHEMA__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case EdmPackage.OD_SCHEMA__ENTITY_CONTAINER:
				setEntityContainer((ODEntityContainer)null);
				return;
			case EdmPackage.OD_SCHEMA__ENTITY_TYPES:
				getEntityTypes().clear();
				return;
			case EdmPackage.OD_SCHEMA__COMPLEX_TYPES:
				getComplexTypes().clear();
				return;
			case EdmPackage.OD_SCHEMA__ENUM_TYPES:
				getEnumTypes().clear();
				return;
			case EdmPackage.OD_SCHEMA__TYPE_DEFINITIONS:
				getTypeDefinitions().clear();
				return;
			case EdmPackage.OD_SCHEMA__TERMS:
				getTerms().clear();
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
			case EdmPackage.OD_SCHEMA__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case EdmPackage.OD_SCHEMA__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case EdmPackage.OD_SCHEMA__ENTITY_CONTAINER:
				return entityContainer != null;
			case EdmPackage.OD_SCHEMA__ENTITY_TYPES:
				return entityTypes != null && !entityTypes.isEmpty();
			case EdmPackage.OD_SCHEMA__COMPLEX_TYPES:
				return complexTypes != null && !complexTypes.isEmpty();
			case EdmPackage.OD_SCHEMA__ENUM_TYPES:
				return enumTypes != null && !enumTypes.isEmpty();
			case EdmPackage.OD_SCHEMA__TYPE_DEFINITIONS:
				return typeDefinitions != null && !typeDefinitions.isEmpty();
			case EdmPackage.OD_SCHEMA__TERMS:
				return terms != null && !terms.isEmpty();
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
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(", alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

} //ODSchemaImpl
