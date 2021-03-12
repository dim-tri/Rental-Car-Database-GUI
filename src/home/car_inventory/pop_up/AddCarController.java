package home.car_inventory.pop_up;

import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.PopUpController;

public class AddCarController extends PopUpController{
	
	@FXML
	private TextField idTextFieldAdd;
	
	int random_id;
	
	//Add Car Button Handler
	public void btnAddCarAddOnAction(ActionEvent event) throws IOException{
		System.out.println("My Home is: " + this.getHomeController());
		System.out.println("My Parent is: " + this.getParent());
	}
	
	//Cancel button, Closes Window
	public void btnCancelAddOnAction(ActionEvent event) throws IOException{
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
	}	
	
	//Generate Random ID
	public void btnRandomOnAction(ActionEvent event) throws IOException{
		Random rand = new Random(); 
		random_id = rand.nextInt(10000); 
		
		idTextFieldAdd.setText( String.valueOf(random_id));		
	}	
}
