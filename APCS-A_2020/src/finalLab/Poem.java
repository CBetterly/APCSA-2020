package finalLab;

import java.util.ArrayList;

public class Poem {
	private String author;
	private ArrayList<Sentence> lines;
	
	public Poem() {
		lines = new ArrayList<Sentence>();
		author = "Test Author";
	}
	
	public Poem(String[] poem) {
		lines = new ArrayList<Sentence>();
		for(String str:poem) {
			lines.add(new Sentence(str));
		}
	}
	
	public Poem(String[] poem, String author1) {
		author = author1;
		lines = new ArrayList<Sentence>();
		for(String str:poem) {
			lines.add(new Sentence(str));
		}
	}
	
	public ArrayList<Sentence> getLines() {
		return lines;
	}
	
	public void setLines(ArrayList<Sentence> passedList) {
		lines = passedList;
	}
	
	public String toString() {
		String returnString = author + ":\n";
		for(Sentence sent:lines) {
			returnString = returnString + sent + "\n";
		}
		return returnString;
	}
}//end class
