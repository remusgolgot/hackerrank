package hackerrank.challenges.algorithms.implementation.medium.larrysarray;

import java.util.Scanner;

/**
 * @author remus.golgot on 25/4/2018.
 * <p>
 * https://www.hackerrank.com/challenges/larrys-array/problem
 */

public class Solution {

    //https://en.wikipedia.org/wiki/Inversion_(discrete_mathematics)

    private static String larryArray(int[] A) {
        int inv = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) inv++;
            }
        }

        return (inv % 2 == 0) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int[] A = new int[n];
            for (int A_i = 0; A_i < n; A_i++) {
                A[A_i] = in.nextInt();
            }
            String result = larryArray(A);
            System.out.println(result);
        }
        in.close();
    }
}

