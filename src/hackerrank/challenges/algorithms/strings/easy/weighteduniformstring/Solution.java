package hackerrank.challenges.algorithms.strings.easy.weighteduniformstring;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by remus.golgot on 28/04/2018.
 * <p>
 * https://www.hackerrank.com/challenges/weighted-uniform-string/problem
 */

public class Solution {

    /*
     * Complete the weightedUniformStrings function below.
     */
    private static String[] weightedUniformStrings(String s, int[] queries) {
        String[] result = new String[queries.length];
        Set<Integer> availableWeights = new HashSet<>();
        availableWeights.add(s.charAt(0) - 'a' + 1);
        int k = 1;
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                int x = s.charAt(i) - 'a' + 1;
                k++;
                availableWeights.add(x * k);
            } else {
                k = 1;
                int x = s.charAt(i) - 'a' + 1;
                availableWeights.add(x * k);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            if (availableWeights.contains(queries[i])) {
                result[i] = "Yes";
            } else {
                result[i] = "No";
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
            queries[queriesItr] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(result[resultItr]);

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

