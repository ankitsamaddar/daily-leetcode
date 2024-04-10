// april2024/08_number-of-students-unable-to-eat-lunch.java
/**
 * Date  : 08-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  1700. Number of Students Unable to Eat Lunch
 * Difficulty:  🟢Easy
 *
 * Leetcode 1700 :  https://leetcode.com/problems/number-of-students-unable-to-eat-lunch
 * Lintcode 0000 :  —
 */

class Solution {
  public int countStudents(int[] students, int[] sandwiches) {
    int[] count = new int[2]; // count for type 0 and 1

    // count each type of sandwich count (0,1) for the students
    for (int student : students) {
      count[student]++;
    }

    // Count remaining sandwiches type
    for (int i = 0; i < sandwiches.length; i++) {
      // if no more left of current sandwiches
      // return the current number of remaining students
      if (count[sandwiches[i]] == 0) {
        return sandwiches.length - i;
      }

      count[sandwiches[i]]--;
    }
    // all students have sandwiches
    return 0;
  }
}
