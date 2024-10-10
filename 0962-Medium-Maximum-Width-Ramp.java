class Solution {
    public int maxWidthRamp(int[] nums) {
      Stack<Integer> st = new Stack<>();

      for (int i = 0; i < nums.length; i++) {
        if (st.isEmpty() || nums[i] < nums[st.peek()])
          st.push(i);
      }

      int maxRamp = 0;

      for (int j = nums.length - 1; j >= 0; j-- ) {
        while (!st.isEmpty() && nums[j] >= nums[st.peek()])
          maxRamp = Math.max(maxRamp, j - st.pop());
      }

      return maxRamp;
    }
}