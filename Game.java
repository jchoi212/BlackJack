import java.util.Scanner;

/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private Player p1;
    private Dealer dealer;
    private Deck deck;
    
    public Game()
    {
       this.deck = new Deck();
       p1 = new Player ("Player one", 0);
       dealer = new Dealer ();
       
    }

    public void play()
    {
        Scanner scan = new Scanner(System.in);
        /* Initialize Players name and money alongside Dealer
         * Initialize deck and Deal 2 cards to Player then Dealer
         * Ask Player to Bet, then to hit or stay
         * Calculate hand total and winnings
         * Dealer has to Hit or Stay
         * Calculate winner
         */
        System.out.println ("Welcome to BlackJack.");
        System.out.println ("Please enter your name below.");
        p1.setName(scan.nextLine());
        System.out.println ("Welcome, " + p1.getName());
        System.out.println ("The deck is now shuffling.");
        this.deck.initializeDeck();
        this.deck.shuffle();
        System.out.println ("How much would you like to bet. Enter amount below.");
        p1.bet(scan.nextInt());
        System.out.println ("You have $" + p1.getMoney() + " left.");
        while(p1.handTotal() < 21 || dealer.handTotal() < 21)
        {
            System.out.println("This is " + p1.getName() +"'s hand: "); 
            this.p1.hand = this.deck.deal();
            this.p1.hand = this.deck.deal();
            this.p1.printHand();
            System.out.println (p1.getName() + "'s hand total is: " + p1.handTotal());
            p1.hand.clear();
            System.out.println ("The this is the dealers hand:");
            this.dealer.hand = this.deck.deal();
            this.dealer.hand = this.deck.deal();
            this.dealer.printHand();
            System.out.println ("Dealers hand total is: " + dealer.handTotal());
            dealer.hand.clear();
            System.out.println ("Would you like to Hit? Y/N.");
            if (scan.nextLine().equals("y"))
            {
                p1.hit();
                this.p1.printHand();
            }
            else if (scan.nextLine().equals("n"))
            {
                System.out.println ("OK, now to the dealer.");
                if (dealer.handTotal() < 17)
                {
                    dealer.hit();
                    this.dealer.printHand();
                }
                else 
                {
                   System.out.println ("The dealer has also stayed."); 
                }
            }
        }
        
       
        
        
       
        
    }
    
    public String winner(Player[] players[])
    {
        return null;
    }
    
    public void end()
    {
        //End Game
    }
}
