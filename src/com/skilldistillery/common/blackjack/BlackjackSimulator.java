package com.skilldistillery.common.blackjack;

import java.util.Scanner;

import com.skilldistillery.common.cards.Deck;

public class BlackjackSimulator {
	BlackjackDealer dealer = new BlackjackDealer();
	CardPlayer player = new CardPlayer();
	Deck deck = new Deck();
	BlackjackHand hand = new BlackjackHand();
	Scanner scanner = new Scanner(System.in);
	
	
public static void main(String[] args) {
	BlackjackSimulator bs = new BlackjackSimulator();
	bs.run();
	
}
public void run() {
	welcome();
}

public void basicMenu() {
	System.out.println("Select:");
	System.out.println("1. Start game!");
	System.out.println("2. See the rules.");
	System.out.println("3. Exit.");
}

public void welcome() {
	System.out.println("\u2666\u2660\u2663\u2764 Welcome to Blackjack! \u2666\u2660\u2663\u2764 ");
	newLine();
	boolean keepGoing = true;
	do { 
		basicMenu();
		int choice = scanner.nextInt();
	switch (choice) {
		
	case 1: play();
		keepGoing= false;
		break;
	case 2: 
		System.out.println("   \u2666\u2660\u2663\u2764   RULES OF BLACKJACK:   \u2666\u2660\u2663\u2764");
		System.out.println("-------------------------------------------");
		System.out.println("The goal is to beat the dealer's score by getting as close to 21 as possible. ");
		System.out.println("Each player starts with two cards...the numerical cards are worth their numerical value, \nwhile the J, Q, and K are worth 10. The Ace is worth 11 here with us.");
		System.out.println("You can either hit, and get another card, or stay");
		System.out.println("The dealer will always hit if they have a hand value below 17.");
		System.out.println("If a hand is worth exactly 21, it is called blackjack!");
		newLine();
		System.out.println("**GOOD LUCK**");
		newLine();
		break;
		
	case 3:
		System.out.println("You have selected quit. GOODBYE.");
		keepGoing = false;
		break;
	}
	}
while (keepGoing);
	
}

	public void play() {
		newHand();
		playerPlay();
		dealerHit();
		checkWinner();
		
	}
	
	public void newHand() {
		deck.createDeck();
		deck.shuffle();
		
		player.getHand().addCard(deck.dealCard());
		player.getHand().addCard(deck.dealCard());
		
		dealer.getHand().addCard(deck.dealCard());
		dealer.getHand().addCard(deck.dealCard());
		
		System.out.println("YOUR " + player.getHand());
		System.out.println("DEALER HAND: [cards=[" + dealer.displayHand() + " , face down card]" + ", " + "value: " + dealer.getHandValue() + "]");
		if (checkBlackjack()) {
		System.exit(0);
		}
	}
	
		public void playerPlay() {
			boolean keepGoing;
			do { while (player.getHand().getHandValue() <= 21){
				System.out.println("Select: ");
				System.out.println("1. Hit");
				System.out.println("2. Stay");
				int playerChoice = scanner.nextInt();
				
				if (playerChoice == 1) {
					System.out.println("HIT: You will now add a card to your hand...");
					player.getHand().addCard(deck.dealCard());
					System.out.println("YOUR  " + player.getHand());
					
					System.out.println("DEALER HAND: [cards=[" + dealer.displayHand() + " , face down card]" + ", " + "value: " + dealer.getHandValue() + "]");
					if (checkPlayerBust()) {
						System.exit(0);
						}
					break;
				}
				else if (playerChoice == 2) {
					System.out.println("YOUR  " + player.getHand().toString());
					System.out.println("DEALER VALUE: " + dealer.getHand());
					break;
				}
				else {
					System.out.println("Invalid option. Select 1 for HIT or 2 for STAY.");
					break;
				}
			}
		} while (keepGoing = false);
		}
		public boolean checkBlackjack() {
			if (player.getHand().getHandValue() ==21) {
				System.out.println("***YOU HAVE BLACKJACK (21)!***");
				return true;
			}
			if (dealer.getHand().getHandValue() ==21) {
				System.out.println("***DEALER HAS BLACKJACK (21)!***");
				return true;
			}
			else {
				return false;
			}
				
		}
		
		public void dealerHit() {
			while (dealer.getHand().getHandValue() < 17 && checkDealerBust() == false && checkBlackjack() == false) {
				dealer.getHand().addCard(deck.dealCard());
				newLine();
				System.out.println("Dealer gets a card added to it's hand...");
				System.out.println("DEALER VALUE: " + dealer.getHand().getHandValue());
				newLine();
			}
		}
		
		public void checkWinner() {
			while (player.getHand().getHandValue() <= 21) {

			if (dealer.getHand().getHandValue() == player.getHand().getHandValue()) {
				newLine();
				System.out.println("***TIE***");
				break;
			}
			if (checkDealerBust()) {
				break;
			} 
			if (checkBlackjack()) {
				break;
			}
			else if (dealer.getHand().getHandValue() > player.getHand().getHandValue()) {
				newLine();
				System.out.println("***DEALER WINS***!");
				System.out.println("(dealer > you)");
				break;

			} else {
				newLine();
				System.out.println("***YOU WIN***");
				System.out.println("(dealer < you)");
				break;
			}

		}while (player.getHand().getHandValue() > 21) {
			checkPlayerBust();
			break;
		}
		}	
		public boolean checkDealerBust() {
			if (dealer.getHand().getHandValue() > 21) {
				newLine();
				System.out.println("***YOU WIN***");
				System.out.println("(dealer busts)");
				return true;
			}
			else {
				return false;
			}
		}
		public boolean checkPlayerBust() {
			if(player.getHand().getHandValue() > 21) {
				newLine();
				System.out.println("**YOU LOSE**");
				System.out.println("(bust)");
				return true;
			}
			else {
				return false;
			}
		}
	public void newLine() {
		System.out.println();
	}
}
