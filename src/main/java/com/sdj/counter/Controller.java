package com.sdj.counter;

import static com.sdj.counter.Counter.HIGH_LOW;
import static java.util.Arrays.stream;

public class Controller
{
    public static void main(String[] p) {

        Deck deck = new Deck(2, new Counter(HIGH_LOW));
        Hand p1 = new Hand(new RandomPick());
        Hand d = new Hand(new Dealer());

    }

    private static void out(Counter counter, Card... cards) {

        stream(cards).forEach(c -> System.out.print(" " + c));
        System.out.println(" " + counter.value);
    }


}
