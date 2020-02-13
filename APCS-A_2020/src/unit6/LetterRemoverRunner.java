package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover one = new LetterRemover("I am Sam I am    a");
		LetterRemover two = new LetterRemover("ssssssssxssssesssssesss    s");
		LetterRemover three = new LetterRemover("qwertyqwertyqwerty    a");
		LetterRemover four = new LetterRemover("abababababa    b");
		LetterRemover five = new LetterRemover("abaababababa    x");
	}
}