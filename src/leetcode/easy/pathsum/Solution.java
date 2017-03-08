package leetcode.easy.pathsum;

/**
 * Created by remus.golgot on 3/8/2017.
 * <p>
 * https://leetcode.com/problems/path-sum
 */
public class Solution {

    private boolean hasPathSum(TreeNode root, int sum) {

        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null) {
            return sum == root.val;
        } else return hasPathSumRec(root, sum);


    }

    private boolean hasPathSumRec(TreeNode root, int sum) {
        if (root == null) {
            return sum == 0;
        }

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
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
