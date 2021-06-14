package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import persistence.DatabaseConnectCreateContact;

public class ControllerCreateContact {

	@FXML
	private TextField textFieldFirstName;

	@FXML
	private TextField textFieldSecondName;

	@FXML
	private TextField textFieldStreetName;

	@FXML
	private TextField textFieldHousenumber;

	@FXML
	private Button BtnAddFoto;

	@FXML
	private Button BtnSave;
	
	@FXML
	private TextField textFieldPostCode;

	@FXML
	private TextField textFieldTelNumber;

	@FXML
	private TextField textFieldEmail;

	@FXML
	private TextField textFieldTitle;

	@FXML
	private TextField textFieldID;

	@FXML
	private TextField textFieldCity;

	@FXML
	private TextField textFieldCountry;

	@FXML
	private Button BtnCancel;


	@FXML
	void BtnCancelpressed(ActionEvent event) {

	OpenNewContactWindow.stage.close();
    
	}

	@FXML
	void BtnSavePressed(ActionEvent event) {

		String idNumber;
		String title;
		String firstName;
		String secondName;
		String streetName;
		String houseNumber;
		String postCode;
		String nameOfCity;
		String country;
		String phoneNumber;
		String emailAdress;
//hier noch username einfügen für die kontaktsuche Feld in Datenbank schon erstellt
		
		
		
		idNumber = textFieldID.getText();
		title = textFieldTitle.getText();
		firstName = textFieldFirstName.getText();
		secondName = textFieldSecondName.getText();
		streetName = textFieldStreetName.getText();
		houseNumber = textFieldHousenumber.getText();
		postCode = textFieldPostCode.getText();
		nameOfCity = textFieldCity.getText();
		country = textFieldCountry.getText();
		phoneNumber = textFieldTelNumber.getText();
		emailAdress = textFieldEmail.getText();

		DatabaseConnectCreateContact.getConnectionContact(idNumber, title, firstName, secondName, streetName, houseNumber,
				postCode, nameOfCity, country, phoneNumber, emailAdress);
		
		
		
		
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Erfolg!");
		alert.setHeaderText("");
		alert.setContentText("Kontakt wurde gespeichert!");
		alert.showAndWait();
		
		OpenNewContactWindow.stage.close();
        
	}
}
