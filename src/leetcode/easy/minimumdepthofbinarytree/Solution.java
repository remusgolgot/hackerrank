package leetcode.easy.minimumdepthofbinarytree;

/**
 * Created by remus.golgot on 3/8/2017.
 * <p>
 * https://leetcode.com/problems/minimum-depth-of-binary-tree
 */
public class Solution {


    private int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return 1 + minDepth(root.right);
        if (root.right == null) return 1 + minDepth(root.left);

        return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));

    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
