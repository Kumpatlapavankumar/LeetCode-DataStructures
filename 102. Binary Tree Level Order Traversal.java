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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        levelorder(root,levels);
        return levels;
    }
    public void levelorder(TreeNode root,List<List<Integer>> levels){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(q.isEmpty()==false){
            levels.add(new ArrayList<Integer>());
            int count=q.size();
            for(int i=0;i<count;i++){
                TreeNode temp=q.poll();
                levels.get(level).add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            level++;
        }
    }
}
