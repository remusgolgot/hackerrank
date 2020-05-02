package algorithms.firstRepeatedCharacter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by remus.golgot on 04/26/2020.
 * Get the first repeated character in a given String
 */
public class Solution {

    private static String getFirstRepeatedChar(String s) {

        Map<Character, Integer> occurrenceMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (occurrenceMap.containsKey(s.charAt(i))) {
                return String.valueOf(s.charAt(i));
            } else {
                occurrenceMap.put(s.charAt(i), 1);
            }
        }
        return "No char has multiple occurrence";
    }

    public static void main(String[] args) {

        String s = "abcdefghijkla";
        System.out.println(getFirstRepeatedChar(s));
    }

}