/**
 */
package edm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Navigation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODNavigationProperty#getContainsTarget <em>Contains Target</em>}</li>
 *   <li>{@link edm.ODNavigationProperty#getPartner <em>Partner</em>}</li>
 *   <li>{@link edm.ODNavigationProperty#getNullable <em>Nullable</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODNavigationProperty()
 * @model
 * @generated
 */
public interface ODNavigationProperty extends ODElement, ODAnnotable {
	/**
	 * Returns the value of the '<em><b>Contains Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Target</em>' attribute.
	 * @see #setContainsTarget(Boolean)
	 * @see edm.EdmPackage#getODNavigationProperty_ContainsTarget()
	 * @model
	 * @generated
	 */
	Boolean getContainsTarget();

	/**
	 * Sets the value of the '{@link edm.ODNavigationProperty#getContainsTarget <em>Contains Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Target</em>' attribute.
	 * @see #getContainsTarget()
	 * @generated
	 */
	void setContainsTarget(Boolean value);

	/**
	 * Returns the value of the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' reference.
	 * @see #setPartner(ODNavigationProperty)
	 * @see edm.EdmPackage#getODNavigationProperty_Partner()
	 * @model
	 * @generated
	 */
	ODNavigationProperty getPartner();

	/**
	 * Sets the value of the '{@link edm.ODNavigationProperty#getPartner <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner</em>' reference.
	 * @see #getPartner()
	 * @generated
	 */
	void setPartner(ODNavigationProperty value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(Boolean)
	 * @see edm.EdmPackage#getODNavigationProperty_Nullable()
	 * @model
	 * @generated
	 */
	Boolean getNullable();

	/**
	 * Sets the value of the '{@link edm.ODNavigationProperty#getNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #getNullable()
	 * @generated
	 */
	void setNullable(Boolean value);

} // ODNavigationProperty
