# daily-leetcode

Daily leetcode problem solution.
The README, problems details and solutions are maintained and updated via a Powershell script.

| SL No | Program Name w/ Difficulty                 |                               Leetcode                               |                   Lintcode                    |                                  Solution                                   | Notes                                                                                                                                                                                                                                                                                                                    |
| :---: | ------------------------------------------ | :------------------------------------------------------------------: | :-------------------------------------------: | :-------------------------------------------------------------------------: | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
|  01   | Find All Duplicates in an Array <br>🟡Medium | [442](https://leetcode.com/problems/find-all-duplicates-in-an-array) | [1238](https://www.lintcode.com/problem/1238) | 25-Mar-24<br>[Java](<./solutions/01_find-all-duplicates-in-an-array.java>) | Iterate the array. As the numbers in the array are within the size of the array(n), so every number represents a index of the array. Visit the index(nums[i]) and and mark it visited(-ve). If for a index(nums[i]) the value is already -ve, the the nums[i] is a duplicate as it is already visited. Add it to result. |
|  02   | First Missing Positive <br>🔴Hard            |      [41](https://leetcode.com/problems/first-missing-positive)      |  [189](https://www.lintcode.com/problem/189)  |      26-Mar-24<br>[Java](<./solutions/02_first-missing-positive.java>)      | Iterate the array and put the elements at there correct index in the array. Iterate the array find the smallest position where the index does not match the number. If all numbers in there correct index return n+1.                                                                                                    |
| 03 | Subarray Product Less Than K <br>🟡Medium | [713](https://leetcode.com/problems/subarray-product-less-than-k) | [1075](https://www.lintcode.com/problem/1075) | 27-Mar-24<br>[Java](<./solutions/03_subarray-product-less-than-k.java>) | Sliding window, left=right=0. Iterate the array using right pointer, find the product with the current number. If the product is more than or equal to k, shift the left pointer and divide them from the product. Add the current length of the window to the count. Return count. |
| 04 | Length of Longest Subarray With at Most K Frequency <br>🟡Medium | [2958](https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency) | — | 28-Mar-24<br>[Java](<./solutions/04_length-of-longest-subarray-with-at-most-k-frequency.java>) | Use a HashMap to store the count of the digits encountered. Use sliding window, iterate using right. Increase current digit count, if it more than k, move left pointer and decrease the moved elements count. Find the maximum window length. |
| 05 | Count Subarrays Where Max Element Appears at Least K Times <br>🟡Medium | [2962](https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times) | — | 29-Mar-24<br>[Java](<./solutions/05_count-subarrays-where-max-element-appears-at-least-k-times.java>) | Find the maxNum in the array. Iterate using right pointer and if current element is equal to maxNum increase count. When count is equal to k, increment left, and if nums[left]==maxNum, decrease count. Add left to answer, as elements till left sums to count. After iterating, return answer. |
| 06 | Subarrays with K Different Integers <br>🔴Hard | [992](https://leetcode.com/problems/subarrays-with-k-different-integers) | — | 30-Mar-24<br>[Java](<./solutions/06_subarrays-with-k-different-integers.java>) | Count of atleast k distinct elements - Count of atleast k-1 distinct elements, will give subarray with exactly k distinct elements. To count the subarray, iterate the array and increase the element count, if its count is 1 decrease k. If k==-1, shrink window from left, decrease count and if element removed from window increase k. Add window length(r-l+1) to answer.  |
