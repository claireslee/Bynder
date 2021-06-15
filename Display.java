import javafx.scene.Group; 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight; 


public class Display extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	public HBox addHBox() {
		HBox hbox = new HBox();
		hbox.setPadding(new Insets(20,14, 20, 14));
		hbox.setSpacing(10);
		return hbox;

	}

	// border pane
	// hbox (top) --> CENTER (title)
	// left column --> best match1
	// center --> best match 2
	// right column --> worst match 1

	@Override
	public void start(Stage stage) throws Exception
	{
		BorderPane border = new BorderPane();
		HBox hbox = addHBox();

		border.setTop(hbox);
		hbox.add(text);
		
		/** 

     	Text text1 = new Text(new Matches().bestMatch1());
		Text text2 = new Text(new Matches().worstMatch1());
		Text text3 = new Text(new Matches().bestMatch2());

		// Create the VBox
		VBox root = new VBox();

		// Add the Text to the VBox
		root.getChildren().add(text1);
		root.getChildren().add(text2);
		root.getChildren().add(text3);

		// Set the Size of the VBox
		root.setMinSize(900, 1200);

		*/

		// Create the Scene
		Scene scene = new Scene(border);

		// Label idk = new Label();
		// idk.setMaxWidth(Double.MAX_VALUE);
		
		Text text = new Text(); 
        
      	text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
        scene.setFill(Color.LIGHTGOLDENRODYELLOW);
		DropShadow ds = new DropShadow();
		ds.setOffsetY(3.0f);
		text.setEffect(ds);
      
		text.setX(0); 
      	text.setY(0);          
      
      	text.setText("BYNDER MATCHES"); 
		text.setTextAlignment(TextAlignment.CENTER);

		
		Group b = new Group(text);   
		root.getChildren().add(text);
		Scene s = new Scene(b, 0, 0); 

		// Set the Properties of the Stage
		stage.setX(100);
		stage.setY(200);
		stage.setMinHeight(300);
		stage.setMinWidth(400);

		// Add the scene to the Stage
		stage.setScene(scene);
		// Set the title of the Stage
		stage.setTitle("Match Results");
		// Display the Stage
		stage.show();
	}

}