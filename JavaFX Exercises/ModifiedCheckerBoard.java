package mmProgrammingmidterm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ModifiedCheckerBoard extends Application
{
	public void start(Stage stage)
	{
		double w=200,h=200;
		double distancex=0;
		double distancey=0;
		double cdistancex=0;
		double cdistancey=0;
		int size = 12;
		Rectangle r[][] = new Rectangle[8][8];
		Pane root = new Pane();
		Scene scene = new Scene(root,w,h);
		for(int i=0; i<8; i++)
		{
			for(int y=0; y<8; y++)
			{
				r[i][y] = new Rectangle(w/8,h/8);
				r[i][y].setX(distancex);
				r[i][y].setY(distancey);
				distancex+=w/8;
				if(distancex==200)
				{
					distancex = 0;
					distancey+=h/8;
				}
				if(i%2==0 && y%2==0 || y%2!=0 && i%2!=0)
				{
					r[i][y].setFill(Color.WHITE);
				}
				else if(y%2==0 && i%2!=0 || y%2!=0 && i%2==0)
				{
					r[i][y].setFill(Color.BLACK);
				}
				root.getChildren().add(r[i][y]);
			}
		}
		for(int z=0; z<size; z++)
		{
			if(z%4==0 && z!=0)
			{
				cdistancey+=25;
				cdistancex-=200;
			}
			if(z==4)
			{
				cdistancex-=25;
			}
			if(z==8)
			{
				cdistancex+=25;
			}
			Circle c1 = new Circle(cdistancex+12.5*3,cdistancey+12.5,10,Color.BLACK);
			cdistancex+=50;
			c1.setStroke(Color.WHITE);
			c1.setStrokeWidth(1);
			root.getChildren().add(c1);
		}
		cdistancey=125;
		cdistancex=-25;
		for(int z=0; z<size; z++)
		{
			if(z%4==0 && z!=0)
			{
				cdistancey+=25;
				cdistancex-=200;
			}
			if(z==4)
			{
				cdistancex+=25;
			}
			if(z==8)
			{
				cdistancex-=25;
			}
			Circle c1 = new Circle(cdistancex+12.5*3,cdistancey+12.5,10,Color.RED);
			cdistancex+=50;
			c1.setStroke(Color.WHITE);
			c1.setStrokeWidth(1);
			root.getChildren().add(c1);
		}
		stage.setTitle("Checkers");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args)
	{
		Application.launch(args);
	}
}
