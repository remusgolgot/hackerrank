package hackerrank.crackingthecode.shortestreachinagraph;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by remus.golgot on 04/15/2020.
 * <p>
 * https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach/problem
 */

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named algorithms.firstRepeatedCharacter.Solution. */
        Scanner in = new Scanner(System.in);
        int q = Integer.parseInt(in.nextLine());
        for (int i = 0; i < q; i++) {
            String line = in.nextLine();
            int n = Integer.parseInt(line.split(" ")[0]);
            int m = Integer.parseInt(line.split(" ")[1]);
            Graph graph = new Graph(n);
            for (int j = 0; j < m; j++) {
                String inputEdge = in.nextLine();
                graph.addEdge(new Edge(inputEdge));
            }
            int s = Integer.parseInt(in.nextLine());
            graph.setSource(s);
            Integer[] bfsPath = graph.getBFSPath(s);
            for (Integer ii : bfsPath) {
                if (ii > 0) {
                    System.out.print((6 * ii) + " ");
                }
                if (ii < 0) {
                    System.out.print(ii + " ");
                }

            }
            System.out.println();
        }
    }

    static class Graph {
        int source;
        int nrNodes;
        List<Edge> edges;

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

        public Integer[] getBFSPath(int s) {
            Integer[] path = new Integer[nrNodes];
            Arrays.fill(path, -1);

            // Mark all the vertices as not visited(By default
            // set as false)
            boolean[] visited = new boolean[nrNodes];

            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();

            // Mark the current node as visited and enqueue it
            visited[s - 1] = true;
            path[s - 1] = 0;
            queue.add(s);

            while (queue.size() != 0) {
                // Dequeue a vertex from queue and print it
                final Integer sVisit = queue.poll();
                int sourcePath = path[sVisit - 1];

                List<Edge> list = edges.stream().filter(e -> e.x == sVisit || e.y == sVisit).collect(Collectors.toList());

                for (Edge edgeToVisit : list) {
                    int nodeToVisit;
                    if (edgeToVisit.x == sVisit) {
                        nodeToVisit = edgeToVisit.y;
                    } else {
                        nodeToVisit = edgeToVisit.x;
                    }
                    if (!visited[nodeToVisit - 1]) {
                        visited[nodeToVisit - 1] = true;
                        path[nodeToVisit - 1] = sourcePath + 1;
                        queue.add(nodeToVisit);
                    }
                }
            }

            return path;
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
}