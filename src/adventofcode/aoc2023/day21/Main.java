package adventofcode.aoc2023.day21;

import java.util.*;

public class Main {

    static String s = "...........\n" +
            ".....###.#.\n" +
            ".###.##..#.\n" +
            "..#.#...#..\n" +
            "....#.#....\n" +
            ".##..S####.\n" +
            ".##..#...#.\n" +
            ".......##..\n" +
            ".##.#.####.\n" +
            ".##..##.##.\n" +
            "...........";

    static String sq = "...................................................................................................................................\n" +
            "..#.......#.#.##...........#...#..................#......................#.......#.......#............#...............#.....#...#..\n" +
            "................#....#.#.....#.#..#.#..#.........#.....................#......................#......#....#..........#.............\n" +
            "..#.##.....................#......##..#...##.#............................#.....#..............#..................#..#......#......\n" +
            ".....#.#.....#...#........#............#.#.#..#.#...#.........................................##......#..........#.#..##...........\n" +
            ".....#....##.........#.......##............##....#.............................#.........#.....#....#.#....#...........#.##........\n" +
            "...........#..#...#...........#.....##................#.........#..#...................#.#..#.....#................................\n" +
            "..#.....#....#....#....#......#.#.............................................###.#.......#....#..........#.#....#.....#...........\n" +
            "....#........................#............#.......#...............#..#.......#..........#.........#....#......#..##.........#......\n" +
            "..........#...#..........#..#............##.........#...........#...............................#.........#........#........#......\n" +
            "....#............#.#...........#.............#..#..............................##.#....#...#.#.#.#.#........#......#..#............\n" +
            "....#..#...#.#....#.#.##..#...................##..#........#.##....................#............#......#........#...#..............\n" +
            "......#.....#...##...#...#......##.....#.....#.#...............#....................#.#......#.............#..........#.........#..\n" +
            "......#....#..#...........##...#.#.#.#.#......##...........#.......#.....##.............#.#..##...##....................#.......#..\n" +
            "......................................#.#......#.......#....#...#.#..#...#............#..#........####......#....##................\n" +
            "..#........#........#.............#....................#.......#....#.....#................#...................#..........#........\n" +
            "..................#.....#.#.#....#......#.....................#............#...............#..#......#...#..##......#............#.\n" +
            "...#........#....#......#............................#.......#....#........#.#............................#..#....#......##........\n" +
            "..#..........#...#..................#......................#......#........#.............#....#..##.#......##......##.#............\n" +
            "...........#..........#......#..#...#.#...........#.......#.....#.....#..#...............#..............#...#.....#.##.......#.....\n" +
            ".#......#..#....#..................................................#..#......#.........................#.......#.....#.....#.....#.\n" +
            ".....##..................#............................#...#........#..#....#.#..............#.....................##.......#..##...\n" +
            ".........#...#......#.....###..........#...............#.......#..................................#.........##....#.......#........\n" +
            "....#........#.................#..............#.#......#...##...#....#...#.....#...................#....#...#.....#....#.#.........\n" +
            ".....#....##....#.............#...#..........................#..................#.................#..........#..............##...#.\n" +
            "....#.#..#....#.................#............................#......#.#................................#..##......##.....#.........\n" +
            "......#.................#........#.........#......##....#...#.#........#...#.....#.....................##........#..#..#...........\n" +
            "..........#.#.......#......#.....#..................##.......#........#.....##....#.............#.................#.#..#...........\n" +
            ".#.#....##.#.#.......#...................##....#...#..........#.........#.#..##.#.......#........#....#....#.#..........##....#....\n" +
            "...............#......#...#..............###......#.............#....#...##........#.................#....#.................##.#...\n" +
            ".......#....#.......#.....##.#................#...........#....................#.....##...##.........#....................##....#..\n" +
            ".................#.....#........................#........#.....#........#...#......#................#............................#.\n" +
            "..........#.................#........#..#.....................#...........##.#..............#..................#.................#.\n" +
            ".#.#.#................................#...#.#...#.........#...#.....#...........#..........#.#........#.#.#..........#.....#.......\n" +
            ".#..#...#..#...............#.................#...##...#........#........#....####......#....#.............#..#...#.............#.#.\n" +
            "............##........#...............#.#......................#...#..#...##..##..........#...#.........#..........##.......#......\n" +
            ".........#.#.#...#......#.....................##...............#..#.###........#............#..#......................#......##....\n" +
            ".#........##.......#.............#.#..........#..#........#..#.#.................................#..................#......#.#.....\n" +
            "..##...#....#..........................#...#.#.#.........#..#............#.......#....#..............................#....#........\n" +
            "......#.....##....#...................#...................#........#...#....#...........#..#.....#.................#.#..#.......##.\n" +
            "....##...#......................#.##..#....#...#.....#..................#..#...........#.....#................#...##...........##..\n" +
            "...............##...............#.................#.......##..........................#...#.#.........#........#........#......#...\n" +
            ".##....#....#...#...........#.....##....#..............#...#.........#...#.....##.....#........##.#.#...................#.......#..\n" +
            ".#............................#.....#...#....#.#.....#.....#.###.............#...............................................#..#..\n" +
            "..........#..................#...#......#...............#.#.......#............#..........#....#.................#....#.......#....\n" +
            ".#..#....#...#....................#......#........#.......#...#.#........#.#..........#.............#..##...........#..#...........\n" +
            "....#......#..................#.......#.......###..#.#.#...........#.#............#................#.....#...........##..#.##..#...\n" +
            ".......#.#.#...................#.##...........#.........#...#............#.....##....#..........#.....#.#.............#.#...#......\n" +
            "............#........##....#...........#.............................#.#.#....#..#......#.................#..........#......#.#....\n" +
            ".....##.#.........................#.#...##.#..#....#..........#..........#............#.......#..##.....##.##..............#.......\n" +
            "..#..#......................................#.......#.#..#.#.........#.....#...............#.....................................#.\n" +
            "......#........................#.......#.#............................#..#..#.......#......#.....#............#.#................#.\n" +
            "...###.#.........#..##......#............#.............###......#....#....##...................##...#..#.#....#.............#.#.#..\n" +
            "..##....#...........#.............#..#..#.#..........#..............#...#........#..##..#.........................#.......#........\n" +
            ".#.....#.............##.....#.....###.#.#..#.......#......#..#........#..............#.#....#.....................#...........#....\n" +
            "....#.........................#....##......#..#......#.#.....#.#.....#.................#.................#.........#...............\n" +
            ".#............#.........#........#.#.#.....#.....#...#.....#......#......#...............#.#.........#.............................\n" +
            "................##...#...#......#....#....#.........##.............#.......#.....#.......................#..###..#...##............\n" +
            "...........#.#..............#..#.......#....#.#.....#..............................#..##....................#.#......#.............\n" +
            "..................#....................#............................##.#..#.#..........#..................#............#...........\n" +
            ".............#.....#.......##...#..#........#.................##......#......#.#..............#..........#........#.#.#............\n" +
            "...........................#....##...#.###...........#.#..........#.............#.....#.#....#.....#....#..........#...............\n" +
            ".............#........##........#.#.#..##....#......#.............#.#....#.#.#...#...#....#.#..#.......#...........##..#...........\n" +
            "......#..#.....#........##.....#......#......#.#....#.#..#...#.........#.........#..............#..........###.....................\n" +
            ".............#..........#..#...####..........#......#..#....#.........#..##............##.....#..#.....##.#......#.#....#..#.#.....\n" +
            ".................................................................S.................................................................\n" +
            ".....................#.....#.#........##......#......##..#..#.......#.##..#...........................#..#.........................\n" +
            "......................#.#..........##....................#.................#......#..#.....................##.....#.......#........\n" +
            "................#..........#...#.....................#....#..........#.##.....##........#......#........##....#..........##........\n" +
            ".........##...#.#..#.....#.#...#.#................#.........#.......#..##..#.....#...#...##....#...#............#....##............\n" +
            "...........................#..#..#...#..#...##..................................................##.........##.#...#................\n" +
            "............#..#.........#........#.......#......#...#......##.##.................#.#........##.#....#....#.#...#....#.............\n" +
            "...........#..#.....#..#..#......#.#..#............#............#.........#..#.....#..#........#..............##.......#.......##..\n" +
            "...................#....##...........#.#......#.......##..#..#.#.....#...#...#.##..............#.##....#....#.#.....#.........#....\n" +
            "..................#..#....#......#.#...........#...#.......#........#...#......#...........#.....................#.#.............#.\n" +
            "................#...........#.............#.#.....#.........................##.#....#..#..........#.#...#....#................##.#.\n" +
            "......##........#.#......#..........#..........#..........................#...#..........###.#..............................##.....\n" +
            ".....#..............#........#.....#.#..#....#........##........#..#......#......#......#..#......#......##...................#....\n" +
            ".#................#.....#...........#.#.........#.#.....#.##.............#...........#.#.#....##.#..........#...............#.#..#.\n" +
            "..#..#.............#...............#....#..........#..#.....#...#...............##.....#...#............#.#...................#....\n" +
            "......#............#.....#.................#..............##.#......##............#....#..#.#..#.#.#.............................#.\n" +
            "...#..................##..........#..........#...#.................#.......#.....#...#...................#..................#.#....\n" +
            ".#....##....................#...#...#.........#.#....#...#.#.......#..##..#.#....#........##.#....##......#..........#...#....#..#.\n" +
            "....#.........#............#..#.....#.#.....#.#..#.....#................#..........#.....##...........................##...........\n" +
            ".#............................#...............#...#.#.........#.....#...#..........#...#.......##..#..................##.##....#...\n" +
            ".......#..................#.#.............#.......#....#............................#...................#.#........................\n" +
            ".........#........................####......#......##...##............#.....#...#...##.......#.....#.............#.##.#............\n" +
            "..#..#.##......#..........#..............#............#...................##...................#..#.....#.......#.....#...#...##...\n" +
            "....#..#...........................#.........#...#.........#.#.....#.............#.......#............#.................###.#....#.\n" +
            "...#.......#.#.......................##....#.......................#............#......#.....#..#....#..........#.......#..........\n" +
            ".......#.........##.#................#.........#.#..#.........#.....#.#...............#.#....#....#............#.....#.............\n" +
            "..................#.#.......................#................##......#...............#......................#..#.#.#..........##...\n" +
            "......##.......#.......#............#.....#........#.....##....#.....#.............#.#....#.....#.............#......#.............\n" +
            "...#.........#.....#...............#.........#.....#..........#...#.........#....#.#.......###..#.#..............#.................\n" +
            ".........#....##.#...#............#.....................#...........##......#..#..##......#.................#..#.##................\n" +
            ".........#.........#...##..............#.#...#..###........#.#......#...#..#............#.......#.............#.....#.......#....#.\n" +
            ".....................#...#..........#.#............#...#.#.##..##..........#..#........#.......#........#.......#..#.....#.#.....#.\n" +
            "....#..........#....................#...............................#.##.##.......###.........#........#....#.................####.\n" +
            "..........#...#.............##..................#..#....#............#...................#..#.............#.......#...#.......#....\n" +
            ".#....#..##......#.#.##.....#.............................##.#............#.#..............#.........#.................#......#....\n" +
            "..#.........#.....#........#................#...#...................#..............#..#............#...#...#...................#...\n" +
            "....#..#..#..#...........#................#......#...#......#.....#........#...#...##.#..............#........#.#......#..#..#.#...\n" +
            "......##..#..#..............##...........#.#...#............#...#.#.....#.#.....#.......##...............#.#.......................\n" +
            ".......#.........#.........#..............#...#......................#....#....#........#.......#.........#......#.................\n" +
            "...#..#.........#...#...#........#...............#............#....###.#.#.........#...............#................#.......#....#.\n" +
            ".......#.....#........#..........#...............................................#..#.#...................#.........#..#...........\n" +
            "................#..#....#..#......................##...............##...#.##...#..................#.....#.......#..................\n" +
            ".#......#...#...............#.........................#...#.............#.....#............................#.................#..#..\n" +
            ".................##....##........................#.......#.#...........#......................##.......#.............#...#..#......\n" +
            ".#..........#....#................##....#.............#.......#...#...#......#...#.................#....#....................#...#.\n" +
            "..................##..#.#.##..#.#...........................#.................##..........#.....................#..........#....#..\n" +
            "....................#...#............#..#................#...#.#...........#..#............#......##....#.....##..............#....\n" +
            ".#..#......#........#.........#......#..#................#.#...#..#.#......#.............#.#.....#....###...#.#....##..............\n" +
            "....#......#.#..#................#.#...#................#...#.......#.#.#..............#......................#..#.....#........#..\n" +
            "........#.............#...##.#.#...#......#................#........#...#...............#.#.......#........##.#...#.......#......#.\n" +
            ".........................##..#......#.#.....#.........##....#............#..........#.............#......#....#............#...#...\n" +
            "...#.....#..#.....#.........#..#..#.##.................................#.............#......##............#....#..#......#.......#.\n" +
            "..#...#....#.#.#...#...#..#...#............##.............................#..................##..............#...................#.\n" +
            "..#..#.....##.............#...........#...#...#.#..........#.......#....#...........#........#........##.......#.......#...........\n" +
            "........#.#...#...........#..###...........#.....#................#.................##.........#.....#....#....#.....#.#.......#.#.\n" +
            "...#......#..............#....#...##...#..###.....#.........#.......#....................#...#.........##..........#..#..........#.\n" +
            ".....#.#....................#........#....###.#..............####....................................#.#...#..#...........#....#...\n" +
            "...#.#...##...#.........#...#............#.....#...#............#...#.........#..#...........................#..#............#.....\n" +
            ".#...#.#..###..................#...#..........#......#........#.#................#.......................##.###.....#.#............\n" +
            ".....................#.#..#.....#.#..#............................................#..#.......#...#.#.........##.....#..............\n" +
            "...#............##.......#...#.##..#........##...#....#....................#.#......#.#....................##.#...#..#....#..#.....\n" +
            "........#....#..........................#...#...........................................#...#..............#..........##.......#...\n" +
            "..............#..#............##......#..#.#......#....#.........................#.....#..#..#...#..........##.....#..........#....\n" +
            "..........#....##........#....#..#....#.................#.................#.#...............#.......#....#...#...............#..#..\n" +
            "...............#..#......#..........#...#......#......##.#..............#.#..........#...#......#..#....#................#..#...#..\n" +
            "...................................................................................................................................\n";

    public static void main(String[] args) {

        String[] ss = sq.split("\n");
        int[][] mat = new int[ss.length][ss[0].length()];
        for (int i = 0; i < ss.length; i++) {
            char[] ca = ss[i].toCharArray();
            for (int j = 0; j < ca.length; j++) {
                if (ca[j] == '#') {
                    mat[i][j] = 1;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        int steps = 64;
        Queue<String> queue = new ArrayDeque<>();
        queue.add("65,65");

        for (int i = 0; i < steps; i++) {
            Set<String> nextVisits = new HashSet<>();
            while (!queue.isEmpty()) {
                String p = queue.remove();
                int x = Integer.parseInt(p.split(",")[0]);
                int y = Integer.parseInt(p.split(",")[1]);
                if (x > 0 && mat[x - 1][y] == 0) {
                    nextVisits.add("" + (x-1) + "," + y);
                }
                if (x < ss.length - 1 && mat[x + 1][y] == 0) {
                    nextVisits.add("" + (x+1) + "," + y);
                }
                if (y > 0 && mat[x][y - 1] == 0) {
                    nextVisits.add("" + x + "," + (y-1));
                }
                if (y < ss[0].length() - 1 && mat[x][y + 1] == 0) {
                    nextVisits.add("" + x + "," + (y+1));
                }
            }
            queue.addAll(nextVisits);
        }
        System.out.println(queue.size());
    }

}
