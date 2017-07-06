package hackerrank.challenges.algorithms.strings.easy.twocharacters;

/**
 * @author remus.golgot on 7/6/2017.
 * <p>
 * https://www.hackerrank.com/challenges/two-characters
 */

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        String s1 = replaceRepeatingChars(s);

        if (isATString(s1)) {
            System.out.println(s1.length());
        } else {

            List<Character> characterList = new ArrayList<>();
            for (int i = 0; i < s1.length(); i++) {
                if (!characterList.contains(s1.charAt(i))) {
                    characterList.add(s1.charAt(i));
                }
            }
            if (characterList.size() < 2) {
                System.out.println(0);
            } else {
                int maxLength = 0;

                for (int i = 0; i < characterList.size() - 1; i++) {
                    for (int j = i + 1; j < characterList.size(); j++) {

                        String temp = s1;
                        boolean b = true;
                        while (b && temp.length() >= 2 && !isATString(temp)) {
                            int k;
                            for (k = 0; k < temp.length(); k++) {
                                if (temp.charAt(k) != characterList.get(i) && temp.charAt(k) != characterList.get(j)) {
                                    temp = temp.replaceAll(temp.substring(k, k + 1), "");
                                    k = 1001;
                                }
                            }
                            if (k != 1002) {
                                b = false;
                            }
                        }
                        if (isATString(temp)) {
                            if (maxLength < temp.length()) {
                                maxLength = temp.length();
                            }
                        }
                    }
                }

                System.out.println(maxLength);
            }
        }
    }

    private static boolean isATString(String s) {
        if (s.length() < 2) return false;
        char c[] = new char[2];
        c[0] = s.charAt(0);
        c[1] = s.charAt(1);

        int i = 2;
        while (i < s.length()) {
            if (s.charAt(i) != c[i % 2]) return false;
            i++;
        }
        return true;
    }

    private static String replaceRepeatingChars(String s) {
        boolean b = true;

        while (b && s.length() > 1) {
            b = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    b = true;
                    s = s.replaceAll(s.substring(i, i + 1), "");
                    break;
                }
            }
        }

        return s;
    }
}

