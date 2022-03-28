package BlackJack;

import java.util.ArrayList;
import java.util.Random;

import BlackJackBase.PCard;
import BlackJackBase.PDeck;

public class BJDeck implements PDeck {

	// Attribute
	ArrayList<BJCard> cards;

	// Constructor
	public BJDeck() {
		
		cards = new ArrayList<BJCard>();

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 15; j++) {
				addCard(new BJCard(j, i));
			}
		}
	}

	@Override
	public void shuffle() {
		Random random = new Random();
		
		for (int i = 0; i < cards.size(); i++) {
			int randIndex = random.nextInt(cards.size());
			BJCard temp = cards.get(i);
			cards.set(i, cards.get(randIndex));
			cards.set(i, cards.get(randIndex));
			cards.set(randIndex, temp);
		}

	}// end of shuffle()

	@Override
	public void addCard(PCard card) {
		cards.add((BJCard) card);
	}// end of addCard()

	@Override
	public PCard dealCard() {		
		if(cards.isEmpty()) {
			return null;
		} else {
			return cards.remove(0);
		}
	}// end of dealCard()

	@Override
	public PCard dealHiddenCard() {
		if(cards.isEmpty()) {
			return null;
		} else{
			//boolean hidden = true;
			PCard card = cards.remove(0);
			card.hideCard();
			return card;
		}	
	}// end of dealHiddenCard()

 
	@Override
	public int cardCount() {
		return cards.size();
	}// end of cardCount()

}
