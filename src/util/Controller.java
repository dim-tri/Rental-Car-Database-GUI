package util;
import home.HomeController;
import javafx.scene.control.TableView;

public class Controller {
	private HomeController HomeController;
	

	public void setHomeController(HomeController homeController){
		HomeController = homeController;
	}
	public HomeController getHomeController() {
		return HomeController;		
	}
	public void InitializeController() {
		
	}
	
	public TableView GetTable() {
		System.out.println("I DONT! override the method@");
		return null;
		
	}
}
