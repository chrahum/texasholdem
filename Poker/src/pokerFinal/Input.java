package pokerFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface Input {
    public static String getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\nWhat is your name: ");
        String nameOut = in.nextLine();
        return nameOut;
    }

    public static String newGameInput(){
        boolean value = true;
        Scanner in = new Scanner(System.in);
        System.out.println("\nDo you want to play a new game? (y)es or (n)o");
        String newGameOut = in.nextLine();
        return newGameOut;
    }

    public static String getIfPlayingHand(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nDo you want to play your hand, (y)es or (n)o");
        String playsHand = in.nextLine();
        return playsHand;
    }

    public static double getBet(){
        Scanner in = new Scanner(System.in);
        System.out.printf("\nHow much are you betting: $");
        double playerBet = in.nextDouble();               //Parses input
        return playerBet;
    }

    public static int createShorHardPoints(List<String> hand){

        //        System.out.println(hand);  checks if the parameter went through
            List<String> newHand = new ArrayList<>();

            for (int i = 0; i <hand.size(); i++) {
                //check spades
                if (hand.get(i).contains("2") && hand.get(i).contains("spades"))
                    newHand.add("2s");
                if (hand.get(i).contains("3") && hand.get(i).contains("spades"))
                    newHand.add("3s");
                if (hand.get(i).contains("4") && hand.get(i).contains("spades"))
                    newHand.add("4s");
                if (hand.get(i).contains("5") && hand.get(i).contains("spades"))
                    newHand.add("5s");
                if (hand.get(i).contains("6") && hand.get(i).contains("spades"))
                    newHand.add("6s");
                if (hand.get(i).contains("7") && hand.get(i).contains("spades"))
                    newHand.add("7s");
                if (hand.get(i).contains("8") && hand.get(i).contains("spades"))
                    newHand.add("8s");
                if (hand.get(i).contains("9") && hand.get(i).contains("spades"))
                    newHand.add("9s");
                if (hand.get(i).contains("10") && hand.get(i).contains("spades"))
                    newHand.add("10s");
                if (hand.get(i).contains("jack") && hand.get(i).contains("spades"))
                    newHand.add("11s");
                if (hand.get(i).contains("queen") && hand.get(i).contains("spades"))
                    newHand.add("12s");
                if (hand.get(i).contains("king") && hand.get(i).contains("spades"))
                    newHand.add("13s");
                if (hand.get(i).contains("ace") && hand.get(i).contains("spades"))
                    newHand.add("14s");

                //check diamonds
                if (hand.get(i).contains("2") && hand.get(i).contains("diamonds"))
                    newHand.add("2d");
                if (hand.get(i).contains("3") && hand.get(i).contains("diamonds"))
                    newHand.add("3d");
                if (hand.get(i).contains("4") && hand.get(i).contains("diamonds"))
                    newHand.add("4d");
                if (hand.get(i).contains("5") && hand.get(i).contains("diamonds"))
                    newHand.add("5d");
                if (hand.get(i).contains("6") && hand.get(i).contains("diamonds"))
                    newHand.add("6d");
                if (hand.get(i).contains("7") && hand.get(i).contains("diamonds"))
                    newHand.add("7d");
                if (hand.get(i).contains("8") && hand.get(i).contains("diamonds"))
                    newHand.add("8d");
                if (hand.get(i).contains("9") && hand.get(i).contains("diamonds"))
                    newHand.add("9d");
                if (hand.get(i).contains("10") && hand.get(i).contains("diamonds"))
                    newHand.add("10d");
                if (hand.get(i).contains("jack") && hand.get(i).contains("diamonds"))
                    newHand.add("11d");
                if (hand.get(i).contains("queen") && hand.get(i).contains("diamonds"))
                    newHand.add("12d");
                if (hand.get(i).contains("king") && hand.get(i).contains("diamonds"))
                    newHand.add("13d");
                if (hand.get(i).contains("ace") && hand.get(i).contains("diamonds"))
                    newHand.add("14d");

                //check clubs
                if (hand.get(i).contains("2") && hand.get(i).contains("clubs"))
                    newHand.add("2c");
                if (hand.get(i).contains("3") && hand.get(i).contains("clubs"))
                    newHand.add("3c");
                if (hand.get(i).contains("4") && hand.get(i).contains("clubs"))
                    newHand.add("4c");
                if (hand.get(i).contains("5") && hand.get(i).contains("clubs"))
                    newHand.add("5c");
                if (hand.get(i).contains("6") && hand.get(i).contains("clubs"))
                    newHand.add("6c");
                if (hand.get(i).contains("7") && hand.get(i).contains("clubs"))
                    newHand.add("7c");
                if (hand.get(i).contains("8") && hand.get(i).contains("clubs"))
                    newHand.add("8c");
                if (hand.get(i).contains("9") && hand.get(i).contains("clubs"))
                    newHand.add("9c");
                if (hand.get(i).contains("10") && hand.get(i).contains("clubs"))
                    newHand.add("10c");
                if (hand.get(i).contains("jack") && hand.get(i).contains("clubs"))
                    newHand.add("11c");
                if (hand.get(i).contains("queen") && hand.get(i).contains("clubs"))
                    newHand.add("12c");
                if (hand.get(i).contains("king") && hand.get(i).contains("clubs"))
                    newHand.add("13c");
                if (hand.get(i).contains("ace") && hand.get(i).contains("clubs"))
                    newHand.add("14c");

                //check hears
                if (hand.get(i).contains("2") && hand.get(i).contains("hearts"))
                    newHand.add("2h");
                if (hand.get(i).contains("3") && hand.get(i).contains("hearts"))
                    newHand.add("3h");
                if (hand.get(i).contains("4") && hand.get(i).contains("hearts"))
                    newHand.add("4h");
                if (hand.get(i).contains("5") && hand.get(i).contains("hearts"))
                    newHand.add("5h");
                if (hand.get(i).contains("6") && hand.get(i).contains("hearts"))
                    newHand.add("6h");
                if (hand.get(i).contains("7") && hand.get(i).contains("hearts"))
                    newHand.add("7h");
                if (hand.get(i).contains("8") && hand.get(i).contains("hearts"))
                    newHand.add("8h");
                if (hand.get(i).contains("9") && hand.get(i).contains("hearts"))
                    newHand.add("9h");
                if (hand.get(i).contains("10") && hand.get(i).contains("hearts"))
                    newHand.add("10h");
                if (hand.get(i).contains("jack") && hand.get(i).contains("hearts"))
                    newHand.add("11h");
                if (hand.get(i).contains("queen") && hand.get(i).contains("hearts"))
                    newHand.add("12h");
                if (hand.get(i).contains("king") && hand.get(i).contains("hearts"))
                    newHand.add("13h");
                if (hand.get(i).contains("ace") && hand.get(i).contains("hearts"))
                    newHand.add("14h");
            }
            //point system
        int points = 0, royal = 10, straightFlush = 9, fourKind = 8, fullHouse = 7, flush = 6,
                straight = 5, threeKind = 4, pair = 3, high = 2;


        //ROYAL FLUSH
        if( newHand.contains("14c") && newHand.contains("13c") && newHand.contains("12c") && newHand.contains("11c") && newHand.contains("10c"))
            points  = royal;
        if( newHand.contains("14s") && newHand.contains("13s") && newHand.contains("12s") && newHand.contains("11s") && newHand.contains("10s"))
            points  = royal;
        if( newHand.contains("14d") && newHand.contains("13d") && newHand.contains("12d") && newHand.contains("11d") && newHand.contains("10d"))
            points  = royal;
        if( newHand.contains("14h") && newHand.contains("13h") && newHand.contains("12h") && newHand.contains("11h") && newHand.contains("10h"))
        points  = royal;

        //Straight Flush
        if( newHand.contains("9c") && newHand.contains("13c") && newHand.contains("12c") && newHand.contains("11c") && newHand.contains("10c"))
            points  = straightFlush;
        if( newHand.contains("9s") && newHand.contains("13s") && newHand.contains("12s") && newHand.contains("11s") && newHand.contains("10s"))
            points  = straightFlush;
        if( newHand.contains("9d") && newHand.contains("13d") && newHand.contains("12d") && newHand.contains("11d") && newHand.contains("10d"))
            points  = straightFlush;
        if( newHand.contains("9h") && newHand.contains("13h") && newHand.contains("12h") && newHand.contains("11h") && newHand.contains("10h"))
            points  = straightFlush;
        if( newHand.contains("9c") && newHand.contains("8c") && newHand.contains("12c") && newHand.contains("11c") && newHand.contains("10c"))
            points  = straightFlush;
        if( newHand.contains("9s") && newHand.contains("8s") && newHand.contains("12s") && newHand.contains("11s") && newHand.contains("10s"))
            points  = straightFlush;
        if( newHand.contains("9d") && newHand.contains("8d") && newHand.contains("12d") && newHand.contains("11d") && newHand.contains("10d"))
            points  = straightFlush;
        if( newHand.contains("9h") && newHand.contains("8h") && newHand.contains("12h") && newHand.contains("11h") && newHand.contains("10h"))
            points  = straightFlush;
        if( newHand.contains("9c") && newHand.contains("8c") && newHand.contains("7c") && newHand.contains("11c") && newHand.contains("10c"))
            points  = straightFlush;
        if( newHand.contains("9s") && newHand.contains("8s") && newHand.contains("7s") && newHand.contains("11s") && newHand.contains("10s"))
            points  = straightFlush;
        if( newHand.contains("9d") && newHand.contains("8d") && newHand.contains("7d") && newHand.contains("11d") && newHand.contains("10d"))
            points  = straightFlush;
        if( newHand.contains("9h") && newHand.contains("8h") && newHand.contains("7h") && newHand.contains("11h") && newHand.contains("10h"))
            points  = straightFlush;
        if( newHand.contains("9c") && newHand.contains("8c") && newHand.contains("7c") && newHand.contains("6c") && newHand.contains("10c"))
            points  = straightFlush;
        if( newHand.contains("9s") && newHand.contains("8s") && newHand.contains("7s") && newHand.contains("6s") && newHand.contains("10s"))
            points  = straightFlush;
        if( newHand.contains("9d") && newHand.contains("8d") && newHand.contains("7d") && newHand.contains("6d") && newHand.contains("10d"))
            points  = straightFlush;
        if( newHand.contains("9h") && newHand.contains("8h") && newHand.contains("7h") && newHand.contains("6h") && newHand.contains("10h"))
            points  = straightFlush;
        if( newHand.contains("9c") && newHand.contains("8c") && newHand.contains("7c") && newHand.contains("6c") && newHand.contains("5c"))
            points  = straightFlush;
        if( newHand.contains("9s") && newHand.contains("8s") && newHand.contains("7s") && newHand.contains("6s") && newHand.contains("5s"))
            points  = straightFlush;
        if( newHand.contains("9d") && newHand.contains("8d") && newHand.contains("7d") && newHand.contains("6d") && newHand.contains("5d"))
            points  = straightFlush;
        if( newHand.contains("9h") && newHand.contains("8h") && newHand.contains("7h") && newHand.contains("6h") && newHand.contains("5h"))
            points  = straightFlush;
        if( newHand.contains("14c") && newHand.contains("2c") && newHand.contains("3c") && newHand.contains("4c") && newHand.contains("5c"))
            points  = straightFlush;
        if( newHand.contains("14s") && newHand.contains("2s") && newHand.contains("3s") && newHand.contains("4s") && newHand.contains("5s"))
            points  = straightFlush;
        if( newHand.contains("14d") && newHand.contains("2d") && newHand.contains("3d") && newHand.contains("4d") && newHand.contains("5d"))
            points  = straightFlush;
        if( newHand.contains("14h") && newHand.contains("2h") && newHand.contains("3h") && newHand.contains("4h") && newHand.contains("5h"))
            points  = straightFlush;

        //FOUR OF A KIND
        if( newHand.contains("2c") && newHand.contains("2d") && newHand.contains("2h") && newHand.contains("2s"))
            points  = fourKind;
        if( newHand.contains("3c") && newHand.contains("3d") && newHand.contains("3h") && newHand.contains("3s"))
            points  = fourKind;
        if( newHand.contains("4c") && newHand.contains("4d") && newHand.contains("4h") && newHand.contains("4s"))
            points  = fourKind;
        if( newHand.contains("5c") && newHand.contains("5d") && newHand.contains("5h") && newHand.contains("5s"))
            points  = fourKind;
        if( newHand.contains("6c") && newHand.contains("6d") && newHand.contains("6h") && newHand.contains("6s"))
            points  = fourKind;
        if( newHand.contains("7c") && newHand.contains("7d") && newHand.contains("7h") && newHand.contains("7s"))
            points  = fourKind;
        if( newHand.contains("8c") && newHand.contains("8d") && newHand.contains("8h") && newHand.contains("8s"))
            points  = fourKind;
        if( newHand.contains("9c") && newHand.contains("9d") && newHand.contains("9h") && newHand.contains("9s"))
            points  = fourKind;
        if( newHand.contains("10c") && newHand.contains("10d") && newHand.contains("10h") && newHand.contains("10s"))
            points  = fourKind;
        if( newHand.contains("11c") && newHand.contains("11d") && newHand.contains("11h") && newHand.contains("11s"))
            points  = fourKind;
        if( newHand.contains("12c") && newHand.contains("12d") && newHand.contains("12h") && newHand.contains("12s"))
            points  = fourKind;
        if( newHand.contains("13c") && newHand.contains("13d") && newHand.contains("13h") && newHand.contains("8s"))
            points  = fourKind;
        if( newHand.contains("14c") && newHand.contains("14d") && newHand.contains("14h") && newHand.contains("14s"))
            points  = fourKind;

        int current = 0;

        //checks for 2
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("2"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);

        }

        current = 0;
        //checks for 3
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("3"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }

        //checks for 4
        current = 0;
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("4"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;

        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);

        }

        //checks for 5
        current = 0;
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("5"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);

        }
        current = 0;

        //checks for 6
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("6"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);

        }

        //checks for 7
        current = 0;
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("7"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }

        //checks for 8
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("8"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }
        current = 0;

        //checks for 9
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("9"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }

        //checks for 10
        current = 0;
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("10"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }

        //checks for 11
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("11"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }
        current = 0;

        //checks for 12
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("12"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }

        //checks for 13
        current = 0;
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("13"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }

        //checks for 14
        current = 0;
        for (int i = 0; i < newHand.size(); i++)
        {
            if (newHand.get(i).contains("14"))
                current++;
            else
                break;
        }
        if (current > 1)
            points += current;
        for ( int i = 0; i < current; i++)
        {
            newHand.remove(0);
        }

        return points;
    }
}



