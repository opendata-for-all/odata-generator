/**
 */
package edm;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODEnumType#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODEnumType()
 * @model
 * @generated
 */
public interface ODEnumType extends ODPrimitiveType {

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODMember}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see edm.EdmPackage#getODEnumType_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODMember> getMembers();
} // ODEnumType
