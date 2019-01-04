package hackerrank.contests.weekofcode.atimesavingaffair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * (partial score)
 * https://www.hackerrank.com/contests/w38/challenges/a-time-saving-affair/problem
 */

public class Solution {

    // Complete the leastTimeToInterview function below.
    private static long leastTimeToInterview(int n, int k, int[][] m, int m_nr) {

        if (n == 1) {
            return 0;
        }

        Map<Integer, Integer> visitTime = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        Set<Integer> toVisit = new HashSet<>();
        visited.add(1);
        toVisit.add(1);
        visitTime.put(1, 0);

        while (!toVisit.isEmpty()) {
            Set<Integer> toVisitNext = new HashSet<>();
            for (int i = 0; i < m_nr; i++) {
                if (toVisit.contains(m[i][0])) {
                    if (!visited.contains(m[i][1])) {
                        toVisitNext.add(m[i][1]);
                        visited.add(m[i][1]);
                    }

                    int vTime = visitTime.get(m[i][0]);
                    vTime += m[i][2];

                    if ((vTime / k) % 2 == 1) {
                        if (m[i][1] != n) {
                            vTime += (k - vTime % k);
                        }
                    }

                    int timeToStore = Math.min(vTime, visitTime.get(m[i][1]) != null ? visitTime.get(m[i][1]) : vTime);
                    visitTime.put(m[i][1], timeToStore);
                    //System.out.println(m[i][1] + " " + timeToStore);
                    if (timeToStore == vTime) {
                        toVisitNext.add(m[i][1]);
                    }
                }
                if (toVisit.contains(m[i][1])) {
                    if (!visited.contains(m[i][0])) {
                        toVisitNext.add(m[i][0]);
                        visited.add(m[i][0]);
                    }
                    int vTime = visitTime.get(m[i][1]);
                    vTime += m[i][2];

                    if ((vTime / k) % 2 == 1) {
                        if (m[i][0] != n) {
                            vTime += (k - vTime % k);
                        }
                    }

                    int timeToStore = Math.min(vTime, visitTime.get(m[i][0]) != null ? visitTime.get(m[i][0]) : vTime);
                    visitTime.put(m[i][0], timeToStore);
                    //System.out.println(m[i][0]  + " " + timeToStore);

                    if (timeToStore == vTime) {
                        toVisitNext.add(m[i][0]);
                    }
                }
            }
            //System.out.println("==========================");
            toVisit.clear();
            toVisit.addAll(toVisitNext);
            //
        }
        int res = visitTime.get(n);
        if (res % k == 0 && ((res / k) % 2 == 0)) {
            res = res - k;
        }

        if (res < 0) {
            res = 0;
        }
        return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m_nr = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] m = new int[m_nr][3];
        for (int i = 0; i < m_nr; i++) {
            String s = scanner.nextLine();
            String ss[] = s.split(" ");
            m[i][0] = Integer.parseInt(ss[0]);
            m[i][1] = Integer.parseInt(ss[1]);
            m[i][2] = Integer.parseInt(ss[2]);
        }

        long result = leastTimeToInterview(n, k, m, m_nr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

