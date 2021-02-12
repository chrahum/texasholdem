package pokerFinal;
import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

import static java.lang.System.nanoTime;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Texas Holdem");
        System.out.println("My name is " + Dealer.getName() + " and I will be your dealer!");
        //creates new player
        Player newPlayer = new Player();
        Dealer katie = new Dealer();
        String[] flop = new String[5];

        //Creates new Deck
        DeckOfCards deck = new DeckOfCards();

        //gets the name of the player
        String userInput = Input.getUserInput();
        newPlayer.name = userInput;
        System.out.println("You start out with $"+ newPlayer.money + " dollars");

        //betting money variable
        double bet;
        //creating variable for a new game
        String newGame, playsHand;

        //Do while loop to loop at least once
        do {
            //Shuffles deck and stores it into its own variable
            String [] shuffledDeck = deck.shuffleDeck();
            //deck.printDeck();

            //begins round and adds two cards to player and dealer
            for(int a = 0; a<2;a++){
                newPlayer.deck[a] = shuffledDeck[a];
                katie.deck[a] = shuffledDeck[a+1];
            }

            if ( newPlayer.money < 0)
                break;
            //blind bet
            bet = Input.getBet();
            System.out.println("Your initial bet is $" + bet);
            if (bet > newPlayer.money)
                break;

            //Shows Hand
            System.out.println("\n Your Hand: ");
            for(int j = 0; j < newPlayer.deck.length; j++) {
                System.out.println("Player Card "+ (j+1) + ": " + newPlayer.deck[j]);
            }

            //Asks if player wants to play hand...if he does it burns and then adds the flop
            playsHand = Input.getIfPlayingHand();
            if (playsHand.equals("yes") || playsHand.equals("y")){
                for (int a = 0; a < 3; a++){
                    flop[a] = shuffledDeck[a+5];
                }

                //Shows Flop
                System.out.println("\nThe Flop is: ");
                for(int j = 0; j < 3; j++) {
                    System.out.println("Flop Card " + (j+1) + ": " + flop[j]);
                }

                //Shows Hand again
                System.out.println("\n Your Hand: ");
                for(int j = 0; j < 2; j++) {
                    System.out.println("Player Card "+ (j+1) + ": " + newPlayer.deck[j]);
                }

                //The turn
                playsHand = Input.getIfPlayingHand();
                if (bet > newPlayer.money)
                    break;
                if (playsHand.equals("yes") || playsHand.equals("y")) {
                    //adds the river card
                    flop[3] = shuffledDeck[9];
                    bet += Input.getBet();
                    System.out.println("Your total bet is $" + bet);

                    //Shows Flop
                    System.out.println("\nThe turn card and Flop is: ");
                    for (int j = 0; j < 4; j++) {
                        System.out.println("Flop Card " + (j + 1) + ": " + flop[j]);
                    }

                    //Shows Hand again
                    System.out.println("\n Your Hand: ");
                    for (int j = 0; j < 2; j++) {
                        System.out.println("Player Card " + (j + 1) + ": " + newPlayer.deck[j]);
                    }
                    //The river

                    playsHand = Input.getIfPlayingHand();
                    if (bet > newPlayer.money)
                        break;
                    if (playsHand.equals("yes") || playsHand.equals("y")) {
                        flop[4] = shuffledDeck[11];
                        bet += Input.getBet();
                        System.out.println("Your total bet is $" + bet);

                        //Shows Flop
                        System.out.println("\nThe River Card and Flop is: ");
                        for (int j = 0; j < 5; j++) {
                            System.out.println("Flop Card " + (j + 1) + ": " + flop[j]);
                        }

                        //Shows Hand again
                        System.out.println("\n Your Hand: ");
                        for (int j = 0; j < 2; j++) {
                            System.out.println("Player Card " + (j + 1) + ": " + newPlayer.deck[j]);
                        }
                        //Shows Dealer Hand again
                        System.out.println("\n Dealer's Hand: ");
                        for (int j = 0; j < 2; j++) {
                            System.out.println("Dealer Card " + (j + 1) + ": " + katie.deck[j]);
                        }
                    }
                }
            }
            //create a hand of of all the flop and players hand
            String[] playerHand = new String[7];
            for (int i = 0; i< flop.length; i++){
                playerHand[i] = flop[i];
            }
            playerHand[5] = newPlayer.deck[0];
            playerHand[6] = newPlayer.deck[1];

            //create a hand of of all the flop and players hand
            String[] dealerHand = new String[7];
            for (int i = 0; i< flop.length; i++){
                dealerHand[i] = flop[i];
            }
            dealerHand[5] = katie.deck[0];
            dealerHand[6] = katie.deck[1];

            //sorting player hand array
            Arrays.sort(playerHand);
            Arrays.sort(dealerHand);

            //converts to a list to use contains
            List<String> playerHandList = Arrays.asList(playerHand);
            List<String> dealerHandList = Arrays.asList(dealerHand);

//            for(int i = 0; i < dealerHand.length; i++){
//                System.out.println("Dealer's Hand Card " + (i+1) +": " + dealerHand[i]);
//            }
//            System.out.println();
//            for(int i = 0; i < dealerHand.length; i++){
//                System.out.println("Player's Hand Card " + (i+1) +": " + playerHand[i]);
//            }


            //creates the short hand version of player and dealer hand
            int shortPlayerHand = Input.createShorHardPoints(playerHandList);
            int shortDealerHand = Input.createShorHardPoints(dealerHandList);

            if(shortPlayerHand > shortDealerHand)
            {
                System.out.println("HURRAY YOU WIN!!");
                bet *= 2;
                System.out.println("You Won $" + bet);
            }
            else if (shortPlayerHand == shortDealerHand)
                System.out.println("IT WAS A DRAW");
            else{
                System.out.println("SORRY YOU LOST");
                System.out.println("You lost $" + bet);
            }

            newGame = Input.newGameInput();


        } while (newGame.equals("yes") || newGame.equals("y"));

        System.out.println("Thanks for playing!");


//        //Adding title, the size of the frame and making it to exit when closing
//        JFrame frame = new JFrame("Texas Holdem");
//        frame.setSize(600,600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //Makes a label
//        JLabel deckLabel = new JLabel ("New Deck");
//
//        //adds the label to my frame
//        frame.add(deckLabel);
//
//        //makes it visible in the frame
//        frame.setVisible(true);
//
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new SwingDemo();
//            }
//        });
    }
}