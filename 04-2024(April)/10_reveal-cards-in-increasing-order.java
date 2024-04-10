// april2024/10_reveal-cards-in-increasing-order.java
/**
 * Date  : 10-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  950. Reveal Cards In Increasing Order
 * Difficulty:  🟡Medium
 *
 * Leetcode 0950 :  https://leetcode.com/problems/reveal-cards-in-increasing-order
 * Lintcode 0000 :  —
 */

class Solution {
  public int[] deckRevealedIncreasing(int[] deck) {
    int n         = deck.length;
    int[] result  = new int[n]; // reveal cards in increasing order
    int idxResult = 0;
    int idxDeck   = 0;

    boolean skip = false;

    Arrays.sort(deck); // sort deck in ascending order

    // in-place put cards at the correct indices in result
    while (idxDeck < n) {
      // if current index in result is not filled
      if (result[idxResult] == 0) {
        // not skip then add card to deck
        if (!skip) {
          result[idxResult] = deck[idxDeck];
          idxDeck++; // increment deck
        }
        // skip next element
        skip = !skip;
      }
      // since we are skipping index in deck, cycle result index
      // ensures we go back to beginning to fill indices, if we reach end(n)
      idxResult = (idxResult + 1) % n;
    }

    return result;
  }
}
