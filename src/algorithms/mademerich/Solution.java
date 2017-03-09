package algorithms.mademerich;

/**
 * Created by remus on 1/30/2017.
 * <p>
 * Write a function that maximizes the profit made in a trading day, after a Buy and a Sell operation
 * Input is array of integers denoting price changes
 */
public class Solution {


    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 1, 1, 1, 1};
        System.out.println(getMaxProfit(0, ints.length - 1, ints));
        ints = new int[]{8, 7, 6, 5, 4, 3};
        System.out.println(getMaxProfit(0, ints.length - 1, ints));
        ints = new int[]{2, 3, 7, 5, 8, 6, 13, 1, 20};
        System.out.println(getMaxProfit(0, ints.length - 1, ints));
        ints = new int[]{1, 20, 2, 3, 7, 5, 8, 6, 13};
        System.out.println(getMaxProfit(0, ints.length - 1, ints));
    }

    private static int max(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        if (c >= b && c >= a) return c;

        return a;
    }

    /**
     * epic failure of a solution, featured on interview cake, would return negative value instead of 0 for a strictly descending array of values
     */

    public static int getMaxProfit3(int a, int b, int[] stockPricesYesterday) {

        if (stockPricesYesterday.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        int minPrice = stockPricesYesterday[0];
        int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];

        for (int i = 1; i < stockPricesYesterday.length; i++) {
            int currentPrice = stockPricesYesterday[i];
            int potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }


    private static int getMaxProfit(int i, int j, int[] arr) {

        if (arr.length == 0) return 0;
        if (i >= j) return 0;

        if (i + 1 < arr.length && arr[i + 1] - arr[i] < 0)
            return Math.max(arr[j] - arr[i], getMaxProfit(i + 1, j, arr));
        else if (j - 1 >= 0 && arr[j - 1] > arr[j]) return Math.max(arr[j] - arr[i], getMaxProfit(i, j - 1, arr));
        else return max(getMaxProfit(i + 1, j, arr), getMaxProfit(i, j - 1, arr), arr[j] - arr[i]);

    }
}
