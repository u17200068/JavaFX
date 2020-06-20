package tictactoe;

import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Game
{
	public static int width = 300, height = 300;
	public static double mouseclick = 0;
	public static Date startDate;
	public static Date endDate;
	public static int ctrX;
	public static int ctrO;
	
	public static void display()
	{
		if(Start.mediaplayer.getStatus()==Status.PAUSED)
		{
			Start.mediaplayer.play();
		}
		Stage stage = new Stage();
		Pane pane = new Pane();
		Scene scene = new Scene(pane,width-10,height-10);
		
		Line l1,l2,l3,l4,l5,l6,l7,l8;
		l1 = new Line(2,0,2,height);
		l2 = new Line(width/3,0,width/3,height);
		l3 = new Line(width/3+width/3,0,width/3+width/3,height);
		l4 = new Line(width-2,0,width-2,height);
		l5 = new Line(0,2,width,2);
		l6 = new Line(0,height/3,width,height/3);
		l7 = new Line(0,height/3+height/3,width,height/3+height/3);
		l8 = new Line(0,height-2,width,height-2);
		l1.setStroke(Color.WHITE);
		l1.setStrokeWidth(5);
		l2.setStroke(Color.WHITE);
		l2.setStrokeWidth(5);
		l3.setStroke(Color.WHITE);
		l3.setStrokeWidth(5);
		l4.setStroke(Color.WHITE);
		l4.setStrokeWidth(5);
		l5.setStroke(Color.WHITE);
		l5.setStrokeWidth(5);
		l6.setStroke(Color.WHITE);
		l6.setStrokeWidth(5);
		l7.setStroke(Color.WHITE);
		l7.setStrokeWidth(5);
		l8.setStroke(Color.WHITE);
		l8.setStrokeWidth(5);
		Image background = new Image("/background.jpg");
		Image icon = new Image("/fileicon.png");
		ImageView backgroundV = new ImageView(background);
		X newX = new X();
		O newO = new O();

		pane.setOnMouseClicked(e->{
			mouseclick++;
			if(mouseclick%2==0)
			{
				ctrO++;
				ImageView o = newO.putO(e.getX(), e.getY());
				newO.oWin(stage);
				newO.oDraw(stage);
				pane.getChildren().add(o);
			}
			else
			{
				ctrX++;
				ImageView x = newX.putX(e.getX(), e.getY());
				newX.xWin(stage);
				newX.xDraw(stage);
				pane.getChildren().add(x);
			}
		});
		
		pane.getChildren().add(backgroundV);
		pane.getChildren().add(l1);
		pane.getChildren().add(l2);
		pane.getChildren().add(l3);
		pane.getChildren().add(l4);
		pane.getChildren().add(l5);
		pane.getChildren().add(l6);
		pane.getChildren().add(l7);
		pane.getChildren().add(l8);
		stage.setResizable(false);
		stage.getIcons().add(icon);
		stage.setTitle("Tic tac toe");
		stage.setScene(scene);
		stage.show();
		startDate = new Date();
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}
