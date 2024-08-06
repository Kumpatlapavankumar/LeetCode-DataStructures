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
    public static int countnodes(TreeNode root){
        if (root == null) {
            return 0;
        }
            return 1 + countnodes(root.left) + countnodes(root.right);
    }
    public static int inorder(int[] arr, int index, TreeNode root) {
        if (root == null) {
            return index;
        }
        index = inorder(arr, index, root.left);
     // Prevent ArrayIndexOutOfBoundsException
        arr[index] = root.val;
        index++;
        index = inorder(arr, index, root.right);
        return index;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list=new ArrayList<>();
        int root1n=countnodes(root1);
        int[] r1=new int[root1n];
        int root2n=countnodes(root2);
        int[] r2=new int[root2n];
        inorder(r1,0,root1);
        inorder(r2,0,root2);
        int i=0;
        int j=0;
        while(i<r1.length && j<r2.length){
            if(r1[i]<r2[j]){
                list.add(r1[i]);
                i++;
            }else if(r1[i]>r2[j]){
                list.add(r2[j]);
                j++;
            }else{
                list.add(r1[i]);
                list.add(r2[j]);
                i++;
                j++;
            }
        }
        while(i<r1.length){
            list.add(r1[i]);
            i++;
        }
        while(j<r2.length){
            list.add(r2[j]);
            j++;
        }
        return list;
    }
}
