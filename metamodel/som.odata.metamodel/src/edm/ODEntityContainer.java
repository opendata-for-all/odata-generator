/**
 */
package edm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Entity Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODEntityContainer#getEntitySets <em>Entity Sets</em>}</li>
 *   <li>{@link edm.ODEntityContainer#getSingletons <em>Singletons</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODEntityContainer()
 * @model
 * @generated
 */
public interface ODEntityContainer extends ODNamedElement, ODAnnotable {
	/**
	 * Returns the value of the '<em><b>Entity Sets</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODEntitySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Sets</em>' containment reference list.
	 * @see edm.EdmPackage#getODEntityContainer_EntitySets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODEntitySet> getEntitySets();

	/**
	 * Returns the value of the '<em><b>Singletons</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODSingleton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singletons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singletons</em>' containment reference list.
	 * @see edm.EdmPackage#getODEntityContainer_Singletons()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODSingleton> getSingletons();

} // ODEntityContainer
