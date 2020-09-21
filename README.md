# Blackjack
## Overview
This week four project relies heavily on using object oriented programming to create a fully functional Blackjack simulation. The cards we created are not specific to this Blackjack app, and therefore the cards in the package can be used for other games as well! (This was practice in use of packages and grouping).

### Lessons Used
* Enums
* Arrays
* Object Oriented programming
* Packages/Class structures
* Pass by Value
* Loops
* Instances
* Objects
* Private/protected/public

### How to Run - Instructions
1. The user is greeted by the program's simple welcome menu.
2. The user can start the game, or select to see the rules to the game.
3. Selecting the option to see the rules brings them to a description of Blackjack rules, with the menu repeated again so the user can start the game or quit as the user likes.
4. Starting the game prompts the dealer to shuffle, and make a deck for itself and for the user.
5. The user then plays blackjack! There are lots of different ways to win and to lose. The player sees a sub menu for HIT or STAY, which either deals them a new card or has them hold on to their current hand.
6. The game is over when either the user or dealer get blackjack, bust, or when one player's value is greater than the other. The program is over and the user can restart the program if they wish to play again.
7. In this application, we made Aces = 11 always, and made the dealer always hit if their hand value was below 17.

### The Method to the Madness
1. The package for common cards set up Enums for a deck of cards. This is kept separate from the Blackjack package so that the cards created can be used for any card game in the future. They are not specific to this blackjack program, but are used in it.
2. The blackjack package contains classes that are specific to this program: A dealer, a player, a blackjack hand, and the blackjack simulation (the only class with a main method which runs the program).
3. The abstract class hand contains an array list that cards are added to as they are dealt to either the player or the dealer.
4. The BlackjackDealer class has an instance of the deck as well as a blackjack hand. This allows the dealer to access the methods in the deck class, such as shuffle, deal cards, and add cards as well as retrieving their hand value. The CardPlayer class has an instance of blackjack hand, but not the deck, because the player only needs a hand to play this game.
5. In the Blackjack simulator, there are numerous methods, loops, switch statements, etc to check for all the outcomes of the game. The user is shown their hand, and one card of the dealer's hand. The user then decides what to do based on their hand's value and the dealer's showing card.
6. The Blackjack Simulator really shows how Objects are called upon from different classes and subclasses, and how to pass information between classes.
