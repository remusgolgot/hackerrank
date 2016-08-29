package hackerrank.challenges.algorithms.implementation.cutthesticks;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int c = arr.length;
        System.out.println(c);
        while (c > 0) {
            c = 0;
            int min = 1000000;
            for (int i = 0; i < n; i++) {
                if (min > arr[i] && arr[i] > 0)
                    min = arr[i];
            }
            for (int i = 0; i < n; i++) {
                arr[i] -= min;
                if (arr[i] > 0) c++;
            }
            if (c > 0) System.out.println(c);
        }
    }
}