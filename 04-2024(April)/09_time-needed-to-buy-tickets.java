// april2024/09_time-needed-to-buy-tickets.java
/**
 * Date  : 09-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  2073. Time Needed to Buy Tickets
 * Difficulty:  🟢Easy
 *
 * Leetcode 2073 :  https://leetcode.com/problems/time-needed-to-buy-tickets
 * Lintcode 0000 :  —
 */

class Solution {
  public int timeRequiredToBuy(int[] tickets, int k) {
    int time = 0;

    // min ensures we don't count more than k can buy
    // we calculate min number of tickets between k and i-th person
    for (int i = 0; i < tickets.length; i++) {
      if (i <= k) {
        time += Math.min(tickets[i], tickets[k]);
      }
      // i > k , we subtract 1 from k-th as it will already buy 1 ticket, before i reaches front of
      // the line
      else {
        time += Math.min(tickets[i], tickets[k] - 1);
      }
    }

    return time;
  }
}
