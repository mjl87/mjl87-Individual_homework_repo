
package application;

import databasePart1.DatabaseHelper;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * This page displays a simple welcome message for the user.
 */

public class UserHomePage {

	private final DatabaseHelper databaseHelper;

	public UserHomePage(DatabaseHelper databaseHelper2) {
		// TODO Auto-generated constructor stub
		this.databaseHelper = databaseHelper2;
	}


	public void show(Stage primaryStage, User user) {
    	VBox layout = new VBox();
	    layout.setStyle("-fx-alignment: center; -fx-padding: 20;");
	    
	    // Label to display Hello user
	    Label userLabel = new Label("Hello, " + user.getUserName() + "!");
	    Label infoLabel = new Label("Info: " + "\nUser Name: " + user.getUserName() + "\n Password: " + user.getPassword());
	    Label rolesLabel = new Label("Roles: " + databaseHelper.getUserRole(user.getUserName()));
	    userLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

	    layout.getChildren().addAll(userLabel,infoLabel, rolesLabel);
	    Scene userScene = new Scene(layout, 800, 400);

	    // Set the scene to primary stage
	    primaryStage.setScene(userScene);
	    primaryStage.setTitle("User Page");
    	
    }
}
