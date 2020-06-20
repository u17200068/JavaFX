package MMProgrammingHW3;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Q3_U17200068 extends Application
{
	int x =150;
	int y = 125;
	Polyline p1 = new Polyline(x,y);
	ObservableList <Double> list = p1.getPoints();
	public void start(Stage stage)
	{
		Pane root = new Pane();
		Scene scene = new Scene(root,300,250);
	
		scene.setOnKeyPressed(e ->{
			switch(e.getCode())
			{
				case RIGHT:
					list.add((double) x++);
					list.add((double) y);
					break;
				case DOWN:
					list.add((double) x);
					list.add((double) y++);
					break;
				case LEFT:
					list.add((double) x--);
					list.add((double) y);
					break;
				case UP:
					list.add((double) x);
					list.add((double) y--);
					break;
				default:
					System.out.println("Wrong input");
			}
		});
		
		root.getChildren().add(p1);
		stage.setTitle("Draw line segments");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
