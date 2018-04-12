package com.sdj.blackjack;

import com.sdj.blackjack.Rules.Action;

public interface Strategy
{
    Action decide(int value, Card up, int count);
}
