package application;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import persistence.DatabaseConnectCreateUser;

public class ControllerMain {

	@FXML
	private Button btnCreateNewContact;

	@FXML
	private Button btnSearchEditContact;

	@FXML
	private Button BtnLogout;

	@FXML
	void btnCreateNewContactPressed(ActionEvent event) {

		try {
			new OpenNewContactWindow();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	@FXML
	void btnSearchEditContactPressed(ActionEvent event) {

		try {
			new OpenSearchContactWindow();
		} catch (IOException e) {

			e.printStackTrace();
		}

	};

	@FXML
	void BtnLogoutPressed(ActionEvent event) {
//              

		try {
			DatabaseConnectCreateUser.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("ACHTUNG");
		alert.setHeaderText("");
		alert.setContentText("User ausgeloggt!");
		alert.showAndWait();

		OpenMainWindow.stage.close();
        
	}

}
