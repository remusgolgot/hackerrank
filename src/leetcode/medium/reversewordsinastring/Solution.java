package leetcode.medium.reversewordsinastring;

/**
 * Created by remus.golgot on 04/26/2020.
 * Reverse all the words in a given String
 */
class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world!     "));
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {

        s = s.trim();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                result.append(words[i]);
                if (i < words.length - 1) {
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }
}