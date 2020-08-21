package hackerrank.challenges.algorithms.implementation.medium.queensattack;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

        int l_o = -1;
        int r_o = -1;
        int u_o = -1;
        int d_o = -1;
        int lu_oc = -1;
        int ld_oc = -1;
        int ru_oc = -1;
        int rd_oc = -1;

        for (int i = 0; i < k; i++) {

            // same row obstacle
            if (r_q == obstacles[i][0]) {
                if (obstacles[i][1] > c_q) {
                    // right
                    if (r_o == -1 || r_o > obstacles[i][1]) {
                        r_o = obstacles[i][1];
                    }
                }
                if (obstacles[i][1] < c_q) {
                    // left
                    if (l_o == -1 || l_o < obstacles[i][1]) {
                        l_o = obstacles[i][1];
                    }
                }
            }

            // same column obstacle
            if (c_q == obstacles[i][1]) {
                if (obstacles[i][0] < r_q) {
                    // down
                    if (d_o == -1 || d_o < obstacles[i][0]) {
                        d_o = obstacles[i][0];
                    }
                }
                if (obstacles[i][0] > r_q) {
                    // up
                    if (u_o == -1 || u_o > obstacles[i][0]) {
                        u_o = obstacles[i][0];
                    }
                }
            }

            // same main diagonal obstacle
            if (r_q - c_q == obstacles[i][0] - obstacles[i][1]) {
                if (obstacles[i][1] < c_q) {
                    // left-down
                    if (ld_oc == -1 || ld_oc < obstacles[i][1]) {
                        ld_oc = obstacles[i][1];
                    }
                }
                if (obstacles[i][1] > c_q) {
                    // right-up
                    if (ru_oc == -1 || ru_oc > obstacles[i][1]) {
                        ru_oc = obstacles[i][1];
                    }
                }
            }

            // same secondary diagonal obstacle
            if (r_q + c_q == obstacles[i][0] + obstacles[i][1]) {
                if (obstacles[i][1] > c_q) {
                    // right-down
                    if (rd_oc == -1 || rd_oc > obstacles[i][1]) {
                        rd_oc = obstacles[i][1];
                    }
                }
                if (obstacles[i][1] < c_q) {
                    // left-up
                    if (lu_oc == -1 || lu_oc < obstacles[i][1]) {
                        lu_oc = obstacles[i][1];
                    }
                }
            }

        }

        int leftMoves = l_o == -1 ? c_q - 1 : c_q - l_o - 1;
        int rightMoves = r_o == -1 ? n - c_q : r_o - c_q - 1;

        int upMoves = u_o == -1 ? n - r_q : u_o - r_q - 1;
        int downMoves = d_o == -1 ? r_q - 1 : r_q - d_o - 1;

        int leftUpMoves = lu_oc == -1 ? Math.min(n - r_q, c_q - 1) : c_q - lu_oc - 1;
        int leftDownMoves = ld_oc == -1 ? Math.min(r_q - 1, c_q - 1) : ld_oc - c_q - 1;

        int rightUpMoves = ru_oc == -1 ? Math.min(n - r_q, n - c_q) : c_q - ru_oc - 1;
        int rightDownMoves = rd_oc == -1 ? Math.min(r_q - 1, n - c_q) : rd_oc - c_q - 1;

//        System.out.println(l_o);
//        System.out.println(r_o);
//        System.out.println(u_o);
//        System.out.println(d_o);
//        System.out.println(lu_oc);
//        System.out.println(ld_oc);
//        System.out.println(ru_oc);
//        System.out.println(rd_oc);
//
//        System.out.println("===========");
//
//        System.out.println("left " + leftMoves);
//        System.out.println("right " + rightMoves);
//        System.out.println("up " + upMoves);
//        System.out.println("down " + downMoves);
//        System.out.println("leftup " + leftUpMoves);
//        System.out.println("leftdown " + leftDownMoves);
//        System.out.println("rightup " + rightUpMoves);
//        System.out.println("rightdown " + rightDownMoves);

        return leftMoves + rightMoves + upMoves + downMoves + leftUpMoves + leftDownMoves + rightUpMoves + rightDownMoves;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
