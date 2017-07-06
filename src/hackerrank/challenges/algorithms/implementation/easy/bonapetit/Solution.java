package hackerrank.challenges.algorithms.implementation.easy.bonapetit;

/**
 * Created by remus.golgot on 7/6/2017.
 * <p>
 * https://www.hackerrank.com/challenges/bon-appetit
 */

import java.util.Scanner;

public class Solution {

    private static int bonAppetit(int n, int k, int b, int[] ar) {
        int sum = 0;
        for (int anAr : ar) {
            sum += anAr;
        }
        sum -= ar[k];
        int split = sum / 2;
        return b - split;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        System.out.println(result > 0 ? result : "Bon Appetit");
    }
}

