package unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner {
	public static void main(String args[]) {
		String choice = "Yes";
		while (choice.toUpperCase().charAt(0) == 'Y') {
			System.out.println("\nEnter a word: ");
			Scanner keyboard = new Scanner(System.in);
			TriangleWord.printTriangle(keyboard.nextLine());
			System.out.println("\nDo you want to enter more sample input?");
			choice = keyboard.nextLine();
		}
	}
}