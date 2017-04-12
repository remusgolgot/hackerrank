package hackerrank.contests.weekofcode.zeroonegame;

import java.util.Scanner;

/**
 * Created by remus.golgot on 3/31/2017.
 * <p>
 * https://www.hackerrank.com/contests/w31/challenges/zero-one-game
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for (int a0 = 0; a0 < g; a0++) {
            int n = in.nextInt();
            int[] sequence = new int[n];
            for (int sequence_i = 0; sequence_i < n; sequence_i++) {
                sequence[sequence_i] = in.nextInt();
            }
            int c = count010(sequence);
            sequence = remove1FromSequence(sequence);
            c += countSequencesOfZeroes(sequence);
            // System.out.print(c + " .. ");
            // for (int i=0;i<sequence.length;i++) {
            //     System.out.print(sequence[i] + " ");
            // }

            if (c % 2 == 0) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }

        }
    }

    private static int[] remove1FromSequence(int[] sequence) {
        int k = 0;
        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] == 0 && sequence[i + 1] == 1 && sequence[i + 2] == 0) {
                sequence[i + 1] = -1;
                k++;
            }
        }
        int[] aux = new int[sequence.length - k];
        int j = -1;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] != -1) {
                aux[++j] = sequence[i];
            }
        }
        return aux;
    }

    private static int countSequencesOfZeroes(int[] sequence) {
        int c = 0;

        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] == 0 && sequence[i + 1] == 0 && sequence[i + 2] == 0) {
                c++;
            }
        }

        return c;
    }

    private static int count010(int[] sequence) {
        int c = 0;

        for (int i = 0; i < sequence.length - 2; i++) {
            if (sequence[i] == 0 && sequence[i + 1] == 1 && sequence[i + 2] == 0) {
                c++;
            }
        }

        return c;
    }
}
