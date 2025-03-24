
package application;

import databasePart1.DatabaseHelper;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * AdminPage class represents the user interface for the admin user.
 * This page displays a simple welcome message for the admin.
 */

public class AdminHomePage {
	private final DatabaseHelper databaseHelper;
	public AdminHomePage(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }
	/**
     * Displays the admin page in the provided primary stage.
     * @param primaryStage The primary stage where the scene will be displayed.
     */
    public void show(Stage primaryStage) {
    	VBox layout = new VBox(5);
    	
	    layout.setStyle("-fx-alignment: center; -fx-padding: 20;");
	    
	    // label to display the welcome message for the admin
	    Label adminLabel = new Label("Hello, Admin!");
		Label userandroles = new Label("Users and their roles: \n" + databaseHelper.userAndRoles());
	    
		//delete user part
		TextField texty = new TextField("Enter username");
		texty.setMaxWidth(250);
	    Button deletebutton = new Button("Delete User");
	    
	    
	    deletebutton.setOnAction(a -> {
	    	String userName = texty.getText();
	    	
	    	//if exists delete user if not error
	    	if(databaseHelper.doesUserExist(userName)) {
	    		adminLabel.setText("User Deleted");
	    	}
	    	else {
	    		adminLabel.setText("User not found");
	    	}
	    	
	    });
	    
	    adminLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

	    layout.getChildren().addAll(adminLabel,userandroles, texty, deletebutton);
	    Scene adminScene = new Scene(layout, 800, 400);

	    // Set the scene to primary stage
	    primaryStage.setScene(adminScene);
	    primaryStage.setTitle("Admin Page");
    }
}
