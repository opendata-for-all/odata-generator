/**
 */
package edm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.TypedElement#getType <em>Type</em>}</li>
 *   <li>{@link edm.TypedElement#getMultivalued <em>Multivalued</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ODType)
	 * @see edm.EdmPackage#getTypedElement_Type()
	 * @model
	 * @generated
	 */
	ODType getType();

	/**
	 * Sets the value of the '{@link edm.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ODType value);

	/**
	 * Returns the value of the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multivalued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multivalued</em>' attribute.
	 * @see #setMultivalued(Boolean)
	 * @see edm.EdmPackage#getTypedElement_Multivalued()
	 * @model
	 * @generated
	 */
	Boolean getMultivalued();

	/**
	 * Sets the value of the '{@link edm.TypedElement#getMultivalued <em>Multivalued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multivalued</em>' attribute.
	 * @see #getMultivalued()
	 * @generated
	 */
	void setMultivalued(Boolean value);

} // TypedElement
