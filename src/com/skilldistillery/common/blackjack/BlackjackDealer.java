package com.skilldistillery.common.blackjack;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Dealer;
import com.skilldistillery.common.cards.Deck;
import com.skilldistillery.common.cards.Hand;

public class BlackjackDealer extends CardPlayer{
	
	private Deck deck = new Deck();
	private BlackjackHand hand = new BlackjackHand();

	public BlackjackDealer() {
		super();
	}
	
	public void shuffle () {
		deck.shuffle();
	}
	
	public Card getCard() {
		Card card = deck.dealCard();
		return card;
	}
	
	public void dealCard() {
		deck.dealCard();
	}
	
	public void addCardToHand(Card card) {
		hand.addCard(card);
	}
	
	public int getHandValue() {
		return hand.getHandValue();
	}
	
	public boolean checkBust() {
		int total = getHandValue();
		return ((BlackjackHand) hand).isBlackjack(total);
	}

	public Card displayHand() {
		return (hand.getHand().get(0));
	}
	
	public BlackjackHand getHand() {
		return hand;
	}
	public void hit (Card card) {
		hand.addCard(card);
	}
	}

