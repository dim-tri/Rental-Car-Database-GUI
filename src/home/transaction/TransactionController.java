package home.transaction;

import java.io.IOException;

import home.HomeController;
import javafx.event.ActionEvent;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import util.FxmlPath;
import util.PopUpWindow;

public class TransactionController {
	
	private HomeController HomeController;
	
	//Add Transaction Button Action, Opens the Add Car Pop-Up Window
	public void btnAddTransactionOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Adding Transaction", FxmlPath.addTransactionFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true);
	} 
	
	//Edit Transaction Button Action, Opens the Edit Car Pop-Up Window
	public void btnEditTransactionOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Editing Transaction", FxmlPath.editTransactionFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true);
	}
	
	public void setHomeController(HomeController homeController){
		HomeController = homeController;
	}
	
}
