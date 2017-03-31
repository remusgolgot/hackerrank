package hackerrank.challenges.mathematics.fundamentals.armygame;

import java.util.Scanner;

/**
 * Created by remus.golgot on 3/31/2017.
 * <p>
 * https://www.hackerrank.com/challenges/game-with-cells
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int x = (n / 2) * (m / 2);
        int q = 0;
        if (m % 2 == 1) {
            q += n;
        }
        if (n % 2 == 1) {
            q += m;
        }
        if (n % 2 == 1 && m % 2 == 1) {
            q--;
        }
        if (q > 0 && q % 2 == 0) {
            q = q / 2;
        } else if (q > 0 && q % 2 == 1) {
            q = q / 2 + 1;
        }
        System.out.println(x + q);

    }
}
