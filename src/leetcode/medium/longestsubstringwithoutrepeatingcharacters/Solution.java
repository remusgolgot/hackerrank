package leetcode.medium.longestsubstringwithoutrepeatingcharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by remus on 12/17/2016.
 * <p>
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class Solution {

    private static int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        int longest = 1;
        int currentLongest = 1;
        List<String> currentStringCharList = new ArrayList<>();
        currentStringCharList.add(s.substring(0, 1));

        for (int i = 1; i < s.length(); i++) {
            String currentChar = s.substring(i, i + 1);
            if (!currentStringCharList.contains(currentChar)) {
                currentStringCharList.add(currentChar);
                currentLongest++;
                if (currentLongest > longest) {
                    longest = currentLongest;
                }
            } else {

                int pos = currentStringCharList.indexOf(currentChar);
                for (int j = pos; j >= 0; j--) {
                    currentStringCharList.remove(currentStringCharList.get(j));

                }
                currentStringCharList.add(currentChar);
                currentLongest = currentStringCharList.size();
            }
        }

        return longest;

    }

    private static int officialSolution(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
            System.out.println(i + " " + j + " " + max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(officialSolution("abcdeafgehbaijk"));
    }
}
