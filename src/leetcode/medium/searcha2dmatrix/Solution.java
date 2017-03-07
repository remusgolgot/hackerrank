package leetcode.medium.searcha2dmatrix;

/**
 * Created by remus.golgot on 3/7/2017.
 * <p>
 * https://leetcode.com/problems/search-a-2d-matrix
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        if (matrix.length == 0 || matrix[0].length == 0 || target < matrix[0][0]) return false;

        while (i < matrix.length && matrix[i][0] <= target) {
            i++;
        }

        i--;
        int j = 0;
        while (j < matrix[0].length && matrix[i][j] < target) {
            j++;
        }
        return j < matrix[0].length && matrix[i][j] == target;


    }
}
