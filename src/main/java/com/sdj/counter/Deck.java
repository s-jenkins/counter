package com.sdj.counter;

import com.sdj.counter.Card.Rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.sdj.counter.Card.*;
import static java.util.Collections.*;

public class Deck
{
    public final Counter counter;
    private List<Card> cards = new ArrayList<>();
    private final int packs;
    public Deck(int packs, Counter counter) {

        this.packs = packs;
        this.counter = counter;
        init(packs);
    }

    private void init(int packs) {

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
        shuffle(cards);
    }

    public Card up() {

        Card c = cards.remove(0);
        if (cards.size() == 0)
        {
            init(packs);
        }
        counter.count(c);
        return c;
    }

    public Card down() {

        Card c = cards.remove(0);
        if (cards.size() == 0)
        {
            init(packs);
        }
        counter.store(c);
        return c;
    }

}
