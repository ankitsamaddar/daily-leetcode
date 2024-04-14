// 04-2024(April)/14_sum-of-left-leaves.java
/**
 * Date  : 14-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  404. Sum of Left Leaves
 * Difficulty:  🟢Easy
 *
 * Leetcode 0404 :  https://leetcode.com/problems/sum-of-left-leaves
 * Lintcode 1254 :  https://www.lintcode.com/problem/1254
 */

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
  public int sumOfLeftLeaves(TreeNode root) {
    // empty tree
    if (root == null) {
      return 0;
    }

    int sum = 0; // initialize current sum

    // add left to sum if it is leaf node
    if (root.left != null &&
        // no child exist for the left node
        root.left.left == null && root.left.right == null) {
      sum = root.left.val;
    }

    // recursively call function for left and right subtree
    return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
  }
}
