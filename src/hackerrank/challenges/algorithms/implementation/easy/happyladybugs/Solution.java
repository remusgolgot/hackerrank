package hackerrank.challenges.algorithms.implementation.easy.happyladybugs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author remus.golgot on 25/4/2018.
 * <p>
 * https://www.hackerrank.com/challenges/happy-ladybugs/problem
 */

public class Solution {

    /*
     * Complete the happyLadybugs function below.
     */
    private static String happyLadybugs(String b) {

        boolean emptySpace = b.contains("_");
        int[] x = new int[26];

        char[] c = b.toCharArray();
        for (char cc : c) {

            if (cc != '_') {
                x[cc - 'A']++;
            }
        }
        boolean single = false;
        for (int i = 0; i < 26; i++) {
            if (x[i] == 1) {
                single = true;
                break;
            }
        }
        if (emptySpace && single) return "NO";
        if (emptySpace) return "YES";

        if (b.length() == 1) return "NO";
        if (c[0] != c[1]) return "NO";
        if (c[c.length - 1] != c[c.length - 2]) return "NO";
        for (int i = 1; i <= c.length - 2; i++) {
            if (c[i - 1] != c[i] && c[i + 1] != c[i]) return "NO";
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

