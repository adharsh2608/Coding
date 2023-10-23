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
    boolean last=false;
    public boolean isSameTree(TreeNode p, TreeNode q) {
            Checker( p,q);
            if(flag==true&&last==true)
                return true;
            else
                return false;
    }
    public void Checker(TreeNode p, TreeNode q)
    {
        if(p==null &&q==null)
        {
                last=true;
        }
        else if(p==null||q==null)
        {
            flag=false;
            return;
        }
        else if(p.val!=q.val)
        {
            flag=false;
            return;
        }
        
        else
        {
        Checker(p.left,q.left);
        Checker(p.right,q.right);
        }
    }
}