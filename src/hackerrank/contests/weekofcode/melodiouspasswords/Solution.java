package hackerrank.contests.weekofcode.melodiouspasswords;

/**
 * Created by remus.golgot on 3/15/2017.
 * <p>
 * https://www.hackerrank.com/contests/w30/challenges/melodious-password
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    private static boolean isMelodious(String s) {

        boolean firstCharacterVowel = isVowel(s.charAt(0));
        boolean firstCharacterConsonant = isConsonant(s.charAt(0));

        if (firstCharacterVowel) {
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0 && isConsonant(s.charAt(i))) return false;
                if (i % 2 == 1 && isVowel(s.charAt(i))) return false;
            }
        }

        if (firstCharacterConsonant) {
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0 && isVowel(s.charAt(i))) return false;
                if (i % 2 == 1 && isConsonant(s.charAt(i))) return false;
            }
        }
        return !s.contains("y");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1)
            printFor1();
        if (n == 2)
            printFor2();
        if (n == 3)
            printFor3();
        if (n == 4)
            printFor4();
        if (n == 5)
            printFor5();
        if (n == 6)
            printFor6();


    }

    private static void printFor6() {
        String s = "";
        for (char c = 'a'; c <= 'z'; c++) {
            for (char d = 'a'; d <= 'z'; d++) {
                for (char e = 'a'; e <= 'z'; e++) {
                    for (char f = 'a'; f <= 'z'; f++) {
                        for (char g = 'a'; g <= 'z'; g++) {
                            for (char h = 'a'; h <= 'z'; h++) {
                                s = "";
                                s += c;
                                s += d;
                                s += e;
                                s += f;
                                s += g;
                                s += h;
                                if (isMelodious(s)) {
                                    System.out.println(s);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void printFor5() {

        String s = "";
        for (char c = 'a'; c <= 'z'; c++) {
            for (char d = 'a'; d <= 'z'; d++) {
                for (char e = 'a'; e <= 'z'; e++) {
                    for (char f = 'a'; f <= 'z'; f++) {
                        for (char g = 'a'; g <= 'z'; g++) {
                            s = "";
                            s += c;
                            s += d;
                            s += e;
                            s += f;
                            s += g;
                            if (isMelodious(s)) {
                                System.out.println(s);
                            }
                        }
                    }
                }
            }
        }

    }

    private static void printFor4() {

        String s = "";
        for (char c = 'a'; c <= 'z'; c++) {
            for (char d = 'a'; d <= 'z'; d++) {
                for (char e = 'a'; e <= 'z'; e++) {
                    for (char f = 'a'; f <= 'z'; f++) {
                        s = "";
                        s += c;
                        s += d;
                        s += e;
                        s += f;
                        if (isMelodious(s)) {
                            System.out.println(s);
                        }
                    }
                }
            }
        }

    }

    private static void printFor3() {


        String s = "";
        for (char c = 'a'; c <= 'z'; c++) {
            for (char d = 'a'; d <= 'z'; d++) {
                for (char e = 'a'; e <= 'z'; e++) {
                    s = "";
                    s += c;
                    s += d;
                    s += e;
                    if (isMelodious(s)) {
                        System.out.println(s);
                    }
                }
            }
        }

    }

    private static void printFor2() {

        String s;
        for (char c = 'a'; c <= 'z'; c++) {
            for (char d = 'a'; d <= 'z'; d++) {
                s = "";
                s += c;
                s += d;
                if (isMelodious(s)) {
                    System.out.println(s);
                }
            }
        }

    }

    private static void printFor1() {
        for (char c = 'a'; c <= 'z'; c++) {
            if (c != 'y') System.out.println(c);
        }
    }

}

