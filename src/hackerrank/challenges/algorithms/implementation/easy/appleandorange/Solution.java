package hackerrank.challenges.algorithms.implementation.easy.appleandorange;

/**
 * Created by remus.golgot on 12/14/2016.
 *
 * https://www.hackerrank.com/challenges/apple-and-orange
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int orangesRes = 0;
        int applesRes = 0;
        for (int i = 0; i < m; i++) {
            int d = in.nextInt();
            if (d > 0 && a + d >= s && a + d <= t) {
                applesRes++;
            }
        }

        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            if (d < 0 && b + d >= s && b + d <= t) {
                orangesRes++;
            }
        }
        System.out.println(applesRes);
        System.out.println(orangesRes);

    }
}