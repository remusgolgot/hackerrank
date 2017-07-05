package hackerrank.challenges.algorithms.implementation.easy.betweentwosets;

import java.util.Scanner;

/**
 * Created by remus.golgot on 7/5/2017.
 * <p>
 * https://www.hackerrank.com/challenges/between-two-sets
 */

public class Solution {

    private static final int MAX = 101;

    static int getTotalX(int[] a, int[] b) {
        int s = 0;
        boolean boo;
        for (int k = 1; k < MAX; k++) {
            boo = true;
            for (int anA : a) {
                if (k % anA > 0) {
                    boo = false;
                }
            }
            for (int j = 0; boo && j < b.length; j++) {
                if (b[j] % k > 0) {
                    boo = false;
                }
            }
            if (boo) s++;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
