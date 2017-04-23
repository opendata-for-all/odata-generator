/**
 */
package edm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODTerm#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link edm.ODTerm#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link edm.ODTerm#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODTerm()
 * @model
 * @generated
 */
public interface ODTerm extends ODNamedElement, ODAnnotable {
	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' attribute list.
	 * The list contents are of type {@link edm.ODTermTarget}.
	 * The literals are from the enumeration {@link edm.ODTermTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' attribute list.
	 * @see edm.ODTermTarget
	 * @see edm.EdmPackage#getODTerm_AppliesTo()
	 * @model
	 * @generated
	 */
	EList<ODTermTarget> getAppliesTo();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see edm.EdmPackage#getODTerm_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link edm.ODTerm#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

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
	 * @see edm.EdmPackage#getODTerm_Type()
	 * @model
	 * @generated
	 */
	ODType getType();

	/**
	 * Sets the value of the '{@link edm.ODTerm#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ODType value);

} // ODTerm
