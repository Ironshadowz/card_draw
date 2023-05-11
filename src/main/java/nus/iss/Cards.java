package nus.iss;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Cards {
    public static void Cards()
    { 
    
    }
    public String DrawCard(ArrayList<String> deck)
    {
        Random rand = new Random(); 
        int upperBound = 52;
        int randomNum = rand.nextInt(upperBound);  
        return deck.get(randomNum);
    }
}
