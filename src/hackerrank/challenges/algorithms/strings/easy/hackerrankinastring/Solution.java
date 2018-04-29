package hackerrank.challenges.algorithms.strings.easy.hackerrankinastring;

import java.util.Scanner;

public class Solution {

    private static String hackerrankInString(String s, String searchFor) {

        for (int i = 0; i < searchFor.length(); i++) {
            int j = s.indexOf(searchFor.substring(i, i + 1));
            if (j == -1) return "NO";
            s = s.substring(j + 1);
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String searchFor = "hackerrank";
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            String result = hackerrankInString(s, searchFor);
            System.out.println(result);
        }
        in.close();
    }
}

