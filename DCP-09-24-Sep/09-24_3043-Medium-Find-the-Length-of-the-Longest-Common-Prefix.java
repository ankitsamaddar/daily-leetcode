class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
      Set<Integer> s = new HashSet<>();
      for (int x : arr1) {
        while (x > 0) {
          s.add(x);
          x /= 10;
        }
      }
      
      int ans = 0;
      
      for (int x : arr2) {
        while (x > 0) {
          if (s.contains(x)) {
            ans = Math.max(ans, String.valueOf(x).length());
            break;
          }
          x /= 10;
        }
      }
      
      return ans;
    }
}