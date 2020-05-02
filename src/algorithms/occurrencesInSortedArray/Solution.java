package algorithms.occurrencesInSortedArray;

/**
 * Created by remus.golgot on 04/26/2020.
 * Counts nr of occurrences of a certain number in a given sorted array
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(nrOcc(new int[]{1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 7, 7, 7, 8, 9}, 2));
        System.out.println(nrOcc(new int[]{}, 1));
    }

    private static int nrOcc(int[] ints, int k) {

        int i = 0;
        int sol = 0;
        while (i < ints.length && ints[i] < k) {
            i++;
        }
        while (i < ints.length && ints[i] == k) {
            i++;
            sol++;
        }
        return sol;
    }
}
