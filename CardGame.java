package com.bbc;

// Nomaan Khan Razaq


import java.util.ArrayList;

public abstract class CardGame {
    public int number_of_players;
    public ArrayList<Player> players;
    public Deck d;
    CardGame(int nplayers)
    {
        number_of_players = nplayers;
        players = new ArrayList<>();

        String playerName = "Player_";
        String temp;
        for(int i = 0; i < nplayers ; i++)
        {
            temp = playerName + Integer.toString(i+1);
            players.add(new Player(temp));
        }

        d = new Deck();
    }
    public abstract void dealInitialCards();
    public abstract int compareHands(Player hand1, Player hand2);
    public Deck getDeck()
    {
        return d;
    }
    public Player getPlayer(int i)
    {
        return players.get(i);
    }
    public int getNumPlayers()
    {
        return number_of_players;
    }


}



