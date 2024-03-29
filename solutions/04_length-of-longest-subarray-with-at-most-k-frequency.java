// solutions/04_length-of-longest-subarray-with-at-most-k-frequency.java
/**
 * Date  : 28-Mar-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  Length of Longest Subarray With at Most K Frequency
 * Difficulty:  🟡Medium
 *
 * Leetcode 2958 : https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency
 * Lintcode 0000 :  —
 */

class Solution {
  public int maxSubarrayLength(int[] nums, int k) {

    Map<Integer, Integer> count = new HashMap<>();

    // window pointer
    int left = 0, right = 0;
    int maxLen = 0;

    // iterate the nums
    for (; right < nums.length; right++) {
      // count the number of digits encountered
      count.put(nums[right], count.getOrDefault(nums[right], 0) + 1);

      // if the number digits is > k in current window
      // remove element from the left
      while (count.get(nums[right]) > k) {
        count.put(nums[left], count.get(nums[left]) - 1);
        left++;
      }
      // find the max window till
      maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
  }
}
