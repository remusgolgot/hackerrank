package leetcode.medium.searchinrotatedsortedarray;

/**
 * Created by remus.golgot on 3/8/2017.
 * <p>
 * https://leetcode.com/problems/search-in-rotated-sorted-array
 */
public class Solution {

    // my dummy solution, accepted by the LeetCode Judge

    public int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }
        return -1;
    }

    // Binary Search

    public int search(int A[], int n, int target) {
        int lo = 0, hi = n - 1;

        // find the index of the smallest value using binary search.

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (A[mid] > A[hi]) lo = mid + 1;
            else hi = mid;
        }
        // lo is the index of the smallest value and also the number of places rotated.

        int rot = lo;
        lo = 0;
        hi = n - 1;

        // Binary search with account for rotation.
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int realmid = (mid + rot) % n;
            if (A[realmid] == target) return realmid;
            if (A[realmid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}