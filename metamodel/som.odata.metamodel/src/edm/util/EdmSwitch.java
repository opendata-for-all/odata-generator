/**
 */
package edm.util;

import edm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edm.EdmPackage
 * @generated
 */
public class EdmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EdmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdmSwitch() {
		if (modelPackage == null) {
			modelPackage = EdmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EdmPackage.OD_SERVICE: {
				ODService odService = (ODService)theEObject;
				T result = caseODService(odService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_SCHEMA: {
				ODSchema odSchema = (ODSchema)theEObject;
				T result = caseODSchema(odSchema);
				if (result == null) result = caseODAnnotable(odSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_ENTITY_CONTAINER: {
				ODEntityContainer odEntityContainer = (ODEntityContainer)theEObject;
				T result = caseODEntityContainer(odEntityContainer);
				if (result == null) result = caseODNamedElement(odEntityContainer);
				if (result == null) result = caseODAnnotable(odEntityContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_NAMED_ELEMENT: {
				ODNamedElement odNamedElement = (ODNamedElement)theEObject;
				T result = caseODNamedElement(odNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_TYPE: {
				ODType odType = (ODType)theEObject;
				T result = caseODType(odType);
				if (result == null) result = caseODNamedElement(odType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_ANNOTABLE: {
				ODAnnotable odAnnotable = (ODAnnotable)theEObject;
				T result = caseODAnnotable(odAnnotable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_STRUCTURAL_TYPE: {
				ODStructuralType odStructuralType = (ODStructuralType)theEObject;
				T result = caseODStructuralType(odStructuralType);
				if (result == null) result = caseODType(odStructuralType);
				if (result == null) result = caseODAnnotable(odStructuralType);
				if (result == null) result = caseODNamedElement(odStructuralType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_ENTITY_TYPE: {
				ODEntityType odEntityType = (ODEntityType)theEObject;
				T result = caseODEntityType(odEntityType);
				if (result == null) result = caseODStructuralType(odEntityType);
				if (result == null) result = caseODType(odEntityType);
				if (result == null) result = caseODAnnotable(odEntityType);
				if (result == null) result = caseODNamedElement(odEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_COMPLEX_TYPE: {
				ODComplexType odComplexType = (ODComplexType)theEObject;
				T result = caseODComplexType(odComplexType);
				if (result == null) result = caseODStructuralType(odComplexType);
				if (result == null) result = caseODType(odComplexType);
				if (result == null) result = caseODAnnotable(odComplexType);
				if (result == null) result = caseODNamedElement(odComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_PRIMITIVE_TYPE: {
				ODPrimitiveType odPrimitiveType = (ODPrimitiveType)theEObject;
				T result = caseODPrimitiveType(odPrimitiveType);
				if (result == null) result = caseODType(odPrimitiveType);
				if (result == null) result = caseODNamedElement(odPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_ENUM_TYPE: {
				ODEnumType odEnumType = (ODEnumType)theEObject;
				T result = caseODEnumType(odEnumType);
				if (result == null) result = caseODPrimitiveType(odEnumType);
				if (result == null) result = caseODType(odEnumType);
				if (result == null) result = caseODNamedElement(odEnumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_PROPERTY: {
				ODProperty odProperty = (ODProperty)theEObject;
				T result = caseODProperty(odProperty);
				if (result == null) result = caseODElement(odProperty);
				if (result == null) result = caseTypedElement(odProperty);
				if (result == null) result = caseODNamedElement(odProperty);
				if (result == null) result = caseODAnnotable(odProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_NAVIGATION_PROPERTY: {
				ODNavigationProperty odNavigationProperty = (ODNavigationProperty)theEObject;
				T result = caseODNavigationProperty(odNavigationProperty);
				if (result == null) result = caseODElement(odNavigationProperty);
				if (result == null) result = caseTypedElement(odNavigationProperty);
				if (result == null) result = caseODNamedElement(odNavigationProperty);
				if (result == null) result = caseODAnnotable(odNavigationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_ELEMENT: {
				ODElement odElement = (ODElement)theEObject;
				T result = caseODElement(odElement);
				if (result == null) result = caseTypedElement(odElement);
				if (result == null) result = caseODNamedElement(odElement);
				if (result == null) result = caseODAnnotable(odElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_EXPOSED_ENTITY_TYPE: {
				ODExposedEntityType odExposedEntityType = (ODExposedEntityType)theEObject;
				T result = caseODExposedEntityType(odExposedEntityType);
				if (result == null) result = caseODNamedElement(odExposedEntityType);
				if (result == null) result = caseODAnnotable(odExposedEntityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_ENTITY_SET: {
				ODEntitySet odEntitySet = (ODEntitySet)theEObject;
				T result = caseODEntitySet(odEntitySet);
				if (result == null) result = caseODExposedEntityType(odEntitySet);
				if (result == null) result = caseODNamedElement(odEntitySet);
				if (result == null) result = caseODAnnotable(odEntitySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_SINGLETON: {
				ODSingleton odSingleton = (ODSingleton)theEObject;
				T result = caseODSingleton(odSingleton);
				if (result == null) result = caseODExposedEntityType(odSingleton);
				if (result == null) result = caseODNamedElement(odSingleton);
				if (result == null) result = caseODAnnotable(odSingleton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_NAVIGATION_PROPERTY_BINDING: {
				ODNavigationPropertyBinding odNavigationPropertyBinding = (ODNavigationPropertyBinding)theEObject;
				T result = caseODNavigationPropertyBinding(odNavigationPropertyBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_ANNOTATION: {
				ODAnnotation odAnnotation = (ODAnnotation)theEObject;
				T result = caseODAnnotation(odAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_TERM: {
				ODTerm odTerm = (ODTerm)theEObject;
				T result = caseODTerm(odTerm);
				if (result == null) result = caseODNamedElement(odTerm);
				if (result == null) result = caseODAnnotable(odTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_TYPE_DEFINITION: {
				ODTypeDefinition odTypeDefinition = (ODTypeDefinition)theEObject;
				T result = caseODTypeDefinition(odTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_MEMBER: {
				ODMember odMember = (ODMember)theEObject;
				T result = caseODMember(odMember);
				if (result == null) result = caseODNamedElement(odMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EdmPackage.OD_PROPERTY_KEY_REF: {
				ODPropertyKeyRef odPropertyKeyRef = (ODPropertyKeyRef)theEObject;
				T result = caseODPropertyKeyRef(odPropertyKeyRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODService(ODService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODSchema(ODSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Entity Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Entity Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODEntityContainer(ODEntityContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODNamedElement(ODNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODType(ODType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Annotable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Annotable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODAnnotable(ODAnnotable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Structural Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Structural Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODStructuralType(ODStructuralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODEntityType(ODEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODComplexType(ODComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODPrimitiveType(ODPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Enum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Enum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODEnumType(ODEnumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODProperty(ODProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Navigation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Navigation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODNavigationProperty(ODNavigationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODElement(ODElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Exposed Entity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Exposed Entity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODExposedEntityType(ODExposedEntityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Entity Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Entity Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODEntitySet(ODEntitySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Singleton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Singleton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODSingleton(ODSingleton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Navigation Property Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Navigation Property Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODNavigationPropertyBinding(ODNavigationPropertyBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODAnnotation(ODAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODTerm(ODTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODTypeDefinition(ODTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODMember(ODMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OD Property Key Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OD Property Key Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseODPropertyKeyRef(ODPropertyKeyRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EdmSwitch
