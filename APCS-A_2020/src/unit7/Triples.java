package unit7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples {
	private int number;
	private int maxNumber;

	public Triples() {
		this(0);
	}

	public Triples(int num) {
		maxNumber = num;
		this.printTriples();
	}

	private int greatestCommonFactor(int a, int b, int c) {
		int max = 0;

		return 1;
	}

	public void printTriples() {

		int a = 1;
		int b = 1;
		int c = 1;
		double c2 = 1.0;

		// for all possible c values
		//System.out.println("boutta start");
		for (; c <= maxNumber;) {
			//System.out.println("one");
			// for all possible a and b values
			for (; a < maxNumber;) {
				//System.out.println("two " + a + " " + b + " " + c);
				for (; b < maxNumber;) {

					c2 = Math.sqrt((a * a) + (b * b));
					//System.out.println(c2);
					if (c2 > (int) c2) {
						
					} else if((a+b)%2 == 1){
						if (a<b) {/* greatestCommonFactor(a,b,c)<=1 */
							System.out.println(a + "  " + b + "  " + (int)c2);
						}
					}
					b++;
				} b = 1;
				a++;

			}
			break;
		}

	}

	public String toString() {
		String output = "";

		return output + "\n";
	}
}