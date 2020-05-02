package pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	// add the other Ball constructors
	public Ball(int xPosition, int yPosition) {
		super(xPosition, yPosition);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int xPosition, int yPosition, int width, int height) {
		super(xPosition, yPosition, width, height);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int xPosition, int yPosition, int width, int height, Color color) {
		super(xPosition, yPosition, width, height);
		xSpeed = 3;
		ySpeed = 1;
		this.setColor(color);
	}

	public Ball(int xPosition, int yPosition, int width, int height, Color color, int xSpeed1, int ySpeed1) {
		super(xPosition, yPosition, width, height);
		xSpeed = xSpeed1;
		ySpeed = ySpeed1;
		this.setColor(color);
	}

	public boolean equals(Ball ball) {
		if (super.equals(ball) && ball.getXSpeed() == xSpeed && ball.getYSpeed() == ySpeed) {
			return true;
		}
		return false;
	}

	// add the set methods

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public void setXSpeed(int newXSpeed) {
		xSpeed = newXSpeed;
	}

	public void setYSpeed(int newYSpeed) {
		ySpeed = newYSpeed;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location

		window.clearRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());

		setX(getX() + xSpeed);
		// setY
		setY(getY() + ySpeed);

		// draw the ball at its new location
		draw(window);
	}

	public boolean equals(Object obj) {

		return false;
	}

	// add the get methods

	// add a toString() method
	public String toString() {
		return super.toString().concat("\txSpeed: " + xSpeed + "\tySpeed: " + ySpeed);
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}
}