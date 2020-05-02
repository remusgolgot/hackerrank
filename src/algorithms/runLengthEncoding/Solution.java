package algorithms.runLengthEncoding;

/**
 * Created by remus.golgot on 04/26/2020.
 * RLE Algorithm
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(rle("yyyyttthggggrrfffffffffffffffffffffffffedwqssssssssssssssazzzggggggggffffp"));
        System.out.println(rle("abcdee"));
    }

    private static String rle(String s) {
        StringBuilder result = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            int k = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                k++;
            }
            i++;
            result.append(c).append(k);
        }
        return result.toString();
    }
}
