package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand_210310_01 implements PHand {
	
	BJDeck hand = new BJDeck();

	/** Returns the number of cards in the hand. */
	@Override
	public int getSize() {
		return hand.cards.size();
	}// end of getSize()

	/** Adds a card to the end of the hand. */
	@Override
	public void addCard(PCard card) {
		hand.cards.add((BJCard) card);
	}// end of addCard

	/** Returns a card from the hand (but not removed). */
	@Override
	public PCard getCard(int index) {
		hand.cards.get(index);
		if(index >= 0 && index < hand.cards.size()) {
			return hand.cards.get(index);
		} else {
			return null;
		}
	}// end of getCard

	/** Removes and returns the card */
	@Override
	public PCard removeCard(int index) {
		if(index >= 0 && index < hand.cards.size()) {
			hand.cards.get(index);
		} 
		return null;
	}// end of removeCard

	@Override
	public int getValue() {
		int sum = 0;
		
		if(BJCard.TWO == 2) {
			sum = 2;
			return 2;
		} 
		if (BJCard.THREE == 3) {
			sum = 3;
			return 3;
		}  
		if (BJCard.FOUR == 4) {
			sum = 4;
			return 4;
		}  
		if (BJCard.FIVE == 5) {
			sum = 5;
			return 5;
		}  
		if (BJCard.SIX == 6) {
			sum = 6;
			return 6;
		}  
		if (BJCard.SEVEN == 7) {
			sum = 7;
			return 7;
		}  
		if (BJCard.EIGHT == 8) {
			sum = 8;
			return 8;
		}  
		if (BJCard.NINE == 9) {
			sum = 9;
			return 9;
		}
		if (BJCard.TEN == 10) {
			sum = 10;
			return 10;
		}
		if (BJCard.JACK == 10) {
			sum = 10;
			return 10;
		}
		
		if (BJCard.KNIGHT == 10) {
			sum = 10;
			return 10;
		}
		
		if (BJCard.QUEEN == 10) {
			sum = 10;
			return 10;
		}
		
		if (BJCard.KING == 10) {
			sum = 10;
			return 10;
		}
		
		if (BJCard.ACE == 1) {
			sum = 11;
			return 10;
		}
		return sum;
		
	}// end of getValue();

}// end of Class
