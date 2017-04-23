/**
 */
package edm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edm.EdmFactory
 * @model kind="package"
 * @generated
 */
public interface EdmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://odata.org/edm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdmPackage eINSTANCE = edm.impl.EdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link edm.impl.ODServiceImpl <em>OD Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODServiceImpl
	 * @see edm.impl.EdmPackageImpl#getODService()
	 * @generated
	 */
	int OD_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SERVICE__SCHEMAS = 0;

	/**
	 * The number of structural features of the '<em>OD Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OD Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODAnnotableImpl <em>OD Annotable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODAnnotableImpl
	 * @see edm.impl.EdmPackageImpl#getODAnnotable()
	 * @generated
	 */
	int OD_ANNOTABLE = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ANNOTABLE__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>OD Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ANNOTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OD Annotable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ANNOTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODSchemaImpl <em>OD Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODSchemaImpl
	 * @see edm.impl.EdmPackageImpl#getODSchema()
	 * @generated
	 */
	int OD_SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__ANNOTATIONS = OD_ANNOTABLE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__NAMESPACE = OD_ANNOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__ALIAS = OD_ANNOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__ENTITY_CONTAINER = OD_ANNOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entity Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__ENTITY_TYPES = OD_ANNOTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Complex Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__COMPLEX_TYPES = OD_ANNOTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Enum Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__ENUM_TYPES = OD_ANNOTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__TYPE_DEFINITIONS = OD_ANNOTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Terms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__TERMS = OD_ANNOTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Primitive Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA__PRIMITIVE_TYPES = OD_ANNOTABLE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>OD Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA_FEATURE_COUNT = OD_ANNOTABLE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>OD Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SCHEMA_OPERATION_COUNT = OD_ANNOTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODNamedElementImpl <em>OD Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODNamedElementImpl
	 * @see edm.impl.EdmPackageImpl#getODNamedElement()
	 * @generated
	 */
	int OD_NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>OD Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OD Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODEntityContainerImpl <em>OD Entity Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODEntityContainerImpl
	 * @see edm.impl.EdmPackageImpl#getODEntityContainer()
	 * @generated
	 */
	int OD_ENTITY_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_CONTAINER__NAME = OD_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_CONTAINER__ANNOTATIONS = OD_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_CONTAINER__ENTITY_SETS = OD_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Singletons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_CONTAINER__SINGLETONS = OD_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OD Entity Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_CONTAINER_FEATURE_COUNT = OD_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>OD Entity Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_CONTAINER_OPERATION_COUNT = OD_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODTypeImpl <em>OD Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODTypeImpl
	 * @see edm.impl.EdmPackageImpl#getODType()
	 * @generated
	 */
	int OD_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE__NAME = OD_NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>OD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_FEATURE_COUNT = OD_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OD Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_OPERATION_COUNT = OD_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODStructuralTypeImpl <em>OD Structural Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODStructuralTypeImpl
	 * @see edm.impl.EdmPackageImpl#getODStructuralType()
	 * @generated
	 */
	int OD_STRUCTURAL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STRUCTURAL_TYPE__NAME = OD_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STRUCTURAL_TYPE__ANNOTATIONS = OD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STRUCTURAL_TYPE__BASE_TYPE = OD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STRUCTURAL_TYPE__ELEMENTS = OD_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STRUCTURAL_TYPE__ABSTRACT = OD_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Open Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STRUCTURAL_TYPE__OPEN_TYPE = OD_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>OD Structural Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STRUCTURAL_TYPE_FEATURE_COUNT = OD_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>OD Structural Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_STRUCTURAL_TYPE_OPERATION_COUNT = OD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODEntityTypeImpl <em>OD Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODEntityTypeImpl
	 * @see edm.impl.EdmPackageImpl#getODEntityType()
	 * @generated
	 */
	int OD_ENTITY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE__NAME = OD_STRUCTURAL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE__ANNOTATIONS = OD_STRUCTURAL_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE__BASE_TYPE = OD_STRUCTURAL_TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE__ELEMENTS = OD_STRUCTURAL_TYPE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE__ABSTRACT = OD_STRUCTURAL_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Open Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE__OPEN_TYPE = OD_STRUCTURAL_TYPE__OPEN_TYPE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE__KEY = OD_STRUCTURAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OD Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE_FEATURE_COUNT = OD_STRUCTURAL_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OD Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_TYPE_OPERATION_COUNT = OD_STRUCTURAL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODComplexTypeImpl <em>OD Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODComplexTypeImpl
	 * @see edm.impl.EdmPackageImpl#getODComplexType()
	 * @generated
	 */
	int OD_COMPLEX_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_COMPLEX_TYPE__NAME = OD_STRUCTURAL_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_COMPLEX_TYPE__ANNOTATIONS = OD_STRUCTURAL_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_COMPLEX_TYPE__BASE_TYPE = OD_STRUCTURAL_TYPE__BASE_TYPE;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_COMPLEX_TYPE__ELEMENTS = OD_STRUCTURAL_TYPE__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_COMPLEX_TYPE__ABSTRACT = OD_STRUCTURAL_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Open Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_COMPLEX_TYPE__OPEN_TYPE = OD_STRUCTURAL_TYPE__OPEN_TYPE;

	/**
	 * The number of structural features of the '<em>OD Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_COMPLEX_TYPE_FEATURE_COUNT = OD_STRUCTURAL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OD Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_COMPLEX_TYPE_OPERATION_COUNT = OD_STRUCTURAL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODPrimitiveTypeImpl <em>OD Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODPrimitiveTypeImpl
	 * @see edm.impl.EdmPackageImpl#getODPrimitiveType()
	 * @generated
	 */
	int OD_PRIMITIVE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PRIMITIVE_TYPE__NAME = OD_TYPE__NAME;

	/**
	 * The number of structural features of the '<em>OD Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PRIMITIVE_TYPE_FEATURE_COUNT = OD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OD Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PRIMITIVE_TYPE_OPERATION_COUNT = OD_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODEnumTypeImpl <em>OD Enum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODEnumTypeImpl
	 * @see edm.impl.EdmPackageImpl#getODEnumType()
	 * @generated
	 */
	int OD_ENUM_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENUM_TYPE__NAME = OD_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENUM_TYPE__MEMBERS = OD_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OD Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENUM_TYPE_FEATURE_COUNT = OD_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OD Enum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENUM_TYPE_OPERATION_COUNT = OD_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.TypedElementImpl
	 * @see edm.impl.EdmPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__MULTIVALUED = 1;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODElementImpl <em>OD Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODElementImpl
	 * @see edm.impl.EdmPackageImpl#getODElement()
	 * @generated
	 */
	int OD_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ELEMENT__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ELEMENT__MULTIVALUED = TYPED_ELEMENT__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ELEMENT__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ELEMENT__ANNOTATIONS = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ELEMENT_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OD Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ELEMENT_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODPropertyImpl <em>OD Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODPropertyImpl
	 * @see edm.impl.EdmPackageImpl#getODProperty()
	 * @generated
	 */
	int OD_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__TYPE = OD_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__MULTIVALUED = OD_ELEMENT__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__NAME = OD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__ANNOTATIONS = OD_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__DEFAULT_VALUE = OD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__MAX_LENGTH = OD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__MIME_TYPE = OD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__PRECISION = OD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__SCALE = OD_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__NULLABLE = OD_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY__UNICODE = OD_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>OD Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY_FEATURE_COUNT = OD_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>OD Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY_OPERATION_COUNT = OD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODNavigationPropertyImpl <em>OD Navigation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODNavigationPropertyImpl
	 * @see edm.impl.EdmPackageImpl#getODNavigationProperty()
	 * @generated
	 */
	int OD_NAVIGATION_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY__TYPE = OD_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Multivalued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY__MULTIVALUED = OD_ELEMENT__MULTIVALUED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY__NAME = OD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY__ANNOTATIONS = OD_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Contains Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY__CONTAINS_TARGET = OD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY__PARTNER = OD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY__NULLABLE = OD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OD Navigation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY_FEATURE_COUNT = OD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>OD Navigation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY_OPERATION_COUNT = OD_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODExposedEntityTypeImpl <em>OD Exposed Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODExposedEntityTypeImpl
	 * @see edm.impl.EdmPackageImpl#getODExposedEntityType()
	 * @generated
	 */
	int OD_EXPOSED_ENTITY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_EXPOSED_ENTITY_TYPE__NAME = OD_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS = OD_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE = OD_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Navigation Property Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS = OD_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OD Exposed Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_EXPOSED_ENTITY_TYPE_FEATURE_COUNT = OD_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>OD Exposed Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_EXPOSED_ENTITY_TYPE_OPERATION_COUNT = OD_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODEntitySetImpl <em>OD Entity Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODEntitySetImpl
	 * @see edm.impl.EdmPackageImpl#getODEntitySet()
	 * @generated
	 */
	int OD_ENTITY_SET = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_SET__NAME = OD_EXPOSED_ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_SET__ANNOTATIONS = OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_SET__ENTITY_TYPE = OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Navigation Property Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_SET__NAVIGATION_PROPERTY_BINDINGS = OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS;

	/**
	 * The feature id for the '<em><b>Include In Service Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT = OD_EXPOSED_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OD Entity Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_SET_FEATURE_COUNT = OD_EXPOSED_ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OD Entity Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ENTITY_SET_OPERATION_COUNT = OD_EXPOSED_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODSingletonImpl <em>OD Singleton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODSingletonImpl
	 * @see edm.impl.EdmPackageImpl#getODSingleton()
	 * @generated
	 */
	int OD_SINGLETON = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SINGLETON__NAME = OD_EXPOSED_ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SINGLETON__ANNOTATIONS = OD_EXPOSED_ENTITY_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SINGLETON__ENTITY_TYPE = OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE;

	/**
	 * The feature id for the '<em><b>Navigation Property Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SINGLETON__NAVIGATION_PROPERTY_BINDINGS = OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS;

	/**
	 * The number of structural features of the '<em>OD Singleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SINGLETON_FEATURE_COUNT = OD_EXPOSED_ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OD Singleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_SINGLETON_OPERATION_COUNT = OD_EXPOSED_ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODNavigationPropertyBindingImpl <em>OD Navigation Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODNavigationPropertyBindingImpl
	 * @see edm.impl.EdmPackageImpl#getODNavigationPropertyBinding()
	 * @generated
	 */
	int OD_NAVIGATION_PROPERTY_BINDING = 18;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY_BINDING__PATH = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY_BINDING__TARGET = 1;

	/**
	 * The number of structural features of the '<em>OD Navigation Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OD Navigation Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_NAVIGATION_PROPERTY_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODAnnotationImpl <em>OD Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODAnnotationImpl
	 * @see edm.impl.EdmPackageImpl#getODAnnotation()
	 * @generated
	 */
	int OD_ANNOTATION = 19;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ANNOTATION__TERM = 0;

	/**
	 * The number of structural features of the '<em>OD Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OD Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODTermImpl <em>OD Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODTermImpl
	 * @see edm.impl.EdmPackageImpl#getODTerm()
	 * @generated
	 */
	int OD_TERM = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TERM__NAME = OD_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TERM__ANNOTATIONS = OD_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TERM__APPLIES_TO = OD_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TERM__DEFAULT_VALUE = OD_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TERM__TYPE = OD_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>OD Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TERM_FEATURE_COUNT = OD_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>OD Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TERM_OPERATION_COUNT = OD_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODTypeDefinitionImpl <em>OD Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODTypeDefinitionImpl
	 * @see edm.impl.EdmPackageImpl#getODTypeDefinition()
	 * @generated
	 */
	int OD_TYPE_DEFINITION = 21;

	/**
	 * The feature id for the '<em><b>Underlying Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_DEFINITION__UNDERLYING_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_DEFINITION__SCALE = 1;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_DEFINITION__UNICODE = 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_DEFINITION__PRECISION = 3;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_DEFINITION__MAX_LENGTH = 4;

	/**
	 * The number of structural features of the '<em>OD Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_DEFINITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>OD Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_TYPE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODMemberImpl <em>OD Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODMemberImpl
	 * @see edm.impl.EdmPackageImpl#getODMember()
	 * @generated
	 */
	int OD_MEMBER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_MEMBER__NAME = OD_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_MEMBER__VALUE = OD_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OD Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_MEMBER_FEATURE_COUNT = OD_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>OD Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_MEMBER_OPERATION_COUNT = OD_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edm.impl.ODPropertyKeyRefImpl <em>OD Property Key Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.impl.ODPropertyKeyRefImpl
	 * @see edm.impl.EdmPackageImpl#getODPropertyKeyRef()
	 * @generated
	 */
	int OD_PROPERTY_KEY_REF = 23;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY_KEY_REF__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY_KEY_REF__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>OD Property Key Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY_KEY_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OD Property Key Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OD_PROPERTY_KEY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edm.ODTermTarget <em>OD Term Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edm.ODTermTarget
	 * @see edm.impl.EdmPackageImpl#getODTermTarget()
	 * @generated
	 */
	int OD_TERM_TARGET = 24;


	/**
	 * Returns the meta object for class '{@link edm.ODService <em>OD Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Service</em>'.
	 * @see edm.ODService
	 * @generated
	 */
	EClass getODService();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODService#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schemas</em>'.
	 * @see edm.ODService#getSchemas()
	 * @see #getODService()
	 * @generated
	 */
	EReference getODService_Schemas();

	/**
	 * Returns the meta object for class '{@link edm.ODSchema <em>OD Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Schema</em>'.
	 * @see edm.ODSchema
	 * @generated
	 */
	EClass getODSchema();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODSchema#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see edm.ODSchema#getNamespace()
	 * @see #getODSchema()
	 * @generated
	 */
	EAttribute getODSchema_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODSchema#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see edm.ODSchema#getAlias()
	 * @see #getODSchema()
	 * @generated
	 */
	EAttribute getODSchema_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link edm.ODSchema#getEntityContainer <em>Entity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity Container</em>'.
	 * @see edm.ODSchema#getEntityContainer()
	 * @see #getODSchema()
	 * @generated
	 */
	EReference getODSchema_EntityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODSchema#getEntityTypes <em>Entity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Types</em>'.
	 * @see edm.ODSchema#getEntityTypes()
	 * @see #getODSchema()
	 * @generated
	 */
	EReference getODSchema_EntityTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODSchema#getComplexTypes <em>Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Types</em>'.
	 * @see edm.ODSchema#getComplexTypes()
	 * @see #getODSchema()
	 * @generated
	 */
	EReference getODSchema_ComplexTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODSchema#getEnumTypes <em>Enum Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Types</em>'.
	 * @see edm.ODSchema#getEnumTypes()
	 * @see #getODSchema()
	 * @generated
	 */
	EReference getODSchema_EnumTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODSchema#getTypeDefinitions <em>Type Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Definitions</em>'.
	 * @see edm.ODSchema#getTypeDefinitions()
	 * @see #getODSchema()
	 * @generated
	 */
	EReference getODSchema_TypeDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODSchema#getTerms <em>Terms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terms</em>'.
	 * @see edm.ODSchema#getTerms()
	 * @see #getODSchema()
	 * @generated
	 */
	EReference getODSchema_Terms();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODSchema#getPrimitiveTypes <em>Primitive Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Types</em>'.
	 * @see edm.ODSchema#getPrimitiveTypes()
	 * @see #getODSchema()
	 * @generated
	 */
	EReference getODSchema_PrimitiveTypes();

	/**
	 * Returns the meta object for class '{@link edm.ODEntityContainer <em>OD Entity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Entity Container</em>'.
	 * @see edm.ODEntityContainer
	 * @generated
	 */
	EClass getODEntityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODEntityContainer#getEntitySets <em>Entity Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Sets</em>'.
	 * @see edm.ODEntityContainer#getEntitySets()
	 * @see #getODEntityContainer()
	 * @generated
	 */
	EReference getODEntityContainer_EntitySets();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODEntityContainer#getSingletons <em>Singletons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Singletons</em>'.
	 * @see edm.ODEntityContainer#getSingletons()
	 * @see #getODEntityContainer()
	 * @generated
	 */
	EReference getODEntityContainer_Singletons();

	/**
	 * Returns the meta object for class '{@link edm.ODNamedElement <em>OD Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Named Element</em>'.
	 * @see edm.ODNamedElement
	 * @generated
	 */
	EClass getODNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edm.ODNamedElement#getName()
	 * @see #getODNamedElement()
	 * @generated
	 */
	EAttribute getODNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link edm.ODType <em>OD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Type</em>'.
	 * @see edm.ODType
	 * @generated
	 */
	EClass getODType();

	/**
	 * Returns the meta object for class '{@link edm.ODAnnotable <em>OD Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Annotable</em>'.
	 * @see edm.ODAnnotable
	 * @generated
	 */
	EClass getODAnnotable();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODAnnotable#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see edm.ODAnnotable#getAnnotations()
	 * @see #getODAnnotable()
	 * @generated
	 */
	EReference getODAnnotable_Annotations();

	/**
	 * Returns the meta object for class '{@link edm.ODStructuralType <em>OD Structural Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Structural Type</em>'.
	 * @see edm.ODStructuralType
	 * @generated
	 */
	EClass getODStructuralType();

	/**
	 * Returns the meta object for the reference '{@link edm.ODStructuralType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Type</em>'.
	 * @see edm.ODStructuralType#getBaseType()
	 * @see #getODStructuralType()
	 * @generated
	 */
	EReference getODStructuralType_BaseType();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODStructuralType#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see edm.ODStructuralType#getElements()
	 * @see #getODStructuralType()
	 * @generated
	 */
	EReference getODStructuralType_Elements();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODStructuralType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see edm.ODStructuralType#getAbstract()
	 * @see #getODStructuralType()
	 * @generated
	 */
	EAttribute getODStructuralType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODStructuralType#getOpenType <em>Open Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Type</em>'.
	 * @see edm.ODStructuralType#getOpenType()
	 * @see #getODStructuralType()
	 * @generated
	 */
	EAttribute getODStructuralType_OpenType();

	/**
	 * Returns the meta object for class '{@link edm.ODEntityType <em>OD Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Entity Type</em>'.
	 * @see edm.ODEntityType
	 * @generated
	 */
	EClass getODEntityType();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODEntityType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see edm.ODEntityType#getKey()
	 * @see #getODEntityType()
	 * @generated
	 */
	EReference getODEntityType_Key();

	/**
	 * Returns the meta object for class '{@link edm.ODComplexType <em>OD Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Complex Type</em>'.
	 * @see edm.ODComplexType
	 * @generated
	 */
	EClass getODComplexType();

	/**
	 * Returns the meta object for class '{@link edm.ODPrimitiveType <em>OD Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Primitive Type</em>'.
	 * @see edm.ODPrimitiveType
	 * @generated
	 */
	EClass getODPrimitiveType();

	/**
	 * Returns the meta object for class '{@link edm.ODEnumType <em>OD Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Enum Type</em>'.
	 * @see edm.ODEnumType
	 * @generated
	 */
	EClass getODEnumType();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODEnumType#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see edm.ODEnumType#getMembers()
	 * @see #getODEnumType()
	 * @generated
	 */
	EReference getODEnumType_Members();

	/**
	 * Returns the meta object for class '{@link edm.ODProperty <em>OD Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Property</em>'.
	 * @see edm.ODProperty
	 * @generated
	 */
	EClass getODProperty();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see edm.ODProperty#getDefaultValue()
	 * @see #getODProperty()
	 * @generated
	 */
	EAttribute getODProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODProperty#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see edm.ODProperty#getMaxLength()
	 * @see #getODProperty()
	 * @generated
	 */
	EAttribute getODProperty_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODProperty#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see edm.ODProperty#getMimeType()
	 * @see #getODProperty()
	 * @generated
	 */
	EAttribute getODProperty_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODProperty#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see edm.ODProperty#getPrecision()
	 * @see #getODProperty()
	 * @generated
	 */
	EAttribute getODProperty_Precision();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODProperty#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see edm.ODProperty#getScale()
	 * @see #getODProperty()
	 * @generated
	 */
	EAttribute getODProperty_Scale();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODProperty#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see edm.ODProperty#getNullable()
	 * @see #getODProperty()
	 * @generated
	 */
	EAttribute getODProperty_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODProperty#getUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see edm.ODProperty#getUnicode()
	 * @see #getODProperty()
	 * @generated
	 */
	EAttribute getODProperty_Unicode();

	/**
	 * Returns the meta object for class '{@link edm.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see edm.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the reference '{@link edm.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edm.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EReference getTypedElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link edm.TypedElement#getMultivalued <em>Multivalued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multivalued</em>'.
	 * @see edm.TypedElement#getMultivalued()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Multivalued();

	/**
	 * Returns the meta object for class '{@link edm.ODNavigationProperty <em>OD Navigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Navigation Property</em>'.
	 * @see edm.ODNavigationProperty
	 * @generated
	 */
	EClass getODNavigationProperty();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODNavigationProperty#getContainsTarget <em>Contains Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains Target</em>'.
	 * @see edm.ODNavigationProperty#getContainsTarget()
	 * @see #getODNavigationProperty()
	 * @generated
	 */
	EAttribute getODNavigationProperty_ContainsTarget();

	/**
	 * Returns the meta object for the reference '{@link edm.ODNavigationProperty#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner</em>'.
	 * @see edm.ODNavigationProperty#getPartner()
	 * @see #getODNavigationProperty()
	 * @generated
	 */
	EReference getODNavigationProperty_Partner();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODNavigationProperty#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see edm.ODNavigationProperty#getNullable()
	 * @see #getODNavigationProperty()
	 * @generated
	 */
	EAttribute getODNavigationProperty_Nullable();

	/**
	 * Returns the meta object for class '{@link edm.ODElement <em>OD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Element</em>'.
	 * @see edm.ODElement
	 * @generated
	 */
	EClass getODElement();

	/**
	 * Returns the meta object for class '{@link edm.ODExposedEntityType <em>OD Exposed Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Exposed Entity Type</em>'.
	 * @see edm.ODExposedEntityType
	 * @generated
	 */
	EClass getODExposedEntityType();

	/**
	 * Returns the meta object for the reference '{@link edm.ODExposedEntityType#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Type</em>'.
	 * @see edm.ODExposedEntityType#getEntityType()
	 * @see #getODExposedEntityType()
	 * @generated
	 */
	EReference getODExposedEntityType_EntityType();

	/**
	 * Returns the meta object for the containment reference list '{@link edm.ODExposedEntityType#getNavigationPropertyBindings <em>Navigation Property Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Property Bindings</em>'.
	 * @see edm.ODExposedEntityType#getNavigationPropertyBindings()
	 * @see #getODExposedEntityType()
	 * @generated
	 */
	EReference getODExposedEntityType_NavigationPropertyBindings();

	/**
	 * Returns the meta object for class '{@link edm.ODEntitySet <em>OD Entity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Entity Set</em>'.
	 * @see edm.ODEntitySet
	 * @generated
	 */
	EClass getODEntitySet();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODEntitySet#getIncludeInServiceDocument <em>Include In Service Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Service Document</em>'.
	 * @see edm.ODEntitySet#getIncludeInServiceDocument()
	 * @see #getODEntitySet()
	 * @generated
	 */
	EAttribute getODEntitySet_IncludeInServiceDocument();

	/**
	 * Returns the meta object for class '{@link edm.ODSingleton <em>OD Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Singleton</em>'.
	 * @see edm.ODSingleton
	 * @generated
	 */
	EClass getODSingleton();

	/**
	 * Returns the meta object for class '{@link edm.ODNavigationPropertyBinding <em>OD Navigation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Navigation Property Binding</em>'.
	 * @see edm.ODNavigationPropertyBinding
	 * @generated
	 */
	EClass getODNavigationPropertyBinding();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODNavigationPropertyBinding#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see edm.ODNavigationPropertyBinding#getPath()
	 * @see #getODNavigationPropertyBinding()
	 * @generated
	 */
	EAttribute getODNavigationPropertyBinding_Path();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODNavigationPropertyBinding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see edm.ODNavigationPropertyBinding#getTarget()
	 * @see #getODNavigationPropertyBinding()
	 * @generated
	 */
	EAttribute getODNavigationPropertyBinding_Target();

	/**
	 * Returns the meta object for class '{@link edm.ODAnnotation <em>OD Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Annotation</em>'.
	 * @see edm.ODAnnotation
	 * @generated
	 */
	EClass getODAnnotation();

	/**
	 * Returns the meta object for the reference '{@link edm.ODAnnotation#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Term</em>'.
	 * @see edm.ODAnnotation#getTerm()
	 * @see #getODAnnotation()
	 * @generated
	 */
	EReference getODAnnotation_Term();

	/**
	 * Returns the meta object for class '{@link edm.ODTerm <em>OD Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Term</em>'.
	 * @see edm.ODTerm
	 * @generated
	 */
	EClass getODTerm();

	/**
	 * Returns the meta object for the attribute list '{@link edm.ODTerm#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Applies To</em>'.
	 * @see edm.ODTerm#getAppliesTo()
	 * @see #getODTerm()
	 * @generated
	 */
	EAttribute getODTerm_AppliesTo();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODTerm#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see edm.ODTerm#getDefaultValue()
	 * @see #getODTerm()
	 * @generated
	 */
	EAttribute getODTerm_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link edm.ODTerm#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edm.ODTerm#getType()
	 * @see #getODTerm()
	 * @generated
	 */
	EReference getODTerm_Type();

	/**
	 * Returns the meta object for class '{@link edm.ODTypeDefinition <em>OD Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Type Definition</em>'.
	 * @see edm.ODTypeDefinition
	 * @generated
	 */
	EClass getODTypeDefinition();

	/**
	 * Returns the meta object for the reference '{@link edm.ODTypeDefinition#getUnderlyingType <em>Underlying Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Underlying Type</em>'.
	 * @see edm.ODTypeDefinition#getUnderlyingType()
	 * @see #getODTypeDefinition()
	 * @generated
	 */
	EReference getODTypeDefinition_UnderlyingType();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODTypeDefinition#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see edm.ODTypeDefinition#getScale()
	 * @see #getODTypeDefinition()
	 * @generated
	 */
	EAttribute getODTypeDefinition_Scale();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODTypeDefinition#getUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see edm.ODTypeDefinition#getUnicode()
	 * @see #getODTypeDefinition()
	 * @generated
	 */
	EAttribute getODTypeDefinition_Unicode();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODTypeDefinition#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see edm.ODTypeDefinition#getPrecision()
	 * @see #getODTypeDefinition()
	 * @generated
	 */
	EAttribute getODTypeDefinition_Precision();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODTypeDefinition#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see edm.ODTypeDefinition#getMaxLength()
	 * @see #getODTypeDefinition()
	 * @generated
	 */
	EAttribute getODTypeDefinition_MaxLength();

	/**
	 * Returns the meta object for class '{@link edm.ODMember <em>OD Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Member</em>'.
	 * @see edm.ODMember
	 * @generated
	 */
	EClass getODMember();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODMember#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edm.ODMember#getValue()
	 * @see #getODMember()
	 * @generated
	 */
	EAttribute getODMember_Value();

	/**
	 * Returns the meta object for class '{@link edm.ODPropertyKeyRef <em>OD Property Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OD Property Key Ref</em>'.
	 * @see edm.ODPropertyKeyRef
	 * @generated
	 */
	EClass getODPropertyKeyRef();

	/**
	 * Returns the meta object for the attribute '{@link edm.ODPropertyKeyRef#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see edm.ODPropertyKeyRef#getAlias()
	 * @see #getODPropertyKeyRef()
	 * @generated
	 */
	EAttribute getODPropertyKeyRef_Alias();

	/**
	 * Returns the meta object for the reference '{@link edm.ODPropertyKeyRef#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see edm.ODPropertyKeyRef#getProperty()
	 * @see #getODPropertyKeyRef()
	 * @generated
	 */
	EReference getODPropertyKeyRef_Property();

	/**
	 * Returns the meta object for enum '{@link edm.ODTermTarget <em>OD Term Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OD Term Target</em>'.
	 * @see edm.ODTermTarget
	 * @generated
	 */
	EEnum getODTermTarget();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdmFactory getEdmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edm.impl.ODServiceImpl <em>OD Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODServiceImpl
		 * @see edm.impl.EdmPackageImpl#getODService()
		 * @generated
		 */
		EClass OD_SERVICE = eINSTANCE.getODService();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_SERVICE__SCHEMAS = eINSTANCE.getODService_Schemas();

		/**
		 * The meta object literal for the '{@link edm.impl.ODSchemaImpl <em>OD Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODSchemaImpl
		 * @see edm.impl.EdmPackageImpl#getODSchema()
		 * @generated
		 */
		EClass OD_SCHEMA = eINSTANCE.getODSchema();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_SCHEMA__NAMESPACE = eINSTANCE.getODSchema_Namespace();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_SCHEMA__ALIAS = eINSTANCE.getODSchema_Alias();

		/**
		 * The meta object literal for the '<em><b>Entity Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_SCHEMA__ENTITY_CONTAINER = eINSTANCE.getODSchema_EntityContainer();

		/**
		 * The meta object literal for the '<em><b>Entity Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_SCHEMA__ENTITY_TYPES = eINSTANCE.getODSchema_EntityTypes();

		/**
		 * The meta object literal for the '<em><b>Complex Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_SCHEMA__COMPLEX_TYPES = eINSTANCE.getODSchema_ComplexTypes();

		/**
		 * The meta object literal for the '<em><b>Enum Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_SCHEMA__ENUM_TYPES = eINSTANCE.getODSchema_EnumTypes();

		/**
		 * The meta object literal for the '<em><b>Type Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_SCHEMA__TYPE_DEFINITIONS = eINSTANCE.getODSchema_TypeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_SCHEMA__TERMS = eINSTANCE.getODSchema_Terms();

		/**
		 * The meta object literal for the '<em><b>Primitive Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_SCHEMA__PRIMITIVE_TYPES = eINSTANCE.getODSchema_PrimitiveTypes();

		/**
		 * The meta object literal for the '{@link edm.impl.ODEntityContainerImpl <em>OD Entity Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODEntityContainerImpl
		 * @see edm.impl.EdmPackageImpl#getODEntityContainer()
		 * @generated
		 */
		EClass OD_ENTITY_CONTAINER = eINSTANCE.getODEntityContainer();

		/**
		 * The meta object literal for the '<em><b>Entity Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_ENTITY_CONTAINER__ENTITY_SETS = eINSTANCE.getODEntityContainer_EntitySets();

		/**
		 * The meta object literal for the '<em><b>Singletons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_ENTITY_CONTAINER__SINGLETONS = eINSTANCE.getODEntityContainer_Singletons();

		/**
		 * The meta object literal for the '{@link edm.impl.ODNamedElementImpl <em>OD Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODNamedElementImpl
		 * @see edm.impl.EdmPackageImpl#getODNamedElement()
		 * @generated
		 */
		EClass OD_NAMED_ELEMENT = eINSTANCE.getODNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_NAMED_ELEMENT__NAME = eINSTANCE.getODNamedElement_Name();

		/**
		 * The meta object literal for the '{@link edm.impl.ODTypeImpl <em>OD Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODTypeImpl
		 * @see edm.impl.EdmPackageImpl#getODType()
		 * @generated
		 */
		EClass OD_TYPE = eINSTANCE.getODType();

		/**
		 * The meta object literal for the '{@link edm.impl.ODAnnotableImpl <em>OD Annotable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODAnnotableImpl
		 * @see edm.impl.EdmPackageImpl#getODAnnotable()
		 * @generated
		 */
		EClass OD_ANNOTABLE = eINSTANCE.getODAnnotable();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_ANNOTABLE__ANNOTATIONS = eINSTANCE.getODAnnotable_Annotations();

		/**
		 * The meta object literal for the '{@link edm.impl.ODStructuralTypeImpl <em>OD Structural Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODStructuralTypeImpl
		 * @see edm.impl.EdmPackageImpl#getODStructuralType()
		 * @generated
		 */
		EClass OD_STRUCTURAL_TYPE = eINSTANCE.getODStructuralType();

		/**
		 * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_STRUCTURAL_TYPE__BASE_TYPE = eINSTANCE.getODStructuralType_BaseType();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_STRUCTURAL_TYPE__ELEMENTS = eINSTANCE.getODStructuralType_Elements();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_STRUCTURAL_TYPE__ABSTRACT = eINSTANCE.getODStructuralType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Open Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_STRUCTURAL_TYPE__OPEN_TYPE = eINSTANCE.getODStructuralType_OpenType();

		/**
		 * The meta object literal for the '{@link edm.impl.ODEntityTypeImpl <em>OD Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODEntityTypeImpl
		 * @see edm.impl.EdmPackageImpl#getODEntityType()
		 * @generated
		 */
		EClass OD_ENTITY_TYPE = eINSTANCE.getODEntityType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_ENTITY_TYPE__KEY = eINSTANCE.getODEntityType_Key();

		/**
		 * The meta object literal for the '{@link edm.impl.ODComplexTypeImpl <em>OD Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODComplexTypeImpl
		 * @see edm.impl.EdmPackageImpl#getODComplexType()
		 * @generated
		 */
		EClass OD_COMPLEX_TYPE = eINSTANCE.getODComplexType();

		/**
		 * The meta object literal for the '{@link edm.impl.ODPrimitiveTypeImpl <em>OD Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODPrimitiveTypeImpl
		 * @see edm.impl.EdmPackageImpl#getODPrimitiveType()
		 * @generated
		 */
		EClass OD_PRIMITIVE_TYPE = eINSTANCE.getODPrimitiveType();

		/**
		 * The meta object literal for the '{@link edm.impl.ODEnumTypeImpl <em>OD Enum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODEnumTypeImpl
		 * @see edm.impl.EdmPackageImpl#getODEnumType()
		 * @generated
		 */
		EClass OD_ENUM_TYPE = eINSTANCE.getODEnumType();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_ENUM_TYPE__MEMBERS = eINSTANCE.getODEnumType_Members();

		/**
		 * The meta object literal for the '{@link edm.impl.ODPropertyImpl <em>OD Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODPropertyImpl
		 * @see edm.impl.EdmPackageImpl#getODProperty()
		 * @generated
		 */
		EClass OD_PROPERTY = eINSTANCE.getODProperty();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_PROPERTY__DEFAULT_VALUE = eINSTANCE.getODProperty_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_PROPERTY__MAX_LENGTH = eINSTANCE.getODProperty_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_PROPERTY__MIME_TYPE = eINSTANCE.getODProperty_MimeType();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_PROPERTY__PRECISION = eINSTANCE.getODProperty_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_PROPERTY__SCALE = eINSTANCE.getODProperty_Scale();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_PROPERTY__NULLABLE = eINSTANCE.getODProperty_Nullable();

		/**
		 * The meta object literal for the '<em><b>Unicode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_PROPERTY__UNICODE = eINSTANCE.getODProperty_Unicode();

		/**
		 * The meta object literal for the '{@link edm.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.TypedElementImpl
		 * @see edm.impl.EdmPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '<em><b>Multivalued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__MULTIVALUED = eINSTANCE.getTypedElement_Multivalued();

		/**
		 * The meta object literal for the '{@link edm.impl.ODNavigationPropertyImpl <em>OD Navigation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODNavigationPropertyImpl
		 * @see edm.impl.EdmPackageImpl#getODNavigationProperty()
		 * @generated
		 */
		EClass OD_NAVIGATION_PROPERTY = eINSTANCE.getODNavigationProperty();

		/**
		 * The meta object literal for the '<em><b>Contains Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_NAVIGATION_PROPERTY__CONTAINS_TARGET = eINSTANCE.getODNavigationProperty_ContainsTarget();

		/**
		 * The meta object literal for the '<em><b>Partner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_NAVIGATION_PROPERTY__PARTNER = eINSTANCE.getODNavigationProperty_Partner();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_NAVIGATION_PROPERTY__NULLABLE = eINSTANCE.getODNavigationProperty_Nullable();

		/**
		 * The meta object literal for the '{@link edm.impl.ODElementImpl <em>OD Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODElementImpl
		 * @see edm.impl.EdmPackageImpl#getODElement()
		 * @generated
		 */
		EClass OD_ELEMENT = eINSTANCE.getODElement();

		/**
		 * The meta object literal for the '{@link edm.impl.ODExposedEntityTypeImpl <em>OD Exposed Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODExposedEntityTypeImpl
		 * @see edm.impl.EdmPackageImpl#getODExposedEntityType()
		 * @generated
		 */
		EClass OD_EXPOSED_ENTITY_TYPE = eINSTANCE.getODExposedEntityType();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE = eINSTANCE.getODExposedEntityType_EntityType();

		/**
		 * The meta object literal for the '<em><b>Navigation Property Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS = eINSTANCE.getODExposedEntityType_NavigationPropertyBindings();

		/**
		 * The meta object literal for the '{@link edm.impl.ODEntitySetImpl <em>OD Entity Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODEntitySetImpl
		 * @see edm.impl.EdmPackageImpl#getODEntitySet()
		 * @generated
		 */
		EClass OD_ENTITY_SET = eINSTANCE.getODEntitySet();

		/**
		 * The meta object literal for the '<em><b>Include In Service Document</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_ENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT = eINSTANCE.getODEntitySet_IncludeInServiceDocument();

		/**
		 * The meta object literal for the '{@link edm.impl.ODSingletonImpl <em>OD Singleton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODSingletonImpl
		 * @see edm.impl.EdmPackageImpl#getODSingleton()
		 * @generated
		 */
		EClass OD_SINGLETON = eINSTANCE.getODSingleton();

		/**
		 * The meta object literal for the '{@link edm.impl.ODNavigationPropertyBindingImpl <em>OD Navigation Property Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODNavigationPropertyBindingImpl
		 * @see edm.impl.EdmPackageImpl#getODNavigationPropertyBinding()
		 * @generated
		 */
		EClass OD_NAVIGATION_PROPERTY_BINDING = eINSTANCE.getODNavigationPropertyBinding();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_NAVIGATION_PROPERTY_BINDING__PATH = eINSTANCE.getODNavigationPropertyBinding_Path();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_NAVIGATION_PROPERTY_BINDING__TARGET = eINSTANCE.getODNavigationPropertyBinding_Target();

		/**
		 * The meta object literal for the '{@link edm.impl.ODAnnotationImpl <em>OD Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODAnnotationImpl
		 * @see edm.impl.EdmPackageImpl#getODAnnotation()
		 * @generated
		 */
		EClass OD_ANNOTATION = eINSTANCE.getODAnnotation();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_ANNOTATION__TERM = eINSTANCE.getODAnnotation_Term();

		/**
		 * The meta object literal for the '{@link edm.impl.ODTermImpl <em>OD Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODTermImpl
		 * @see edm.impl.EdmPackageImpl#getODTerm()
		 * @generated
		 */
		EClass OD_TERM = eINSTANCE.getODTerm();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TERM__APPLIES_TO = eINSTANCE.getODTerm_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TERM__DEFAULT_VALUE = eINSTANCE.getODTerm_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_TERM__TYPE = eINSTANCE.getODTerm_Type();

		/**
		 * The meta object literal for the '{@link edm.impl.ODTypeDefinitionImpl <em>OD Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODTypeDefinitionImpl
		 * @see edm.impl.EdmPackageImpl#getODTypeDefinition()
		 * @generated
		 */
		EClass OD_TYPE_DEFINITION = eINSTANCE.getODTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Underlying Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_TYPE_DEFINITION__UNDERLYING_TYPE = eINSTANCE.getODTypeDefinition_UnderlyingType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TYPE_DEFINITION__SCALE = eINSTANCE.getODTypeDefinition_Scale();

		/**
		 * The meta object literal for the '<em><b>Unicode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TYPE_DEFINITION__UNICODE = eINSTANCE.getODTypeDefinition_Unicode();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TYPE_DEFINITION__PRECISION = eINSTANCE.getODTypeDefinition_Precision();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_TYPE_DEFINITION__MAX_LENGTH = eINSTANCE.getODTypeDefinition_MaxLength();

		/**
		 * The meta object literal for the '{@link edm.impl.ODMemberImpl <em>OD Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODMemberImpl
		 * @see edm.impl.EdmPackageImpl#getODMember()
		 * @generated
		 */
		EClass OD_MEMBER = eINSTANCE.getODMember();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_MEMBER__VALUE = eINSTANCE.getODMember_Value();

		/**
		 * The meta object literal for the '{@link edm.impl.ODPropertyKeyRefImpl <em>OD Property Key Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.impl.ODPropertyKeyRefImpl
		 * @see edm.impl.EdmPackageImpl#getODPropertyKeyRef()
		 * @generated
		 */
		EClass OD_PROPERTY_KEY_REF = eINSTANCE.getODPropertyKeyRef();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OD_PROPERTY_KEY_REF__ALIAS = eINSTANCE.getODPropertyKeyRef_Alias();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OD_PROPERTY_KEY_REF__PROPERTY = eINSTANCE.getODPropertyKeyRef_Property();

		/**
		 * The meta object literal for the '{@link edm.ODTermTarget <em>OD Term Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edm.ODTermTarget
		 * @see edm.impl.EdmPackageImpl#getODTermTarget()
		 * @generated
		 */
		EEnum OD_TERM_TARGET = eINSTANCE.getODTermTarget();

	}

} //EdmPackage
