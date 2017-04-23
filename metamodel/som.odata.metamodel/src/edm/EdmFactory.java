/**
 */
package edm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edm.EdmPackage
 * @generated
 */
public interface EdmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdmFactory eINSTANCE = edm.impl.EdmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>OD Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Service</em>'.
	 * @generated
	 */
	ODService createODService();

	/**
	 * Returns a new object of class '<em>OD Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Schema</em>'.
	 * @generated
	 */
	ODSchema createODSchema();

	/**
	 * Returns a new object of class '<em>OD Entity Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Entity Container</em>'.
	 * @generated
	 */
	ODEntityContainer createODEntityContainer();

	/**
	 * Returns a new object of class '<em>OD Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Named Element</em>'.
	 * @generated
	 */
	ODNamedElement createODNamedElement();

	/**
	 * Returns a new object of class '<em>OD Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Type</em>'.
	 * @generated
	 */
	ODType createODType();

	/**
	 * Returns a new object of class '<em>OD Annotable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Annotable</em>'.
	 * @generated
	 */
	ODAnnotable createODAnnotable();

	/**
	 * Returns a new object of class '<em>OD Structural Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Structural Type</em>'.
	 * @generated
	 */
	ODStructuralType createODStructuralType();

	/**
	 * Returns a new object of class '<em>OD Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Entity Type</em>'.
	 * @generated
	 */
	ODEntityType createODEntityType();

	/**
	 * Returns a new object of class '<em>OD Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Complex Type</em>'.
	 * @generated
	 */
	ODComplexType createODComplexType();

	/**
	 * Returns a new object of class '<em>OD Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Primitive Type</em>'.
	 * @generated
	 */
	ODPrimitiveType createODPrimitiveType();

	/**
	 * Returns a new object of class '<em>OD Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Enum Type</em>'.
	 * @generated
	 */
	ODEnumType createODEnumType();

	/**
	 * Returns a new object of class '<em>OD Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Property</em>'.
	 * @generated
	 */
	ODProperty createODProperty();

	/**
	 * Returns a new object of class '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Element</em>'.
	 * @generated
	 */
	TypedElement createTypedElement();

	/**
	 * Returns a new object of class '<em>OD Navigation Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Navigation Property</em>'.
	 * @generated
	 */
	ODNavigationProperty createODNavigationProperty();

	/**
	 * Returns a new object of class '<em>OD Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Element</em>'.
	 * @generated
	 */
	ODElement createODElement();

	/**
	 * Returns a new object of class '<em>OD Exposed Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Exposed Entity Type</em>'.
	 * @generated
	 */
	ODExposedEntityType createODExposedEntityType();

	/**
	 * Returns a new object of class '<em>OD Entity Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Entity Set</em>'.
	 * @generated
	 */
	ODEntitySet createODEntitySet();

	/**
	 * Returns a new object of class '<em>OD Singleton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Singleton</em>'.
	 * @generated
	 */
	ODSingleton createODSingleton();

	/**
	 * Returns a new object of class '<em>OD Navigation Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Navigation Property Binding</em>'.
	 * @generated
	 */
	ODNavigationPropertyBinding createODNavigationPropertyBinding();

	/**
	 * Returns a new object of class '<em>OD Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Annotation</em>'.
	 * @generated
	 */
	ODAnnotation createODAnnotation();

	/**
	 * Returns a new object of class '<em>OD Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Term</em>'.
	 * @generated
	 */
	ODTerm createODTerm();

	/**
	 * Returns a new object of class '<em>OD Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Type Definition</em>'.
	 * @generated
	 */
	ODTypeDefinition createODTypeDefinition();

	/**
	 * Returns a new object of class '<em>OD Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Member</em>'.
	 * @generated
	 */
	ODMember createODMember();

	/**
	 * Returns a new object of class '<em>OD Property Key Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OD Property Key Ref</em>'.
	 * @generated
	 */
	ODPropertyKeyRef createODPropertyKeyRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdmPackage getEdmPackage();

} //EdmFactory
