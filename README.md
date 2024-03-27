# daily-leetcode

Daily leetcode problem solution.
The solutions are written in Java language.

| SL No | Program Name w/ Difficulty                 |                               Leetcode                               |                   Lintcode                    |                                  Solution                                   | Notes                                                                                                                                                                                                                                                                                                                    |
| :---: | ------------------------------------------ | :------------------------------------------------------------------: | :-------------------------------------------: | :-------------------------------------------------------------------------: | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
|  01   | Find All Duplicates in an Array <br>🟡Medium | [442](https://leetcode.com/problems/find-all-duplicates-in-an-array) | [1238](https://www.lintcode.com/problem/1238) | [Java](<./solutions/01_find-all-duplicates-in-an-array.java>) <br>25-Mar-24 | Iterate the array. As the numbers in the array are within the size of the array(n), so every number represents a index of the array. Visit the index(nums[i]) and and mark it visited(-ve). If for a index(nums[i]) the value is already -ve, the the nums[i] is a duplicate as it is already visited. Add it to result. |
|  02   | First Missing Positive <br>🔴Hard            |      [41](https://leetcode.com/problems/first-missing-positive)      |  [189](https://www.lintcode.com/problem/189)  |      26-Mar-24<br>[Java](<./solutions/02_first-missing-positive.java>)      | Iterate the array and put the elements at there correct index in the array. Iterate the array find the smallest position where the index does not match the number. If all numbers in there correct index return n+1.                                                                                                    |
| 03 | Subarray Product Less Than K <br>🟡Medium | [713](https://leetcode.com/problems/subarray-product-less-than-k) | [1075](https://www.lintcode.com/problem/1075) | 27-Mar-24<br>[Java](<./solutions/03_subarray-product-less-than-k.java>) | Sliding window, left=right=0. Iterate the array using right pointer, find the product with the current number. If the product is more than or equal to k, shift the left pointer and divide them from the product. Add the current length of the window to the count. Return count. |
