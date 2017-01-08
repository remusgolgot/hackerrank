package leetcode.easy.countandsay;

/**
 * Created by remus on 1/8/2017.
 * <p>
 * https://leetcode.com/problems/count-and-say/
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(countAndSay(7));
    }

    public static String countAndSay(int n) {

        String result = "1";

        for (int i = 1; i < n; i++) {
            int count = 1;
            String temp = "";

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) count++;
                else {
                    temp += Integer.toString(count);
                    temp += result.substring(j - 1,j);
                    count = 1;
                }
            }

            temp += Integer.toString(count);
            temp += result.substring(result.length() - 1);
            result = temp;
        }

        return result;
    }
}
