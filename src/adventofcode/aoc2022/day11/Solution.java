package adventofcode.aoc2022.day11;

import java.util.*;

public class Solution {

    public static void main(String[] args) {


        String s = "Starting items: 89, 84, 88, 78, 70\n" +
                "  Starting items: 76, 62, 61, 54, 69, 60, 85\n" +
                "  Starting items: 83, 89, 53\n" +
                "  Starting items: 95, 94, 85, 57\n" +
                "  Starting items: 82, 98\n" +
                "  Starting items: 69\n" +
                "  Starting items: 82, 70, 58, 87, 59, 99, 92, 65\n" +
                "  Starting items: 91, 53, 96, 98, 68, 82";

        String[] ss = s.split("\n");
        List<Queue<Long>> monkeys = new ArrayList<>();

        for (int i = 0; i < ss.length; i++) {
            String t = ss[i].split(": ")[1];
            String[] u = t.split(",");
            Queue<Long> x = new ArrayDeque<>();
            for (int j = 0; j < u.length; j++) {
                x.add(Long.parseLong(u[j].trim()));
            }
            monkeys.add(x);
        }
        int[] ticks = new int[8];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < monkeys.size(); j++) {
                Queue<Long> list = monkeys.get(j);
                int size = list.size();
                System.out.println("Monkey " + j + " elements " + size);
                for (int k = 0; k < size; k++) {
                    long newValue = applyOp(j, list.element());
                    newValue = newValue / 3;
                    long nextM = testOp(j, newValue);
                    monkeys.get((int) nextM).add(newValue);
                    ticks[j]++;
                    list.remove();
                }
            }
        }
        System.out.println("here");
        // 56168 too high
        // 55004 too low
    }

    private static long testOp(long j, long value) {
        if (j == 0) return testMonkey0(value);
        if (j == 1) return testMonkey1(value);
        if (j == 2) return testMonkey2(value);
        if (j == 3) return testMonkey3(value);
        if (j == 4) return testMonkey4(value);
        if (j == 5) return testMonkey5(value);
        if (j == 6) return testMonkey6(value);
        if (j == 7) return testMonkey7(value);
        return 0;
    }

    private static long applyOp(long j, long value) {
        if (j == 0) return applyOp0(value);
        if (j == 1) return applyOp1(value);
        if (j == 2) return applyOp2(value);
        if (j == 3) return applyOp3(value);
        if (j == 4) return applyOp4(value);
        if (j == 5) return applyOp5(value);
        if (j == 6) return applyOp6(value);
        if (j == 7) return applyOp7(value);
        return 0;
    }

    public static long applyOp0(long x) {
        return x * 5;
    }

    public static long testMonkey0(long x) {
        return x % 7 == 0 ? 6 : 7;
    }

    public static long applyOp1(long x) {
        return x + 1;
    }

    public static long testMonkey1(long x) {
        return x % 17 == 0 ? 0 : 6;
    }

    public static long applyOp2(long x) {
        return x + 8;
    }

    public static long testMonkey2(long x) {
        return x % 11 == 0 ? 5 : 3;
    }

    public static long applyOp3(long x) {
        return x + 4;
    }

    public static long testMonkey3(long x) {
        return x % 13 == 0 ? 0 : 1;
    }

    public static long applyOp4(long x) {
        return x + 7;
    }

    public static long testMonkey4(long x) {
        return x % 19 == 0 ? 5 : 2;
    }

    public static long applyOp5(long x) {
        return x + 2;
    }

    public static long testMonkey5(long x) {
        return x % 2 == 0 ? 1 : 3;
    }

    public static long applyOp6(long x) {
        return x * 11;
    }

    public static long testMonkey6(long x) {
        return x % 5 == 0 ? 7 : 4;
    }

    public static long applyOp7(long x) {
        return x * x;
    }

    public static long testMonkey7(long x) {
        return x % 3 == 0 ? 4 : 2;
    }


}
