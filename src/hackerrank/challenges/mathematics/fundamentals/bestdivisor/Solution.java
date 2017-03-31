package hackerrank.challenges.mathematics.fundamentals.bestdivisor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by remus.golgot on 3/31/2017.
 * <p>
 * https://www.hackerrank.com/challenges/best-divisor
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> divisors = getDivisorsForNumber(n);
        int maxSum = -1;
        int minNr = -1;
        for (int x : divisors) {
            int s = sumOfDigits(x);
            if (maxSum < s) {
                maxSum = s;
                minNr = x;
            }
            if (maxSum == s) {
                if (minNr > x) {
                    minNr = x;
                }
            }

        }
        System.out.println(minNr);
    }

    private static int sumOfDigits(int x) {

        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;


    }

    private static List<Integer> getDivisorsForNumber(int n) {

        List<Integer> resultList = new ArrayList<>();
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                resultList.add(i);
            }
            i++;
        }
        resultList.add(n);
        return resultList;
    }
}