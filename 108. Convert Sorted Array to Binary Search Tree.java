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
    public TreeNode sortedArrayToBST(int[] nums) {
        return binarytree(nums,0,nums.length-1);
    }
    public TreeNode binarytree(int[] arr,int low,int high){
        if(low>high){
            return null;
        }
        int mid=low+(high-low)/2;
        TreeNode temp=new TreeNode(arr[mid]);
        temp.left=binarytree(arr,low,mid-1);
        temp.right=binarytree(arr,mid+1,high);
        return temp;
    }
}
