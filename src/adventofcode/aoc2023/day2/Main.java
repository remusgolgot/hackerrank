package adventofcode.aoc2023.day2;

public class Main {

    static String sz = "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green\n" +
            "Game 2: 20 green, 4 red; 6 blue, 9 red, 7 green; 6 green\n" +
            "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red\n" +
            "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red\n" +
            "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green";

    static String s = "Game 1: 4 red, 1 green, 15 blue; 6 green, 2 red, 10 blue; 7 blue, 6 green, 4 red; 12 blue, 10 green, 3 red\n" +
            "Game 2: 3 green, 18 blue; 14 green, 4 red, 2 blue; 3 red, 14 green, 15 blue\n" +
            "Game 3: 12 green, 2 blue; 9 green; 1 red, 11 blue, 4 green\n" +
            "Game 4: 4 blue, 8 green, 5 red; 6 red, 7 blue, 9 green; 2 green, 2 red, 2 blue; 2 green, 6 blue, 9 red; 10 red, 9 green\n" +
            "Game 5: 12 red, 1 green, 7 blue; 13 red, 16 blue; 16 blue, 10 red; 4 blue; 16 blue, 7 red; 1 blue, 7 red\n" +
            "Game 6: 17 blue, 2 red; 5 blue, 6 green, 2 red; 5 green, 5 blue; 5 green, 12 blue, 4 red\n" +
            "Game 7: 2 red, 1 blue, 10 green; 8 red, 14 green, 9 blue; 15 red, 1 blue, 6 green; 9 blue, 3 green, 10 red; 7 blue, 13 red, 4 green\n" +
            "Game 8: 1 green, 2 blue; 7 red, 2 blue, 1 green; 1 red, 2 green; 4 red, 1 blue; 11 red, 2 green, 2 blue; 1 blue, 2 green, 11 red\n" +
            "Game 9: 11 green, 11 blue, 6 red; 2 green, 3 blue, 2 red; 2 red, 11 blue, 14 green; 5 green, 7 red, 7 blue; 7 green, 1 red, 12 blue; 1 red, 8 green, 7 blue\n" +
            "Game 10: 2 red, 8 green, 7 blue; 10 red, 5 green, 2 blue; 4 red, 8 green, 16 blue; 10 blue, 3 green, 15 red\n" +
            "Game 11: 2 blue, 2 green, 5 red; 1 green, 3 red, 3 blue; 11 green, 1 red, 2 blue\n" +
            "Game 12: 8 blue, 11 green, 14 red; 10 green, 13 red, 2 blue; 1 red, 6 green, 4 blue; 13 red, 11 green, 6 blue\n" +
            "Game 13: 15 red, 17 green, 1 blue; 12 red, 1 blue, 1 green; 2 red, 1 blue, 14 green\n" +
            "Game 14: 6 green, 11 red, 3 blue; 6 green, 2 blue; 2 green, 10 red, 8 blue; 2 red; 1 green, 9 red; 3 blue, 1 green, 3 red\n" +
            "Game 15: 11 blue, 11 green, 4 red; 3 green, 10 blue; 2 red, 9 green, 9 blue\n" +
            "Game 16: 2 blue, 11 green; 1 red, 1 blue, 11 green; 12 green, 1 blue, 1 red; 3 blue, 14 green, 1 red; 14 green, 4 blue; 2 blue, 12 green\n" +
            "Game 17: 1 red, 2 blue, 4 green; 4 blue, 3 green; 1 green, 1 red, 6 blue; 1 red, 7 blue; 2 green\n" +
            "Game 18: 3 red, 3 blue, 7 green; 2 blue, 2 red, 2 green; 4 red, 12 green; 5 green, 2 blue, 4 red; 3 red\n" +
            "Game 19: 15 red, 7 blue, 10 green; 5 green, 8 red; 9 green, 8 red; 5 red, 10 green\n" +
            "Game 20: 15 blue, 6 green, 11 red; 13 red, 9 blue, 1 green; 15 blue, 10 red, 11 green\n" +
            "Game 21: 15 red, 4 green; 11 red, 2 blue, 4 green; 5 blue, 2 green, 4 red; 4 red, 5 blue; 6 red, 3 blue, 1 green\n" +
            "Game 22: 4 green, 4 red, 13 blue; 3 red, 7 blue, 9 green; 12 blue, 13 green, 5 red\n" +
            "Game 23: 20 green, 4 red; 6 blue, 9 red, 7 green; 6 green\n" +
            "Game 24: 1 green, 3 blue, 6 red; 1 green, 1 blue, 2 red; 3 blue, 5 red, 1 green\n" +
            "Game 25: 2 red, 9 blue, 2 green; 2 green, 1 red, 5 blue; 3 red, 1 green, 3 blue; 8 blue, 2 green, 3 red; 12 blue, 3 red; 1 blue, 2 green, 1 red\n" +
            "Game 26: 2 blue, 5 green, 20 red; 2 blue, 6 red, 9 green; 3 red, 2 blue, 5 green\n" +
            "Game 27: 17 blue, 2 red, 14 green; 15 green, 16 blue, 2 red; 13 blue, 13 green; 1 red, 7 green, 3 blue; 1 blue, 2 green\n" +
            "Game 28: 5 blue, 6 red, 3 green; 7 red, 19 green; 11 blue, 13 green\n" +
            "Game 29: 1 blue, 8 red, 7 green; 1 green, 1 red; 8 red, 7 green, 1 blue; 7 green, 2 red; 1 blue, 7 red; 1 blue, 2 red, 5 green\n" +
            "Game 30: 3 red, 17 blue; 11 red, 3 blue, 8 green; 7 green, 12 blue, 10 red; 5 blue, 2 green\n" +
            "Game 31: 14 blue, 7 green; 12 green, 14 blue, 2 red; 17 blue, 2 red, 8 green; 2 red, 3 blue, 11 green; 9 green, 4 blue; 1 red, 3 green, 1 blue\n" +
            "Game 32: 15 red, 1 blue, 10 green; 15 green, 10 red, 1 blue; 2 red, 6 green, 1 blue\n" +
            "Game 33: 10 green, 1 red, 16 blue; 11 blue, 14 green, 3 red; 14 green, 13 blue; 17 blue, 2 red, 3 green\n" +
            "Game 34: 8 red, 7 blue, 8 green; 3 green, 1 red; 1 red, 1 green, 5 blue; 6 red, 8 green, 2 blue; 7 red, 8 blue, 3 green\n" +
            "Game 35: 5 blue, 19 red; 2 blue, 11 red, 1 green; 16 red, 10 blue; 7 green, 3 blue, 6 red; 3 green, 18 red, 5 blue; 8 blue, 5 red\n" +
            "Game 36: 9 red, 6 green, 10 blue; 9 red, 15 green, 6 blue; 6 red, 1 blue, 14 green\n" +
            "Game 37: 7 green, 8 red, 2 blue; 3 blue, 5 red, 16 green; 1 green, 1 red, 3 blue\n" +
            "Game 38: 5 green, 5 red, 3 blue; 10 blue, 19 red, 9 green; 2 red, 3 blue, 11 green\n" +
            "Game 39: 15 red, 11 blue, 5 green; 11 green, 2 red, 6 blue; 2 blue, 3 green, 6 red; 15 red, 3 blue, 13 green\n" +
            "Game 40: 7 green, 4 red, 1 blue; 6 blue, 6 green, 2 red; 2 blue, 3 red, 1 green; 1 blue, 3 red, 3 green; 2 red, 5 green, 3 blue\n" +
            "Game 41: 10 blue, 8 green, 9 red; 7 blue, 9 red, 2 green; 10 blue, 4 red, 5 green\n" +
            "Game 42: 8 blue, 13 green, 14 red; 8 blue, 1 green, 11 red; 4 red, 6 green, 3 blue; 14 green, 4 red, 2 blue\n" +
            "Game 43: 2 red, 10 green, 19 blue; 5 blue, 4 green, 9 red; 9 green, 9 red, 2 blue\n" +
            "Game 44: 6 red, 2 green, 3 blue; 2 blue, 12 red, 6 green; 1 red, 10 blue; 12 red, 6 green, 2 blue; 14 red, 13 green, 3 blue; 10 green, 9 blue, 11 red\n" +
            "Game 45: 2 blue, 1 red, 1 green; 1 green, 1 blue; 2 green, 2 blue\n" +
            "Game 46: 7 green, 1 red; 1 green, 4 blue, 1 red; 3 blue, 4 green, 1 red; 1 red, 4 green; 1 blue, 12 green, 1 red; 16 green, 1 blue\n" +
            "Game 47: 4 blue, 8 green, 3 red; 6 red, 1 green, 3 blue; 16 green, 4 blue, 1 red; 4 blue, 8 red\n" +
            "Game 48: 1 blue, 9 red, 8 green; 8 green, 2 blue, 6 red; 2 green; 4 blue, 5 red; 1 blue, 9 red, 9 green; 1 red, 1 blue, 3 green\n" +
            "Game 49: 3 green, 2 blue; 7 blue, 4 red; 20 green, 5 red, 13 blue; 20 green, 1 red, 6 blue\n" +
            "Game 50: 3 red, 3 green; 3 green, 3 red; 2 blue, 10 red; 3 blue, 5 green; 14 red, 2 green, 2 blue; 7 red, 2 green\n" +
            "Game 51: 3 green, 3 blue, 2 red; 4 green, 16 red, 3 blue; 1 blue, 3 red; 9 red, 1 blue, 4 green\n" +
            "Game 52: 6 red, 18 green, 7 blue; 2 blue, 1 red, 5 green; 8 blue, 6 red, 1 green; 1 red, 1 blue; 6 red, 3 green, 10 blue\n" +
            "Game 53: 1 blue, 10 red, 3 green; 13 red, 2 green, 1 blue; 1 green, 2 red\n" +
            "Game 54: 4 blue, 6 green, 2 red; 5 blue, 6 red, 2 green; 6 blue, 4 green, 8 red; 13 red, 10 blue, 1 green; 5 red, 5 green, 9 blue\n" +
            "Game 55: 4 green, 18 red, 4 blue; 9 blue, 7 green, 16 red; 5 red, 6 blue, 14 green; 13 green, 11 red, 9 blue; 6 blue, 13 green, 1 red; 10 blue, 12 red, 14 green\n" +
            "Game 56: 8 green, 5 blue, 10 red; 10 green, 7 red, 12 blue; 11 red, 12 blue, 1 green; 4 blue, 6 red, 10 green; 17 blue, 8 green, 2 red\n" +
            "Game 57: 1 green, 2 red; 2 green, 5 red, 1 blue; 13 red, 3 green, 4 blue; 3 blue, 13 red, 9 green\n" +
            "Game 58: 1 red, 7 blue, 4 green; 2 green, 1 blue, 1 red; 1 green, 11 blue; 12 blue; 1 blue, 5 green, 1 red; 3 green, 11 blue, 1 red\n" +
            "Game 59: 5 green, 3 blue, 17 red; 2 red, 9 green; 1 blue, 4 green\n" +
            "Game 60: 5 red, 5 green, 1 blue; 2 red, 2 blue, 6 green; 2 red, 3 blue, 3 green\n" +
            "Game 61: 2 green, 3 blue, 4 red; 17 green, 1 blue; 1 green, 6 red, 4 blue; 3 blue, 9 green, 3 red; 18 green, 7 red, 2 blue\n" +
            "Game 62: 5 red; 3 blue, 9 green; 3 red, 13 blue, 10 green; 14 green, 1 red, 2 blue; 7 blue, 13 green\n" +
            "Game 63: 12 blue, 5 green; 5 green, 1 red, 1 blue; 4 red, 7 green, 9 blue; 8 blue, 2 green, 7 red\n" +
            "Game 64: 3 blue, 11 green; 5 blue, 2 red, 5 green; 17 green, 5 blue, 1 red; 4 red, 3 blue, 4 green\n" +
            "Game 65: 2 red, 1 blue, 2 green; 7 green, 2 red, 1 blue; 2 blue, 7 green, 1 red; 3 blue, 8 green, 3 red\n" +
            "Game 66: 4 red, 12 blue, 1 green; 20 blue, 3 green, 2 red; 11 blue, 1 green\n" +
            "Game 67: 12 blue, 10 red, 13 green; 19 green, 4 red, 7 blue; 12 red, 9 blue, 13 green\n" +
            "Game 68: 2 blue, 17 green; 12 green, 2 red; 5 red, 2 green, 4 blue; 4 blue\n" +
            "Game 69: 17 blue, 3 red, 1 green; 4 green, 8 blue, 8 red; 4 green, 7 red, 1 blue; 8 red, 1 green, 11 blue; 13 blue, 10 red, 9 green; 14 blue, 5 green, 6 red\n" +
            "Game 70: 1 red, 2 blue, 4 green; 13 blue, 3 red, 2 green; 6 green, 8 blue\n" +
            "Game 71: 5 red, 7 green, 1 blue; 11 green, 4 red, 1 blue; 1 red, 12 green, 10 blue; 1 red, 7 blue, 12 green\n" +
            "Game 72: 9 blue, 4 green, 1 red; 6 green, 4 blue; 8 green, 5 blue, 1 red\n" +
            "Game 73: 1 blue, 10 green, 14 red; 4 green; 2 blue, 9 red, 4 green; 2 blue, 13 green; 13 green, 13 red; 7 red, 5 green, 2 blue\n" +
            "Game 74: 3 red, 1 blue, 3 green; 4 green, 1 blue, 1 red; 2 blue, 10 green, 1 red; 1 blue, 3 red, 1 green\n" +
            "Game 75: 1 red, 1 blue, 1 green; 2 red, 1 green, 4 blue; 2 red, 4 blue; 1 blue, 1 red\n" +
            "Game 76: 4 green, 2 blue, 6 red; 7 green, 1 red; 8 green, 4 red\n" +
            "Game 77: 8 green, 7 blue, 5 red; 6 red, 14 green, 7 blue; 8 green, 7 blue; 1 red, 8 green, 8 blue\n" +
            "Game 78: 6 red, 3 blue, 3 green; 7 blue, 10 red; 5 green, 10 blue, 1 red; 3 green, 11 blue, 4 red; 14 red, 9 blue, 2 green; 16 red, 2 green, 12 blue\n" +
            "Game 79: 1 green; 5 green; 11 green, 3 blue, 2 red; 3 blue\n" +
            "Game 80: 2 green, 2 red; 1 blue, 1 green, 1 red; 1 blue, 1 green, 2 red; 2 red; 5 green\n" +
            "Game 81: 10 blue, 2 red, 9 green; 4 red, 12 blue, 5 green; 7 green, 4 blue, 6 red; 1 red, 13 green, 14 blue; 13 green, 11 blue\n" +
            "Game 82: 4 blue, 2 green; 7 blue, 3 green, 5 red; 1 red, 4 blue, 3 green; 5 blue, 1 red, 6 green; 6 green, 4 red; 11 blue, 3 red, 5 green\n" +
            "Game 83: 12 green; 5 red, 8 green; 11 red, 14 green, 1 blue; 9 green, 4 red\n" +
            "Game 84: 5 blue, 1 red; 16 blue, 5 green; 1 red, 9 blue, 3 green; 11 blue; 1 green, 2 blue; 1 red, 7 blue, 4 green\n" +
            "Game 85: 17 red, 5 blue; 18 blue, 2 red, 2 green; 18 blue, 2 green, 8 red\n" +
            "Game 86: 4 red, 1 blue, 11 green; 6 blue, 7 green, 1 red; 3 green, 4 blue; 2 red, 7 blue, 2 green\n" +
            "Game 87: 4 red, 5 blue; 1 green, 15 red, 1 blue; 11 blue, 12 red\n" +
            "Game 88: 11 green, 3 red, 1 blue; 6 green, 1 blue, 1 red; 1 blue, 3 green; 2 blue, 4 green, 2 red\n" +
            "Game 89: 2 green; 1 red, 2 green, 3 blue; 4 blue, 1 red, 10 green; 4 blue, 5 green; 6 blue, 1 red, 10 green\n" +
            "Game 90: 15 red, 7 green, 17 blue; 7 blue, 1 red; 7 green, 6 red, 3 blue\n" +
            "Game 91: 2 blue, 17 red, 6 green; 1 green, 1 blue, 6 red; 6 red, 4 blue; 10 green, 14 red, 1 blue; 7 blue, 10 green, 10 red; 16 red, 11 green, 9 blue\n" +
            "Game 92: 1 green, 8 blue, 4 red; 4 green, 4 red, 4 blue; 1 green, 7 red, 4 blue\n" +
            "Game 93: 11 blue, 12 red, 1 green; 9 blue, 2 green, 5 red; 7 red, 5 blue, 2 green\n" +
            "Game 94: 7 blue, 10 green; 9 green, 9 blue, 2 red; 1 red, 5 green, 4 blue\n" +
            "Game 95: 1 green, 1 blue, 2 red; 6 red; 1 blue; 1 green, 1 blue, 6 red\n" +
            "Game 96: 1 blue, 1 red, 2 green; 4 red, 13 green, 1 blue; 1 blue, 13 green, 5 red; 7 green, 4 red\n" +
            "Game 97: 10 blue, 5 red, 5 green; 4 red, 8 green, 2 blue; 5 red, 2 green, 15 blue; 2 red, 1 green, 4 blue; 2 red, 14 blue; 14 blue, 4 green\n" +
            "Game 98: 11 red, 8 green, 9 blue; 3 blue, 1 green, 14 red; 10 blue, 2 red, 4 green; 7 blue, 11 red, 3 green; 5 red, 12 blue, 4 green; 7 green, 7 blue, 8 red\n" +
            "Game 99: 3 green, 2 blue, 1 red; 15 red, 8 blue, 7 green; 18 red, 12 blue, 2 green\n" +
            "Game 100: 11 red, 1 blue, 2 green; 3 red, 3 green; 1 blue, 8 red, 4 green; 5 green, 5 blue, 1 red; 2 green, 1 red, 6 blue; 2 green, 8 red, 1 blue\n";

    public static void main(String[] args) {
        int sol = 0;
        int maxRed = 12;
        int maxGreen = 13;
        int maxBlue = 14;
        boolean add;

        String[] ss = s.split("\n");
        for (int i = 0; i < ss.length; i++) {
            add = true;
            String u = ss[i];
            String t = u.substring(u.indexOf(":") + 1);
            String tt[] = t.split(";");
            for (int j = 0; j < tt.length; j++) {
                String zz[] = tt[j].split(", ");
                for (int k = 0; k < zz.length; k++) {
                    String cube[] = zz[k].trim().split(" ");
                    if (cube[1].equals("red")) {
                        if (Integer.parseInt(cube[0]) > maxRed) {
                            add = false;
                        }
                    }
                    if (cube[1].equals("green")) {
                        if (Integer.parseInt(cube[0]) > maxGreen) {
                            add = false;
                        }
                    }
                    if (cube[1].equals("blue")) {
                        if (Integer.parseInt(cube[0]) > maxBlue) {
                            add = false;
                        }
                    }
                }
            }
            if (add) {
                System.out.println(i+1);
                sol += (i+1);
            }
        }

        System.out.println(sol);
    }
}
