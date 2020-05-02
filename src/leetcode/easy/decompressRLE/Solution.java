package leetcode.easy.decompressRLE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remus.golgot on 04/26/2020.
 * Decompresses a number from its RLE representation
 */
class Solution {

    public static void main(String[] args) {
        int[] x = decompressRLElist(new int[]{1, 2, 3, 4}); // 2444 (one '2' followed by 3 '4's )
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

    public static int[] decompressRLElist(int[] nums) {

        List<Integer> resultList = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int freq = nums[i];
            int value = nums[++i];
            int j = 0;
            while (j < freq) {
                resultList.add(value);
                j++;
            }
            i++;
        }
        int[] resultArray = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            resultArray[k] = resultList.get(k);
        }
        return resultArray;
    }
}