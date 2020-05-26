package starfighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing {
	private int speed;
	private int xPos;
	private int yPos;

	public Ammo() {
		this(0, 0, 0);
	}

	public Ammo(int x, int y) {
		this(x, y, 0);
	}

	public Ammo(int x, int y, int s) {
		xPos = x;
		yPos = y;
		speed = s;
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}
	
	public int getWidth() {
		return 5;
	}
	
	public int getHeight() {
		return 30;
	}
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}

	public void draw(Graphics window) {
		window.setColor(Color.YELLOW);
		window.fillRect(xPos+48, yPos, 5, 30);
	}

	public void move(String direction) {
		yPos = yPos - speed;
	}

	public String toString() {
		return "";
	}
}
