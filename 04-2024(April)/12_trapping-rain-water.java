// 04-2024(April)/12_trapping-rain-water.java
/**
 * Date  : 12-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  42. Trapping Rain Water
 * Difficulty:  🔴Hard
 *
 * Leetcode 0042 :  https://leetcode.com/problems/trapping-rain-water
 * Lintcode 0363 :  https://www.lintcode.com/problem/363
 */

class Solution {
  public int trap(int[] height) {
    int left = 0;
    int right = height.length - 1;

    int maxLeftHeight  = 0;
    int maxRightHeight = 0;

    int totalWater = 0;

    while (left < right) {
      // Update max height on both side
      maxLeftHeight  = Math.max(maxLeftHeight, height[left]);
      maxRightHeight = Math.max(maxRightHeight, height[right]);

      // if maxLeftHeight is < maxRightHeight
      // current empty height = maxLeftHeight - height[left]
      // add current empty height to totalWater
      if (maxLeftHeight < maxRightHeight) {
        totalWater += maxLeftHeight - height[left];
        left++;
      }
      // if maxRightHeight is < maxLeftHeight
      // current empty height = maxRightHeight - height[right]
      // add current empty height to totalWater
      else {
        totalWater += maxRightHeight - height[right];
        right--;
      }
    }

    return totalWater;
  }
}
