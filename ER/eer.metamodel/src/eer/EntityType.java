/**
 */
package eer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.EntityType#getRelationshipLink <em>Relationship Link</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getEntityType()
 * @model abstract="true"
 * @generated
 */
public interface EntityType extends Element {
	/**
	 * Returns the value of the '<em><b>Relationship Link</b></em>' reference list.
	 * The list contents are of type {@link eer.RelationshipLink}.
	 * It is bidirectional and its opposite is '{@link eer.RelationshipLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Link</em>' reference list.
	 * @see eer.EerPackage#getEntityType_RelationshipLink()
	 * @see eer.RelationshipLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<RelationshipLink> getRelationshipLink();

} // EntityType
