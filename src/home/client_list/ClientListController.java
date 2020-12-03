package home.client_list;

import java.io.IOException;

import home.HomeController;
import javafx.event.ActionEvent;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import util.FxmlPath;
import util.PopUpWindow;

public class ClientListController {
	
	private HomeController HomeController = null;
	
	//Add Client Button Action, Opens Add Client Button
	public void btnAddClientOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Adding Client", FxmlPath.addClientFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true);
	}
    
	//Edit Client Button Action, Opens Edit Client Button
	public void btnEditClientOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Editing Client", FxmlPath.editClientFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true);
	}
	
	public void btnTestOnAction(ActionEvent event) throws IOException{
		System.out.println("Selected the Client");
		HomeController.setSelectedClient("Example Client");
	}
	
	public void setHomeController(HomeController homeController){
		HomeController = homeController;
	}
}
