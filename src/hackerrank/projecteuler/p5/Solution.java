package hackerrank.projecteuler.p5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler005/problem

/**
 * Smallest Multiple
 * <p>
 * 2520 is the smallest number that can be divided by each of the numbers from to without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible(divisible with no remainder) by all the numbers from 1 to N?
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            Map<Integer, Integer> factors = new HashMap<>();
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    int nn = n;
                    int k = 0;
                    while (nn / i >= 1) {
                        k++;
                        nn = nn / i;
                    }
                    factors.put(i, k);
                }
            }
            int sol = 1;
            for (Integer i : factors.keySet()) {
                int q = factors.get(i);
                for (int j = 0; j < q; j++) {
                    sol = sol * i;
                }
            }
            System.out.println(sol);
        }
    }

    private static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}

