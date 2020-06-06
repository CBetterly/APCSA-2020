package finalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class GUI extends javax.swing.JFrame implements Runnable {
	private static final long serialVersionUID = 1499009746484804187L;
	// private boolean[] keys;
	private BufferedImage back;
	private String currentPage;
	private javax.swing.JLabel mainTitleLbl;

	public GUI() {
		setBackground(Color.DARK_GRAY);
		currentPage = "StartScreen";
		mainTitleLbl = new javax.swing.JLabel();
		// keys = new boolean[5];

		// instantiate other instance variables

		// alienOne = new Alien(200,50,50,50,0);
		// alienTwo = new Alien(300,50,50,50,0);
		// horde = new AlienHorde(5);

		// timer = new Timer();
		// ammoList = new ArrayList<Ammo>();

		// canShootAgain = true;

		
		new Thread(this).start();

		setVisible(true);
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.currentThread();
				Thread.sleep(5);
				repaint();
			}
		} catch (Exception e) {
			System.out.println("EXCEPTION CAUGHT - GUI.java run()");
		}
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		// set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D) window;

		// take a snap shop of the current screen and same it as an image
		// that is the exact same width and height as the current screen
		if (back == null) {
			back = (BufferedImage) (createImage(getWidth(), getHeight()));
		}

		// create a graphics reference to the back ground image
		// we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		if (currentPage.equals("StartScreen")) {
			graphToBack.setColor(Color.DARK_GRAY);
			graphToBack.fillRect(0, 0, getWidth(), getHeight());
			graphToBack.setColor(Color.WHITE);
			graphToBack.setFont(new Font("Open Sans", 0, 24));
			
			graphToBack.drawString("Team 3128: Aluminum Narwhals Robot Database", getWidth()/3-60, getHeight()/6);
			// add code to move (Ship, Alien, etc.)

			// ship.draw(graphToBack);
			// alienOne.draw(graphToBack);
			// alienTwo.draw(graphToBack);
			// horde.drawEmAll(graphToBack, ammoList);

			
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}
}

// import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import java.awt.Canvas;
// import java.awt.event.ActionEvent;
// import java.awt.event.KeyListener;
// import java.awt.event.KeyEvent;
// import static java.lang.Character.*;
// import java.awt.image.BufferedImage;
// import java.awt.event.ActionListener;
// import java.util.ArrayList;
// import java.util.Timer;
// import java.util.TimerTask;

// public class OuterSpace extends Canvas implements KeyListener, Runnable {
// private Ship ship;
// private Alien alienOne;
// private Alien alienTwo;
// private ArrayList<Ammo> ammoList;
// private Timer timer;
// private boolean canShootAgain;
// private AlienHorde horde;
//
// private boolean[] keys;
// private BufferedImage back;
//
// public OuterSpace() {
// setBackground(Color.black);
//
// keys = new boolean[5];
//
// // instantiate other instance variables
// // Ship, Alien
// ship = new Ship(325,400,100,100,2);
//
// //alienOne = new Alien(200,50,50,50,0);
// //alienTwo = new Alien(300,50,50,50,0);
// horde = new AlienHorde(5);
//
// timer = new Timer();
// ammoList = new ArrayList<Ammo>();
//
// canShootAgain = true;
//
// this.addKeyListener(this);
// new Thread(this).start();
//
// setVisible(true);
// }
//
// public Ship getShip() {
// return ship;
// }
//
// public void update(Graphics window) {
// paint(window);
// }
//
// public void paint(Graphics window) {
// // set up the double buffering to make the game animation nice and smooth
// Graphics2D twoDGraph = (Graphics2D) window;
//
// // take a snap shop of the current screen and same it as an image
// // that is the exact same width and height as the current screen
// if (back == null) {
// back = (BufferedImage) (createImage(getWidth(), getHeight()));
// }
//
// // create a graphics reference to the back ground image
// // we will draw all changes on the background image
// Graphics graphToBack = back.createGraphics();
//
// //graphToBack.setColor(Color.BLUE);
// //graphToBack.drawString("StarFighter ", 25, 50);
// graphToBack.setColor(Color.BLACK);
// graphToBack.fillRect(0, 0, 800, 600);
//
// if (keys[0] == true) {
// ship.move("LEFT");
// }
//
// if (keys[1] == true) {
// ship.move("RIGHT");
// }
//
// if (keys[2] == true) {
// ship.move("UP");
// }
//
// if (keys[3] == true) {
// ship.move("DOWN");
// }
//
// if (keys[4] == true && canShootAgain) {
// //System.out.println("Shots fired!");
// ammoList.add(new Ammo(ship.getX(),ship.getY()+20,ship.getSpeed()+2));
// canShootAgain = false;
// timer.schedule(new TimerTask() {
// public void run() {
// canShootAgain = true;
// }
// }, 300);
// }
//
//
// // add code to move (Ship, Alien, etc.)
//
//
//
// for(Ammo am: ammoList) {
// //am.setY(am.getY()-am.getSpeed());
// am.move("UP");
// am.draw(graphToBack);
// }
//
// for(int i = 0; i < ammoList.size();) {
// if(ammoList.get(i).getY()<0) {
// ammoList.remove(i);
// } else {
// i++;
// }
// }
//
// ship.draw(graphToBack);
// //alienOne.draw(graphToBack);
// //alienTwo.draw(graphToBack);
// horde.drawEmAll(graphToBack, ammoList);
//
//
//
// twoDGraph.drawImage(back, null, 0, 0);
// }
//
// public void keyPressed(KeyEvent e) {
// if (e.getKeyCode() == KeyEvent.VK_LEFT) {
// keys[0] = true;
// }
// if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
// keys[1] = true;
// }
// if (e.getKeyCode() == KeyEvent.VK_UP) {
// keys[2] = true;
// }
// if (e.getKeyCode() == KeyEvent.VK_DOWN) {
// keys[3] = true;
// }
// if (e.getKeyCode() == KeyEvent.VK_SPACE) {
// keys[4] = true;
// }
// //repaint();
// }
//
// public void keyReleased(KeyEvent e) {
// if (e.getKeyCode() == KeyEvent.VK_LEFT) {
// keys[0] = false;
// }
// if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
// keys[1] = false;
// }
// if (e.getKeyCode() == KeyEvent.VK_UP) {
// keys[2] = false;
// }
// if (e.getKeyCode() == KeyEvent.VK_DOWN) {
// keys[3] = false;
// }
// if (e.getKeyCode() == KeyEvent.VK_SPACE) {
// keys[4] = false;
// }
// //repaint();
// }
//
// public void keyTyped(KeyEvent e) {
// // no code needed here
// }
//
// public void run() {
// try {
// while (true) {
// Thread.currentThread().sleep(5);
// repaint();
// }
// } catch (Exception e) {
// System.out.println("EXCEPTION CAUGHT - OuterSpace.java run()");
// }
// }
// }