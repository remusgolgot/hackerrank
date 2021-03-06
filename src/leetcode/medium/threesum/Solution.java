package leetcode.medium.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by remus.golgot on 3/6/2017.
 * <p>
 * https://leetcode.com/problems/3sum
 */
public class Solution {


    public static void main(String[] args) {
        List list = threeSum(new int[]{1, 7, 8, 9, -4, -4});
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) return result;
        Arrays.sort(nums);
        int i = 0;

        while (i < nums.length - 2) {

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if (sum <= 0) while (nums[j] == nums[++j] && j < k) ;
                if (sum >= 0) while (nums[k--] == nums[k] && j < k) ;
            }
            while (nums[i] == nums[++i] && i < nums.length - 2) ;
        }
        return result;
    }
}
