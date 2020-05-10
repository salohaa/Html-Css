package spel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Button1 extends Application{
	private Stage primary;
	private Scene scene;
	private Pane pane;
	private Button jaButton;
	
	
//launch args startar javafx applicationen genom "void start"
	public static void main(String[] args) {
		launch(args);

	}

	public void start(Stage arg0) throws Exception {
		primary = arg0;
		pane = new Pane();
		//width och height f�r scene 
		scene = new Scene(pane, 400, 300);
		
		//skapar en knapp med yes skrivet
		jaButton = new Button("yes");
		//storlek av button 
		jaButton.setPrefSize(200, 100);
		//jag l�gger knappen inuti pane
		pane.getChildren().add(jaButton);
		
		primary.setTitle("Tictactoe");
		//l�gger in scene inuti stage
		primary.setScene(scene);
		//ser till att staget visas
		primary.show();
		
		
	}

}
