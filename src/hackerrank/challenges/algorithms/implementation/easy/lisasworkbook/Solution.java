package hackerrank.challenges.algorithms.implementation.easy.lisasworkbook;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/lisa-workbook
 */

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t[] = new int[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        int specials = 0;
        int page = 1;
        for (int i = 0; i < n; i++) {
            int problem = 1;
            while (problem < t[i]) {
                if (problem == page)
                    specials++;
                if (problem % k == 0)
                    page++;
                problem++;
            }
            if (problem == page)
                specials++;
            page++;
        }
        System.out.println(specials);
    }
}