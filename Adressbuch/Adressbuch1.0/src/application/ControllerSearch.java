package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import persistence.DatabaseSearchContact;

public class ControllerSearch {

	@FXML
	private TextField searchContactTextField;

	@FXML
	private Button BtnCancelSearchContact;

	@FXML
	private TableView<?> resultContactsTable;

	@FXML
	private TableColumn<?, ?> columnResultOfSearch;

	@FXML
	private Button BtnSearchContact;

	@FXML
	void BtnCancelSearchContact(ActionEvent event) {

		OpenSearchContactWindow.stage.close();

	}

	@FXML
	void BtnSearchContactPressed(ActionEvent event) {

		String userNameInput = ControllerLogin.getUserNameInput();
		String searchInput = searchContactTextField.getText();
        
		
		
		DatabaseSearchContact.searchContactInDb(searchInput, userNameInput);
		
	}
	

	}

	
	
	
	
	
	
	
	    
    
 
	  
  
    
    	
    
    
     


	
	
	
	
	
	

	    


