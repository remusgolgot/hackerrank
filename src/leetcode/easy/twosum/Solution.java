package leetcode.easy.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by remus on 12/17/2016.
 * <p>
 * https://leetcode.com/problems/two-sum/
 */
public class Solution {

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> partMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (partMap.containsKey(target - nums[i])) {
                result[0] = partMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            partMap.put(nums[i], i);
        }
        return new int[1];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 6, 8, 9}, 17)));
    }
}
