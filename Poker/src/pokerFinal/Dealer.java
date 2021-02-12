package pokerFinal;

public class Dealer {
    private static String dealerName;
    //field
    public String name;
    public String [] deck = new String[2];
    public double money = 100.00;

    //Method to get Delaer Name
    public static String getName(){
        dealerName = "Katie";
        return dealerName;
    }
}
