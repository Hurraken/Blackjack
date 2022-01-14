package com.bbc;

// Nomaan Khan Razaq



import java.util.ArrayList;

public class Pontoon extends CardGame {
	Pontoon(int nplayers) {
        super(nplayers);
    }

    @Override
    public void dealInitialCards() {
        for (int i = 0; i < players.size(); i++)
        {
            players.get(i).dealToPlayer(d.dealRandomCard());
            players.get(i).dealToPlayer(d.dealRandomCard());
        }
    }
    public int isPontoon(Player P)
    {
        ArrayList<Card> clist = P.getCards();
        if(clist.size() == 2 && P.getBestNumericalHandValue() == 21)
        {
            return 1;
        }
        return 0;
    }
    public int isFiveCardTrick(Player P)
    {
        ArrayList<Card> clist = P.getCards();
        ArrayList<Integer> handvalues;
        if(clist.size() == 5)
        {
            handvalues = P.getNumericalHandValue();
            for(int k = 0; k < handvalues.size() ; k++)
            {
                if(handvalues.get(k) <= 21)
                {
                    return 1;
                }
            }
        }
        return 0;
    }

    public int aHandTotalling21(Player P)
    {
        ArrayList<Card> clist = P.getCards();
        ArrayList<Integer> handvalues;
        handvalues = P.getNumericalHandValue();
        for(int k = 0; k < handvalues.size() ; k++)
        {
            if(handvalues.get(k) == 21)
            {
                return 1;
            }
        }
        return 0;
    }

    public int TotalValueOf20OrLess(Player P)
    {
        ArrayList<Card> clist = P.getCards();
        ArrayList<Integer> handvalues;
        handvalues = P.getNumericalHandValue();
        int max = 0;
        for(int k = 0; k < handvalues.size() ; k++)
        {
            if(handvalues.get(k) < 21)
            {
                if(max < handvalues.get(k))
                {
                    max = handvalues.get(k);
                }

            }
        }
        if(max != 0)
        {
            return max;
        }
        else
            return 0;
    }

    @Override
    public int compareHands(Player hand1, Player hand2) {
        if(isPontoon(hand1) == 1 && isPontoon(hand2) == 1){
            return 0;
        }
        else if(isPontoon(hand1) == 1 )
        {
            return -1;
        }
        else if(isPontoon(hand2) == 1 )
        {
            return 1;
        }
        else if(isFiveCardTrick(hand1) == 1 && isFiveCardTrick(hand2) == 1){
            return 0;
        }
        else if(isFiveCardTrick(hand1) == 1 )
        {
            return -1;
        }
        else if(isFiveCardTrick(hand2) == 1 )
        {
            return 1;
        }
        else if(aHandTotalling21(hand1) == 1 && aHandTotalling21(hand2) == 1){
            return 0;
        }
        else if(aHandTotalling21(hand1) == 1 )
        {
            return -1;
        }
        else if(aHandTotalling21(hand2) == 1 )
        {
            return 1;
        }
        else if(TotalValueOf20OrLess(hand1) == 0 && TotalValueOf20OrLess(hand2) == 0){
            return 0;
        }
        else if(TotalValueOf20OrLess(hand1) > TotalValueOf20OrLess(hand2) )
        {
            return -1;
        }
        else if(TotalValueOf20OrLess(hand1) < TotalValueOf20OrLess(hand2))
        {
            return 1;
        }
        return 0;
    }
}

