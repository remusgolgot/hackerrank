package algorithms.binarySearchWithIntervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remus.golgot on 1/27/2017.
 *
 *
 */
public class Solution {

    public static void main(String[] args) {

        List<InternalSpan> list = new ArrayList<>();
        list.add(new InternalSpan(0, 3));
        list.add(new InternalSpan(4, 7));
        list.add(new InternalSpan(9, 12));
        list.add(new InternalSpan(14, 17));
        list.add(new InternalSpan(20, 30));
        list.add(new InternalSpan(33, 42));
        list.add(new InternalSpan(45, 48));

        System.out.println(getElementWithSBinarySearch(list, 43, 0, list.size() - 1));
        System.out.println(getElementWithSBinarySearch(list, 4, 0, list.size() - 1));
        System.out.println(getElementWithSBinarySearch(list, 5, 0, list.size() - 1));
        System.out.println(getElementWithSBinarySearch(list, 7, 0, list.size() - 1));
        System.out.println(getElementWithSBinarySearch(list, 15, 0, list.size() - 1));
        System.out.println(getElementWithSBinarySearch(list, 1, 0, list.size() - 1));
        System.out.println(getElementWithSBinarySearch(list, 50, 0, list.size() - 1));

    }

    private static InternalSpan getElementWithSBinarySearch(List<InternalSpan> list, int offset, int left, int right) {
        if (left > right) return null;

        int middle = (left + right) / 2;

        if (list.get(middle).getStart() <= offset && list.get(middle).getEnd() > offset) {
            return list.get(middle);
        }

        if (list.get(middle).getEnd() >= offset) {
            return getElementWithSBinarySearch(list, offset, left, middle - 1);
        } else {
            return getElementWithSBinarySearch(list, offset, middle + 1, right);
        }

    }

    private static InternalSpan getInternalSpanWithOffsetRecursive(List<InternalSpan> list, int offset, int left, int right) {

        if (left <= right && list.get(left).getStart() <= offset && list.get(left).getEnd() > offset)
            return list.get(left);
        if (left <= right && list.get(left).getEnd() < offset)
            return getInternalSpanWithOffsetRecursive(list, offset, left + 1, right);
        if (left <= right && list.get(right).getStart() < offset)
            return getInternalSpanWithOffsetRecursive(list, offset, left, right - 1);
        return null;
    }

    private static InternalSpan getInternalSpanWithOffset(List<InternalSpan> list, int offset) {


        for (InternalSpan internalSpan : list) {
            if (internalSpan.getStart() <= offset && internalSpan.getEnd() > offset)
                return internalSpan;
        }

        return null;

    }

    private static class InternalSpan {

        InternalSpan(int s, int e) {
            start = s;
            end = e;
        }

        int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        int start;

        int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        int end;


    }
}
