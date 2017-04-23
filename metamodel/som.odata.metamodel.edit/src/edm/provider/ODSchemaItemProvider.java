/**
 */
package edm.provider;


import edm.EdmFactory;
import edm.EdmPackage;
import edm.ODSchema;

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
 * This is the item provider adapter for a {@link edm.ODSchema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ODSchemaItemProvider extends ODAnnotableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODSchemaItemProvider(AdapterFactory adapterFactory) {
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

			addNamespacePropertyDescriptor(object);
			addAliasPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ODSchema_namespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ODSchema_namespace_feature", "_UI_ODSchema_type"),
				 EdmPackage.Literals.OD_SCHEMA__NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAliasPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ODSchema_alias_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ODSchema_alias_feature", "_UI_ODSchema_type"),
				 EdmPackage.Literals.OD_SCHEMA__ALIAS,
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
			childrenFeatures.add(EdmPackage.Literals.OD_SCHEMA__ENTITY_CONTAINER);
			childrenFeatures.add(EdmPackage.Literals.OD_SCHEMA__ENTITY_TYPES);
			childrenFeatures.add(EdmPackage.Literals.OD_SCHEMA__COMPLEX_TYPES);
			childrenFeatures.add(EdmPackage.Literals.OD_SCHEMA__ENUM_TYPES);
			childrenFeatures.add(EdmPackage.Literals.OD_SCHEMA__TYPE_DEFINITIONS);
			childrenFeatures.add(EdmPackage.Literals.OD_SCHEMA__TERMS);
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
	 * This returns ODSchema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ODSchema"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ODSchema)object).getNamespace();
		return label == null || label.length() == 0 ?
			getString("_UI_ODSchema_type") :
			getString("_UI_ODSchema_type") + " " + label;
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

		switch (notification.getFeatureID(ODSchema.class)) {
			case EdmPackage.OD_SCHEMA__NAMESPACE:
			case EdmPackage.OD_SCHEMA__ALIAS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EdmPackage.OD_SCHEMA__ENTITY_CONTAINER:
			case EdmPackage.OD_SCHEMA__ENTITY_TYPES:
			case EdmPackage.OD_SCHEMA__COMPLEX_TYPES:
			case EdmPackage.OD_SCHEMA__ENUM_TYPES:
			case EdmPackage.OD_SCHEMA__TYPE_DEFINITIONS:
			case EdmPackage.OD_SCHEMA__TERMS:
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
				(EdmPackage.Literals.OD_SCHEMA__ENTITY_CONTAINER,
				 EdmFactory.eINSTANCE.createODEntityContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EdmPackage.Literals.OD_SCHEMA__ENTITY_TYPES,
				 EdmFactory.eINSTANCE.createODEntityType()));

		newChildDescriptors.add
			(createChildParameter
				(EdmPackage.Literals.OD_SCHEMA__COMPLEX_TYPES,
				 EdmFactory.eINSTANCE.createODComplexType()));

		newChildDescriptors.add
			(createChildParameter
				(EdmPackage.Literals.OD_SCHEMA__ENUM_TYPES,
				 EdmFactory.eINSTANCE.createODEnumType()));

		newChildDescriptors.add
			(createChildParameter
				(EdmPackage.Literals.OD_SCHEMA__TYPE_DEFINITIONS,
				 EdmFactory.eINSTANCE.createODTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(EdmPackage.Literals.OD_SCHEMA__TERMS,
				 EdmFactory.eINSTANCE.createODTerm()));
	}

}
