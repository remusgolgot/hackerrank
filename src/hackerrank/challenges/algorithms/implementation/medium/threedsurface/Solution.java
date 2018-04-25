package hackerrank.challenges.algorithms.implementation.medium.threedsurface;

import java.util.Scanner;

/**
 * @author remus.golgot on 25/4/2018.
 * <p>
 * https://www.hackerrank.com/challenges/3d-surface-area/problem
 */

public class Solution {

    private static int surfaceArea(int[][] A, int H, int W) {
        int top = H * W;
        int bottom = H * W;
        int left = 0;
        int front = 0;
        int right = 0;
        int back = 0;

        //left
        for (int i = 0; i < H; i++) {
            left += A[i][0];
            for (int j = 1; j < W; j++) {
                if (A[i][j] > A[i][j - 1]) {
                    left += A[i][j] - A[i][j - 1];
                }
            }
        }

        //right
        for (int i = 0; i < H; i++) {
            right += A[i][W - 1];
            for (int j = W - 2; j >= 0; j--) {
                if (A[i][j] > A[i][j + 1]) {
                    right += A[i][j] - A[i][j + 1];
                }
            }
        }

        //front
        for (int j = 0; j < W; j++) {
            front += A[0][j];
            for (int i = 1; i < H; i++) {
                if (A[i][j] > A[i - 1][j]) {
                    front += A[i][j] - A[i - 1][j];
                }
            }
        }

        //back
        for (int j = 0; j < W; j++) {
            back += A[H - 1][j];
            for (int i = H - 2; i >= 0; i--) {
                if (A[i][j] > A[i + 1][j]) {
                    back += A[i][j] - A[i + 1][j];
                }
            }
        }


        // System.out.println("left = " + left);
        // System.out.println("right = " + right);
        // System.out.println("front = " + front);
        // System.out.println("back = " + back);

        return top + bottom + left + right + front + back;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H][W];
        for (int A_i = 0; A_i < H; A_i++) {
            for (int A_j = 0; A_j < W; A_j++) {
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A, H, W);
        System.out.println(result);
        in.close();
    }
}
