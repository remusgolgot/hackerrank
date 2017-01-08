package leetcode.easy.validparantheses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remus on 1/7/2017.
 * <p>
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(isValid("(()))"));
        System.out.println(isValid(")("));
        System.out.println(isValid("(("));
        System.out.println(isValid("([])"));
        System.out.println(isValid("({})"));
        System.out.println(isValid("({)}"));
        System.out.println(isValid("(){}"));
        System.out.println(isValid("()"));
    }

    private static boolean isValid(String s) {

        if (s.length() % 2 == 1) return false;

        int simpleP = 0;
        int squareP = 0;
        int curly = 0;
        List<Integer> prevPar = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                simpleP++;
                prevPar.add(0);
            }

            if (s.charAt(i) == '[') {
                squareP++;
                prevPar.add(-1);
            }

            if (s.charAt(i) == '{') {
                curly++;
                prevPar.add(1);
            }

            if (s.charAt(i) == ')') {
                if (simpleP == 0 || prevPar.get(prevPar.size() - 1) != 0) return false;
                simpleP--;
                prevPar.remove(prevPar.size() - 1);
            }

            if (s.charAt(i) == ']') {
                if (squareP == 0 || prevPar.get(prevPar.size() - 1) != -1) return false;
                squareP--;
                prevPar.remove(prevPar.size() - 1);
            }

            if (s.charAt(i) == '}') {
                if (curly == 0 || prevPar.get(prevPar.size() - 1) != 1) return false;
                curly--;
                prevPar.remove(prevPar.size() - 1);
            }
        }

        return curly == 0 && squareP == 0 && simpleP == 0 && prevPar.size() == 0;
    }
}
