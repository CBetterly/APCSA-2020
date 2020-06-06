package finalProject;

import javax.swing.JFrame;

import golfApp.HSGolfLogin;

import java.awt.Component;
import java.io.FileNotFoundException;

public class Main extends JFrame {
	private static final long serialVersionUID = -1658931587089426043L;
	

	public Main() {
		/*
		 * super("FRC Robot Database"); super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 * setSize(WIDTH, HEIGHT);
		 */
		/* JFrameGUI jfgui = */

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(JFrameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		try {
			new JFrameGUI().setVisible(true);
		} catch (FileNotFoundException e) {
			System.out.println("BRUH BIG FileNotFoundException");
			e.printStackTrace();
		}
		// GUI gui = new GUI();
		// ((Component) gui).setFocusable(true);
		// //getContentPane().add(gui);
		// setVisible(true);
		System.out.println("Done with Main constructor");
	}

	public static void main(String args[]) {
		/* Main run = */new Main();
	}
	
	public int getWidth() {
		return WIDTH;
	}
}

// import javax.swing.JFrame;
// import java.awt.Component;
//
// public class StarFighter extends JFrame
// {
// private static final int WIDTH = 800;
// private static final int HEIGHT = 600;
//
// public StarFighter()
// {
// super("STARFIGHTER");
// super.setDefaultCloseOperation(EXIT_ON_CLOSE);
// setSize(WIDTH,HEIGHT);
// OuterSpace theGame = new OuterSpace();
// ((Component)theGame).setFocusable(true);
// getContentPane().add(theGame);
// setVisible(true);
// System.out.println("Done with Starfighter constructor");
// }
//
// public static void main( String args[] )
// {
// StarFighter run = new StarFighter();
// }
// }