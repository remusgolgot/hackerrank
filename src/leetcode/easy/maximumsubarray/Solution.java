package leetcode.easy.maximumsubarray;

/**
 * Created by remus.golgot on 1/30/2017.
 *
 * https://leetcode.com/problems/maximum-subarray/
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int [] { 3, 2, -7, 4, 2, -1, -2, -3, }));
    }

    private static int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum < 0)
                sum = A[i];
            else
                sum += A[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
