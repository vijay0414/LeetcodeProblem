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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<>();
         List<List<Integer>> list = new ArrayList<>();

         Queue<TreeNode> q = new LinkedList<>();
         q.add(root);

         while(!q.isEmpty()){
            int s = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i < s; i++){
                TreeNode t = q.poll();
                l.add(t.val);
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
            }
           list.add(l);
         }
         Collections.reverse(list);
         return list;
    }
}