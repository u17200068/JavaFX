package MMProgrammingHW3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Q1_U17200068 extends Application
{
	public void start(Stage stage)
	{
		GridPane pane = new GridPane();
		Scene scene = new Scene(pane,400,258);
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();
		Button calc = new Button("Calculate");
		Button exit = new Button("Exit");
		Label l1 = new Label("Enter First Integer (x):");
		Label l2 = new Label("Enter Second Integer (y):");
		Label l3 = new Label("Enter third Integer (z):");
		Label l4 = new Label("Is x * x + y * y = z * z?:");
		HBox h1 = new HBox(l1);
		HBox h2 = new HBox(l2);
		HBox h3 = new HBox(l3);
		HBox h4 = new HBox(l4);
		HBox h5 = new HBox(t1);
		HBox h6 = new HBox(t2);
		HBox h7 = new HBox(t3);
		HBox h8 = new HBox(t4);
		HBox h9 = new HBox(calc);
		HBox h10 = new HBox(exit);
		h1.setMinWidth(200);
		h2.setMinWidth(200);
		h3.setMinWidth(200);
		h4.setMinWidth(200);
		t1.setMinWidth(200);
		t2.setMinWidth(200);
		t3.setMinWidth(200);
		t4.setMinWidth(200);
		h1.setMinHeight(50);
		h2.setMinHeight(50);
		h3.setMinHeight(50);
		h4.setMinHeight(50);
		t1.setMinHeight(50);
		t2.setMinHeight(50);
		t3.setMinHeight(50);
		t4.setMinHeight(50);
		h5.setMinWidth(200);
		h6.setMinWidth(200);
		h7.setMinWidth(200);
		h8.setMinWidth(200);
		l1.setMinWidth(200);
		l2.setMinWidth(200);
		l3.setMinWidth(200);
		l4.setMinWidth(200);
		h5.setMinHeight(50);
		h6.setMinHeight(50);
		h7.setMinHeight(50);
		h8.setMinHeight(50);
		l1.setMinHeight(50);
		l2.setMinHeight(50);
		l3.setMinHeight(50);
		l4.setMinHeight(50);
		h9.setMinWidth(200);
		h10.setMinWidth(200);
		calc.setMinWidth(200);
		exit.setMinWidth(200);
		h9.setMinHeight(50);
		h10.setMinHeight(50);
		calc.setMinHeight(50);
		exit.setMinHeight(50);
		l1.setAlignment(Pos.CENTER_RIGHT);
		l2.setAlignment(Pos.CENTER_RIGHT);
		l3.setAlignment(Pos.CENTER_RIGHT);
		l4.setAlignment(Pos.CENTER_RIGHT);
		pane.setAlignment(Pos.TOP_RIGHT);
		pane.setPadding(new Insets(2,2,2,2));
		pane.setHgap(1);
		pane.setVgap(1);
		pane.add(h1,0,0);
		pane.add(h5,1,0);
		pane.add(h2,0,1);
		pane.add(h6,1,1);
		pane.add(h3,0,2);
		pane.add(h7,1,2);
		pane.add(h4,0,3);
		pane.add(h8,1,3);
		pane.add(h9,0,4);
		pane.add(h10,1,4);
		calc.setOnAction(e ->{
			double x = Double.parseDouble(t1.getText());
			double y = Double.parseDouble(t2.getText());
			double z = Double.parseDouble(t3.getText());
			double result = x*x+y*y;
			if(result==z*z)
			{
				t4.setText("Yes");
			}
			else
			{
				t4.setText("No");
			}
		});
		t1.setOnAction(e ->{
			double x = Double.parseDouble(t1.getText());
			double y = Double.parseDouble(t2.getText());
			double z = Double.parseDouble(t3.getText());
			double result = x*x+y*y;
			if(result==z*z)
			{
				t4.setText("Yes");
			}
			else
			{
				t4.setText("No");
			}
		});
		t2.setOnAction(e ->{
			double x = Double.parseDouble(t1.getText());
			double y = Double.parseDouble(t2.getText());
			double z = Double.parseDouble(t3.getText());
			double result = x*x+y*y;
			if(result==z*z)
			{
				t4.setText("Yes");
			}
			else
			{
				t4.setText("No");
			}
		});
		t3.setOnAction(e ->{
			double x = Double.parseDouble(t1.getText());
			double y = Double.parseDouble(t2.getText());
			double z = Double.parseDouble(t3.getText());
			double result = x*x+y*y;
			if(result==z*z)
			{
				t4.setText("Yes");
			}
			else
			{
				t4.setText("No");
			}
		});
		exit.setOnAction(e ->{
			stage.close();
		});
		t4.setEditable(false);
		stage.setTitle("Lab Test");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}
