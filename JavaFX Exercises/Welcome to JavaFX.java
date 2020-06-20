
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Q3_U17200068 extends Application 
{
	public void start(Stage PrimaryStage)
	{
		double w = 350, h = 300, centerx=w/2 ,centery=h/2,x=0, y=0, r=100, a=(Math.PI*-2)/18;
		double degrees = 90;
	    double red, green, blue;
		String text = "WELCOME TO JAVAFX ";
		Font f1 = new Font("Times New Roman",35);
		Pane pane = new Pane();
		f1 = Font.font("Times New Roman",FontWeight.BOLD, 35);
		for(int i=0; i<18; i++)
		{
			x = centerx + r * Math.cos(i*a);
			y = centery - r * Math.sin(i*a);
			red = Math.random()*1;
			green = Math.random()*1;
			blue = Math.random()*1;
			Color c1 = new Color(red,green,blue,1);
			Text t1 = new Text(x,y,text.charAt(i) + "");
			t1.setFill(c1);
			t1.setFont(f1);
			t1.setRotate(degrees);
			degrees+=20;
			pane.getChildren().add(t1);
		}
		Scene scene = new Scene(pane,w,h);
		
		PrimaryStage.setTitle("Welcome to JavaFX!");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}

}
