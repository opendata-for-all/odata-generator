/**
 */
package edm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OD Structural Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edm.ODStructuralType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link edm.ODStructuralType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link edm.ODStructuralType#getOpenType <em>Open Type</em>}</li>
 *   <li>{@link edm.ODStructuralType#getProperties <em>Properties</em>}</li>
 *   <li>{@link edm.ODStructuralType#getNavigationProperties <em>Navigation Properties</em>}</li>
 * </ul>
 *
 * @see edm.EdmPackage#getODStructuralType()
 * @model
 * @generated
 */
public interface ODStructuralType extends ODType, ODAnnotable {
	/**
	 * Returns the value of the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Type</em>' reference.
	 * @see #setBaseType(ODStructuralType)
	 * @see edm.EdmPackage#getODStructuralType_BaseType()
	 * @model
	 * @generated
	 */
	ODStructuralType getBaseType();

	/**
	 * Sets the value of the '{@link edm.ODStructuralType#getBaseType <em>Base Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Type</em>' reference.
	 * @see #getBaseType()
	 * @generated
	 */
	void setBaseType(ODStructuralType value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(Boolean)
	 * @see edm.EdmPackage#getODStructuralType_Abstract()
	 * @model
	 * @generated
	 */
	Boolean getAbstract();

	/**
	 * Sets the value of the '{@link edm.ODStructuralType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Open Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Type</em>' attribute.
	 * @see #setOpenType(Boolean)
	 * @see edm.EdmPackage#getODStructuralType_OpenType()
	 * @model
	 * @generated
	 */
	Boolean getOpenType();

	/**
	 * Sets the value of the '{@link edm.ODStructuralType#getOpenType <em>Open Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Type</em>' attribute.
	 * @see #getOpenType()
	 * @generated
	 */
	void setOpenType(Boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see edm.EdmPackage#getODStructuralType_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Navigation Properties</b></em>' containment reference list.
	 * The list contents are of type {@link edm.ODNavigationProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Properties</em>' containment reference list.
	 * @see edm.EdmPackage#getODStructuralType_NavigationProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ODNavigationProperty> getNavigationProperties();

} // ODStructuralType
