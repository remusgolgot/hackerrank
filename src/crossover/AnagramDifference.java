package crossover;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by remus.golgot on 3/11/2017.
 */
public class AnagramDifference {

    /**
     * Complete the function below.
     */
    static int[] getMinimumDifference(String[] a, String[] b) {

        int[] result = new int[a.length];


        for (int i = 0; i < a.length; i++) {

            int v1[] = new int[26];
            int v2[] = new int[26];
            String c = a[i];
            String d = b[i];
            if (c.length() != d.length()) {
                result[i] = -1;
            } else {
                for (int j = 0; j < c.length(); j++) {
                    v1[c.charAt(j) - 'a']++;

                }

                for (int j = 0; j < d.length(); j++) {
                    v2[d.charAt(j) - 'a']++;

                }

                for (int k = 0; k < 26; k++) {
                    result[i] += Math.abs(v1[k] - v2[k]);
                    //System.out.println(Math.abs(v1[k] - v2[k]) + " " + result[i]);
                }
                result[i]=result[i]/2;
            }

        }

        return result;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] res;

        int _a_size = Integer.parseInt(in.nextLine().trim());
        String[] _a = new String[_a_size];
        String _a_item;
        for (int _a_i = 0; _a_i < _a_size; _a_i++) {
            try {
                _a_item = in.nextLine();
            } catch (Exception e) {
                _a_item = null;
            }
            _a[_a_i] = _a_item;
        }


        int _b_size = Integer.parseInt(in.nextLine().trim());
        String[] _b = new String[_b_size];
        String _b_item;
        for (int _b_i = 0; _b_i < _b_size; _b_i++) {
            try {
                _b_item = in.nextLine();
            } catch (Exception e) {
                _b_item = null;
            }
            _b[_b_i] = _b_item;
        }

        res = getMinimumDifference(_a, _b);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
