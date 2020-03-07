package unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	// add two instance variables
	private int numerator;
	private int denominator;

	// write two constructors
	public Rational() {
		numerator = 1;
		denominator = 2;
	}

	public Rational(int num, int denom) {
		numerator = num;
		denominator = denom;
	}

	// write a setRational method

	public void setRational(int num, int denom) {
		numerator = num;
		denominator = denom;
	}

	// write a set method for numerator and denominator

	public void add(Rational other) {
		// num1/den1 + num2/den2
		// new numerator = (num1 * den2 + num2 * den1)
		// new denominator = (den1 * den2)

		numerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
		denominator = denominator * other.getDenominator();

		reduce();
	}

	private void reduce() {
		int gcd = gcd(numerator, denominator);
		while (gcd != 1) {
			numerator = numerator/gcd;
			denominator = denominator/gcd;
			gcd = gcd(numerator, denominator);
		}

	}

	private int gcd(int numOne, int numTwo) {

		int gcd = 1;

		for (int i = 1; i <= numOne && i <= numTwo; i++) {
			if (numOne % i == 0 && numTwo % i == 0)
				gcd = i;
		}

		return gcd;
	}

	public Rational clone() {
		return this;
	}

	// ACCESSORS

	// write get methods for numerator and denominator
	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int newNumerator) {
		numerator = newNumerator;
	}

	public void setDenominator(int newDenominator) {
		denominator = newDenominator;
	}

	public boolean equals(Rational obj) {
		if(((double)numerator)/denominator == ((double) obj.getNumerator()/obj.getDenominator())) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other) {
		if(this.equals(other)) {
			return 0;
		}
		if(((double)numerator)/denominator >= ((double) other.getNumerator()/other.getDenominator())) {
			return 1;
		}

		return -1;
	}

	// write toString() method
	public String toString() {
		return numerator + "/" + denominator;
	}

}