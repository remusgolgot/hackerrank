package hackerrank.challenges.artificialintelligence.botbuilding.saveprincess;

import java.util.Scanner;

/**
 * Created by remus.golgot on 02/05/2018.
 * <p>
 * https://www.hackerrank.com/challenges/saveprincess/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String k = "";
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            if (line.startsWith("p")) {
                if (i == 0) {
                    k = "00";
                }
                if (i == n - 1) {
                    k = "10";
                }
            }
            if (line.endsWith("p")) {
                if (i == 0) {
                    k = "01";
                }
                if (i == n - 1) {
                    k = "11";
                }
            }
        }
        for (int i = 0; i < n / 2; i++) {
            if (k.equals("00")) {
                System.out.println("UP");
                System.out.println("LEFT");
            }
            if (k.equals("10")) {
                System.out.println("DOWN");
                System.out.println("LEFT");
            }
            if (k.equals("01")) {
                System.out.println("UP");
                System.out.println("RIGHT");
            }
            if (k.equals("11")) {
                System.out.println("DOWN");
                System.out.println("RIGHT");
            }
        }
    }
}