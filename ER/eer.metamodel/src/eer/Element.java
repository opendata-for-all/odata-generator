/**
 */
package eer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.Element#getName <em>Name</em>}</li>
 *   <li>{@link eer.Element#getAttributeLinkSource <em>Attribute Link Source</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getElement()
 * @model abstract="true"
 *        annotation="gmf.node label='name'"
 * @generated
 */
public interface Element extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eer.EerPackage#getElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eer.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Link Source</b></em>' reference list.
	 * The list contents are of type {@link eer.AttributeLink}.
	 * It is bidirectional and its opposite is '{@link eer.AttributeLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Link Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Link Source</em>' reference list.
	 * @see eer.EerPackage#getElement_AttributeLinkSource()
	 * @see eer.AttributeLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<AttributeLink> getAttributeLinkSource();

} // Element
