package unit8;

import java.lang.reflect.Array;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast {
	private int[] arrayBoi;
	private int sum;

	public RaySumLast(int[] passedArray) {
		arrayBoi = passedArray;
		sum = 0;
		System.out.println(this.go(arrayBoi));
	}

	public int go(int[] ray) {
		int last = arrayBoi[arrayBoi.length-1];
		for (int i = 0; i < arrayBoi.length; i++) {
			if(arrayBoi[i]>last) {
				sum+=arrayBoi[i];
			}
		}
		if(sum == 0) {
			return -1;
		}
		return sum;
	}
}