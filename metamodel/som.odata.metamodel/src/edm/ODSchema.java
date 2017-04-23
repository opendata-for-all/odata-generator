/**
 */
package edm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODSchema#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link edm.ODSchema#getAlias <em>Alias</em>}</li>
 *   <li>{@link edm.ODSchema#getEntityContainer <em>Entity Container</em>}</li>
 *   <li>{@link edm.ODSchema#getEntityTypes <em>Entity Types</em>}</li>
 *   <li>{@link edm.ODSchema#getComplexTypes <em>Complex Types</em>}</li>
 *   <li>{@link edm.ODSchema#getEnumTypes <em>Enum Types</em>}</li>
 *   <li>{@link edm.ODSchema#getTypeDefinitions <em>Type Definitions</em>}</li>
 *   <li>{@link edm.ODSchema#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODSchema()
 * @model
 * @generated
 */
public interface ODSchema extends ODAnnotable {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see edm.EdmPackage#getODSchema_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link edm.ODSchema#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see edm.EdmPackage#getODSchema_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link edm.ODSchema#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Entity Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Container</em>' containment reference.
	 * @see #setEntityContainer(ODEntityContainer)
	 * @see edm.EdmPackage#getODSchema_EntityContainer()
	 * @model containment="true"
	 * @generated
	 */
	ODEntityContainer getEntityContainer();

	/**
	 * Sets the value of the '{@link edm.ODSchema#getEntityContainer <em>Entity Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Container</em>' containment reference.
	 * @see #getEntityContainer()
	 * @generated
	 */
	void setEntityContainer(ODEntityContainer value);

	/**
	 * Returns the value of the '<em><b>Entity Types</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODEntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Types</em>' containment reference list.
	 * @see edm.EdmPackage#getODSchema_EntityTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODEntityType> getEntityTypes();

	/**
	 * Returns the value of the '<em><b>Complex Types</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODComplexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Types</em>' containment reference list.
	 * @see edm.EdmPackage#getODSchema_ComplexTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODComplexType> getComplexTypes();

	/**
	 * Returns the value of the '<em><b>Enum Types</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODEnumType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Types</em>' containment reference list.
	 * @see edm.EdmPackage#getODSchema_EnumTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODEnumType> getEnumTypes();

	/**
	 * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODTypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definitions</em>' containment reference list.
	 * @see edm.EdmPackage#getODSchema_TypeDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODTypeDefinition> getTypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terms</em>' containment reference list.
	 * @see edm.EdmPackage#getODSchema_Terms()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODTerm> getTerms();

} // ODSchema
