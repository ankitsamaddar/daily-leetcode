// april2024/05_make-the-string-great.java
/**
 * Date  : 05-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  1544. Make The String Great
 * Difficulty:  🟢Easy
 *
 * Leetcode 1544 :  https://leetcode.com/problems/make-the-string-great
 * Lintcode 0000 :  —
 */

class Solution {
  public String makeGood(String s) {
    StringBuilder sb = new StringBuilder();

    // add all characters that don't form a pair and
    // greedily remove, any matching pair(different case) we encounter
    for (char c : s.toCharArray()) {
      if (sb.length() > 0) {
        char lastChar = sb.charAt(sb.length() - 1);
        // last character is equal but do not match case, pop lastChar
        if (Character.toLowerCase(lastChar) == Character.toLowerCase(c) && lastChar != c) {
          sb.deleteCharAt(sb.length() - 1);
        } else {
          sb.append(c);
        }
      }

      else {
        sb.append(c);
      }
    }

    return sb.toString();
  }
}
