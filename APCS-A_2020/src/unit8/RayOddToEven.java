package unit8;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven {
	public static int distBetween(int[] arr) {
		int oddIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				oddIndex = i;
				break;
			}
		}

		if (oddIndex == -1) {
			return oddIndex;
		}

		for (int i = oddIndex; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				return i - oddIndex;
			}
		}
		return -1;
	}

	public static boolean go(int[] ray) {
		return false;
	}
}