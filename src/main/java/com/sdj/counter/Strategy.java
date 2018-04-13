package com.sdj.counter;

import com.sdj.counter.Rules.Action;

public interface Strategy
{
    Action decide(int value, Card up, int count);
}
