package com.sdj.counter;

import com.sdj.counter.model.Card;
import com.sdj.counter.model.Deck;
import com.sdj.counter.model.Hand;

import static com.sdj.counter.Counter.HIGH_LOW;
import static java.util.Arrays.stream;

public class Controller
{
    public static void main(String[] p) {

        Counter counter = new Counter(HIGH_LOW);
        Deck deck = new Deck(6, counter);
        Hand p1 = new Hand(new RandomPick());
        Hand d = new Hand(new Dealer());

        p1.init(deck.up(), deck.up());
        d.init(deck.down(), deck.up());

        System.out.println("P: " + p1);
        System.out.println("d: " + d);
        System.out.println("(" + counter.value + ")");



    }

    private static void out(Counter counter, Card... cards) {

        stream(cards).forEach(c -> System.out.print(" " + c));
        System.out.println(" " + counter.value);
    }


}
