package home.car_inventory;

import java.io.IOException;

import home.HomeController;
import javafx.event.ActionEvent;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import util.FxmlPath;
import util.PopUpWindow;

	
public class CarInventoryController {
	private HomeController HomeController = null;
	
	//Add Car Button Action, Opens Add Car Window
	public void btnAddCarOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Adding Car", FxmlPath.addCarFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true);
	}
    
	//Edit Car Button Action. Opens Edit Car Window
	public void btnEditCarOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Editing Car", FxmlPath.editCarFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true);
	}
	
	public void btnTestOnAction(ActionEvent event) throws IOException{
		System.out.println("Selected the car");
		HomeController.setSelectedCar("Example Car");
	}
	
	public void setHomeController(HomeController homeController){
		HomeController = homeController;
	}
}
