package hackerrank.challenges.algorithms.implementation.medium.thecountingsort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by remus.golgot on 8/25/2020.
 * <p>
 * https://www.hackerrank.com/challenges/countingsort4/problem
 */
public class Solution {

    // Complete the countSort function below.
    static void countSort(List<List<String>> arr) {
        Map<Integer, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            List<String> l = arr.get(i);
            List l1 = hashMap.get(Integer.parseInt(l.get(0)));
            if (l1 == null) {
                l1 = new ArrayList<String>();
            }
            String toAdd = l.get(0) + "." + l.get(1);
            if (i < arr.size() / 2) {
                toAdd = "!" + toAdd;
            }
            l1.add(toAdd);
            hashMap.remove(Integer.parseInt(l.get(0)));
            hashMap.put(Integer.parseInt(l.get(0)), l1);
        }
        Set<Integer> keys = hashMap.keySet();
        List<Integer> listOfKeys = new ArrayList<>(keys);
        Collections.sort(listOfKeys);
        StringBuilder sb = new StringBuilder();
        for (Integer i : listOfKeys) {
            List<String> l = hashMap.get(i);
            for (String s : l) {
                if (s.startsWith("!")) {
                    sb.append("- ");
                } else {
                    sb.append(s.split("\\.")[1] + " ");
                }
            }
        }
        String ff = sb.toString();
        System.out.println(ff.substring(0, ff.length() - 1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Arrays.asList(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")));
        }

        countSort(arr);

        bufferedReader.close();
    }
}

