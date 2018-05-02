package hackerrank.challenges.algorithms.greedy.easy.maximumperimetertriangle;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by remus.golgot on 02/05/2018.
 * <p>
 * https://www.hackerrank.com/challenges/maximum-perimeter-triangle/problem
 */
public class Solution {

    // Complete the maximumPerimeterTriangle function below.
    private static int[] maximumPerimeterTriangle(int[] sticks) {

        Arrays.sort(sticks);
        int[] result = new int[3];
        Arrays.fill(result, -1);
        for (int i = sticks.length - 1; i >= 2; i--) {
            for (int j = i - 1; j >= 1; j--) {
                for (int k = j - 1; k >= 0; k--) {
                    int a = sticks[i];
                    int b = sticks[j];
                    int c = sticks[k];
                    if (a + b > c && a + c > b && b + c > a) {
                        return new int[]{c, b, a};
                    }
                }
            }

        }

        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] sticks = new int[n];

        String[] sticksItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sticksItr = 0; sticksItr < n; sticksItr++) {
            int sticksItem = Integer.parseInt(sticksItems[sticksItr]);
            sticks[sticksItr] = sticksItem;
        }

        int[] result = maximumPerimeterTriangle(sticks);

        if (result[0] == -1) {
            bufferedWriter.write("-1");
        } else {
            for (int resultItr = 0; resultItr < result.length; resultItr++) {
                bufferedWriter.write(String.valueOf(result[resultItr]));

                if (resultItr != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
