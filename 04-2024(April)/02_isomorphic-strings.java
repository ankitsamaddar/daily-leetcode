// april2024/02_isomorphic-strings.java
/**
 * Date  : 02-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  205. Isomorphic Strings
 * Difficulty:  🟢Easy
 *
 * Leetcode 0205 :  https://leetcode.com/problems/isomorphic-strings
 * Lintcode 0638 :  https://www.lintcode.com/problem/638
 */

import java.util.*;

class Solution {
  public boolean isIsomorphic(String s, String t) {
    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Character> map2 = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c1 = s.charAt(i);
      char c2 = t.charAt(i);

      // if character in first string mapped to different character
      if (map1.containsKey(c1) && map1.get(c1) != c2) {
        return false;
      }

      // if character in second string mapped to different character
      if (map2.containsKey(c2) && map2.get(c2) != c1) {
        return false;
      }

      // hash the characters
      map1.put(c1, c2);
      map2.put(c2, c1);
    }
    return true;
  }
}
