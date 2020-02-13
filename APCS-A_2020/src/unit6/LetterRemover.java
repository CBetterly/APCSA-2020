package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}

	public LetterRemover(String passedString) {
		sentence = passedString.substring(0, passedString.length()-4);
		lookFor = passedString.charAt(passedString.length()-1);
		System.out.println(sentence + "- letter to remove " + lookFor + "\n" + this.removeLetters() + "\n");
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		//System.out.println("boutta clean");
		String cleaned="";
		while (sentence.indexOf(lookFor)!=-1) {
			//cleaned = 
					//System.out.println(sentence.substring(0,sentence.indexOf(lookFor)).concat(sentence.substring(sentence.indexOf(lookFor)+1)));
			//System.out.println("cleaned once");
					sentence = sentence.substring(0,sentence.indexOf(lookFor)).concat(sentence.substring(sentence.indexOf(lookFor)+1));
		}
			
		return sentence;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}