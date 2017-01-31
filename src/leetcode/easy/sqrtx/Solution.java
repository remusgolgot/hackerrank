package leetcode.easy.sqrtx;

/**
 * Created by remus.golgot on 1/30/2017.
 *
 * https://leetcode.com/problems/sqrtx
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(mySqrt(52));
    }

    private static int mySqrt(int x) {

        if (x <= 0) return x;

        int left = 1, right = x, ans = 0 ;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;

    }
}