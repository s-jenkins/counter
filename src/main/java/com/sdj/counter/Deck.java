package com.sdj.counter;

import com.sdj.counter.Card.Rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sdj.counter.Card.*;

public class Deck
{
    public final Counter counter;
    private final List<Card> cards;
    public Deck(int packs, Counter counter) {

        this.counter = counter;

        cards = new ArrayList<Card>();
        for (int i = 0; i < packs; i++)
        {
            for (Rank rank : Rank.values())
            {
                for (Suit suit : Suit.values())
                {
                    cards.add(new Card(rank, suit));
                }
            }
        }
        Collections.shuffle(cards);
    }

    public Card up() {

        Card c = cards.remove(0);
        counter.count(c);
        return c;
    }

    public Card down() {

        Card c = cards.remove(0);
        counter.store(c);
        return c;
    }

}
