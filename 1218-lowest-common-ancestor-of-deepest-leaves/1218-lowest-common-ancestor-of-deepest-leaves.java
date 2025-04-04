class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
   
    private class NodeDepth {
        TreeNode node;
        int depth;
        NodeDepth(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return findLCA(root).node;
    }
    
    private NodeDepth findLCA(TreeNode root) {
        
        if (root == null) {
            return new NodeDepth(null, 0);
        }
        
        
        NodeDepth left = findLCA(root.left);
        NodeDepth right = findLCA(root.right);
        
        
        if (left.depth == right.depth) {
            return new NodeDepth(root, left.depth + 1);
        }
        
        if (left.depth > right.depth) {
            return new NodeDepth(left.node, left.depth + 1);
        } else {
            return new NodeDepth(right.node, right.depth + 1);
        }
    }
}