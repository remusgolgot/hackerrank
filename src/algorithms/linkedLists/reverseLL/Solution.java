package algorithms.linkedLists.reverseLL;

/**
 * Created by remus.golgot on 04/26/2020.
 * Reverses a given Linked List
 */
public class Solution {

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
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

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(6);
        head.next.next = new Node(8);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(15);
        head.next.next.next.next.next = new Node(19);
        head.next.next.next.next.next.next = new Node(23);
        printList(head);
        Node result = reverse(head);
        printList(result);
    }

    /* Function to reverse the linked list */
    private static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
