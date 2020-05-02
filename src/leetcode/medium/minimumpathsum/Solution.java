package leetcode.medium.minimumpathsum;

/**
 * Created by remus on 3/9/2017.
 * <p>
 * https://leetcode.com/problems/minimum-path-sum
 */
public class Solution {

    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        grid[0][0] = 1;
        grid[0][1] = 3;
        grid[0][2] = 1;

        grid[1][0] = 1;
        grid[1][1] = 5;
        grid[1][2] = 1;

        grid[2][0] = 4;
        grid[2][1] = 2;
        grid[2][2] = 1;
        System.out.println(minimumPathSum(grid));
    }

    private static int minimumPathSum(int[][] a) {

        int m = a.length, n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) a[i][j] += a[i][j - 1];
                if (i != 0 && j == 0) a[i][j] += a[i - 1][j];
                if (i != 0 && j != 0) a[i][j] += Math.min(a[i - 1][j], a[i][j - 1]);
            }
        }
        return a[m - 1][n - 1];
    }
}
