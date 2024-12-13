package adventofcode.aoc2024.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://adventofcode.com/2024/day/11
 */
public class Main {


    public static void main(String[] args) {
        String t = "125 17";
        String s = "0 5601550 3914 852 50706 68 6 645371";


        String[] ss = s.split(" ");
        List<String> numbersAsString = Arrays.asList(ss);
        List<Long> numbers = numbersAsString.stream().map(Long::parseLong).collect(Collectors.toList());

        for (int i = 0; i < 25; i++) {
            System.out.println("blinks " + i + " " + numbers.size());
            List<Long> newList = new ArrayList<>();
            for (Long x : numbers) {
                if (x == 0) {
                    newList.add(1L);
                } else {
                    if (hasEvenNumberOfDigits(x)) {
                        newList.add(leftSizeOfDigits(x));
                        newList.add(rightSizeOfDigits(x));
                    } else {
                        newList.add(x * 2024);
                    }
                }
            }
            numbers.clear();
            numbers.addAll(newList);
        }
        System.out.println("Final blinks " + numbers.size());

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


}
