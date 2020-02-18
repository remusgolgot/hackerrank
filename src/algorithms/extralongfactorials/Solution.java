package algorithms.extralongfactorials;

/**
 * Created by remus.golgot on 12/14/2016.
 * <p>
 * You are given an integer N . Print the factorial of this number.
 * Input consists of a single integer N : 1 <= N <= 100
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger product = new BigInteger("1");
        int i = 1;
        while (i <= n) {
            BigInteger factor = new BigInteger(Integer.toString(i));
            product = product.multiply(factor);
            i++;
        }

        System.out.println(product);
    }
}