package tictactoe;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Start extends Application
{
	public static MediaPlayer mediaplayer;
	
	public void start(Stage stage)
	{
		Media gameSound = new Media("file:///C:/Users/User/eclipse-workspace/Tic%20tac%20toe/bin/res/audio/game.mp3");
		mediaplayer = new MediaPlayer(gameSound);
		mediaplayer.setAutoPlay(true);
		mediaplayer.setVolume(0.3);
		mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
		Intro.display();
	}
	
	public static void main(String[] args)
	{
		Application.launch(args);
	}
}
