package de.dc.javafx.adbook.model;

import de.dc.javafx.adbook.command.CommandStackImpl;
import de.dc.javafx.adbook.model.provider.ModelItemProviderAdapterFactory;

import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public class AdbookManagerImpl implements AdbookManager {

	private Adbook adbook;

	private EditingDomain editingDomain;

	private ComposedAdapterFactory adapterFactory;

	private ChangeRecorder changeRecorder;
	
	private CommandStackImpl commandStack;
	
	public AdbookManagerImpl() {
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory
				.addAdapterFactory(new ModelItemProviderAdapterFactory());
		commandStack = new CommandStackImpl();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack);
		changeRecorder = new ChangeRecorder();
		init();
	}
	
	private void init() {
		adbook = ModelFactory.eINSTANCE.createAdbook();

		Contact baseContact=ModelFactory.eINSTANCE.createContact();
		adbook.getContacts().add(baseContact);
		adbook.getContacts().add(ModelFactory.eINSTANCE.createContact());
		adbook.getContacts().add(ModelFactory.eINSTANCE.createContact());
		adbook.getContacts().add(ModelFactory.eINSTANCE.createContact());
		adbook.getContacts().add(ModelFactory.eINSTANCE.createContact());
		adbook.getContacts().add(ModelFactory.eINSTANCE.createContact());
		adbook.getContacts().add(ModelFactory.eINSTANCE.createContact());
		
		Group baseGroup = ModelFactory.eINSTANCE.createGroup();
		baseGroup.getContacts().add(baseContact);
		adbook.getGroups().add(baseGroup);
		adbook.getGroups().add(ModelFactory.eINSTANCE.createGroup());
		adbook.getGroups().add(ModelFactory.eINSTANCE.createGroup());
		adbook.getGroups().add(ModelFactory.eINSTANCE.createGroup());
		adbook.getGroups().add(ModelFactory.eINSTANCE.createGroup());
		adbook.getGroups().add(ModelFactory.eINSTANCE.createGroup());
		adbook.getGroups().add(ModelFactory.eINSTANCE.createGroup());
	}

	@Override
	public Adbook getAdbook() {
		return adbook;
	}

	@Override
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	@Override
	public ComposedAdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	@Override
	public ChangeRecorder getChangeRecorder() {
		return changeRecorder;
	}

	@Override
	public CommandStackImpl getCommandStack() {
		return commandStack;
	}

}
