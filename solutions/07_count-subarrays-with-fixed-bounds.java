// solutions/07_count-subarrays-with-fixed-bounds.java
/**
 * Date  : 31-Mar-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  2444. Count Subarrays With Fixed Bounds
 * Difficulty:  🔴Hard
 *
 * Leetcode 2444 :  https://leetcode.com/problems/count-subarrays-with-fixed-bounds
 * Lintcode 0000 :  —
 */

import java.util.*;

class Solution {
  public long countSubarrays(int[] nums, int minK, int maxK) {
    long count    = 0;
    int minKIndex = -1, maxKIndex = -1; // -1 no valid position
    // initialize the left and right pointers
    int left = -1, right = 0;

    for (; right < nums.length; right++) {
      // reset pointers if element outside valid window
      if (nums[right] < minK || nums[right] > maxK) {
        minKIndex = right;
        maxKIndex = right;
        left      = right;
      }
      // update min index
      if (nums[right] == minK) {
        minKIndex = right;
      }
      // update max index
      if (nums[right] == maxK) {
        maxKIndex = right;
      }
      // left is the start of the valid subarray window
      // add no. of valid subarray till current element to the count
      count += Math.max(0, Math.min(minKIndex, maxKIndex) - left);
    }
    // return count
    return count;
  }
}
