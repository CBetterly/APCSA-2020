package winterScene;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

//extend the AbstractShape class to make a FancySnowFlake class
public class FancySnowFlake extends AbstractShape {

	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
		
		Random randy = new Random();
		//randy.nextInt(3);
		setYSpeed(1+randy.nextInt(3));
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col) {
		super(x, y, wid, ht, col);
		setYSpeed(1);
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		//int[] xCoordsArray = new int[]
		window.setColor(getColor());
		//window.drawPolyline(, arg1, arg2);
		//window.fillRect(getXPos(), getYPos(), getWidth(), getHeight());
		window.drawString("*",getXPos(), getYPos());
	}

	@Override
	public void moveAndDraw(Graphics window) {
		//window.clearRect(this.getXPos(), this.getYPos(), this.getWidth(), this.getHeight());

		
		
		setXPos(getXPos() + getXSpeed());
		// setY
		setYPos(getYPos() + getYSpeed());
		
		if(getYPos()>600) {
			setYPos(0);
		}
		
		// draw the ball at its new location
		draw(window);

	}

}
