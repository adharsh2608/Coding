class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        if (preorder == null || postorder == null || preorder.length == 0 || postorder.length == 0) {
            return null;
        }

        // The first element in preorder is the root
        TreeNode root = new TreeNode(preorder[0]);

        // If there's only one element, return the root
        if (preorder.length == 1) {
            return root;
        }

        // Find the index of the root in the postorder array
        int postIndex = 0;
        for (int i = 0; i < postorder.length; i++) {
            if (postorder[i] == preorder[1]) {
                postIndex = i;
                break;
            }
        }

        // Construct the left subtree
        int[] leftPre = Arrays.copyOfRange(preorder, 1, postIndex + 2);
        int[] leftPost = Arrays.copyOfRange(postorder, 0, postIndex + 1);
        root.left = constructFromPrePost(leftPre, leftPost);

        // Construct the right subtree
        int[] rightPre = Arrays.copyOfRange(preorder, postIndex + 2, preorder.length);
        int[] rightPost = Arrays.copyOfRange(postorder, postIndex + 1, postorder.length - 1);
        root.right = constructFromPrePost(rightPre, rightPost);

        return root;
    }
}