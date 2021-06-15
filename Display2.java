import javafx.scene.Group; 
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight; 

public class Display2 extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	// PLAN:        
		// border pane
		// hbox (top) --> CENTER (title)
		// left column --> best match1
		// left center --> best match 2
		// right center --> worst match 1
		// right column --> worst match 2

	@Override
	public void start(Stage stage) throws Exception
	{
		GridPane grid = new GridPane();
        grid.setHgap(50);
        grid.setVgap(50);
        grid.setPadding(new Insets(0, 15, 0, 15));

        // BEST MATCH1 in column 1, row 2
		Text label1 = new Text("Best Match 1");
		label1.setFont(Font.font("Arial", FontWeight.MEDIUM, 20));
		grid.add(label1, 0, 2);

        Text bm1 = new Text(new Matches().bestMatch1());
        bm1.setFont(Font.font("Arial", FontWeight.MEDIUM, 15));
        grid.add(bm1, 0, 3); 


        // TITLE in column 3, row 1
        Text title = new Text(); 
      	title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50)); 
		DropShadow ds = new DropShadow();
		ds.setOffsetY(3.0f);
		title.setEffect(ds);
        title.setText("BYNDER MATCHES"); 
		// title.setTextAlignment(TextAlignment.CENTER);
        grid.add(title, 1, 1, 3, 1);    


        // BEST MATCH2 in column 2, row 2
		Text label2 = new Text("Best Match 2");
		label2.setFont(Font.font("Arial", FontWeight.MEDIUM, 20));
		grid.add(label2, 1, 2);

		Text bm2 = new Text(new Matches().bestMatch2());
        bm2.setFont(Font.font("Arial", FontWeight.MEDIUM, 15));
        grid.add(bm2, 1, 3); 


        // WORST MATCH1 in column 3, row 2
		Text label3 = new Text("Worst Match 1");
		label3.setFont(Font.font("Arial", FontWeight.MEDIUM, 20));
		grid.add(label3, 2, 2);

        Text wm1 = new Text(new Matches().worstMatch1());
        wm1.setFont(Font.font("Arial", FontWeight.MEDIUM, 15));
        grid.add(wm1, 2, 3); 


		// WORST MATCH2 in column 4, row 2
		Text label4 = new Text("Worst Match 2");
		label4.setFont(Font.font("Arial", FontWeight.MEDIUM, 20));
		grid.add(label4, 3, 2);

        Text wm2 = new Text(new Matches().worstMatch2());
        wm2.setFont(Font.font("Arial", FontWeight.MEDIUM, 15));
        grid.add(wm2, 3, 3); 
       
        
		// Create the Scene
		Scene scene = new Scene(grid);
        scene.setFill(Color.LIGHTGOLDENRODYELLOW);

		// Label idk = new Label();
		// idk.setMaxWidth(Double.MAX_VALUE);      

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