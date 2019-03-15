package com.sdj.counter.model;

import com.sdj.counter.Move;
import com.sdj.counter.Rules.Action;
import com.sdj.counter.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Hand implements Comparable<Hand>
{
    private final Strategy strategy;
    private List<Card> cards = new ArrayList<>();
    public int high;
    public int low;
    public List<Move> moves = new ArrayList<>();

    public Hand(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void init(Card c1, Card c2)
    {
        cards.clear();
        accept(c1);
        accept(c2);
    }

    private void accept(Card c)
    {
        if (aceCount() == 0) {
           // values.get(0) += c.rank.val;
        }
        cards.add(c);
    }

    public Action move(List<Action> actions, Card down) {

        return null;
    }

    public void outcome(boolean win) {

    }

    @Override
    public int compareTo(Hand o)
    {
        return 0;
    }

    public String toString() {

        StringBuilder hand = new StringBuilder();
        cards.forEach(c -> hand.append(c.toString()));
        return hand.toString();
    }

    public boolean isSplitable() {

        return cards.size() == 2 && cards.get(0).rank.out == cards.get(1).rank.out;
    }

    public long aceCount() {

        return cards.stream().filter(c -> c.rank.equals(Card.Rank.ACE)).count();
    }
}
