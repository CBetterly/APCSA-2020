package finalLab;

public class Word {
	private String asString;
	private String partOfSpeech;
	private int length;
	private String origin;

	public Word() {

	}

	public Word(String asString1) {
		asString = asString1;
	}

	public Word(String asString1, String partOfSpeech1, int length1) {
		asString = asString1;
		partOfSpeech = partOfSpeech1;
		length = length1;
	}

	public Word(String asString1, String partOfSpeech1, int length1, String origin1) {
		asString = asString1;
		partOfSpeech = partOfSpeech1;
		length = length1;
		origin = origin1;
	}

	public String getWord() {
		return asString;
	}

	public void setWord(String newWord) {
		asString = newWord;
	}

	public String toString() {
		return asString + " is a " + length + "-letter " + partOfSpeech + " from " + origin + ".";
	}
}//end class
