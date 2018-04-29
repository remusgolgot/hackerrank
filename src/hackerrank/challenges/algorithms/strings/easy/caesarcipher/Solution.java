package hackerrank.challenges.algorithms.strings.easy.caesarcipher;

import java.util.Objects;
import java.util.Scanner;

public class Solution {

    private static String caesarCipher(String s, int k) {
        k = k % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i + 1);
            char cc = c.charAt(0);
            if (c.toLowerCase().charAt(0)<'a' || c.toLowerCase().charAt(0)>'z') {
                sb.append(c);
                continue;
            }
            if (Objects.equals(c, c.toLowerCase())) {
                if (cc + k <= 'z') {
                    sb.append((char) (cc + k));
                } else {
                    sb.append((char) (cc + k - 26));
                }
            }

            if (c != c.toLowerCase()) {
                if (cc + k <= 'Z') {
                    sb.append((char) (cc + k));
                } else {
                    sb.append((char) (cc + k - 26));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        String result = caesarCipher(s, k);
        System.out.println(result);
        in.close();
    }
}