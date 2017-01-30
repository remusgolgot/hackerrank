package leetcode.easy.searchinsertposition;

/**
 * Created by remus.golgot on 1/26/2017.
 *
 * https://leetcode.com/problems/search-insert-position/
 */

public class Solution {

    private static int searchInsert(int[] nums, int target) {
        int i=0;
        while (i< nums.length && nums[i] <= target) i++;
        if (i>=1 && nums[i-1] == target) {
            return i - 1;
        } else {
            return i;
        }

    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] { 1, 2, 3 ,4 }, 4));
        System.out.println(searchInsert(new int[] { 1 }, 0));
        System.out.println(searchInsert(new int[] { 1, 2, 3 ,4 }, 5));
    }
}
