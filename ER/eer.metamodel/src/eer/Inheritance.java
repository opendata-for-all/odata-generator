/**
 */
package eer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inheritance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.Inheritance#getLabel <em>Label</em>}</li>
 *   <li>{@link eer.Inheritance#getDisjointness <em>Disjointness</em>}</li>
 *   <li>{@link eer.Inheritance#getInheritanceGL <em>Inheritance GL</em>}</li>
 *   <li>{@link eer.Inheritance#getInheritanceSL <em>Inheritance SL</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getInheritance()
 * @model annotation="gmf.node label='label' label.readOnly='true' figure='ellipse' resizable='false' size='30,30'"
 * @generated
 */
public interface Inheritance extends Node {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see eer.EerPackage#getInheritance_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link eer.Inheritance#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Disjointness</b></em>' attribute.
	 * The literals are from the enumeration {@link eer.DisjointnessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjointness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjointness</em>' attribute.
	 * @see eer.DisjointnessType
	 * @see #setDisjointness(DisjointnessType)
	 * @see eer.EerPackage#getInheritance_Disjointness()
	 * @model
	 * @generated
	 */
	DisjointnessType getDisjointness();

	/**
	 * Sets the value of the '{@link eer.Inheritance#getDisjointness <em>Disjointness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disjointness</em>' attribute.
	 * @see eer.DisjointnessType
	 * @see #getDisjointness()
	 * @generated
	 */
	void setDisjointness(DisjointnessType value);

	/**
	 * Returns the value of the '<em><b>Inheritance GL</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.InheritanceGL#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance GL</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance GL</em>' reference.
	 * @see #setInheritanceGL(InheritanceGL)
	 * @see eer.EerPackage#getInheritance_InheritanceGL()
	 * @see eer.InheritanceGL#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	InheritanceGL getInheritanceGL();

	/**
	 * Sets the value of the '{@link eer.Inheritance#getInheritanceGL <em>Inheritance GL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inheritance GL</em>' reference.
	 * @see #getInheritanceGL()
	 * @generated
	 */
	void setInheritanceGL(InheritanceGL value);

	/**
	 * Returns the value of the '<em><b>Inheritance SL</b></em>' reference list.
	 * The list contents are of type {@link eer.InheritanceSL}.
	 * It is bidirectional and its opposite is '{@link eer.InheritanceSL#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance SL</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance SL</em>' reference list.
	 * @see eer.EerPackage#getInheritance_InheritanceSL()
	 * @see eer.InheritanceSL#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<InheritanceSL> getInheritanceSL();

} // Inheritance
