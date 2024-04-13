// 04-2024(April)/13_maximal-rectangle.java
/**
 * Date  : 13-Apr-24
 * Repo  : https://github.com/ankitsamaddar/daily-leetcode
 *
 * Problem   :  85. Maximal Rectangle
 * Difficulty:  🔴Hard
 *
 * Leetcode 0085 :  https://leetcode.com/problems/maximal-rectangle
 * Lintcode 0510 :  https://www.lintcode.com/problem/510
 */

class Solution {
  public int maximalRectangle(char[][] matrix) {
    // matrix is empty
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }

    int maxArea  = 0;
    int[] height = new int[matrix[0].length]; // store height histogram of current row

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == '0') {
          height[j] = 0;
        } else {
          height[j]++;
        }
      }
      // for current row find largest rectangle area
      maxArea = Math.max(maxArea, largestRectangleArea(height));
    }
    // return the max area
    return maxArea;
  }

  // calculate largest area in the histogram
  private int largestRectangleArea(int[] height) {
    Stack<Integer> stack = new Stack<>();
    stack.push(-1); // to handle empty stack cases

    int maxArea = 0;

    for (int i = 0; i < height.length; i++) {
      // stack not empty and current height < stack top index height
      // calculate current max area for histogram
      while (stack.peek() != -1 && height[i] < height[stack.peek()]) {
        int h = height[stack.pop()];
        int w = i - stack.peek() - 1;

        maxArea = Math.max(maxArea, h * w);
      }

      stack.push(i);
    }
    // handle remaining index in the stack
    while (stack.peek() != -1) {
      int h = height[stack.pop()];
      int w = height.length - stack.peek() - 1;

      maxArea = Math.max(maxArea, h * w);
    }
    // return the max area
    return maxArea;
  }
}
