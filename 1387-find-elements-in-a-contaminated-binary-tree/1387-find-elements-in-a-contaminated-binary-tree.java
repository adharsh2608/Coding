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
class FindElements {
    private TreeNode root;
    private Set<Integer> values;

    public FindElements(TreeNode root) {
        this.root = root;
        this.values = new HashSet<>();
        recover(root, 0);
    }

    private void recover(TreeNode node, int val) {
        if (node == null) return;
        node.val = val;
        values.add(val);
        recover(node.left, 2 * val + 1);
        recover(node.right, 2 * val + 2);
    }

    public boolean find(int target) {
        return values.contains(target);
    }
}
/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */