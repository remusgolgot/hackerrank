package adventofcode.aoc2024.day8;

import java.util.ArrayList;
import java.util.List;

/**
 * https://adventofcode.com/2024/day/8
 */
public class Main2 {

    public static void main(String[] args) {

        String uv =
                "............\n" +
                "........0...\n" +
                ".....0......\n" +
                ".......0....\n" +
                "....0.......\n" +
                "......A.....\n" +
                "............\n" +
                "............\n" +
                "........A...\n" +
                ".........A..\n" +
                "............\n" +
                "............\n";

        String s =
                "...........V..................b.g.................\n" +
                        "..................................g...............\n" +
                        ".............................c....................\n" +
                        "............T........Z.......P....................\n" +
                        ".x........................VP......................\n" +
                        "..........................PH......................\n" +
                        ".................H.....Z.......g.R................\n" +
                        "......f............T.V....b......A................\n" +
                        "......................P...........................\n" +
                        ".......f..................A.............R.........\n" +
                        "........x..............T.......l..H.....A.c.......\n" +
                        "..k..x..............Z.............................\n" +
                        "........5....S...............0.A..................\n" +
                        ".............N....L...............................\n" +
                        ".f............................T........s.....N....\n" +
                        "..................l..........bH.......tc.R..N.....\n" +
                        "......Z...6......n......l...k.N...0...............\n" +
                        "...........g....S......l.r.................t..s...\n" +
                        "..L................b.......K..t...................\n" +
                        "................5....n........0.............c.....\n" +
                        ".....L......n............................E........\n" +
                        ".k.......L................m.....................Es\n" +
                        "..............St.....5....Rm......................\n" +
                        "............6..5...................3...0..........\n" +
                        "...........k.................W........3...........\n" +
                        "................n......K...E....2S..........3.....\n" +
                        "....................................E....Q........\n" +
                        "..........M.....x...............K.................\n" +
                        "..h.............................1.................\n" +
                        ".6............z..............4...e.........WY....y\n" +
                        "........f............a.......Y..y...s.............\n" +
                        "...h............r.............v....m..............\n" +
                        ".....h.................v....m.....Y.Q.....W3......\n" +
                        ".........................Yq....Q.................7\n" +
                        ".........6..............7.................9.......\n" +
                        "...................X..........y..q.....2..........\n" +
                        "............r..............q.....y...........7.8..\n" +
                        "..B..............M....4............9..............\n" +
                        "...1.......M...X.......CGzp...4..B...2..K.........\n" +
                        ".....................z...v....Q.....8...........9.\n" +
                        "B.......X.F....rM...v...............2...8..D......\n" +
                        "h1..............................7..D.....8....d...\n" +
                        "...............F.....................9D....4....d.\n" +
                        "..........a......p............F.........W.D......d\n" +
                        ".........................G..C...........q.........\n" +
                        "...B..................................C...........\n" +
                        ".........w..........z....p.....................e..\n" +
                        ".a............G....w........p........F........e...\n" +
                        "........a...w.....................................\n" +
                        "........w...............XC.......G................\n";


        String[] ss = s.split("\n");

        char[][] mat1 = new char[ss.length][ss.length];
        char[][] mat2 = new char[ss.length][ss.length];

        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[i].length(); j++) {
                mat1[i][j] = ss[i].charAt(j);
                mat2[i][j] = '.';
            }
        }

        List<Node> nodes = new ArrayList<>();

        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss.length; j++) {
                if (mat1[i][j] != '.') {
                    nodes.add(new Node(mat1[i][j], i, j));
                    mat2[i][j] = '#';
                }
            }
        }

        for (int i = 0; i < nodes.size() - 1; i++) {
            for (int j = i + 1; j < nodes.size(); j++) {
                if (nodes.get(i).c == nodes.get(j).c) {
                    int z = 0;
                    int x1 = nodes.get(i).x;
                    int x2 = nodes.get(j).x;

                    int y1 = nodes.get(i).y;
                    int y2 = nodes.get(j).y;

                    int i1 = x2 + (x2 - x1);
                    int j1 = y2 + (y2 - y1);
                    while (i1 >= 0 && i1 < ss.length && j1 >= 0 && j1 < ss.length) {
                        mat2[i1][j1] = '#';
                        System.out.println("added1 " + i1 + "  " + j1);
                        z++;
                        i1 = i1 + (x2 - x1);
                        if (y2 < y1) {
                            j1 = j1 - (y1 - y2);
                        } else {
                            j1 = j1 + (y2 - y1);
                        }
                    }

                    int i2 = x1 - (x2 - x1);
                    int j2 = y1 - (y2 - y1);

                    while (i2 >= 0 && i2 < ss.length && j2 >= 0 && j2 < ss.length) {
                        mat2[i2][j2] = '#';
                        System.out.println("added2 " + i2 + "  " + j2);

                        z++;
                        i2 = i2 - (x2 - x1);
//                        if (y2 < y1) {
                            j2 = j2 - (y2 - y1);
//                        } else {
//                            j2 = j2 + (y2 - y1);
//                        }
                    }

                    System.out.println("nodes added " + z + " antinodes");
                }
            }
        }
        int count = 0;
        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss.length; j++) {
                if (mat2[i][j] == '#') {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

    static class Node {
        char c;
        int x;
        int y;

        public Node(char c, int x, int y) {
            this.c = c;
            this.x = x;
            this.y = y;
        }

        public char getC() {
            return c;
        }

        public void setC(char c) {
            this.c = c;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
