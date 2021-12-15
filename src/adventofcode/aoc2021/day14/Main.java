package adventofcode.aoc2021.day14;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        String p = "OOFNFCBHCKBBVNHBNVCP";
        String s = "" +
                "" +
                "PH -> V\n" +
                "OK -> S\n" +
                "KK -> O\n" +
                "BV -> K\n" +
                "CV -> S\n" +
                "SV -> C\n" +
                "CK -> O\n" +
                "PC -> F\n" +
                "SC -> O\n" +
                "KC -> S\n" +
                "KF -> N\n" +
                "SN -> C\n" +
                "SF -> P\n" +
                "OS -> O\n" +
                "OP -> N\n" +
                "FS -> P\n" +
                "FV -> N\n" +
                "CP -> S\n" +
                "VS -> P\n" +
                "PB -> P\n" +
                "HP -> P\n" +
                "PK -> S\n" +
                "FC -> F\n" +
                "SB -> K\n" +
                "NC -> V\n" +
                "PP -> B\n" +
                "PN -> N\n" +
                "VN -> C\n" +
                "NV -> O\n" +
                "OV -> O\n" +
                "BS -> K\n" +
                "FP -> V\n" +
                "NK -> K\n" +
                "PO -> B\n" +
                "HF -> H\n" +
                "VK -> S\n" +
                "ON -> C\n" +
                "KH -> F\n" +
                "HO -> P\n" +
                "OO -> H\n" +
                "BC -> V\n" +
                "CS -> O\n" +
                "OC -> B\n" +
                "VB -> N\n" +
                "OF -> P\n" +
                "FK -> H\n" +
                "OH -> H\n" +
                "CF -> K\n" +
                "CC -> V\n" +
                "BK -> O\n" +
                "BH -> F\n" +
                "VV -> N\n" +
                "KS -> V\n" +
                "FO -> F\n" +
                "SH -> F\n" +
                "OB -> O\n" +
                "VH -> F\n" +
                "HH -> P\n" +
                "PF -> C\n" +
                "NF -> V\n" +
                "VP -> S\n" +
                "CN -> V\n" +
                "SK -> O\n" +
                "FB -> S\n" +
                "FN -> S\n" +
                "BF -> H\n" +
                "FF -> V\n" +
                "CB -> P\n" +
                "NN -> O\n" +
                "VC -> F\n" +
                "HK -> F\n" +
                "BO -> H\n" +
                "KO -> C\n" +
                "CH -> N\n" +
                "KP -> C\n" +
                "HS -> P\n" +
                "NP -> O\n" +
                "NS -> V\n" +
                "NB -> H\n" +
                "HN -> O\n" +
                "BP -> C\n" +
                "VF -> S\n" +
                "KN -> P\n" +
                "HC -> C\n" +
                "PS -> K\n" +
                "BB -> O\n" +
                "NO -> N\n" +
                "NH -> F\n" +
                "BN -> F\n" +
                "KV -> V\n" +
                "SS -> K\n" +
                "CO -> H\n" +
                "KB -> P\n" +
                "FH -> C\n" +
                "SP -> C\n" +
                "SO -> V\n" +
                "PV -> S\n" +
                "VO -> O\n" +
                "HV -> N\n" +
                "HB -> V";

        String ss[] = s.split("\n");
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < ss.length; i++) {
            map.put(ss[i].split(" -> ")[0], ss[i].split(" -> ")[1]);
        }

        for (int i = 0; i < 10; i++) {
            Map<Integer, String> toInsert = new HashMap<>();
            for (int j = 0; j < p.length() - 1; j++) {
                if (map.containsKey(p.substring(j, j + 2))) {
                    toInsert.put(j + 1, map.get(p.substring(j, j + 2)));
                }
            }
            int k = 0;
            for (Integer n : toInsert.keySet()
            ) {
                p = p.substring(0, n + k) + toInsert.get(n) + p.substring(n + k);
                k++;
            }
            System.out.println(p);
        }
        System.out.println(p);
        int[] charArr = new int[26];
        for (int i = 0; i < p.length(); i++) {
            charArr[p.charAt(i) - 'A']++;
        }
        int min = 30000;
        int max = -1;
        for (int i = 0; i < 26; i++) {
            if (charArr[i] > 0) {
                if (min > charArr[i]) {
                    min = charArr[i];
                }
                if (max < charArr[i]) {
                    max = charArr[i];
                }
            }
        }
        System.out.println(max - min);
    }
}
