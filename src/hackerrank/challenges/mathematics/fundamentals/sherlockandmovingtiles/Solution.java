package hackerrank.challenges.mathematics.fundamentals.sherlockandmovingtiles;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-moving-tiles
 *
 Sherlock is given 2 square tiles, both of whose sides have length L, placed in an xOy plane,
 so that the left bottom of each square coincides with the origin and their sides are parallel to the axes.
 At t = 0 , both squares start moving along the line y = x (along the positive x and y) with velocities s1 and s2 .
 For each query of form qi, Sherlock has to report the time at which the overlapping area of tiles is equal to qi.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        int length = Integer.parseInt(firstLine.split(" ")[0]);
        int s1 = Integer.parseInt(firstLine.split(" ")[1]);
        int s2 = Integer.parseInt(firstLine.split(" ")[2]);

        int nrTests = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < nrTests; i++) {
            int q = Integer.parseInt(scanner.nextLine());
            System.out.println(Math.abs(Math.sqrt(2) * (length - Math.sqrt(q)) / (s2 - s1)));
        }
    }
}
