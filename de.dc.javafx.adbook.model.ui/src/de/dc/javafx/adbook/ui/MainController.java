package de.dc.javafx.adbook.ui;

import java.util.EventObject;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;

import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTreeCellFactory;
import at.bestsolution.efxclipse.runtime.emf.edit.ui.AdapterFactoryTreeItem;
import de.dc.javafx.adbook.feature.CommandListCellFactory;
import de.dc.javafx.adbook.model.AdbookManager;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import javafx.util.StringConverter;

public class MainController implements CommandStackListener, ChangeListener<Object> {

	@FXML
	private TreeView<Object> treeView;

	@FXML
	private TableColumn<EAttribute, EAttribute> propertyColumn;

	@FXML
	private TableColumn<EAttribute, EAttribute> valueColumn;

	@FXML
	private ComboBox<EAttribute> eattributeComboBox;

	@FXML
	private TextField valueText;

	@FXML
	private TableView<EAttribute> propertyTableView;

	@FXML
	private ListView<Command> historyListView;

	@FXML
	private Button updateButton, undoButton, redoButton;

	private AdbookManager manager;
	private EObject currentEObject;
	private ObservableList<EAttribute> eAttributeList = FXCollections.observableArrayList();
	private ObservableList<EAttribute> properties = FXCollections.observableArrayList();

	public void init(AdbookManager manager) {
		this.manager = manager;
		manager.getCommandStack().addCommandStackListener(this);
		historyListView.setCellFactory(
				new CommandListCellFactory(manager.getAdapterFactory(), manager.getEditingDomain().getCommandStack()));
		historyListView.setEditable(false);

		treeView.getSelectionModel().selectedItemProperty().addListener(this);

		TreeItem<Object> rootItem = new AdapterFactoryTreeItem(manager.getAdbook(), treeView,
				manager.getAdapterFactory());

		treeView.setRoot(rootItem);

		// connect to EMF.edit providers
		AdapterFactoryTreeCellFactory treeCellFactory = new AdapterFactoryTreeCellFactory(manager.getAdapterFactory());
		treeView.setCellFactory(treeCellFactory);
		rootItem.setExpanded(true);
		treeView.setEditable(false);

		/*
		 * Properties
		 */
		propertyColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EAttribute,EAttribute>, ObservableValue<EAttribute>>() {
			@Override
			public ObservableValue call(CellDataFeatures<EAttribute, EAttribute> param) {
				return new SimpleStringProperty(param.getValue().getName());
			}
		});
		valueColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<EAttribute,EAttribute>, ObservableValue<EAttribute>>() {
			@Override
			public ObservableValue call(CellDataFeatures<EAttribute, EAttribute> param) {
				TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
				if (selectedItem != null) {
					Object itemValue = selectedItem.getValue();
					if (itemValue instanceof EObject) {
						EObject element = (EObject) itemValue;
						return new SimpleStringProperty(element.eGet(param.getValue())+"");
					}
				}
				return new SimpleStringProperty("");
			}
		});
		propertyTableView.setItems(properties);
		treeView.getSelectionModel().selectedItemProperty()
				.addListener((ChangeListener<Object>) (observable, oldValue, newValue) -> updateProperties());

		// Displays EAttributes in a readable way
		StringConverter<EAttribute> stringConverter = new StringConverter<EAttribute>() {

			@Override
			public String toString(EAttribute attribute) {
				return attribute.getName();
			}

			@Override
			public EAttribute fromString(String attributeName) {
				return (EAttribute) currentEObject.eClass().getEStructuralFeature(attributeName);
			}
		};

		eAttributeList = FXCollections.observableArrayList();

		// WORKAROUND bad combo refresh when there is nothing at startup
		EAttribute temp = EcoreFactory.eINSTANCE.createEAttribute();
		temp.setName("-------------------------------------------");
		eAttributeList.add(temp);
		// END WORKAROUND

		eattributeComboBox.setItems(eAttributeList);
		eattributeComboBox.setConverter(stringConverter);

		setDisable(true);
	}

	@FXML
	void onUpdateButtonClicked(ActionEvent event) {
		EAttribute attribute = eattributeComboBox.getValue();
		if (attribute != null) {
			String valueAsString = valueText.getText();
			Object value = EcoreUtil.createFromString(attribute.getEAttributeType(), valueAsString);
			manager.getCommandStack()
					.execute(new SetCommand(manager.getEditingDomain(), currentEObject, attribute, value));
		}
	}

	@FXML
	void onUndoButtonClicked(ActionEvent event) {
		manager.getEditingDomain().getCommandStack().undo();
	}

	@FXML
	void onRedoButtonClicked(ActionEvent event) {
		manager.getEditingDomain().getCommandStack().redo();
	}

	@Override
	public void commandStackChanged(EventObject event) {
		refreshButtons();
		historyListView.getItems().clear();
		historyListView.getItems().addAll((manager.getCommandStack().getCommandList()));
	}

	@Override
	public void changed(ObservableValue<? extends Object> observable, Object oldValue, Object newValue) {
		int setIndex = eattributeComboBox.getSelectionModel().getSelectedIndex();
		if (newValue instanceof TreeItem<?>) {
			Object value = ((TreeItem<?>) newValue).getValue();
			if (value instanceof EObject) {
				currentEObject = (EObject) value;
				eAttributeList.clear();
				EList<EAttribute> eAllAttributes = currentEObject.eClass().getEAllAttributes();
				eAttributeList.addAll(eAllAttributes);
				if (!eAllAttributes.isEmpty()) {
					setDisable(false);
					eattributeComboBox.getSelectionModel().select(setIndex);
				}
				return;
			}
		}
		currentEObject = null;
		setDisable(true);
	}

	private void refreshButtons() {
		undoButton.setDisable(!manager.getCommandStack().canUndo());
		redoButton.setDisable(!manager.getCommandStack().canRedo());
	}

	private void setDisable(boolean value) {
		eattributeComboBox.setDisable(value);
		valueText.setDisable(value);
		updateButton.setDisable(value);
	}

	private void updateProperties() {
		properties.clear();
		TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
		if (selectedItem != null) {
			Object itemValue = selectedItem.getValue();
			if (itemValue instanceof EObject) {
				EObject element = (EObject) itemValue;
				for (EAttribute attr : element.eClass().getEAllAttributes()) {
					properties.add(attr);
				}
				return;
			}
		}
	}

}
