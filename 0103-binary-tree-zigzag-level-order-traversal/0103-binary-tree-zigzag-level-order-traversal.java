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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return ans;
        q.offer(root);
        int levels=0;
        while(!q.isEmpty())
        {
            int sz=q.size();
            ArrayList<Integer> level=new ArrayList<>();
            
            for(int i=0;i<sz;i++)
            {
                if(q.peek().left!=null)
                q.add(q.peek().left);
                if(q.peek().right!=null)
                q.add(q.peek().right);
                if(levels%2==0)
                level.add(q.remove().val);
                else
                level.add(0,q.remove().val);
            }
            levels++;
            ans.add(level);
        }
        return ans;
    }
}