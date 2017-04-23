/**
 */
package edm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODTypeDefinition#getUnderlyingType <em>Underlying Type</em>}</li>
 *   <li>{@link edm.ODTypeDefinition#getScale <em>Scale</em>}</li>
 *   <li>{@link edm.ODTypeDefinition#getUnicode <em>Unicode</em>}</li>
 *   <li>{@link edm.ODTypeDefinition#getPrecision <em>Precision</em>}</li>
 *   <li>{@link edm.ODTypeDefinition#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODTypeDefinition()
 * @model
 * @generated
 */
public interface ODTypeDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Underlying Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Underlying Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underlying Type</em>' reference.
	 * @see #setUnderlyingType(ODPrimitiveType)
	 * @see edm.EdmPackage#getODTypeDefinition_UnderlyingType()
	 * @model
	 * @generated
	 */
	ODPrimitiveType getUnderlyingType();

	/**
	 * Sets the value of the '{@link edm.ODTypeDefinition#getUnderlyingType <em>Underlying Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underlying Type</em>' reference.
	 * @see #getUnderlyingType()
	 * @generated
	 */
	void setUnderlyingType(ODPrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(Integer)
	 * @see edm.EdmPackage#getODTypeDefinition_Scale()
	 * @model
	 * @generated
	 */
	Integer getScale();

	/**
	 * Sets the value of the '{@link edm.ODTypeDefinition#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Integer value);

	/**
	 * Returns the value of the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unicode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unicode</em>' attribute.
	 * @see #setUnicode(Boolean)
	 * @see edm.EdmPackage#getODTypeDefinition_Unicode()
	 * @model
	 * @generated
	 */
	Boolean getUnicode();

	/**
	 * Sets the value of the '{@link edm.ODTypeDefinition#getUnicode <em>Unicode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unicode</em>' attribute.
	 * @see #getUnicode()
	 * @generated
	 */
	void setUnicode(Boolean value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Integer)
	 * @see edm.EdmPackage#getODTypeDefinition_Precision()
	 * @model
	 * @generated
	 */
	Integer getPrecision();

	/**
	 * Sets the value of the '{@link edm.ODTypeDefinition#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Integer)
	 * @see edm.EdmPackage#getODTypeDefinition_MaxLength()
	 * @model
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link edm.ODTypeDefinition#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

} // ODTypeDefinition
