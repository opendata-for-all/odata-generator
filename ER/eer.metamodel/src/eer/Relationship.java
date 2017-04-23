/**
 */
package eer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.Relationship#isIsIdentifier <em>Is Identifier</em>}</li>
 *   <li>{@link eer.Relationship#isCreateSurrogateKey <em>Create Surrogate Key</em>}</li>
 *   <li>{@link eer.Relationship#getRelationshipLink <em>Relationship Link</em>}</li>
 *   <li>{@link eer.Relationship#getAssociativeEntity <em>Associative Entity</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getRelationship()
 * @model annotation="gmf.node figure='br.ufpe.cin.eercase.figure.DiamondFigure' border.width='1' border.color='0,0,0'"
 * @generated
 */
public interface Relationship extends Element {
	/**
	 * Returns the value of the '<em><b>Is Identifier</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Identifier</em>' attribute.
	 * @see #setIsIdentifier(boolean)
	 * @see eer.EerPackage#getRelationship_IsIdentifier()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsIdentifier();

	/**
	 * Sets the value of the '{@link eer.Relationship#isIsIdentifier <em>Is Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Identifier</em>' attribute.
	 * @see #isIsIdentifier()
	 * @generated
	 */
	void setIsIdentifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Create Surrogate Key</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Surrogate Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Surrogate Key</em>' attribute.
	 * @see #setCreateSurrogateKey(boolean)
	 * @see eer.EerPackage#getRelationship_CreateSurrogateKey()
	 * @model default="false"
	 * @generated
	 */
	boolean isCreateSurrogateKey();

	/**
	 * Sets the value of the '{@link eer.Relationship#isCreateSurrogateKey <em>Create Surrogate Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Surrogate Key</em>' attribute.
	 * @see #isCreateSurrogateKey()
	 * @generated
	 */
	void setCreateSurrogateKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Relationship Link</b></em>' reference list.
	 * The list contents are of type {@link eer.RelationshipLink}.
	 * It is bidirectional and its opposite is '{@link eer.RelationshipLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Link</em>' reference list.
	 * @see eer.EerPackage#getRelationship_RelationshipLink()
	 * @see eer.RelationshipLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<RelationshipLink> getRelationshipLink();

	/**
	 * Returns the value of the '<em><b>Associative Entity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link eer.AssociativeEntity#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associative Entity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associative Entity</em>' container reference.
	 * @see #setAssociativeEntity(AssociativeEntity)
	 * @see eer.EerPackage#getRelationship_AssociativeEntity()
	 * @see eer.AssociativeEntity#getContains
	 * @model opposite="contains" required="true" transient="false"
	 * @generated
	 */
	AssociativeEntity getAssociativeEntity();

	/**
	 * Sets the value of the '{@link eer.Relationship#getAssociativeEntity <em>Associative Entity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associative Entity</em>' container reference.
	 * @see #getAssociativeEntity()
	 * @generated
	 */
	void setAssociativeEntity(AssociativeEntity value);

} // Relationship
