package unit7;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive {
	private char letter;
	private int amount;

	public TriangleFive() {
		letter = 'A';
		amount = 5;
	}

	public TriangleFive(char c, int amt) {
		letter = c;
		amount = amt;
		printTriangle();
	}

	public void setLetter(char c) {
		letter = c;
	}

	public void setAmount(int amt) {
		amount = amt;
	}

	public void printTriangle() {
		int amt = amount;
		int amount2 = amount;
		char ltr = letter;
		int numRuns = amount;
		for (int index = 0; index < numRuns; index++) {
			//System.out.print(" Ran once ");
			// for each letterGroup
			for (int i = 0; i < amount2; i++) {

				for (int j = 0; j < amt; j++) {
					System.out.print(ltr);
				}
				amt--;
				ltr++;
				if (ltr == '[') {
					ltr = 'A';
				}
				System.out.print(" ");
			}
			System.out.println();
			amt = amount;
			amount2--;
			ltr = letter;
			
		}
	}

	public String toString() {
		String output = "";
		return output;
	}
}