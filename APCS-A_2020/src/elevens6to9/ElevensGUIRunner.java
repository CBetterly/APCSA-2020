package elevens6to9;
/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ElevensBoard();
		System.out.println("Done1");
		CardGameGUI gui = new CardGameGUI(board);
		System.out.println("Done2");
		gui.displayGame();
	}
}
