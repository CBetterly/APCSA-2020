package consumerLab;

import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

	private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
	private static ArrayList<String> posAdjectives = new ArrayList<String>();
	private static ArrayList<String> negAdjectives = new ArrayList<String>();

	private static final String SPACE = " ";

	static {
		try {
			Scanner input = new Scanner(new File("src/consumerLab/cleanSentiment.csv"));
			while (input.hasNextLine()) {
				String[] temp = input.nextLine().split(",");
				sentiment.put(temp[0], Double.parseDouble(temp[1]));
				// System.out.println("added "+ temp[0]+", "+temp[1]);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing cleanSentiment.csv");
		}

		// read in the positive adjectives in postiveAdjectives.txt
		try {
			Scanner input = new Scanner(new File("src/consumerLab/positiveAdjectives.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				// System.out.println(temp);
				posAdjectives.add(temp);
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}

		// read in the negative adjectives in negativeAdjectives.txt
		try {
			Scanner input = new Scanner(new File("src/consumerLab/negativeAdjectives.txt"));
			while (input.hasNextLine()) {
				negAdjectives.add(input.nextLine().trim());
			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing negativeAdjectives.txt");
		}
	}

	/**
	 * returns a string containing all of the text in fileName (including
	 * punctuation), with words separated by a single space
	 */
	public static String textToString(String fileName) {
		String temp = "";
		try {
			Scanner input = new Scanner(new File(fileName));

			// add 'words' in the file to the string, separated by a single space
			while (input.hasNext()) {
				temp = temp + input.next() + " ";
			}
			input.close();

		} catch (Exception e) {
			System.out.println("Unable to locate " + fileName);
		}
		// make sure to remove any additional space that may have been added at the end
		// of the string.
		return temp.trim();
	}

	/**
	 * @returns the sentiment value of word as a number between -1 (very negative)
	 *          to 1 (very positive sentiment)
	 */
	public static double sentimentVal(String word) {
		try {
			return sentiment.get(word.toLowerCase());
		} catch (Exception e) {
			return 0;
		}
	}

	/**
	 * Returns the ending punctuation of a string, or the empty string if there is
	 * none
	 */
	public static String getPunctuation(String word) {
		String punc = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			if (!Character.isLetterOrDigit(word.charAt(i))) {
				punc = punc + word.charAt(i);
			} else {
				return punc;
			}
		}
		return punc;
	}

	/**
	 * Randomly picks a positive adjective from the positiveAdjectives.txt file and
	 * returns it.
	 */
	public static String randomPositiveAdj() {
		int index = (int) (Math.random() * posAdjectives.size());
		return posAdjectives.get(index);
	}

	/**
	 * Randomly picks a negative adjective from the negativeAdjectives.txt file and
	 * returns it.
	 */
	public static String randomNegativeAdj() {
		int index = (int) (Math.random() * negAdjectives.size());
		return negAdjectives.get(index);

	}

	/**
	 * Randomly picks a positive or negative adjective and returns it.
	 */
	public static String randomAdjective() {
		boolean positive = Math.random() < .5;
		if (positive) {
			return randomPositiveAdj();
		} else {
			return randomNegativeAdj();
		}
	}

	// OLD METHOD - HAS BEEN UPDATED TO INSTEAD STRENGTHEN THE SENTIMENT OF THE
	// REVIEW
	public static String oldFakeReview(String fileName) {
		String fileContents = textToString(fileName);
		int startString = 0;
		for (int i = 0; i < fileContents.length(); i++) {
			try {
				if (fileContents.charAt(i) == '*') {
					startString = i + 1;

				}
				if (startString > 0) {
					if (fileContents.charAt(i) == ' ') {
						fileContents = fileContents.replaceFirst(fileContents.substring(startString, i),
								randomAdjective());
						startString = 0;
					}
				}
			} catch (Exception e) {
				System.out.println("caught3");
			}
		}

		for (int i = 0; i < fileContents.length(); i++) {
			try {
				if (fileContents.charAt(i) == '*') {
					fileContents = fileContents.substring(startString, i).concat(fileContents.substring(i + 1));
				}
			} catch (Exception e) {
				System.out.println("caught4");
			}
		}

		return fileContents;
	}

	// This method makes reviews more strong.
	public static String fakeReview(String fileName) {
		String fileContents = textToString(fileName);
		// System.out.println("Review Sentiment: " + totalSentiment(fileName));
		int startString = 0;
		int cutoff = 1;
		if (totalSentiment(fileName) > cutoff) {

			for (int i = 0; i < fileContents.length(); i++) {
				try {
					if (fileContents.charAt(i) == '*') {
						startString = i + 1;

					}
					if (startString > 0) {
						if (fileContents.charAt(i) == ' ') {
							if (sentimentVal(fileContents.substring(startString, i)) < 0) {
								fileContents = fileContents.replaceFirst(fileContents.substring(startString, i),
										randomPositiveAdj());
								startString = 0;
							}
						}
					}
				} catch (Exception e) {
					System.out.println("caught1");
				}
			}

			for (int i = 0; i < fileContents.length(); i++) {
				try {
					if (fileContents.charAt(i) == '*') {
						fileContents = fileContents.substring(startString, i).concat(fileContents.substring(i + 1));
					}
				} catch (Exception e) {
					System.out.println("caught2");
				}
			}
		} else if (totalSentiment(fileName) < cutoff) {
			for (int i = 0; i < fileContents.length(); i++) {
				try {
					if (fileContents.charAt(i) == '*') {
						startString = i + 1;

					}
					if (startString > 0) {
						if (fileContents.charAt(i) == ' ') {
							if (sentimentVal(fileContents.substring(startString, i)) > 0) {
								fileContents = fileContents.replaceFirst(fileContents.substring(startString, i),
										randomNegativeAdj());
								startString = 0;
							}
						}
					}
				} catch (Exception e) {
					System.out.println("caught5");
				}
			}
			startString = 0;
			for (int i = 0; i < fileContents.length(); i++) {
				try {
					if (fileContents.charAt(i) == '*') {
						//System.out.println(i);
						fileContents = fileContents.substring(startString, i).concat(fileContents.substring(i + 1));
					}
				} catch (Exception e) {
					System.out.println("caught6");
				}
			}
		}
		return fileContents;
	}

	/**
	 * Activity 2: totalSentiment() Write the code to total up the sentimentVals of
	 * each word in a review.
	 */
	public static double totalSentiment(String filename) {
		// read in the file contents into a string using the textToString method with
		// the filename
		String fileContents = textToString(filename);
		// set up a sentimentTotal variable
		double sentimentTotal = 0.0;
		// System.out.println(fileContents);
		// loop through the file contents
		int startString = 0;
		System.out.println();
		for (int i = 0; i < fileContents.length(); i++) {
			// if (fileContents.charAt(i) == ' ') {
			// sentimentTotal += sentimentVal(fileContents.substring(startString, i));
			try {
				if (fileContents.charAt(i) == ' ' || fileContents.charAt(i) == '.' || fileContents.charAt(i) == '!'
						|| fileContents.charAt(i) == ',' || fileContents.charAt(i) == ':'
						|| fileContents.charAt(i) == '/' || fileContents.charAt(i) == '('
						|| fileContents.charAt(i) == ')' || fileContents.charAt(i) == '*') {
					sentimentTotal += sentimentVal(fileContents.substring(startString, i));
					startString = i + 1;
				}
			} catch (Exception e) {
				// System.out.println("caught!");
			}

		}

		// }
		// find each word
		// add in its sentimentVal
		// set the file contents to start after this word

		return sentimentTotal;
	}

	/**
	 * Activity 2 starRating method Write the starRating method here which returns
	 * the number of stars for the review based on its totalSentiment.
	 */
	public static int starRating(String filename) {
		// call the totalSentiment method with the fileName
		double totalSent = totalSentiment(filename);
		// determine number of stars between 0 and 4 based on totalSentiment value
		int stars = 0;
		// write if statements here
		if (totalSent <= -3.0) {
			stars = 0;
		} else if (totalSent <= -1.0) {
			stars = 1;
		} else if (totalSent <= 0.0) {
			stars = 2;
		} else if (totalSent <= 1.0) {
			stars = 3;
		} else {
			stars = 4;
		}

		// return number of stars

		return stars;
	}
}