package adventofcode.aoc2024.day11;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://adventofcode.com/2024/day/11
 */
public class Main2 {

    public static void main(String[] args) {
        String s = "0 5601550 3914 852 50706 68 6 645371"; // 224869647102559 represent 75 blinks

        String[] ss = s.split(" ");
        List<String> numbersAsString = Arrays.asList(ss);
        List<Long> numbersAsLongs = numbersAsString.stream().map(Long::parseLong).collect(Collectors.toList());
        Map<Long, Long> occurrences = new HashMap();
        for (Long l : numbersAsLongs) {
            occurrences.put(l, 1L);
        }

        for (int i = 0; i < 75; i++) {
            Map<Long, Long> newOccurrences = new HashMap<>();
            for (Long x : occurrences.keySet()) {
                if (x == 0) {
                    if (newOccurrences.containsKey(1L)) {
                        newOccurrences.put(1L, newOccurrences.get(1L) + occurrences.get(0L));
                    } else {
                        newOccurrences.put(1L, occurrences.get(x));
                    }
                } else {
                    if (hasEvenNumberOfDigits(x)) {
                        Long l = leftSizeOfDigits(x);
                        if (newOccurrences.containsKey(l)) {
                            newOccurrences.put(l, newOccurrences.get(l) + occurrences.get(x));
                        } else {
                            newOccurrences.put(l, occurrences.get(x));
                        }
                        Long l2 = rightSizeOfDigits(x);
                        if (newOccurrences.containsKey(l2)) {
                            newOccurrences.put(l2, newOccurrences.get(l2) + occurrences.get(x));
                        } else {
                            newOccurrences.put(l2, occurrences.get(x));
                        }
                    } else {
                        Long l3 = x * 2024;
                        if (newOccurrences.containsKey(l3)) {
                            newOccurrences.put(l3, newOccurrences.get(l3) + occurrences.get(x));
                        } else {
                            newOccurrences.put(l3, occurrences.get(x));
                        }
                    }
                }
            }
            occurrences = newOccurrences;
        }
        System.out.println("Final blinks " + getTotalOccurrences(occurrences));

    }

    private static long getTotalOccurrences(Map<Long, Long> occurrences) {

        long sum = 0;
        for (Long o : occurrences.keySet()) {
            sum += occurrences.get(o);

        }

        return sum;
    }

    private static Long rightSizeOfDigits(Long x) {
        return Long.parseLong(x.toString().substring(x.toString().length() / 2));
    }

    private static Long leftSizeOfDigits(Long x) {
        return Long.parseLong(x.toString().substring(0, x.toString().length() / 2));
    }

    private static boolean hasEvenNumberOfDigits(Long x) {

        int nrDigits = 0;
        while (x > 0) {
            nrDigits++;
            x = x / 10;
        }
        return nrDigits % 2 == 0;
    }

    static class Occurrence {
        Long value;
        Long occ;

        public Occurrence(Long value, Long occ) {
            this.value = value;
            this.occ = occ;
        }

        public Long getValue() {
            return value;
        }

        public void setValue(Long value) {
            this.value = value;
        }

        public Long getOcc() {
            return occ;
        }

        public void setOcc(Long occ) {
            this.occ = occ;
        }
    }

}
