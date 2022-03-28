package BlackJack;

import java.util.ArrayList;

import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand implements PHand {
	
	//Attributes
	ArrayList<BJCard> hand;
	
	//Constructor
	public BJHand() {
		hand = new ArrayList<BJCard>();
	}// end BJHand()
	
	

	/** Returns the number of cards in the hand. */
	@Override
	public int getSize() {
		return hand.size();
	}// end of getSize()

	
	/** Adds a card to the end of the hand. */
	@Override
	public void addCard(PCard card) {
		hand.add((BJCard) card);		
	}// end of addCard

	
	/** Returns a card from the hand (but not removed). */
	@Override
	public PCard getCard(int index) {
		return hand.get(index);
	}// end of getCard

	
	/** Removes and returns the card */
	@Override
	public PCard removeCard(int index) {
		return hand.remove(index);
	}// end of removeCard

	
	@Override
	public int getValue() {
		int score = 0;
			
		for (BJCard card : hand) {
			if(card.getRank() == BJCard.ACE){
				score += 11;
				if (score > 21) score -= 10;
			} else if (card.getRank() >= BJCard.JACK) {
				score += 10;
			} else {
				score += card.getRank();
			}
		}
		
		return score;
		
	}// end of getValue();
	

}// end of Class
