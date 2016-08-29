package hackerrank.challenges.algorithms.implementation.savetheprisoner;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner
 *
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        for (int i = 0; i < t; i++) {
            long nrPrisoners = scanner.nextLong();
            long nrSweet = scanner.nextLong();
            long start = scanner.nextLong();
            long result = (start + nrSweet - 1) % nrPrisoners;

            if (result == 0) {
                System.out.println(nrPrisoners);
            } else {
                System.out.println(result);
            }
        }
    }
}