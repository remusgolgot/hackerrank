package hackerrank.projecteuler.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<Long> evenFib = new ArrayList<>();
        long limit = 40000000000000000L;
        long l1 = 1;
        long l2 = 1;
        long l3 = 0;
        while (l3 < limit) {
            l3 = l1 + l2;
            if (l3 % 2 == 0) {
                evenFib.add(l3);
            }
            l1 = l2;
            l2 = l3;

        }
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            long sum = 0L;
            for (long l : evenFib) {
                if (l < n) {
                    sum += l;
                }
            }
            System.out.println(sum);
        }
    }
}
