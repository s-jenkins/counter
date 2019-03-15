package com.sdj.rnd;

import static java.util.Arrays.asList;
import java.util.List;

public class Manager {

    public static int switches;
    private static Bet zero;
    private int current = 0;
    private int nextStake = 1;
    private Bet currentBet;
    private final int lossLimit;
    private int losses;
    private int n = 0;

    private List<Bet> bets;
    private final List<Bet> betsCopy;

    public Manager(List<Bet> bets, int limit) {
        this.bets = bets;
        this.betsCopy = bets;
        currentBet = bets.get(0);
        lossLimit = limit;
        zero = new Bet(i -> i == 0, bets.get(0).fund, 36, "Z");
    }

    public void init() {

        currentBet.setStake(nextStake);
    }

    public void close(int result) {

        currentBet.collect(result);
        if (currentBet.win) {
            losses = 0;
            nextStake = 1;
        }
        else {
            losses++;
            nextStake *= 2;
            if (losses > lossLimit) {
                System.out.print("-");
                switches++;
                nextStake = 0;
            }
        }
        nextBet();
    }

    private void nextBet() {

        int interval = 12;
        n = n == interval * 2 - 1 ? 0 : n++;
        current = n > interval - 1 ? 1 : 0;
        currentBet = bets.get(current);
    }
}
