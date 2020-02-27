package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;

   //make a Deck constructor
	public Deck() {
		//refer cards to new ArrayList
		//set top to the top of the deck 51
		cards = new ArrayList<Card>();
		top = 0;
		for(int j = 0; j<4;j++) {
			for(int i = 1; i < Card.FACES.length; i++) {
				cards.add(new Card(SUITS[j],i));
			}
		}
		
	}
   	
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
	public Card dealCard() {
		
		return cards.get(top++);
	}
	
	public void resetAfterDeal() {
		top = 0;
	}
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 
	public void shuffle() {
		//Shuffler.main(null);
	}
}