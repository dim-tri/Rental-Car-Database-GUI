package home.car_inventory.pop_up;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AddCarController {

	//Add Car Button Handler
	public void btnAddCarAddOnAction(ActionEvent event) throws IOException{}
	
	//Cancel button, Closes Window
	public void btnCancelAddOnAction(ActionEvent event) throws IOException{
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
	}	
	
}
