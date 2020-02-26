package unit9;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst {

	public static int returnGreaterValues(ArrayList<Integer> arrayPassed) {
		int sum = 0;
		for (int i = 0; i < arrayPassed.size(); i++) {
			if (arrayPassed.get(i) > arrayPassed.get(0)) {
				sum += arrayPassed.get(i);
			}
		}

		if (sum == 0) {
			return -1;
		}
		return sum;
	}

	public static int go(List<Integer> ray) {

		return -1;
	}
}