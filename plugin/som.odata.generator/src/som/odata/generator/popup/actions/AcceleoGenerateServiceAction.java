package som.odata.generator.popup.actions;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

import som.odata.generator.Activator;
import som.odata.generator.common.GenerateService;

import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;


public class AcceleoGenerateServiceAction extends ActionDelegate implements IActionDelegate {
	
	/**
	 * Selected model files.
	 */
	protected List<IFile> files;

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			files = ((IStructuredSelection) selection).toList();
		}
	}

	/**{@inheritDoc}
	 *
	 * @see org.eclipse.ui.actions.ActionDelegate#run(org.eclipse.jface.action.IAction)
	 * @generated
	 */
	public void run(IAction action) {
		if (files != null) {
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					try {
						Iterator<IFile> filesIt = files.iterator();
						while (filesIt.hasNext()) {
							IFile model = (IFile)filesIt.next();
							URI modelURI = URI.createPlatformResourceURI(model.getFullPath().toString(), true);
							try {
								IContainer target = createTarget(model);
								GenerateService generator = new GenerateService(modelURI, target, getArguments());
								generator.doGenerate(monitor);
							} catch (IOException e) {
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
								Activator.getDefault().getLog().log(status);
							} catch (URISyntaxException e) {
								IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
								Activator.getDefault().getLog().log(status);
							} finally {
								model.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
							}
						}
					} catch (CoreException e) {
						IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
						Activator.getDefault().getLog().log(status);
					}
				}
			};
			try {
				PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
			} catch (InvocationTargetException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			} catch (InterruptedException e) {
				IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
				Activator.getDefault().getLog().log(status);
			}
		}
	}

	/**
	 * Computes the arguments of the generator.
	 * 
	 * @return the arguments
	 * @generated
	 */
	protected List<? extends Object> getArguments() {
		return new ArrayList<String>();
	}
	
	private IContainer createTarget(IFile model) throws CoreException, IOException, URISyntaxException {

		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("odata.demo");

		
		if (!project.exists()) {
			project.create(null);
			project.open(null);}
		
			IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] { "org.eclipse.jem.workbench.JavaEMFNature",
					"org.eclipse.wst.common.modulecore.ModuleCoreNature",
					"org.eclipse.jdt.core.javanature",
					"org.eclipse.m2e.core.maven2Nature",
					"org.eclipse.wst.common.project.facet.core.nature"});
			ICommand[] buildSpec = description.getBuildSpec();
			List<ICommand> list = new ArrayList<>( Arrays.asList( buildSpec ) );
			ICommand command = description.newCommand();
			command.setBuilderName( "org.eclipse.jdt.core.javabuilder" );
			list.add(command);
			command.setBuilderName( "org.eclipse.wst.common.project.facet.core.builder" );
			list.add(command);
			command.setBuilderName( "org.eclipse.m2e.core.maven2Builder" );
			list.add(command);
			command.setBuilderName( "org.eclipse.wst.validation.validationbuilder" );
			list.add(command);
			description.setBuildSpec( list.toArray( new ICommand[ list.size() ] ) );
			
			project.setDescription( description, new NullProgressMonitor() );
			IFolder srcFolder = project.getFolder("src");
			if(!srcFolder.getLocation().toFile().exists())
				srcFolder.getLocation().toFile().mkdir();
			if(!project.getFolder("src/main").getLocation().toFile().exists())
				project.getFolder("src/main").getLocation().toFile().mkdir();
			if(!project.getFolder("src/main/java").getLocation().toFile().exists())
				project.getFolder("src/main/java").getLocation().toFile().mkdir();
			if(!project.getFolder("src/main/webapp").getLocation().toFile().exists())
				project.getFolder("src/main/webapp").getLocation().toFile().mkdir();
			if(!project.getFolder("src/main/webapp/WEB-INF").getLocation().toFile().exists())
				project.getFolder("src/main/webapp/WEB-INF").getLocation().toFile().mkdir();
			if(!project.getFolder("src/main/java/odata/demo/service").getLocation().toFile().exists())
				project.getFolder("src/main/java/odata/demo/service").getLocation().toFile().mkdir();
			if(!project.getFolder("src/main/java/odata/demo/web").getLocation().toFile().exists())
				project.getFolder("src/main/java/odata/demo/web").getLocation().toFile().mkdir();
			
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		return project;
	}

}