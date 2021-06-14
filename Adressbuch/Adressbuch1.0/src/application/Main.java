package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent rootLogin = FXMLLoader.load(getClass().getResource("LoginWindow.fxml"));
			Scene sceneLogin = new Scene(rootLogin);
			primaryStage.setScene(sceneLogin);
			primaryStage.show();
            
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
