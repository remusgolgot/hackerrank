package hackerrank.contests.weekofcode.duplication;

import java.util.Scanner;


/**
 * https://www.hackerrank.com/contests/w32/challenges/duplication
 */

public class Solution {

    private static String s = "";

    private static String duplication(int x) {
        return s.substring(x, x+1);
    }

    private static String generate() {
        String st = "0";
        for (int i = 0; i < 3; i++) {
            String t = "";
            for (int j = 0; j < st.length(); j++) {
                if (st.charAt(j) == '0') {
                    t = t + "1";
                } else {
                    t = t + "0";
                }
            }
            st = st + t;

        }

        return st;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        s = generate();
        System.out.println(s);
        for (int a0 = 0; a0 < q; a0++) {
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }
}
