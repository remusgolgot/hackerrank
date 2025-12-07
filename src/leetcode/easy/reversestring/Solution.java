package leetcode.easy.reversestring;

/**
 * Created by remus.golgot on 2/4/2025.
 * <p>
 * https://leetcode.com/problems/reverse-string/
 */
public class Solution {
    static char[] reverseString(char[] s) {

        for (int i = 0; i < s.length / 2; i++) {
            char aux = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = aux;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("ssssaaaaqqq".toCharArray()));
    }
}