package algorithms.stockspan;

/**
 * https://www.geeksforgeeks.org/the-stock-span-problem/
 * Created by remus.golgot on 04/26/2020.
 */
public class Solution {

    public static void main(String[] args) {
        int[] stockValues = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] result = stockSpan(stockValues);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] stockSpan(int[] A) {
        int[] res = new int[A.length];
        // Span value of first element is always 1
        res[0] = 1;

        // Calculate span values for rest of the elements
        for (int i = 1; i < A.length; i++) {
            int counter = 1;
            while (counter < i && A[i] >= A[i - counter]) {
                counter += res[i - counter];
            }
            res[i] = counter;
        }
        return res;
    }
}
