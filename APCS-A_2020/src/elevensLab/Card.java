package elevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		private String suit;
		private int face;
		//private int pointValue;
		private String rank;

  	//constructors
		public Card() {
			suit = "SPADES";
			face = 1;
		}
		
		public Card(String startSuit, int passedInt) {
			suit = startSuit.toUpperCase();
			face = passedInt;
		}
		
		public Card(String startRank, String startSuit, int passedInt) {
			suit = startSuit.toUpperCase();
			rank = FACES[passedInt];
			face = passedInt;
		}
		
		public boolean matches(Card passedCard) {
			if(this.suit.equals(passedCard.getSuit()) && this.face == passedCard.getFace()) {
				return true;
			}
			return false;
		}
		


	// modifiers
		//set methods
		
		

		public void setFace(int passedFace) {
			face = passedFace;
		}
		
		public void setSuit(String passedSuit) {
			suit = passedSuit;
		}
		
		
		
		


  	//accessors
		//get methods
		
		public int getFace() {
			return face;
		}
		
		public String getSuit() {
			return suit;
		}
		
		public String suit() {
			return suit;
		}
		
		public String rank() {
			return rank;
		}
		
		public int pointValue() {
			return face;
		}


  	//toString
		
		public String toString() {
			return FACES[face] + " of " + suit;
		}

 }