package de.dc.javafx.adbook.model;

import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import de.dc.javafx.adbook.command.CommandStackImpl;

public interface AdbookManager {

	Adbook getAdbook();

	EditingDomain getEditingDomain();

	ComposedAdapterFactory getAdapterFactory();

	ChangeRecorder getChangeRecorder();
	
	CommandStackImpl getCommandStack();
}
