package adventofcode.aoc2024.day6;

/**
 * https://adventofcode.com/2024/day/6
 */
public class Main {

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

        int dir = 'U';
        while (true) {
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

        int count = 0;
        for (int i = 0; i < 130; i++) {
            for (int j = 0; j < 130; j++) {
                if (mat[i][j] == 2) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }


}
