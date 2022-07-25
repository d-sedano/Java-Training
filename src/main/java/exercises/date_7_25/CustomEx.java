package main.java.exercises.date_7_25;

import java.io.IOException;

public class CustomEx {

	public static void main(String[] args) throws IOException, CardNotFoundException {
		
		String suit = args[0];
		int rank = Integer.parseInt(args[1]);
		
		Card card = new Card();
		card.setRank(rank);
		card.setSuit(suit);
		
		Hand hand = new Hand();
		hand.setCard(card);
		hand.printCard();
		
	}

}

class CardNotFoundException extends Exception {
	
	CardNotFoundException(String message) {
		super(message);
	}
}

class Card {
	
	String suit;
	int rank;
	
	int getRank() {
		return this.rank;
	}
	
	String getSuit() {
		return this.suit;
	}
	
	void setRank(int rank) {
		this.rank = rank;
	}
	
	void setSuit(String Suit) {
		this.suit = suit;
	}
}

class Hand {
	Card card;
	
	Card getCard() {
		
		return this.card;
		
	}
	
	void setCard(Card card) {
		this.card = card;
	}
	
	void printCard() throws CardNotFoundException {
		if (card.suit == "Hearts" || card.suit == "Spades" || card.suit == "Diamonds" 
				|| card.suit == "Clubs") {
			System.out.println(this.card.rank + ", " + this.card.suit);
		} else {
			throw new CardNotFoundException("Card not found");
		}
	}
}




