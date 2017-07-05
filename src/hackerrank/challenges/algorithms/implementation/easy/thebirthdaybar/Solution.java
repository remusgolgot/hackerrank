package hackerrank.challenges.algorithms.implementation.easy.thebirthdaybar;

/**
 * Created by remus.golgot on 7/5/2017.
 * <p>
 * https://www.hackerrank.com/challenges/the-birthday-bar
 */

import java.util.Scanner;

public class Solution {

    private static int solve(int n, int[] s, int d, int m) {
        int ways = 0;
        if (m > s.length) return ways;

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += s[i];
        }
        if (sum == d) ways++;
        for (int i = m; i < s.length; i++) {
            sum -= s[i - m];
            sum += s[i];
            if (sum == d) ways++;
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int s_i = 0; s_i < n; s_i++) {
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}

