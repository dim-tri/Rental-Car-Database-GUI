package home.client_list;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import util.Controller;
import util.FxmlPath;
import util.PopUpWindow;

public class ClientListController extends Controller{	
	
	//Add Client Button Action, Opens Add Client Button
	public void btnAddClientOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Adding Client", FxmlPath.addClientFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true, this.getHomeController(), this);
	}
    
	//Edit Client Button Action, Opens Edit Client Button
	public void btnEditClientOnAction(ActionEvent event) throws IOException{
		PopUpWindow.NewBorderPaneWindow("Editing Client", FxmlPath.editClientFXML, StageStyle.DECORATED, Modality.APPLICATION_MODAL, true, this.getHomeController(), this);
	}
	
	//Add current client to selection
	public void btnSelectOnAction(ActionEvent event) throws IOException{
		System.out.println("Selected the Client");
		this.getHomeController().setSelectedClient("Example Client");

	}
	
}
