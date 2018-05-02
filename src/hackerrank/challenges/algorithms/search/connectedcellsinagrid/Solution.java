package hackerrank.challenges.algorithms.search.connectedcellsinagrid;

import java.util.Scanner;

/**
 * Created by remus.golgot on 30/04/2018.
 * <p>
 * https://www.hackerrank.com/challenges/connected-cell-in-a-grid/problem
 */

public class Solution {

    private static int rows;
    private static int cols;

    private static int findLargestRegion(int[][] grid, int row, int col) {

        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            return 0;
        } else if (grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0;
        int size = 1;

        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (!(r == 0 && c == 0)) {
                    size += findLargestRegion(grid, r, c);
                }
            }
        }

        return size;
    }

    private static int connectedCell(int[][] matrix, int n, int m) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    int l = findLargestRegion(matrix, i, j);
                    if (l > max) max = l;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        rows = in.nextInt();
        cols = in.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int matrix_i = 0; matrix_i < rows; matrix_i++) {
            for (int matrix_j = 0; matrix_j < cols; matrix_j++) {
                matrix[matrix_i][matrix_j] = in.nextInt();
            }
        }
        int result = connectedCell(matrix, rows, cols);
        System.out.println(result);
        in.close();
    }
}
