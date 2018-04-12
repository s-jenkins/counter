package com.sdj.blackjack;

import com.sdj.blackjack.Rules.Action;

import java.util.ArrayList;
import java.util.List;

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
