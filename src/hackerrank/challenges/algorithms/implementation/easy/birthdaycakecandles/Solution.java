package hackerrank.challenges.algorithms.implementation.easy.birthdaycakecandles;

import java.util.Scanner;

/**
 * Created by remus.golgot on 7/5/2017.
 *
 * https://www.hackerrank.com/challenges/birthday-cake-candles
 */

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int max = -1;
        int nr = 0;
        for (int i=0;i<ar.length;i++) {
            if (max==ar[i]) nr++;
            if (max<ar[i]) { nr = 1; max=ar[i]; }
        }
        return nr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
