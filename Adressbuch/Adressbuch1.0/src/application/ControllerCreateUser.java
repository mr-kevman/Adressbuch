package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import persistence.DatabaseConnectCreateUser;

public class ControllerCreateUser {

	@FXML

	private TextField TextFieldNewUser;

	@FXML

	private TextField TextFieldPassword;

	@FXML

	private TextField TextFieldPassword2;

	@FXML
	private Button BtnSaveNewUser;

	@FXML
	private Button BtnCancelRegistration;

	@FXML
	void CancelRegistration(ActionEvent event) {

		OpenCreateUserWindow.stage.close();

	};

	

	@FXML
	void SaveNewUser(ActionEvent event) {

		String userName;
		String password1;
		String password2;
		
		
		userName = TextFieldNewUser.getText();
		password1 = TextFieldPassword.getText();
		password2 = TextFieldPassword2.getText();
		

		if (userName.isEmpty() || password1.isEmpty() || password2.isEmpty()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("ACHTUNG");
			alert.setHeaderText("");
			alert.setContentText("Textfelder müssen zwingend ausgefüllt werden!");
			alert.showAndWait();
		}

		else if (!password1.equals(password2)) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("ACHTUNG");
			alert.setHeaderText("");
			alert.setContentText("Die beiden Passwörter stimmen nicht überein");
			alert.showAndWait();

		}

		else {

			DatabaseConnectCreateUser.getConnection(userName, password1, password2);

			Alert alert = new Alert(AlertType.INFORMATION);

			alert.setTitle("Erfolg");
			alert.setHeaderText("");
			alert.setContentText("Neuer User wurde erfolgreich angelegt");
			alert.showAndWait();
			
		}

	}


}
	

