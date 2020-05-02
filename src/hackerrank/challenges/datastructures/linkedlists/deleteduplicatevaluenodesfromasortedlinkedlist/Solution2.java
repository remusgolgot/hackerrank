package hackerrank.challenges.datastructures.linkedlists.deleteduplicatevaluenodesfromasortedlinkedlist;

/**
 * https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
 * Created by remus.golgot on 04/26/2020.
 */
public class Solution2 {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
    /* Function to print linked list */
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(4);
        head.next.next = new Node(4);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next.next.next = new Node(15);
        head.next.next.next.next.next.next.next.next.next = new Node(19);
        head.next.next.next.next.next.next.next.next.next.next = new Node(19);
        head.next.next.next.next.next.next.next.next.next.next.next = new Node(23);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new Node(23);
        printList(head);
        Node result = deleteDups(head);
        printList(result);
    }

    private static Node deleteDups(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.value == temp.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;

    }

}
