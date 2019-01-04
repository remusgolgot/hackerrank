package hackerrank.challenges.algorithms.greedy.easy.pryiankaandtoys;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by remus.golgot on 04/05/2018.
 * <p>
 * https://www.hackerrank.com/challenges/priyanka-and-toys/problem
 */

public class Solution {

    private static int toys(int[] w) {
        int nrContainers = 1;
        Arrays.sort(w);

        int i = 1;
        int curr = w[0];
        while (i < w.length) {
            if (w[i] - curr <= 4) {
                i++;
            } else {
                nrContainers++;
                curr = w[i];
            }
        }

        return nrContainers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[n];
        for (int w_i = 0; w_i < n; w_i++) {
            w[w_i] = in.nextInt();
        }
        int result = toys(w);
        System.out.println(result);
        in.close();
    }
}


