package hackerrank.projecteuler.p7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://www.hackerrank.com/contests/projecteuler/challenges/euler007/problem

/**
 * 10001st Prime
 * <p>
 * By listing the first six prime numbers : 2,3,5,7,11 and 13, we can see that the 6th prime is 13.
 * <p>
 * What is the Nth prime number?
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> ns = new ArrayList<>();
        int max = 0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            ns.add(n);
            if (max < n) {
                max = n;
            }
        }
        int i=1;
        int k=2;
        while (i<= max) {
            while (!isPrime(k)) {
                k++;
            }
            list.add(k);
            k++;
            i++;
        }
        for (int j = 0; j < ns.size(); j++) {
            System.out.println(list.get(ns.get(j)-1));
        }
    }

    private static boolean isPrime(int nr) {
        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i ==0) {
                return false;
            }

        }
        return true;
    }
}
