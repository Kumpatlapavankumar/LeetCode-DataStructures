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
    int preIdx, postIdx;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
         TreeNode root=new TreeNode(preorder[preIdx]);
        preIdx++;
        
        // Construct the left subtree if the current node is not the postorder node
        if(root.val!=postorder[postIdx]){
            root.left=constructFromPrePost(preorder,postorder);
        }

        // Construct the right subtree if the current node is not the postorder node
        if(root.val!=postorder[postIdx]){
            root.right=constructFromPrePost(preorder,postorder);
        }

        // Move to the next postorder index
        postIdx++;

        return root;
    }
}
