package com.sdj.blackjack;

import static com.sdj.blackjack.Rules.*;
import static com.sdj.blackjack.Rules.Action.*;

public class Dealer implements Strategy
{
    @Override
    public Action decide(int value, Card up, int count)
    {
        if (value > 21) {
            return BUST;
        }
        if ()
        if (value < 17) {
            return HIT;
        }
        return STAND;
    }
}
