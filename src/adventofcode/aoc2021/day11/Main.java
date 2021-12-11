package adventofcode.aoc2021.day11;

public class Main {

    static int[][] mat = new int[10][10];
    static int[][] mat2;


    public static void main(String[] args) {

        String s = "4112256372\n" +
                "3143253712\n" +
                "4516848631\n" +
                "3783477137\n" +
                "3746723582\n" +
                "5861358884\n" +
                "4843351774\n" +
                "2316447621\n" +
                "6643817745\n" +
                "6366815868";

        String t = "5483143223\n" +
                "2745854711\n" +
                "5264556173\n" +
                "6141336146\n" +
                "6357385478\n" +
                "4167524645\n" +
                "2176841721\n" +
                "6882881134\n" +
                "4846848554\n" +
                "5283751526";

        String[] ss = s.split("\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                mat[i][j] = Integer.parseInt(ss[i].substring(j, j + 1));
            }
        }
        int flashes = 0;
        for (int k = 0; k < 100; k++) {
            System.out.println(k + " " + flashes);
            mat2 = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    mat[i][j]++;
                }
            }
            boolean b = true;
            while (b) {
                b = false;
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (mat[i][j] >= 10) {
                            b = true;
                            flashes++;
                            mat[i][j] = 0;
                            mat2[i][j] = -1;
//                            System.out.println("FLASH " + i + " " + j);
                            extracted(i, j);
                        }

                    }
                }
            }
        }

        System.out.println(flashes);
    }

    private static void extracted(int i, int j) {
        if (i > 0) {
            if (mat[i - 1][j] > 0 && mat2[i - 1][j] == 0) {  // add only if not already added
                mat[i - 1][j]++;
            }
            if (j > 0) {
                if (mat[i - 1][j - 1] > 0 && mat2[i - 1][j - 1] == 0) {
                    mat[i - 1][j - 1]++;
                }
            }
            if (j < 9) {
                if (mat[i - 1][j + 1] > 0 && mat2[i - 1][j + 1] == 0) {
                    mat[i - 1][j + 1]++;
                }
            }
        }
        if (i < 9) {
            if (mat[i + 1][j] > 0 && mat2[i + 1][j] == 0) {
                mat[i + 1][j]++;
            }
            if (j < 9) {
                if (mat[i + 1][j + 1] > 0 && mat2[i + 1][j + 1] == 0) {
                    mat[i + 1][j + 1]++;
                }
            }
            if (j > 0) {
                if (mat[i + 1][j - 1] > 0 && mat2[i + 1][j - 1] == 0) {
                    mat[i + 1][j - 1]++;
                }
            }
        }
        if (j > 0) {
            if (mat[i][j - 1] > 0 && mat2[i][j - 1] == 0) {
                mat[i][j - 1]++;
            }
        }
        if (j < 9) {
            if (mat[i][j + 1] > 0 && mat2[i][j + 1] == 0) {
                mat[i][j + 1]++;
            }
        }
    }
}
