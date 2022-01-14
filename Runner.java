package com.bbc;

// Nomaan Khan Razaq



public class Runner{
    public static void main(String[] args)
    {


        Deck d = new Deck();
        System.out.println(d.size());
        Card t = d.dealRandomCard();
        System.out.println(t.getValue()+" " +t.getSuit());
        t = d.getCard(0);
        System.out.println(t.getValue()+" " +t.getSuit());
        d.shuffle();
        t = d.getCard(0);
        System.out.println(t.getValue()+" " +t.getSuit());
        System.out.println(d.size());

        Pontoon p = new Pontoon(2);
        System.out.println(p.getPlayer(1).getHandSize());
        System.out.println(p.getPlayer(0).getHandSize());
        p.dealInitialCards();
        System.out.println(p.getPlayer(1).getHandSize());
        System.out.println(p.d.size());




        Player P = new Player("John");
        Player P2 = new Player("John");


        P2.dealToPlayer(new Card(Card.Suit.DIAMONDS, Card.Value.TEN));
        P2.dealToPlayer(new Card(Card.Suit.DIAMONDS, Card.Value.THREE));
        P2.dealToPlayer(new Card(Card.Suit.DIAMONDS, Card.Value.TWO));

        P.dealToPlayer(new Card(Card.Suit.SPADES, Card.Value.TEN));
        P.dealToPlayer(new Card(Card.Suit.HEARTS, Card.Value.FIVE));
        P.dealToPlayer(new Card(Card.Suit.DIAMONDS, Card.Value.TWO));
        P.dealToPlayer(new Card(Card.Suit.DIAMONDS, Card.Value.TWO));

        System.out.println(P.getHandSize());
        System.out.println(p.compareHands(P,P2));


    }
}
