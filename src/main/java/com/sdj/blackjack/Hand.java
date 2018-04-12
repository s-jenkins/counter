package com.sdj.blackjack;

import com.sdj.blackjack.Rules.Action;

import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand>
{
    private final Strategy strategy;
    private List<Card> cards = new ArrayList<>();
    public int value = 0;
    public int score;
    public boolean isSoft = false;
    public boolean isBust = false;
    public List<Move> moves = new ArrayList<>();

    public Hand(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void init(Card c1, Card c2)
    {
        value = 0;
        cards.clear();
        accept(c1);
        accept(c2);
    }

    private void accept(Card c)
    {

        value += c.rank.val;
        cards.add(c);

    }

    public Action move(List<Action> actions, Card down) {

    }

    public void outcome(boolean win) {

    }

    @Override
    public int compareTo(Hand o)
    {
        return 0;
    }
}
