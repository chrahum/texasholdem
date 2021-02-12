package pokerFinal;

import java.util.Arrays;
import java.util.List;

public class DeckOfCards {
    //fields to initialize parts of deck
    String[] suits = { "spades","clubs", "diamonds", "hearts" };

    String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                         "jack", "queen", "king", "ace" };

    int n = 52;

    // initialize deck
    String[] deck = new String[n];

    //Constructor
    public DeckOfCards(){
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = RANKS[i] + " of " + suits[j];
            }
        }
    }

    //method to shuffle the deck
    public String[] shuffleDeck(){
        // shuffle
        for (int i = 0; i < n; i++) {
            int j = i + (int) (Math.random() * (n-i));
            String temp = deck[j];
            deck[j] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    //Method to check if stuff prints out will most likely delete at the end
    public void printDeck(){
        for (int i = 0; i < n; i++) {
            System.out.println(deck[i]);
        }
        System.out.println(deck.length);
    }

}
