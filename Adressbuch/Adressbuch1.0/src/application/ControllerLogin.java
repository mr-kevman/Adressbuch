package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import persistence.DatabaseVerifyLogin;

public class ControllerLogin {

	@FXML TextField TextFieldUserName;

	@FXML
	private Button LoginBTN;

	@FXML
	private PasswordField TextFieldPassword;

	@FXML
	private Label LoginStatusMessage;

	@FXML
	private Button BtnCreateNewUser;

	
	private static String userNameInput;
	
	
	@FXML
	void LoginBTNPressed(ActionEvent event) {

		String userNameInput = TextFieldUserName.getText();
		ControllerLogin.userNameInput= userNameInput;
		String userPasswordInput = TextFieldPassword.getText();

		if (DatabaseVerifyLogin.verifyLogin(userNameInput, userPasswordInput)) {

			try {
				new OpenMainWindow();
				TextFieldUserName.clear();
				TextFieldPassword.clear();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("ACHTUNG");
			alert.setHeaderText("");
			alert.setContentText("Username oder Passwort falsch");
			alert.showAndWait();

		}

	}

	@FXML
	void BtnCreateNewUser(ActionEvent event) throws IOException {

		try {
			new OpenCreateUserWindow();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static String getUserNameInput() {
		return userNameInput;
	}

	
	

	
	};


		  
	    
	
	


