package com.skilldistillery.common.blackjack;

import java.util.Scanner;

import com.skilldistillery.common.cards.Card;
import com.skilldistillery.common.cards.Hand;

public class CardPlayer {
	
	protected BlackjackHand hand = new BlackjackHand();
	
	public CardPlayer() {
		
	}

//	public boolean hit(Scanner scanner) {
//		if (scanner.nextLine().equals("Y")) {
//			return true;
//		}
//		return false;
//	}
	
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
	
	public Hand getHand() {
		return hand;
	}

}
