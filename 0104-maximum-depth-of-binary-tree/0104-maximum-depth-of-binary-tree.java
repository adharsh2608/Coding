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
int tlen=0;
    public int maxDepth(TreeNode root) {
        int length=0;
        
        if(root==null)
            return 0;
        checker(root,length);
        
        return tlen;
    }
    public void checker(TreeNode next,int length)
    {
        if(next==null)
        return;
        if(next.left==null&&next.right==null)
        {   
            length++;
            if(length>tlen)
                tlen=length;
            return;
        }
        length++;
        checker(next.left,length);
        checker(next.right,length);
    }
}