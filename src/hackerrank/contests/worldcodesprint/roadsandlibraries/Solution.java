package hackerrank.contests.worldcodesprint.roadsandlibraries;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by remus.golgot on 12/19/2016.
 * <p>
 * https://www.hackerrank.com/contests/world-codesprint-8/challenges/torque-and-development
 */
public class Solution {

    private static class Edge {
        long getX() {
            return x;
        }

        public void setX(long x) {
            this.x = x;
        }

        long getY() {
            return y;
        }

        public void setY(long y) {
            this.y = y;
        }

        long x;
        long y;

        Edge(long a, long b) {
            x = a;
            y = b;

        }
    }

    private static long countComponents(long n, Edge[] pairs) {
        long[] roots = new long[(int) n];
        for (int i = 0; i < n; i++) roots[i] = i;

        for (Edge e : pairs) {
            long root1 = find(roots, e.getX());
            long root2 = find(roots, e.getY());
            if (root1 != root2) {
                roots[(int) root1] = root2;  // union
                n--;
            }
        }
        return n;
    }

    private static long find(long[] roots, long id) {
        while (roots[(int) id] != id) {
            roots[(int) id] = roots[(int) roots[(int) id]];  // optional: path compression
            id = roots[(int) id];
        }
        return id;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            long n = in.nextLong();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            Edge[] edges = new Edge[m];
            for (int a1 = 0; a1 < m; a1++) {
                long city_1 = in.nextLong();
                long city_2 = in.nextLong();
                edges[a1] = new Edge(city_1 - 1, city_2 - 1);
            }
            long cc = countComponents(n, edges);

            if (x > y) System.out.println(cc * x + (n - cc) * y);
            if (y >= x) System.out.println(n * x);

        }

    }

}
