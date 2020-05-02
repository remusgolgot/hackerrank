package algorithms.linkedLists.binaryTreeToDLL;

/**
 * https://www.geeksforgeeks.org/convert-given-binary-tree-doubly-linked-list-set-3/
 * Created by remus.golgot on 04/26/2020.
 */
public class SolutionRec {
    // A binary tree node has data, left pointers and right pointers
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Tree {
        // tree root
        Node root;

        // head --> Pointer to head node of created doubly linked list
        Node head;

        // Initialize previously visited node as NULL. This is
        // static so that the same value is accessible in all recursive calls
        Node prev = null;

        // A simple recursive function to convert a given Binary tree
        // to Doubly Linked List
        // root --> Root of Binary Tree
        void BinaryTree2DoubleLinkedList(Node root) {
            // Base case
            if (root == null)
                return;

            // Recursively convert left subtree
            BinaryTree2DoubleLinkedList(root.left);

            // Now convert this node
            if (prev == null) {
                head = root;
            }
            else {
                root.left = prev;
                prev.right = root;
            }
            prev = root;

            // Finally convert right subtree
            BinaryTree2DoubleLinkedList(root.right);
        }

        /* Function to print nodes in a given doubly linked list */
        void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.right;
            }
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        // Let us create the tree as shown in above diagram
        Tree tree = new Tree();
        tree.root = new Node(10);
        tree.root.left = new Node(7);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(9);
        tree.root.right.left = new Node(13);

        // convert to DLL
        tree.BinaryTree2DoubleLinkedList(tree.root);

        // Print the converted List
        tree.printList(tree.head);

    }
}
