package algorithms.linkedLists.convertLLToArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by remus.golgot on 04/26/2020.
 * Converts a given Linked List to an array
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

    /* Function to print linked list */
    private static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toString() + " ");
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
        Integer[] arr = convertLLToArray(head);
        printArray(arr);
    }

    private static Integer[] convertLLToArray(Node head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.value);
            head = head.next;
        }
        Integer[] myArray = new Integer[list.size()];
        return list.toArray(myArray);
    }

}
