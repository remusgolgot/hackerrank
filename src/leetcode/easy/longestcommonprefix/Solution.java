package leetcode.easy.longestcommonprefix;

/**
 * Created by remus on 1/8/2017.
 * <p>
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"",""}));
        System.out.println(longestCommonPrefix(new String[] {"","a"}));
        System.out.println(longestCommonPrefix(new String[] {"a",""}));
        System.out.println(longestCommonPrefix(new String[] {"a","a"}));
        System.out.println(longestCommonPrefix(new String[] {"aa","a"}));
        System.out.println(longestCommonPrefix(new String[] {"ab","ab"}));
        System.out.println(longestCommonPrefix(new String[] {"abx","abz"}));
        System.out.println(longestCommonPrefix(new String[] {"b","c"}));
        System.out.println(longestCommonPrefix(new String[] {""}));
        System.out.println(longestCommonPrefix(new String[] {"ab","ac","ad"}));
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs[0].length() == 0) {
            return "";
        }

        int x = 1;
        String currentCommonPrefix = strs[0].substring(0, x);

        while (x <= strs[0].length()) {
            for (String s : strs) {
                if (!s.startsWith(currentCommonPrefix)) {
                    return currentCommonPrefix.length() == 1 ? "" : currentCommonPrefix.substring(0, x - 1);
                }
            }
            if (x == strs[0].length()) return currentCommonPrefix;
            x++;
            currentCommonPrefix = strs[0].substring(0, x);
        }

        return currentCommonPrefix;


    }
}
