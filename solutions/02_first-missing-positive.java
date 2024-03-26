// solutions/02_first-missing-positive.java
/**
 * Date  : 26-Mar-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  First Missing Positive
 * Difficulty:  🔴Hard
 *
 * Leetcode 0041 :  https://leetcode.com/problems/first-missing-positive
 * Lintcode 0189 :  https://www.lintcode.com/problem/189
 */

class Solution {
  public int firstMissingPositive(int[] nums) {
    int n = nums.length;
    if (n == 0)
      return 1;

    // Iterate the array and put the elements at there correct index
    for (int i = 0; i < n; i++) {
      while (
          // within limits
          nums[i] > 0 && nums[i] <= n &&
          // not already in right position
          nums[nums[i] - 1] != nums[i]
        ) {
        // swap numbers to correct position
        int temp          = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i]           = temp;
      }
    }

    // traverse the array again and
    // find the least number not in right position
    for (int i = 0; i < n; i++) {
      if (nums[i] != i + 1)
        return i + 1;
    }

    // all numbers in right position
    return n + 1;
  }
}
