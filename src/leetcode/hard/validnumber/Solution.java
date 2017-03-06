package leetcode.hard.validnumber;

/**
 * Created by remus on 03/06/2017.
 * <p>
 * https://leetcode.com/problems/valid-number
 */
 
public class Solution {
    public boolean isNumber(String s) {
        String t = s.trim();
        if (t.toLowerCase().contains("f") || t.toLowerCase().contains("d")) { return false; }
        try {
            double x = Double.parseDouble(t);
            double y = Float.parseFloat(t);
        } catch (Exception e) {
            return false;
        }
         return true;
    }
}
