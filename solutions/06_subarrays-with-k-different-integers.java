// solutions/06_subarrays-with-k-different-integers.java
/**
 * Date  : 30-Mar-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  Subarrays with K Different Integers
 * Difficulty:  🔴Hard
 *
 * Leetcode 0992 :  https://leetcode.com/problems/subarrays-with-k-different-integers
 * Lintcode 0000 :  —
 */

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // at least k distinct subarray count - at least k-1 subarray
        // will give exactly k distinct element subarray
        int atMostK = countSubarray(nums,k);
        int atMostK1 = countSubarray(nums,k-1);

        return atMostK - atMostK1;
    }

    private int countSubarray(int[] nums, int k) {
      int ans = 0;
      int[] count = new int[nums.length+1]; // maintain current window number count
      int left = 0, right = 0;
      for(;right<nums.length;right++) {
        count[nums[right]]++;
        // if at least 1 distinct element, reduce k
        if(count[nums[right]]==1) {
          k--;
        }
        // -1 indicate, more than k distinct elements
        // so shrink window from left
        while(k==-1) {
          count[nums[left]]--;
          // increase k if an element is completely remove from window
          if(count[nums[left]]==0) {
            k++;
          }
          left++;
        }
        ans += right-left+1;
      }
      return ans;
    }
}
