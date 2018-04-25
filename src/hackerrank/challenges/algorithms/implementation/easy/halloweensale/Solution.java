package hackerrank.challenges.algorithms.implementation.easy.halloweensale;

import java.util.Scanner;

/**
 * @author remus.golgot on 25/4/2018.
 * <p>
 * https://www.hackerrank.com/challenges/halloween-sale/problem
 */

public class Solution {

    private static int howManyGames(int startPrice, int delta, int minimum, int dollars) {
        int k = 0;
        int currentPrice = startPrice;
        while (dollars >= currentPrice) {
            k++;
            dollars -= currentPrice;
            if (currentPrice - delta >= minimum) {
                currentPrice = currentPrice - delta;
            } else {
                currentPrice = minimum;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
    }
}

