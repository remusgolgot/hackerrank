package leetcode.easy.removeduplicatesfromsortedarray;

/**
 * Created by remus on 1/7/2017.
 * <p>
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Solution {

    public static void main(String[] args) {

        int[] x = new int[]{1, 2, 2, 3, 3, 4, 5, 5, 5, 5, 5, 6};
        int l = removeDuplicates(x);
        for (int i = 0; i < l; i++) {
            System.out.print(x[i]);
        }
    }

    private static int removeDuplicates(int[] A) {

        if (A.length == 0) return 0;
        int j = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] != A[j]) A[++j] = A[i];
        return ++j;
    }
}
