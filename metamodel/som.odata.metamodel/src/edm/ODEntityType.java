/**
 */
package edm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODEntityType#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODEntityType()
 * @model
 * @generated
 */
public interface ODEntityType extends ODStructuralType {

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODPropertyKeyRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference list.
	 * @see edm.EdmPackage#getODEntityType_Key()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODPropertyKeyRef> getKey();
} // ODEntityType
