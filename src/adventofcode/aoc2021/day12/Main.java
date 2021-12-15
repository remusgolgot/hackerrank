package adventofcode.aoc2021.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {

    static class Edge {
        String x;
        String y;

        public Edge(String edgeInput) {
            x = edgeInput.split("-")[0];
            y = edgeInput.split("-")[1];
        }

        public Edge(String x, String y) {
            this.x = x;
            this.y = y;
        }

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }

        public String getY() {
            return y;
        }

        public void setY(String y) {
            this.y = y;
        }
    }

    static List<Edge> edges = new ArrayList<>();

    public static void getDFS(String s) {

        Stack<String> visitingStack = new Stack<>();
        List<String> visitedList = new ArrayList<>();
        visitingStack.add(s);
        while (!visitingStack.empty()) {
            String i = visitingStack.pop();
            if (!visitedList.contains(i)) {
                List<Edge> elist  = edges.stream().filter(edge -> Objects.equals(edge.x, i) || Objects.equals(edge.y, i))
                        .collect(Collectors.toList());
                elist.forEach(edge -> {
                    visitingStack.push(Objects.equals(edge.x, i) ? edge.y : edge.x);
                });
            }
            if (i.equals("end")) {
                System.out.println(visitedList);
            }
        }


    }

    public static void main(String[] args) {
        String s = "fs-end\n" +
                "he-DX\n" +
                "fs-he\n" +
                "start-DX\n" +
                "pj-DX\n" +
                "end-zg\n" +
                "zg-sl\n" +
                "zg-pj\n" +
                "pj-he\n" +
                "RW-he\n" +
                "fs-DX\n" +
                "pj-RW\n" +
                "zg-RW\n" +
                "start-pj\n" +
                "he-WI\n" +
                "zg-he\n" +
                "pj-fs\n" +
                "start-RW";
        String[] ss = s.split("\n");

        for (int i = 0; i < ss.length; i++) {
            edges.add(new Edge(ss[i]));
        }
        getDFS("start");
    }
}
