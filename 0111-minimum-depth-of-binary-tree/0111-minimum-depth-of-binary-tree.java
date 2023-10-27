class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        ArrayList<Integer> arr = new ArrayList<>();
        Checker(root, 1, arr);
        return Collections.min(arr);
    }

    public void Checker(TreeNode root, int temp, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            arr.add(temp); 
            return;
        }

        if (root.left != null) {
            Checker(root.left, temp + 1, arr); 
        }
        if (root.right != null) {
            Checker(root.right, temp + 1, arr); 
        }
    }
}
