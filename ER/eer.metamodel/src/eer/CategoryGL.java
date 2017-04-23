/**
 */
package eer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category GL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.CategoryGL#getSource <em>Source</em>}</li>
 *   <li>{@link eer.CategoryGL#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getCategoryGL()
 * @model
 * @generated
 */
public interface CategoryGL extends GeneralizationLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Entity#getCategoryGL <em>Category GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see eer.EerPackage#getCategoryGL_Source()
	 * @see eer.Entity#getCategoryGL
	 * @model opposite="categoryGL" required="true"
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link eer.CategoryGL#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Category#getCategoryGL <em>Category GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Category)
	 * @see eer.EerPackage#getCategoryGL_Target()
	 * @see eer.Category#getCategoryGL
	 * @model opposite="categoryGL" required="true"
	 * @generated
	 */
	Category getTarget();

	/**
	 * Sets the value of the '{@link eer.CategoryGL#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Category value);

} // CategoryGL
