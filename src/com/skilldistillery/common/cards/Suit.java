package com.skilldistillery.common.cards;

public enum Suit {
	
	HEARTS("Hearts"), 
	SPADES("Spades"), 
	CLUBS("Clubs"), 
	DIAMONDS("Diamonds");
	
	
	private Suit(String name) {
		this.name = name;	
	}

	private String name;
	
	@Override
	public String toString() {
		return name;
	}
	
	
}

