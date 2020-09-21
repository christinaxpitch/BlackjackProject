package com.skilldistillery.common.blackjack;

import java.util.List;

import com.skilldistillery.common.cards.Hand;

public class BlackjackHand extends Hand {


	public void BlackjackHand() {
	}
	
	@Override
	public int getHandValue() {
		int totalHand = 0;
		for (int i=0; i < cards.size(); i++) {
			totalHand = totalHand + cards.get(i).getValue();
		}
		return totalHand;
	}
	
	public boolean isBlackjack (int total) {
		if (total == 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isBlackjack () {
		int value = this.getHandValue();
		System.out.println(this.getHandValue());
		if (value == 21) {
			System.out.println("BLACKJACK!");
			return true;
			
		} else {
			return false;
		}
		
	}
	public boolean isBust() {
		int value = this.getHandValue();
		System.out.println(this.getHandValue());
		if (value >21) {
			System.out.println("BUST!");
			return true;
		} else {
			return false;
		}

	}

	public boolean isBust (int total) {
		if (total > 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void displayHand() {
		for (int i = 0; i < getHand().size(); i++) {
			getHand().get(i);
			
		}
	}

	@Override
	public String toString() {
		return "HAND: [cards=" + cards + ", value: " + getHandValue() + "]";
	}

	
	
}
