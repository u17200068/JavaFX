package tictactoe;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Draw 
{
	static MediaPlayer mediaplayer;
	public boolean checkDraw(boolean[] xFilled,boolean[] oFilled)
	{
		int ctrX = 0;
		int ctrO = 0;
		Win x = new Win();
		Loss o = new Loss();
		for(int i=0; i<9; i++)
		{
			if(xFilled[i]==true)
			{
				ctrX++;
			}
			if (oFilled[i]==true)
			{
				ctrO++;
			}
		}
		
		int filledAreas = ctrX + ctrO;
		
		if((filledAreas)==9)
		{
			return x.checkWinX(xFilled)==false && o.checkLossO(oFilled)==false;
		}
		return false;
	}
	
	public static void displayDraw(Stage openstage,boolean result)
	{
		if(result==true)
		{
			openstage.close();
			Stage stage = new Stage();
			Pane pane = new Pane();
			Scene scene = new Scene(pane,300,300);
			Image draw = new Image("/draw.png");
			Image background = new Image("/background.jpg");
			ImageView backgroundV = new ImageView(background);
			ImageView drawv = new ImageView(draw);
			Start.mediaplayer.pause();
			Media lossSound = new Media("https://scribie.com/files/20eefeaad57a439094c5d27b4e657eb9aa3b2984");
			mediaplayer = new MediaPlayer(lossSound);
			mediaplayer.setAutoPlay(true);
			mediaplayer.setVolume(0.2);
			drawv.setLayoutX(85);
			drawv.setLayoutY(60);
			Image icon = new Image("/fileicon.png");
			Button exit = new Button("Exit");
			Button start = new Button("Play Again");
			Button stats = new Button("View Stats");
			FadeTransition ft = new FadeTransition(Duration.millis(1000), drawv);
			ft.setFromValue(0.0);
			ft.setToValue(1.0);
			ft.setCycleCount(1);
			ft.setAutoReverse(true);
			ft.play(); 
			exit.setLayoutX(110);
			exit.setLayoutY(260);	
			exit.setMinWidth(90);
			stats.setLayoutX(110);
			stats.setLayoutY(210);	
			stats.setMinWidth(90);			
			start.setLayoutX(110);
			start.setLayoutY(160);
			start.setMinWidth(90);
			
			exit.setOnMouseClicked(e->{
				stage.close();
			});
			
			start.setOnMouseClicked(e->{
				stage.close();
				Stats.numberofGames++;
				Game.display();
			});
			
			stats.setOnMouseClicked(e->{
				stage.close();
				Stats.displayStats(stage);
			});
			
			pane.getChildren().add(backgroundV);
			pane.getChildren().add(drawv);
			pane.getChildren().add(start);
			pane.getChildren().add(exit);
			pane.getChildren().add(stats);
			stage.getIcons().add(icon);
			stage.setTitle("Tic tac toe");
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		}
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}
