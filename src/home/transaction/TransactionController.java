package home.transaction;

import java.io.IOException;
import util.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import util.FxmlPath;
import util.PopUpWindow;

public class TransactionController extends Controller{
	@FXML
	private Button btnAddTransaction;
	
	@Override
	public void InitializeController() {
		String car = this.getHomeController().getSelectedCar();
		String client = this.getHomeController().getSelectedClient();
		
		if(car.equals("none") || client.equals("none") ) btnAddTransaction.setDisable(true);
		else btnAddTransaction.setDisable(false);
	}
	//Add Transaction Button Action, Opens the Add Car Pop-Up Window
	public void btnAddTransactionOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Adding Transaction", FxmlPath.addTransactionFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true, this.getHomeController(), this);
	} 
	
	//Edit Transaction Button Action, Opens the Edit Car Pop-Up Window
	public void btnEditTransactionOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Editing Transaction", FxmlPath.editTransactionFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true, this.getHomeController(), this);
	}
		
}
