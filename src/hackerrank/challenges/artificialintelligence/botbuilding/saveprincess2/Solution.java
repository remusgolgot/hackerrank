package hackerrank.challenges.artificialintelligence.botbuilding.saveprincess2;

import java.util.Scanner;

/**
 * Created by remus.golgot on 02/05/2018.
 * <p>
 * https://www.hackerrank.com/challenges/saveprincess2/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        in.nextLine();
        int mi = -1, mj = -1, pi = -1, pj = -1;
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            if (line.contains("p")) {
                pi = i;
                pj = line.indexOf("p");
            }
            if (line.contains("m")) {
                mi = i;
                mj = line.indexOf("m");
            }
        }
        getNextMove(mi, mj, pi, pj);
    }

    private static void getNextMove(int mi, int mj, int pi, int pj) {
        if (mi > pi) {
            for (int i = 0; i < mi - pi; i++) {
                System.out.println("UP");
                return;
            }
        }

        if (mi < pi) {
            for (int i = 0; i < pi - mi; i++) {
                System.out.println("DOWN");
                return;
            }
        }

        if (mj > pj) {
            for (int i = 0; i < mj - pj; i++) {
                System.out.println("LEFT");
                return;
            }
        }

        if (mj < pj) {
            for (int i = 0; i < pj - mj; i++) {
                System.out.println("RIGHT");
                return;
            }
        }
    }
}