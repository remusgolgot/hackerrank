package adventofcode.aoc2024.day6;

/**
 * https://adventofcode.com/2024/day/6
 */
public class Main2 {

    public static void main(String[] args) {

        String s = "...#....#................................#..........................#..........#.............#..#.................................\n" +
                ".......#........................#.......#......................#............#.....................................................\n" +
                "..#......#....................................................................................#.......#................#..........\n" +
                "..................#...........#...#..#............................#.........#...................#...............................#.\n" +
                "..#...................................................................................................................#....#......\n" +
                "............#.............................#......................#.......#...........#..................##..............#.........\n" +
                "..............................#................................................#.............................................#....\n" +
                "....................#.#...........#...#....#..............#.........#.........#..................#...........#.................#..\n" +
                ".#........................................................................#.....#.......##.....................#..................\n" +
                ".#........................#..................................#............................#...#..........#.......#.............#..\n" +
                "................................#......#...............#...........................#.............................#..#.#...#....#..\n" +
                "..........................................................#..........#..#.......#........#............#.................#.........\n" +
                "......#.......#......................................................................................#................#...........\n" +
                "##......#...................................................#................#............................#.......................\n" +
                ".....#.................................................................#.....................#...............................#...#\n" +
                "...........................................................................................................#......................\n" +
                "........#......................#..........#..#....#....................#..##...........#..#.............................#.#......#\n" +
                "#...#..................#.....................#...#...#.......................................................#.....#..............\n" +
                "#...#..................#.#....#...............#...........#...................#.....##......................................#.....\n" +
                "......#............................................................................................#...#.#........................\n" +
                "......................................................#..............#.....#.....#..#...........#..............................#..\n" +
                ".........................##.#..............#............#....................................................................##...\n" +
                "..#....................#...........................................................................................#......#.##....\n" +
                "..............#........#..#.......#................#.....#.......................................................................#\n" +
                ".........#..........................#........#..........#...............#...................................#.............#.......\n" +
                "...........#.....................#.....#..............#......#.........................................#..........................\n" +
                ".......##.............................#.........#...............#...............#..............................................#..\n" +
                ".......#.....#.....#...........#............................................................................#..............#.....#\n" +
                "....#.............................................#....#....#....#...........................................##..............##...\n" +
                ".#.............#.......#.....#.........#....#......#.............#............#......#............#......................#........\n" +
                "..................................................................................................#....#..........................\n" +
                ".............................................#....................#...............................#.............#.................\n" +
                ".........#...............#.....................#...............#......#.................................................#.........\n" +
                "..........#.................................................................................#..............#..............#.....#.\n" +
                ".........................#........#.....#............#.....................#.......................................#..............\n" +
                ".....................#.....................#..............................#..................................#..........#.........\n" +
                "........................#.....................#..............................#.#................#.................................\n" +
                ".....................................................#...............#.......................................................#....\n" +
                ".................#.......#......##..............................##.................#..........................#....#....#........#\n" +
                ".............................#................................#..#...........#..........#.........................................\n" +
                ".#...........................#........#.#...#...#....#......#......#...........#..................##.........................#....\n" +
                ".......................................#......................................#................................................#..\n" +
                "..........##......#..............................................................#.......#....................#..#......#.........\n" +
                ".#...............#............#....#....................................^......#.........................................#.#......\n" +
                ".................#....................#..#....#.......................#.............................#.....#.....#............#....\n" +
                "...............................................................#...............##.................#........#.#....................\n" +
                "...................................#..#.........#.........#...............#.........#.......................................#.....\n" +
                ".........................#......................................................................................#............#....\n" +
                ".................................#............#............#.............................#........................................\n" +
                "..........#.........#...........................................#..#...#..#.......................................................\n" +
                ".#....#....#..........................................#.....#..........................................................#..........\n" +
                "...#...............#......................................................................#.............................#.........\n" +
                "....#......................#...........#......................................#..............#...........................#........\n" +
                ".......................................................#...........#.......#..............................#.......................\n" +
                "......#............#.#...........#............#...................#..................#................................##..........\n" +
                ".......#..........................................................................................#.....................##........\n" +
                "....................................#.........#..................##....................#.#...........#......................#.....\n" +
                ".........................#...............................................................#....................#...................\n" +
                "...............................#........................................................................#....................#....\n" +
                "..#.#.......................................................................#..........#.........#........#.......................\n" +
                "....#....#.....................#.............#..#........................#.............#.....#....................................\n" +
                "..#............................................................................#....................#.................#.....#.#...\n" +
                "..............................................#........#............##.#..............#...#...................#...................\n" +
                ".............................#..................#..................#.................................#............................\n" +
                "......#................................#....#..................................#............#.....................................\n" +
                "#..........#...#..................#...............................................................................................\n" +
                "......................................#......................................#.......#....#.......................................\n" +
                "......................................................................#......................................#...........##.....#.\n" +
                ".......#.............#................................................#.....#..#......#......................................#....\n" +
                "..........................................#...............#...#........#..........................................................\n" +
                "#..#......#..........#....#.......................................................................................................\n" +
                ".......#..#............................................................#........#...#.#...........................................\n" +
                ".#....#...#..#................................................#......................#............................................\n" +
                ".........................#...........#..........#............#...............................#...#...#..................#.........\n" +
                "....#......................#......#.......#....................#..........................#...............................#.......\n" +
                ".........................#...............#.........................#.........#..................................#.................\n" +
                "...............................#......................................................#...........................................\n" +
                "..................................................#.........................#...................#......#..........................\n" +
                "...................#.##..............................#................#........#..............................#...................\n" +
                ".#.................#..............................#................#............................#............#................#...\n" +
                "............#..............#....................................#.....#.....#..........#................#.........................\n" +
                "...................#.............................#...........##...........................................#.......................\n" +
                ".#.............##...........#............##...#.........................................................................#.......#.\n" +
                "........#................#....................#..........#....#.......#.#..............#..............#.................#.........\n" +
                "............................#..#...#..........................................................#......#............................\n" +
                ".........#.................#......#.............................................#...##.....#.................................##...\n" +
                "............#..........................................................................#..........#...................#...........\n" +
                "....................................#.............#............#..................#....#.#.......................#...#............\n" +
                "......#...................................................##....................................................................#.\n" +
                "...............................#.............#.#...............#.......................................#.#.......................#\n" +
                "..........#............................#....#.#.#.#..............................................................#................\n" +
                "....#...#............#.#.................................................#.....................................#.#................\n" +
                "...........#...............................##.........#............#.....................#........................................\n" +
                "...................#.............................#.........#..............................................#.....#.................\n" +
                ".........#................#.........#.............#.............#...#...........................................................#.\n" +
                ".....#...........................#............##............#................#...............................#.............#..#...\n" +
                "................#.#.......#.................#...................................................#.........#..........##.#.........\n" +
                ".........................#.................#...............#...........................#............#.............#..............#\n" +
                "...................#......#...........................#.....#.....................................................#...............\n" +
                "......#...........##......#..................#......#............##................................#..............................\n" +
                "....................#.........#...........................................................................................#....#..\n" +
                "................................................#....#.....#..#........................#....................##....................\n" +
                "........#...........#....#.......#..........##............................................#.......#.........#...#...............#.\n" +
                "#.#.....#.#..............................................#...#...............#..........#................##.........#..........#.#\n" +
                "#........................#...#.........#........#..............................................................#..................\n" +
                "..................................................................................................................................\n" +
                "...........................................#..#..........................................#...................#....................\n" +
                "...................#.............#.....#..................................................#...................................#...\n" +
                "................#...........................................................................#.#...#...............................\n" +
                "........#.......#......#...........................................#....................................#......#............#.....\n" +
                "...............#.......#....................#.....................................................................#...............\n" +
                "..............##....#.............................#......................#.....#......#........................................#..\n" +
                "............................#.........#.....................#.....................................................................\n" +
                "#....................#...................##........#...#........#......#....#..........................................#.#.......#\n" +
                "..#............#...#...............................#.#....................#....................................#..............#...\n" +
                "..................#..#.......#......#.....#.......#.................#.....#...................................#.............#.....\n" +
                ".......................#..............#.........#............#.......#.................................................#.....#....\n" +
                "................#.....................................................#.#.............................#.........#...........#.....\n" +
                "......................#.................................##..................................#.................................#...\n" +
                ".......................................#........................................................................#.................\n" +
                ".........#...........#..............#......................#................................#..#.......................#..........\n" +
                "...................#..................#...#....#......................................................#...........................\n" +
                "..............................#.........#................................#............................#...........................\n" +
                "........#....#...................................................................##........#......................................\n" +
                "..................................#...................#...................#.#.......#.............#..............................#\n" +
                ".....................................#...##...............................................................................#.......\n" +
                "......................#.......#.............#.......................#..#.....#......................#.................#...........\n" +
                ".....##...........#.......#................#.................................#...##......#......#...............#.......#.#.......\n" +
                ".....#...#...............#......................#........#..........#..##...#...#........#..........#.............................\n" +
                "#...........#.............#...............................#..............................#...#.#........#.........................\n";


        int[][] mat = new int[130][130];
        int x = 0, y = 0;

        String[] ss = s.split("\n");
        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[i].length(); j++) {
                if (ss[i].charAt(j) == '.') {
                    mat[i][j] = 0;
                }
                if (ss[i].charAt(j) == '#') {
                    mat[i][j] = 1;
                }
                if (ss[i].charAt(j) == '^') {
                    mat[i][j] = 2;
                    x = i;
                    y = j;
                }

            }
        }
        int result = 0;
        int[][] mat2 = new int[130][130];
        for (int i = 0; i < 130; i++) {
            for (int j = 0; j < 130; j++) {
                for (int k = 0; k < 130; k++) {
                    System.arraycopy(mat[k], 0, mat2[k], 0, mat[0].length);
                }
                if (mat[i][j] == 0) {
                    mat2[i][j] = 1;
                    int count = getCount(x, y, mat2);
                    if (count > 20000) {
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }

    private static int getCount(int x, int y, int[][] mat) {
        int dir = 'U';
        int count = 0;
        while (true) {
            count++;
            if (count > 20000) {
                return count;
            }

            if (x == 0 || y == 0 || x == 129 || y == 129) {
                break;
            }
            if (dir == 'U' && mat[x - 1][y] != 1) {
                x--;
                mat[x][y] = 2;
                continue;
            }
            if (dir == 'L' && mat[x][y - 1] != 1) {
                y--;
                mat[x][y] = 2;
                continue;
            }
            if (dir == 'D' && mat[x + 1][y] != 1) {
                x++;
                mat[x][y] = 2;
                continue;
            }
            if (dir == 'R' && mat[x][y + 1] != 1) {
                y++;
                mat[x][y] = 2;
                continue;
            }

            if (dir == 'U' && mat[x - 1][y] == 1) {
                dir = 'R';
                continue;
            }
            if (dir == 'L' && mat[x][y - 1] == 1) {
                dir = 'U';
                continue;
            }
            if (dir == 'D' && mat[x + 1][y] == 1) {
                dir = 'L';
                continue;
            }
            if (dir == 'R' && mat[x][y + 1] == 1) {
                dir = 'D';
            }
        }
        return count;
    }
}
