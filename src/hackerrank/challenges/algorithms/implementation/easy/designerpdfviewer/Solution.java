package hackerrank.challenges.algorithms.implementation.easy.designerpdfviewer;

/**
 * Created by remus.golgot on 12/14/2016.
 * <p>
 * https://www.hackerrank.com/challenges/designer-pdf-viewer
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int max = -1;
        for (int i = 0; i < word.length(); i++) {
            if (max < h[word.charAt(i) - 'a']) {
                max = h[word.charAt(i) - 'a'];
            }
        }
        System.out.println(max * word.length());
    }
}
