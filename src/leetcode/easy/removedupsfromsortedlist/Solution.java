package leetcode.easy.removedupsfromsortedlist;

/**
 * Created by remus.golgot on 1/30/2017.
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class Solution {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        deleteDuplicates(new ListNode(1));
    }

    private static ListNode deleteDuplicates(ListNode head) {

        ListNode res = head;

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return res;

    }
}

