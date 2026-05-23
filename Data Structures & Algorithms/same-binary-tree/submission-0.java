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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)return true;
         if(p==null || q==null)return false;
        TreeNode temp = p;
        TreeNode temp2 = q;
        if(temp.val!=temp2.val){
            return false;
        }
        boolean lefti = isSameTree(p.left,q.left);
        if(lefti==false)return false;
        boolean righti= isSameTree(p.right,q.right);
        if(righti==false)return false;
        return true;
    }
}
