
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Q1_U17200068 extends Application
{
	public void start(Stage stage)
	{
		int x=35;
		int y=90;
		int w=50; int h=80;
		int r=4;
		Pane pane = new Pane();
		Rectangle house = new Rectangle(w+180,h+75,Color.WHITE);
		Rectangle door = new Rectangle(w,h,Color.DARKRED);
		Polygon attic = new Polygon(x+1,y,x+115,y-60,x+229,y,x,y);
		Polygon roof = new Polygon(x-10,y+5,x+115,y-60,x+240,y+5,x+248,y-5,x+115,y-75,x-18,y-5);
		Polygon chimney = new Polygon(x+180,y-70,x+210,y-70,x+210,y-25,x+180,y-41);
		Rectangle chimneytop = new Rectangle(x+178,y-71,w-16,h-70); 
		Circle knob = new Circle(x+100,y+120,r,Color.YELLOW);
		Rectangle window1 = new Rectangle(x+92,y-10,w-5,h-45);
		Rectangle window2 = new Rectangle(x+15,y+60,w-5,h-45);
		Rectangle window3 = new Rectangle(x+170,y+60,w-5,h-45);
		Line l1 = new Line(x+115,y-10,x+115,y+25);
		Line l2 = new Line(x+93,y+8,x+136,y+8);
		Line l3 = new Line(x+38,y+94,x+38,y+62);
		Line l4 = new Line(x+17,y+78,x+58,y+78);
		Line l5 = new Line(x+193,y+94,x+193,y+62);
		Line l6 = new Line(x+171,y+78,x+213,y+78);
		pane.getChildren().add(house);
		pane.getChildren().add(door);
		pane.getChildren().add(attic);
		pane.getChildren().add(knob);
		pane.getChildren().add(roof);
		pane.getChildren().add(chimney);
		pane.getChildren().add(chimneytop);
		pane.getChildren().add(window1);
		pane.getChildren().add(window2);
		pane.getChildren().add(window3);
		pane.getChildren().add(l1);
		pane.getChildren().add(l2);
		pane.getChildren().add(l3);
		pane.getChildren().add(l4);
		pane.getChildren().add(l5);
		pane.getChildren().add(l6);
		attic.setFill(Color.WHITE);
		attic.setStroke(Color.WHITE);
		door.setStroke(Color.BLACK);
		door.setStrokeWidth(2);
		door.setX(x+90);
		door.setY(y+77);
		roof.setFill(Color.DARKRED);
		roof.setStroke(Color.BLACK);
		roof.setStrokeWidth(2);
		chimney.setFill(Color.DARKRED);
		chimney.setStroke(Color.BLACK);
		chimney.setStrokeWidth(2);
		chimneytop.setFill(Color.WHITE);
		chimneytop.setStroke(Color.BLACK);
		chimneytop.setStrokeWidth(2);
		chimneytop.setArcWidth(10.0);
		chimneytop.setArcHeight(10.0);
		house.setStroke(Color.WHITE);
		house.setStrokeWidth(2);
		house.setX(x);
		house.setY(y);
		knob.setStroke(Color.BLACK);
		knob.setStrokeWidth(2);
		window1.setFill(Color.YELLOW);
		window2.setFill(Color.YELLOW);
		window3.setFill(Color.YELLOW);
		window1.setStroke(Color.BLACK);
		window2.setStroke(Color.BLACK);
		window3.setStroke(Color.BLACK);
		window1.setStrokeWidth(3);
		window2.setStrokeWidth(3);
		window3.setStrokeWidth(3);
		l1.setStrokeWidth(3);
		l2.setStrokeWidth(3);
		l3.setStrokeWidth(3);
		l4.setStrokeWidth(3);
		l5.setStrokeWidth(3);
		l6.setStrokeWidth(3);
		
		Scene scene = new Scene(pane,300,250);
		scene.setFill(Color.BLACK);
		
		stage.setTitle("House");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) 
	{
		Application.launch(args);
	}

}
