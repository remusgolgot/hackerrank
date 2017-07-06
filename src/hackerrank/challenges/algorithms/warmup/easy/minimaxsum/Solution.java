package hackerrank.challenges.algorithms.implementation.easy.minimaxsum;

/**
 * Created by remus.golgot on 12/14/2016.
 * <p>
 * https://www.hackerrank.com/challenges/mini-max-sum
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long min = 1000000001L;
        long max = 1L;

        if (a <= b && a <= c && a <= d && a <= e) min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        if (min > d) min = d;
        if (min > e) min = e;

        if (a >= b && a >= c && a >= d && a >= e) max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;
        if (max < e) max = e;

        System.out.println((a + b + c + d + e - max) + " " + (a + b + c + d + e - min));

    }
}

