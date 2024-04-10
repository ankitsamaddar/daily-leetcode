// solutions/05_count-subarrays-where-max-element-appears-at-least-k-times.java
/**
 * Date  : 29-Mar-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  Count Subarrays Where Max Element Appears at Least K Times
 * Difficulty:  🟡Medium
 *
 * Leetcode 2962 :
 * https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times
 * Lintcode 0000 :  —
 */

class Solution {
  public long countSubarrays(int[] nums, int k) {
    // get the max element in nums
    // final int maxNum = Arrays.stream(nums).max().getAsInt();
    int maxNum = 0;
    for (int n : nums) maxNum = Math.max(maxNum, n);
    // window pointer
    int left = 0, right = 0;

    int count = 0; // count of maxNum till now
    long ans  = 0; // count subarray length
    // iterate using right pointer
    for (; right < nums.length; right++) {
      if (nums[right] == maxNum)
        count++;
      // we exit the loop when the window does not contain at least k max elements
      while (count == k) {
        if (nums[left] == maxNum) {
          count--;
        }
        left++;
      }
      // each element till left can form a valid subarray with at least k max elements
      // [left....right]
      ans += left;
    }
    return ans;
  }
}
