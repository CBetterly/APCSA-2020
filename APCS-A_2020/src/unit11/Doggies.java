package unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies {
	private Dog[] pups;

	public Doggies(int size) {
		// point pups at a new arry of Dog
		pups = new Dog[size];

	}

	public void set(int spot, int age, String name) {
		// put a new Dog in the array at spot
		// make sure spot is in bounds
		try {
			pups[spot] = new Dog(age, name);
		} catch (Exception e) {
			System.out.println("Failed to put the dog in the pups array.");
		}
	}

	public String getNameOfOldest() {
		Dog oldest = pups[0];
		for(Dog goodBoi: pups) {
			if(goodBoi.getAge() > oldest.getAge()) {
				oldest = goodBoi;
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest() {
		Dog youngest = pups[0];
		for(Dog goodBoi: pups) {
			if(goodBoi.getAge() < youngest.getAge()) {
				youngest = goodBoi;
			}
		}
		return youngest.getName();
	}

	public String toString() {
		return "" + Arrays.toString(pups);
	}
}