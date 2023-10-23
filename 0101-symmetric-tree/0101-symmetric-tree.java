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
    boolean flag=true;
    boolean end=false;
    public boolean isSymmetric(TreeNode root) {

        Checker(root,root);
        if(flag==true&&end==true)
            return true;
        else
            return false;
    }
    public void Checker(TreeNode left,TreeNode right)
    {
        if(left==null&&right==null)
        {   end=true;
            return;
        }
        if(left==null||right==null)
        {
            flag=false;
            return;
        }
        else if(!(left.val==right.val))
        {
            flag=false;
            return;
        }
        else
        {
            Checker(left.left,right.right);
            Checker(left.right,right.left);
          
        }
    }
}