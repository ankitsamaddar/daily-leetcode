// solutions/03_subarray-product-less-than-k.java
/**
 * Date  : 27-Mar-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  Subarray Product Less Than K
 * Difficulty:  🟡Medium
 *
 * Leetcode 0713 :  https://leetcode.com/problems/subarray-product-less-than-k
 * Lintcode 1075 :  https://www.lintcode.com/problem/1075
 */

class Solution {
  public int numSubarrayProductLessThanK(int[] nums, int k) {
    // no subarray product possible
    if (k <= 1)
      return 0;

    int count = 0; // count the number of possible product
    int prod  = 1; // to calculate product

    int left = 0, right = 0; // two pointer for the sliding window

    for (; right < nums.length; right++) {

      // Multiply current number
      prod *= nums[right];

      // if product is more than or equal to k,
      // shift the left pointer and divide it from product
      while (prod >= k) {
        prod /= nums[left];
        left++;
      }

      // add the number of sub-arrays within the window to count
      count += right - left + 1;
    }

    return count;
  }
}
