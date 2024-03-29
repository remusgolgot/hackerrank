package adventofcode.aoc2021.day2;


/**
 * https://adventofcode.com/2021/day/2
 */
public class Main {

    public static void main(String[] args) {

        String s =
                "forward 2\n" +
                        "down 4\n" +
                        "down 3\n" +
                        "up 4\n" +
                        "down 1\n" +
                        "down 8\n" +
                        "up 9\n" +
                        "forward 1\n" +
                        "down 9\n" +
                        "forward 6\n" +
                        "down 7\n" +
                        "forward 1\n" +
                        "down 1\n" +
                        "up 2\n" +
                        "forward 8\n" +
                        "down 3\n" +
                        "down 9\n" +
                        "down 3\n" +
                        "down 8\n" +
                        "forward 3\n" +
                        "forward 5\n" +
                        "up 8\n" +
                        "forward 6\n" +
                        "forward 5\n" +
                        "forward 6\n" +
                        "forward 4\n" +
                        "up 3\n" +
                        "forward 1\n" +
                        "up 4\n" +
                        "forward 2\n" +
                        "up 2\n" +
                        "up 2\n" +
                        "down 6\n" +
                        "forward 3\n" +
                        "forward 4\n" +
                        "forward 5\n" +
                        "forward 1\n" +
                        "down 1\n" +
                        "down 1\n" +
                        "forward 3\n" +
                        "forward 2\n" +
                        "up 7\n" +
                        "forward 6\n" +
                        "down 5\n" +
                        "forward 9\n" +
                        "up 4\n" +
                        "down 6\n" +
                        "up 8\n" +
                        "forward 7\n" +
                        "forward 5\n" +
                        "forward 8\n" +
                        "down 5\n" +
                        "down 9\n" +
                        "forward 3\n" +
                        "forward 2\n" +
                        "forward 9\n" +
                        "forward 1\n" +
                        "down 3\n" +
                        "forward 1\n" +
                        "down 9\n" +
                        "forward 4\n" +
                        "forward 3\n" +
                        "forward 7\n" +
                        "forward 6\n" +
                        "forward 6\n" +
                        "forward 6\n" +
                        "forward 8\n" +
                        "forward 5\n" +
                        "forward 4\n" +
                        "up 1\n" +
                        "forward 8\n" +
                        "forward 1\n" +
                        "down 7\n" +
                        "forward 2\n" +
                        "up 9\n" +
                        "forward 4\n" +
                        "up 7\n" +
                        "down 4\n" +
                        "down 3\n" +
                        "down 9\n" +
                        "down 7\n" +
                        "down 1\n" +
                        "forward 2\n" +
                        "up 6\n" +
                        "down 2\n" +
                        "down 3\n" +
                        "down 5\n" +
                        "forward 6\n" +
                        "forward 5\n" +
                        "forward 6\n" +
                        "forward 2\n" +
                        "forward 1\n" +
                        "forward 5\n" +
                        "forward 5\n" +
                        "down 9\n" +
                        "forward 8\n" +
                        "forward 3\n" +
                        "down 8\n" +
                        "up 2\n" +
                        "forward 5\n" +
                        "forward 6\n" +
                        "down 1\n" +
                        "down 7\n" +
                        "down 5\n" +
                        "forward 3\n" +
                        "down 9\n" +
                        "down 2\n" +
                        "forward 6\n" +
                        "forward 6\n" +
                        "forward 4\n" +
                        "up 5\n" +
                        "up 2\n" +
                        "up 2\n" +
                        "up 2\n" +
                        "forward 2\n" +
                        "up 3\n" +
                        "down 4\n" +
                        "forward 2\n" +
                        "down 6\n" +
                        "forward 1\n" +
                        "down 8\n" +
                        "up 6\n" +
                        "up 9\n" +
                        "forward 7\n" +
                        "forward 5\n" +
                        "forward 9\n" +
                        "forward 5\n" +
                        "up 3\n" +
                        "up 6\n" +
                        "up 3\n" +
                        "forward 9\n" +
                        "forward 7\n" +
                        "up 7\n" +
                        "forward 3\n" +
                        "forward 3\n" +
                        "down 5\n" +
                        "down 2\n" +
                        "down 1\n" +
                        "down 8\n" +
                        "up 7\n" +
                        "down 2\n" +
                        "up 4\n" +
                        "forward 5\n" +
                        "down 5\n" +
                        "down 8\n" +
                        "down 4\n" +
                        "down 8\n" +
                        "down 4\n" +
                        "down 8\n" +
                        "down 2\n" +
                        "forward 5\n" +
                        "down 9\n" +
                        "forward 6\n" +
                        "forward 5\n" +
                        "up 4\n" +
                        "up 2\n" +
                        "down 7\n" +
                        "down 9\n" +
                        "forward 6\n" +
                        "forward 6\n" +
                        "down 3\n" +
                        "up 9\n" +
                        "up 8\n" +
                        "down 4\n" +
                        "forward 9\n" +
                        "down 7\n" +
                        "down 4\n" +
                        "down 6\n" +
                        "down 4\n" +
                        "down 7\n" +
                        "down 2\n" +
                        "up 9\n" +
                        "forward 9\n" +
                        "forward 6\n" +
                        "down 6\n" +
                        "up 6\n" +
                        "down 7\n" +
                        "down 5\n" +
                        "forward 9\n" +
                        "down 9\n" +
                        "down 8\n" +
                        "down 6\n" +
                        "down 3\n" +
                        "forward 5\n" +
                        "down 5\n" +
                        "forward 2\n" +
                        "up 4\n" +
                        "down 5\n" +
                        "forward 6\n" +
                        "forward 6\n" +
                        "forward 6\n" +
                        "down 4\n" +
                        "down 8\n" +
                        "down 3\n" +
                        "down 5\n" +
                        "forward 6\n" +
                        "forward 2\n" +
                        "forward 4\n" +
                        "forward 2\n" +
                        "forward 3\n" +
                        "up 9\n" +
                        "forward 8\n" +
                        "down 5\n" +
                        "down 9\n" +
                        "forward 5\n" +
                        "forward 7\n" +
                        "down 5\n" +
                        "down 2\n" +
                        "up 3\n" +
                        "forward 4\n" +
                        "forward 4\n" +
                        "up 4\n" +
                        "forward 5\n" +
                        "forward 8\n" +
                        "up 4\n" +
                        "forward 3\n" +
                        "down 8\n" +
                        "up 8\n" +
                        "forward 9\n" +
                        "up 9\n" +
                        "forward 5\n" +
                        "forward 8\n" +
                        "down 8\n" +
                        "up 9\n" +
                        "up 2\n" +
                        "forward 3\n" +
                        "forward 7\n" +
                        "down 9\n" +
                        "down 6\n" +
                        "forward 5\n" +
                        "down 1\n" +
                        "forward 6\n" +
                        "forward 8\n" +
                        "up 2\n" +
                        "down 8\n" +
                        "forward 2\n" +
                        "forward 7\n" +
                        "down 7\n" +
                        "down 7\n" +
                        "down 7\n" +
                        "down 3\n" +
                        "up 6\n" +
                        "down 5\n" +
                        "down 4\n" +
                        "forward 1\n" +
                        "forward 3\n" +
                        "down 3\n" +
                        "down 1\n" +
                        "forward 7\n" +
                        "forward 8\n" +
                        "up 8\n" +
                        "forward 3\n" +
                        "forward 8\n" +
                        "up 9\n" +
                        "down 5\n" +
                        "down 9\n" +
                        "forward 4\n" +
                        "down 9\n" +
                        "up 8\n" +
                        "up 1\n" +
                        "forward 6\n" +
                        "down 2\n" +
                        "up 2\n" +
                        "down 3\n" +
                        "up 1\n" +
                        "down 7\n" +
                        "down 8\n" +
                        "forward 6\n" +
                        "forward 8\n" +
                        "up 5\n" +
                        "up 2\n" +
                        "down 1\n" +
                        "forward 6\n" +
                        "down 1\n" +
                        "up 6\n" +
                        "down 9\n" +
                        "down 8\n" +
                        "down 5\n" +
                        "down 7\n" +
                        "forward 8\n" +
                        "down 1\n" +
                        "up 5\n" +
                        "down 2\n" +
                        "down 5\n" +
                        "forward 9\n" +
                        "up 8\n" +
                        "down 6\n" +
                        "forward 7\n" +
                        "forward 8\n" +
                        "down 5\n" +
                        "forward 3\n" +
                        "forward 4\n" +
                        "up 1\n" +
                        "forward 2\n" +
                        "forward 9\n" +
                        "up 7\n" +
                        "down 9\n" +
                        "forward 2\n" +
                        "down 3\n" +
                        "down 6\n" +
                        "down 9\n" +
                        "forward 4\n" +
                        "up 3\n" +
                        "forward 3\n" +
                        "down 6\n" +
                        "forward 1\n" +
                        "down 3\n" +
                        "down 4\n" +
                        "down 8\n" +
                        "down 5\n" +
                        "forward 6\n" +
                        "down 7\n" +
                        "forward 6\n" +
                        "up 8\n" +
                        "forward 9\n" +
                        "down 3\n" +
                        "forward 8\n" +
                        "forward 9\n" +
                        "down 3\n" +
                        "forward 9\n" +
                        "forward 4\n" +
                        "forward 2\n" +
                        "down 4\n" +
                        "down 1\n" +
                        "forward 3\n" +
                        "forward 3\n" +
                        "forward 3\n" +
                        "down 1\n" +
                        "down 6\n" +
                        "up 1\n" +
                        "down 6\n" +
                        "forward 2\n" +
                        "down 6\n" +
                        "down 4\n" +
                        "down 4\n" +
                        "forward 5\n" +
                        "down 4\n" +
                        "up 4\n" +
                        "up 7\n" +
                        "down 4\n" +
                        "forward 4\n" +
                        "down 8\n" +
                        "down 5\n" +
                        "down 2\n" +
                        "down 3\n" +
                        "forward 3\n" +
                        "down 4\n" +
                        "forward 8\n" +
                        "down 4\n" +
                        "down 2\n" +
                        "up 2\n" +
                        "down 8\n" +
                        "forward 9\n" +
                        "down 1\n" +
                        "up 1\n" +
                        "down 8\n" +
                        "down 8\n" +
                        "up 2\n" +
                        "down 8\n" +
                        "up 2\n" +
                        "forward 4\n" +
                        "down 2\n" +
                        "forward 8\n" +
                        "down 1\n" +
                        "down 9\n" +
                        "forward 3\n" +
                        "up 5\n" +
                        "down 8\n" +
                        "down 2\n" +
                        "forward 5\n" +
                        "forward 1\n" +
                        "forward 6\n" +
                        "forward 1\n" +
                        "down 8\n" +
                        "forward 3\n" +
                        "down 5\n" +
                        "up 7\n" +
                        "down 8\n" +
                        "forward 5\n" +
                        "down 8\n" +
                        "forward 2\n" +
                        "down 6\n" +
                        "down 9\n" +
                        "forward 9\n" +
                        "down 8\n" +
                        "forward 7\n" +
                        "forward 1\n" +
                        "forward 9\n" +
                        "forward 8\n" +
                        "forward 2\n" +
                        "down 4\n" +
                        "forward 8\n" +
                        "up 7\n" +
                        "down 2\n" +
                        "down 6\n" +
                        "forward 5\n" +
                        "forward 4\n" +
                        "down 5\n" +
                        "down 2\n" +
                        "forward 2\n" +
                        "up 8\n" +
                        "up 4\n" +
                        "down 8\n" +
                        "forward 2\n" +
                        "up 3\n" +
                        "forward 3\n" +
                        "down 4\n" +
                        "forward 8\n" +
                        "forward 7\n" +
                        "forward 4\n" +
                        "up 1\n" +
                        "down 6\n" +
                        "forward 1\n" +
                        "down 3\n" +
                        "forward 6\n" +
                        "up 3\n" +
                        "forward 7\n" +
                        "down 6\n" +
                        "forward 7\n" +
                        "forward 5\n" +
                        "forward 8\n" +
                        "down 9\n" +
                        "up 7\n" +
                        "down 1\n" +
                        "down 5\n" +
                        "forward 1\n" +
                        "down 8\n" +
                        "down 1\n" +
                        "forward 4\n" +
                        "forward 5\n" +
                        "forward 5\n" +
                        "down 9\n" +
                        "forward 9\n" +
                        "down 4\n" +
                        "forward 1\n" +
                        "up 8\n" +
                        "down 5\n" +
                        "down 9\n" +
                        "down 3\n" +
                        "down 2\n" +
                        "down 5\n" +
                        "down 3\n" +
                        "forward 7\n" +
                        "up 3\n" +
                        "forward 3\n" +
                        "down 4\n" +
                        "up 5\n" +
                        "forward 4\n" +
                        "up 6\n" +
                        "down 4\n" +
                        "forward 2\n" +
                        "up 3\n" +
                        "down 2\n" +
                        "up 1\n" +
                        "up 7\n" +
                        "down 5\n" +
                        "up 3\n" +
                        "forward 5\n" +
                        "up 2\n" +
                        "down 9\n" +
                        "down 6\n" +
                        "forward 5\n" +
                        "up 3\n" +
                        "down 7\n" +
                        "up 1\n" +
                        "forward 1\n" +
                        "forward 3\n" +
                        "down 9\n" +
                        "down 1\n" +
                        "forward 6\n" +
                        "down 5\n" +
                        "forward 8\n" +
                        "down 1\n" +
                        "down 5\n" +
                        "up 6\n" +
                        "forward 8\n" +
                        "forward 8\n" +
                        "forward 9\n" +
                        "down 1\n" +
                        "down 6\n" +
                        "down 8\n" +
                        "up 1\n" +
                        "down 7\n" +
                        "forward 3\n" +
                        "forward 5\n" +
                        "forward 2\n" +
                        "down 4\n" +
                        "forward 4\n" +
                        "forward 2\n" +
                        "down 8\n" +
                        "up 2\n" +
                        "down 1\n" +
                        "up 9\n" +
                        "down 4\n" +
                        "up 9\n" +
                        "down 2\n" +
                        "forward 5\n" +
                        "forward 4\n" +
                        "forward 7\n" +
                        "down 8\n" +
                        "forward 4\n" +
                        "down 5\n" +
                        "forward 7\n" +
                        "forward 2\n" +
                        "down 6\n" +
                        "down 3\n" +
                        "forward 7\n" +
                        "forward 8\n" +
                        "forward 2\n" +
                        "down 3\n" +
                        "forward 4\n" +
                        "down 6\n" +
                        "forward 4\n" +
                        "forward 3\n" +
                        "down 3\n" +
                        "forward 3\n" +
                        "down 8\n" +
                        "down 2\n" +
                        "forward 6\n" +
                        "down 4\n" +
                        "down 9\n" +
                        "down 2\n" +
                        "down 7\n" +
                        "forward 4\n" +
                        "forward 1\n" +
                        "forward 7\n" +
                        "down 9\n" +
                        "down 5\n" +
                        "forward 5\n" +
                        "up 7\n" +
                        "forward 4\n" +
                        "down 1\n" +
                        "up 3\n" +
                        "down 5\n" +
                        "down 3\n" +
                        "down 7\n" +
                        "down 7\n" +
                        "down 7\n" +
                        "up 6\n" +
                        "forward 3\n" +
                        "down 6\n" +
                        "down 3\n" +
                        "up 2\n" +
                        "down 7\n" +
                        "forward 5\n" +
                        "forward 5\n" +
                        "down 6\n" +
                        "forward 9\n" +
                        "up 2\n" +
                        "forward 6\n" +
                        "forward 3\n" +
                        "forward 5\n" +
                        "forward 9\n" +
                        "forward 1\n" +
                        "up 4\n" +
                        "up 7\n" +
                        "down 8\n" +
                        "down 3\n" +
                        "forward 1\n" +
                        "down 6\n" +
                        "up 8\n" +
                        "down 7\n" +
                        "down 8\n" +
                        "down 9\n" +
                        "down 9\n" +
                        "forward 5\n" +
                        "down 6\n" +
                        "up 7\n" +
                        "down 3\n" +
                        "down 5\n" +
                        "down 5\n" +
                        "down 6\n" +
                        "up 3\n" +
                        "forward 8\n" +
                        "down 4\n" +
                        "up 8\n" +
                        "forward 4\n" +
                        "down 1\n" +
                        "up 8\n" +
                        "up 5\n" +
                        "down 4\n" +
                        "up 8\n" +
                        "forward 8\n" +
                        "forward 7\n" +
                        "up 3\n" +
                        "down 7\n" +
                        "forward 8\n" +
                        "down 1\n" +
                        "down 7\n" +
                        "down 5\n" +
                        "down 5\n" +
                        "down 2\n" +
                        "up 3\n" +
                        "forward 3\n" +
                        "forward 8\n" +
                        "down 4\n" +
                        "down 3\n" +
                        "up 7\n" +
                        "down 1\n" +
                        "down 9\n" +
                        "forward 9\n" +
                        "forward 1\n" +
                        "forward 1\n" +
                        "forward 2\n" +
                        "down 7\n" +
                        "down 9\n" +
                        "up 5\n" +
                        "down 1\n" +
                        "forward 4\n" +
                        "forward 9\n" +
                        "forward 3\n" +
                        "forward 3\n" +
                        "forward 4\n" +
                        "forward 1\n" +
                        "down 2\n" +
                        "down 2\n" +
                        "up 1\n" +
                        "forward 7\n" +
                        "forward 8\n" +
                        "forward 6\n" +
                        "up 6\n" +
                        "down 5\n" +
                        "forward 2\n" +
                        "down 4\n" +
                        "forward 5\n" +
                        "forward 2\n" +
                        "forward 7\n" +
                        "down 1\n" +
                        "down 9\n" +
                        "forward 2\n" +
                        "forward 2\n" +
                        "forward 3\n" +
                        "up 2\n" +
                        "up 2\n" +
                        "up 2\n" +
                        "down 5\n" +
                        "forward 5\n" +
                        "forward 9\n" +
                        "down 4\n" +
                        "down 2\n" +
                        "down 5\n" +
                        "down 9\n" +
                        "up 7\n" +
                        "forward 2\n" +
                        "forward 7\n" +
                        "forward 4\n" +
                        "forward 5\n" +
                        "down 5\n" +
                        "down 8\n" +
                        "down 9\n" +
                        "down 4\n" +
                        "up 8\n" +
                        "up 1\n" +
                        "forward 8\n" +
                        "up 2\n" +
                        "up 8\n" +
                        "up 4\n" +
                        "forward 1\n" +
                        "forward 4\n" +
                        "down 9\n" +
                        "up 1\n" +
                        "down 8\n" +
                        "down 4\n" +
                        "down 4\n" +
                        "down 2\n" +
                        "down 9\n" +
                        "forward 7\n" +
                        "up 1\n" +
                        "down 4\n" +
                        "forward 4\n" +
                        "down 8\n" +
                        "forward 1\n" +
                        "forward 8\n" +
                        "forward 1\n" +
                        "up 7\n" +
                        "forward 4\n" +
                        "forward 6\n" +
                        "forward 2\n" +
                        "forward 8\n" +
                        "up 4\n" +
                        "down 1\n" +
                        "up 7\n" +
                        "up 8\n" +
                        "down 9\n" +
                        "forward 3\n" +
                        "down 3\n" +
                        "forward 6\n" +
                        "forward 5\n" +
                        "up 1\n" +
                        "forward 9\n" +
                        "up 6\n" +
                        "up 1\n" +
                        "forward 1\n" +
                        "forward 2\n" +
                        "forward 7\n" +
                        "down 8\n" +
                        "up 4\n" +
                        "forward 4\n" +
                        "down 3\n" +
                        "down 3\n" +
                        "forward 2\n" +
                        "forward 6\n" +
                        "down 4\n" +
                        "forward 2\n" +
                        "forward 8\n" +
                        "up 5\n" +
                        "down 1\n" +
                        "forward 7\n" +
                        "up 6\n" +
                        "forward 2\n" +
                        "down 6\n" +
                        "forward 7\n" +
                        "down 2\n" +
                        "down 9\n" +
                        "down 1\n" +
                        "up 4\n" +
                        "up 8\n" +
                        "down 7\n" +
                        "up 6\n" +
                        "forward 3\n" +
                        "forward 4\n" +
                        "down 6\n" +
                        "forward 5\n" +
                        "down 3\n" +
                        "up 6\n" +
                        "down 3\n" +
                        "down 7\n" +
                        "forward 7\n" +
                        "up 3\n" +
                        "down 1\n" +
                        "forward 2\n" +
                        "up 2\n" +
                        "up 6\n" +
                        "up 1\n" +
                        "up 8\n" +
                        "up 3\n" +
                        "down 9\n" +
                        "down 8\n" +
                        "forward 6\n" +
                        "up 9\n" +
                        "down 1\n" +
                        "forward 5\n" +
                        "down 4\n" +
                        "up 7\n" +
                        "down 5\n" +
                        "up 1\n" +
                        "down 9\n" +
                        "down 8\n" +
                        "down 2\n" +
                        "down 1\n" +
                        "up 8\n" +
                        "up 7\n" +
                        "up 5\n" +
                        "down 5\n" +
                        "forward 1\n" +
                        "forward 6\n" +
                        "down 4\n" +
                        "down 3\n" +
                        "forward 5\n" +
                        "forward 5\n" +
                        "up 5\n" +
                        "down 6\n" +
                        "down 6\n" +
                        "down 2\n" +
                        "down 7\n" +
                        "up 1\n" +
                        "up 9\n" +
                        "up 4\n" +
                        "down 7\n" +
                        "up 5\n" +
                        "forward 5\n" +
                        "forward 6\n" +
                        "forward 6\n" +
                        "down 7\n" +
                        "down 6\n" +
                        "up 8\n" +
                        "forward 8\n" +
                        "forward 1\n" +
                        "down 6\n" +
                        "up 2\n" +
                        "forward 8\n" +
                        "down 7\n" +
                        "down 5\n" +
                        "up 1\n" +
                        "up 7\n" +
                        "up 2\n" +
                        "up 3\n" +
                        "down 3\n" +
                        "forward 1\n" +
                        "forward 4\n" +
                        "up 8\n" +
                        "forward 9\n" +
                        "down 1\n" +
                        "up 4\n" +
                        "forward 3\n" +
                        "down 9\n" +
                        "down 9\n" +
                        "forward 4\n" +
                        "down 8\n" +
                        "up 2\n" +
                        "forward 1\n" +
                        "forward 3\n" +
                        "up 5\n" +
                        "forward 5\n" +
                        "up 4\n" +
                        "forward 5\n" +
                        "forward 6\n" +
                        "forward 2\n" +
                        "forward 4\n" +
                        "up 5\n" +
                        "down 7\n" +
                        "up 1\n" +
                        "forward 7\n" +
                        "down 5\n" +
                        "forward 5\n" +
                        "down 5\n" +
                        "up 2\n" +
                        "down 3\n" +
                        "forward 6\n" +
                        "forward 5\n" +
                        "up 4\n" +
                        "up 5\n" +
                        "down 2\n" +
                        "forward 2\n" +
                        "down 2\n" +
                        "down 2\n" +
                        "up 8\n" +
                        "up 2\n" +
                        "down 7\n" +
                        "forward 3\n" +
                        "down 7\n" +
                        "down 7\n" +
                        "down 2\n" +
                        "up 5\n" +
                        "up 5\n" +
                        "forward 5\n" +
                        "up 5\n" +
                        "down 9\n" +
                        "down 1\n" +
                        "up 7\n" +
                        "up 5\n" +
                        "forward 5\n" +
                        "forward 1\n" +
                        "down 7\n" +
                        "down 8\n" +
                        "down 4\n" +
                        "forward 1\n" +
                        "down 2\n" +
                        "up 9\n" +
                        "forward 1\n" +
                        "forward 5\n" +
                        "forward 8\n" +
                        "down 7\n" +
                        "down 6\n" +
                        "up 2\n" +
                        "down 6\n" +
                        "forward 4\n" +
                        "down 9\n" +
                        "down 1\n" +
                        "down 9\n" +
                        "up 5\n" +
                        "up 1\n" +
                        "down 9\n" +
                        "forward 7\n" +
                        "up 4\n" +
                        "down 5\n" +
                        "up 1\n" +
                        "forward 2\n" +
                        "forward 2\n" +
                        "up 9\n" +
                        "forward 8\n" +
                        "up 4\n" +
                        "up 1\n" +
                        "up 6\n" +
                        "up 5\n" +
                        "down 5\n" +
                        "up 4\n" +
                        "up 1\n" +
                        "forward 9\n" +
                        "forward 3\n" +
                        "down 4\n" +
                        "down 9\n" +
                        "down 4\n" +
                        "forward 9\n" +
                        "down 2\n" +
                        "down 1\n" +
                        "up 9\n" +
                        "up 4\n" +
                        "forward 8\n" +
                        "forward 9\n" +
                        "forward 8\n" +
                        "up 4\n" +
                        "forward 6\n" +
                        "down 7\n" +
                        "down 6\n" +
                        "down 1\n" +
                        "forward 5\n" +
                        "forward 4\n" +
                        "up 4\n" +
                        "forward 4\n" +
                        "up 2\n" +
                        "forward 7\n" +
                        "forward 2\n" +
                        "down 2\n" +
                        "down 1\n" +
                        "up 5\n" +
                        "up 7\n" +
                        "down 5\n" +
                        "down 9\n" +
                        "up 1\n" +
                        "down 2\n" +
                        "forward 4\n" +
                        "forward 8\n" +
                        "up 1\n" +
                        "forward 7\n" +
                        "down 7\n" +
                        "forward 1\n" +
                        "down 2\n" +
                        "down 9\n" +
                        "forward 7\n" +
                        "forward 6\n" +
                        "forward 1\n" +
                        "forward 6\n" +
                        "forward 9\n" +
                        "up 8\n" +
                        "forward 4\n" +
                        "up 6\n" +
                        "forward 9\n" +
                        "forward 1\n" +
                        "forward 7\n" +
                        "forward 9\n" +
                        "down 9\n" +
                        "down 7\n" +
                        "down 6\n" +
                        "down 2\n" +
                        "down 4\n" +
                        "forward 9\n" +
                        "forward 4\n" +
                        "forward 6\n" +
                        "forward 1\n" +
                        "forward 3\n" +
                        "down 2\n" +
                        "forward 9\n" +
                        "down 9\n" +
                        "forward 8\n" +
                        "forward 7\n" +
                        "up 4\n" +
                        "forward 7\n" +
                        "forward 8\n" +
                        "up 4\n" +
                        "down 1\n" +
                        "up 3\n" +
                        "down 1\n" +
                        "down 9\n" +
                        "down 5\n" +
                        "down 2\n" +
                        "down 8\n" +
                        "down 3\n" +
                        "down 8\n" +
                        "forward 2\n" +
                        "forward 5\n" +
                        "down 5\n" +
                        "down 7\n" +
                        "forward 4\n" +
                        "up 6\n" +
                        "forward 5\n" +
                        "up 2\n" +
                        "up 6\n" +
                        "forward 6\n" +
                        "down 7\n" +
                        "down 8\n" +
                        "up 4\n" +
                        "up 9\n" +
                        "forward 7\n" +
                        "down 3\n" +
                        "forward 8\n" +
                        "forward 6\n" +
                        "up 3\n" +
                        "up 4\n" +
                        "down 1\n" +
                        "forward 2\n" +
                        "down 9\n" +
                        "down 1\n" +
                        "down 6\n" +
                        "down 5\n" +
                        "up 7\n" +
                        "forward 7\n" +
                        "down 6\n" +
                        "down 2\n" +
                        "down 5\n" +
                        "up 2\n" +
                        "forward 7\n" +
                        "forward 2\n" +
                        "down 6\n" +
                        "down 1\n" +
                        "forward 4\n" +
                        "up 9\n" +
                        "down 1\n" +
                        "down 7\n" +
                        "forward 1\n";
        String[] ss = s.split("\n");
        System.out.println(ss.length);
        int aim = 0;
        int hp = 0;
        int dp = 0;

        for (String value : ss) {
            if (value.startsWith("forward")) {
                hp += Integer.parseInt(value.split(" ")[1]);
                dp += aim * Integer.parseInt(value.split(" ")[1]);
            }
            if (value.startsWith("down")) {
                aim += Integer.parseInt(value.split(" ")[1]);
            }
            if (value.startsWith("up")) {
                aim -= Integer.parseInt(value.split(" ")[1]);
            }
        }

        System.out.println(hp);
        System.out.println(dp);
        System.out.println(dp * hp);

    }
}
