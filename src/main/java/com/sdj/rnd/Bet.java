package com.sdj.rnd;

import java.util.function.Predicate;

public class Bet {

    private Integer currentStake;
    public Boolean win;
    private Predicate won;
    final Fund fund;
    private final int odds;
    public int taken;
    public int given;
    private final String symbol;

    public Bet(Predicate<Integer> won, Fund fund, int odds, String symbol) {
        this.fund = fund;
        this.odds = odds;
        this.won = won;
        this.symbol = symbol;
    }

    public void setStake(int stake) {
        this.currentStake = stake;
        fund.add(-stake);
        taken += stake;
        win = null;
    }

    public void collect(int result) {

        win = won.test(result);
        if (win) {
            int collect = currentStake * odds;
            fund.add(collect);
            given += collect;
        }
        currentStake = null;
    }
}
