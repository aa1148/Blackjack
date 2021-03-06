package blackjack;

import java.util.ArrayList;

public class Hand {

	private ArrayList<Card> cards;
	private int aces;
	private int accumulated;
	
	public Hand() {
		cards = new ArrayList<Card>();
		aces = 0;
		accumulated = 0;
	}
	
	public Hand(ArrayList<Card> cards) {
		this.cards = cards;
		aces = 0;
		accumulated = 0;
		for (int i=0; i < cards.size(); i++) {
			accumulated += cards.get(i).getValue();
		}
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
	public int getAces() {
		return aces;
	}
	
	public void setAces(int aces) {
		this.aces = aces;
	}
	
	public void addToHand(Card card) {
		cards.add(card);
		accumulated += card.getValue();
		
		if (card.getValue() == 11) {
			aces++;
		}
	}
	
	public int getAccumulated() {
		return accumulated;
	}
	
	public void setAccumulated(int accumulated) {
		this.accumulated = accumulated;
	}
	
}
