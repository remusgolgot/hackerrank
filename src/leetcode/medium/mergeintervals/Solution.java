package leetcode.medium.mergeintervals;

/**
 * Created by remus.golgot on 04/26/2020.
 * Solution for the Merge Intervals problem
 */
class Solution {

    public static void main(String[] args) {
        int[][] input = new int[4][2];
        input[0][0] = 1;
        input[0][1] = 3;

        input[1][0] = 2;
        input[1][1] = 6;

        input[2][0] = 8;
        input[2][1] = 10;

        input[3][0] = 15;
        input[3][1] = 18;
        merge(input);
    }

    public static void merge(int[][] intervals) {
        int curMin = intervals[0][0];
        int curMax = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > curMax) {
                System.out.println(curMin + "  " + curMax);
                curMin = intervals[i][0];
                curMax = intervals[i][1];
            } else {
                if (curMax < intervals[i][1]) {
                    curMax = intervals[i][1];
                }
            }
        }
        System.out.println(curMin + " " + curMax);
    }
}