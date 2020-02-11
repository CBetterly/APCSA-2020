package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		WordsCompare bruh = new WordsCompare();
		bruh.setWords("abe", "ape");
		System.out.println(bruh);
		
		WordsCompare asdf = new WordsCompare();
		asdf.setWords("giraffe", "gorilla");
		System.out.println(asdf);
		
		WordsCompare qq = new WordsCompare();
		qq.setWords("one", "two");
		System.out.println(qq);
		
		WordsCompare zxcv = new WordsCompare();
		zxcv.setWords("fun", "funny");
		System.out.println(zxcv);
		
		WordsCompare qwer = new WordsCompare();
		qwer.setWords("123", "19");
		System.out.println(qwer);
		
		WordsCompare wert = new WordsCompare();
		wert.setWords("193", "1910");
		System.out.println(wert);
		
		WordsCompare fiat = new WordsCompare();
		fiat.setWords("goofy", "godfather");
		System.out.println(fiat);
		
		WordsCompare luminosa = new WordsCompare();
		luminosa.setWords("funnel", "fun");
		System.out.println(luminosa);
		

	}
}