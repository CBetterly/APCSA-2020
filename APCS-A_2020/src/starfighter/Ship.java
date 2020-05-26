package starfighter;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing {
	private int speed;
	private Image image;

	public Ship() {
		this(10, 10, 10, 10, 10);
	}

	public Ship(int x, int y) {
		this(x,y,10,10,10);
	}

	public Ship(int x, int y, int s) {
		this(x,y,10,10,s);
	}

	public Ship(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			//System.out.println(getClass().getResource("ship.jpg"));
			URL url = getClass().getResource("ship.jpg");
			//URL url = getClass().getResource("src/starfi/simpleReview.txt");
			//originally URL url = getClass().getResource("/images/ship.jpg");
			
			image = ImageIO.read(url);
		} catch (Exception e) {
			// feel free to do something here
			System.out.println("Failed to get the Ship image");
		}
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String direction) {
		if(direction.equals("UP")) {
			this.setY(getY()-getSpeed());
		}
		
		if(direction.equals("DOWN")) {
			this.setY(getY()+getSpeed());
		}
		
		if(direction.equals("LEFT")) {
			this.setX(getX()-getSpeed());
		}
		
		if(direction.equals("RIGHT")) {
			this.setX(getX()+getSpeed());
		}
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
		//window.setColor(Color.WHITE);
		//window.drawString("Thanos", 100, 100);
		
	}

	public String toString() {
		return super.toString() + getSpeed();
	}
}
