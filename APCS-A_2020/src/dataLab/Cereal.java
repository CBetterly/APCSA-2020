package dataLab;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cereal {

	private String name;
	private int protein;
	private float carbohydrates;
	private double rating;

	public Cereal() {

	}

	public Cereal(String newName, int newProtein, float newCarbs, double newRating) {
		name = newName;
		protein = newProtein;
		carbohydrates = newCarbs;
		rating = newRating;
	}

	public Cereal(String newName, int newProtein, float newCarbs) {
		name = newName;
		protein = newProtein;
		carbohydrates = newCarbs;
	}

	public static void main(String[] args) {

		ArrayList<Cereal> cerealsArray = new ArrayList<Cereal>();
		/*
		 * Cereal bran100 = new Cereal("100% Bran",4,5.0f); Cereal bran100natural = new
		 * Cereal("100% Natural Bran",4,5.0f); Cereal allBran = new
		 * Cereal("All-Bran",4,5.0f); Cereal allBranFiber = new
		 * Cereal("All-Bran with Extra Fiber",4,5.0f); Cereal almondDelight = new
		 * Cereal("Almond Delight",4,5.0f); Cereal appleCheerios = new
		 * Cereal("	Apple Cinnamon Cheerios",4,5.0f); Cereal appleJacks = new
		 * Cereal("Apple Jacks",4,5.0f); Cereal basic4 = new Cereal("Basic 4",4,5.0f);
		 * Cereal branChex = new Cereal("Bran Chex",4,5.0f); Cereal BranFlakes = new
		 * Cereal("Bran Flakes",4,5.0f); Cereal capnCrunch = new
		 * Cereal("Cap'n'Crunch",4,5.0f); Cereal cheerios = new
		 * Cereal("Cheerios",4,5.0f); Cereal cinnamonToastCrunch = new
		 * Cereal("Cinnamon Toast Crunch",4,5.0f); Cereal clusters = new
		 * Cereal("Clusters",4,5.0f); Cereal cocoPuffs = new Cereal("Corn Chex",4,5.0f);
		 * Cereal cornChex = new Cereal("100% Natural Bran",4,5.0f); Cereal cornFlakes =
		 * new Cereal("100% Natural Bran",4,5.0f); Cereal cornPops = new
		 * Cereal("100% Natural Bran",4,5.0f); Cereal countChoc = new
		 * Cereal("100% Natural Bran",4,5.0f); Cereal cracklOatBran = new
		 * Cereal("100% Natural Bran",4,5.0f); Cereal creamOfWheat = new
		 * Cereal("100% Natural Bran",4,5.0f);
		 */

		try {
			Scanner input = new Scanner(new File("src/dataLab/cereal.csv"));

			while (input.hasNextLine()) {
				input.nextLine();
				String[] temp = input.nextLine().split(",");
				cerealsArray.add(new Cereal(temp[0], Integer.parseInt(temp[4]), Float.parseFloat(temp[8])));
				// System.out.println(temp);
			}
		} catch (Exception e) {
			System.out.println("the CSV failed.");
		}
		for (Cereal cer : cerealsArray) {
			System.out.println(cer);
		}

		Cereal best = cerealsArray.get(0);
		for (int i = 1; i < cerealsArray.size(); i++) {
			if (cerealsArray.get(i).getProtein() - cerealsArray.get(i).getCarbohydrates() > best.getProtein()
					- best.getCarbohydrates()) {
				best = cerealsArray.get(i);
			}
		}
		System.out.println("\nThe best cereal for a low-carb, high-protein diet is " + best.getName() + ", with "
				+ best.getProtein() + " grams of protein per serving and only " + best.getCarbohydrates()
				+ " grams of complex carbohydrates per serving.");

	}// end main()

	public static Cereal carbProtein(ArrayList<Cereal> cereals) {
		Cereal bestCereal = cereals.get(0);
		for (int i = 1; i < cereals.size(); i++) {
			if (cereals.get(i).getProtein() - cereals.get(i).getCarbohydrates() >= bestCereal.getProtein()
					- bestCereal.getCarbohydrates()) {
				bestCereal = cereals.get(i);
			}
		}
		return bestCereal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public float getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(float carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String toString() {
		return name + " has " + protein + " grams of protein, " + carbohydrates
				+ " grams of carbohydrates, and a rating of " + rating + ".";
	}
}
