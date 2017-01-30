package leetcode.easy.plusone;

import java.util.Arrays;

/**
 * Created by remus.golgot on 1/30/2017.
 * <p>
 * https://leetcode.com/problems/plus-one/
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{3, 5})));
        System.out.println(Arrays.toString(plusOne(new int[]{7, 7})));
        System.out.println(Arrays.toString(plusOne(new int[]{7, 9})));
    }

    private static int[] plusOne(int[] digits) {


        int i = digits.length - 1;
        while (i >= 0 && digits[i] == 9) {
            digits[i] = 0;
            i--;
        }
        if (i >= 0) digits[i]++;
        if (i < 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            int j = 1;
            while (j < res.length) {
                res[j] = 0;
                j++;
            }
            return res;
        }
        return digits;

    }
}
