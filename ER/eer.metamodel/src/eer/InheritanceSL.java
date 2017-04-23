/**
 */
package eer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance SL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.InheritanceSL#getSource <em>Source</em>}</li>
 *   <li>{@link eer.InheritanceSL#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getInheritanceSL()
 * @model
 * @generated
 */
public interface InheritanceSL extends SpecializationLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Entity#getInheritanceSL <em>Inheritance SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see eer.EerPackage#getInheritanceSL_Source()
	 * @see eer.Entity#getInheritanceSL
	 * @model opposite="inheritanceSL" required="true"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link eer.InheritanceSL#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Inheritance#getInheritanceSL <em>Inheritance SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Inheritance)
	 * @see eer.EerPackage#getInheritanceSL_Target()
	 * @see eer.Inheritance#getInheritanceSL
	 * @model opposite="inheritanceSL" required="true"
	 * @generated
	 */
	Inheritance getTarget();

	/**
	 * Sets the value of the '{@link eer.InheritanceSL#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Inheritance value);

} // InheritanceSL
