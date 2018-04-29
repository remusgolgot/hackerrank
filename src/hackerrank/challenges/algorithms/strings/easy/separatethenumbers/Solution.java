package hackerrank.challenges.algorithms.strings.easy.separatethenumbers;

import java.util.Scanner;

public class Solution {

    private static void separateNumbers(String s) {
        if (s.length() == 1 || s.startsWith("0")) {
            System.out.println("NO");
            return;
        }
        for (int i = 1; i <= s.length() / 2; i++) {
            String s1 = s.substring(0, i);
            long t = Long.parseLong(s1);
            String rem = s.substring(i);
            long k = 1;
            while (rem.length() > 0) {
                String s2 = Long.toString(t + k);
                if (!rem.startsWith(s2)) {
                    break;
                }
                rem = rem.substring(s2.length());
                k++;
            }
            if (rem.length() == 0) {
                System.out.println("YES " + t);
                return;
            }
        }
        System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            separateNumbers(s);
        }
        in.close();
    }
}

