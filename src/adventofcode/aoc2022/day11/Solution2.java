package adventofcode.aoc2022.day11;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution2 {

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
        List<Queue<BigDecimal>> monkeys = new ArrayList<>();

        for (int i = 0; i < ss.length; i++) {
            String t = ss[i].split(": ")[1];
            String[] u = t.split(",");
            Queue<BigDecimal> x = new ArrayDeque<>();
            for (int j = 0; j < u.length; j++) {
                x.add(BigDecimal.valueOf(Long.parseLong(u[j].trim())));
            }
            monkeys.add(x);
        }
        long[] ticks = new long[8];
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
            for (int j = 0; j < monkeys.size(); j++) {
                Queue<BigDecimal> list = monkeys.get(j);
                int size = list.size();
                for (int k = 0; k < size; k++) {
                    BigDecimal newValue = applyOp(j, list.element());
                    long nextM = testOp(j, newValue);
                    if (newValue.compareTo(BigDecimal.valueOf(9699690)) >= 0) {
                        newValue = newValue.remainder(BigDecimal.valueOf(9699690));
                    }
                    monkeys.get((int) nextM).add(newValue);
                    ticks[j]++;
                    list.remove();
                }
            }
        }
        System.out.println("here");
        // 14,636,993,466
    }

    private static long testOp(long j, BigDecimal value) {
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

    private static BigDecimal applyOp(long j, BigDecimal value) {
        if (j == 0) return applyOp0(value);
        if (j == 1) return applyOp1(value);
        if (j == 2) return applyOp2(value);
        if (j == 3) return applyOp3(value);
        if (j == 4) return applyOp4(value);
        if (j == 5) return applyOp5(value);
        if (j == 6) return applyOp6(value);
        if (j == 7) return applyOp7(value);
        return BigDecimal.ZERO;
    }

    public static BigDecimal applyOp0(BigDecimal x) {
        return x.multiply(BigDecimal.valueOf(5));
    }

    public static long testMonkey0(BigDecimal x) {
        if (x.remainder(new BigDecimal(7)).compareTo(BigDecimal.ZERO) == 0) {
            return 6;
        }
        return 7;
    }

    public static BigDecimal applyOp1(BigDecimal x) {
        return x.add(BigDecimal.valueOf(1));
    }

    public static long testMonkey1(BigDecimal x) {
        if (x.remainder(new BigDecimal(17)).compareTo(BigDecimal.ZERO) == 0) {
            return 0;
        }
        return 6;
    }

    public static BigDecimal applyOp2(BigDecimal x) {
        return x.add(BigDecimal.valueOf(8));
    }

    public static long testMonkey2(BigDecimal x) {
        if (x.remainder(new BigDecimal(11)).compareTo(BigDecimal.ZERO) == 0) {
            return 5;
        }
        return 3;
    }

    public static BigDecimal applyOp3(BigDecimal x) {
        return x.add(BigDecimal.valueOf(4));
    }

    public static long testMonkey3(BigDecimal x) {
        if (x.remainder(new BigDecimal(13)).compareTo(BigDecimal.ZERO) == 0) {
            return 0;
        }
        return 1;
    }

    public static BigDecimal applyOp4(BigDecimal x) {
        return x.add(BigDecimal.valueOf(7));
    }

    public static long testMonkey4(BigDecimal x) {
        if (x.remainder(new BigDecimal(19)).compareTo(BigDecimal.ZERO) == 0) {
            return 5;
        }
        return 2;
    }

    public static BigDecimal applyOp5(BigDecimal x) {
        return x.add(BigDecimal.valueOf(2));
    }

    public static long testMonkey5(BigDecimal x) {
        if (x.remainder(new BigDecimal(2)).compareTo(BigDecimal.ZERO) == 0) {
            return 1;
        }
        return 3;
    }

    public static BigDecimal applyOp6(BigDecimal x) {
        return x.multiply(BigDecimal.valueOf(11));
    }

    public static long testMonkey6(BigDecimal x) {
        if (x.remainder(new BigDecimal(5)).compareTo(BigDecimal.ZERO) == 0) {
            return 7;
        }
        return 4;
    }

    public static BigDecimal applyOp7(BigDecimal x) {
        return x.multiply(x);
    }

    public static long testMonkey7(BigDecimal x) {
        if (x.remainder(new BigDecimal(3)).compareTo(BigDecimal.ZERO) == 0) {
            return 4;
        }
        return 2;
    }


}
