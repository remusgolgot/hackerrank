package hackerrank.challenges.algorithms.implementation.medium.thepowersum;

/**
 * Created by remus.golgot on 2/18/2020.
 * <p>
 * https://www.hackerrank.com/challenges/the-power-sum/problem
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(powerSum2(100, 2, 1));
        System.out.println(powerSum2(100, 3, 1));
    }

    private static int powerSum2(int x, int n, int k) {
        if (x == 0) return 1;
        if (x < 0) return 0;
        if (x < Math.pow(k, n)) return 0;
        return powerSum2(x, n, k + 1) + powerSum2(x - (int) Math.pow(k, n), n, k + 1);
    }
}
