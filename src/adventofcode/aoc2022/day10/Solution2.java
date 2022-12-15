package adventofcode.aoc2022.day10;

public class Solution2 {

    public static void main(String[] args) {


        String s = "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx 5\n" +
                "noop\n" +
                "addx 1\n" +
                "addx 2\n" +
                "addx 5\n" +
                "addx 2\n" +
                "addx 1\n" +
                "noop\n" +
                "addx 5\n" +
                "noop\n" +
                "addx -1\n" +
                "noop\n" +
                "addx 5\n" +
                "noop\n" +
                "noop\n" +
                "addx 5\n" +
                "addx 1\n" +
                "noop\n" +
                "noop\n" +
                "addx 3\n" +
                "addx 2\n" +
                "noop\n" +
                "addx -38\n" +
                "noop\n" +
                "addx 3\n" +
                "addx 2\n" +
                "addx -5\n" +
                "addx 12\n" +
                "addx 2\n" +
                "addx 27\n" +
                "addx -40\n" +
                "addx 19\n" +
                "addx 2\n" +
                "addx 19\n" +
                "addx -18\n" +
                "addx 2\n" +
                "addx 5\n" +
                "addx 2\n" +
                "addx -23\n" +
                "addx 22\n" +
                "addx 4\n" +
                "addx -34\n" +
                "addx -1\n" +
                "addx 5\n" +
                "noop\n" +
                "addx 2\n" +
                "addx 1\n" +
                "addx 20\n" +
                "addx -17\n" +
                "noop\n" +
                "addx 25\n" +
                "addx -17\n" +
                "addx -2\n" +
                "noop\n" +
                "addx 3\n" +
                "addx 19\n" +
                "addx -12\n" +
                "addx 3\n" +
                "addx -2\n" +
                "addx 3\n" +
                "addx 1\n" +
                "noop\n" +
                "addx 5\n" +
                "noop\n" +
                "noop\n" +
                "addx -37\n" +
                "addx 3\n" +
                "addx 4\n" +
                "noop\n" +
                "addx 24\n" +
                "addx -6\n" +
                "addx -15\n" +
                "addx 2\n" +
                "noop\n" +
                "addx 6\n" +
                "addx -2\n" +
                "addx 6\n" +
                "addx -12\n" +
                "addx -2\n" +
                "addx 19\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx 3\n" +
                "noop\n" +
                "addx 7\n" +
                "addx -2\n" +
                "addx -24\n" +
                "addx -11\n" +
                "addx 4\n" +
                "addx 3\n" +
                "addx -2\n" +
                "noop\n" +
                "addx 7\n" +
                "addx -2\n" +
                "addx 2\n" +
                "noop\n" +
                "addx 3\n" +
                "addx 7\n" +
                "noop\n" +
                "addx -2\n" +
                "addx 5\n" +
                "addx 2\n" +
                "addx 5\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx 3\n" +
                "addx -35\n" +
                "addx 35\n" +
                "addx -21\n" +
                "addx -14\n" +
                "noop\n" +
                "addx 5\n" +
                "addx 2\n" +
                "addx 33\n" +
                "addx -7\n" +
                "addx -23\n" +
                "addx 5\n" +
                "addx 2\n" +
                "addx 1\n" +
                "noop\n" +
                "noop\n" +
                "addx 5\n" +
                "addx -1\n" +
                "noop\n" +
                "addx 3\n" +
                "addx -23\n" +
                "addx 30\n" +
                "addx 1\n" +
                "noop\n" +
                "addx 4\n" +
                "addx -17\n" +
                "addx 11\n" +
                "noop\n" +
                "noop\n";
        String t = "addx 15\n" +
                "addx -11\n" +
                "addx 6\n" +
                "addx -3\n" +
                "addx 5\n" +
                "addx -1\n" +
                "addx -8\n" +
                "addx 13\n" +
                "addx 4\n" +
                "noop\n" +
                "addx -1\n" +
                "addx 5\n" +
                "addx -1\n" +
                "addx 5\n" +
                "addx -1\n" +
                "addx 5\n" +
                "addx -1\n" +
                "addx 5\n" +
                "addx -1\n" +
                "addx -35\n" +
                "addx 1\n" +
                "addx 24\n" +
                "addx -19\n" +
                "addx 1\n" +
                "addx 16\n" +
                "addx -11\n" +
                "noop\n" +
                "noop\n" +
                "addx 21\n" +
                "addx -15\n" +
                "noop\n" +
                "noop\n" +
                "addx -3\n" +
                "addx 9\n" +
                "addx 1\n" +
                "addx -3\n" +
                "addx 8\n" +
                "addx 1\n" +
                "addx 5\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx -36\n" +
                "noop\n" +
                "addx 1\n" +
                "addx 7\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx 2\n" +
                "addx 6\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx 1\n" +
                "noop\n" +
                "noop\n" +
                "addx 7\n" +
                "addx 1\n" +
                "noop\n" +
                "addx -13\n" +
                "addx 13\n" +
                "addx 7\n" +
                "noop\n" +
                "addx 1\n" +
                "addx -33\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx 2\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx 8\n" +
                "noop\n" +
                "addx -1\n" +
                "addx 2\n" +
                "addx 1\n" +
                "noop\n" +
                "addx 17\n" +
                "addx -9\n" +
                "addx 1\n" +
                "addx 1\n" +
                "addx -3\n" +
                "addx 11\n" +
                "noop\n" +
                "noop\n" +
                "addx 1\n" +
                "noop\n" +
                "addx 1\n" +
                "noop\n" +
                "noop\n" +
                "addx -13\n" +
                "addx -19\n" +
                "addx 1\n" +
                "addx 3\n" +
                "addx 26\n" +
                "addx -30\n" +
                "addx 12\n" +
                "addx -1\n" +
                "addx 3\n" +
                "addx 1\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx -9\n" +
                "addx 18\n" +
                "addx 1\n" +
                "addx 2\n" +
                "noop\n" +
                "noop\n" +
                "addx 9\n" +
                "noop\n" +
                "noop\n" +
                "noop\n" +
                "addx -1\n" +
                "addx 2\n" +
                "addx -37\n" +
                "addx 1\n" +
                "addx 3\n" +
                "noop\n" +
                "addx 15\n" +
                "addx -21\n" +
                "addx 22\n" +
                "addx -6\n" +
                "addx 1\n" +
                "noop\n" +
                "addx 2\n" +
                "addx 1\n" +
                "noop\n" +
                "addx -10\n" +
                "noop\n" +
                "noop\n" +
                "addx 20\n" +
                "addx 1\n" +
                "addx 2\n" +
                "addx 2\n" +
                "addx -6\n" +
                "addx -11\n" +
                "noop\n" +
                "noop\n" +
                "noop";

        String[] instructions = s.split("\n");
        long x = 1;
        long c = 0;
        String sol = "";

        for (int i = 0; i < instructions.length; i++) {
            c++;
            long l = c % 40;
            if (l == 0) {
                l = 40;
            }
            if (Math.abs((l - 1) - x) <= 1) {
                sol += "#";
            } else {
                sol += ".";
            }
            if (c % 40 == 0) {
                sol += "\n";
            }

            if (instructions[i].startsWith("a")) {
                c++;
                l = c % 40;
                if (l == 0) {
                    l = 40;
                }
                if (Math.abs((l - 1) - x) <= 1) {
                    sol += "#";
                } else {
                    sol += ".";
                }
                if (c % 40 == 0) {
                    sol += "\n";
                }
                String[] m = instructions[i].split(" ");
                int y = Integer.parseInt(m[1]);
                x = x + y;

            }
        }

        System.out.println(sol);
    }


}
