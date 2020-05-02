package pong;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable {
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int leftScore;
	private int rightScore;

	public Pong() {
		// set up all variables related to the game
		ball = new Ball();

		leftScore = 0;
		rightScore = 0;

		leftPaddle = new Paddle(10, 300, 20, 100, Color.RED, 5);

		rightPaddle = new Paddle(750, 300, 20, 100, Color.BLUE, 5);

		keys = new boolean[4];

		setBackground(Color.WHITE);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this); // starts the key thread to log key strokes
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

		ball.moveAndDraw(graphToBack);
		leftPaddle.doNothingDraw(graphToBack);
		rightPaddle.doNothingDraw(graphToBack);
		graphToBack.clearRect(99, 480, 600, 50);
		graphToBack.setColor(Color.DARK_GRAY);
		graphToBack.drawString("Left: " + leftScore, 100, 500);
		graphToBack.drawString("Right: " + rightScore, 600, 500);

		if (ball.getX() >= 780) {
			ball.setXSpeed(-ball.getXSpeed());
			leftScore++;
		}

		if (ball.getX() <= -10) {
			ball.setXSpeed(-ball.getXSpeed());
			rightScore++;
		}

		// if ball is travelling left and it touches
		if (ball.getXSpeed() < 0 && ball.getX() + ball.getWidth() <= leftPaddle.getX() + leftPaddle.getWidth()
				&& ball.getY() + ball.getHeight() >= leftPaddle.getY()
				&& ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (ball.getXSpeed() > 0 && ball.getX() + ball.getWidth() >= rightPaddle.getX()
				&& ball.getY() + ball.getHeight() >= rightPaddle.getY()
				&& ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()) {
			ball.setXSpeed(-ball.getXSpeed());
		}

		if (!(ball.getY() >= 10 && ball.getY() <= 450)) {
			ball.setYSpeed(-ball.getYSpeed());
		}

		if (keys[0] == true) {
			// move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[1] == true) {
			// move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if (keys[2] == true) {
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if (keys[3] == true) {
			rightPaddle.moveDownAndDraw(graphToBack);
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'Z':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'M':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'Z':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'M':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}