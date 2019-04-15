package de.dc.javafx.adbook;

import de.dc.javafx.adbook.model.AdbookManager;
import de.dc.javafx.adbook.model.AdbookManagerImpl;
import de.dc.javafx.adbook.ui.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ContactApplication extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Model initialization
		AdbookManager manager = new AdbookManagerImpl();

		// The command form
		FXMLLoader fxmlLoader = new FXMLLoader();
		BorderPane form = (BorderPane) fxmlLoader.load(getClass().getResource(
				"ui/Main.fxml").openStream());
		MainController controller = (MainController) fxmlLoader.getController();
		controller.init(manager);

		Scene scene = new Scene(form);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}