package unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord {
	// instance variables and constructors could be present, but are not necessary

	public static void printTriangle(String word) {
		char[] bruh = word.toCharArray();
		System.out.println();
		System.out.println(bruh[0]);
		for (int j = 1; j < bruh.length; j++) {
			for (int i = 0; i < j; i++) {
				for (int k = 0; k <= j; k++) {
					System.out.print(bruh[k]);
				}
			}
			System.out.println();
		}

	}
}