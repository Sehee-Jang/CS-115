package BlackJack;
import java.awt.Color;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJCard_210312 extends PCard  {

	int rank;
	int suit;
	boolean hidden;

	public static final int ACE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 11;
	public static final int KNIGHT = 12;
	public static final int QUEEN = 13;
	public static final int KING = 14;

	public static final int SPADE = 1;
	public static final int HEART = 2;
	public static final int DIAMOND = 3;
	public static final int CLUB = 4;

	public BJCard_210312(int rank, int suit) {
		hidden = false;
		this.rank = rank;
		this.suit = suit;
	}// end of public BJCARD

	public int getRank() {
		return rank;

	}// end of getRank()

	public void setRank(int rank) {
		this.rank = rank;

	}// end of setRank()

	public int getSuit() {
		return suit;

	}// end of getSuit()

	public void setSuit(int suit) {
		this.suit = suit;

	}// end of setSuit()

	public void hideCard() {
		hidden = true;
	}// end of hideCard()

	public void showCard() {
		hidden = false;
	}// end of showCard()

	public boolean isHidden() {
		return hidden;
		
	}// end of isHidden()

	public String getText() {
		String nameRank = "";
		String nameSuit= "";
		if(this.rank == 1) {
			nameRank = "A";
		}else if(this.rank == 2) {
			nameRank = "" + this.rank;
		}else if(this.rank == 3) {
			nameRank = ""+ this.rank;
		}else if(this.rank == 4) {
			nameRank = "" + this.rank;
		}else if(this.rank == 5) {
			nameRank = "" + this.rank;
		}else if(this.rank == 6) {
			nameRank = "" + this.rank;
		}else if(this.rank == 7) {
			nameRank = "" + this.rank;
		}else if(this.rank == 8) {
			nameRank = "" + this.rank;
		}else if(this.rank == 9) {
			nameRank = ""+ this.rank;
		}else if(this.rank == 10) {
			nameRank = ""+this.rank;
		}else if(this.rank == 11) {
			nameRank = "J";
		}else if(this.rank == 12) {
			nameRank = "Kn";
		}else if(this.rank == 13) {
			nameRank = "Q";
		}else if(this.rank == 14) {
			nameRank = "K";
		}// end of else 
		
		if(this.suit == 1) {
			nameSuit = "\u2660"; // SPADE
		}else if(this.suit == 2){
			nameSuit = "\u2665"; // HEART
		}else if(this.suit == 3) {
			nameSuit = "\u2666"; // DIAMOND
		}else if(this.suit == 4) {
			nameSuit = "\u2663"; // SPADE
		}
		
		return String.valueOf(nameRank) + String.valueOf(nameSuit);

	}// end of getText()
	
	public Color getFontColor() {
		if(this.suit == 1) {
			return Color.black;	// SPADE
		} else if(this.suit == 2) {
			return Color.red;  	// HEART
		} else if(this.suit == 3) {
			return Color.red;  	// DIAMOND
		} else {
			return Color.black;
		}		
	}// end of getFontColor()
	
	public Color getBorderColor() {
		if(this.suit == 1) {
			return Color.black;
		} else if(this.suit == 2) {
			return Color.red;
		} else if(this.suit == 3) {
			return Color.red;
		} else {
			return Color.black;
		}	
	}// end of getBorderColor()

	
}// end of BJ Card Class
