package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality bruh = new StringEquality();
		bruh.setWords("hello","goodbye");
		//bruh.checkEquality();
		System.out.println(bruh);
		
		StringEquality thanos = new StringEquality();
		thanos.setWords("one","two");
		//bruh.checkEquality();
		System.out.println(thanos);
		
		StringEquality one = new StringEquality();
		one.setWords("three","four");
		//bruh.checkEquality();
		System.out.println(one);
		
		StringEquality two = new StringEquality();
		two.setWords("TCEA","UIL");
		//bruh.checkEquality();
		System.out.println(two);
		
		StringEquality three = new StringEquality();
		three.setWords("State","Champions");
		//bruh.checkEquality();
		System.out.println(three);
		
		StringEquality four = new StringEquality();
		four.setWords("ABC","ABC");
		//bruh.checkEquality();
		System.out.println(four);
		
		StringEquality five = new StringEquality();
		five.setWords("ABC","CBA");
		//bruh.checkEquality();
		System.out.println(five);
		
		StringEquality six = new StringEquality();
		six.setWords("Same","Same");
		//bruh.checkEquality();
		System.out.println(six);
	}
}