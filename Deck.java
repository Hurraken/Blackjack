package com.bbc;

// Nomaan Khan Razaq




import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();
    public Deck() {
        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.ACE));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.ACE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.ACE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.ACE));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.TWO));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.TWO));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.TWO));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.TWO));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.THREE));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.THREE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.THREE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.THREE));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.FOUR));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.FOUR));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.FOUR));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.FOUR));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.FIVE));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.FIVE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.FIVE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.FIVE));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.SIX));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.SIX));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.SIX));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.SIX));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.SEVEN));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.SEVEN));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.SEVEN));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.SEVEN));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.EIGHT));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.EIGHT));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.EIGHT));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.EIGHT));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.NINE));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.NINE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.NINE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.NINE));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.TEN));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.TEN));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.TEN));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.TEN));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.JACK));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.JACK));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.JACK));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.JACK));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.QUEEN));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.QUEEN));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.QUEEN));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.QUEEN));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.KING));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.KING));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.KING));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.KING));
    }

    public void reset(){
        cards.clear();
        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.ACE));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.ACE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.ACE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.ACE));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.TWO));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.TWO));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.TWO));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.TWO));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.THREE));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.THREE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.THREE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.THREE));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.FOUR));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.FOUR));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.FOUR));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.FOUR));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.FIVE));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.FIVE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.FIVE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.FIVE));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.SIX));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.SIX));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.SIX));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.SIX));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.SEVEN));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.SEVEN));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.SEVEN));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.SEVEN));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.EIGHT));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.EIGHT));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.EIGHT));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.EIGHT));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.NINE));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.NINE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.NINE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.NINE));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.TEN));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.TEN));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.TEN));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.TEN));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.JACK));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.JACK));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.JACK));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.JACK));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.QUEEN));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.QUEEN));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.QUEEN));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.QUEEN));

        cards.add(new Card(Card.Suit.DIAMONDS, Card.Value.KING));
        cards.add(new Card(Card.Suit.SPADES, Card.Value.KING));
        cards.add(new Card(Card.Suit.HEARTS, Card.Value.KING));
        cards.add(new Card(Card.Suit.CLUBS, Card.Value.KING));
    }
    public int size(){
        return cards.size();
    }
    public Card dealRandomCard()
    {
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(cards.size());
        Card item = cards.get(index);
        cards.remove(index);
        return item;
    }
    public Card getCard(int i)
    {
        return cards.get(i);
    }

    public void shuffle(){
        Random rand = new Random();
        int temp = 0;

        for(int i = 0 ; i < 300 ; i++ ) {
            int i1 = rand.nextInt(cards.size());
            int i2 = rand.nextInt(cards.size());

            Collections.swap(cards,i1,i2);
        }
    }
}



