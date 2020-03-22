package dataLab;

import java.util.ArrayList;

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

	public static void main(String[] args) {
		Cereal one = new Cereal();
		Cereal two = new Cereal("Two",2,2.5f,65.42354);
		System.out.println(one);
		System.out.println(two);
		ArrayList<Cereal> cerealsArray = new ArrayList<Cereal>();
		cerealsArray.add(one);
		cerealsArray.add(two);
		System.out.println("The best cereal for a high-Carb, low protein diet is: " + carbProtein(cerealsArray));
	}
	
	public static Cereal carbProtein(ArrayList<Cereal> cereals) {
		Cereal bestCereal = cereals.get(0);
		for(int i = 1; i < cereals.size(); i++) {
			if(cereals.get(i).getProtein()-cereals.get(i).getCarbohydrates() >= bestCereal.getProtein()-bestCereal.getCarbohydrates()) {
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
		return name + " has " + protein + " grams of protein, " + carbohydrates + " grams of carbohydrates, and a rating of " + rating + ".";
	}
}
