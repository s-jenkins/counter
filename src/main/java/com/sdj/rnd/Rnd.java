package com.sdj.rnd;

import static java.util.Arrays.asList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Rnd {

    private static Random rnd = new Random();
    private static Set<Integer> reds = new HashSet<>(asList(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36));

    public static void main(String[] args) {

        Fund fund = new Fund(10000);
        Bet red = new Bet(i -> reds.contains(i), fund, 2, "r");
        Bet black = new Bet(i -> i > 0 && !reds.contains(i), fund, 2, "b");
        Bet even = new Bet(i -> i > 0 && i % 2 == 0, fund, 2, "e");
        Bet odd = new Bet(i -> i != 0 && i % 2 == 1, fund, 2, "o");
        Bet high = new Bet(i -> i > 18, fund, 2, "h");
        Bet low = new Bet(i -> i > 0 && i < 19, fund, 2, "l");

        int limit = 30;

        Manager[] managers =
                {
                        new Manager(asList(black, red), limit),
                        new Manager(asList(odd, even), limit),
                        new Manager(asList(high, low), limit)
                };

        //System.out.println(fund);
        int j = 20;
        while (j-- > 0) {
            fund.reset();
            int i = 1000;
            while (i-- > 0) {
                int n = rnd.nextInt(37);

                for (Manager manager : managers) {
                    manager.init();
                    manager.close(n);
                }
                //System.out.printf(" %s ", n);
                //System.out.println(fund);
            }
            System.out.println(fund);
        }
    }


}
