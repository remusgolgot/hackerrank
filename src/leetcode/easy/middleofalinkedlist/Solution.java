package leetcode.easy.middleofalinkedlist;

/**
 * Created by remus on 2/4/2025.
 * <p>
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class Solution {
    
    static ListNode middleNode(ListNode head) {
        ListNode h1 = head;
        ListNode h2 = head;

        while (h2 != null) {

            h2 = h2.next;
            if (h2 != null) {
                h2 = h2.next;
                h1 = h1.next;
            }
        }

        return h1;
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

        ListNode res1 = middleNode(l1);
        ListNode res2 = middleNode(l2);

        System.out.println(res1.val);   // 2
        System.out.println(res2.val);   // 3
    }
}
