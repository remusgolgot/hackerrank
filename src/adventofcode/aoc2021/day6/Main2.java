package adventofcode.aoc2021.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main2 {

    public static void main(String[] args) {

        String t = "3,4,3,1,2";
        String s = "3,5,4,1,2,1,5,5,1,1,1,1,4,1,4,5,4,5,1,3,1,1,1,4,1,1,3,1,1,5,3,1,1,3,1,3,1,1,1,4,1,2,5,3,1,4,2,3,1,1,2,1,1,1,4,1,1,1,1,2,1,1,1,3,1,1,4,1,4,1,5,1,4,2,1,1,5,4,4,4,1,4,1,1,1,1,3,1,5,1,4,5,3,1,4,1,5,2,2,5,1,3,2,2,5,4,2,3,4,1,2,1,1,2,1,1,5,4,1,1,1,1,3,1,5,4,1,5,1,1,4,3,4,3,1,5,1,1,2,1,1,5,3,1,1,1,1,1,5,1,1,1,1,1,1,1,2,2,5,5,1,2,1,2,1,1,5,1,3,1,5,2,1,4,1,5,3,1,1,1,2,1,3,1,4,4,1,1,5,1,1,4,1,4,2,3,5,2,5,1,3,1,2,1,4,1,1,1,1,2,1,4,1,3,4,1,1,1,1,1,1,1,2,1,5,1,1,1,1,2,3,1,1,2,3,1,1,3,1,1,3,1,3,1,3,3,1,1,2,1,3,2,3,1,1,3,5,1,1,5,5,1,2,1,2,2,1,1,1,5,3,1,1,3,5,1,3,1,5,3,4,2,3,2,1,3,1,1,3,4,2,1,1,3,1,1,1,1,1,1";

        String[] s1 = s.split(",");

        List<Integer> nrs = Arrays.stream(s1).map(Integer::parseInt).collect(Collectors.toList());

        // store how many fish exist per each day (0-array)
        long[] days = new long[9];
        for (Integer nr : nrs) {
            days[nr - 1]++;
        }

        int magic = 256;
        for (int i = 0; i < magic - 1; i++) {
            days[7] += days[0]; // spawn days[0] more fish on day 7.

            // increment the day by shifting the array to the left
            long temp = days[0];
            System.arraycopy(days, 1, days, 0, 8);
            days[8] = temp;

            //after the shift, days[0] fish (first spawn), become day[8]
        }

        long sum = 0;
        for (long day : days) {
            sum += day;
        }
        System.out.println(sum);

    }
}
