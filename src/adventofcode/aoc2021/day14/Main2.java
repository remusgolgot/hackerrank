package adventofcode.aoc2021.day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {

    static Map<String, String> rules = new HashMap<>();

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

        Map<String, Long> pairCount = new HashMap<>();
        for (int i = 0; i < ss.length; i++) {
            rules.put(ss[i].split(" -> ")[0], ss[i].split(" -> ")[1]);
        }

        for (int i = 0; i < p.length() - 1; i++) {
            long ii = pairCount.getOrDefault(p.substring(i, i + 2), 0L);
            pairCount.put(p.substring(i, i + 2), ii + 1);
        }

        for (int i = 0; i < 40; i++) {
            pairCount = createPolymere(pairCount);
        }

        Map<Character, Long> charCount = new HashMap<>();
        for (String key : pairCount.keySet()) {
            charCount.merge(key.charAt(0), pairCount.get(key), Long::sum);
            charCount.merge(key.charAt(1), pairCount.get(key), Long::sum);
        }
        final List<Map.Entry<Character, Long>> sortedCharCount = new ArrayList<>(charCount.entrySet());
        sortedCharCount.sort(Map.Entry.comparingByValue());
        long min = sortedCharCount.get(0).getValue();
        long max = sortedCharCount.get(sortedCharCount.size() - 1).getValue();
        System.out.println((max - min) / 2); // or + 1
    }

    private static Map<String, Long> createPolymere(Map<String, Long> pairCount) {
        Map<String, Long> newPairCount = new HashMap<>();
        for (String key : pairCount.keySet()) {
            newPairCount.merge(key.charAt(0) + rules.get(key), pairCount.get(key), Long::sum);
            newPairCount.merge(rules.get(key) + key.charAt(1), pairCount.get(key), Long::sum);
        }
        return newPairCount;
    }


}
