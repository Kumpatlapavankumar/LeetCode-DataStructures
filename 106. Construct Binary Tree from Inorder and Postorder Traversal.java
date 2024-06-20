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
    private int postindex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postindex=postorder.length-1;
        return construct(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode construct(int[] inorder,int[] postorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postindex--]);
        int index=findindex(inorder,start,end,root.val);
        root.right=construct(inorder,postorder,index+1,end);
        root.left=construct(inorder,postorder,start,index-1);
        return root;
    }
    public int findindex(int[] inorder,int start,int end,int value){
        for(int i=start;i<=end;i++){
            if(inorder[i]==value){
                return i;
            }
        }
        return -1;
    }
}
