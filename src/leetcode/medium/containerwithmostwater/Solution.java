package leetcode.medium.containerwithmostwater;

/**
 * Created by remus.golgot on 12/16/2016.
 * <p>
 * https://leetcode.com/problems/container-with-most-water/
 */
public class Solution {

    private static int maxArea(int[] height) {
        int area = -1;
        int i = 0;
        int j = height.length - 1;
        while (i <= j) {
            int min = height[i] < height[j] ? height[i] : height[j];
            int arPart = (j - i) * min;
            if (area < arPart) {
                area = arPart;
            }
            if (height[i] < height[j])
                i++;
            else
                j--;
        }

        return area;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{7, 1, 1, 50, 50, 1, 1, 7}));
    }


}
