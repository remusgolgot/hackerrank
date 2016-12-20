package leetcode.easy.removenthelementfromlistend;

/**
 * Created by remus.golgot on 12/20/2016.
 *
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 */
public class Solution {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;

        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        if (first == null) {
            head = head.next;
            return head;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        sixth.next = null;
        fifth.next = sixth;
        fourth.next = fifth;
        third.next = fourth;
        second.next = third;
        head.next = second;

        ListNode head1 = head;
        while (head1 != null) {
            System.out.print(head1.val);
            head1 = head1.next;
        }
        System.out.println();
        ListNode result = removeNthFromEnd(head, 4);
        while (result != null) {
            System.out.print(result.val);
            result = result.next;
        }
    }
}