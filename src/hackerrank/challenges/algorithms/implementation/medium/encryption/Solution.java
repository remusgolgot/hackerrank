package hackerrank.challenges.algorithms.implementation.medium.encryption;

/**
 * Created by remus.golgot on 12/14/2016.
 *
 * https://www.hackerrank.com/challenges/encryption
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();
        double sqrt = Math.sqrt(length);
        int nbWords = (int) Math.sqrt(length);
        if (sqrt - nbWords > 0.0)
            nbWords++;
        String[] array = new String[nbWords];
        for (int i = 0; i < nbWords; i++) {
            array[i] = "";
        }
        for (int i = 0; i < length; i++) {
            array[i % nbWords] += str.charAt(i);
        }
        for (int i = 0; i < nbWords; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
