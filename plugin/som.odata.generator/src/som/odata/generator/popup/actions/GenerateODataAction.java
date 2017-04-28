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

import edm.EdmFactory;
import edm.EdmPackage;
import edm.ODService;
import eer.EerPackage;
import eer.Schema;
import som.odata.generator.er.ERToODataUtils;



public class GenerateODataAction implements IObjectActionDelegate {

	private Shell shell;

	private IFile file;

	/**
	 * Constructor for Action1.
	 */
	public GenerateODataAction() {
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
		 // Initialize the model
        EerPackage.eINSTANCE.eClass();
        EdmPackage.eINSTANCE.eClass();

        EdmFactory factory = EdmFactory.eINSTANCE;
        

        Resource.Factory.Registry regER = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> mER = regER.getExtensionToFactoryMap();
        mER.put("eer", new XMIResourceFactoryImpl());
        
        ResourceSet resourceSetER = new ResourceSetImpl();
		Resource resource = resourceSetER.getResource(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
        
        Resource.Factory.Registry resOData = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> mOData = resOData.getExtensionToFactoryMap();
        mOData.put("edm", new XMIResourceFactoryImpl());
        IContainer target = file.getProject().getFolder("src-gen");
        if (!target.getLocation().toFile().exists()) {
			target.getLocation().toFile().mkdirs();
		}
        ResourceSet resourceSetOData = new ResourceSetImpl();
        Resource resourceOData = resourceSetOData.createResource(URI.createPlatformResourceURI(target.getFullPath().toString(), true).appendSegment(file.getName().substring(0, file.getName().lastIndexOf('.'))).appendFileExtension("edm"));
		
		Schema schema;
		ODService service = factory.createODService();
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Schema) {
				schema = (Schema) eObject;
				ERToODataUtils.generateODataFromER(service,schema,factory);
			}
		}

		
		try {
			resourceOData.getContents().add(service);
			resourceOData.save(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
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
