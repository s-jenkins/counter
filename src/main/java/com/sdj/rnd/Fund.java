package com.sdj.rnd;

import static java.lang.String.format;
import java.util.ArrayList;
import java.util.List;

public class Fund {

    public final List<Integer> history = new ArrayList<>();
    private int transaction;
    private int balance;
    private int init;
    public int max;
    public int min;

    public Fund(int balance) {
        this.balance = balance;
        this.init = balance;
        reset();
    }

    public void add(int value) {
        transaction++;
        balance += value;
        history.add(value);
        max = Math.max(balance, max);
        min = Math.min(balance, min);
    }

    @Override
    public String toString() {
        return format("#%s %s, %s, %s", transaction, balance, max, min);
    }

    public void reset() {
        this.balance = init;
        this.max = Integer.MIN_VALUE;
        this.min = Integer.MAX_VALUE;
    }
}
