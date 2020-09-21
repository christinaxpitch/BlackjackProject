package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards;
	
	public Deck() {
		cards = createDeck();
	}
	
	public List<Card> createDeck() {
		cards = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				cards.add(new Card(r, s));
			}
		}
		return cards;
		
	}
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
}
