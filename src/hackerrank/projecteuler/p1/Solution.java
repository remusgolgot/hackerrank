package hackerrank.projecteuler.p1;

import java.util.Scanner;

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
        }

    }
}
