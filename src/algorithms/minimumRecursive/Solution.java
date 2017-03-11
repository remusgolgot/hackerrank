package algorithms.minimumRecursive;

/**
 * Created by remus.golgot on 1/27/2017.
 *
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(minimumRecursive(0, new int[]{4, 1, 2, 3}));
    }

    private static int minimumRecursive(int pos, int[] arr) {

        if (pos == arr.length - 1) return arr[pos];

        return Math.min(arr[pos], minimumRecursive(++pos, arr));
    }
}
