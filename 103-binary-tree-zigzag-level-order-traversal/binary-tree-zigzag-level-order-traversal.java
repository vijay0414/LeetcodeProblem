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
        if(root == null) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        System.out.println(list.size());

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0 ; i < s;i++){
                TreeNode t = q.poll();
                l.add(t.val);
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
            }
            if(list.size() % 2 != 0) list.add(rev(l));
            else list.add(l);
        }
        return list;
    }

    public List<Integer> rev(List<Integer> l){
        int i = 0 , j = l.size() -1 ;
        while(i < j){
            int t = l.get(i);
            int m = l.get(j);
            int temp = t;
            t = m;
            m = temp;
            l.set(i,t);
            l.set(j,m);
            i++;
            j--;
        }
        return l;
    }
}