package hackerrank.challenges.mathematics.fundamentals.mostdistant;

import java.util.*;

/**
 * Created by remus.golgot on 3/31/2017.
 * <p>
 * https://www.hackerrank.com/challenges/most-distant
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int minx = 100000;
        int maxx = -100000;
        int miny = 100000;
        int maxy = -100000;

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (x > maxx) maxx = x;
            if (x < minx) minx = x;
            if (y > maxy) maxy = y;
            if (y < miny) miny = y;
        }

        int u = maxx - minx;
        int v = maxy - miny;
        int z = u < v ? v : u;
        double d1 = dist(minx, miny);
        double d2 = dist(minx, maxy);
        double d3 = dist(maxx, miny);
        double d4 = dist(maxx, maxy);

        double d = getMax(d1, d2, d3, d4);
        double zd = (double) z;

        double sol = d > zd ? d : zd;
        System.out.println(sol);
    }

    private static double dist(double d1, double d2) {
        double e1 = Math.abs(d1);
        double e2 = Math.abs(d2);
        return Math.sqrt(e1 * e1 + e2 * e2);
    }

    private static double getMax(double d1, double d2, double d3, double d4) {
        double e1 = Math.max(d1, d2);
        double e2 = Math.max(d3, d4);

        return Math.max(e1, e2);
    }
}

