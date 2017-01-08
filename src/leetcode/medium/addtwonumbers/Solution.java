package leetcode.medium.addtwonumbers;

/**
 * Created by remus on 1/8/2017.
 *
 *
 */
public class Solution {

    static class ListNode {

        int val;
        ListNode next;
        ListNode (int x) { val = x; }
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(7);
        ListNode e1 = new ListNode(1);
        ListNode e2 = new ListNode(2);
        ListNode e3 = new ListNode(3);
        l1.next = e1;
        e1.next = e2;
        e2.next = e3;
        e3.next = null;

        ListNode l2 = new ListNode(7);
        ListNode f1 = new ListNode(3);
        ListNode f2 = new ListNode(9);
        ListNode f3 = new ListNode(5);
        l2.next = f1;
        f1.next = f2;
        f2.next = f3;
        f3.next = null;

        ListNode aux = addTwoNumbers(l1,l2);
        while (aux != null) {
            System.out.println(aux.val);
            aux = aux.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln1 = l1, ln2 = l2, head = null, node = null;
        int carry = 0, sum = 0;
        node = new ListNode(0);
        head = node;

        while(ln1 != null || ln2 != null || carry != 0) {
            sum = (ln1 != null ? ln1.val : 0) + (ln2 != null ? ln2.val : 0) + carry;
            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
            ln1 = (ln1 != null ? ln1.next : null);
            ln2 = (ln2 != null ? ln2.next : null);
        }
        return head.next;
    }
}
