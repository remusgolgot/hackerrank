package hackerrank.challenges.algorithms.strings.easy.strongpassword;

import java.util.Scanner;

/**
 * Created by remus.golgot on 27/04/2018.
 * <p>
 * https://www.hackerrank.com/challenges/strong-password/problem
 */
public class Solution {

    private static int minimumNumber(int n, String password) {
        int k1 = 1;
        int k2 = 1;
        int k3 = 1;
        int k4 = 1;

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            if (k1 == 1 && numbers.contains(password.substring(i, i + 1))) k1--;
            if (k2 == 1 && lower_case.contains(password.substring(i, i + 1))) k2--;
            if (k3 == 1 && upper_case.contains(password.substring(i, i + 1))) k3--;
            if (k4 == 1 && special_characters.contains(password.substring(i, i + 1))) k4--;

            if ((k1 + k2 + k3 + k4) == 0) break;
        }
        if (password.length() < 6) return Math.max(6 - password.length(), (k1 + k2 + k3 + k4));
        return k1 + k2 + k3 + k4;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}

