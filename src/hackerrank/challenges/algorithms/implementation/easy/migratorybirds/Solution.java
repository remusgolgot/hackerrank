package hackerrank.challenges.algorithms.implementation.easy.migratorybirds;

import java.util.Scanner;

/**
 * Created by remus.golgot on 7/5/2017.
 * <p>
 * https://www.hackerrank.com/challenges/migratory-birds
 */

public class Solution {

    private static int migratoryBirds(int n, int[] ar) {
        int[] typeFreq = new int[5];
        for (int anAr : ar) {
            typeFreq[anAr - 1]++;
        }
        int max = typeFreq[0];
        int pos = 0;
        for (int i = 1; i < 5; i++) {
            if (typeFreq[i] > max) {
                max = typeFreq[i];
                pos = i;
            }
        }

        return pos + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
