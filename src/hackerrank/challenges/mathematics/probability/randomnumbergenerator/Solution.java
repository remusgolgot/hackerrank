package hackerrank.challenges.mathematics.probability.randomnumbergenerator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//TODO : INCOMPLETE

public class Solution {

    private static void processNumber(int a, int b, int c) {

        if (a + b <= c) {
            System.out.println("1/1");
        } else {
            System.out.println("INCOMPLETE");
        }
    }

    public static void main(String[] args) {

        try {
            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
            String line = bi.readLine();
            int n = Integer.parseInt(line);
            int a, b, c;
            String[] s;
            for (int i = 0; i < n; i++) {
                s = bi.readLine().split(" ");
                a = Integer.parseInt(s[0]);
                b = Integer.parseInt(s[1]);
                c = Integer.parseInt(s[2]);
                processNumber(a, b, c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}