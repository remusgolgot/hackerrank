package hackerrank.challenges.mathematics.fundamentals.findpoint;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/find-point
 *
 Given two points P and Q, output the symmetric point of point P about Q.
 Input Format:
 The first line contains an integer representing the number of testcases.
 Each test case is a line containing four space separated integers representing the coordinates of P and Q.
 */

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nrTests = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < nrTests; i++) {
            String string = scanner.nextLine();
            String pos[] = string.split(" ");
            int xp = Integer.parseInt(pos[0]);
            int yp = Integer.parseInt(pos[1]);
            int xq = Integer.parseInt(pos[2]);
            int yq = Integer.parseInt(pos[3]);
            System.out.println((xq + (xq - xp)) + " " + (yq + (yq - yp)));
        }
    }

}
