package elevensLab;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//make a Deck class
public class Deck {

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

	private List<Card> cards;
	private List<Card> createdCards = new ArrayList<Card>();
	private int top;

	// make a Deck constructor
	public Deck() {
		// refer cards to new ArrayList
		// set top to the top of the deck 51
		cards = new ArrayList<Card>();
		top = 0;
		for (int j = 0; j < 4; j++) {
			for (int i = 1; i < Card.FACES.length; i++) {
				cards.add(new Card(SUITS[j], i));
			}
		}
		createdCards = cards;
	}

	public Deck(String[] ranks, String[] suits2, int[] pointValues) {
		cards = new ArrayList<Card>();
		top = 0;
		for (int j = 0; j < suits2.length; j++) {
			for (int i = pointValues[0]; i <= pointValues[pointValues.length-1]; i++) {
				cards.add(new Card(suits2[j], i));
			}
		}
		createdCards.addAll(cards);
	}

	// loop through all suits
	// loop through all faces 1 to 13
	// add a new TwentyOneCard to the deck

	// make a dealCard() method that returns the top card
	public Card dealCard() {
		try {
			Card tempCard = cards.get(top);
			cards.remove(top);
			//top++;
			return tempCard;
		} catch(Exception e) {
			System.out.println("WARNING: Deck ran out, starting again from top with a shuffled version of the original deck");
			
			top = 0;
			cards = createdCards;
			
			/*
			for (int j = 0; j < 4; j++) {
				for (int i = 1; i < Card.FACES.length; i++) {
					cards.add(new Card(SUITS[j], i));
				}
			}
			*/
			shuffle();
			
			Card tempCard = cards.get(top);
			cards.remove(top);
			//top++;
			return tempCard;
		}
	}

	public void resetAfterDeal() {
		top = 0;
	}

	// write a shuffle() method
	// use Colletions.shuffle
	// reset the top card
	public void shuffle() {
		
		Collections.shuffle(cards);
		//cards = Shuffler.cardSelectionShuffle(cards);
	}

	public boolean isEmpty() {
		if (cards.size() == 0) {
			return true;
		}
		return false;
	}
	
	public List<Card> getCards(){
		return cards;
	}

	public int size() {
		try {
			return cards.size();
		} catch (Exception e) {
			return 0;
		}
	}
	
	public String toString() {
		return "This deck has " + cards.size() + " cards.";
	}
}