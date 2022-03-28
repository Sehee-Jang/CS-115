package BlackJack;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

class BJCardTest {

	@Test
	void testHideCard() {
		//BJHand hand = new BJHand();
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		//hand.addCard(card);
		card.hideCard();
		assertTrue(card.hidden);
	}

	@Test
	void testShowCard() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		card.showCard();;
		assertFalse(card.hidden);
	}

	@Test
	void testIsHidden() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		card.hideCard();
		assertTrue(card.isHidden());
	}

	@Test
	void testGetText() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		assertEquals((String.valueOf(4) + String.valueOf("\u2666")), card.getText());
	}

	@Test
	void testGetFontColor() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		assertEquals(Color.red, card.getFontColor());
	}

	@Test
	void testGetBorderColor() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		assertEquals(Color.red, card.getFontColor());
	}

	@Test
	void testBJCard() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
	}

	@Test
	void testGetRank() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		assertEquals(4, card.getRank());
	}

	@Test
	void testSetRank() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		card.setRank(5);
		assertEquals(5, card.getRank());
	}

	@Test
	void testGetSuit() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		assertEquals(3, card.getSuit());
	}

	@Test
	void testSetSuit() {
		BJCard card = new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		card.setSuit(4);
		assertEquals(4, card.getSuit());
	}

}
