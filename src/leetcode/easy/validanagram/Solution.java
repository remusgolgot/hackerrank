package leetcode.easy.validanagram;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remus on 2/4/2025.
 * <p>
 * https://leetcode.com/problems/valid-anagram/
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("anagramz", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    private static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] s1 = new int[26];
        int[] t1 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            s1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            t1[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (s1[i] != t1[i]) {
                return false;
            }
        }

        return true;
    }
}
