import java.util.ArrayList;

public class Player
{
    private String name;
    private int money;
    public ArrayList<Card> hand = new ArrayList();
    private int handTotal;
    
    public Player(String nm, int mny)
    {
        this.name = nm;
        this.money = mny;
    }
    
    public void setName(String nm)
    {
        this.name = nm;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getMoney()
    {
        return money;
    }
    
    public int bet(int bet)
    {
        this.money -= bet;
        return money;
    }
    
    public void hit()
    {
        if (handTotal() < 21)
        {
            addCard();
            
        }
    }
    
    public void stay()
    {
        handTotal();
    }
    
    public Card addCard()
    {
       return null;
    }
    
    public int handTotal()
    {
        int handTotal = 0;
        for (Card c : hand)
        {
            handTotal += (c.getValue());
            if (c.getRank().equals("Ace"))
            {
                if (handTotal > 11)
                {
                    handTotal += 1;
                    }
                else {
                    handTotal += 11;
                }
            }
        }
        return handTotal;
    }
    
    public String toString()
    {
        return name+" has: $"+money;
    }
    
    public void printHand()
    {
        for (Card h : this.hand)
        {
            System.out.println(h);
        }
        
    }
}
