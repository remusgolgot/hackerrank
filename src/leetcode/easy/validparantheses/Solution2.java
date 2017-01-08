package leetcode.easy.validparantheses;

import java.util.Stack;

/**
 * Created by remus on 1/7/2017.
 * <p>
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Solution2 {

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

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.size() >0 && stack.peek() == '(') {
                    stack.pop();
                } else return false;
            }

            else if (s.charAt(i) == ']') {
                if (stack.size() >0 && stack.peek() == '[') {
                    stack.pop();
                } else return false;
            }

            else if (s.charAt(i) == '}') {
                if (stack.size() >0 && stack.peek() == '{') {
                    stack.pop();
                } else return false;
            }

            else stack.push(s.charAt(i));

        }

        return stack.size() <= 0;

    }
}
