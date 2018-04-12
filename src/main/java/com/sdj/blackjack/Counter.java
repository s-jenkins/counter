package com.sdj.blackjack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sdj.blackjack.Card.*;

public class Counter
{
    public static int[] HIGH_LOW = {-1, 1, 1, 1, 1, 1, 0, 0, 0, -1};

    private final Map<Card.Rank, Integer> lookup = new HashMap<>();
    public int value = 0;
    private Card store;
    private final int[] values;

    public Counter(int[] values) {

        if (values.length != 10)
            throw new RuntimeException("lookup does not contain 10 items");

        this.values = values;
    }

    public void count(Card card) {

        int count = values[card.rank.val - 1];
        value += count;
    };

    public void reset() {
        value = 0;
    };

    public void store(Card c) {

        if (store != null) {
            count(store);
        }
        store = c;
    }

}
