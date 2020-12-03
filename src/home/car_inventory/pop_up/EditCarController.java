package home.car_inventory.pop_up;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EditCarController {


	//Apply Button Action Handler
	public void btnApplyEditOnAction(ActionEvent event) throws IOException{}	
	
	//Cancel button, Closes Window
	public void btnCancelEditOnAction(ActionEvent event) throws IOException{
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
	}	
	
}
