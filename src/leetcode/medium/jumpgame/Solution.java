package leetcode.medium.jumpgame;

/**
 * Created by remus.golgot on 1/29/2017.
 *
 *
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{1, 2, 3, 4, 5, 6, 0}));
    }

    private static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}