package algorithms.binarySearch;

/**
 * Created by remus.golgot on 1/31/2017.
 *
 *
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(binarySearch(0, 5, 8, new int[] {0, 4, 7, 11, 13 }));
        System.out.println(binarySearch(0, 5, 9, new int[] {0, 4, 7, 11, 13 }));
        System.out.println(binarySearch(0, 5, 6, new int[] {0, 4, 7, 11, 13 }));
        System.out.println(binarySearch(0, 5, 7, new int[] {0, 4, 7, 11, 13 }));
        System.out.println(binarySearch(0, 5, 0, new int[] {0, 4, 7, 11, 13 }));
        System.out.println(binarySearch(0, 5, 13, new int[] {0, 4, 7, 11, 13 }));
    }

    private static boolean binarySearch(int l, int r, int elem, int[] arr) {

        if (l > r) return false;
        int middle = l + ( r - l ) / 2;
        if (arr[middle] == elem) return true;
        else if (arr[middle] < elem) return binarySearch(middle + 1, r, elem, arr);
        else return binarySearch(l, middle - 1, elem, arr);
    }

}
