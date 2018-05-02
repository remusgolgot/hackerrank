package hackerrank.challenges.algorithms.strings.medium.sherlockandvalidstring;

import java.util.*;

/**
 * Created by remus.golgot on 30/04/2018.
 * <p>
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
 */

public class Solution {

    private static String isValid(String s) {
        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 25; i++) {
            if (freq[i] > 0)
                list.add(freq[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size() - 2; i++) {
            if (!Objects.equals(list.get(i), list.get(i + 1)))
                if (list.get(i) > 1 || i >= 1) return "NO";
        }
        if (list.size() >= 2 && list.get(list.size() - 1) - list.get(list.size() - 2) > 1) {
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
