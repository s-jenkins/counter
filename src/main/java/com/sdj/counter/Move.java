package com.sdj.counter;

import com.sdj.counter.Rules.Action;

public class Move
{
    public final Action action;
    public final int value;
    public final Card down;
    public final int count;

    public Move(Action action, int value, Card down, int count)
    {
        this.action = action;
        this.down = down;
        this.count = count;
        this.value = value;
    }
}
