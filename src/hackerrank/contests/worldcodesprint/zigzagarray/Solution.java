package hackerrank.contests.worldcodesprint.zigzagarray;

/**
 * Created by remus.golgot on 4/28/2017.
 *
 * https://www.hackerrank.com/contests/world-codesprint-10/challenges/zigzag-array
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    static List<Integer> asList(int[] ints) {
        List<Integer> intList = new ArrayList<>();
        for (int index = 0; index < ints.length; index++) {
            intList.add(ints[index]);
        }
        return intList;
    }

    static int minimumDeletions(int[] a) {
        int k = 0;
        List<Integer> elements = asList(a);

        for (int i = 0; i < elements.size() - 2; i++) {
            if (elements.get(i) < elements.get(i + 1) && elements.get(i + 1) < elements.get(i + 2)) {
                elements.remove(i + 1);
                k++;
                i++;
                continue;
            }
            if (elements.get(i) > elements.get(i + 1) && elements.get(i + 1) > elements.get(i + 2)) {
                elements.remove(i + 1);

                k++;
                i++;
            }
        }

    return k;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        // Return the minimum number of elements to delete to make the array zigzag
        int result = minimumDeletions(a);
        System.out.println(result);
    }
}
