package com.skilldistillery.common.cards;

import java.util.ArrayList;
import java.util.List;

import com.skilldistillery.common.cards.Card;

public abstract class Hand {
	protected List<Card> cards = new ArrayList<>();


	public Hand() {
	}
	
	public List<Card> getCards() { 
		return cards;
	}
	public void addCard(Card card) {
		getCards().add(card);
	}
	
	public abstract int getHandValue();
	
	public void clearHand() {
		cards.removeAll(cards);
	}

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}
	
	public List<Card> getHand() {
		return cards;
	}
}