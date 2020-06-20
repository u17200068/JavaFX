
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Q2_U17200068 extends Application
{
	public void start(Stage stage)
	{
		Pane pane = new Pane();
		Scene scene = new Scene(pane,300,250);
		Arc a = new Arc(150,125,80,80,0,-144);
		Arc a2 = new Arc(150,125,80,80,-144,-108);
		Arc a3 = new Arc(150,125,80,80,-252,-36);
		Arc a4 = new Arc(150,125,80,80,-288,-72);
		Text mid = new Text(80,110,"Midterm\n30%");
		Text quiz = new Text(135,60,"Quiz\n10%");
		Text proj = new Text(170,95,"Project\n20%");
		Text fin = new Text(150,160,"Final\n40%");
		mid.setFill(Color.WHITE);
		quiz.setFill(Color.WHITE);
		proj.setFill(Color.WHITE);
		fin.setFill(Color.WHITE);
		a.setType(ArcType.ROUND);
		a.setFill(Color.ORANGE);
		a.setStroke(Color.ORANGE);
		a2.setType(ArcType.ROUND);
		a2.setFill(Color.GREEN);
		a2.setStroke(Color.GREEN);
		a3.setType(ArcType.ROUND);
		a3.setFill(Color.BLUE);
		a3.setStroke(Color.BLUE);
		a4.setType(ArcType.ROUND);
		a4.setFill(Color.RED);
		a4.setStroke(Color.RED);
		pane.getChildren().add(a);
		pane.getChildren().add(a2);
		pane.getChildren().add(a3);
		pane.getChildren().add(a4);
        pane.getChildren().add(mid);    
        pane.getChildren().add(quiz);
        pane.getChildren().add(proj);
        pane.getChildren().add(fin);  
		stage.setTitle("Mark Distribution");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}

}
