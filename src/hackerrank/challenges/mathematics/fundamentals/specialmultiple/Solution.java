package hackerrank.challenges.mathematics.fundamentals.specialmultiple;

import java.util.Scanner;

/**
 * Created by remus.golgot on 3/31/2017.
 * <p>
 * https://www.hackerrank.com/challenges/special-multiple
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        long arr[] = new long[100000];
        for (int i = 1; i <= 100000; i++) {
            String bin = getBinaryRepresentation(i).replace("1", "9");
            arr[i - 1] = Long.valueOf(bin);
        }

        for (int i = 0; i < t; i++) {
            int nr = in.nextInt();
            int y = 0;
            while (y < arr.length) {
                if (arr[y] % nr == 0) {
                    System.out.println(arr[y]);
                    break;
                }
                y++;
            }
        }
    }

    private static String getBinaryRepresentation(int i) {
        String result = "";
        while (i > 0) {
            if (i % 2 == 1) result = "1" + result;
            else result = "0" + result;
            i = i / 2;
        }
        return result;
    }
}