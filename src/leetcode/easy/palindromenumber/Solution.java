package leetcode.easy.palindromenumber;

/**
 * Created by remus.golgot on 12/16/2016.
 * <p>
 * https://leetcode.com/problems/palindrome-number/
 */

public class Solution {

    private static boolean isPalindrome(int x) {
        int y = 0;
        int z = x;
        while (x > 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return z == y;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(7778777));
    }
}
