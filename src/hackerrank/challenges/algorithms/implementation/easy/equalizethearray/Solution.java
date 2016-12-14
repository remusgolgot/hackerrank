package hackerrank.challenges.algorithms.implementation.easy.equalizethearray;

/**
 * Created by remus.golgot on 12/14/2016.
 * <p>
 * https://www.hackerrank.com/challenges/equality-in-a-array
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int freqV[] = new int[101];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int elem = scanner.nextInt();
            freqV[elem]++;
            if (max < freqV[elem])
                max = freqV[elem];
        }
        System.out.println(n - max);

    }
}
