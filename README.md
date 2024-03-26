# daily-leetcode

Daily leetcode problem solution.
The solutions are written in Java language.



| SL No | Program Name | Difficulty | Leetcode | Lintcode | Solution | Notes |
| :----: | --------- | ----- | :-----: | :-----: | :-----: | ----- |
| 01 | Find All Duplicates in an Array | 🟡Medium | [442](https://leetcode.com/problems/find-all-duplicates-in-an-array) | [1238](https://www.lintcode.com/problem/1238) | [Java](<./solutions/01_find-all-duplicates-in-an-array.java>) <br>25-Mar-24 | Iterate the array. As the numbers in the array are within the size of the array(n), so every number represents a index of the array. Visit the index(nums[i]) and and mark it visited(-ve). If for a index(nums[i]) the value is already -ve, the the nums[i] is a duplicate as it is already visited. Add it to result. |
| 02 | First Missing Positive | 🔴Hard | [41](https://leetcode.com/problems/first-missing-positive) | [189](https://www.lintcode.com/problem/189) | 26-Mar-24<br>[Java](<./solutions/02_first-missing-positive.java>) | Iterate the array and put the elements at there correct index in the array. Iterate the array find the smallest position where the index does not match the number. If all numbers in there correct index return n+1. |
