package finalLab;

import java.util.ArrayList;

public class FinalRunner {
	private static ArrayList<Poem> allPoems;

	public static void main(String[] args) {
		allPoems = new ArrayList<Poem>();
		Sentence testSentence = new Sentence();
		Sentence qbf = new Sentence("The quick brown fox jumps over the lazy dog.");
		System.out.println(testSentence);
		System.out.println(qbf);

		String[] array = { "Haikus are easy", "But sometimes they don't make sense.", "Refrigerator" };
		Poem haiku = new Poem(array, "Rolf Nelson");
		allPoems.add(haiku);
		System.out.println("\n" + haiku);

		sortSentence(testSentence);
		System.out.println(testSentence);

		System.out.println();

		sortPoem(haiku);
		System.out.println(haiku);

		String[] array2 = { "Shall I compare thee to a summer's day?", "Thou art more lovely and more temperate.",
				"Rough winds do shake the darling buds of May,", "And Summer's lease hath all too short a date.",
				"Sometimes too hot the eye of heaven shines", "And often is his gold complexion dimmed,",
				"And every fair from fair sometime declines,", "By chance, or nature's changing course, untrimmed.",
				"But thy eternal Summer shall not fade,", "Nor loose possession of that fair thou owest,",
				"Nor shall Death brag thou wanderest in his shade,", "When in eternal lines to time thou growest.",
				"So long as men can breathe or eyes can see,", "So long lives this, and this gives life to thee." };
		Poem sonnet = new Poem(array2, "William Shakespeare");
		allPoems.add(sonnet);
		System.out.println("\n" + sonnet);
		sortPoem(sonnet);
		System.out.println(sonnet);
	}//end main()

	public static void sortSentence(Sentence sent) {
		ArrayList<Word> newList = new ArrayList<Word>();
		ArrayList<Word> oldList = sent.getWordsList();
		// describing these as "shortest" is inaccurate; they are alphabetically first.
		Word shortestWord = oldList.get(0);
		int shortestIndex = 0;
		while (oldList.size() > 1) {
			shortestWord = oldList.get(0);
			shortestIndex = 0;
			for (int i = 1; i < oldList.size(); i++) {

				if (oldList.get(i).getWord().compareToIgnoreCase(shortestWord.getWord()) < 0) {
					shortestWord = oldList.get(i);
					shortestIndex = i;
				}
			}
			// System.out.println("adding " + shortestWord.getWord() + " index " +
			// shortestIndex);
			newList.add(shortestWord);
			oldList.remove(shortestIndex);
		}
		newList.add(oldList.get(0));
		sent.setWordsList(newList);
		// return new Sentence(newList);
	}//end sortSentence()

	public static void sortPoem(Poem poem) {
		for (Sentence sent : poem.getLines()) {
			sortSentence(sent);
		}
		ArrayList<Sentence> newList = new ArrayList<Sentence>();
		ArrayList<Sentence> oldList = poem.getLines();
		// describing these as "shortest" is inaccurate; they are alphabetically first.
		Sentence shortestSent = oldList.get(0);
		int shortestIndex = 0;

		while (oldList.size() > 1) {
			shortestSent = oldList.get(0);
			shortestIndex = 0;
			for (int i = 1; i < oldList.size(); i++) {
				if (oldList.get(i).getAsString().compareToIgnoreCase(shortestSent.getAsString()) < 0) {

					shortestSent = oldList.get(i);
					shortestIndex = i;
				}
			}
			newList.add(shortestSent);
			oldList.remove(shortestIndex);
		}
		newList.add(oldList.get(0));
		poem.setLines(newList);
	}//end sortPoem()
}//end class
