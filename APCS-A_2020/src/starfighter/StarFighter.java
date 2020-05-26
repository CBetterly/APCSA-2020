package starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;
import java.awt.Component;

public class StarFighter extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public StarFighter()
	{
		super("STARFIGHTER");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		OuterSpace theGame = new OuterSpace();
		((Component)theGame).setFocusable(true);
		getContentPane().add(theGame);
		setVisible(true);
		System.out.println("Done with Starfighter constructor");
	}

	public static void main( String args[] )
	{
		StarFighter run = new StarFighter();
	}
}