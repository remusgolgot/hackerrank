package leetcode.medium.levelOrderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by remus.golgot on 04/26/2020.
 * Performs a Level Order Traversal for a given tree
 */
public class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> toVisit = new ArrayList<>();

        if (root == null) {
            return new ArrayList<>();
        }
        Integer[] rootArr = new Integer[]{root.val};
        result.add(Arrays.asList(rootArr));
        toVisit.add(root);
        while (!toVisit.isEmpty()) {

            List<TreeNode> accList = new ArrayList<>();
            for (TreeNode n : toVisit) {
                if (n.left != null) {
                    accList.add(n.left);
                }
                if (n.right != null) {
                    accList.add(n.right);
                }

            }
            if (accList.size() > 0) {
                result.add(accList.stream().map(el -> el.val).collect(Collectors.toList()));

            }
            toVisit = accList;

        }
        return result;
    }

    public static void main(String[] args) {
        // Let us create the tree as shown in above diagram
        TreeNode tree = new TreeNode(10);
        tree.left = new TreeNode(12);
        tree.right = new TreeNode(15);
        tree.left.left = new TreeNode(25);
        tree.left.right = new TreeNode(30);
        tree.right.left = new TreeNode(36);
        tree.left.left.left = new TreeNode(4);
        tree.right.left.left = new TreeNode(79);
        List<List<Integer>> res = levelOrder(tree);
        for (List<Integer> l : res) {
            for (Integer i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}