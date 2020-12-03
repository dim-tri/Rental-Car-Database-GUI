package util;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public final class PopUpWindow {
	/**
	 Creates a new layout based on the FXML given and puts it in a new window with the properties given. If wait is true, background windows will freeze and wait for the new window to close.
	 @param title Window title, will not display if undecorated.
	 @param fxml Path to a BorderPane FXML
	 @param stageStyle DECORATED or UNDECORATED window
	 @param modality APPLICATION_MODALITY to force interaction with new window, NONE for normal window
	 @param wait If true, background windows will freeze and wait for the new window to close
	 
	 @return The new window
	 */
	public static Stage NewBorderPaneWindow(String title, String fxml, StageStyle stageStyle, Modality modality, Boolean wait) {		
		try {	
			Stage window = new Stage();				
			BorderPane layout;
			System.out.println("Loading " + fxml);
			layout = (BorderPane)FXMLLoader.load(PopUpWindow.class.getResource(fxml));			
			Scene scene = new Scene(layout);
			scene.getStylesheets().add(PopUpWindow.class.getResource("../app/application.css").toExternalForm());
			
			window.setTitle(title);			
			window.setScene(scene);
			window.initModality(modality);
			window.initStyle(stageStyle);
			window.setResizable(false);
			
			if(wait) {
				window.showAndWait();
				return window;
			}else {
				window.show();
				return window;
			}									
			
		} catch (IOException e) {			
			e.printStackTrace();			
			return null;
		}		
	}
	
	public static Boolean ExitConfirmation(Stage window) {
		
		//Show Exit Confirmation Window
		Alert alert = new Alert(AlertType.CONFIRMATION, "", ButtonType.YES, ButtonType.CANCEL);
		alert.setTitle("Exit Confirmation");
		alert.setHeaderText("Are you sure you want to quit?");
		alert.showAndWait();
		
		//Exit application if "YES" is selected
		if (alert.getResult() == ButtonType.YES) {
			window.close();
			return true;
		}
		return false;
				
		
	}
	
}
