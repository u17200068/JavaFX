package MMProgrammingHW3;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Q2_U17200068 extends Application
{
	public void start(Stage stage)
	{
		Pane root = new Pane();
		Scene scene = new Scene(root,300,250);
		root.setOnMouseClicked(e ->{
			Circle c1 = new Circle(e.getX(),e.getY(),5,Color.WHITE);
			c1.setStroke(Color.BLACK);
			c1.setStrokeWidth(2);
			if(e.getButton()==MouseButton.PRIMARY)
			{
				root.getChildren().add(c1);
			}
			if(e.getButton()==MouseButton.SECONDARY)
			{
				ObservableList<Node> list = root.getChildren();
				for(int i=0; i<list.size(); i++)
				{
					Circle c2 = (Circle)list.get(i);
					if (c1.contains(c2.getCenterX(), c2.getCenterY())) 
					{
						list.remove(i);
					}
				}
			}
		});
		
		stage.setTitle("Add and Remove Points");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
