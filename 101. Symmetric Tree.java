
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return mirror(root.left,root.right);
    }
    public boolean mirror(TreeNode left,TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        return left.val==right.val && mirror(left.left,right.right) && mirror(left.right,right.left);
    }
}
