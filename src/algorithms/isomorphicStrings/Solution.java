package algorithms.isomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by remus.golgot on 04/26/2020.
 * Checks if 2 Strings are isomorphic
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("foo", "egg"));
        System.out.println(isIsomorphic("ab", "aa"));
    }

    private static boolean isIsomorphic(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                if (map.get(a.charAt(i)) != b.charAt(i)) {
                    return false;
                }
            } else {
                map.put(a.charAt(i), b.charAt(i));
            }
        }

        HashSet<Character> set = new HashSet<>(map.values());
        return set.size() == map.values().size();

    }

}
