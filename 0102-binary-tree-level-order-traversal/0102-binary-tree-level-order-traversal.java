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
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();
        
        if(root==null)
        return ans;
        q.offer(root);
        while(!q.isEmpty())
        {
            int sz=q.size();
            ArrayList<Integer> levels=new ArrayList<>();
            for(int i=0;i<sz;i++)
            {
                if(q.peek().left!=null)
                q.add(q.peek().left);
                if(q.peek().right!=null)
                q.add(q.peek().right);
                levels.add(q.remove().val);
            }
            ans.add(levels);
            
        }
        return ans;
    }
}