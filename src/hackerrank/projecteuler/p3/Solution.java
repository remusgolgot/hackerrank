package hackerrank.projecteuler.p3;

import java.util.*;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler003/problem

/**
 * Largest prime factor
 * <p>
 * The prime factors of 13195 are 5,7,13 and 29.
 * <p>
 * What is the largest prime factor of a given number ?
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            long l = n;
            for (long i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (isPrime(n / i)) { //shortcut, if n is divisible by i, we check if the factor (n/i) is prime and return it if yes
                        l = n / i;
                        break;
                    } else if (isPrime(i)) {
                        l = i;
                    }
                }
            }
            System.out.println(l);
        }
    }

    private static boolean isPrime(long l) {
        if (l % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(l); i += 2) {
            if (l % i == 0) {
                return false;
            }
        }
        return true;
    }
}
