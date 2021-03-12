package home.transaction.pop_up;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import util.PopUpController;
//ChoiceBox carIdBoxAdd --> TextField carIdTextFieldAdd 
//ChoiceBox clientIdBoxAdd --> TextField clientIdTextFieldAdd

public class AddTransactionController extends PopUpController{

	@FXML
	private DatePicker dateBoxAdd;
	@FXML
	private TextField carIdTextFieldAdd;
	@FXML
	private TextField clientIdTextFieldAdd;
	
	@Override
	public void InitializeController() {
		carIdTextFieldAdd.setText(this.getHomeController().getSelectedCar());
		clientIdTextFieldAdd.setText(this.getHomeController().getSelectedClient());		
	}
	
	//Add Transaction Button Action Handler
	public void btnAddTransactionAddOnAction(ActionEvent event) throws IOException{

	}	
	
	//Cancel button, Closes Window
	public void btnCancelAddOnAction(ActionEvent event) throws IOException{
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
	}
	
	
	
}
