package leetcode.easy.removeelement;

/**
 * Created by remus on 1/7/2017.
 * <p>
 * https://leetcode.com/problems/remove-element/
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;
        int l = nums.length;
        for (int i = 0; i < nums.length - k; i++) {
            if (i < l && nums[i] == val) {
                k++;
                int aux = nums[i];
                nums[i] = nums[l - k];
                nums[l - k] = aux;
                i--;
            }
        }
        return l - k;

    }
}
