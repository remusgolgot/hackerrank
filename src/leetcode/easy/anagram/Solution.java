package leetcode.easy.anagram;

/**
 * Created by remus.golgot on 04/26/2020.
 * Algorithm that checks whether 2 strings are anagrams of each other
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(isAnagram("tananana", "antanana"));
        System.out.println(isAnagram("tananana", "antananat"));
    }

    public static boolean isAnagram(String s, String t) {

        if (s == null || t == null)
            return false;

        if (s.length() != t.length())
            return false;

        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for (int i : arr) {
            if (i != 0)
                return false;
        }

        return true;
    }
}
