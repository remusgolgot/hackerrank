package crossover;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by remus.golgot on 3/11/2017.
 */
public class MinimizeDifference {

    /**
     * Complete the function below.
     */
    static int minimize(int[] point, int k) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < point.length; i++) {
            if (min > point[i]) {
                min = point[i];
            }
            if (max < point[i]) {
                max = point[i];
            }

        }

        if (max-min > k) return Math.abs(max-min-2*k);
        k=Math.abs(k);
        for (int i = 0; i < point.length; i++) {
            if (point[i] - min <= k)
                point[i] += k;
            else
                point[i] -= k;
        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;

        for (int aPoint : point) {
            if (min > aPoint) min = aPoint;
            if (max < aPoint) max = aPoint;
        }

        return max-min;

    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int _point_size = Integer.parseInt(in.nextLine().trim());
        int[] _point = new int[_point_size];
        int _point_item;
        for (int _point_i = 0; _point_i < _point_size; _point_i++) {
            _point_item = Integer.parseInt(in.nextLine().trim());
            _point[_point_i] = _point_item;
        }

        int _k = Integer.parseInt(in.nextLine().trim());

        System.out.println(minimize(_point, _k));
    }
}
