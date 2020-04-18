package hackerrank.challenges.datastructures.stacks.balancedbrackets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


/**
 * Created by remus.golgot on 04/15/2020.
 * <p>
 * https://www.hackerrank.com/challenges/balanced-brackets/problem
 */
public class Solution {

    // Complete the isBalanced function below.
    private static String isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                }
                if (s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                }
                if (s.charAt(i) == '{') {
                    stack.push(s.charAt(i));
                }
                if (s.charAt(i) == ')') {
                    Character c = stack.pop();
                    if (c != '(') return "NO";
                }
                if (s.charAt(i) == ']') {
                    Character c = stack.pop();
                    if (c != '[') return "NO";
                }
                if (s.charAt(i) == '}') {
                    Character c = stack.pop();
                    if (c != '{') return "NO";
                }
            }
        } catch (Exception e) {
            return "NO";
        }
        if (!stack.isEmpty()) return "NO";
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
