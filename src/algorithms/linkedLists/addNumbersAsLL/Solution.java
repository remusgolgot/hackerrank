package algorithms.linkedLists.addNumbersAsLL;

/**
 * Created by remus.golgot on 04/26/2020.
 * Add 2 numbers represented as Linked Lists
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

        Node a = new Node(4);
        a.next = new Node(6);
        a.next.next = new Node(8);
        a.next.next.next = new Node(7);
        a.next.next.next.next = new Node(0);
        a.next.next.next.next.next = new Node(5);
        a.next.next.next.next.next.next = new Node(1);
        printList(a);

        Node b = new Node(7);
        b.next = new Node(7);
        b.next.next = new Node(8);
        b.next.next.next = new Node(9);
        b.next.next.next.next = new Node(2);
        b.next.next.next.next.next = new Node(5);
        b.next.next.next.next.next.next = new Node(6);
        printList(b);

        Node sum = add(a, b);
        printList(sum);
    }

    private static Node add(Node a, Node b) {

        Node result = null;
        Node prev = null;
        int carry = 0;
        while (a != null && b != null) {
            Node c = new Node(a.value + b.value + carry);
            if (c.value >= 10) {
                c.value = c.value % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            if (result == null) {
                result = c;
            } else {
                prev.next = c;
            }
            prev = c;
            a = a.next;
            b = b.next;
        }
        return result;
    }
}
