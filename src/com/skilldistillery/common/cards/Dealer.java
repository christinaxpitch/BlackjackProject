package com.skilldistillery.common.cards;

import com.skilldistillery.common.blackjack.CardPlayer;

public class Dealer extends CardPlayer{
	
	private Deck deck = new Deck();
	
	public Card dealCard() {
		return deck.dealCard();
	}

	public Dealer() {
		
	}
	
	public void shuffle() {
		deck.shuffle();
	}
	
	
}
