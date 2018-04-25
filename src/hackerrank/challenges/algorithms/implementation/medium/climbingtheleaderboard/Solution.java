package hackerrank.challenges.algorithms.implementation.medium.climbingtheleaderboard;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author remus.golgot on 25/4/2018.
 * <p>
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */

public class Solution {


    private static int[] climbingLeaderboard(int[] scorez, int[] alice) {

        int[] sol = new int[alice.length];
        int l = 0;
        List<Integer> scoresL = new ArrayList<>();
        scoresL.add(scorez[0]);
        for (int i = 1; i < scorez.length; i++) {
            if (scorez[i] < scorez[i - 1]) scoresL.add(scorez[i]);
        }
        Integer[] scores = scoresL.toArray(new Integer[0]);
        for (int i : scoresL) {
            System.out.println(i);
        }
        int curr = scores.length - 1;
        int i = 0;
        int rank = scores.length;
        while (i < alice.length) {
            if (curr == -1) {
                i++;
                sol[l++] = 1;
                continue;
            }

            if (alice[i] < scores[curr]) {
                sol[l++] = rank + 1;
                i++;
                continue;
            }
            if (alice[i] == scores[curr]) {
                rank--;
                curr--;
                continue;
            }
            if (alice[i] > scores[curr]) {
                if (curr > 0) {
                    curr--;
                    rank--;
                } else {
                    i++;
                    sol[l++] = 1;
                }
            }
        }

        return sol;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = Integer.parseInt(scanner.nextLine().trim());

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");

        for (int scoresItr = 0; scoresItr < scoresCount; scoresItr++) {
            int scoresItem = Integer.parseInt(scoresItems[scoresItr].trim());
            scores[scoresItr] = scoresItem;
        }

        int aliceCount = Integer.parseInt(scanner.nextLine().trim());

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");

        for (int aliceItr = 0; aliceItr < aliceCount; aliceItr++) {
            int aliceItem = Integer.parseInt(aliceItems[aliceItr].trim());
            alice[aliceItr] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
