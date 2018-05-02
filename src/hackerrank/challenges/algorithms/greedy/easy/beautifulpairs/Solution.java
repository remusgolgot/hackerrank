package hackerrank.challenges.algorithms.greedy.easy.beautifulpairs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by remus.golgot on 02/05/2018.
 * <p>
 * https://www.hackerrank.com/challenges/beautiful-pairs/problem
 */
public class Solution {

    private static int beautifulPairs(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int k = 0;
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {

            if (A[i] == B[j]) {
                k++;
                i++;
                j++;
                continue;
            }
            if (A[i] > B[j]) {
                j++;
                continue;
            }
            if (A[i] < B[j]) {
                i++;
            }

        }

        return Math.min(k + 1, A.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for (int B_i = 0; B_i < n; B_i++) {
            B[B_i] = in.nextInt();
        }
        int result = beautifulPairs(A, B);
        System.out.println(result);
        in.close();
    }
}

