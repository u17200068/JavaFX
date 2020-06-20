package tictactoe;

import java.util.Date;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class X 
{
	static boolean[] filled;
	public String locations;
	int width;
	int height;
	X[] x_used;
	static int ctr;
	
	public X()
	{
		ctr=0;
		filled = new boolean[9];
		width = 300;
		height=300;
	}
	
	public ImageView putX(double x, double y)
	{
			if(x>0 && x<width/3 && y>0 && y<height/3 && filled[0]==false && O.getFill(0)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width/3 - 75);
				ximgv.setLayoutY(height/3 - 75);
				filled[0] = true;
				return ximgv;
			}
			else if (x>width/3 && x<width/3+width/3 && y>0 && y<height/3 && filled[1]==false && O.getFill(1)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width/3+width/3 - 75);
				ximgv.setLayoutY(height/3 - 75);
				filled[1] = true;
				return ximgv;
			}
			else if (x>width/3+width/3 && x<width && y>0 && y<height/3 && filled[2]==false && O.getFill(2)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width - 75);
				ximgv.setLayoutY(height/3 - 75);
				filled[2] = true;
				return ximgv;
			}
			else if(x>0 && x<width/3 && y>height/3 && y<height/3+height/3 && filled[3]==false && O.getFill(3)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width/3 - 75);
				ximgv.setLayoutY(height/3+height/3 - 75);
				filled[3] = true;
				return ximgv;
			}
			else if (x>width/3 && x<width/3+width/3 && y>height/3 && y<height/3+height/3 && filled[4]==false && O.getFill(4)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width/3+width/3 - 75);
				ximgv.setLayoutY(height/3+height/3 - 75);
				filled[4] = true;
				return ximgv;
			}
			else if (x>width/3+width/3 && x<width && y>height/3 && y<height/3+height/3 && filled[5]==false && O.getFill(5)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width - 75);
				ximgv.setLayoutY(height/3+height/3 - 75);				
				filled[5] = true;
				return ximgv;
			}
			else if(x>0 && x<width/3 && y>height/3+height/3 && y<height && filled[6]==false && O.getFill(6)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width/3 - 75);
				ximgv.setLayoutY(height - 75);
				filled[6] = true;
				return ximgv;
			}
			else if (x>width/3 && x<width/3+width/3 && y>height/3+height/3  && y<height && filled[7]==false && O.getFill(7)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width/3+width/3 - 75);
				ximgv.setLayoutY(height - 75);
				filled[7] = true;
				return ximgv;
			}
			else if (x>width/3+width/3 && x<width && y>height/3+height/3  && y<height && filled[8]==false && O.getFill(8)==false)
			{
				Image ximg = new Image("/X.png");
				ImageView ximgv = new ImageView(ximg);
				ximgv.setLayoutX(width - 75);
				ximgv.setLayoutY(height- 75);
				filled[8] = true;
				return ximgv;
		}
		return null;
	}
	
	public void xWin(Stage openstage)
	{
		Win x = new Win();
		boolean result;
		result = x.checkWinX(filled);
		if(result==true)
		{
			Game.endDate = new Date();
		}
		Win.displayWin(openstage,result);	
	}
	
	public void xDraw(Stage openstage)
	{
		Draw d = new Draw();
		boolean result;
		result = d.checkDraw(filled,O.filled);
		if(result==true)
		{
			Game.endDate = new Date();
		}
		Draw.displayDraw(openstage,result);
	}
	
	public static boolean getFill(int index)
	{
		return filled[index];
	}
}
