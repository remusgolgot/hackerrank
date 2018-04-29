package hackerrank.challenges.algorithms.strings.easy.palindromeindex;

import java.util.Scanner;

public class Solution {

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (!(s.charAt(i) == s.charAt(s.length() - i - 1))) {
                return false;
            }
        }
        return true;
    }

    private static int palindromeIndex(String s) {

        if (isPalindrome(s)) return -1;
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else
                break;
        }
        if (l > r) {
            return -1;
        }
        if (s.charAt(l) == s.charAt(r - 1)) {
            int q = r;
            r--;
            while (l < r) {
                if (s.charAt(l) == s.charAt(r)) {
                    l++;
                    r--;
                } else
                    break;
            }
            if (l >= r) {
                return q;
            } else return -1;
        }

        if (s.charAt(l + 1) == s.charAt(r)) {
            int q = l;
            l++;
            while (l < r) {
                if (s.charAt(l) == s.charAt(r)) {
                    l++;
                    r--;
                } else
                    break;
            }
            if (l >= r) {
                return q;
            } else return -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
