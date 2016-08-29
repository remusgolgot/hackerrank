package hackerrank.challenges.algorithms.implementation.strangecounter;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long t = in.nextLong();

        if (t == 1)
            System.out.println(3);
        if (t == 2)
            System.out.println(2);
        if (t == 3)
            System.out.println(1);
        if (t == 4)
            System.out.println(6);
        if (t == 5)
            System.out.println(5);
        if (t == 6)
            System.out.println(4);
        if (t == 7)
            System.out.println(3);
        if (t == 8)
            System.out.println(2);
        if (t == 9)
            System.out.println(1);

        if (t >= 10) {

            long t1 = t / 3;
            long x = largestPowerOf2LessThan(t1);
            long y = x * 3;
            long c = y - 2;
            System.out.println(y - (t - c));
        }

    }

    private static long largestPowerOf2LessThan(long n) {
        return (long) Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
    }
}
