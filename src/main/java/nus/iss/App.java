package nus.iss;

import java.io.Console;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Console con = System.console();
        String command = "";
        int totalCard = 52;
        
        ArrayList<String> cards = new ArrayList<>();
        String card[] = {"CA", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10", "CJ", "CQ", "CK",
        "SA", "S2", "S3", "S4", "S5", "S6", "S7", "S8", "S9", "S10", "SJ", "SQ", "SK",
        "HA", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10", "HJ", "HQ", "HK",
        "DA", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10", "DJ", "DQ", "DK"};
       
        ArrayList<String> hand = new ArrayList<>();
        for(int i = 0; i<card.length; i++)
        {
            cards.add(card[i]);
            //System.out.println(card[i]);
        }
        Cards deck = new Cards();
        while(!command.equals("quit"))
        {   
            command = con.readLine();
            if(command.equals("draw"))
            {
                String cardDrawn = deck.DrawCard(cards);
                cards.remove(cardDrawn);
                hand.add(cardDrawn);
                System.out.println(cardDrawn);
            }
            if(command.equals("check"))
            {
                for(String x : cards)
                {
                    System.out.print(x+" ");
                }
                System.out.println("");
                for(String y : hand)
                System.out.println("Hand has "+y);
            }
        }
    }
}
