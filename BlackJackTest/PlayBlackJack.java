package BlackJackTest;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;

import BlackJack.BJCard;
import BlackJack.BJDeck;
import BlackJack.BJHand;
import BlackJackBase.PGame;

public class PlayBlackJack{

	public static void main(String[] args) {
		
		/*Lab 8a*/
		//Contains a single method, main()
		//Main() contains the code that calls the run method in the CardTest class.
		//BJCard myGame =  new BJCard(BJCard.FOUR, BJCard.DIAMOND);
		//CardTest.run(myGame);
		
		
		/*Lab 8b*/
		//Add code to create a deck of cards and call the run method from DeckTest.
		//BJDeck myGame =  new BJDeck();
		//DeckTest.run(myGame);
		
		
		/*Lab 9a*/
		//Add code to create any necessary objects and call the run method from HandTest.
		//BJDeck Deck =  new BJDeck();
		//BJHand Hand = new BJHand();
		//HandTest.run(Deck, Hand);
		
		/*Lab 9b */
		//Examine the file PGame.java and figure out how to modify your PlayBlackJack file
		//to run a game of Black Jack noting the requirements below.
		BJDeck deck =  new BJDeck();		
		BJHand dealer = new BJHand();
		BJHand player = new BJHand();
		
		/*This is for cards' condition*/
		PGame.setBackgroundColor(Color.GRAY);
		PGame.setBannerColor(Color.BLACK);
		PGame.setBannerTextColor(Color.white);
		PGame.setStatusTextColor(Color.BLACK);
		PGame.setButtonColor(Color.DARK_GRAY);
		PGame.setButtonHighlightColor(Color.LIGHT_GRAY);
		PGame.setButtonTextColor(Color.WHITE);
		PGame.setFont("TimesNewRoman");
				
		PGame.run(deck, dealer, player);
	

		
	}// end of Main

}// end of PlayBlackJack 
