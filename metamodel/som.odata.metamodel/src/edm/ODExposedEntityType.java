/**
 */
package edm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Exposed Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODExposedEntityType#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link edm.ODExposedEntityType#getNavigationPropertyBindings <em>Navigation Property Bindings</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODExposedEntityType()
 * @model
 * @generated
 */
public interface ODExposedEntityType extends ODNamedElement, ODAnnotable {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' reference.
	 * @see #setEntityType(ODEntityType)
	 * @see edm.EdmPackage#getODExposedEntityType_EntityType()
	 * @model
	 * @generated
	 */
	ODEntityType getEntityType();

	/**
	 * Sets the value of the '{@link edm.ODExposedEntityType#getEntityType <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' reference.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(ODEntityType value);

	/**
	 * Returns the value of the '<em><b>Navigation Property Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODNavigationPropertyBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Property Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property Bindings</em>' containment reference list.
	 * @see edm.EdmPackage#getODExposedEntityType_NavigationPropertyBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODNavigationPropertyBinding> getNavigationPropertyBindings();

} // ODExposedEntityType
