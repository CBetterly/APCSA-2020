package pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		xPos = 10;
		yPos = 10;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}

	// add other Block constructors - x , y , width, height, color

	public Block(int xStart, int yStart) {
		xPos = xStart;
		yPos = yStart;
		width = 10;
		height = 10;
		color = Color.BLACK;
	}

	public Block(int xStart, int yStart, int startWidth, int startHeight) {
		xPos = xStart;
		yPos = yStart;
		width = startWidth;
		height = startHeight;
		color = Color.BLACK;
	}

	public Block(int xStart, int yStart, int startWidth, int startHeight, Color startColor) {
		xPos = xStart;
		yPos = yStart;
		width = startWidth;
		height = startHeight;
		color = startColor;
	}

	// add the other set methods

	public void setColor(Color col) {
		color = col;
	}

	public void draw(Graphics window) {
		
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {

	}

	public boolean equals(Block block) {
		if(xPos == block.getX() && yPos == block.getY() && width == block.getWidth() && height == block.getHeight()) {
			return true;
		}
		return false;
	}

	// START Locatable Methods
	@Override
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	@Override
	public void setX(int x) {
		xPos = x;
	}

	@Override
	public void setY(int y) {
		yPos = y;
	}

	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}
	// END Locatable Methods

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	// add a toString() method - x , y , width, height, color
	public String toString() {
		return "BLOCK INFO::  x: " + xPos + "\ty: " + yPos + "\twidth: " + width + "\theight: " + height + "\tcolor: "
				+ color.getRGB();
	}

}