package home.transaction.pop_up;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

public class AddTransactionController {

	@FXML
	private DatePicker dateBoxAdd;
	
	//Add Transaction Button Action Handler
	public void btnAddTransactionAddOnAction(ActionEvent event) throws IOException{
		//String date = dateBoxAdd.getValue().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		dateBoxAdd.setValue(LOCAL_DATE("01/01/2020"));
	}	
	
	//Cancel button, Closes Window
	public void btnCancelAddOnAction(ActionEvent event) throws IOException{
		((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
	}
	
	public static final LocalDate LOCAL_DATE (String dateString){
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    LocalDate localDate = LocalDate.parse(dateString, formatter);
	    return localDate;
	}
	
	
}
