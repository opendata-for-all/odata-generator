/**
 */
package edm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Annotable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODAnnotable#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODAnnotable()
 * @model
 * @generated
 */
public interface ODAnnotable extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see edm.EdmPackage#getODAnnotable_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODAnnotation> getAnnotations();

} // ODAnnotable
