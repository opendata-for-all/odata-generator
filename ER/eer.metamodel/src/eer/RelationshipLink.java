/**
 */
package eer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.RelationshipLink#getSource <em>Source</em>}</li>
 *   <li>{@link eer.RelationshipLink#getTarget <em>Target</em>}</li>
 *   <li>{@link eer.RelationshipLink#getParticipation <em>Participation</em>}</li>
 *   <li>{@link eer.RelationshipLink#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link eer.RelationshipLink#getRole <em>Role</em>}</li>
 *   <li>{@link eer.RelationshipLink#isIsIdentifier <em>Is Identifier</em>}</li>
 *   <li>{@link eer.RelationshipLink#isChosenLink <em>Chosen Link</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getRelationshipLink()
 * @model
 * @generated
 */
public interface RelationshipLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.EntityType#getRelationshipLink <em>Relationship Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EntityType)
	 * @see eer.EerPackage#getRelationshipLink_Source()
	 * @see eer.EntityType#getRelationshipLink
	 * @model opposite="relationshipLink" required="true"
	 * @generated
	 */
	EntityType getSource();

	/**
	 * Sets the value of the '{@link eer.RelationshipLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EntityType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Relationship#getRelationshipLink <em>Relationship Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Relationship)
	 * @see eer.EerPackage#getRelationshipLink_Target()
	 * @see eer.Relationship#getRelationshipLink
	 * @model opposite="relationshipLink" required="true"
	 * @generated
	 */
	Relationship getTarget();

	/**
	 * Sets the value of the '{@link eer.RelationshipLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Relationship value);

	/**
	 * Returns the value of the '<em><b>Participation</b></em>' attribute.
	 * The literals are from the enumeration {@link eer.CompletenessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participation</em>' attribute.
	 * @see eer.CompletenessType
	 * @see #setParticipation(CompletenessType)
	 * @see eer.EerPackage#getRelationshipLink_Participation()
	 * @model
	 * @generated
	 */
	CompletenessType getParticipation();

	/**
	 * Sets the value of the '{@link eer.RelationshipLink#getParticipation <em>Participation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participation</em>' attribute.
	 * @see eer.CompletenessType
	 * @see #getParticipation()
	 * @generated
	 */
	void setParticipation(CompletenessType value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link eer.CardinalityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see eer.CardinalityType
	 * @see #setCardinality(CardinalityType)
	 * @see eer.EerPackage#getRelationshipLink_Cardinality()
	 * @model
	 * @generated
	 */
	CardinalityType getCardinality();

	/**
	 * Sets the value of the '{@link eer.RelationshipLink#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see eer.CardinalityType
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(CardinalityType value);

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
	 * @see eer.EerPackage#getRelationshipLink_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link eer.RelationshipLink#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

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
	 * @see eer.EerPackage#getRelationshipLink_IsIdentifier()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsIdentifier();

	/**
	 * Sets the value of the '{@link eer.RelationshipLink#isIsIdentifier <em>Is Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Identifier</em>' attribute.
	 * @see #isIsIdentifier()
	 * @generated
	 */
	void setIsIdentifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Chosen Link</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chosen Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chosen Link</em>' attribute.
	 * @see #setChosenLink(boolean)
	 * @see eer.EerPackage#getRelationshipLink_ChosenLink()
	 * @model default="false"
	 * @generated
	 */
	boolean isChosenLink();

	/**
	 * Sets the value of the '{@link eer.RelationshipLink#isChosenLink <em>Chosen Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chosen Link</em>' attribute.
	 * @see #isChosenLink()
	 * @generated
	 */
	void setChosenLink(boolean value);

} // RelationshipLink
