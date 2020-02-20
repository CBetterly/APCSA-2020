package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String stringResponse = "";
		char response;
		boolean wantsToPlay = true;
		
		//add in a do while loop after you get the basics up and running
		while(wantsToPlay) {		
			System.out.print("Choose Rock, Paper, or Scissors. [R,P,S] :: ");
			
			stringResponse = keyboard.nextLine();
			stringResponse = stringResponse.toUpperCase();
			try {
			response = stringResponse.charAt(0);
			RockPaperScissors game = new RockPaperScissors(stringResponse);
			System.out.println(game);
			} catch(Exception e) {
				System.out.println("You cannot choose no weapon as your weapon!\nTry R, P, or S.");
			}
			System.out.println("Would you like to play again? [Y/N]");
			String response2 = keyboard.nextLine().toUpperCase();
			if(response2.equals("Y") || response2.equals("YES")) {
				wantsToPlay = true;
				System.out.println();
			} else {
				wantsToPlay = false;
			}
		}
			
			System.out.println("Thanks for playing!");
	}
}



