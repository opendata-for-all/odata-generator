/**
 */
package eer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance GL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.InheritanceGL#getSource <em>Source</em>}</li>
 *   <li>{@link eer.InheritanceGL#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getInheritanceGL()
 * @model
 * @generated
 */
public interface InheritanceGL extends GeneralizationLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Entity#getInheritanceGL <em>Inheritance GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see eer.EerPackage#getInheritanceGL_Source()
	 * @see eer.Entity#getInheritanceGL
	 * @model opposite="inheritanceGL" required="true"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link eer.InheritanceGL#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Inheritance#getInheritanceGL <em>Inheritance GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Inheritance)
	 * @see eer.EerPackage#getInheritanceGL_Target()
	 * @see eer.Inheritance#getInheritanceGL
	 * @model opposite="inheritanceGL" required="true"
	 * @generated
	 */
	Inheritance getTarget();

	/**
	 * Sets the value of the '{@link eer.InheritanceGL#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Inheritance value);

} // InheritanceGL
