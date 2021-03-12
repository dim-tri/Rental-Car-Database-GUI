package home.car_inventory;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import util.Controller;
import util.FxmlPath;
import util.PopUpWindow;

	
public class CarInventoryController extends Controller{	
	@FXML
	private Button btnTest;
	@FXML
	private TableView carTable;
	
	//Add Car Button Action, Opens Add Car Window
	public void btnAddCarOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Adding Car", FxmlPath.addCarFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true, this.getHomeController(), this);
	}
    
	//Edit Car Button Action. Opens Edit Car Window
	public void btnEditCarOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Editing Car", FxmlPath.editCarFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true, this.getHomeController(), this);
	}
	
	//Add chosen car to selection
	public void btnSelectOnAction(ActionEvent event) throws IOException{
		System.out.println("Selected the car");
		this.getHomeController().setSelectedCar("Example Car");;
	}
	
	@Override
	public TableView GetTable() {
		System.out.println("I override the method@");
		return carTable;
		
	}
}
