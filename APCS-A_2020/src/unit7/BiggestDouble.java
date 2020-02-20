package unit7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble {
	private double one, two, three, four;

	public BiggestDouble() {
		this(0, 0, 0, 0);
	}

	public BiggestDouble(double a, double b, double c, double d) {
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d) {
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest() {
		double biggest = one;

		if (two > one) {
			if (two > three) {
				if (two > four) {
					return two;
				}
				return four;
			}
			if (two > four) {
				return two;
			}
			return four;
		}
		else if(three>one) {
			if(four>three) {
				return four;
			}
			return three;
		}
		else if(four>one) {
			return four;
		}

		return biggest;
	}

	public String toString() {
		return one + "  " + two + "  " + three + "  " + four;
	}
}