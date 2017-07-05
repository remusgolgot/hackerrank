package hackerrank.challenges.algorithms.implementation.easy.breakingbestandworstrecords;

/**
 * Created by remus.golgot on 7/5/2017.
 * <p>
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records
 */

import java.util.Scanner;

public class Solution {

    private static int[] getRecord(int[] s) {
        int[] result = new int[2];
        int max = s[0];
        int min = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i] > max) {
                result[0]++;
                max = s[i];
            }
            if (s[i] < min) {
                result[1]++;
                min = s[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
