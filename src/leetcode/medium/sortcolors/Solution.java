package leetcode.medium.sortcolors;

import java.util.Arrays;

/**
 * Created by remus.golgot on 2/7/2017.
 * <p>
 * https://leetcode.com/problems/sort
 */
 
public class Solution {
    public void sortColors(int[] nums) {
        int v[] = new int[3];
        
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 0) v[0] ++;
            if (nums[i] == 1) v[1] ++;
            if (nums[i] == 2) v[2] ++;
        }
        int k = 0;
        for (int i = 0; i < v[0]; i++) {
            nums[k++] = 0;
        }    
        
        for (int i = 0; i < v[1]; i++) {
            nums[k++] = 1;
        }    
        
        for (int i = 0; i < v[2]; i++) {
            nums[k++] = 2;
        }    
    }
}
