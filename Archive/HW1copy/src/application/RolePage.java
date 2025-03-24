package application;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class RolePage {
	public void show( Stage primaryStage, User user) {
		VBox layout = new VBox(5);
		
		Label adminlabely;
		CheckBox adminCheckBoxy;
		
		Label studlabely;
		CheckBox studCheckBoxy;
		
		Label revlabely;
		CheckBox revCheckBoxy;
		
		Label instlabely;
		CheckBox instCheckBoxy;
		
		Label stafflabely;
		CheckBox staffCheckBoxy;
		
		
		Scene welcomeScene = new Scene(layout, 800, 400);
		primaryStage.setScene(welcomeScene);
	    primaryStage.setTitle("Role Page");
		
	}
}