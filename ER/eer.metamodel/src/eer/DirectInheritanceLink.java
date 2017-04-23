/**
 */
package eer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Inheritance Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.DirectInheritanceLink#getRole <em>Role</em>}</li>
 *   <li>{@link eer.DirectInheritanceLink#getTarget <em>Target</em>}</li>
 *   <li>{@link eer.DirectInheritanceLink#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getDirectInheritanceLink()
 * @model
 * @generated
 */
public interface DirectInheritanceLink extends Link {
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
	 * @see eer.EerPackage#getDirectInheritanceLink_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link eer.DirectInheritanceLink#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Entity#getDirectInheritanceLinkTarget <em>Direct Inheritance Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see eer.EerPackage#getDirectInheritanceLink_Target()
	 * @see eer.Entity#getDirectInheritanceLinkTarget
	 * @model opposite="directInheritanceLinkTarget" required="true"
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link eer.DirectInheritanceLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Entity#getDirectInheritanceLinkSource <em>Direct Inheritance Link Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see eer.EerPackage#getDirectInheritanceLink_Source()
	 * @see eer.Entity#getDirectInheritanceLinkSource
	 * @model opposite="directInheritanceLinkSource" required="true"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link eer.DirectInheritanceLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

} // DirectInheritanceLink
