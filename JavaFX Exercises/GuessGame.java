package finalprac;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GuessGame extends Application
{
	private int width = 400;
	private int height = 200;
	private int ctr = 1;
	private int answer;
	@Override
	public void start(Stage stage) 
	{
		Pane root = new Pane();
		Scene scene = new Scene(root,width,height);
		scene.setFill(Color.CRIMSON);
		
		answer = (int) (Math.random()*50);
		
		Text intro = new Text("Guess a number between 0-50");
		Label l1 = new Label("Enter " + ctr + "st guess:");
		Button b1 = new Button("Submit Guess");
		Button b2 = new Button("Play Again");
		intro.setLayoutX(width/2-150);
		intro.setLayoutY(height/11+5);
		intro.setFont(new Font("Arial",22));
		b1.setLayoutX(width/50 + 100);
		b1.setLayoutY(height/50 + 100);
		b1.setMinWidth(70);
		l1.setFont(new Font("Arial",16));
		l1.setLayoutY(height/50+60);
		l1.setLayoutX(width/3 - (width/3) + 10);
		TextField t1 = new TextField();
		TextArea t2 = new TextArea();
		b2.setLayoutX(width/50 + 110);
		b2.setLayoutY(height/50 + 100);
		b2.setMinWidth(70);
		t2.setFont(new Font("Arial",13));
		t2.setLayoutX(width/2+20);
		t2.setLayoutY(height/50+60);
		t2.setMaxHeight(130);
		t2.setMaxWidth(170);
		t2.setEditable(false);
		l1.setLabelFor(t1);
		t1.setLayoutY(height/50+60);
		t1.setLayoutX(width/3+5);
		t1.setMaxWidth(width/6);
		
		b2.setOnMouseClicked(e->{
			root.getChildren().remove(b2);
			root.getChildren().add(b1);
			t2.clear();
			ctr=1;
			l1.setText("Enter " + ctr + "st guess:");
		});
		
		b1.setOnMouseClicked(e->{
			ctr++;
			if(ctr==2)
			{
				l1.setText("Enter " + ctr + "nd guess:");
			}
			else if(ctr==3)
			{
				l1.setText("Enter " + ctr + "rd guess:");
			}
			else if(ctr>3)
			{
				l1.setText("Enter " + ctr + "th guess:");
			}
			
			int guess = Integer.parseInt(t1.getText());
			t1.clear();
			if(guess==answer)
			{
				t2.setText("Congratulations you \nguessed the correct \nnumber: " + answer);
				root.getChildren().remove(b1);
				root.getChildren().add(b2);
			}
			else if(guess<answer)
			{
				t2.setText("Guess is lower \nthan the number");
			}
			else if(guess>answer)
			{
				t2.setText("Guess is higher \nthan the number");
			}
		});
		
		root.getChildren().addAll(intro,t1,t2,l1,b1);
		
		scene.setFill(Color.BLACK);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("Guessing game");
		stage.show();
	}
	
}
