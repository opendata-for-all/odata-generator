package som.odata.generator.popup.actions;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.uml2.uml.resource.UMLResource;

import edm.EdmFactory;
import edm.EdmPackage;
import edm.ODService;
import eer.EerPackage;
import eer.Schema;
import som.odata.generator.er.ERToODataUtils;
import som.odata.generator.uml.UMLToODataGenerator;



public class GenerateODataFromUMLAction implements IObjectActionDelegate {

	private Shell shell;

	private IFile file;

	/**
	 * Constructor for Action1.
	 */
	public GenerateODataFromUMLAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		  EdmPackage.eINSTANCE.eClass();

        ResourceSet resourceSet = new ResourceSetImpl();
    	resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
    	resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
    			UMLResource.Factory.INSTANCE);
        
		Resource resource = resourceSet.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
        
		 ResourceSet resourceSetOData = new ResourceSetImpl();
		 resourceSetOData.getPackageRegistry().put(EdmPackage.eNS_URI, EdmPackage.eINSTANCE);
		 resourceSetOData.getResourceFactoryRegistry().getExtensionToFactoryMap().put("edm",
	    			new XMIResourceFactoryImpl());
        IContainer target = file.getProject().getFolder("src-gen");
        if (!target.getLocation().toFile().exists()) {
			target.getLocation().toFile().mkdirs();
		}
        Resource resourceOData = resourceSetOData.createResource(URI.createPlatformResourceURI(target.getFullPath().toString(), true).appendSegment(file.getName().substring(0, file.getName().lastIndexOf('.'))).appendFileExtension("edm"));
		

			if (resource.getContents().get(0) instanceof Model) {
				UMLToODataGenerator umlToODataGenerator = new UMLToODataGenerator((Model) resource.getContents().get(0));
				ODService service = umlToODataGenerator.generate();
				resourceOData.getContents().add(service);
				try {
					resourceOData.save(Collections.emptyMap());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	

	
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof IFile) {
				file = (IFile) structuredSelection.getFirstElement();
			}
		}
	}

}
