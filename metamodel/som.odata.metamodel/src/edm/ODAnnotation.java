/**
 */
package edm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODAnnotation#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODAnnotation()
 * @model
 * @generated
 */
public interface ODAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' reference.
	 * @see #setTerm(ODTerm)
	 * @see edm.EdmPackage#getODAnnotation_Term()
	 * @model
	 * @generated
	 */
	ODTerm getTerm();

	/**
	 * Sets the value of the '{@link edm.ODAnnotation#getTerm <em>Term</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' reference.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(ODTerm value);

} // ODAnnotation
