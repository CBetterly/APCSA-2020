package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd(int passedNum)
	{
		if (passedNum%2 == 1 || passedNum%2 == -1)
			return true;
		return false;
	}
	public static boolean isEven(int passedNum)
	{
		if (passedNum%2 == 0)
			return true;
		return false;
	}
}