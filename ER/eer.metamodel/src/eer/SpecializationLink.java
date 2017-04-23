/**
 */
package eer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.SpecializationLink#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getSpecializationLink()
 * @model abstract="true"
 * @generated
 */
public interface SpecializationLink extends Link {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see eer.EerPackage#getSpecializationLink_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link eer.SpecializationLink#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

} // SpecializationLink
