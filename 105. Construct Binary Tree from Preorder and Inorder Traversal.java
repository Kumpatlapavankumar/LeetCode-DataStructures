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
        return construct(preorder,inorder,0,inorder.length-1);
    }
    int preindex=0;
    public TreeNode construct(int[] preorder,int[] inorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode temp=new TreeNode(preorder[preindex++]);
        int index=findindex(inorder,start,end,temp.val);
        temp.left=construct(preorder,inorder,start,index-1);
        temp.right=construct(preorder,inorder,index+1,end);
        return temp;
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
