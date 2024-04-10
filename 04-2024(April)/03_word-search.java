// april2024/03_word-search.java
/**
 * Date  : 03-Apr-24
 * Repo  : https://github.com/ankitsamaddar/
 *
 * Problem   :  79. Word Search
 * Difficulty:  🟡Medium
 *
 * Leetcode 0079 :  https://leetcode.com/problems/word-search
 * Lintcode 0123 :  https://www.lintcode.com/problem/123
 */

class Solution {
  public boolean exist(char[][] board, String word) {
    if (word.length() == 0) {
      return true;
    }
    // iterate every cell and do dfs to find if a word match exits
    // if found return true, if no path found after checking all cells, return false
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (dfs(board, i, j, word, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  boolean dfs(char[][] board, int i, int j, String word, int start) {
    // All characters match
    if (start == word.length()) {
      return true;
    }
    // limits reached, or character do not match
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length ||
        board[i][j] != word.charAt(start)) {
      return false;
    }

    char c      = board[i][j]; //extract the character
    board[i][j] = '0'; // mark visited

    // do dfs on each direction to find the next character in the word
    boolean res =
        // search right
        dfs(board, i + 1, j, word, start + 1) ||
        // search left
        dfs(board, i - 1, j, word, start + 1) ||
        // search down
        dfs(board, i, j + 1, word, start + 1) ||
        // search up
        dfs(board, i, j - 1, word, start + 1);

    board[i][j] = c; // reset the cell
    // result of search
    return res;
  }
}
