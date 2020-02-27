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
		//private String rank;

  	//constructors
		public Card() {
			suit = "SPADES";
			face = 1;
		}
		
		public Card(String startSuit, int startFace) {
			suit = startSuit;
			face = startFace;
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


  	//toString
		
		public String toString() {
			return FACES[face] + " of " + suit;
		}

 }