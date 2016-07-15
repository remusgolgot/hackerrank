package hackerrank.challenges.mathematics.probability.assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//TODO : INCOMPLETE

public class Solution {

    public static void main(String[] args) {

        try {
            BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
            String line = bi.readLine();
            int t = Integer.parseInt(line);
            int m, n;
            String[] s;
            for (int i = 0; i < t; i++) {
                s = bi.readLine().split(" ");
                m = Integer.parseInt(s[0]);
                n = Integer.parseInt(s[1]);
                generateAllAscSeq(1, m, n);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void generateAllAscSeq(int currentElement, int seqLength, int maxSeqNumber) {


    }

}
