package mmProgrammingmidterm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CheckerBoard extends Application
{
	public void start(Stage stage)
	{
		double w=200,h=200;
		double distancex=0;
		double distancey=0;
		Pane root = new Pane();
		Scene scene = new Scene(root,w,h);
		
		for(int i=0; i<8; i++)
		{
			for(int y=0; y<8; y++)
			{
				Rectangle r1 = new Rectangle(w/8,h/8);
				r1.setX(distancex);
				r1.setY(distancey);
				distancex+=w/8;
				if(distancex==200)
				{
					distancex = 0;
					distancey+=h/8;
				}
				if(i%2==0 && y%2==0 || y%2!=0 && i%2!=0)
				{
					r1.setFill(Color.WHITE);
				}
				else if(y%2==0 && i%2!=0 || y%2!=0 && i%2==0)
				{
					r1.setFill(Color.BLACK);
				}
				root.getChildren().add(r1);
			}
		}
		
		stage.setTitle("CheckerBoard");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

}
