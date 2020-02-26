package unit9;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven {

	public static int returnDist(ArrayList<Integer> arrayPassed) {
		int firstOdd = -1;
		int lastEven = -1;
		for(int i = 0; i < arrayPassed.size(); i++) {
			if(arrayPassed.get(i) % 2 == 1) {
				firstOdd = i;
				break;
			}
		}
		
		if(firstOdd == -1) {
			return -1;
		}
		
		for(int i = arrayPassed.size()-1; i > 0; i--) {
			if(arrayPassed.get(i) % 2 == 0) {
				lastEven = i;
				break;
			}
		}
		
		if(firstOdd>lastEven) {
			return -1;
		}
			
		
		return lastEven-firstOdd;
	}

	public static boolean go(List<Integer> ray) {
		return false;
	}
}