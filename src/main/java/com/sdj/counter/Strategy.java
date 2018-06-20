package com.sdj.counter;

import com.sdj.counter.Rules.Action;

public interface Strategy
{
    Action decide(Hand hand, Card up, int count);
}
