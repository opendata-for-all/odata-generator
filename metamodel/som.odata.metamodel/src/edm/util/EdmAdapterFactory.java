/**
 */
package edm.util;

import edm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edm.EdmPackage
 * @generated
 */
public class EdmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EdmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdmSwitch<Adapter> modelSwitch =
		new EdmSwitch<Adapter>() {
			@Override
			public Adapter caseODService(ODService object) {
				return createODServiceAdapter();
			}
			@Override
			public Adapter caseODSchema(ODSchema object) {
				return createODSchemaAdapter();
			}
			@Override
			public Adapter caseODEntityContainer(ODEntityContainer object) {
				return createODEntityContainerAdapter();
			}
			@Override
			public Adapter caseODNamedElement(ODNamedElement object) {
				return createODNamedElementAdapter();
			}
			@Override
			public Adapter caseODType(ODType object) {
				return createODTypeAdapter();
			}
			@Override
			public Adapter caseODAnnotable(ODAnnotable object) {
				return createODAnnotableAdapter();
			}
			@Override
			public Adapter caseODStructuralType(ODStructuralType object) {
				return createODStructuralTypeAdapter();
			}
			@Override
			public Adapter caseODEntityType(ODEntityType object) {
				return createODEntityTypeAdapter();
			}
			@Override
			public Adapter caseODComplexType(ODComplexType object) {
				return createODComplexTypeAdapter();
			}
			@Override
			public Adapter caseODPrimitiveType(ODPrimitiveType object) {
				return createODPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseODEnumType(ODEnumType object) {
				return createODEnumTypeAdapter();
			}
			@Override
			public Adapter caseODProperty(ODProperty object) {
				return createODPropertyAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseODNavigationProperty(ODNavigationProperty object) {
				return createODNavigationPropertyAdapter();
			}
			@Override
			public Adapter caseODElement(ODElement object) {
				return createODElementAdapter();
			}
			@Override
			public Adapter caseODExposedEntityType(ODExposedEntityType object) {
				return createODExposedEntityTypeAdapter();
			}
			@Override
			public Adapter caseODEntitySet(ODEntitySet object) {
				return createODEntitySetAdapter();
			}
			@Override
			public Adapter caseODSingleton(ODSingleton object) {
				return createODSingletonAdapter();
			}
			@Override
			public Adapter caseODNavigationPropertyBinding(ODNavigationPropertyBinding object) {
				return createODNavigationPropertyBindingAdapter();
			}
			@Override
			public Adapter caseODAnnotation(ODAnnotation object) {
				return createODAnnotationAdapter();
			}
			@Override
			public Adapter caseODTerm(ODTerm object) {
				return createODTermAdapter();
			}
			@Override
			public Adapter caseODTypeDefinition(ODTypeDefinition object) {
				return createODTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseODMember(ODMember object) {
				return createODMemberAdapter();
			}
			@Override
			public Adapter caseODPropertyKeyRef(ODPropertyKeyRef object) {
				return createODPropertyKeyRefAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edm.ODService <em>OD Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODService
	 * @generated
	 */
	public Adapter createODServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODSchema <em>OD Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODSchema
	 * @generated
	 */
	public Adapter createODSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODEntityContainer <em>OD Entity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODEntityContainer
	 * @generated
	 */
	public Adapter createODEntityContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODNamedElement <em>OD Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODNamedElement
	 * @generated
	 */
	public Adapter createODNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODType <em>OD Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODType
	 * @generated
	 */
	public Adapter createODTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODAnnotable <em>OD Annotable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODAnnotable
	 * @generated
	 */
	public Adapter createODAnnotableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODStructuralType <em>OD Structural Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODStructuralType
	 * @generated
	 */
	public Adapter createODStructuralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODEntityType <em>OD Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODEntityType
	 * @generated
	 */
	public Adapter createODEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODComplexType <em>OD Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODComplexType
	 * @generated
	 */
	public Adapter createODComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODPrimitiveType <em>OD Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODPrimitiveType
	 * @generated
	 */
	public Adapter createODPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODEnumType <em>OD Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODEnumType
	 * @generated
	 */
	public Adapter createODEnumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODProperty <em>OD Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODProperty
	 * @generated
	 */
	public Adapter createODPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODNavigationProperty <em>OD Navigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODNavigationProperty
	 * @generated
	 */
	public Adapter createODNavigationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODElement <em>OD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODElement
	 * @generated
	 */
	public Adapter createODElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODExposedEntityType <em>OD Exposed Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODExposedEntityType
	 * @generated
	 */
	public Adapter createODExposedEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODEntitySet <em>OD Entity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODEntitySet
	 * @generated
	 */
	public Adapter createODEntitySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODSingleton <em>OD Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODSingleton
	 * @generated
	 */
	public Adapter createODSingletonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODNavigationPropertyBinding <em>OD Navigation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODNavigationPropertyBinding
	 * @generated
	 */
	public Adapter createODNavigationPropertyBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODAnnotation <em>OD Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODAnnotation
	 * @generated
	 */
	public Adapter createODAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODTerm <em>OD Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODTerm
	 * @generated
	 */
	public Adapter createODTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODTypeDefinition <em>OD Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODTypeDefinition
	 * @generated
	 */
	public Adapter createODTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODMember <em>OD Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODMember
	 * @generated
	 */
	public Adapter createODMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edm.ODPropertyKeyRef <em>OD Property Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edm.ODPropertyKeyRef
	 * @generated
	 */
	public Adapter createODPropertyKeyRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EdmAdapterFactory
