/**
 */
package eer;

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
 * @see eer.EerFactory
 * @model kind="package"
 * @generated
 */
public interface EerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "eer";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EerPackage eINSTANCE = eer.impl.EerPackageImpl.init();

	/**
	 * The meta object id for the '{@link eer.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.SchemaImpl
	 * @see eer.impl.EerPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NODES = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eer.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.NodeImpl
	 * @see eer.impl.EerPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eer.impl.InheritanceImpl <em>Inheritance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.InheritanceImpl
	 * @see eer.impl.EerPackageImpl#getInheritance()
	 * @generated
	 */
	int INHERITANCE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__LABEL = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disjointness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__DISJOINTNESS = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inheritance GL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__INHERITANCE_GL = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inheritance SL</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE__INHERITANCE_SL = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Inheritance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.CategoryImpl
	 * @see eer.impl.EerPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__LABEL = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category SL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_SL = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category GL</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_GL = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.ElementImpl
	 * @see eer.impl.EerPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Link Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTE_LINK_SOURCE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.EntityTypeImpl
	 * @see eer.impl.EerPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Link Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ATTRIBUTE_LINK_SOURCE = ELEMENT__ATTRIBUTE_LINK_SOURCE;

	/**
	 * The feature id for the '<em><b>Relationship Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__RELATIONSHIP_LINK = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.EntityImpl
	 * @see eer.impl.EerPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Link Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTE_LINK_SOURCE = ENTITY_TYPE__ATTRIBUTE_LINK_SOURCE;

	/**
	 * The feature id for the '<em><b>Relationship Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONSHIP_LINK = ENTITY_TYPE__RELATIONSHIP_LINK;

	/**
	 * The feature id for the '<em><b>Is Weak</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__IS_WEAK = ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direct Inheritance Link Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DIRECT_INHERITANCE_LINK_TARGET = ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direct Inheritance Link Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DIRECT_INHERITANCE_LINK_SOURCE = ENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inheritance SL</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INHERITANCE_SL = ENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inheritance GL</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__INHERITANCE_GL = ENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category SL</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CATEGORY_SL = ENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Category GL</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CATEGORY_GL = ENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ENTITY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.RelationshipImpl
	 * @see eer.impl.EerPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Link Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ATTRIBUTE_LINK_SOURCE = ELEMENT__ATTRIBUTE_LINK_SOURCE;

	/**
	 * The feature id for the '<em><b>Is Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__IS_IDENTIFIER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Create Surrogate Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__CREATE_SURROGATE_KEY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIP_LINK = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Associative Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ASSOCIATIVE_ENTITY = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.AttributeImpl
	 * @see eer.impl.EerPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Link Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_LINK_SOURCE = ELEMENT__ATTRIBUTE_LINK_SOURCE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__COMMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SIZE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_NULL = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_UNIQUE = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_SEQUENCE = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ORDERED = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CHECK = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CARDINALITY = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attribute Link Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_LINK_TARGET = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.AssociativeEntityImpl <em>Associative Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.AssociativeEntityImpl
	 * @see eer.impl.EerPackageImpl#getAssociativeEntity()
	 * @generated
	 */
	int ASSOCIATIVE_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__NAME = ENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Attribute Link Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__ATTRIBUTE_LINK_SOURCE = ENTITY_TYPE__ATTRIBUTE_LINK_SOURCE;

	/**
	 * The feature id for the '<em><b>Relationship Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__RELATIONSHIP_LINK = ENTITY_TYPE__RELATIONSHIP_LINK;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY__CONTAINS = ENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Associative Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY_FEATURE_COUNT = ENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Associative Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATIVE_ENTITY_OPERATION_COUNT = ENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.LinkImpl
	 * @see eer.impl.EerPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 10;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eer.impl.GeneralizationLinkImpl <em>Generalization Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.GeneralizationLinkImpl
	 * @see eer.impl.EerPackageImpl#getGeneralizationLink()
	 * @generated
	 */
	int GENERALIZATION_LINK = 11;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK__ROLE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Completeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK__COMPLETENESS = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generalization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.SpecializationLinkImpl <em>Specialization Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.SpecializationLinkImpl
	 * @see eer.impl.EerPackageImpl#getSpecializationLink()
	 * @generated
	 */
	int SPECIALIZATION_LINK = 12;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_LINK__ROLE = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Specialization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Specialization Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.DirectInheritanceLinkImpl <em>Direct Inheritance Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.DirectInheritanceLinkImpl
	 * @see eer.impl.EerPackageImpl#getDirectInheritanceLink()
	 * @generated
	 */
	int DIRECT_INHERITANCE_LINK = 13;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_INHERITANCE_LINK__ROLE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_INHERITANCE_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_INHERITANCE_LINK__SOURCE = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Direct Inheritance Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_INHERITANCE_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Direct Inheritance Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_INHERITANCE_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.InheritanceGLImpl <em>Inheritance GL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.InheritanceGLImpl
	 * @see eer.impl.EerPackageImpl#getInheritanceGL()
	 * @generated
	 */
	int INHERITANCE_GL = 14;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_GL__ROLE = GENERALIZATION_LINK__ROLE;

	/**
	 * The feature id for the '<em><b>Completeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_GL__COMPLETENESS = GENERALIZATION_LINK__COMPLETENESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_GL__SOURCE = GENERALIZATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_GL__TARGET = GENERALIZATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inheritance GL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_GL_FEATURE_COUNT = GENERALIZATION_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inheritance GL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_GL_OPERATION_COUNT = GENERALIZATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.CategoryGLImpl <em>Category GL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.CategoryGLImpl
	 * @see eer.impl.EerPackageImpl#getCategoryGL()
	 * @generated
	 */
	int CATEGORY_GL = 15;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_GL__ROLE = GENERALIZATION_LINK__ROLE;

	/**
	 * The feature id for the '<em><b>Completeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_GL__COMPLETENESS = GENERALIZATION_LINK__COMPLETENESS;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_GL__SOURCE = GENERALIZATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_GL__TARGET = GENERALIZATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category GL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_GL_FEATURE_COUNT = GENERALIZATION_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Category GL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_GL_OPERATION_COUNT = GENERALIZATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.InheritanceSLImpl <em>Inheritance SL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.InheritanceSLImpl
	 * @see eer.impl.EerPackageImpl#getInheritanceSL()
	 * @generated
	 */
	int INHERITANCE_SL = 16;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_SL__ROLE = SPECIALIZATION_LINK__ROLE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_SL__SOURCE = SPECIALIZATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_SL__TARGET = SPECIALIZATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Inheritance SL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_SL_FEATURE_COUNT = SPECIALIZATION_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Inheritance SL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITANCE_SL_OPERATION_COUNT = SPECIALIZATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.CategorySLImpl <em>Category SL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.CategorySLImpl
	 * @see eer.impl.EerPackageImpl#getCategorySL()
	 * @generated
	 */
	int CATEGORY_SL = 17;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SL__ROLE = SPECIALIZATION_LINK__ROLE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SL__SOURCE = SPECIALIZATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SL__TARGET = SPECIALIZATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category SL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SL_FEATURE_COUNT = SPECIALIZATION_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Category SL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_SL_OPERATION_COUNT = SPECIALIZATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.RelationshipLinkImpl <em>Relationship Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.RelationshipLinkImpl
	 * @see eer.impl.EerPackageImpl#getRelationshipLink()
	 * @generated
	 */
	int RELATIONSHIP_LINK = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Participation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__PARTICIPATION = LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__CARDINALITY = LINK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__ROLE = LINK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__IS_IDENTIFIER = LINK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Chosen Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__CHOSEN_LINK = LINK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Relationship Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Relationship Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.impl.AttributeLinkImpl <em>Attribute Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.impl.AttributeLinkImpl
	 * @see eer.impl.EerPackageImpl#getAttributeLink()
	 * @generated
	 */
	int ATTRIBUTE_LINK = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINK__SOURCE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link eer.CardinalityType <em>Cardinality Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.CardinalityType
	 * @see eer.impl.EerPackageImpl#getCardinalityType()
	 * @generated
	 */
	int CARDINALITY_TYPE = 20;

	/**
	 * The meta object id for the '{@link eer.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.AttributeType
	 * @see eer.impl.EerPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 21;

	/**
	 * The meta object id for the '{@link eer.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.DataType
	 * @see eer.impl.EerPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 22;

	/**
	 * The meta object id for the '{@link eer.DisjointnessType <em>Disjointness Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.DisjointnessType
	 * @see eer.impl.EerPackageImpl#getDisjointnessType()
	 * @generated
	 */
	int DISJOINTNESS_TYPE = 23;

	/**
	 * The meta object id for the '{@link eer.CompletenessType <em>Completeness Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eer.CompletenessType
	 * @see eer.impl.EerPackageImpl#getCompletenessType()
	 * @generated
	 */
	int COMPLETENESS_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link eer.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see eer.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link eer.Schema#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see eer.Schema#getNodes()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link eer.Schema#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see eer.Schema#getLinks()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Links();

	/**
	 * Returns the meta object for class '{@link eer.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see eer.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link eer.Inheritance <em>Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance</em>'.
	 * @see eer.Inheritance
	 * @generated
	 */
	EClass getInheritance();

	/**
	 * Returns the meta object for the attribute '{@link eer.Inheritance#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see eer.Inheritance#getLabel()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Label();

	/**
	 * Returns the meta object for the attribute '{@link eer.Inheritance#getDisjointness <em>Disjointness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disjointness</em>'.
	 * @see eer.Inheritance#getDisjointness()
	 * @see #getInheritance()
	 * @generated
	 */
	EAttribute getInheritance_Disjointness();

	/**
	 * Returns the meta object for the reference '{@link eer.Inheritance#getInheritanceGL <em>Inheritance GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inheritance GL</em>'.
	 * @see eer.Inheritance#getInheritanceGL()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_InheritanceGL();

	/**
	 * Returns the meta object for the reference list '{@link eer.Inheritance#getInheritanceSL <em>Inheritance SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inheritance SL</em>'.
	 * @see eer.Inheritance#getInheritanceSL()
	 * @see #getInheritance()
	 * @generated
	 */
	EReference getInheritance_InheritanceSL();

	/**
	 * Returns the meta object for class '{@link eer.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see eer.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link eer.Category#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see eer.Category#getLabel()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Label();

	/**
	 * Returns the meta object for the reference '{@link eer.Category#getCategorySL <em>Category SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category SL</em>'.
	 * @see eer.Category#getCategorySL()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_CategorySL();

	/**
	 * Returns the meta object for the reference list '{@link eer.Category#getCategoryGL <em>Category GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category GL</em>'.
	 * @see eer.Category#getCategoryGL()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_CategoryGL();

	/**
	 * Returns the meta object for class '{@link eer.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see eer.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link eer.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eer.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the reference list '{@link eer.Element#getAttributeLinkSource <em>Attribute Link Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Link Source</em>'.
	 * @see eer.Element#getAttributeLinkSource()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_AttributeLinkSource();

	/**
	 * Returns the meta object for class '{@link eer.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see eer.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the reference list '{@link eer.EntityType#getRelationshipLink <em>Relationship Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship Link</em>'.
	 * @see eer.EntityType#getRelationshipLink()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_RelationshipLink();

	/**
	 * Returns the meta object for class '{@link eer.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see eer.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link eer.Entity#isIsWeak <em>Is Weak</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Weak</em>'.
	 * @see eer.Entity#isIsWeak()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_IsWeak();

	/**
	 * Returns the meta object for the reference list '{@link eer.Entity#getDirectInheritanceLinkTarget <em>Direct Inheritance Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Direct Inheritance Link Target</em>'.
	 * @see eer.Entity#getDirectInheritanceLinkTarget()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DirectInheritanceLinkTarget();

	/**
	 * Returns the meta object for the reference list '{@link eer.Entity#getDirectInheritanceLinkSource <em>Direct Inheritance Link Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Direct Inheritance Link Source</em>'.
	 * @see eer.Entity#getDirectInheritanceLinkSource()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_DirectInheritanceLinkSource();

	/**
	 * Returns the meta object for the reference list '{@link eer.Entity#getInheritanceSL <em>Inheritance SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inheritance SL</em>'.
	 * @see eer.Entity#getInheritanceSL()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_InheritanceSL();

	/**
	 * Returns the meta object for the reference list '{@link eer.Entity#getInheritanceGL <em>Inheritance GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inheritance GL</em>'.
	 * @see eer.Entity#getInheritanceGL()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_InheritanceGL();

	/**
	 * Returns the meta object for the reference list '{@link eer.Entity#getCategorySL <em>Category SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category SL</em>'.
	 * @see eer.Entity#getCategorySL()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_CategorySL();

	/**
	 * Returns the meta object for the reference list '{@link eer.Entity#getCategoryGL <em>Category GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category GL</em>'.
	 * @see eer.Entity#getCategoryGL()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_CategoryGL();

	/**
	 * Returns the meta object for class '{@link eer.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see eer.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link eer.Relationship#isIsIdentifier <em>Is Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Identifier</em>'.
	 * @see eer.Relationship#isIsIdentifier()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_IsIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link eer.Relationship#isCreateSurrogateKey <em>Create Surrogate Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Surrogate Key</em>'.
	 * @see eer.Relationship#isCreateSurrogateKey()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_CreateSurrogateKey();

	/**
	 * Returns the meta object for the reference list '{@link eer.Relationship#getRelationshipLink <em>Relationship Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship Link</em>'.
	 * @see eer.Relationship#getRelationshipLink()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelationshipLink();

	/**
	 * Returns the meta object for the container reference '{@link eer.Relationship#getAssociativeEntity <em>Associative Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Associative Entity</em>'.
	 * @see eer.Relationship#getAssociativeEntity()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_AssociativeEntity();

	/**
	 * Returns the meta object for class '{@link eer.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see eer.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see eer.Attribute#getComment()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Comment();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see eer.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eer.Attribute#getSize()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Size();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#isIsNull <em>Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Null</em>'.
	 * @see eer.Attribute#isIsNull()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsNull();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see eer.Attribute#isIsUnique()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#isIsSequence <em>Is Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sequence</em>'.
	 * @see eer.Attribute#isIsSequence()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsSequence();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#isIsOrdered <em>Is Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Ordered</em>'.
	 * @see eer.Attribute#isIsOrdered()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsOrdered();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see eer.Attribute#getCheck()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Check();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eer.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see eer.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link eer.Attribute#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see eer.Attribute#getCardinality()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link eer.Attribute#getAttributeLinkTarget <em>Attribute Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute Link Target</em>'.
	 * @see eer.Attribute#getAttributeLinkTarget()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_AttributeLinkTarget();

	/**
	 * Returns the meta object for class '{@link eer.AssociativeEntity <em>Associative Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Associative Entity</em>'.
	 * @see eer.AssociativeEntity
	 * @generated
	 */
	EClass getAssociativeEntity();

	/**
	 * Returns the meta object for the containment reference '{@link eer.AssociativeEntity#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see eer.AssociativeEntity#getContains()
	 * @see #getAssociativeEntity()
	 * @generated
	 */
	EReference getAssociativeEntity_Contains();

	/**
	 * Returns the meta object for class '{@link eer.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see eer.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link eer.GeneralizationLink <em>Generalization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization Link</em>'.
	 * @see eer.GeneralizationLink
	 * @generated
	 */
	EClass getGeneralizationLink();

	/**
	 * Returns the meta object for the attribute '{@link eer.GeneralizationLink#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see eer.GeneralizationLink#getRole()
	 * @see #getGeneralizationLink()
	 * @generated
	 */
	EAttribute getGeneralizationLink_Role();

	/**
	 * Returns the meta object for the attribute '{@link eer.GeneralizationLink#getCompleteness <em>Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completeness</em>'.
	 * @see eer.GeneralizationLink#getCompleteness()
	 * @see #getGeneralizationLink()
	 * @generated
	 */
	EAttribute getGeneralizationLink_Completeness();

	/**
	 * Returns the meta object for class '{@link eer.SpecializationLink <em>Specialization Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization Link</em>'.
	 * @see eer.SpecializationLink
	 * @generated
	 */
	EClass getSpecializationLink();

	/**
	 * Returns the meta object for the attribute '{@link eer.SpecializationLink#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see eer.SpecializationLink#getRole()
	 * @see #getSpecializationLink()
	 * @generated
	 */
	EAttribute getSpecializationLink_Role();

	/**
	 * Returns the meta object for class '{@link eer.DirectInheritanceLink <em>Direct Inheritance Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Inheritance Link</em>'.
	 * @see eer.DirectInheritanceLink
	 * @generated
	 */
	EClass getDirectInheritanceLink();

	/**
	 * Returns the meta object for the attribute '{@link eer.DirectInheritanceLink#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see eer.DirectInheritanceLink#getRole()
	 * @see #getDirectInheritanceLink()
	 * @generated
	 */
	EAttribute getDirectInheritanceLink_Role();

	/**
	 * Returns the meta object for the reference '{@link eer.DirectInheritanceLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eer.DirectInheritanceLink#getTarget()
	 * @see #getDirectInheritanceLink()
	 * @generated
	 */
	EReference getDirectInheritanceLink_Target();

	/**
	 * Returns the meta object for the reference '{@link eer.DirectInheritanceLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eer.DirectInheritanceLink#getSource()
	 * @see #getDirectInheritanceLink()
	 * @generated
	 */
	EReference getDirectInheritanceLink_Source();

	/**
	 * Returns the meta object for class '{@link eer.InheritanceGL <em>Inheritance GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance GL</em>'.
	 * @see eer.InheritanceGL
	 * @generated
	 */
	EClass getInheritanceGL();

	/**
	 * Returns the meta object for the reference '{@link eer.InheritanceGL#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eer.InheritanceGL#getSource()
	 * @see #getInheritanceGL()
	 * @generated
	 */
	EReference getInheritanceGL_Source();

	/**
	 * Returns the meta object for the reference '{@link eer.InheritanceGL#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eer.InheritanceGL#getTarget()
	 * @see #getInheritanceGL()
	 * @generated
	 */
	EReference getInheritanceGL_Target();

	/**
	 * Returns the meta object for class '{@link eer.CategoryGL <em>Category GL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category GL</em>'.
	 * @see eer.CategoryGL
	 * @generated
	 */
	EClass getCategoryGL();

	/**
	 * Returns the meta object for the reference '{@link eer.CategoryGL#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eer.CategoryGL#getSource()
	 * @see #getCategoryGL()
	 * @generated
	 */
	EReference getCategoryGL_Source();

	/**
	 * Returns the meta object for the reference '{@link eer.CategoryGL#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eer.CategoryGL#getTarget()
	 * @see #getCategoryGL()
	 * @generated
	 */
	EReference getCategoryGL_Target();

	/**
	 * Returns the meta object for class '{@link eer.InheritanceSL <em>Inheritance SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inheritance SL</em>'.
	 * @see eer.InheritanceSL
	 * @generated
	 */
	EClass getInheritanceSL();

	/**
	 * Returns the meta object for the reference '{@link eer.InheritanceSL#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eer.InheritanceSL#getSource()
	 * @see #getInheritanceSL()
	 * @generated
	 */
	EReference getInheritanceSL_Source();

	/**
	 * Returns the meta object for the reference '{@link eer.InheritanceSL#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eer.InheritanceSL#getTarget()
	 * @see #getInheritanceSL()
	 * @generated
	 */
	EReference getInheritanceSL_Target();

	/**
	 * Returns the meta object for class '{@link eer.CategorySL <em>Category SL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category SL</em>'.
	 * @see eer.CategorySL
	 * @generated
	 */
	EClass getCategorySL();

	/**
	 * Returns the meta object for the reference '{@link eer.CategorySL#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eer.CategorySL#getSource()
	 * @see #getCategorySL()
	 * @generated
	 */
	EReference getCategorySL_Source();

	/**
	 * Returns the meta object for the reference '{@link eer.CategorySL#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eer.CategorySL#getTarget()
	 * @see #getCategorySL()
	 * @generated
	 */
	EReference getCategorySL_Target();

	/**
	 * Returns the meta object for class '{@link eer.RelationshipLink <em>Relationship Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Link</em>'.
	 * @see eer.RelationshipLink
	 * @generated
	 */
	EClass getRelationshipLink();

	/**
	 * Returns the meta object for the reference '{@link eer.RelationshipLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eer.RelationshipLink#getSource()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EReference getRelationshipLink_Source();

	/**
	 * Returns the meta object for the reference '{@link eer.RelationshipLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eer.RelationshipLink#getTarget()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EReference getRelationshipLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link eer.RelationshipLink#getParticipation <em>Participation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Participation</em>'.
	 * @see eer.RelationshipLink#getParticipation()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EAttribute getRelationshipLink_Participation();

	/**
	 * Returns the meta object for the attribute '{@link eer.RelationshipLink#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see eer.RelationshipLink#getCardinality()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EAttribute getRelationshipLink_Cardinality();

	/**
	 * Returns the meta object for the attribute '{@link eer.RelationshipLink#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see eer.RelationshipLink#getRole()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EAttribute getRelationshipLink_Role();

	/**
	 * Returns the meta object for the attribute '{@link eer.RelationshipLink#isIsIdentifier <em>Is Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Identifier</em>'.
	 * @see eer.RelationshipLink#isIsIdentifier()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EAttribute getRelationshipLink_IsIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link eer.RelationshipLink#isChosenLink <em>Chosen Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chosen Link</em>'.
	 * @see eer.RelationshipLink#isChosenLink()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EAttribute getRelationshipLink_ChosenLink();

	/**
	 * Returns the meta object for class '{@link eer.AttributeLink <em>Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Link</em>'.
	 * @see eer.AttributeLink
	 * @generated
	 */
	EClass getAttributeLink();

	/**
	 * Returns the meta object for the reference '{@link eer.AttributeLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see eer.AttributeLink#getSource()
	 * @see #getAttributeLink()
	 * @generated
	 */
	EReference getAttributeLink_Source();

	/**
	 * Returns the meta object for the reference '{@link eer.AttributeLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see eer.AttributeLink#getTarget()
	 * @see #getAttributeLink()
	 * @generated
	 */
	EReference getAttributeLink_Target();

	/**
	 * Returns the meta object for enum '{@link eer.CardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality Type</em>'.
	 * @see eer.CardinalityType
	 * @generated
	 */
	EEnum getCardinalityType();

	/**
	 * Returns the meta object for enum '{@link eer.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see eer.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link eer.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see eer.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the meta object for enum '{@link eer.DisjointnessType <em>Disjointness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disjointness Type</em>'.
	 * @see eer.DisjointnessType
	 * @generated
	 */
	EEnum getDisjointnessType();

	/**
	 * Returns the meta object for enum '{@link eer.CompletenessType <em>Completeness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Completeness Type</em>'.
	 * @see eer.CompletenessType
	 * @generated
	 */
	EEnum getCompletenessType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EerFactory getEerFactory();

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
		 * The meta object literal for the '{@link eer.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.SchemaImpl
		 * @see eer.impl.EerPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__NODES = eINSTANCE.getSchema_Nodes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LINKS = eINSTANCE.getSchema_Links();

		/**
		 * The meta object literal for the '{@link eer.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.NodeImpl
		 * @see eer.impl.EerPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link eer.impl.InheritanceImpl <em>Inheritance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.InheritanceImpl
		 * @see eer.impl.EerPackageImpl#getInheritance()
		 * @generated
		 */
		EClass INHERITANCE = eINSTANCE.getInheritance();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__LABEL = eINSTANCE.getInheritance_Label();

		/**
		 * The meta object literal for the '<em><b>Disjointness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INHERITANCE__DISJOINTNESS = eINSTANCE.getInheritance_Disjointness();

		/**
		 * The meta object literal for the '<em><b>Inheritance GL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__INHERITANCE_GL = eINSTANCE.getInheritance_InheritanceGL();

		/**
		 * The meta object literal for the '<em><b>Inheritance SL</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE__INHERITANCE_SL = eINSTANCE.getInheritance_InheritanceSL();

		/**
		 * The meta object literal for the '{@link eer.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.CategoryImpl
		 * @see eer.impl.EerPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__LABEL = eINSTANCE.getCategory_Label();

		/**
		 * The meta object literal for the '<em><b>Category SL</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORY_SL = eINSTANCE.getCategory_CategorySL();

		/**
		 * The meta object literal for the '<em><b>Category GL</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORY_GL = eINSTANCE.getCategory_CategoryGL();

		/**
		 * The meta object literal for the '{@link eer.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.ElementImpl
		 * @see eer.impl.EerPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute Link Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTE_LINK_SOURCE = eINSTANCE.getElement_AttributeLinkSource();

		/**
		 * The meta object literal for the '{@link eer.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.EntityTypeImpl
		 * @see eer.impl.EerPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Relationship Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__RELATIONSHIP_LINK = eINSTANCE.getEntityType_RelationshipLink();

		/**
		 * The meta object literal for the '{@link eer.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.EntityImpl
		 * @see eer.impl.EerPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Is Weak</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__IS_WEAK = eINSTANCE.getEntity_IsWeak();

		/**
		 * The meta object literal for the '<em><b>Direct Inheritance Link Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__DIRECT_INHERITANCE_LINK_TARGET = eINSTANCE.getEntity_DirectInheritanceLinkTarget();

		/**
		 * The meta object literal for the '<em><b>Direct Inheritance Link Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__DIRECT_INHERITANCE_LINK_SOURCE = eINSTANCE.getEntity_DirectInheritanceLinkSource();

		/**
		 * The meta object literal for the '<em><b>Inheritance SL</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INHERITANCE_SL = eINSTANCE.getEntity_InheritanceSL();

		/**
		 * The meta object literal for the '<em><b>Inheritance GL</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__INHERITANCE_GL = eINSTANCE.getEntity_InheritanceGL();

		/**
		 * The meta object literal for the '<em><b>Category SL</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CATEGORY_SL = eINSTANCE.getEntity_CategorySL();

		/**
		 * The meta object literal for the '<em><b>Category GL</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__CATEGORY_GL = eINSTANCE.getEntity_CategoryGL();

		/**
		 * The meta object literal for the '{@link eer.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.RelationshipImpl
		 * @see eer.impl.EerPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Is Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__IS_IDENTIFIER = eINSTANCE.getRelationship_IsIdentifier();

		/**
		 * The meta object literal for the '<em><b>Create Surrogate Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__CREATE_SURROGATE_KEY = eINSTANCE.getRelationship_CreateSurrogateKey();

		/**
		 * The meta object literal for the '<em><b>Relationship Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATIONSHIP_LINK = eINSTANCE.getRelationship_RelationshipLink();

		/**
		 * The meta object literal for the '<em><b>Associative Entity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__ASSOCIATIVE_ENTITY = eINSTANCE.getRelationship_AssociativeEntity();

		/**
		 * The meta object literal for the '{@link eer.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.AttributeImpl
		 * @see eer.impl.EerPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__COMMENT = eINSTANCE.getAttribute_Comment();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SIZE = eINSTANCE.getAttribute_Size();

		/**
		 * The meta object literal for the '<em><b>Is Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_NULL = eINSTANCE.getAttribute_IsNull();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_UNIQUE = eINSTANCE.getAttribute_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Sequence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_SEQUENCE = eINSTANCE.getAttribute_IsSequence();

		/**
		 * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_ORDERED = eINSTANCE.getAttribute_IsOrdered();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CHECK = eINSTANCE.getAttribute_Check();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CARDINALITY = eINSTANCE.getAttribute_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Attribute Link Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTE_LINK_TARGET = eINSTANCE.getAttribute_AttributeLinkTarget();

		/**
		 * The meta object literal for the '{@link eer.impl.AssociativeEntityImpl <em>Associative Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.AssociativeEntityImpl
		 * @see eer.impl.EerPackageImpl#getAssociativeEntity()
		 * @generated
		 */
		EClass ASSOCIATIVE_ENTITY = eINSTANCE.getAssociativeEntity();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATIVE_ENTITY__CONTAINS = eINSTANCE.getAssociativeEntity_Contains();

		/**
		 * The meta object literal for the '{@link eer.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.LinkImpl
		 * @see eer.impl.EerPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link eer.impl.GeneralizationLinkImpl <em>Generalization Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.GeneralizationLinkImpl
		 * @see eer.impl.EerPackageImpl#getGeneralizationLink()
		 * @generated
		 */
		EClass GENERALIZATION_LINK = eINSTANCE.getGeneralizationLink();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_LINK__ROLE = eINSTANCE.getGeneralizationLink_Role();

		/**
		 * The meta object literal for the '<em><b>Completeness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION_LINK__COMPLETENESS = eINSTANCE.getGeneralizationLink_Completeness();

		/**
		 * The meta object literal for the '{@link eer.impl.SpecializationLinkImpl <em>Specialization Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.SpecializationLinkImpl
		 * @see eer.impl.EerPackageImpl#getSpecializationLink()
		 * @generated
		 */
		EClass SPECIALIZATION_LINK = eINSTANCE.getSpecializationLink();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION_LINK__ROLE = eINSTANCE.getSpecializationLink_Role();

		/**
		 * The meta object literal for the '{@link eer.impl.DirectInheritanceLinkImpl <em>Direct Inheritance Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.DirectInheritanceLinkImpl
		 * @see eer.impl.EerPackageImpl#getDirectInheritanceLink()
		 * @generated
		 */
		EClass DIRECT_INHERITANCE_LINK = eINSTANCE.getDirectInheritanceLink();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT_INHERITANCE_LINK__ROLE = eINSTANCE.getDirectInheritanceLink_Role();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_INHERITANCE_LINK__TARGET = eINSTANCE.getDirectInheritanceLink_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_INHERITANCE_LINK__SOURCE = eINSTANCE.getDirectInheritanceLink_Source();

		/**
		 * The meta object literal for the '{@link eer.impl.InheritanceGLImpl <em>Inheritance GL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.InheritanceGLImpl
		 * @see eer.impl.EerPackageImpl#getInheritanceGL()
		 * @generated
		 */
		EClass INHERITANCE_GL = eINSTANCE.getInheritanceGL();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_GL__SOURCE = eINSTANCE.getInheritanceGL_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_GL__TARGET = eINSTANCE.getInheritanceGL_Target();

		/**
		 * The meta object literal for the '{@link eer.impl.CategoryGLImpl <em>Category GL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.CategoryGLImpl
		 * @see eer.impl.EerPackageImpl#getCategoryGL()
		 * @generated
		 */
		EClass CATEGORY_GL = eINSTANCE.getCategoryGL();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_GL__SOURCE = eINSTANCE.getCategoryGL_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_GL__TARGET = eINSTANCE.getCategoryGL_Target();

		/**
		 * The meta object literal for the '{@link eer.impl.InheritanceSLImpl <em>Inheritance SL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.InheritanceSLImpl
		 * @see eer.impl.EerPackageImpl#getInheritanceSL()
		 * @generated
		 */
		EClass INHERITANCE_SL = eINSTANCE.getInheritanceSL();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_SL__SOURCE = eINSTANCE.getInheritanceSL_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITANCE_SL__TARGET = eINSTANCE.getInheritanceSL_Target();

		/**
		 * The meta object literal for the '{@link eer.impl.CategorySLImpl <em>Category SL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.CategorySLImpl
		 * @see eer.impl.EerPackageImpl#getCategorySL()
		 * @generated
		 */
		EClass CATEGORY_SL = eINSTANCE.getCategorySL();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_SL__SOURCE = eINSTANCE.getCategorySL_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_SL__TARGET = eINSTANCE.getCategorySL_Target();

		/**
		 * The meta object literal for the '{@link eer.impl.RelationshipLinkImpl <em>Relationship Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.RelationshipLinkImpl
		 * @see eer.impl.EerPackageImpl#getRelationshipLink()
		 * @generated
		 */
		EClass RELATIONSHIP_LINK = eINSTANCE.getRelationshipLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_LINK__SOURCE = eINSTANCE.getRelationshipLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_LINK__TARGET = eINSTANCE.getRelationshipLink_Target();

		/**
		 * The meta object literal for the '<em><b>Participation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_LINK__PARTICIPATION = eINSTANCE.getRelationshipLink_Participation();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_LINK__CARDINALITY = eINSTANCE.getRelationshipLink_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_LINK__ROLE = eINSTANCE.getRelationshipLink_Role();

		/**
		 * The meta object literal for the '<em><b>Is Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_LINK__IS_IDENTIFIER = eINSTANCE.getRelationshipLink_IsIdentifier();

		/**
		 * The meta object literal for the '<em><b>Chosen Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_LINK__CHOSEN_LINK = eINSTANCE.getRelationshipLink_ChosenLink();

		/**
		 * The meta object literal for the '{@link eer.impl.AttributeLinkImpl <em>Attribute Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.impl.AttributeLinkImpl
		 * @see eer.impl.EerPackageImpl#getAttributeLink()
		 * @generated
		 */
		EClass ATTRIBUTE_LINK = eINSTANCE.getAttributeLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LINK__SOURCE = eINSTANCE.getAttributeLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LINK__TARGET = eINSTANCE.getAttributeLink_Target();

		/**
		 * The meta object literal for the '{@link eer.CardinalityType <em>Cardinality Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.CardinalityType
		 * @see eer.impl.EerPackageImpl#getCardinalityType()
		 * @generated
		 */
		EEnum CARDINALITY_TYPE = eINSTANCE.getCardinalityType();

		/**
		 * The meta object literal for the '{@link eer.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.AttributeType
		 * @see eer.impl.EerPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link eer.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.DataType
		 * @see eer.impl.EerPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link eer.DisjointnessType <em>Disjointness Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.DisjointnessType
		 * @see eer.impl.EerPackageImpl#getDisjointnessType()
		 * @generated
		 */
		EEnum DISJOINTNESS_TYPE = eINSTANCE.getDisjointnessType();

		/**
		 * The meta object literal for the '{@link eer.CompletenessType <em>Completeness Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eer.CompletenessType
		 * @see eer.impl.EerPackageImpl#getCompletenessType()
		 * @generated
		 */
		EEnum COMPLETENESS_TYPE = eINSTANCE.getCompletenessType();

	}

} //EerPackage
