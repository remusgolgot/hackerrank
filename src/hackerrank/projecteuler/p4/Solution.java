package hackerrank.projecteuler.p4;

import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler004/problem

/**
 * Largest palindrome product
 * <p>
 * A palindromic number reads the same both ways.
 * The smallest 6 digit palindrome made from the product of two 3-digit numbers is 101101 = 143 x 707.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers which is less than N.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            for (int i = n - 1; i >= 100000; i--) {
                if (isPalindrome(i)) {
                    if (isProduct(i)) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }

    private static boolean isProduct(int nr) {
        for (int i = 100; i < 999; i++) {
            if (nr % i == 0 && nr / i >= 100 && nr / i <= 999) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPalindrome(int nr) {
        String s = Integer.toString(nr);
        String t = new StringBuilder(s).reverse().toString();
        return s.equals(t);
    }

}
