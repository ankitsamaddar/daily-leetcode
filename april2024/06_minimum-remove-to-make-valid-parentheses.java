// april2024/06_minimum-remove-to-make-valid-parentheses.java
/**
 * Date  : 06-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  1249. Minimum Remove to Make Valid Parentheses
 * Difficulty:  🟡Medium
 *
 * Leetcode 1249 :  https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses
 * Lintcode 0000 :  —
 */

import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
      // String builder
      StringBuilder sb = new StringBuilder(s);

      // keep track of indices of  (
      Stack<Integer> stack = new Stack<>();

      // iterate the string
      for (int i=0;i<sb.length();i++) {

        if(sb.charAt(i) == '(') {
          stack.push(i);
        }

        else if (sb.charAt(i) ==')') {
          // remove last (
          if(!stack.isEmpty()) {
            stack.pop();
          }
          // no ( to match ), so mark it as * to remove
          else {
            sb.setCharAt(i,'*');
          }
        }
      }

      // if unmatched open ( left , mark them as * to remove
      while(!stack.isEmpty()) {
        sb.setCharAt(stack.pop(),'*');
      }
      // remove all * from the string
      return sb.toString().replaceAll("\\*","");
    }
}
