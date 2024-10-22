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
    public long kthLargestLevelSum(TreeNode root, int k) {
      if (root == null) return -1;
      
      PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
      Queue<TreeNode> queue = new LinkedList<>();
      queue.offer(root);

      while (!queue.isEmpty()) {
        int levelSize = queue.size();
        long levelSum = 0;
        for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelSum += node.val;
                
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            maxHeap.offer(levelSum);
        }
        
        if (maxHeap.size() < k) return -1;
        
        long kthLargestSum = 0;
        for (int i = 0; i < k; i++) {
            kthLargestSum = maxHeap.poll();
        }
        
        return kthLargestSum;
    }
}