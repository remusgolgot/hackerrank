package leetcode.medium.lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remus on 2/4/2025.
 * <p>
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 */
public class Solution {
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            List<String> intermediateList = new ArrayList<>();
            List<String> tr = transform(digits.substring(i, i + 1));
            if (i == 0) {
                result.addAll(tr);
            } else {
                for (int j = 0; j < result.size(); j++) {
                    for (int k = 0; k < tr.size(); k++) {
                        intermediateList.add(result.get(j) + tr.get(k));
                    }
                }
                result = intermediateList;
            }

        }

        return result;
    }

    public static List<String> transform(String i) {

        return switch (i) {
            case "2" -> List.of("a", "b", "c");
            case "3" -> List.of("d", "e", "f");
            case "4" -> List.of("g", "h", "i");
            case "5" -> List.of("j", "k", "l");
            case "6" -> List.of("m", "n", "o");
            case "7" -> List.of("p", "q", "r", "s");
            case "8" -> List.of("t", "u", "v");
            case "9" -> List.of("w", "x", "y", "z");
            default -> new ArrayList<>();
        };
    }

    public static void main(String[] args) {
        List<String> result = letterCombinations("239");
        String resultAsString = String.join(",", result);
        System.out.println(resultAsString);
    }
}