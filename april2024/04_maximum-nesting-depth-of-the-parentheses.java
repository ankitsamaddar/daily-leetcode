// april2024/04_maximum-nesting-depth-of-the-parentheses.java
/**
 * Date  : 04-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  1614. Maximum Nesting Depth of the Parentheses
 * Difficulty:  🟢Easy
 *
 * Leetcode 1614 :  https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses
 * Lintcode 0000 :  —
 */

class Solution {
  public int maxDepth(String s) {
    int maxDepth = 0;
    int curDepth = 0;

    for (char c : s.toCharArray()) {
      // if current character is (
      // increment curDepth, and update maxDepth
      if (c == '(') {
        curDepth++;
        if (curDepth > maxDepth) {
          maxDepth = curDepth;
        }
      }
      // if current character ) reduce curDepth
      else if (c == ')') {
        curDepth--;
      }
    }
    return maxDepth;
  }
}
