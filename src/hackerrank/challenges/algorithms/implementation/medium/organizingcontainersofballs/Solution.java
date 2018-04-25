package hackerrank.challenges.algorithms.implementation.medium.organizingcontainersofballs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author remus.golgot on 25/4/2018.
 * <p>
 * https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem
 */

public class Solution {

    private static String organizingContainers(int[][] container, int n) {
        int horizSums[] = new int[n];
        int vertSums[] = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                horizSums[i] += container[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vertSums[i] += container[j][i];
            }
        }
//         for (int i=0;i<n;i++) {
//             System.out.println(horizSums[i]);
//         }

//         for (int i=0;i<n;i++) {
//             System.out.println(vertSums[i]);
//         }

        Arrays.sort(horizSums);
        Arrays.sort(vertSums);

        for (int i = 0; i < n; i++) {
            if (horizSums[i] != vertSums[i]) {
                return "Impossible";
            }
        }

        return "Possible";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int[][] container = new int[n][n];
            for (int container_i = 0; container_i < n; container_i++) {
                for (int container_j = 0; container_j < n; container_j++) {
                    container[container_i][container_j] = in.nextInt();
                }
            }
            String result = organizingContainers(container, n);
            System.out.println(result);
        }
        in.close();
    }
}
