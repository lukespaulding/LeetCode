package Solved_Java_Problems.easy.root_equals_sum_of_children;



//Definition for a binary tree node.
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
     }
}
class Solution {
    public boolean checkTree(TreeNode root) {
        if(root.left.val + root.right.val == root.val){
            return true;
        }
        else {
            return false;
        }
    }
}