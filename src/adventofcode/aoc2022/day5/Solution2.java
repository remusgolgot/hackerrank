package adventofcode.aoc2022.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {

    public static void main(String[] args) {

        String s =
                "[Q] [] [] [N] [] [] [] [N] []\n" +
                        "[H] [] [B] [D] [] [] [] [S] [M]\n" +
                        "[C] [] [Q] [J] [] [] [V] [Q] [D]\n" +
                        "[T] [] [S] [Z] [F] [] [J] [J] [W]\n" +
                        "[N] [G] [T] [S] [V] [] [B] [C] [C]\n" +
                        "[S] [B] [R] [W] [D] [J] [Q] [R] [Q]\n" +
                        "[V] [D] [W] [G] [P] [W] [N] [T] [S]\n" +
                        "[B] [W] [F] [L] [M] [F] [L] [G] [J]";


        String moves =
                "move 3 from 6 to 2\n" +
                        "move 2 from 8 to 7\n" +
                        "move 3 from 3 to 8\n" +
                        "move 2 from 5 to 3\n" +
                        "move 5 from 9 to 7\n" +
                        "move 5 from 3 to 5\n" +
                        "move 1 from 4 to 2\n" +
                        "move 3 from 2 to 1\n" +
                        "move 2 from 9 to 6\n" +
                        "move 4 from 1 to 4\n" +
                        "move 6 from 5 to 8\n" +
                        "move 1 from 6 to 3\n" +
                        "move 8 from 8 to 9\n" +
                        "move 5 from 9 to 2\n" +
                        "move 1 from 3 to 4\n" +
                        "move 11 from 7 to 2\n" +
                        "move 1 from 4 to 1\n" +
                        "move 1 from 5 to 9\n" +
                        "move 1 from 3 to 9\n" +
                        "move 1 from 9 to 5\n" +
                        "move 21 from 2 to 6\n" +
                        "move 2 from 8 to 4\n" +
                        "move 5 from 8 to 6\n" +
                        "move 4 from 9 to 7\n" +
                        "move 2 from 5 to 6\n" +
                        "move 5 from 4 to 2\n" +
                        "move 4 from 7 to 2\n" +
                        "move 20 from 6 to 9\n" +
                        "move 7 from 2 to 7\n" +
                        "move 1 from 2 to 6\n" +
                        "move 7 from 9 to 6\n" +
                        "move 3 from 7 to 9\n" +
                        "move 7 from 1 to 9\n" +
                        "move 3 from 7 to 4\n" +
                        "move 1 from 2 to 5\n" +
                        "move 1 from 5 to 2\n" +
                        "move 1 from 1 to 9\n" +
                        "move 23 from 9 to 1\n" +
                        "move 1 from 2 to 4\n" +
                        "move 1 from 9 to 6\n" +
                        "move 1 from 1 to 5\n" +
                        "move 20 from 1 to 7\n" +
                        "move 1 from 5 to 9\n" +
                        "move 12 from 4 to 2\n" +
                        "move 2 from 1 to 3\n" +
                        "move 1 from 3 to 5\n" +
                        "move 4 from 2 to 9\n" +
                        "move 2 from 6 to 4\n" +
                        "move 9 from 7 to 4\n" +
                        "move 11 from 6 to 7\n" +
                        "move 7 from 2 to 8\n" +
                        "move 1 from 5 to 7\n" +
                        "move 2 from 9 to 7\n" +
                        "move 1 from 6 to 4\n" +
                        "move 6 from 8 to 2\n" +
                        "move 3 from 7 to 1\n" +
                        "move 6 from 2 to 4\n" +
                        "move 1 from 3 to 2\n" +
                        "move 7 from 4 to 3\n" +
                        "move 1 from 8 to 5\n" +
                        "move 3 from 6 to 7\n" +
                        "move 1 from 2 to 9\n" +
                        "move 1 from 6 to 7\n" +
                        "move 4 from 4 to 1\n" +
                        "move 1 from 3 to 1\n" +
                        "move 22 from 7 to 6\n" +
                        "move 3 from 7 to 6\n" +
                        "move 4 from 7 to 6\n" +
                        "move 5 from 4 to 5\n" +
                        "move 26 from 6 to 2\n" +
                        "move 8 from 1 to 9\n" +
                        "move 2 from 6 to 5\n" +
                        "move 9 from 9 to 5\n" +
                        "move 2 from 9 to 4\n" +
                        "move 1 from 5 to 3\n" +
                        "move 1 from 9 to 5\n" +
                        "move 1 from 5 to 6\n" +
                        "move 1 from 4 to 3\n" +
                        "move 3 from 5 to 8\n" +
                        "move 1 from 6 to 2\n" +
                        "move 1 from 6 to 1\n" +
                        "move 1 from 1 to 8\n" +
                        "move 4 from 5 to 2\n" +
                        "move 7 from 2 to 4\n" +
                        "move 8 from 5 to 3\n" +
                        "move 1 from 5 to 7\n" +
                        "move 12 from 2 to 8\n" +
                        "move 6 from 3 to 8\n" +
                        "move 1 from 7 to 6\n" +
                        "move 10 from 3 to 4\n" +
                        "move 11 from 8 to 7\n" +
                        "move 6 from 8 to 3\n" +
                        "move 11 from 7 to 4\n" +
                        "move 1 from 6 to 3\n" +
                        "move 6 from 3 to 1\n" +
                        "move 6 from 1 to 5\n" +
                        "move 15 from 4 to 7\n" +
                        "move 1 from 3 to 5\n" +
                        "move 7 from 2 to 3\n" +
                        "move 5 from 5 to 9\n" +
                        "move 2 from 3 to 8\n" +
                        "move 1 from 9 to 4\n" +
                        "move 1 from 9 to 7\n" +
                        "move 1 from 4 to 5\n" +
                        "move 5 from 7 to 8\n" +
                        "move 13 from 4 to 1\n" +
                        "move 8 from 8 to 2\n" +
                        "move 2 from 2 to 7\n" +
                        "move 7 from 7 to 4\n" +
                        "move 1 from 5 to 1\n" +
                        "move 1 from 5 to 9\n" +
                        "move 3 from 8 to 9\n" +
                        "move 7 from 9 to 8\n" +
                        "move 1 from 5 to 2\n" +
                        "move 6 from 8 to 2\n" +
                        "move 6 from 7 to 6\n" +
                        "move 2 from 2 to 7\n" +
                        "move 2 from 8 to 3\n" +
                        "move 3 from 4 to 5\n" +
                        "move 1 from 7 to 1\n" +
                        "move 3 from 3 to 5\n" +
                        "move 4 from 4 to 6\n" +
                        "move 3 from 6 to 3\n" +
                        "move 11 from 2 to 9\n" +
                        "move 5 from 3 to 4\n" +
                        "move 1 from 1 to 4\n" +
                        "move 7 from 9 to 4\n" +
                        "move 1 from 6 to 4\n" +
                        "move 5 from 5 to 4\n" +
                        "move 9 from 1 to 3\n" +
                        "move 4 from 6 to 3\n" +
                        "move 2 from 1 to 7\n" +
                        "move 3 from 9 to 8\n" +
                        "move 1 from 9 to 5\n" +
                        "move 5 from 3 to 4\n" +
                        "move 3 from 4 to 6\n" +
                        "move 3 from 7 to 5\n" +
                        "move 4 from 2 to 4\n" +
                        "move 10 from 3 to 1\n" +
                        "move 2 from 8 to 9\n" +
                        "move 1 from 8 to 4\n" +
                        "move 2 from 2 to 9\n" +
                        "move 5 from 5 to 8\n" +
                        "move 2 from 6 to 3\n" +
                        "move 4 from 9 to 4\n" +
                        "move 2 from 3 to 7\n" +
                        "move 2 from 6 to 3\n" +
                        "move 1 from 6 to 1\n" +
                        "move 1 from 8 to 5\n" +
                        "move 1 from 5 to 8\n" +
                        "move 1 from 4 to 8\n" +
                        "move 17 from 4 to 2\n" +
                        "move 11 from 4 to 2\n" +
                        "move 1 from 8 to 6\n" +
                        "move 28 from 2 to 3\n" +
                        "move 10 from 3 to 1\n" +
                        "move 3 from 8 to 1\n" +
                        "move 1 from 7 to 8\n" +
                        "move 1 from 7 to 1\n" +
                        "move 1 from 6 to 5\n" +
                        "move 10 from 1 to 5\n" +
                        "move 20 from 3 to 5\n" +
                        "move 3 from 1 to 6\n" +
                        "move 3 from 8 to 1\n" +
                        "move 18 from 5 to 1\n" +
                        "move 4 from 4 to 6\n" +
                        "move 4 from 5 to 1\n" +
                        "move 1 from 6 to 8\n" +
                        "move 7 from 5 to 8\n" +
                        "move 2 from 5 to 3\n" +
                        "move 34 from 1 to 8\n" +
                        "move 4 from 1 to 7\n" +
                        "move 36 from 8 to 6\n" +
                        "move 6 from 8 to 4\n" +
                        "move 3 from 6 to 4\n" +
                        "move 1 from 1 to 2\n" +
                        "move 1 from 3 to 2\n" +
                        "move 1 from 3 to 5\n" +
                        "move 1 from 1 to 8\n" +
                        "move 1 from 7 to 2\n" +
                        "move 3 from 2 to 8\n" +
                        "move 3 from 8 to 1\n" +
                        "move 2 from 7 to 5\n" +
                        "move 5 from 6 to 4\n" +
                        "move 31 from 6 to 4\n" +
                        "move 1 from 7 to 3\n" +
                        "move 13 from 4 to 7\n" +
                        "move 2 from 5 to 9\n" +
                        "move 1 from 1 to 9\n" +
                        "move 1 from 3 to 1\n" +
                        "move 11 from 4 to 9\n" +
                        "move 12 from 4 to 3\n" +
                        "move 4 from 9 to 1\n" +
                        "move 1 from 9 to 8\n" +
                        "move 1 from 5 to 9\n" +
                        "move 3 from 6 to 5\n" +
                        "move 3 from 5 to 1\n" +
                        "move 11 from 7 to 8\n" +
                        "move 6 from 4 to 8\n" +
                        "move 3 from 3 to 8\n" +
                        "move 5 from 1 to 6\n" +
                        "move 1 from 7 to 3\n" +
                        "move 5 from 8 to 3\n" +
                        "move 2 from 4 to 7\n" +
                        "move 8 from 8 to 4\n" +
                        "move 5 from 8 to 2\n" +
                        "move 2 from 2 to 1\n" +
                        "move 7 from 9 to 2\n" +
                        "move 5 from 6 to 7\n" +
                        "move 6 from 2 to 4\n" +
                        "move 3 from 9 to 1\n" +
                        "move 3 from 1 to 4\n" +
                        "move 2 from 2 to 1\n" +
                        "move 5 from 1 to 2\n" +
                        "move 6 from 2 to 9\n" +
                        "move 4 from 7 to 6\n" +
                        "move 2 from 9 to 6\n" +
                        "move 1 from 2 to 5\n" +
                        "move 1 from 6 to 5\n" +
                        "move 5 from 3 to 1\n" +
                        "move 1 from 5 to 3\n" +
                        "move 2 from 6 to 1\n" +
                        "move 1 from 9 to 7\n" +
                        "move 3 from 7 to 3\n" +
                        "move 4 from 8 to 4\n" +
                        "move 1 from 5 to 6\n" +
                        "move 9 from 1 to 4\n" +
                        "move 4 from 6 to 8\n" +
                        "move 2 from 7 to 4\n" +
                        "move 2 from 1 to 9\n" +
                        "move 10 from 3 to 1\n" +
                        "move 7 from 1 to 3\n" +
                        "move 1 from 1 to 2\n" +
                        "move 1 from 2 to 4\n" +
                        "move 2 from 3 to 8\n" +
                        "move 6 from 8 to 9\n" +
                        "move 2 from 1 to 2\n" +
                        "move 30 from 4 to 3\n" +
                        "move 29 from 3 to 7\n" +
                        "move 2 from 2 to 4\n" +
                        "move 7 from 9 to 5\n" +
                        "move 6 from 4 to 8\n" +
                        "move 5 from 8 to 9\n" +
                        "move 5 from 5 to 7\n" +
                        "move 1 from 5 to 4\n" +
                        "move 17 from 7 to 9\n" +
                        "move 6 from 3 to 9\n" +
                        "move 4 from 3 to 7\n" +
                        "move 1 from 8 to 6\n" +
                        "move 17 from 9 to 8\n" +
                        "move 8 from 9 to 3\n" +
                        "move 1 from 5 to 6\n" +
                        "move 9 from 8 to 7\n" +
                        "move 3 from 9 to 5\n" +
                        "move 1 from 4 to 5\n" +
                        "move 2 from 6 to 1\n" +
                        "move 3 from 3 to 8\n" +
                        "move 2 from 3 to 5\n" +
                        "move 1 from 3 to 8\n" +
                        "move 10 from 8 to 4\n" +
                        "move 2 from 1 to 9\n" +
                        "move 1 from 8 to 1\n" +
                        "move 1 from 1 to 5\n" +
                        "move 1 from 8 to 6\n" +
                        "move 4 from 4 to 5\n" +
                        "move 1 from 3 to 9\n" +
                        "move 3 from 9 to 6\n" +
                        "move 1 from 9 to 8\n" +
                        "move 2 from 9 to 1\n" +
                        "move 2 from 1 to 7\n" +
                        "move 1 from 9 to 1\n" +
                        "move 3 from 4 to 6\n" +
                        "move 2 from 4 to 9\n" +
                        "move 1 from 1 to 8\n" +
                        "move 2 from 8 to 1\n" +
                        "move 5 from 6 to 2\n" +
                        "move 2 from 1 to 4\n" +
                        "move 2 from 9 to 1\n" +
                        "move 2 from 6 to 3\n" +
                        "move 2 from 3 to 1\n" +
                        "move 2 from 4 to 7\n" +
                        "move 4 from 1 to 5\n" +
                        "move 15 from 5 to 4\n" +
                        "move 4 from 2 to 5\n" +
                        "move 7 from 4 to 2\n" +
                        "move 4 from 4 to 5\n" +
                        "move 1 from 3 to 9\n" +
                        "move 3 from 5 to 2\n" +
                        "move 9 from 2 to 1\n" +
                        "move 3 from 5 to 4\n" +
                        "move 1 from 5 to 3\n" +
                        "move 1 from 9 to 7\n" +
                        "move 1 from 5 to 8\n" +
                        "move 4 from 1 to 6\n" +
                        "move 1 from 3 to 2\n" +
                        "move 2 from 1 to 2\n" +
                        "move 3 from 2 to 8\n" +
                        "move 14 from 7 to 2\n" +
                        "move 2 from 6 to 4\n" +
                        "move 19 from 7 to 8\n" +
                        "move 1 from 7 to 1\n" +
                        "move 23 from 8 to 2\n" +
                        "move 33 from 2 to 1\n" +
                        "move 1 from 7 to 1\n" +
                        "move 7 from 4 to 3\n" +
                        "move 1 from 6 to 2\n" +
                        "move 15 from 1 to 7\n" +
                        "move 6 from 2 to 8\n" +
                        "move 1 from 8 to 2\n" +
                        "move 1 from 2 to 8\n" +
                        "move 2 from 3 to 8\n" +
                        "move 3 from 8 to 5\n" +
                        "move 1 from 6 to 1\n" +
                        "move 2 from 4 to 7\n" +
                        "move 1 from 5 to 9\n" +
                        "move 3 from 8 to 3\n" +
                        "move 1 from 2 to 6\n" +
                        "move 18 from 1 to 4\n" +
                        "move 1 from 6 to 3\n" +
                        "move 2 from 5 to 1\n" +
                        "move 2 from 8 to 2\n" +
                        "move 5 from 1 to 9\n" +
                        "move 15 from 4 to 9\n" +
                        "move 5 from 9 to 5\n" +
                        "move 1 from 1 to 5\n" +
                        "move 1 from 1 to 3\n" +
                        "move 1 from 1 to 2\n" +
                        "move 3 from 2 to 8\n" +
                        "move 9 from 9 to 8\n" +
                        "move 11 from 8 to 4\n" +
                        "move 1 from 8 to 3\n" +
                        "move 4 from 7 to 8\n" +
                        "move 3 from 3 to 1\n" +
                        "move 3 from 3 to 7\n" +
                        "move 3 from 5 to 8\n" +
                        "move 3 from 5 to 3\n" +
                        "move 5 from 9 to 7\n" +
                        "move 9 from 4 to 3\n" +
                        "move 1 from 8 to 9\n" +
                        "move 9 from 3 to 7\n" +
                        "move 2 from 3 to 2\n" +
                        "move 1 from 4 to 1\n" +
                        "move 1 from 8 to 6\n" +
                        "move 10 from 7 to 1\n" +
                        "move 2 from 2 to 6\n" +
                        "move 2 from 6 to 8\n" +
                        "move 2 from 9 to 4\n" +
                        "move 14 from 1 to 9\n" +
                        "move 3 from 4 to 7\n" +
                        "move 1 from 6 to 3\n" +
                        "move 2 from 8 to 4\n" +
                        "move 8 from 7 to 5\n" +
                        "move 6 from 7 to 5\n" +
                        "move 12 from 9 to 3\n" +
                        "move 3 from 9 to 8\n" +
                        "move 8 from 8 to 2\n" +
                        "move 7 from 2 to 1\n" +
                        "move 1 from 7 to 2\n" +
                        "move 6 from 7 to 2\n" +
                        "move 7 from 3 to 6\n" +
                        "move 1 from 6 to 3\n" +
                        "move 7 from 2 to 1\n" +
                        "move 5 from 4 to 8\n" +
                        "move 2 from 7 to 9\n" +
                        "move 1 from 2 to 7\n" +
                        "move 4 from 6 to 1\n" +
                        "move 2 from 8 to 1\n" +
                        "move 1 from 7 to 6\n" +
                        "move 2 from 6 to 1\n" +
                        "move 3 from 3 to 7\n" +
                        "move 1 from 4 to 6\n" +
                        "move 7 from 3 to 8\n" +
                        "move 6 from 8 to 1\n" +
                        "move 1 from 9 to 7\n" +
                        "move 22 from 1 to 9\n" +
                        "move 2 from 7 to 2\n" +
                        "move 3 from 3 to 2\n" +
                        "move 5 from 1 to 3\n" +
                        "move 2 from 2 to 7\n" +
                        "move 2 from 6 to 9\n" +
                        "move 3 from 9 to 4\n" +
                        "move 2 from 4 to 5\n" +
                        "move 1 from 4 to 7\n" +
                        "move 1 from 1 to 9\n" +
                        "move 13 from 9 to 7\n" +
                        "move 3 from 9 to 5\n" +
                        "move 14 from 5 to 3\n" +
                        "move 5 from 9 to 5\n" +
                        "move 2 from 9 to 7\n" +
                        "move 9 from 5 to 3\n" +
                        "move 15 from 3 to 2\n" +
                        "move 12 from 7 to 3\n" +
                        "move 3 from 2 to 7\n" +
                        "move 8 from 7 to 5\n" +
                        "move 4 from 8 to 9\n" +
                        "move 1 from 9 to 6\n" +
                        "move 1 from 7 to 5\n" +
                        "move 14 from 2 to 7\n" +
                        "move 2 from 9 to 4\n" +
                        "move 1 from 6 to 5\n" +
                        "move 18 from 3 to 2\n" +
                        "move 5 from 3 to 9\n" +
                        "move 2 from 3 to 6\n" +
                        "move 2 from 4 to 8\n" +
                        "move 15 from 7 to 6\n" +
                        "move 1 from 9 to 1\n" +
                        "move 2 from 8 to 3\n" +
                        "move 1 from 7 to 9\n" +
                        "move 6 from 9 to 6\n" +
                        "move 2 from 3 to 7\n" +
                        "move 3 from 5 to 8\n" +
                        "move 8 from 5 to 3\n" +
                        "move 2 from 7 to 9\n" +
                        "move 22 from 6 to 9\n" +
                        "move 12 from 2 to 3\n" +
                        "move 1 from 1 to 9\n" +
                        "move 1 from 2 to 6\n" +
                        "move 1 from 6 to 5\n" +
                        "move 6 from 2 to 6\n" +
                        "move 7 from 6 to 3\n" +
                        "move 20 from 9 to 4\n" +
                        "move 5 from 9 to 3\n" +
                        "move 7 from 3 to 5\n" +
                        "move 14 from 4 to 6\n" +
                        "move 2 from 4 to 1\n" +
                        "move 2 from 8 to 3\n" +
                        "move 2 from 1 to 5\n" +
                        "move 9 from 6 to 1\n" +
                        "move 20 from 3 to 4\n" +
                        "move 5 from 6 to 8\n" +
                        "move 1 from 5 to 9\n" +
                        "move 1 from 9 to 6\n" +
                        "move 9 from 5 to 7\n" +
                        "move 1 from 6 to 5\n" +
                        "move 2 from 3 to 4\n" +
                        "move 4 from 8 to 2\n" +
                        "move 2 from 8 to 4\n" +
                        "move 3 from 3 to 7\n" +
                        "move 5 from 1 to 7\n" +
                        "move 4 from 2 to 7\n" +
                        "move 1 from 1 to 3\n" +
                        "move 3 from 3 to 6\n" +
                        "move 4 from 7 to 3\n" +
                        "move 1 from 1 to 4\n" +
                        "move 3 from 3 to 5\n" +
                        "move 1 from 1 to 7\n" +
                        "move 28 from 4 to 3\n" +
                        "move 20 from 3 to 5\n" +
                        "move 16 from 5 to 6\n" +
                        "move 3 from 3 to 2\n" +
                        "move 2 from 3 to 6\n" +
                        "move 6 from 7 to 5\n" +
                        "move 1 from 3 to 6\n" +
                        "move 1 from 2 to 1\n" +
                        "move 10 from 6 to 8\n" +
                        "move 2 from 1 to 5\n" +
                        "move 1 from 4 to 8\n" +
                        "move 1 from 6 to 9\n" +
                        "move 2 from 2 to 5\n" +
                        "move 10 from 7 to 4\n" +
                        "move 2 from 3 to 4\n" +
                        "move 1 from 3 to 8\n" +
                        "move 1 from 9 to 4\n" +
                        "move 6 from 4 to 1\n" +
                        "move 10 from 8 to 6\n" +
                        "move 1 from 1 to 4\n" +
                        "move 8 from 4 to 9\n" +
                        "move 3 from 1 to 5\n" +
                        "move 14 from 5 to 8\n" +
                        "move 2 from 7 to 5\n" +
                        "move 3 from 9 to 7\n" +
                        "move 5 from 9 to 5\n" +
                        "move 2 from 7 to 3\n" +
                        "move 16 from 6 to 9\n" +
                        "move 3 from 6 to 3\n" +
                        "move 1 from 1 to 5\n" +
                        "move 1 from 1 to 4\n" +
                        "move 1 from 7 to 3\n" +
                        "move 2 from 6 to 1\n" +
                        "move 2 from 5 to 7\n" +
                        "move 2 from 7 to 1\n" +
                        "move 3 from 3 to 8\n" +
                        "move 12 from 5 to 4\n" +
                        "move 1 from 5 to 8\n" +
                        "move 1 from 1 to 4\n" +
                        "move 9 from 4 to 1\n" +
                        "move 11 from 1 to 7\n" +
                        "move 10 from 7 to 4\n" +
                        "move 3 from 3 to 7\n" +
                        "move 1 from 1 to 7\n" +
                        "move 5 from 4 to 5\n" +
                        "move 8 from 4 to 1\n" +
                        "move 1 from 4 to 1\n" +
                        "move 5 from 5 to 4\n" +
                        "move 2 from 7 to 5\n" +
                        "move 2 from 7 to 3\n" +
                        "move 9 from 1 to 7\n" +
                        "move 16 from 8 to 5\n" +
                        "move 3 from 8 to 7\n" +
                        "move 6 from 4 to 3\n" +
                        "move 17 from 5 to 1\n" +
                        "move 14 from 1 to 2\n" +
                        "move 7 from 2 to 4\n" +
                        "move 5 from 2 to 6";

        String[] ss = s.split("\n");
        List<Stack<String>> stacks = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            stacks.add(new Stack());
        }

        for (int i = 7; i >= 0; i--) {
            String[] t = ss[i].split(" ");
            System.out.println(t.length);
            for (int j = 0; j < 9; j++) {
                if (t[j].length() > 2) {
                    stacks.get(j).push(t[j]);
                }
            }
        }

        String[] movess = moves.split("\n");

        for (int i = 0; i < movess.length; i++) {
            String t[] = movess[i].split(" ");
            int k = Integer.parseInt(t[1]);
            int from = Integer.parseInt(t[3]);
            int to = Integer.parseInt(t[5]);
            String[] crates = new String[k];
            for (int j = 0; j < k; j++) {
                String q = stacks.get(from - 1).pop();
                crates[j] = q;
            }
            for (int j = k - 1; j >= 0; j--) {
                stacks.get(to - 1).push(crates[j]);
            }
        }
        // JBQSRZNTJ
        // JWCQRCMTT
        // FJSRQCFTN
        // CJVLJQPHS

        for (int i = 0; i < 9; i++) {
            System.out.print(stacks.get(i).pop());
        }
    }
}
