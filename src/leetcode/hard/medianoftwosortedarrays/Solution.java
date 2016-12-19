package leetcode.hard.medianoftwosortedarrays;

/**
 * Created by remus on 12/17/2016.
 * <p>
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class Solution {
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int i = 0;
        int j = 0;
        double prevElem = 0;
        double currElem = 0;
        while (i + j <= size / 2) {

            prevElem = currElem;
            if (i == nums1.length) {
                currElem = nums2[j];
                j++;
                continue;
            }
            if (j == nums2.length) {
                currElem = nums1[i];
                i++;
                continue;
            }

            if (nums1[i] < nums2[j]) {
                currElem = nums1[i];
                i++;
            } else {
                currElem = nums2[j];
                j++;
            }

        }

        if (size % 2 == 0) return (prevElem + currElem) / 2;
        else return currElem;

    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[] { 1,2,3} , new int[] { 4,5,6}));
        System.out.println(findMedianSortedArrays(new int[] { 4,7,10} , new int[] { 5,6,8}));
    }
}
