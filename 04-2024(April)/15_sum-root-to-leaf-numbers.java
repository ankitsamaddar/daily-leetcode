// 04-2024(April)/15_sum-root-to-leaf-numbers.java
/**
 * Date  : 15-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  129. Sum Root to Leaf Numbers
 * Difficulty:  🟡Medium
 *
 * Leetcode 0129 :  https://leetcode.com/problems/sum-root-to-leaf-numbers
 * Lintcode 1353 :  https://www.lintcode.com/problem/1353
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
  public int sumNumbers(TreeNode root) {
    dfs(root, 0);
    return totalSum;
  }

  int totalSum = 0;

  // DFS traversal of the tree
  void dfs(TreeNode node, int curNumber) {
    if (node != null) {
      // multiply by 10 to shift the digits to left to make space for current node
      // append the current node value
      curNumber = curNumber * 10 + node.val;

      // if current node is leaf node add curNumber to totalSum
      if (node.left == null && node.right == null) {
        totalSum += curNumber;
      }

      // Recurse to left and right subtree
      dfs(node.left, curNumber);
      dfs(node.right, curNumber);
    }
  }
}
