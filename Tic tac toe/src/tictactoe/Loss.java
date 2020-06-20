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

public class Loss
{
	static MediaPlayer mediaplayer;
	public boolean checkLossO(boolean[] filled)
	{
		return(filled[0]==true && filled[1]==true && filled[2]==true
			|| filled[3]==true && filled[4]==true && filled[5]==true
			|| filled[6]==true && filled[7]==true && filled[8]==true
			|| filled[0]==true && filled[3]==true && filled[6]==true
			|| filled[1]==true && filled[4]==true && filled[7]==true
			|| filled[2]==true && filled[5]==true && filled[8]==true
			|| filled[0]==true && filled[4]==true && filled[8]==true
			|| filled[2]==true && filled[4]==true && filled[6]==true);
	}
	
	public static void displayLoss(Stage openstage,boolean result)
	{
		if(result==true)
		{
			openstage.close();
			Stage stage = new Stage();
			Pane pane = new Pane();
			Scene scene = new Scene(pane,300,300);
			Image lose = new Image("/lose.png");
			Image background = new Image("/background.jpg");
			ImageView backgroundV = new ImageView(background);
			ImageView losev = new ImageView(lose);
			Start.mediaplayer.pause();
			Media lossSound = new Media("file:///C:/Users/User/eclipse-workspace/Tic%20tac%20toe/bin/res/audio/lose.mp3");
			mediaplayer = new MediaPlayer(lossSound);
			mediaplayer.setAutoPlay(true);
			mediaplayer.setVolume(0.1);
			losev.setLayoutX(55);
			losev.setLayoutY(60);
			Image icon = new Image("/fileicon.png");
			Button exit = new Button("Exit");
			Button stats = new Button("View Stats");
			Button start = new Button("Play Again");
			FadeTransition ft = new FadeTransition(Duration.millis(1000), losev);
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
			pane.getChildren().add(losev);
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