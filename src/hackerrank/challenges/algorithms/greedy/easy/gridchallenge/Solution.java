package hackerrank.challenges.algorithms.greedy.easy.gridchallenge;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by remus.golgot on 02/05/2018.
 * <p>
 * https://www.hackerrank.com/challenges/grid-challenge/problem
 */
public class Solution {

    static String gridChallenge(String[] grid) {
        int[] freqs = new int[26];
        String[] ordered = new String[grid.length];
        Arrays.fill(ordered, "");

        for (int k = 0; k < grid.length; k++) {
            for (int i = 0; i < grid[k].length(); i++) {
                freqs[grid[k].charAt(i) - 'a']++;
            }
            int z = 0;
            for (int i = 0; i < 26; i++) {
                while (freqs[i] > 0) {
                    ordered[k] += Character.toString((char) ('a' + i));
                    freqs[i]--;
                    z++;
                }
            }

        }

        for (int i = 0; i < grid[0].length() - 1; i++) {
            for (int j = 0; j < grid[0].length(); j++) {
                if (ordered[i].charAt(j) > ordered[i + 1].charAt(j)) return "NO";
            }
        }


        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            String[] grid = new String[n];
            for (int grid_i = 0; grid_i < n; grid_i++) {
                grid[grid_i] = in.next();
            }
            String result = gridChallenge(grid);
            System.out.println(result);
        }
        in.close();
    }
}
