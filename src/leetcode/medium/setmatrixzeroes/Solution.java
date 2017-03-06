package leetcode.medium.setmatrixzeroes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remus.golgot on 3/6/2017.
 * <p>
 * https://leetcode.com/problems/set-matrix-zeroes
 */
public class Solution {

    public static void main(String[] args) {

    }

    public static void setZeroes(int[][] matrix) {
        List<Integer> rowsList = new ArrayList<>();
        List<Integer> colsList = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowsList.add(i);
                    colsList.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (rowsList.contains(i)) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (colsList.contains(i)) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
