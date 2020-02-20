package consumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		System.out.println(Review.sentimentVal("epic"));
		System.out.println(Review.sentimentVal("cheese"));
		System.out.println(Review.sentimentVal("elevated"));
		// System.out.println(Review.sentimentVal(38));
		System.out.println(String.format("%.4f", Review.totalSentiment("src/consumerLab/simpleReview.txt")));
		System.out
				.println("This review gives... " + Review.starRating("src/consumerLab/simpleReview.txt") + " star(s)!");
		System.out.println(String.format("%.4f", Review.totalSentiment("src/consumerLab/26WestReview.txt")));
		System.out
				.println("This review gives... " + Review.starRating("src/consumerLab/26WestReview.txt") + " star(s)!");
		
		System.out.println(Review.fakeReview("src/consumerLab/simpleReview.txt"));
		
		//for git
		/*
		 * try { Scanner input = new Scanner(new
		 * File("src/consumerLab/positiveAdjectives.txt")); while (input.hasNextLine())
		 * { String temp = input.nextLine().trim(); System.out.println(temp);
		 * 
		 * } input.close(); } catch (Exception e) {
		 * System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		 * }
		 */
	}
}