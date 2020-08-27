package hackerrank.challenges.algorithms.implementation.hard.matrixlayerrotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by remus.golgot on 8/27/2020.
 * <p>
 * https://www.hackerrank.com/challenges/matrix-rotation-algo/problem
 */
public class Solution {

    // Complete the matrixRotation function below.
    static void matrixRotation(List<List<Integer>> matrix, int r) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int nrLayers = Math.min(n, m) / 2;
        int[][] result = new int[n][m];

        for (int l = 0; l < nrLayers; l++) {
            int nMovesPerLayer = (n - 1 - 2 * l);
            int mMovesPerLayer = (m - 1 - 2 * l);
            int movesPerLayer = (nMovesPerLayer + mMovesPerLayer) * 2;

            int rotations = r % movesPerLayer;
            int[] layerElements = new int[movesPerLayer];
            int[] rotatedLayerElements = new int[movesPerLayer];
            int i = l;
            int j = l;
            for (int k = 0; k < movesPerLayer; k++) {
                layerElements[k] = matrix.get(i).get(j);
                if (i == l && j == l) {
                    i++;
                    continue;
                }
                if (i == l + nMovesPerLayer && j == l + mMovesPerLayer) {
                    i--;
                    continue;
                }
                if (i < l + nMovesPerLayer && j == l) {
                    i++;
                    continue;
                }
                if (i == l && j > l) {
                    j--;
                    continue;
                }
                if (i == l + nMovesPerLayer && j < l + mMovesPerLayer) {
                    j++;
                    continue;
                }
                if (i < l + nMovesPerLayer && j == l + mMovesPerLayer) {
                    i--;
                }
            }

            for (int s = 0; s < layerElements.length; s++) {
                rotatedLayerElements[(s + rotations) % movesPerLayer] = layerElements[s];
            }

            i = l;
            j = l;
            for (int k = 0; k < movesPerLayer; k++) {
                result[i][j] = rotatedLayerElements[k];
                if (i == l && j == l) {
                    i++;
                    continue;
                }
                if (i == l + nMovesPerLayer && j == l + mMovesPerLayer) {
                    i--;
                    continue;
                }
                if (i < l + nMovesPerLayer && j == l) {
                    i++;
                    continue;
                }
                if (i == l && j > l) {
                    j--;
                    continue;
                }
                if (i == l + nMovesPerLayer && j < l + mMovesPerLayer) {
                    j++;
                    continue;
                }
                if (i < l + nMovesPerLayer && j == l + mMovesPerLayer) {
                    i--;
                }
            }
        }
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(mnr[0]);

        int n = Integer.parseInt(mnr[1]);

        int r = Integer.parseInt(mnr[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] matrixRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> matrixRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int matrixItem = Integer.parseInt(matrixRowTempItems[j]);
                matrixRowItems.add(matrixItem);
            }

            matrix.add(matrixRowItems);
        }

        matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
