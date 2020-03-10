package unit10;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore13 {
	private ArrayList<Toy> toyList;

	public ToyStore13() {
		toyList = new ArrayList<Toy>();
	}

	public void loadToys(String toys) {
		String[] toysArray = toys.split(" ");
		for (String boi : toysArray) {
			Toy toy = getThatToy(boi);
			if (toy != null) {
				toy.setCount(toy.getCount() + 1);
			} else {
				toyList.add(new Toy(boi));
			}
		}
		sortToysByCount();
		/*
		 * for(int i = 0; i < toys.length(); i++) { toyList.add(new
		 * Toy(toys.substring(i,toys.indexOf(" ", i+1)))); System.out.println(toyList);
		 * }
		 */
	}

	public Toy getThatToy(String nm) {
		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getName().equals(nm))
				return toyList.get(i);
		}
		return null;
	}

	public String getMostFrequentToy() {
		int mostFreq = 0;
		String mostName = "";
		for (int i = 0; i < toyList.size(); i++) {
			if (toyList.get(i).getCount() > mostFreq) {
				mostFreq = toyList.get(i).getCount();
				mostName = toyList.get(i).getName();
			}
		}
		return mostName;
	}

	public void sortToysByCount() {
		ArrayList<Toy> sortedToys = new ArrayList<Toy>();
		while (toyList.size() > 0) {
			Toy mostToy = getThatToy(getMostFrequentToy());
			toyList.remove(mostToy);
			sortedToys.add(mostToy);
		}
		toyList = sortedToys;
	}

	public void myName() {// made void return type because it was indicated that it was wanted printed in
							// the method
		System.out.println("Connor Betterly");
	}

	public String toString() {
		return toyList.toString();
	}
}