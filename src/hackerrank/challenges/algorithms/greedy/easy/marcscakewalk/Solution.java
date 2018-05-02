package hackerrank.challenges.algorithms.greedy.easy.marcscakewalk;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by remus.golgot on 02/05/2018.
 * <p>
 * https://www.hackerrank.com/challenges/marcs-cakewalk/problem
 */
public class Solution {

    static long marcsCakewalk(Integer[] calorie) {
        Arrays.sort(calorie, Collections.reverseOrder());
        long miles = 0;

        for (int i = 0; i < calorie.length; i++) {
            miles += Math.pow(2, i) * calorie[i];
        }

        return miles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] calorie = new Integer[n];
        for (int calorie_i = 0; calorie_i < n; calorie_i++) {
            calorie[calorie_i] = in.nextInt();
        }
        long result = marcsCakewalk(calorie);
        System.out.println(result);
        in.close();
    }
}
