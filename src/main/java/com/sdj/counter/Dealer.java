package com.sdj.counter;

import com.sdj.counter.model.Card;
import com.sdj.counter.model.Hand;

import static com.sdj.counter.Rules.*;
import static com.sdj.counter.Rules.Action.*;

public class Dealer implements Strategy
{

    public Action decide(int value, Card up, int count)
    {
        if (value > 21) {
            return null; //BUST;
        }
        if (value < 17) {
            return HIT;
        }
        return STAND;
    }

    @Override
    public Action decide(Hand hand, Card up, int count) {
        return null;
    }
}
