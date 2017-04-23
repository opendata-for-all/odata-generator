/**
 */
package eer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.Entity#isIsWeak <em>Is Weak</em>}</li>
 *   <li>{@link eer.Entity#getDirectInheritanceLinkTarget <em>Direct Inheritance Link Target</em>}</li>
 *   <li>{@link eer.Entity#getDirectInheritanceLinkSource <em>Direct Inheritance Link Source</em>}</li>
 *   <li>{@link eer.Entity#getInheritanceSL <em>Inheritance SL</em>}</li>
 *   <li>{@link eer.Entity#getInheritanceGL <em>Inheritance GL</em>}</li>
 *   <li>{@link eer.Entity#getCategorySL <em>Category SL</em>}</li>
 *   <li>{@link eer.Entity#getCategoryGL <em>Category GL</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getEntity()
 * @model annotation="gmf.node figure='rectangle' size='60,40'"
 * @generated
 */
public interface Entity extends EntityType {
	/**
	 * Returns the value of the '<em><b>Is Weak</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Weak</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Weak</em>' attribute.
	 * @see #setIsWeak(boolean)
	 * @see eer.EerPackage#getEntity_IsWeak()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsWeak();

	/**
	 * Sets the value of the '{@link eer.Entity#isIsWeak <em>Is Weak</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Weak</em>' attribute.
	 * @see #isIsWeak()
	 * @generated
	 */
	void setIsWeak(boolean value);

	/**
	 * Returns the value of the '<em><b>Direct Inheritance Link Target</b></em>' reference list.
	 * The list contents are of type {@link eer.DirectInheritanceLink}.
	 * It is bidirectional and its opposite is '{@link eer.DirectInheritanceLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Inheritance Link Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Inheritance Link Target</em>' reference list.
	 * @see eer.EerPackage#getEntity_DirectInheritanceLinkTarget()
	 * @see eer.DirectInheritanceLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<DirectInheritanceLink> getDirectInheritanceLinkTarget();

	/**
	 * Returns the value of the '<em><b>Direct Inheritance Link Source</b></em>' reference list.
	 * The list contents are of type {@link eer.DirectInheritanceLink}.
	 * It is bidirectional and its opposite is '{@link eer.DirectInheritanceLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Inheritance Link Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Inheritance Link Source</em>' reference list.
	 * @see eer.EerPackage#getEntity_DirectInheritanceLinkSource()
	 * @see eer.DirectInheritanceLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<DirectInheritanceLink> getDirectInheritanceLinkSource();

	/**
	 * Returns the value of the '<em><b>Inheritance SL</b></em>' reference list.
	 * The list contents are of type {@link eer.InheritanceSL}.
	 * It is bidirectional and its opposite is '{@link eer.InheritanceSL#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance SL</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance SL</em>' reference list.
	 * @see eer.EerPackage#getEntity_InheritanceSL()
	 * @see eer.InheritanceSL#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<InheritanceSL> getInheritanceSL();

	/**
	 * Returns the value of the '<em><b>Inheritance GL</b></em>' reference list.
	 * The list contents are of type {@link eer.InheritanceGL}.
	 * It is bidirectional and its opposite is '{@link eer.InheritanceGL#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inheritance GL</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inheritance GL</em>' reference list.
	 * @see eer.EerPackage#getEntity_InheritanceGL()
	 * @see eer.InheritanceGL#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<InheritanceGL> getInheritanceGL();

	/**
	 * Returns the value of the '<em><b>Category SL</b></em>' reference list.
	 * The list contents are of type {@link eer.CategorySL}.
	 * It is bidirectional and its opposite is '{@link eer.CategorySL#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category SL</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category SL</em>' reference list.
	 * @see eer.EerPackage#getEntity_CategorySL()
	 * @see eer.CategorySL#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<CategorySL> getCategorySL();

	/**
	 * Returns the value of the '<em><b>Category GL</b></em>' reference list.
	 * The list contents are of type {@link eer.CategoryGL}.
	 * It is bidirectional and its opposite is '{@link eer.CategoryGL#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category GL</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category GL</em>' reference list.
	 * @see eer.EerPackage#getEntity_CategoryGL()
	 * @see eer.CategoryGL#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<CategoryGL> getCategoryGL();

} // Entity
