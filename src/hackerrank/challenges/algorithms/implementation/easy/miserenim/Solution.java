package hackerrank.challenges.algorithms.implementation.easy.miserenim;

import java.util.Arrays;

/**
 * Created by remus.golgot on 2/17/2020.
 * <p>
 * https://www.hackerrank.com/challenges/misere-nim-1/problem
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(misereNim(new int[]{1, 1, 2}));
        System.out.println(misereNim(new int[]{1, 1, 1}));
        System.out.println(misereNim(new int[]{1, 1}));
    }

    // Complete the misereNim function below.
    private static String misereNim(int[] s) {
        if (Arrays.stream(s).sum() == s.length) {
            if (s.length % 2 == 0) {
                return "First";
            } else {
                return "Second";
            }
        }
        int k = s[0];
        for (int i = 1; i < s.length; i++) {
            k ^= s[i];
        }
        return (k == 0) ? "Second" : "First";
    }

}
