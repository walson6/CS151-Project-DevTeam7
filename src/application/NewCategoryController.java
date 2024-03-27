package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Controller class for the NewCategory.fxml file.
 * This class handles the logic and functionality of the UI components defined in the FXML file.
 */
public class NewCategoryController {
	
	@FXML TextField categoryNameLabel; // Text field for entering category name
	@FXML Label categoryDisplayLabel; // Label for displaying category information
	
	/**
     * Initializes the controller class. 
     * This method is automatically called after the FXML file has been loaded.
     */
	public void initialize() {
		// Set initial text for category display label
		categoryDisplayLabel.setText("No category defined yet."); 
    }
	
	/**
     * Handles the action event when the "Add Category" button is clicked.
     * Reads the text entered in the categoryNameLabel text field and updates the categoryDisplayLabel accordingly.
     * If the categoryNameLabel is empty, displays an error message.
     */
	public void addCategory() {
		String categoryName = categoryNameLabel.getText(); // Get the text entered in the categoryNameLabel
		if (categoryName.isEmpty()) {
			// Display error message if category name is empty
			categoryDisplayLabel.setText("Error. Must define category name!");
		}
		else {
			// Display the new category name
			categoryDisplayLabel.setText("New category defined: " + categoryName);
		}
		
	}
	
}
