package algorithms.fibonacci;

import java.math.BigInteger;

public class Solution {

    static class Pair {
        BigInteger fn;
        BigInteger fn1;

        Pair(BigInteger i1, BigInteger i2) {
            fn = i1;
            fn1 = i2;
        }

    }

    public static void main(String[] args) {

        fib(10);
        fib(100);
        fib(1000);
        fib(10000);
        fib(20000);
        fib(200000);
        fib(2000000);

        fib2(10);
        fib2(100);
        fib2(1000);
        fib2(10000);
        fib2(20000);
        fib2(200000);
        fib2(2000000);

    }

    /**
     * F(2n-1) = F(n-1)2 + F(n)2
     * F(2n) = ( 2 F(n-1) + F(n) ) F(n)
     */
    private static BigInteger calculateFib2(int n) {
        BigInteger two = new BigInteger("2");
        BigInteger sum;
        Pair pair = calculateFibPair(n / 2);
        if (n % 2 == 0) {
            sum = pair.fn.multiply(pair.fn1.multiply(two).add(pair.fn));
        } else {
            sum = pair.fn.multiply(pair.fn).add(pair.fn1.multiply(pair.fn1));
        }
        return sum;
    }

    /**
     * naive
     */
    private static BigInteger calculateFib(int n) {
        BigInteger i1 = new BigInteger("1");
        BigInteger i2 = new BigInteger("1");

        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n - 2; i++) {
            sum = i1.add(i2);
            i1 = i2;
            i2 = sum;
        }
        return sum;
    }

    private static Pair calculateFibPair(int n) {
        BigInteger i1 = new BigInteger("1");
        BigInteger i2 = new BigInteger("1");

        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < n - 2; i++) {
            sum = i1.add(i2);
            i1 = i2;
            i2 = sum;
        }
        return new Pair(sum, i1);
    }

    private static void fib(int n) {
        long start = System.currentTimeMillis();
        BigInteger sum = calculateFib(n);
        System.out.println("Exec time " + ((System.currentTimeMillis() - start) / 1000) + " (s)");
        System.out.println(n + " : ---> " + sum);
        System.out.println();
    }

    private static void fib2(int n) {

        long start = System.currentTimeMillis();
        BigInteger sum = calculateFib2(n);
        System.out.println("Exec time " + ((System.currentTimeMillis() - start) / 1000) + " (s)");
        System.out.println(n + " : ---> " + sum);
        System.out.println();
    }
}
