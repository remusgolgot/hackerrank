package hackerrank.challenges.algorithms.strings.easy.camelcase;

import java.util.Scanner;

/**
 * Created by remus.golgot on 7/6/2017.
 * <p>
 * https://www.hackerrank.com/challenges/camelcase
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).toUpperCase().equals(s.substring(i, i + 1))) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}
