package unit7;
//(c) A+ Computer Science

// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner {
	public static void main(String args[])
   {
	   System.out.println("Which integer number do you want b to go up to?");
	   Scanner keyboard = new Scanner(System.in);
	   int max = 0;
	   try {
		   max = keyboard.nextInt();
	   } catch(Exception e) {
		   System.out.println("Not a valid integer, defaulting to 50.\n");
		   max = 50;
	   }
	   
	   //System.out.println(max);
	   Triples alpha = new Triples(max);
	   
	   keyboard.close();
   }
}