package unit13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter {
	// instance variables and other methods not shown

	private static int getNumDigits(int number) {
		int count = 0;
		return count;
	}

	public static int[] getSortedDigitArray(int number) {
		int[] sorted = null;
		return sorted;
	}

	public static int[] doEverything(int number) {
		int[] key = new int[0];
		int[] temp = new int[0];
		while (number >= 1) {
			temp = new int[key.length];
			for (int i = 0; i < key.length; i++) {
				temp[i] = key[i];
			}
			key = new int[key.length + 1];
			for (int i = 0; i < temp.length; i++) {
				key[i] = temp[i];
			}
			key[key.length - 1] = number % 10;
			number = number / 10;
		}
		// System.out.println(Arrays.toString(key));

		int lowest = Integer.MAX_VALUE;
		boolean unsorted = true;
		int sortedIndex = 0;
		int tempIndex = 0;
		int temporaryInt = 0;
		while (unsorted) {
			lowest = Integer.MAX_VALUE;
			for (int i = sortedIndex; i < key.length; i++) {
				if (key[i] < lowest) {
					lowest = key[i];
					tempIndex = i;
				}
			}
			//System.out.println(Arrays.toString(key));
			try {
				temporaryInt = key[sortedIndex];
				key[sortedIndex] = key[tempIndex];
				key[tempIndex] = temporaryInt;
				sortedIndex++;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Uhoh, big error!" + sortedIndex);
			}
			
			unsorted = false;
			for(int j = 1; j < key.length ; j++) {
				if(key[j]<key[j-1]) {
					unsorted = true;
					break;
				}
			}

		}
		return key;
	}
}