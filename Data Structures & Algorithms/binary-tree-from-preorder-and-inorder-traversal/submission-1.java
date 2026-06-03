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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
     TreeNode ans=   buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
     return ans;
    }
    TreeNode buildtree(int[] preorder , int prest , int prend,int[] inorder, int ins,int ine,Map<Integer,Integer> mp){
        if(prest>prend || ins>ine)return null;
        TreeNode root = new TreeNode(preorder[prest]);
        int inroot = mp.get(root.val);
        int numsleft = inroot-ins;
        root.left = buildtree(preorder,prest+1,prest+numsleft,inorder,ins,inroot-1,mp);
        root.right = buildtree(preorder,prest+numsleft+1,prend,inorder,inroot+1,ine,mp);
        return root;
    }
}
