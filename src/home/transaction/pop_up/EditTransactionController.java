package home.transaction.pop_up;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EditTransactionController {


	//Apply Button Action Handler
	public void btnApplyTransactionEditOnAction(ActionEvent event) throws IOException{}
	
	//Cancel button, closes Window
	public void btnCancelEditOnAction(ActionEvent event) throws IOException{
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
	}
	
	
	
	
}
