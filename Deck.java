import java.util.ArrayList;
import java.util.Random;

public class Deck
{
    private ArrayList<Card> deck;
    public ArrayList<Card> hand = new ArrayList();
    public Deck()
    {
        deck = new ArrayList<Card>();
    }
    
    public void initializeDeck()
    {
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String[] ranks = {"Ace", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        
        for (String s : suits)
        {
             int value = 0;
             for (String r : ranks)
             {
                 if(value > 10){
                     Card temp = new Card (11, s, r);
                     deck.add(temp);
                 }
                 else {
                     Card temp = new Card (value, s, r);
                     value++;
                     deck.add(temp);
                 }            
             }
        }
    }
    
    public void shuffle()
    {
        //Return a cards pulled from a random index. NO REPEATS 
        ArrayList<Card> temp = new ArrayList();
        Random rand = new Random();
        int shuffle;
        for (int i = 0; i < 52; i++)
        {
           shuffle = rand.nextInt(this.deck.size()); 
           temp.add(this.deck.get(shuffle));
           this.deck.remove(shuffle);
        }
        this.deck = temp;
    }
    
    public ArrayList<Card> deal()
    {
        //Add card to players ArrayList using the shuffle method
        hand.add(this.deck.get(0));
        this.deck.remove(0);
        return hand;
    }
    
    public void printHand()
    {
        for (Card h : hand)
        {
            System.out.println(h);
        }
        
    }
    
    public void printDeck()
    {
        for (Card c : deck)
        {
            System.out.println(c);
        }
    }
}
