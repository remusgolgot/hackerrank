package hackerrank.projecteuler.p6;

import java.math.BigDecimal;
import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler006/problem

/**
 * Sum Square Difference
 * <p>
 * The absolute difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640.
 * <p>
 * Find the absolute difference between the sum of the squares of the first natural numbers and the square of the sum.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            BigDecimal s1 = BigDecimal.ZERO;
            for (int i = 1; i <= n; i++) {
                s1 = s1.add(new BigDecimal(i * i));
            }
            BigDecimal nn = new BigDecimal(n);
            BigDecimal s2 = (nn.multiply(BigDecimal.valueOf(n + 1)).divide(new BigDecimal(2)));
            BigDecimal s22 = s2.multiply(s2);
            System.out.println(s22.subtract(s1));
        }
    }
}

