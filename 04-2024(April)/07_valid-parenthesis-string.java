// april2024/07_valid-parenthesis-string.java
/**
 * Date  : 07-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  678. Valid Parenthesis String
 * Difficulty:  🟡Medium
 *
 * Leetcode 0678 :  https://leetcode.com/problems/valid-parenthesis-string
 * Lintcode 1089 :  https://www.lintcode.com/problem/1089
 */

class Solution {
  public boolean checkValidString(String s) {
    int minOpen = 0; // lower bound of '('
    int maxOpen = 0; // upper bound of '('

    for (char c : s.toCharArray()) {
      switch (c) {
        case '(':
          minOpen++;
          maxOpen++;
          break;
        case ')':
          // decrement count but minOpen can't be less than 0
          minOpen = Math.max(0, --minOpen);
          maxOpen--;
          break;
        case '*':
          minOpen = Math.max(0, --minOpen); // * treated as ')'
          maxOpen++;                        // * treated as '('
      }

      if (maxOpen < 0) { // no more '(' left
        return false;
      }
    }
    // return if no '(' left
    return minOpen == 0;
  }
}
