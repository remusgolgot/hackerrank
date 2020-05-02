package algorithms.linkedLists.clockwiserotateLL;

/**
 * Created by remus.golgot on 04/26/2020.
 * Rotates a Linked List clockwise by k positions
 */
public class Solution {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(6);
        head.next.next = new Node(8);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(15);
        head.next.next.next.next.next = new Node(19);
        head.next.next.next.next.next.next = new Node(23);
        printList(head);
        Node result = clockwiseRotateLL(head, 5);
        printList(result);
    }

    /* Function to print linked list */
    private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private static Node clockwiseRotateLL(Node head, int k) {

        int length = 1;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        if (k % length == 0) {
            return head;
        }
        int i = 1;
        Node current = head;
        while (i < (k % length)) {
            current = current.next;
            i++;
        }

        temp.next = head;
        head = current.next;
        current.next = null;
        return head;

    }
}
