/**
 */
package eer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Associative Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.AssociativeEntity#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getAssociativeEntity()
 * @model annotation="gmf.node figure='rectangle' label.text=' ' label.readOnly='true' size='130,110'"
 * @generated
 */
public interface AssociativeEntity extends EntityType {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link eer.Relationship#getAssociativeEntity <em>Associative Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference.
	 * @see #setContains(Relationship)
	 * @see eer.EerPackage#getAssociativeEntity_Contains()
	 * @see eer.Relationship#getAssociativeEntity
	 * @model opposite="associativeEntity" containment="true" required="true"
	 *        annotation="gmf.compartment collapsible='false'"
	 * @generated
	 */
	Relationship getContains();

	/**
	 * Sets the value of the '{@link eer.AssociativeEntity#getContains <em>Contains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains</em>' containment reference.
	 * @see #getContains()
	 * @generated
	 */
	void setContains(Relationship value);

} // AssociativeEntity
