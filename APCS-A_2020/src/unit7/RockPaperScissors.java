package unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private char playChoice;
	private char compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
		playChoice = player.charAt(0);
		if(playChoice == 'R' || playChoice == 'P' || playChoice == 'S') {
			
		} else {
			System.out.println("bruh thats not a valid choice");
		}
	}

	public void setPlayers(String player)
	{
	}

	public String determineWinner()
	{
		System.out.println("Your choice is... " + playChoice + ".");
		int comp123 = (int) (Math.random()*3);
		if(comp123 == 0) {
			compChoice = 'R';
		} else if(comp123 == 1) {
			compChoice = 'P';
		} else {
			compChoice = 'S';
		}
		System.out.println("The computer's choice is... " + compChoice + ".");
		String winner="The winner is... ";
		if(playChoice == 'R') {
			if(compChoice == 'P') {
				winner = winner.concat(" the computer. Paper beats Rock.");
			} else if(compChoice == 'S') {
				winner = winner.concat(" you! Rock beats Scissors.");
			} else {
				winner = "It's a draw!";
			}
		} else if(playChoice == 'S') {
			if(compChoice == 'R') {
				winner = winner.concat(" the computer. Rock beats Scissors.");
			} else if(compChoice == 'P') {
				winner = winner.concat(" you! Scissors beats Paper.");
			} else {
				winner = "It's a draw!";
			}
		} else {
			if(compChoice == 'S') {
				winner = winner.concat(" the computer. Scissors beats Paper.");
			} else if(compChoice == 'R') {
				winner = winner.concat(" you! Paper bests Rock.");
			} else {
				winner = "It's a draw!";
			}
		}
		winner = winner.concat("\n");
		return winner;
	}

	public String toString()
	{
		String output=this.determineWinner();
		return output;
	}
}