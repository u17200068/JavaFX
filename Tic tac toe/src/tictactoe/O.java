package tictactoe;

import java.util.Date;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class O 
{
	static boolean[] filled;
	int width;
	int height;
	static int ctr;
	
	public O()
	{
		ctr=0;
		filled = new boolean[9];
		width = 300;
		height=300;
	}
	
	public ImageView putO(double x, double y)
	{
			if(x>0 && x<width/3 && y>0 && y<height/3 && filled[0]==false && X.getFill(0)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width/3 - 75);
				oimgv.setLayoutY(height/3 - 75);
				filled[0] = true;
				return oimgv;
			}
			else if (x>width/3 && x<width/3+width/3 && y>0 && y<height/3 && filled[1]==false && X.getFill(1)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width/3+width/3 - 75);
				oimgv.setLayoutY(height/3 - 75);
				filled[1] = true;
				return oimgv;
			}
			else if (x>width/3+width/3 && x<width && y>0 && y<height/3 && filled[2]==false && X.getFill(2)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width - 75);
				oimgv.setLayoutY(height/3 - 75);
				filled[2] = true;
				return oimgv;
			}
			else if(x>0 && x<width/3 && y>height/3 && y<height/3+height/3 && filled[3]==false && X.getFill(3)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width/3 - 75);
				oimgv.setLayoutY(height/3+height/3 - 75);
				filled[3] = true;
				return oimgv;
			}
			else if (x>width/3 && x<width/3+width/3 && y>height/3 && y<height/3+height/3 && filled[4]==false && X.getFill(4)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width/3+width/3 - 75);
				oimgv.setLayoutY(height/3+height/3 - 75);
				filled[4] = true;
				return oimgv;
			}
			else if (x>width/3+width/3 && x<width && y>height/3 && y<height/3+height/3 && filled[5]==false && X.getFill(5)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width - 75);
				oimgv.setLayoutY(height/3+height/3 - 75);				
				filled[5] = true;
				return oimgv;
			}
			else if(x>0 && x<width/3 && y>height/3+height/3 && y<height && filled[6]==false && X.getFill(6)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width/3 - 75);
				oimgv.setLayoutY(height - 75);
				filled[6] = true;
				return oimgv;
			}
			else if (x>width/3 && x<width/3+width/3 && y>height/3+height/3  && y<height && filled[7]==false && X.getFill(7)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width/3+width/3 - 75);
				oimgv.setLayoutY(height - 75);
				filled[7] = true;
				return oimgv;
			}
			else if (x>width/3+width/3 && x<width && y>height/3+height/3  && y<height && filled[8]==false && X.getFill(8)==false)
			{
				Image oimg = new Image("/O.png");
				ImageView oimgv = new ImageView(oimg);
				oimgv.setLayoutX(width - 75);
				oimgv.setLayoutY(height- 75);
				filled[8] = true;
				return oimgv;
		}
		return null;
	}
	
	public void oWin(Stage openstage)
	{
		Loss o = new Loss();
		boolean result;
		result = o.checkLossO(filled);
		if(result==true)
		{
			Game.endDate = new Date();
		}
		Loss.displayLoss(openstage,result);
	}
	
	public void oDraw(Stage openstage)
	{
		Draw d = new Draw();
		boolean result;
		result = d.checkDraw(X.filled,filled);
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


