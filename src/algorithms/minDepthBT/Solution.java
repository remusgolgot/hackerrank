package algorithms.minDepthBT;

/**
 * Created by remus.golgot on 04/26/2020.
 * Returns the minimum depth in a binary tree
 */
public class Solution {

    public static void main(String[] args) {
	    /* Construct below tree
		          1
		        /   \
		       /     \
		      2       3
		     / \     / \
		    4   5   6   7
	    */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(minDepth(root));
    }

    private static int minDepth(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);
    }

    // Data structure to store a Binary Tree node
    static class Node {
        int data;
        Node left = null, right = null;

        Node(int data) {
            this.data = data;
        }
    }

}
