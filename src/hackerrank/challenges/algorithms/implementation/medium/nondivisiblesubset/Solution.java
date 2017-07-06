package hackerrank.challenges.algorithms.implementation.medium.nondivisiblesubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author remus.golgot on 7/6/2017.
 *
 * https://www.hackerrank.com/challenges/non-divisible-subset
 */

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        int remainders[] = new int[k];
        Arrays.fill(remainders, 0);
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i <= n - 1; i++) {
            remainders[list.get(i) % k]++;
        }

        int subsetSize = 0;
        if (remainders[0] > 0) {
            subsetSize = 1;
        }

        if (k % 2 == 0 && remainders[k / 2] > 0) {
            subsetSize += 1;
            remainders[k / 2] = 0;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (remainders[i] > remainders[k - i])
                subsetSize += remainders[i];
            else
                subsetSize += remainders[k - i];
        }
        System.out.println(subsetSize);
    }
}
