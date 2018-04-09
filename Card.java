import java.util.Random;

public class Card extends Deck
{
    private int value;
    private String suit;
    private String rank;
    public Card(int val, String s, String r)
    {
        this.value = val;
        this.suit = s;
        this.rank = r;
    }

    public int getValue()
    {   
        return value;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public String getRank()
    {
        return rank;
    }
    
    public String toString()
    {
        return "Suit: " + this.suit+ " Rank: "+this.rank+" Value: "+this.value;
    }
}
