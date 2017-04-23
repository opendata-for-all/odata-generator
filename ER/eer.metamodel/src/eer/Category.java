/**
 */
package eer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eer.Category#getLabel <em>Label</em>}</li>
 *   <li>{@link eer.Category#getCategorySL <em>Category SL</em>}</li>
 *   <li>{@link eer.Category#getCategoryGL <em>Category GL</em>}</li>
 * </ul>
 *
 * @see eer.EerPackage#getCategory()
 * @model annotation="gmf.node label='label' label.readOnly='true' figure='ellipse' resizable='false' size='30,30'"
 * @generated
 */
public interface Category extends Node {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>"u"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see eer.EerPackage#getCategory_Label()
	 * @model default="u"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link eer.Category#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Category SL</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eer.CategorySL#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category SL</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category SL</em>' reference.
	 * @see #setCategorySL(CategorySL)
	 * @see eer.EerPackage#getCategory_CategorySL()
	 * @see eer.CategorySL#getTarget
	 * @model opposite="target" required="true"
	 * @generated
	 */
	CategorySL getCategorySL();

	/**
	 * Sets the value of the '{@link eer.Category#getCategorySL <em>Category SL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category SL</em>' reference.
	 * @see #getCategorySL()
	 * @generated
	 */
	void setCategorySL(CategorySL value);

	/**
	 * Returns the value of the '<em><b>Category GL</b></em>' reference list.
	 * The list contents are of type {@link eer.CategoryGL}.
	 * It is bidirectional and its opposite is '{@link eer.CategoryGL#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category GL</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category GL</em>' reference list.
	 * @see eer.EerPackage#getCategory_CategoryGL()
	 * @see eer.CategoryGL#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<CategoryGL> getCategoryGL();

} // Category
