package leetcode.easy.lengthoflastword;

/**
 * Created by remus.golgot on 1/30/2017.
 *
 * https://leetcode.com/problems/length-of-last-word/
 */


public class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord("a"));
        System.out.println(lengthOfLastWord("xa cxx "));
        System.out.println(lengthOfLastWord(" ac"));
        System.out.println(lengthOfLastWord("dsfdfgsfsd"));
        System.out.println(lengthOfLastWord("fsfdffd fdffsddfffssfd"));
        System.out.println(lengthOfLastWord("ccc ccc"));
        System.out.println(lengthOfLastWord("     "));
    }

    private static int lengthOfLastWord(String s) {

        s = s.trim();
        if (s.length() == 0) return 0;
        if (s.lastIndexOf(" ")  < 0 ) return s.length();
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}