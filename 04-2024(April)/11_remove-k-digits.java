// 04-2024(April)/11_remove-k-digits.java
/**
 * Date  : 11-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  402. Remove K Digits
 * Difficulty:  🟡Medium
 *
 * Leetcode 0402 :  https://leetcode.com/problems/remove-k-digits
 * Lintcode 1255 :  https://www.lintcode.com/problem/1255
 */

class Solution {
  public String removeKdigits(String num, int k) {
    int len = num.length();
    // if k = len we can remove all digits
    if (k == len) {
      return "0";
    }

    char[] stack = new char[len];
    int count    = k;
    int i        = -1;

    for (char digit : num.toCharArray()) {
      // remove digit at the top of the stack if it is greater
      while (i != -1 && count > 0 && stack[i] > digit) {
        i--;
        count--;
      }
      // push current digit to stack
      stack[++i] = digit;
    }
    // remove last k digits and remove leading zeros
    String res = (new String(stack)).substring(0, len - k).replaceFirst("^0+", "");

    // If all digits are removed, return "0"
    return (res.length() == 0) ? "0" : res;
  }
}
