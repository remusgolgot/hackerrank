package adventofcode.aoc2021.day6;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {

        String t = "3,4,3,1,2";
        String s = "3,5,4,1,2,1,5,5,1,1,1,1,4,1,4,5,4,5,1,3,1,1,1,4,1,1,3,1,1,5,3,1,1,3,1,3,1,1,1,4,1,2,5,3,1,4,2,3,1,1,2,1,1,1,4,1,1,1,1,2,1,1,1,3,1,1,4,1,4,1,5,1,4,2,1,1,5,4,4,4,1,4,1,1,1,1,3,1,5,1,4,5,3,1,4,1,5,2,2,5,1,3,2,2,5,4,2,3,4,1,2,1,1,2,1,1,5,4,1,1,1,1,3,1,5,4,1,5,1,1,4,3,4,3,1,5,1,1,2,1,1,5,3,1,1,1,1,1,5,1,1,1,1,1,1,1,2,2,5,5,1,2,1,2,1,1,5,1,3,1,5,2,1,4,1,5,3,1,1,1,2,1,3,1,4,4,1,1,5,1,1,4,1,4,2,3,5,2,5,1,3,1,2,1,4,1,1,1,1,2,1,4,1,3,4,1,1,1,1,1,1,1,2,1,5,1,1,1,1,2,3,1,1,2,3,1,1,3,1,1,3,1,3,1,3,3,1,1,2,1,3,2,3,1,1,3,5,1,1,5,5,1,2,1,2,2,1,1,1,5,3,1,1,3,5,1,3,1,5,3,4,2,3,2,1,3,1,1,3,4,2,1,1,3,1,1,1,1,1,1";

        String[] s1 = t.split(",");

        List<Integer> nrs = Arrays.stream(s1).map(Integer::parseInt).collect(Collectors.toList());

        long ll = 0;
        for (int i = 0; i < nrs.size(); i++) {
            ll++;
            int k = (18 - nrs.get(i)) / 7;
            ll += Math.pow(2, k+1);
            System.out.println(ll);
        }
        System.out.println(ll);

    }

//    public static void main(String[] args) {
//
//        String t = "3,4,3,1,2";
//        String s = "3,5,4,1,2,1,5,5,1,1,1,1,4,1,4,5,4,5,1,3,1,1,1,4,1,1,3,1,1,5,3,1,1,3,1,3,1,1,1,4,1,2,5,3,1,4,2,3,1,1,2,1,1,1,4,1,1,1,1,2,1,1,1,3,1,1,4,1,4,1,5,1,4,2,1,1,5,4,4,4,1,4,1,1,1,1,3,1,5,1,4,5,3,1,4,1,5,2,2,5,1,3,2,2,5,4,2,3,4,1,2,1,1,2,1,1,5,4,1,1,1,1,3,1,5,4,1,5,1,1,4,3,4,3,1,5,1,1,2,1,1,5,3,1,1,1,1,1,5,1,1,1,1,1,1,1,2,2,5,5,1,2,1,2,1,1,5,1,3,1,5,2,1,4,1,5,3,1,1,1,2,1,3,1,4,4,1,1,5,1,1,4,1,4,2,3,5,2,5,1,3,1,2,1,4,1,1,1,1,2,1,4,1,3,4,1,1,1,1,1,1,1,2,1,5,1,1,1,1,2,3,1,1,2,3,1,1,3,1,1,3,1,3,1,3,3,1,1,2,1,3,2,3,1,1,3,5,1,1,5,5,1,2,1,2,2,1,1,1,5,3,1,1,3,5,1,3,1,5,3,4,2,3,2,1,3,1,1,3,4,2,1,1,3,1,1,1,1,1,1";
//
//        String[] s1 = t.split(",");
//
//        List<Integer> nrs = Arrays.stream(s1).map(Integer::parseInt).collect(Collectors.toList());
//        long l = 0;
//        int magic = 18;
//        Stack<Integer> stack = new Stack<>();
//        stack.addAll(nrs);
////        for (int i = 0; i < nrs.size(); i++) {
////            stack.push(nrs.get(i) + 7);
////        }
//        long kk=0;
//        while (!stack.isEmpty()) {
//            int i = stack.pop();
//            int y = i;
//            System.out.println(i);
//            l += 1;
//            boolean b = false;
//            while (i < magic) {
//                if (!b && kk>nrs.size()) {
////                    System.out.println("PUSH " + (i+1) +  " for " + y);
//                    System.out.println(i+1);
//                    stack.push(i + 1);
//                } else {
////                    System.out.println("PUSH " + (i) +  " for " + y);
//                    System.out.println(i);
//                    stack.push(i);
//                }
//                b = true;
//            }
//            kk++;
//        }
//        System.out.println(l + nrs.size());
//
//    }
}
