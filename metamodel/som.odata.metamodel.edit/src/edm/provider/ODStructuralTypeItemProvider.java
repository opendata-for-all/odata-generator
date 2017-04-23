/**
 */
package edm.provider;


import edm.EdmFactory;
import edm.EdmPackage;
import edm.ODStructuralType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edm.ODStructuralType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ODStructuralTypeItemProvider extends ODTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODStructuralTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBaseTypePropertyDescriptor(object);
			addAbstractPropertyDescriptor(object);
			addOpenTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ODStructuralType_baseType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ODStructuralType_baseType_feature", "_UI_ODStructuralType_type"),
				 EdmPackage.Literals.OD_STRUCTURAL_TYPE__BASE_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ODStructuralType_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ODStructuralType_abstract_feature", "_UI_ODStructuralType_type"),
				 EdmPackage.Literals.OD_STRUCTURAL_TYPE__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Open Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpenTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ODStructuralType_openType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ODStructuralType_openType_feature", "_UI_ODStructuralType_type"),
				 EdmPackage.Literals.OD_STRUCTURAL_TYPE__OPEN_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EdmPackage.Literals.OD_ANNOTABLE__ANNOTATIONS);
			childrenFeatures.add(EdmPackage.Literals.OD_STRUCTURAL_TYPE__PROPERTIES);
			childrenFeatures.add(EdmPackage.Literals.OD_STRUCTURAL_TYPE__NAVIGATION_PROPERTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ODStructuralType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ODStructuralType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ODStructuralType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ODStructuralType_type") :
			getString("_UI_ODStructuralType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ODStructuralType.class)) {
			case EdmPackage.OD_STRUCTURAL_TYPE__ABSTRACT:
			case EdmPackage.OD_STRUCTURAL_TYPE__OPEN_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdmPackage.OD_STRUCTURAL_TYPE__ANNOTATIONS:
			case EdmPackage.OD_STRUCTURAL_TYPE__PROPERTIES:
			case EdmPackage.OD_STRUCTURAL_TYPE__NAVIGATION_PROPERTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EdmPackage.Literals.OD_ANNOTABLE__ANNOTATIONS,
				 EdmFactory.eINSTANCE.createODAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(EdmPackage.Literals.OD_STRUCTURAL_TYPE__PROPERTIES,
				 EdmFactory.eINSTANCE.createODProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EdmPackage.Literals.OD_STRUCTURAL_TYPE__NAVIGATION_PROPERTIES,
				 EdmFactory.eINSTANCE.createODNavigationProperty()));
	}

}
