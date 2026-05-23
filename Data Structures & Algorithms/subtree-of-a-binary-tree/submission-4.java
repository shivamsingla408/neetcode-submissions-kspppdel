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
  
    boolean check(TreeNode temp,TreeNode subRoot){
      if(temp==null && subRoot==null)return true;
              if(temp==null || subRoot==null)return false;
              if(temp.val!=subRoot.val)return false;
              boolean lefti = check(temp.left,subRoot.left);
              if(lefti == false)return false;
              boolean righti = check(temp.right,subRoot.right);
              if(righti==false)return false;
              return true;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
          if (root == null && subRoot == null) return true;
          if (root == null || subRoot == null) return false;
             if(check(root,subRoot))return true;
         return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
