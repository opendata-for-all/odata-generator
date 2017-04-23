/**
 */
package eer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.AttributeLink#getSource <em>Source</em>}</li>
 *   <li>{@link eer.AttributeLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getAttributeLink()
 * @model
 * @generated
 */
public interface AttributeLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Element#getAttributeLinkSource <em>Attribute Link Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see eer.EerPackage#getAttributeLink_Source()
	 * @see eer.Element#getAttributeLinkSource
	 * @model opposite="AttributeLinkSource" required="true"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link eer.AttributeLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.Attribute#getAttributeLinkTarget <em>Attribute Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Attribute)
	 * @see eer.EerPackage#getAttributeLink_Target()
	 * @see eer.Attribute#getAttributeLinkTarget
	 * @model opposite="AttributeLinkTarget" required="true"
	 * @generated
	 */
	Attribute getTarget();

	/**
	 * Sets the value of the '{@link eer.AttributeLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Attribute value);

} // AttributeLink
