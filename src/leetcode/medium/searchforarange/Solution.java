package leetcode.medium.searchforarange;

import java.util.Arrays;

/**
 * Created by remus.golgot on 2/7/2017.
 * <p>
 * https://leetcode.com/problems/search-for-a-range/
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{4, 5, 7, 8, 8, 8, 8, 8, 9, 10}, 8)));
    }

    private static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int loc = binarySearch(nums, 0, nums.length - 1, target);
        int l = loc, r = loc;

        while (loc > 0 && nums[--loc] == target) {
            l--;
        }

        loc = r;
        while (loc < nums.length - 1 && nums[++loc] == target) {
            r++;
        }

        return new int[]{l, r};
    }

    private static int binarySearch(int[] nums, int l, int r, int target) {

        if (r < l) return -1;
        int mid = l + (r - l) / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, r, target);
        }
        if (nums[mid] > target) {
            return binarySearch(nums, l, mid - 1, target);
        }
        return -1;
    }

}
