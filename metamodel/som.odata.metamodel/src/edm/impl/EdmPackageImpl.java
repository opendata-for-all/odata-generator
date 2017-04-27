/**
 */
package edm.impl;

import edm.EdmFactory;
import edm.EdmPackage;
import edm.ODAnnotable;
import edm.ODAnnotation;
import edm.ODComplexType;
import edm.ODElement;
import edm.ODEntityContainer;
import edm.ODEntitySet;
import edm.ODEntityType;
import edm.ODEnumType;
import edm.ODExposedEntityType;
import edm.ODMember;
import edm.ODNamedElement;
import edm.ODNavigationProperty;
import edm.ODNavigationPropertyBinding;
import edm.ODPrimitiveType;
import edm.ODProperty;
import edm.ODPropertyKeyRef;
import edm.ODSchema;
import edm.ODService;
import edm.ODSingleton;
import edm.ODStructuralType;
import edm.ODTerm;
import edm.ODTermTarget;
import edm.ODType;
import edm.ODTypeDefinition;
import edm.TypedElement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdmPackageImpl extends EPackageImpl implements EdmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odEntityContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odAnnotableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odStructuralTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odComplexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odEnumTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odNavigationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odExposedEntityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odEntitySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odSingletonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odNavigationPropertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odPropertyKeyRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum odTermTargetEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edm.EdmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EdmPackageImpl() {
		super(eNS_URI, EdmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EdmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EdmPackage init() {
		if (isInited) return (EdmPackage)EPackage.Registry.INSTANCE.getEPackage(EdmPackage.eNS_URI);

		// Obtain or create and register package
		EdmPackageImpl theEdmPackage = (EdmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EdmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EdmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEdmPackage.createPackageContents();

		// Initialize created meta-data
		theEdmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEdmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EdmPackage.eNS_URI, theEdmPackage);
		return theEdmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODService() {
		return odServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODService_Schemas() {
		return (EReference)odServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODSchema() {
		return odSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODSchema_Namespace() {
		return (EAttribute)odSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODSchema_Alias() {
		return (EAttribute)odSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODSchema_EntityContainer() {
		return (EReference)odSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODSchema_EntityTypes() {
		return (EReference)odSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODSchema_ComplexTypes() {
		return (EReference)odSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODSchema_EnumTypes() {
		return (EReference)odSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODSchema_TypeDefinitions() {
		return (EReference)odSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODSchema_Terms() {
		return (EReference)odSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODSchema_PrimitiveTypes() {
		return (EReference)odSchemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODEntityContainer() {
		return odEntityContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODEntityContainer_EntitySets() {
		return (EReference)odEntityContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODEntityContainer_Singletons() {
		return (EReference)odEntityContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODNamedElement() {
		return odNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODNamedElement_Name() {
		return (EAttribute)odNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODType() {
		return odTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODAnnotable() {
		return odAnnotableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODAnnotable_Annotations() {
		return (EReference)odAnnotableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODStructuralType() {
		return odStructuralTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODStructuralType_BaseType() {
		return (EReference)odStructuralTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODStructuralType_Abstract() {
		return (EAttribute)odStructuralTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODStructuralType_OpenType() {
		return (EAttribute)odStructuralTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODStructuralType_Properties() {
		return (EReference)odStructuralTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODStructuralType_NavigationProperties() {
		return (EReference)odStructuralTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODEntityType() {
		return odEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODEntityType_Key() {
		return (EReference)odEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODComplexType() {
		return odComplexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODPrimitiveType() {
		return odPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODEnumType() {
		return odEnumTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODEnumType_Members() {
		return (EReference)odEnumTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODEnumType_IsFlags() {
		return (EAttribute)odEnumTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODProperty() {
		return odPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODProperty_DefaultValue() {
		return (EAttribute)odPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODProperty_MaxLength() {
		return (EAttribute)odPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODProperty_MimeType() {
		return (EAttribute)odPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODProperty_Precision() {
		return (EAttribute)odPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODProperty_Scale() {
		return (EAttribute)odPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODProperty_Nullable() {
		return (EAttribute)odPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODProperty_Unicode() {
		return (EAttribute)odPropertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_Multivalued() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODNavigationProperty() {
		return odNavigationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODNavigationProperty_ContainsTarget() {
		return (EAttribute)odNavigationPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODNavigationProperty_Partner() {
		return (EReference)odNavigationPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODNavigationProperty_Nullable() {
		return (EAttribute)odNavigationPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODElement() {
		return odElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODExposedEntityType() {
		return odExposedEntityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODExposedEntityType_EntityType() {
		return (EReference)odExposedEntityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODExposedEntityType_NavigationPropertyBindings() {
		return (EReference)odExposedEntityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODEntitySet() {
		return odEntitySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODEntitySet_IncludeInServiceDocument() {
		return (EAttribute)odEntitySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODSingleton() {
		return odSingletonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODNavigationPropertyBinding() {
		return odNavigationPropertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODNavigationPropertyBinding_Path() {
		return (EAttribute)odNavigationPropertyBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODNavigationPropertyBinding_Target() {
		return (EAttribute)odNavigationPropertyBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODAnnotation() {
		return odAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODAnnotation_Term() {
		return (EReference)odAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODTerm() {
		return odTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODTerm_AppliesTo() {
		return (EAttribute)odTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODTerm_DefaultValue() {
		return (EAttribute)odTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODTerm_Type() {
		return (EReference)odTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODTypeDefinition() {
		return odTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODTypeDefinition_UnderlyingType() {
		return (EReference)odTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODTypeDefinition_Scale() {
		return (EAttribute)odTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODTypeDefinition_Unicode() {
		return (EAttribute)odTypeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODTypeDefinition_Precision() {
		return (EAttribute)odTypeDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODTypeDefinition_MaxLength() {
		return (EAttribute)odTypeDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODMember() {
		return odMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODMember_Value() {
		return (EAttribute)odMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getODPropertyKeyRef() {
		return odPropertyKeyRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getODPropertyKeyRef_Alias() {
		return (EAttribute)odPropertyKeyRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getODPropertyKeyRef_Property() {
		return (EReference)odPropertyKeyRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getODTermTarget() {
		return odTermTargetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmFactory getEdmFactory() {
		return (EdmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		odServiceEClass = createEClass(OD_SERVICE);
		createEReference(odServiceEClass, OD_SERVICE__SCHEMAS);

		odSchemaEClass = createEClass(OD_SCHEMA);
		createEAttribute(odSchemaEClass, OD_SCHEMA__NAMESPACE);
		createEAttribute(odSchemaEClass, OD_SCHEMA__ALIAS);
		createEReference(odSchemaEClass, OD_SCHEMA__ENTITY_CONTAINER);
		createEReference(odSchemaEClass, OD_SCHEMA__ENTITY_TYPES);
		createEReference(odSchemaEClass, OD_SCHEMA__COMPLEX_TYPES);
		createEReference(odSchemaEClass, OD_SCHEMA__ENUM_TYPES);
		createEReference(odSchemaEClass, OD_SCHEMA__TYPE_DEFINITIONS);
		createEReference(odSchemaEClass, OD_SCHEMA__TERMS);
		createEReference(odSchemaEClass, OD_SCHEMA__PRIMITIVE_TYPES);

		odEntityContainerEClass = createEClass(OD_ENTITY_CONTAINER);
		createEReference(odEntityContainerEClass, OD_ENTITY_CONTAINER__ENTITY_SETS);
		createEReference(odEntityContainerEClass, OD_ENTITY_CONTAINER__SINGLETONS);

		odNamedElementEClass = createEClass(OD_NAMED_ELEMENT);
		createEAttribute(odNamedElementEClass, OD_NAMED_ELEMENT__NAME);

		odTypeEClass = createEClass(OD_TYPE);

		odAnnotableEClass = createEClass(OD_ANNOTABLE);
		createEReference(odAnnotableEClass, OD_ANNOTABLE__ANNOTATIONS);

		odStructuralTypeEClass = createEClass(OD_STRUCTURAL_TYPE);
		createEReference(odStructuralTypeEClass, OD_STRUCTURAL_TYPE__BASE_TYPE);
		createEAttribute(odStructuralTypeEClass, OD_STRUCTURAL_TYPE__ABSTRACT);
		createEAttribute(odStructuralTypeEClass, OD_STRUCTURAL_TYPE__OPEN_TYPE);
		createEReference(odStructuralTypeEClass, OD_STRUCTURAL_TYPE__PROPERTIES);
		createEReference(odStructuralTypeEClass, OD_STRUCTURAL_TYPE__NAVIGATION_PROPERTIES);

		odEntityTypeEClass = createEClass(OD_ENTITY_TYPE);
		createEReference(odEntityTypeEClass, OD_ENTITY_TYPE__KEY);

		odComplexTypeEClass = createEClass(OD_COMPLEX_TYPE);

		odPrimitiveTypeEClass = createEClass(OD_PRIMITIVE_TYPE);

		odEnumTypeEClass = createEClass(OD_ENUM_TYPE);
		createEReference(odEnumTypeEClass, OD_ENUM_TYPE__MEMBERS);
		createEAttribute(odEnumTypeEClass, OD_ENUM_TYPE__IS_FLAGS);

		odPropertyEClass = createEClass(OD_PROPERTY);
		createEAttribute(odPropertyEClass, OD_PROPERTY__DEFAULT_VALUE);
		createEAttribute(odPropertyEClass, OD_PROPERTY__MAX_LENGTH);
		createEAttribute(odPropertyEClass, OD_PROPERTY__MIME_TYPE);
		createEAttribute(odPropertyEClass, OD_PROPERTY__PRECISION);
		createEAttribute(odPropertyEClass, OD_PROPERTY__SCALE);
		createEAttribute(odPropertyEClass, OD_PROPERTY__NULLABLE);
		createEAttribute(odPropertyEClass, OD_PROPERTY__UNICODE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__MULTIVALUED);

		odNavigationPropertyEClass = createEClass(OD_NAVIGATION_PROPERTY);
		createEAttribute(odNavigationPropertyEClass, OD_NAVIGATION_PROPERTY__CONTAINS_TARGET);
		createEReference(odNavigationPropertyEClass, OD_NAVIGATION_PROPERTY__PARTNER);
		createEAttribute(odNavigationPropertyEClass, OD_NAVIGATION_PROPERTY__NULLABLE);

		odElementEClass = createEClass(OD_ELEMENT);

		odExposedEntityTypeEClass = createEClass(OD_EXPOSED_ENTITY_TYPE);
		createEReference(odExposedEntityTypeEClass, OD_EXPOSED_ENTITY_TYPE__ENTITY_TYPE);
		createEReference(odExposedEntityTypeEClass, OD_EXPOSED_ENTITY_TYPE__NAVIGATION_PROPERTY_BINDINGS);

		odEntitySetEClass = createEClass(OD_ENTITY_SET);
		createEAttribute(odEntitySetEClass, OD_ENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT);

		odSingletonEClass = createEClass(OD_SINGLETON);

		odNavigationPropertyBindingEClass = createEClass(OD_NAVIGATION_PROPERTY_BINDING);
		createEAttribute(odNavigationPropertyBindingEClass, OD_NAVIGATION_PROPERTY_BINDING__PATH);
		createEAttribute(odNavigationPropertyBindingEClass, OD_NAVIGATION_PROPERTY_BINDING__TARGET);

		odAnnotationEClass = createEClass(OD_ANNOTATION);
		createEReference(odAnnotationEClass, OD_ANNOTATION__TERM);

		odTermEClass = createEClass(OD_TERM);
		createEAttribute(odTermEClass, OD_TERM__APPLIES_TO);
		createEAttribute(odTermEClass, OD_TERM__DEFAULT_VALUE);
		createEReference(odTermEClass, OD_TERM__TYPE);

		odTypeDefinitionEClass = createEClass(OD_TYPE_DEFINITION);
		createEReference(odTypeDefinitionEClass, OD_TYPE_DEFINITION__UNDERLYING_TYPE);
		createEAttribute(odTypeDefinitionEClass, OD_TYPE_DEFINITION__SCALE);
		createEAttribute(odTypeDefinitionEClass, OD_TYPE_DEFINITION__UNICODE);
		createEAttribute(odTypeDefinitionEClass, OD_TYPE_DEFINITION__PRECISION);
		createEAttribute(odTypeDefinitionEClass, OD_TYPE_DEFINITION__MAX_LENGTH);

		odMemberEClass = createEClass(OD_MEMBER);
		createEAttribute(odMemberEClass, OD_MEMBER__VALUE);

		odPropertyKeyRefEClass = createEClass(OD_PROPERTY_KEY_REF);
		createEAttribute(odPropertyKeyRefEClass, OD_PROPERTY_KEY_REF__ALIAS);
		createEReference(odPropertyKeyRefEClass, OD_PROPERTY_KEY_REF__PROPERTY);

		// Create enums
		odTermTargetEEnum = createEEnum(OD_TERM_TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		odSchemaEClass.getESuperTypes().add(this.getODAnnotable());
		odEntityContainerEClass.getESuperTypes().add(this.getODNamedElement());
		odEntityContainerEClass.getESuperTypes().add(this.getODAnnotable());
		odTypeEClass.getESuperTypes().add(this.getODNamedElement());
		odStructuralTypeEClass.getESuperTypes().add(this.getODType());
		odStructuralTypeEClass.getESuperTypes().add(this.getODAnnotable());
		odEntityTypeEClass.getESuperTypes().add(this.getODStructuralType());
		odComplexTypeEClass.getESuperTypes().add(this.getODStructuralType());
		odPrimitiveTypeEClass.getESuperTypes().add(this.getODType());
		odEnumTypeEClass.getESuperTypes().add(this.getODPrimitiveType());
		odPropertyEClass.getESuperTypes().add(this.getODElement());
		odNavigationPropertyEClass.getESuperTypes().add(this.getODElement());
		odNavigationPropertyEClass.getESuperTypes().add(this.getODAnnotable());
		odElementEClass.getESuperTypes().add(this.getTypedElement());
		odElementEClass.getESuperTypes().add(this.getODNamedElement());
		odElementEClass.getESuperTypes().add(this.getODAnnotable());
		odExposedEntityTypeEClass.getESuperTypes().add(this.getODNamedElement());
		odExposedEntityTypeEClass.getESuperTypes().add(this.getODAnnotable());
		odEntitySetEClass.getESuperTypes().add(this.getODExposedEntityType());
		odSingletonEClass.getESuperTypes().add(this.getODExposedEntityType());
		odTermEClass.getESuperTypes().add(this.getODNamedElement());
		odTermEClass.getESuperTypes().add(this.getODAnnotable());
		odMemberEClass.getESuperTypes().add(this.getODNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(odServiceEClass, ODService.class, "ODService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODService_Schemas(), this.getODSchema(), null, "schemas", null, 0, -1, ODService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odSchemaEClass, ODSchema.class, "ODSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODSchema_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODSchema_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODSchema_EntityContainer(), this.getODEntityContainer(), null, "entityContainer", null, 0, 1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODSchema_EntityTypes(), this.getODEntityType(), null, "entityTypes", null, 0, -1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODSchema_ComplexTypes(), this.getODComplexType(), null, "complexTypes", null, 0, -1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODSchema_EnumTypes(), this.getODEnumType(), null, "enumTypes", null, 0, -1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODSchema_TypeDefinitions(), this.getODTypeDefinition(), null, "typeDefinitions", null, 0, -1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODSchema_Terms(), this.getODTerm(), null, "terms", null, 0, -1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODSchema_PrimitiveTypes(), this.getODPrimitiveType(), null, "primitiveTypes", null, 0, -1, ODSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odEntityContainerEClass, ODEntityContainer.class, "ODEntityContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODEntityContainer_EntitySets(), this.getODEntitySet(), null, "entitySets", null, 0, -1, ODEntityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODEntityContainer_Singletons(), this.getODSingleton(), null, "singletons", null, 0, -1, ODEntityContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odNamedElementEClass, ODNamedElement.class, "ODNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ODNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odTypeEClass, ODType.class, "ODType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(odAnnotableEClass, ODAnnotable.class, "ODAnnotable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODAnnotable_Annotations(), this.getODAnnotation(), null, "annotations", null, 0, -1, ODAnnotable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odStructuralTypeEClass, ODStructuralType.class, "ODStructuralType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODStructuralType_BaseType(), this.getODStructuralType(), null, "baseType", null, 0, 1, ODStructuralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODStructuralType_Abstract(), ecorePackage.getEBooleanObject(), "abstract", null, 0, 1, ODStructuralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODStructuralType_OpenType(), ecorePackage.getEBooleanObject(), "openType", null, 0, 1, ODStructuralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODStructuralType_Properties(), this.getODProperty(), null, "properties", null, 0, -1, ODStructuralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODStructuralType_NavigationProperties(), this.getODNavigationProperty(), null, "navigationProperties", null, 0, -1, ODStructuralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odEntityTypeEClass, ODEntityType.class, "ODEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODEntityType_Key(), this.getODPropertyKeyRef(), null, "key", null, 0, -1, ODEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odComplexTypeEClass, ODComplexType.class, "ODComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(odPrimitiveTypeEClass, ODPrimitiveType.class, "ODPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(odEnumTypeEClass, ODEnumType.class, "ODEnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODEnumType_Members(), this.getODMember(), null, "Members", null, 0, -1, ODEnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODEnumType_IsFlags(), ecorePackage.getEBooleanObject(), "isFlags", null, 0, 1, ODEnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odPropertyEClass, ODProperty.class, "ODProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODProperty_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, ODProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODProperty_MaxLength(), ecorePackage.getEIntegerObject(), "maxLength", null, 0, 1, ODProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODProperty_MimeType(), ecorePackage.getEString(), "mimeType", null, 0, 1, ODProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODProperty_Precision(), ecorePackage.getEIntegerObject(), "precision", null, 0, 1, ODProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODProperty_Scale(), ecorePackage.getEIntegerObject(), "scale", null, 0, 1, ODProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODProperty_Nullable(), ecorePackage.getEBooleanObject(), "nullable", null, 0, 1, ODProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODProperty_Unicode(), ecorePackage.getEBooleanObject(), "unicode", null, 0, 1, ODProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getODType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypedElement_Multivalued(), ecorePackage.getEBooleanObject(), "multivalued", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odNavigationPropertyEClass, ODNavigationProperty.class, "ODNavigationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODNavigationProperty_ContainsTarget(), ecorePackage.getEBooleanObject(), "containsTarget", null, 0, 1, ODNavigationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODNavigationProperty_Partner(), this.getODNavigationProperty(), null, "partner", null, 0, 1, ODNavigationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODNavigationProperty_Nullable(), ecorePackage.getEBooleanObject(), "nullable", null, 0, 1, ODNavigationProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odElementEClass, ODElement.class, "ODElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(odExposedEntityTypeEClass, ODExposedEntityType.class, "ODExposedEntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODExposedEntityType_EntityType(), this.getODEntityType(), null, "entityType", null, 0, 1, ODExposedEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODExposedEntityType_NavigationPropertyBindings(), this.getODNavigationPropertyBinding(), null, "navigationPropertyBindings", null, 0, -1, ODExposedEntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odEntitySetEClass, ODEntitySet.class, "ODEntitySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODEntitySet_IncludeInServiceDocument(), ecorePackage.getEBooleanObject(), "includeInServiceDocument", null, 0, 1, ODEntitySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odSingletonEClass, ODSingleton.class, "ODSingleton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(odNavigationPropertyBindingEClass, ODNavigationPropertyBinding.class, "ODNavigationPropertyBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODNavigationPropertyBinding_Path(), ecorePackage.getEString(), "path", null, 0, 1, ODNavigationPropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODNavigationPropertyBinding_Target(), ecorePackage.getEString(), "target", null, 0, 1, ODNavigationPropertyBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odAnnotationEClass, ODAnnotation.class, "ODAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODAnnotation_Term(), this.getODTerm(), null, "term", null, 0, 1, ODAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odTermEClass, ODTerm.class, "ODTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODTerm_AppliesTo(), this.getODTermTarget(), "appliesTo", null, 0, -1, ODTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODTerm_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, ODTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODTerm_Type(), this.getODType(), null, "type", null, 0, 1, ODTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odTypeDefinitionEClass, ODTypeDefinition.class, "ODTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getODTypeDefinition_UnderlyingType(), this.getODPrimitiveType(), null, "underlyingType", null, 0, 1, ODTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODTypeDefinition_Scale(), ecorePackage.getEIntegerObject(), "scale", null, 0, 1, ODTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODTypeDefinition_Unicode(), ecorePackage.getEBooleanObject(), "unicode", null, 0, 1, ODTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODTypeDefinition_Precision(), ecorePackage.getEIntegerObject(), "precision", null, 0, 1, ODTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getODTypeDefinition_MaxLength(), ecorePackage.getEIntegerObject(), "maxLength", null, 0, 1, ODTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odMemberEClass, ODMember.class, "ODMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODMember_Value(), ecorePackage.getEString(), "value", null, 0, 1, ODMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odPropertyKeyRefEClass, ODPropertyKeyRef.class, "ODPropertyKeyRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getODPropertyKeyRef_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, ODPropertyKeyRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getODPropertyKeyRef_Property(), this.getODProperty(), null, "property", null, 0, 1, ODPropertyKeyRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(odTermTargetEEnum, ODTermTarget.class, "ODTermTarget");
		addEEnumLiteral(odTermTargetEEnum, ODTermTarget.UNDEFINED);
		addEEnumLiteral(odTermTargetEEnum, ODTermTarget.SCHEMA);
		addEEnumLiteral(odTermTargetEEnum, ODTermTarget.ENTITY_TYPE);
		addEEnumLiteral(odTermTargetEEnum, ODTermTarget.PROPERTY);

		// Create resource
		createResource(eNS_URI);
	}

} //EdmPackageImpl
