package adventofcode.aoc2024.day17;

/**
 * https://adventofcode.com/2024/day/17
 */
public class Main2 {

    public static void main(String[] args) {
        String s = "Register A: 2024\n" +
                "Register B: 0\n" +
                "Register C: 0\n" +
                "\n" +
                "Program: 0,3,5,4,3,0";

        String t = "Register A: 27575648\n" +
                "Register B: 0\n" +
                "Register C: 0\n" +
                "\n" +
                "Program: 2,4,1,2,7,5,4,1,1,3,5,5,0,3,3,0";

        String[] ss = t.split("\n");


        int a = 0, b = 0, c = 0;
        String[] p = ss[4].split(": ")[1].split(",");
        int[] pr = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            pr[i] = Integer.parseInt(p[i]);
        }

//        a = Integer.parseInt(ss[0].split(": ")[1]);
        b = Integer.parseInt(ss[1].split(": ")[1]);
        c = Integer.parseInt(ss[2].split(": ")[1]);

        String findMe = ss[4].split(": ")[1] + ",";
        int k = 1;
        int kb = b,kc = c;
        while (true) {
            a = k;
            b = kb;
            c = kc;
            k++;
            String result = "";
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
                    result += comboOp % 8;
                    result += ",";
                }
                if (instr == 3) {
                    if (a == 0) {
                        i += 2;
                    } else {
                        i = litOp;
                    }
                } else {
                    i += 2;
                }
            }
            if (k == 117440) {
                System.out.println("here");
            }
            if (findMe.equals(result)) {
                break;
            }
            System.out.println("done with " + k);
        }
        System.out.println(a);
        System.out.println("here");
    }


}
