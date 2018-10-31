package com.sdj.counter;

import com.sdj.counter.model.Card;

import static com.sdj.counter.Rules.*;
import static com.sdj.counter.Rules.Action.*;

public class Dealer implements Strategy
{
    @Override
    public Action decide(int value, Card up, int count)
    {
        if (value > 21) {
            return BUST;
        }
        if (value < 17) {
            return HIT;
        }
        return STAND;
    }
}
