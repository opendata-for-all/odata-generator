/**
 */
package edm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODService#getSchemas <em>Schemas</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODService()
 * @model
 * @generated
 */
public interface ODService extends EObject {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODSchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see edm.EdmPackage#getODService_Schemas()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODSchema> getSchemas();

} // ODService
