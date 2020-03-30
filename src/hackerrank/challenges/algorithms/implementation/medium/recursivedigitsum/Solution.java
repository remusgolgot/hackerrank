package hackerrank.challenges.algorithms.implementation.medium.recursivedigitsum;

import java.math.BigInteger;

/**
 * Created by remus.golgot on 2/18/2020.
 * <p>
 * https://www.hackerrank.com/challenges/recursive-digit-sum/problem
 */
public class Solution {

    private static BigInteger bigTen = new BigInteger("10");

    public static void main(String[] args) {
        System.out.println(superDigit(new BigInteger("148"), 3));
        System.out.println(superDigit("148", 3));
    }

    // 100% solution
    private static int superDigit(String n, int k) {
        n = n.chars().mapToLong(Character::getNumericValue).sum() * k + "";
        return (n.length() > 1) ? superDigit(n, 1) :
                Character.getNumericValue(n.charAt(0));
    }

    // 66% solution
    private static int superDigit(BigInteger n, int k) {
        BigInteger kBig = new BigInteger(String.valueOf(k));
        if (k > 1) {
            k = 1;
        }
        if (n.compareTo(bigTen) > 0) {
            BigInteger sumOfDigits = getSumOfDigits(n);
            return superDigit(kBig.multiply(sumOfDigits), k);
        } else {
            return n.intValue();
        }
    }

    private static BigInteger getSumOfDigits(BigInteger n) {
        if (n.compareTo(new BigInteger("0")) > 0) {
            return n.mod(bigTen).add(getSumOfDigits(n.divide(bigTen)));
        } else {
            return new BigInteger("0");
        }
    }
}
