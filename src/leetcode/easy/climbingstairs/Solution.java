package leetcode.easy.climbingstairs;

/**
 * Created by remus.golgot on 3/3/2017.
 * <p>
 * https://leetcode.com/problems/climbing-stairs
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(climbStairs(45));
        System.out.println(climbStairsRec(45));
    }

    public static int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 2;
        int b = 1;
        int t = 0;

        for (int i = 2; i < n; i++) {
            t = a + b;
            b = a;
            a = t;
        }
        return t;
    }

    public static int climbStairsRec(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
