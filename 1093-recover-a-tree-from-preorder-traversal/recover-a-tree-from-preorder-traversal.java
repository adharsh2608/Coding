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
    private int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        return helper(traversal, 0);
    }

    private TreeNode helper(String traversal, int depth) {
        if (index >= traversal.length()) {
            return null;
        }

        int currentDepth = 0;
        while (index + currentDepth < traversal.length() && traversal.charAt(index + currentDepth) == '-') {
            currentDepth++;
        }

        if (currentDepth != depth) {
            return null;
        }

        index += currentDepth;

        int value = 0;
        while (index < traversal.length() && Character.isDigit(traversal.charAt(index))) {
            value = value * 10 + (traversal.charAt(index) - '0');
            index++;
        }

        TreeNode node = new TreeNode(value);
        node.left = helper(traversal, depth + 1);
        node.right = helper(traversal, depth + 1);

        return node;
    }
}