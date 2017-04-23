/**
 */
package edm.impl;

import edm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdmFactoryImpl extends EFactoryImpl implements EdmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdmFactory init() {
		try {
			EdmFactory theEdmFactory = (EdmFactory)EPackage.Registry.INSTANCE.getEFactory(EdmPackage.eNS_URI);
			if (theEdmFactory != null) {
				return theEdmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EdmPackage.OD_SERVICE: return createODService();
			case EdmPackage.OD_SCHEMA: return createODSchema();
			case EdmPackage.OD_ENTITY_CONTAINER: return createODEntityContainer();
			case EdmPackage.OD_NAMED_ELEMENT: return createODNamedElement();
			case EdmPackage.OD_TYPE: return createODType();
			case EdmPackage.OD_ANNOTABLE: return createODAnnotable();
			case EdmPackage.OD_STRUCTURAL_TYPE: return createODStructuralType();
			case EdmPackage.OD_ENTITY_TYPE: return createODEntityType();
			case EdmPackage.OD_COMPLEX_TYPE: return createODComplexType();
			case EdmPackage.OD_PRIMITIVE_TYPE: return createODPrimitiveType();
			case EdmPackage.OD_ENUM_TYPE: return createODEnumType();
			case EdmPackage.OD_PROPERTY: return createODProperty();
			case EdmPackage.TYPED_ELEMENT: return createTypedElement();
			case EdmPackage.OD_NAVIGATION_PROPERTY: return createODNavigationProperty();
			case EdmPackage.OD_ELEMENT: return createODElement();
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE: return createODExposedEntityType();
			case EdmPackage.OD_ENTITY_SET: return createODEntitySet();
			case EdmPackage.OD_SINGLETON: return createODSingleton();
			case EdmPackage.OD_NAVIGATION_PROPERTY_BINDING: return createODNavigationPropertyBinding();
			case EdmPackage.OD_ANNOTATION: return createODAnnotation();
			case EdmPackage.OD_TERM: return createODTerm();
			case EdmPackage.OD_TYPE_DEFINITION: return createODTypeDefinition();
			case EdmPackage.OD_MEMBER: return createODMember();
			case EdmPackage.OD_PROPERTY_KEY_REF: return createODPropertyKeyRef();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EdmPackage.OD_TERM_TARGET:
				return createODTermTargetFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EdmPackage.OD_TERM_TARGET:
				return convertODTermTargetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODService createODService() {
		ODServiceImpl odService = new ODServiceImpl();
		return odService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODSchema createODSchema() {
		ODSchemaImpl odSchema = new ODSchemaImpl();
		return odSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODEntityContainer createODEntityContainer() {
		ODEntityContainerImpl odEntityContainer = new ODEntityContainerImpl();
		return odEntityContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODNamedElement createODNamedElement() {
		ODNamedElementImpl odNamedElement = new ODNamedElementImpl();
		return odNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODType createODType() {
		ODTypeImpl odType = new ODTypeImpl();
		return odType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODAnnotable createODAnnotable() {
		ODAnnotableImpl odAnnotable = new ODAnnotableImpl();
		return odAnnotable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODStructuralType createODStructuralType() {
		ODStructuralTypeImpl odStructuralType = new ODStructuralTypeImpl();
		return odStructuralType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODEntityType createODEntityType() {
		ODEntityTypeImpl odEntityType = new ODEntityTypeImpl();
		return odEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODComplexType createODComplexType() {
		ODComplexTypeImpl odComplexType = new ODComplexTypeImpl();
		return odComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODPrimitiveType createODPrimitiveType() {
		ODPrimitiveTypeImpl odPrimitiveType = new ODPrimitiveTypeImpl();
		return odPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODEnumType createODEnumType() {
		ODEnumTypeImpl odEnumType = new ODEnumTypeImpl();
		return odEnumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODProperty createODProperty() {
		ODPropertyImpl odProperty = new ODPropertyImpl();
		return odProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODNavigationProperty createODNavigationProperty() {
		ODNavigationPropertyImpl odNavigationProperty = new ODNavigationPropertyImpl();
		return odNavigationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODElement createODElement() {
		ODElementImpl odElement = new ODElementImpl();
		return odElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODExposedEntityType createODExposedEntityType() {
		ODExposedEntityTypeImpl odExposedEntityType = new ODExposedEntityTypeImpl();
		return odExposedEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODEntitySet createODEntitySet() {
		ODEntitySetImpl odEntitySet = new ODEntitySetImpl();
		return odEntitySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODSingleton createODSingleton() {
		ODSingletonImpl odSingleton = new ODSingletonImpl();
		return odSingleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODNavigationPropertyBinding createODNavigationPropertyBinding() {
		ODNavigationPropertyBindingImpl odNavigationPropertyBinding = new ODNavigationPropertyBindingImpl();
		return odNavigationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODAnnotation createODAnnotation() {
		ODAnnotationImpl odAnnotation = new ODAnnotationImpl();
		return odAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODTerm createODTerm() {
		ODTermImpl odTerm = new ODTermImpl();
		return odTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODTypeDefinition createODTypeDefinition() {
		ODTypeDefinitionImpl odTypeDefinition = new ODTypeDefinitionImpl();
		return odTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODMember createODMember() {
		ODMemberImpl odMember = new ODMemberImpl();
		return odMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODPropertyKeyRef createODPropertyKeyRef() {
		ODPropertyKeyRefImpl odPropertyKeyRef = new ODPropertyKeyRefImpl();
		return odPropertyKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODTermTarget createODTermTargetFromString(EDataType eDataType, String initialValue) {
		ODTermTarget result = ODTermTarget.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertODTermTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmPackage getEdmPackage() {
		return (EdmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdmPackage getPackage() {
		return EdmPackage.eINSTANCE;
	}

} //EdmFactoryImpl
