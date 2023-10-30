/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int target;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        if (root == null) {
            return false;
        }
        return checker(root, 0);
    }

    public boolean checker(TreeNode root, int temp) {
        if (root == null) {
            return false;
        }
        temp += root.val;
        if (root.right == null && root.left == null) {
            return temp == target;
        }
        boolean leftResult = checker(root.left, temp);
        boolean rightResult = checker(root.right, temp);
        return leftResult || rightResult;
    }
}
