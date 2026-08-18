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
    static int sum;
    static int num;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        num = 0;
        sumnum(root);
        return sum;
    }

    public void sumnum(TreeNode root){
        if(root == null) return;

        num = num * 10 + root.val;

        if(root.left == null && root.right == null){
            sum += num;
        }

        if(root.left != null){
            sumnum(root.left);
        }
        if(root.right != null){
            sumnum(root.right);
        }
        num = num/10;
    }
}