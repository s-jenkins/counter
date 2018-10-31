package com.sdj.counter;

import com.sdj.counter.Rules.Action;
import com.sdj.counter.model.Card;
import com.sdj.counter.model.Hand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPick implements Strategy
{
    private static Random random = new Random();
    @Override
    public Action decide(Hand hand, Card up, int count)
    {
        List<Action> actions = new ArrayList<>();
        actions.add(Action.HIT);
        actions.add(Action.STAND);
        actions.add(Action.DOUBLE);
        if (hand.isSplitable()) {
            actions.add(Action.SPLIT);
        }
        return actions.get(random.nextInt(actions.size()));
    }
}
