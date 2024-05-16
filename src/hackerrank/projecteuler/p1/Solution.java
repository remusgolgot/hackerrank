package hackerrank.projecteuler.p1;

import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem

/**
 * Multiples of 3 and 5
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9
 * The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below N.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong() - 1;
            long n3 = n / 3;
            long n5 = n / 5;
            long n15 = n / 15;
            long m3 = 3 * (n3 * (n3 + 1) / 2);
            long m5 = 5 * (n5 * (n5 + 1) / 2);
            long m15 = 15 * (n15 * (n15 + 1) / 2);
            System.out.println(m3 + m5 - m15);
            System.out.println(m3);
            System.out.println(m5);
            System.out.println(m15);
        }

    }
}
