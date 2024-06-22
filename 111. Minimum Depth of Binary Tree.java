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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int depthleft=minDepth(root.left);
        int depthright=minDepth(root.right);
        int arr=Math.min(depthleft,depthright)+1;
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null){
            return 1+depthright;
        }
        if(root.right==null){
            return 1+depthleft;
        }
        return arr;
    }
}
