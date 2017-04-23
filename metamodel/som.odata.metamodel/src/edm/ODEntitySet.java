/**
 */
package edm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Entity Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODEntitySet#getIncludeInServiceDocument <em>Include In Service Document</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODEntitySet()
 * @model
 * @generated
 */
public interface ODEntitySet extends ODExposedEntityType {
	/**
	 * Returns the value of the '<em><b>Include In Service Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include In Service Document</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include In Service Document</em>' attribute.
	 * @see #setIncludeInServiceDocument(Boolean)
	 * @see edm.EdmPackage#getODEntitySet_IncludeInServiceDocument()
	 * @model
	 * @generated
	 */
	Boolean getIncludeInServiceDocument();

	/**
	 * Sets the value of the '{@link edm.ODEntitySet#getIncludeInServiceDocument <em>Include In Service Document</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include In Service Document</em>' attribute.
	 * @see #getIncludeInServiceDocument()
	 * @generated
	 */
	void setIncludeInServiceDocument(Boolean value);

} // ODEntitySet
