package pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super();
		setSpeed(5);
	}
	
	public Paddle(int xPos, int yPos) {
		super(xPos, yPos);
		setSpeed(5);
	}
	
	public Paddle(int xPos, int yPos, int speed) {
		super(xPos, yPos);
		setSpeed(speed);
	}
	
	public Paddle(int xPos, int yPos, int width, int height, int speed) {
		super(xPos, yPos, width, height);
		setSpeed(speed);
	}
	
	public Paddle(int xPos, int yPos, int width, int height, Color color, int speed) {
		super(xPos, yPos, width, height, color);
		setSpeed(speed);
	}

	// add the other Paddle constructors

	public void moveUpAndDraw(Graphics window) {
		window.clearRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		   
	      setY(getY()-getSpeed());
	      
			//draw the paddle at its new location
	      draw(window);
	}

	public void moveDownAndDraw(Graphics window) {
		window.clearRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		   
	      setY(getY()+getSpeed());
	      
			//draw the paddle at its new location
	      draw(window);
	}
	
	public void doNothingDraw(Graphics window) {
		draw(window);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed1) {
		this.speed = speed1;
	}

	

	// add a toString() method
	public String toString() {
		return "This is a paddle with speed " + getSpeed() + ". See next line for Block info: \n" + super.toString();
	}
}