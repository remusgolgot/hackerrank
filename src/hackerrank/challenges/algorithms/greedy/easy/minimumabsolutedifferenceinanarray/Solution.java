package hackerrank.challenges.algorithms.greedy.easy.minimumabsolutedifferenceinanarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by remus.golgot on 02/05/2018.
 * <p>
 * https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
 */
public class Solution {

    private static int minimumAbsoluteDifference(int n, int[] arr) {
        Arrays.sort(arr);
        int minDiff = 1000000000;
        for (int i = 0; i < arr.length - 1; i++) {
            int currDiff = Math.abs(arr[i + 1] - arr[i]);
            if (currDiff < minDiff) {
                minDiff = currDiff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();

    }
}
