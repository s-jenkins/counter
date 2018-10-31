package com.sdj.counter;

import com.sdj.counter.Rules.Action;
import com.sdj.counter.model.Card;
import com.sdj.counter.model.Hand;

public interface Strategy
{
    Action decide(Hand hand, Card up, int count);
}
