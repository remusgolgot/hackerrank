package algorithms.replace0With5;

/**
 * Created by remus.golgot on 04/26/2020.
 * Replace 0 with 5 in a given number
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(replace0W5(40620368));
        System.out.println(replace0W5(40600308));
    }

    private static int replace0W5(int n) {
        int res = 0;
        while (n > 0) {
            int r = n % 10 == 0 ? 5 : n % 10;
            res = res * 10 + r;
            n = n / 10;
        }
        return reverseMe(res);
    }

    private static int reverseMe(int n) {
        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n = n / 10;
        }
        return res;
    }
}
