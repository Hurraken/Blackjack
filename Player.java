package com.bbc;

// Nomaan Khan Razaq



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Player {
    private String name;
    private ArrayList<Card> cards = new ArrayList<>();
    public Player(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void dealToPlayer(Card card)
    {
        ArrayList<Integer> arr = getNumericalHandValue();
        boolean check = false;
        boolean allgreaterthan21 = true;
        if(getHandSize() > 1) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) >= 16 && arr.get(i) <= 21)
                    check = true;
                if (arr.get(i) <= 21)
                    allgreaterthan21 = false;
            }
            if (check == true)
                ;
            else if (allgreaterthan21 == true)
                ;
            else
                cards.add(card);
        }
        else
            cards.add(card);
    }
    public void removeCard(Card card)
    {
        cards.remove(card);
    }
    public ArrayList<Card> getCards()
    {
        return cards;
    }
    public int getHandSize()
    {
        return cards.size();
    }
    public int getBestNumericalHandValue()
    {
        int sum = 0;
        ArrayList<Integer> a;
        for(int i = 0; i < cards.size(); i++)
        {
            if(cards.get(i).getValue() == Card.Value.ACE)
            {
                a =  cards.get(i).getNumericalValue();
                sum = sum + a.get(1);
            }
            else
            {
                a =  cards.get(i).getNumericalValue();
                sum = sum + a.get(0);
            }
        }
        return sum;
    }
    public ArrayList<Integer> getNumericalHandValue()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> returnedArr = new ArrayList<>();
        for(int i = 0; i < cards.size(); i++)
        {
            if(cards.get(i).getValue() == Card.Value.ACE)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j = 0; j < arr.size(); j++)
                {
                    temp.add(arr.get(j)+11);
                    temp.add(arr.get(j)+1);
                }
                arr.clear();
                arr.addAll(temp);
                if(arr.size()== 0)
                {
                    returnedArr =  cards.get(i).getNumericalValue();
                    arr.add(returnedArr.get(0));
                    arr.add(returnedArr.get(1));
                }
            }
            else
            {
                for(int j = 0; j < arr.size(); j++)
                {
                    returnedArr =  cards.get(i).getNumericalValue();
                    arr.set(j, returnedArr.get(0) + arr.get(j));
                }
                if(arr.size()== 0)
                {
                    returnedArr =  cards.get(i).getNumericalValue();
                    arr.add(returnedArr.get(0));
                }
            }
        }
        Collections.sort(arr);
        List<Integer> deduped = arr.stream().distinct().collect(Collectors.toList());
        return (ArrayList<Integer>) deduped;
    }
}



