package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpenNewContactWindow extends Stage {

	static Stage stage;

	public OpenNewContactWindow() throws IOException {

		stage = this;
		Parent root = FXMLLoader.load(getClass().getResource("CreateContact.fxml"));

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();

	}

}
