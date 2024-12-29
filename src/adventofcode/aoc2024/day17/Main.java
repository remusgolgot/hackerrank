package adventofcode.aoc2024.day17;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * https://adventofcode.com/2024/day/17
 */
public class Main {

    public static void main(String[] args) {
        String s = "Register A: 729\n" +
                "Register B: 0\n" +
                "Register C: 0\n" +
                "\n" +
                "Program: 0,1,5,4,3,0";

        String t = "Register A: 27575648\n" +
                "Register B: 0\n" +
                "Register C: 0\n" +
                "\n" +
                "Program: 2,4,1,2,7,5,4,1,1,3,5,5,0,3,3,0";

        String u = "Register A: 117440\n" +
                "Register B: 0\n" +
                "Register C: 0\n" +
                "\n" +
                "Program: 0,3,5,4,3,0";

        String[] ss = u.split("\n");


        int a = 0, b = 0, c = 0;
        String[] p = ss[4].split(": ")[1].split(",");
        int[] pr = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            pr[i] = Integer.parseInt(p[i]);
        }

        a = Integer.parseInt(ss[0].split(": ")[1]);
        b = Integer.parseInt(ss[1].split(": ")[1]);
        c = Integer.parseInt(ss[2].split(": ")[1]);

        int i = 0;
        int operand;
        while (i < pr.length) {
            int instr = pr[i];
            operand = pr[i + 1];
            int litOp = operand;
            int comboOp = operand;
            if (operand == 4) {
                comboOp = a;
            }
            if (operand == 5) {
                comboOp = b;
            }
            if (operand == 6) {
                comboOp = c;
            }
            if (instr == 0) {
                // adv
                a = (int) (a / Math.pow(2, comboOp));
            }
            if (instr == 6) {
                // bdv
                b = (int) (a / Math.pow(2, comboOp));
            }
            if (instr == 7) {
                // cdv
                c = (int) (a / Math.pow(2, comboOp));
            }
            if (instr == 1) {
                b = b ^ litOp;
            }
            if (instr == 2) {
                b = comboOp % 8;
            }
            if (instr == 4) {
                b = b ^ c;
            }
            if (instr == 5) {
                //out
                System.out.print(comboOp % 8);
                System.out.print(",");
            }

            if (instr == 3) {
                if (a == 0) {
//                    System.out.println("Do nothing");
                    i += 2;
                } else {
                    i = litOp;
                }
            } else {
                i += 2;
            }


        }
        System.out.println("here");
    }


}
