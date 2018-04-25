package hackerrank.challenges.algorithms.implementation.medium.thetimeinwords;

import java.util.Scanner;

/**
 * @author remus.golgot on 25/4/2018.
 * <p>
 * https://www.hackerrank.com/challenges/the-time-in-words/problem
 */

public class Solution {

    private static String MINUTE = "";
    private static String HOUR_PREFIX = "";

    private static String minutesToWord(int h) {
        if (h == 15 || h == 45) return "quarter";
        if (h == 30) return "half";
        if (h == 1 || h == 59) return "one";
        if (h == 2 || h == 58) return "two";
        if (h == 3 || h == 57) return "three";
        if (h == 4 || h == 56) return "four";
        if (h == 5 || h == 55) return "five";
        if (h == 6 || h == 54) return "six";
        if (h == 7 || h == 53) return "seven";
        if (h == 8 || h == 52) return "eight";
        if (h == 9 || h == 51) return "nine";
        if (h == 10 || h == 50) return "ten";
        if (h == 11 || h == 49) return "eleven";
        if (h == 12 || h == 48) return "twelve";
        if (h == 13 || h == 47) return "thirteen";
        if (h == 14 || h == 46) return "fourteen";
        if (h == 16 || h == 44) return "sixteen";
        if (h == 17 || h == 43) return "seventeen";
        if (h == 18 || h == 42) return "eighteen";
        if (h == 19 || h == 41) return "nineteen";
        if (h == 20 || h == 40) return "twenty";
        if (h == 21 || h == 39) return "twenty one";
        if (h == 22 || h == 38) return "twenty two";
        if (h == 23 || h == 37) return "twenty three";
        if (h == 24 || h == 36) return "twenty four";
        if (h == 25 || h == 35) return "twenty five";
        if (h == 26 || h == 34) return "twenty six";
        if (h == 27 || h == 33) return "twenty seven";
        if (h == 28 || h == 32) return "twenty eight";
        if (h == 29 || h == 31) return "twenty nine";
        return "";
    }

    private static String hourToWord(int h) {
        if (h == 1) return "one";
        if (h == 2) return "two";
        if (h == 3) return "three";
        if (h == 4) return "four";
        if (h == 5) return "five";
        if (h == 6) return "six";
        if (h == 7) return "seven";
        if (h == 8) return "eight";
        if (h == 9) return "nine";
        if (h == 10) return "ten";
        if (h == 11) return "eleven";
        if (h == 12) return "twelve";
        return "";
    }

    private static String timeInWords(int h, int m) {
        if (m > 30) h++;
        String hourAsWord = hourToWord(h);
        String minuteAsWord = minutesToWord(m);
        if (m == 1) MINUTE = "minute ";
        if (m > 1) MINUTE = "minutes ";
        if (m % 15 == 0) MINUTE = "";
        if (m < 31) {
            HOUR_PREFIX = "past";
        } else {
            HOUR_PREFIX = "to";
        }

        if (m > 0) return minuteAsWord + " " + MINUTE + HOUR_PREFIX + " " + hourAsWord;
        if (m == 0) return hourAsWord + " o' clock";
        return "";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String result = timeInWords(h, m);
        System.out.println(result);
        in.close();
    }
}
