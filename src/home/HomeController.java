package home;

import java.io.IOException;

import home.car_inventory.CarInventoryController;
import home.client_list.ClientListController;
import home.transaction.TransactionController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.FxmlPath;
import util.PopUpWindow;

public class HomeController {
	
	@FXML
	private Button btnExit;
	@FXML
	private Button btnDashboard;
	
	@FXML
	private Button btnAbout;
	@FXML
	private Button btnTransactionHistory;
	@FXML
	private Button btnCarInv;
	@FXML
	private Button btnClientList;
	
	@FXML
	private AnchorPane anchorRoot;
	@FXML
	private VBox rootVBox;
		 
	private Button selected; //What menu button is active
	
	public String selectedCarID;
	public String selectedClientID;
	

	@FXML
	//Sets the dashboard as the default selection of the side menu and loads it.
	void initialize() throws IOException{
		selected = btnDashboard;
		selected.getStyleClass().add("side-menu-button-selected");
		
		System.out.println("Loading " + FxmlPath.dashboardFXML);
		VBox vbox = FXMLLoader.load(getClass().getResource(FxmlPath.dashboardFXML));
		rootVBox.getChildren().setAll(vbox);
	}
	
	//Dashboard Side Menu Button
	public void btnDashboardOnAction(ActionEvent event) throws IOException{
		MoveMenu(btnDashboard);
		
		System.out.println("Loading " + FxmlPath.dashboardFXML);
		VBox vbox = FXMLLoader.load(getClass().getResource(FxmlPath.dashboardFXML));
		rootVBox.getChildren().setAll(vbox);		
	}
	
	//Car Inventory Side Menu Button
	public void btnCarInvOnAction(ActionEvent event) throws IOException{
		MoveMenu(btnCarInv);
		

		System.out.println("Loading " + FxmlPath.carInventoryFXML);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FxmlPath.carInventoryFXML));		
		VBox vbox = fxmlLoader.load();
		
		rootVBox.getChildren().setAll(vbox.getChildren());
		
		CarInventoryController carInventoryController = fxmlLoader.getController();
		carInventoryController.setHomeController(this);
	}
	
	//Transaction History Side Menu Button
	public void btnTransactionHistoryOnAction(ActionEvent event) throws IOException{
		MoveMenu(btnTransactionHistory);		

		System.out.println("Loading " + FxmlPath.transactionHistoryFXML);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FxmlPath.transactionHistoryFXML));		
		VBox vbox = fxmlLoader.load();
		
		rootVBox.getChildren().setAll(vbox.getChildren());
		
		TransactionController transactionController = fxmlLoader.getController();
		transactionController.setHomeController(this);
	}
	
	//Client List Side Menu Button
	public void btnClientListOnAction(ActionEvent event) throws IOException{
		MoveMenu(btnClientList);
		

		System.out.println("Loading " + FxmlPath.clientListFXML);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FxmlPath.clientListFXML));		
		VBox vbox = fxmlLoader.load();
		
		rootVBox.getChildren().setAll(vbox.getChildren());
		
		ClientListController clientListController = fxmlLoader.getController();
		clientListController.setHomeController(this);
	}
	
	//Exit Button, Asks confirmation, closes application
	public void btnExitlOnAction(ActionEvent event) {		
		Stage stage = (Stage) btnExit.getScene().getWindow();
		PopUpWindow.ExitConfirmation(stage);

	}
	
	//About Button
	public void btnAboutOnAction(ActionEvent event) {
		
		//New window, about screen
		PopUpWindow.NewBorderPaneWindow("About", FxmlPath.aboutFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, false);	
		
		System.out.println(selectedCarID);//TEST - DELETE!!!
		System.out.println(selectedClientID);//TEST - DELETE!!!
	}
	
	public void setSelectedCar(String car) {
		selectedCarID = car;
	}
	
	public void setSelectedClient(String client) {
		selectedClientID = client;
	}
	
	public String getSelectedCar() {
		return selectedCarID;
	}
	
	public String getSelectedClient() {
		return selectedClientID;
	}
	
	//Called when a side menu button is pressed. Changes style class of the old and new selected button
	private void MoveMenu(Button button){
		selected.getStyleClass().removeAll("side-menu-button-selected");
		selected = button;
		selected.getStyleClass().add("side-menu-button-selected");
	}

}
