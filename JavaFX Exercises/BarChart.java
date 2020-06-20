package mmProgrammingmidterm;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BarChart extends Application
{
	public void start(Stage stage)
	{
		Pane root = new Pane();
		double w = 100, h=200;
		double ph = h*0.2;
		double qh = h*0.1;
		double mh = h*0.3;
		double fh = h*0.4;
		double x=20, y = h;
		double r,g,b;

		Scene scene = new Scene(root,w*5,h);
		Rectangle p = new Rectangle(x,y-ph,w,ph);
		Rectangle q = new Rectangle(x+x+w,y-qh,w,qh);
		Rectangle m = new Rectangle((x*3)+(w*2),y-mh,w,mh);
		Rectangle f = new Rectangle((x*4)+(w*3),y-fh,w,fh);
		Text pt = new Text(x,y-ph-10,"Project -- 20%");
		Text qt = new Text(x+x+w,y-qh-10,"Quiz -- 10%");
		Text mt = new Text((x*3)+(w*2),y-mh-10,"Midterm -- 30%");
		Text ft = new Text((x*4)+(w*3),y-fh-10,"Final -- 40%");
		Color[] c = new Color[4];
		for(int i=0; i<4; i++)
		{
			r = Math.random()*1;
			g = Math.random()*1;
			b = Math.random()*1;
			c[i] = new Color(r,g,b,1);
		}
		p.setFill(c[0]);
		q.setFill(c[1]);
		m.setFill(c[2]);
		f.setFill(c[3]);
		root.getChildren().add(p);
		root.getChildren().add(q);
		root.getChildren().add(m);
		root.getChildren().add(f);
		root.getChildren().add(pt);
		root.getChildren().add(qt);
		root.getChildren().add(mt);
		root.getChildren().add(ft);
		stage.setTitle("BarChart");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}

}
