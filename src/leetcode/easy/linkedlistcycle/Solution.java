package leetcode.easy.linkedlistcycle;

/**
 * Created by remus on 2/4/2025.
 * <p>
 * https://leetcode.com/problems/linked-list-cycle
 */
public class Solution {

    static boolean hasCycle(ListNode head) {
        ListNode r = head;
        ListNode t = head;

        if (head == null || head.next == null) {
            return false;
        }

        while (r != null) {
            t = t.next;
            r = r.next;
            if (r != null) {
                r = r.next;
            }
            if (t == r) {
                return true;
            }
        }
        return false;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
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
        l2.next = f1;
        f1.next = f2;
        f2.next = null;

        ListNode l3 = new ListNode(7);
        ListNode g1 = new ListNode(3);
        ListNode g2 = new ListNode(9);
        l3.next = g1;
        g1.next = g2;
        g2.next = g1;

        System.out.println(hasCycle(l1));   // false
        System.out.println(hasCycle(l2));   // false
        System.out.println(hasCycle(l3));   // true
    }
}
