package finalLab;

import java.util.ArrayList;

public class Sentence {
	private ArrayList<Word> wordsList;
	private String asString;
	
	public Sentence() {
		wordsList = new ArrayList<Word>();
		wordsList.add(new Word("This"));
		wordsList.add(new Word("is"));
		wordsList.add(new Word("a"));
		wordsList.add(new Word("test","noun",4));
	}
	
	public Sentence(String newSentence) {
		wordsList = new ArrayList<Word>();
		String[] thanos = newSentence.split(" ");
		for(String str:thanos) {
			wordsList.add(new Word(str));
		}
	}
	
	public Sentence(ArrayList<Word> passedSentence) {
		wordsList = new ArrayList<Word>();
		for(Word word:passedSentence) {
			wordsList.add(word);
		}
	}
	
	public String getAsString() {
		return this.toString();
	}
	
	public ArrayList<Word> getWordsList(){
		return wordsList;
	}
	
	public void setWordsList(ArrayList<Word> thanos) {
		wordsList = thanos;
	}
	
	public String toString() {
		asString = "";
		for(Word w:wordsList) {
			asString = asString.concat(w.getWord()).concat(" ");
		}
		return asString;
	}
}//end class
