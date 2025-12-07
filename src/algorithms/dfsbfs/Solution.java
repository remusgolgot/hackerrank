package algorithms.dfsbfs;

import java.util.*;

/**
 * Depth First and Breadth First searches in a given graph
 * Created by remus.golgot on 04/26/2020
 */
public class Solution {

    static class Graph {
        int source;
        int nrNodes;
        static List<Edge> edges;

        public Graph(int nrNodes) {
            this.nrNodes = nrNodes;
            edges = new ArrayList<>();
        }

        public void addEdge(Edge e) {
            edges.add(e);
        }

        public int getSource() {
            return source;
        }

        public void setSource(int source) {
            this.source = source;
        }

        public int getNrNodes() {
            return nrNodes;
        }

        public void setNrNodes(int nrNodes) {
            this.nrNodes = nrNodes;
        }

        public List<Edge> getEdges() {
            return edges;
        }

        public void setEdges(List<Edge> edges) {
            this.edges = edges;
        }

        public static void getDFS(int s) {

            Stack<Integer> visitingStack = new Stack<>();
            List<Integer> visitedList = new ArrayList<>();
            visitingStack.add(s);
            while (!visitingStack.empty()) {
                Integer i = visitingStack.pop();
                if (!visitedList.contains(i)) {
                    visitedList.add(i);
                    List<Edge> elist  = edges.stream().filter(edge -> edge.x == i || edge.y == i).toList();
                    elist.forEach(edge -> visitingStack.push(edge.x == i ? edge.y : edge.x));
                }
            }
            System.out.println(visitedList);

        }

        static void getBFS(int s) {

            Queue<Integer> visitingQueue = new ArrayDeque<>();
            List<Integer> visitedList = new ArrayList<>();
            visitingQueue.add(s);
            while (!visitingQueue.isEmpty()) {
                Integer i = visitingQueue.remove();
                if (!visitedList.contains(i)) {
                    visitedList.add(i);
                    List<Edge> elist = edges.stream().filter(edge -> edge.x == i || edge.y == i).toList();
                    elist.forEach(edge -> {
                        int e = edge.x == i ? edge.y : edge.x;
                        visitingQueue.add(e);
                    });
                }
            }
            System.out.println(visitedList);

        }
    }

    static class Edge {
        int x;
        int y;

        public Edge(String edgeInput) {
            x = Integer.parseInt(edgeInput.split(" ")[0]);
            y = Integer.parseInt(edgeInput.split(" ")[1]);
        }

        public Edge(int x, int y) {
            this.x = x;
            this.y = y;
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

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(new Edge(1,2));
        graph.addEdge(new Edge(2,3));
        graph.addEdge(new Edge(3,4));
        graph.addEdge(new Edge(4,5));
        graph.addEdge(new Edge(5,7));
        graph.addEdge(new Edge(6,7));

        graph.addEdge(new Edge(1,4));
        graph.addEdge(new Edge(1,5));
        graph.addEdge(new Edge(1,6));
        Graph.getDFS(1);
        Graph.getBFS(1);

    }
}
