package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore13 asdf = new ToyStore13();
		asdf.myName();
		asdf.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(asdf);
		System.out.println( "Most Frequent: " + asdf.getMostFrequentToy() );	
	}
}