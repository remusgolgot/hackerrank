package leetcode.easy.mergetwosortedlists;

/**
 * Created by remus on 1/8/2017.
 * <p>
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class Solution {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode node = new ListNode(0);
        head = node;

        while (l1 != null || l2 != null) {
            if (l1 == null || (l2 != null && l2.val <= l1.val)) {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
                node = node.next;
            } else if (l2 == null || l1.val <= l2.val) {
                node.next = new ListNode(l1.val);
                l1 = l1.next;
                node = node.next;
            }

        }
        return head.next;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(0);
        ListNode e1 = new ListNode(2);
        ListNode e2 = new ListNode(7);
        ListNode e3 = new ListNode(11);
        l1.next = e1;
        e1.next = e2;
        e2.next = e3;
        e3.next = null;

        ListNode l2 = new ListNode(1);
        ListNode f1 = new ListNode(4);
        ListNode f2 = new ListNode(5);
        ListNode f3 = new ListNode(8);
        l2.next = f1;
        f1.next = f2;
        f2.next = f3;
        f3.next = null;

        ListNode aux = mergeTwoLists(l1,l2);
        while (aux != null) {
            System.out.print(aux.val + " ");
            aux = aux.next;
        }
    }
}
