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
//don't edit this code 
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int depthleft=maxDepth(root.left);
        int depthright=maxDepth(root.right);
        if(depthleft>depthright){
            return depthleft+1;
        }else{
            return depthright+1;
        }
    }
}
