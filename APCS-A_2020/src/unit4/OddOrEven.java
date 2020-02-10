package unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class OddOrEven
{//Instructions unclear; did this program when the actual one is NumberVerify
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
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a whole number :: ");
		int num1 = keyboard.nextInt();
		System.out.println(num1 + " is odd :: " + isOdd(num1));
		System.out.println(num1 + " is even :: " + isEven(num1));
		
		System.out.println("\nEnter a whole number :: ");
		int num2 = keyboard.nextInt();
		System.out.println(num2 + " is odd :: " + isOdd(num2));
		System.out.println(num2 + " is even :: " + isEven(num2));
		
		System.out.println("\nEnter a whole number :: ");
		int num3 = keyboard.nextInt();
		System.out.println(num3 + " is odd :: " + isOdd(num3));
		System.out.println(num3 + " is even :: " + isEven(num3));
		
		System.out.println("\nEnter a whole number :: ");
		int num4 = keyboard.nextInt();
		System.out.println(num4 + " is odd :: " + isOdd(num4));
		System.out.println(num4 + " is even :: " + isEven(num4));
		
		System.out.println("\nEnter a whole number :: ");
		int num5 = keyboard.nextInt();
		System.out.println(num5 + " is odd :: " + isOdd(num5));
		System.out.println(num5 + " is even :: " + isEven(num5));
			
	}
}