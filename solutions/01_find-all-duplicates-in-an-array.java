/*
Date  : 25-Mar-24
Repo: https://github.com/ankitsamaddar/

Problem   :  Find All Duplicates in an Array
Difficulty:  🟡Medium

Leetcode 0442 :  https://leetcode.com/problems/find-all-duplicates-in-an-array
Lintcode 1238 :  https://www.lintcode.com/problem/1238
*/

class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> ans = new ArrayList<>();

    int n = nums.length;

    for (int i = 0; i < n; i++) {
      // Set the current num[i] as index
      // this is possible all numbers are within n
      // so every number represents an index of the array
      // abs as we are marking visited numbers negative
      int index = Math.abs(nums[i]) - 1;

      // If the number at index is not negative
      // So mark is -ve i.e. visited
      if (nums[index] > 0)
        nums[index] = -nums[index];
      // If the number is -ve then it is visited
      // So add the index to the answer
      else
        ans.add(index + 1);
    }

    return ans;
  }
}
