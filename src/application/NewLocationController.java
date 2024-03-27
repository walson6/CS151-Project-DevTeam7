package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller class for the NewLocation.fxml file.
 * This class handles the logic and functionality of the UI components defined in the FXML file.
 */
public class NewLocationController {
	
	@FXML TextField locationNameLabel; // Text field for entering location category name
	@FXML Label locationDisplayLabel; // Label for displaying location category information
	
	/**
     * Initializes the controller class. 
     * This method is automatically called after the FXML file has been loaded.
     */
	public void initialize() {
		// Set initial text for location category display label
		locationDisplayLabel.setText("No location category defined yet."); 
    }
	
	/**
     * Handles the action event when the "Add Location Category" button is clicked.
     * Reads the text entered in the locationNameLabel text field and updates the locationDisplayLabel accordingly.
     * If the locationNameLabel is empty, displays an error message.
     */
	public void addLocation() {
		String locationCategoryName = locationNameLabel.getText(); // Get the text entered in the locationNameLabel
		if (locationCategoryName.isEmpty()) {
			// Display error message if location category name is empty
			locationDisplayLabel.setText("Error. Must define location category name!");
		}
		else {
			// Display the new location category name
			locationDisplayLabel.setText("New location category defined: " + locationCategoryName);
		}
		
	}
	
}
