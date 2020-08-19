package hackerrank.challenges.algorithms.thegridsearch;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by remus.golgot on 19/08/2020.
 * <p>
 * //https://www.hackerrank.com/challenges/the-grid-search/problem
 */

public class Solution {

    // Complete the gridSearch function below.
    private static String gridSearch(String[] G, String[] P) {

        int i = 0;
        while (i < G.length) {
            int index = G[i].indexOf(P[0]);
            if (index >= 0) {
                boolean match = true;
                while (match) {
                    int j = 0;
                    int ii = i;
                    while (ii < G.length && j < P.length && G[ii].substring(index).startsWith(P[j])) {
                        j++;
                        ii++;
                    }
                    if (j == P.length) {
                        return "YES";
                    }
                    if (index < G[i].length()) {
                        String s = G[i];
                        s = s.substring(index + 1);
                        match = s.contains(P[0]);
                        index += s.indexOf(P[0]) + 1;
                    } else {
                        match = false;
                    }
                }
            }
            i++;
        }
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] RC = scanner.nextLine().split(" ");

            int R = Integer.parseInt(RC[0]);

            int C = Integer.parseInt(RC[1]);

            String[] G = new String[R];

            for (int i = 0; i < R; i++) {
                String GItem = scanner.nextLine();
                G[i] = GItem;
            }

            String[] rc = scanner.nextLine().split(" ");

            int r = Integer.parseInt(rc[0]);

            int c = Integer.parseInt(rc[1]);

            String[] P = new String[r];

            for (int i = 0; i < r; i++) {
                String PItem = scanner.nextLine();
                P[i] = PItem;
            }

            String result = gridSearch(G, P);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
