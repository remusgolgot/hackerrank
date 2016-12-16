package leetcode.easy.reverseinteger;

/**
 * Created by remus.golgot on 12/16/2016.
 * <p>
 * https://leetcode.com/problems/reverse-integer/
 */

public class Solution {

    private static int reverse(int x) {

        long result = 0;
        while (x != 0) {
            result = 10 * result + x % 10;
            x = x / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}