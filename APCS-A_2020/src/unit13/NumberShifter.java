package unit13;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter {
	public static int[] makeLucky7Array(int size) {
		return null;
	}

	public static void shiftEm(int[] array) {

	}

	public static int[] doEverything(int[] passedArray) {
		boolean notSorted = true;
		int sevenCount = 0;
		for(int i: passedArray) {
			if(i == 7) {
				sevenCount++;
			}
		}
		
		int numSevens = 0;
		while (notSorted) {
			for(int i = 0; i < sevenCount; i++) {
				if(passedArray[i] != 7) {
					break;
				} else {
					numSevens++;
				}
			}
			//System.out.println("numSevens: " + numSevens + "          sevenCount: " + sevenCount);
			if(numSevens == sevenCount) {
				
				notSorted = false;
				break;
			}
			
			for (int i = numSevens; i < passedArray.length; i++) {
				if (passedArray[i] == 7) {
					passedArray[i] = passedArray[numSevens];
					passedArray[numSevens] = 7;
					//System.out.println(i);
					break;
				}
			}
			numSevens = 0;
			//System.out.println(Arrays.toString(passedArray));
			
		}
		return passedArray;
	}// end doEverything()

}// end NumberShifter class